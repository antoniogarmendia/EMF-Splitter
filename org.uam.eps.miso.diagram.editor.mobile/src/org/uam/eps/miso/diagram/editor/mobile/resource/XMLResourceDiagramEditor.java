package org.uam.eps.miso.diagram.editor.mobile.resource;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.ui.tools.internal.editor.DDiagramEditorImpl;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IEditorPart;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.google.common.collect.Iterables;

import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.Root;
import graphic_representation.impl.DiagramElementImpl;
import graphic_representation.impl.RootImpl;
import mobile_server.EcoreMD;
import mobile_server.diagram_editor.Diagram;


/*
 * TODO
 * The container reference is not 0 to 1 anymore. I change it to 0 to -1.
 * Fix the code..  
 * */

public class XMLResourceDiagramEditor{
	
	private final String pathWS = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	private Diagram diagram;
	private Resource graphicR;
	private Resource ecore;
	private ResourceSet rSet;
	
	public Resource dmisoXMI;
	public Session createdSession;
	public Collection<RepresentationDescription> descriptions;
	
	/*
	 * Tag Name XML Diagram Editor
	 * */
	
	private final String tagDiagram = "diagram";	 
	
	public XMLResourceDiagramEditor(Diagram diagram)
	{
		this.diagram = diagram;
		this.rSet = new ResourceSetImpl();
		this.dmisoXMI = null;
	}
	
	public void SaveXMI(String relativePath, boolean createRepresentation) throws Exception
	{
		DocumentBuilderFactory domFact = DocumentBuilderFactory.newInstance();
			 
		try {
			
			DocumentBuilder builder = domFact.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(new ByteArrayInputStream(this.diagram.getContent().getBytes("utf-8"))));
			DOMSource domSource = new DOMSource(doc);
			
			/*
			 * Get & Create the *.ecore Meta-model
			 */
			if(diagram.getAnPalette()!=null)
			{
				ecore = XMLtoResource(((EcoreMD)diagram.getAnPalette().eContainer()).getContent(), EcorePackage.eINSTANCE.getNsPrefix(),relativePath + "/" + ((EcoreMD)diagram.getAnPalette().eContainer()).getName(), new EcoreResourceFactoryImpl());				
			}
			else
				System.out.println("No se encuentra el Meta-modelo");
			
			/*
			 * Get the Graphic Representation
			 */
			
			if(diagram.getAnPalette()!=null)
			{
				graphicR = XMLtoResource(diagram.getAnPalette().getContent(), Graphic_representationPackage.eINSTANCE.getNsPrefix(),relativePath + "/" + diagram.getAnPalette().getName(),new XMIResourceFactoryImpl());				
			}else
				System.out.println("No se encuentra graphicR:GraphicRepresentation");
			
			/*
			 * Get the *.dmiso model
			 */
			NodeList nList  = doc.getElementsByTagName(tagDiagram);
			
			/*
			 * Use to build the representation
			 */			
			final Map<URI,NodePosition> mapGetPositionById = new HashMap<URI,NodePosition>();
			
			EObject root = CreateXMIWithRoot(nList);
			
			/*
			 * HashMap Map<String,EObject>
			 * Use to build the edges
			 */
			Map<String,EObject> mapNodesId = new HashMap<String, EObject>();
			
			
			EList<EClass> listEClasses = getEListClasses();
			Node n = nList.item(0);
			NodeList nodesList = n.getChildNodes();
			
			CreateXMIFile(relativePath);
			this.dmisoXMI.getContents().add(root);
			CreateNodesAndEdges(nodesList, root, listEClasses, mapNodesId, mapGetPositionById);
			this.dmisoXMI.save(null);
			this.dmisoXMI.unload();
			
			if(createRepresentation == true)
			{			
				//Create *.aird Representation
				URIConverter converter = new ExtensibleURIConverterImpl();
				URI fileUri = URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + File.separator);
				URI platformURI = URI.createPlatformResourceURI("/", false);
				converter.getURIMap().put(fileUri, platformURI);
				URI sessionResourceURI = dmisoXMI.getURI().trimSegments(1).appendSegment("representations.aird");
				//Exist Session
				boolean existSession = converter.exists(sessionResourceURI, null);
				IProgressMonitor monitor = new NullProgressMonitor();
				this.createdSession = null;
				if(existSession==false)
				{
					SiriusClass sirius = new SiriusClass();
					this.createdSession = sirius.CreateAirdRepresentation(dmisoXMI.getURI(), sessionResourceURI);
				}	
				if(createdSession == null)
				{
					this.createdSession = SessionManager.INSTANCE.getSession(sessionResourceURI,monitor);	
					//Add resource to sirius session
					AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(createdSession,dmisoXMI.getURI(),monitor);
					createdSession.getTransactionalEditingDomain().getCommandStack().execute(addCommandToSession);
					createdSession.save(monitor); 	
					//End
				}
				//End
				this.createdSession.open(monitor);
				//Check ViewpointSelection
				Collection<Viewpoint> collecViewpoint = this.createdSession.getSelectedViewpoints(false);
				if(collecViewpoint.size()==0)
				{
					ViewpointSelection.openViewpointsSelectionDialog(createdSession,false);
					this.createdSession.save(monitor);
				}
				//End
				
				//Get Available Representation Description
				
				EObject rootEobject =createdSession.getSemanticResources().iterator().next().getContents().get(0);		
				
				descriptions = DialectManager.INSTANCE.getAvailableRepresentationDescriptions
									(createdSession.getSelectedViewpoints(false),
											rootEobject);				
				
				if(descriptions.isEmpty())
					throw new Exception("Could not found representation description for object: " + createdSession.getSemanticResources().iterator().next().getContents().get(0));
				
				RepresentationDescription description = descriptions.iterator().next();
				
				//DialectManager viewpointDialectManager = DialectManager.INSTANCE;
				Command createViewCommand = new CreateRepresentationCommand(createdSession,
						  description, createdSession.getSemanticResources().iterator().next().getContents().get(0), "Mobile Diagram "+ this.createdSession.getSelectedViewpoints(false).iterator().next().getName(), monitor);
				
				createdSession.getTransactionalEditingDomain().getCommandStack().execute(createViewCommand);

				SessionManager.INSTANCE.notifyRepresentationCreated(createdSession);
				
				//Open Editor
				Collection<DRepresentation> representations = DialectManager.INSTANCE.getRepresentations(description, createdSession);
				DRepresentation myDiagramRepresentation = representations.iterator().next();				
				
				IEditorPart editorPart = DialectUIManager.INSTANCE.openEditor(createdSession, myDiagramRepresentation, monitor);				
				
				if(editorPart instanceof DDiagramEditorImpl)
				{
					
					DDiagramEditorImpl graphicalEditor = ((DDiagramEditorImpl) editorPart);
					//org.eclipse.gmf.runtime.notation.Diagram diag = graphicalEditor.getDiagram();
					graphicalEditor.getEditingDomain().getCommandStack().execute(new 
							TransactionUpdatePosition(graphicalEditor.getEditingDomain(),mapGetPositionById,graphicalEditor));
					
					this.createdSession.save(monitor);					
				}
				//new EObjectQuery(null).getRepresentation()
				//myDiagramRepresentation.getRepresentationElements().get
				//End				
			}
			
		} catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		//SerializeDiagramDmiso(relativePath);		
	}	
		
	private void CreateXMIFile(String relativePath) {
		
		//Create Resource XMI				
		ResourceSet resourseSetXMI = new ResourceSetImpl();	
		
		
		String prefiXMI = diagram.getExtension();/*getPrefixEcore()*/; 
		//Object asd = resourseSetXMI.getResourceFactoryRegistry().getExtensionToFactoryMap().get(prefiXMI);
		//
		resourseSetXMI.getResourceFactoryRegistry().getExtensionToFactoryMap().put
													(prefiXMI, new XMIResourceFactoryImpl());
		
		this.dmisoXMI = resourseSetXMI.createResource(URI.createPlatformResourceURI(relativePath + "/"+ diagram.getName() + "." + prefiXMI,true));
	}

	private EObject CreateXMIWithRoot(NodeList nList) {
		// TODO Auto-generated method stub
		if(nList.getLength()==1)
		{
			//Create Root Class
			Root root = CreateRootClass();
			EObject rooteObject = EcoreUtil.create(root.getAnEClass());
			
			return rooteObject;		
		}		
		else
			return null;
	}

	private String TransformElementToString(Node n)
	{
		DOMSource domSourcen = new DOMSource(n);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer;
		
		try {
			
			transformer = tf.newTransformer();
			transformer.transform(domSourcen, result);
			
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return writer.toString();
	}
	
	private Resource XMLtoResource(String xml,String prefix, String relativePath, Object objResource)
	{
		this.rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(prefix, objResource);
		
		Resource res = this.rSet.createResource(URI.createPlatformResourceURI(relativePath + "." + prefix,true));
		
		try {
			res.load(new URIConverter.ReadableInputStream(xml), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;	
	}
	
	public String getPrefixEcore()
	{
		return (ecore.getContents().get(0) instanceof EPackage) ? ((EPackage)ecore.getContents().get(0)).getNsPrefix() : null;
	}
	
	public Root CreateRootClass()
	{
		Iterator<EObject> itAllContents = graphicR.getAllContents();
		
		while (itAllContents.hasNext()) {
			EObject eObject = itAllContents.next();
			if(eObject instanceof RootImpl)
				return (Root) eObject;
		}
		return null;
	}
	
	public String GetMMName(Document doc)
	{
		NodeList nList = doc.getElementsByTagName("palette_name");
		Node n = null;
		if(nList.getLength()==1)
		{
			n = nList.item(0);
			return n.getAttributes().getNamedItem("name").getNodeValue();					
		}
		else
			System.out.println("Existen más de un palette_name");
		return null;
	}
	
	public EList<EClass> getEListClasses()
	{
		EClass[] aux = Iterables.toArray(Iterables.filter(GetClassifiers(), EClass.class), EClass.class);
		return new BasicInternalEList<EClass>(EClass.class, aux.length,aux);		
	}
	
	public EList<EClassifier> GetClassifiers() {
		
		return GetRootPackage().getEClassifiers();
	}
	
	public EPackage GetRootPackage()
	{
		return (EPackage)ecore.getContents().get(0);
	}
	
	public EClass getEClassbyName(EList<EClass> list,String name)
	{
		Iterator<EClass> itClasses = list.iterator();
		while (itClasses.hasNext()) {
			EClass eClass = itClasses.next();
			if(eClass.getName().equals(name))
				return eClass;
		}		
		return null;
	}
	
	public DiagramElement getDiagramElementbyEClass(EClass eClass)
	{
		Iterator<EObject> itAllContents = graphicR.getAllContents();
		while (itAllContents.hasNext()) {
			EObject eObject = itAllContents.next();
			if(eObject instanceof DiagramElementImpl)
			{
				DiagramElement diagElement = (DiagramElement)eObject;
				if(EcoreUtil.equals(diagElement.getAnEClass(),eClass))
					return diagElement;
			}
		}
		return null;
	}
	
	public void CreateNodesAndEdges(NodeList nodesList,EObject rooteObject,EList<EClass> listEClasses,Map<String, EObject> mapNodesId, Map<URI, NodePosition> mapIdPosition)
	{
		String nodeName = null;
		Node n = null;
		int countNodesList = nodesList.getLength();
		for (int i = 0; i <countNodesList; i++) {
			
			n = nodesList.item(i);
			nodeName = n.getNodeName();
			if(nodeName.equals("nodes"))
			{
				CreateNodes(rooteObject,n,listEClasses,mapNodesId,mapIdPosition);						
			}
			else if(nodeName.equals("edges"))
			{
				CreateEdges(rooteObject,n,listEClasses,mapNodesId);
			}
		}	
	}
	
	public void CreateNodes(EObject rootEClass,Node n, EList<EClass> listEClasses, Map<String, EObject> mapNodesId, Map<URI, NodePosition> mapIdPosition)
	{
		NodeList listChildren = n.getChildNodes();
		Node childN = null;
		for (int j = 0; j < listChildren.getLength(); j++) {
			childN = listChildren.item(j);
			String className = childN.getAttributes().getNamedItem("className").getNodeValue();
			EClass eClass = getEClassbyName(listEClasses, className);
			DiagramElement diagram = getDiagramElementbyEClass(eClass);
			EObject e = EcoreUtil.create(eClass);
			searchNodeAttribute(childN.getChildNodes(),e,listEClasses);
			//searchLinkPalettes(childN.getChildNodes(), e,listEClasses);
			mapNodesId.put(childN.getAttributes().getNamedItem("id").getNodeValue(),e);
			String posX = childN.getAttributes().getNamedItem("x").getNodeValue();
			String posY = childN.getAttributes().getNamedItem("y").getNodeValue();
			
			String  x = posX.subSequence(0,posX.indexOf(".")==-1?posX.length():posX.indexOf(".") ).toString();
			String  y = posY.subSequence(0,posY.indexOf(".")==-1?posY.length():posY.indexOf(".") ).toString();
			
			/*
			if(diagram.getContainerReference().isMany())
			{
				((EList<EObject>)rootEClass.eGet(diagram.getContainerReference())).add(e);
			}
			else
				rootEClass.eSet(diagram.getContainerReference(), e);
			*/
			mapIdPosition.put(EcoreUtil.getURI(e), new NodePosition(Integer.parseInt(x),Integer.parseInt(y)));
		}
	}
	
	private void searchNodeAttribute(NodeList childNodes, EObject e,EList<EClass> listEClasses) {
		
		Node child = null;
		int count = childNodes.getLength();
		for (int i = 0; i < count; i++) {
			child = childNodes.item(i);
			String nodeName = child.getNodeName();
			if(nodeName.equals("attribute"))
			{
				String nameEAttribute = child.getAttributes().getNamedItem("name").getNodeValue();
				String type = child.getAttributes().getNamedItem("type").getNodeValue();
				String value = child.getAttributes().getNamedItem("current_value").getNodeValue();
				e.eSet(e.eClass().getEStructuralFeature(nameEAttribute), getObject(type,value));				
			}	
			else if(nodeName.equals("link_palettes"))
			{
				searchLinkPalettes(child.getChildNodes(), e,listEClasses);
			}
				
		}
	}
	
	private void searchLinkPalettes(NodeList childNodes, EObject e, EList<EClass> listEClass)
	{
		Node child = null;
		int count = childNodes.getLength();
		for (int i = 0; i < count; i++) {
			child = childNodes.item(i);
			String nodeName = child.getNodeName();
			if(nodeName.equals("link_palette"))
			{
				NodeList childLinkPalette = child.getChildNodes();
				EObject anEObject = null;
				String referenceName = child.getAttributes().getNamedItem("referenceInClass").getNodeValue();
				Node childPalette = null;
				int countPalettes = childLinkPalette.getLength();
				for (int j = 0; j < countPalettes; j++) {
					childPalette = childLinkPalette.item(j);
					if(childPalette.getNodeName().equals("link_palette_instance"))
					{
						String className = childPalette.getAttributes().getNamedItem("className").getNodeValue();
						String containmentRef = childPalette.getAttributes().getNamedItem("reference").getNodeValue();
						EClass eClass = this.getEClassbyName(listEClass, className);
						anEObject = EcoreUtil.create(eClass);
						NodeList childPaletteAttributes = childPalette.getChildNodes();
						int countAttributes = childPaletteAttributes.getLength();
						Node childAttribute = null;
						for (int k = 0; k < countAttributes; k++) {
							childAttribute = childPaletteAttributes.item(k);
							if(childAttribute.getNodeName().equals("attribute"))
							{
								String attrName = childAttribute.getAttributes().getNamedItem("name").getNodeValue();
								String attrValue = childAttribute.getAttributes().getNamedItem("current_value").getNodeValue();
								String attrType = childAttribute.getAttributes().getNamedItem("type").getNodeValue();
								anEObject.eSet(anEObject.eClass().getEStructuralFeature(attrName), getObject(attrType,attrValue));								
							}							
						}
						System.out.println("Link Palette Instance");
					}				
				}	
				if(anEObject!=null)
				{
					EStructuralFeature struct = e.eClass().getEStructuralFeature(referenceName);
					if(struct.isMany())
					{
						((EList<EObject>)e.eGet(struct)).add(anEObject);
					}
					else
						e.eSet(struct,anEObject);
				}
			}
		}	
	}

	private Object getObject(String type,String value) {
		
		if(type.equals("EBoolean"))
			return  Boolean.parseBoolean(value);
		if(type.equals("EBooleanObject"))
			return Boolean.parseBoolean(value);
		if(type.equals("EString"))
			return  value;
		if(type.equals("EDouble"))
			return  Double.parseDouble(value);
		
		return value;
	}

	public void CreateEdges(EObject rootEClass,Node n, EList<EClass> listEClasses, Map<String, EObject> mapNodesId)
	{
		NodeList listChildren = n.getChildNodes();
		Node childN = null;
		for (int j = 0; j < listChildren.getLength(); j++) {
			childN = listChildren.item(j);
			String className = childN.getAttributes().getNamedItem("className").getNodeValue();
			EClass eClass = getEClassbyName(listEClasses, className);
			DiagramElement diagram = getDiagramElementbyEClass(eClass);
			//EObject e = EcoreUtil.create(eClass);
			EObject src = mapNodesId.get(childN.getAttributes().getNamedItem("source").getNodeValue());
			EObject trg = mapNodesId.get(childN.getAttributes().getNamedItem("target").getNodeValue());
			if(diagram instanceof Edge)
			{
				EObject e = EcoreUtil.create(eClass);
				Edge edg = (Edge)diagram;
				e.eSet(edg.getDirections().getSourceLink().getAnEReference(), src);
				e.eSet(edg.getDirections().getTargetLink().getAnEReference(), trg);
				/*
				if(diagram.getContainerReference().isMany())
				{
					//diagram.get
					((EList<EObject>)rootEClass.eGet(diagram.getContainerReference())).add(e);
				}
				else
					rootEClass.eSet(diagram.getContainerReference(), e);
					*/
			}
			else if(diagram instanceof graphic_representation.Node)
			{
				String link = childN.getAttributes().getNamedItem("link").getNodeValue();
				if(src.eClass().getEStructuralFeature(link).isMany())
					{
						((EList<EObject>)src.eGet(src.eClass().getEStructuralFeature(link))).add(trg);
					}
					else
					{
					src.eSet(src.eClass().getEStructuralFeature(link),trg);
					}
				
			}
		}
	}
	
}
