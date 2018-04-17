package org.mondo.visualization.ui.wizard;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.mondo.visualization.ui.page.PageStrategySettings;
import org.mondo.visualization.ui.page.diagram.decorator.PageDefineDiagramElementDecorator;
import org.mondo.visualization.ui.page.diagram.element.ActionTreePageDiagramElements;
import org.mondo.visualization.ui.page.diagram.element.PageDiagramElements;
import org.mondo.visualization.ui.preferences.PreferenceOptions;
import org.mondo.visualization.ui.Activator;

import dslHeuristicVisualization.HeuristicStrategy;
import graphic_representation.AffixedCompartmentElement;
import graphic_representation.AllElements;
import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.GraphicRepresentation;
import graphic_representation.IconElement;
import graphic_representation.Layer;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Representation;
import graphic_representation.RepresentationDD;
import graphic_representation.Shape;
import runtimePatterns.ClassRoleInstance;
import splitterLibrary.EcoreEMF;

public class WizardConcreteVisualization extends Wizard{

	protected PageStrategySettings pageSettings;
	protected PageDiagramElements pageElements;
	protected PageDefineDiagramElementDecorator pageDecorators;	
	
	//Attributes
	private HeuristicStrategy heuristicStrategy;
		
	//Dedicated Wizard & Modularity Pattern
	private String fileUri;
	private EList<ClassRoleInstance> listUnitClassRoleInstance;
	
	private boolean updateGraphicR;
	
	public WizardConcreteVisualization() {
		super();
		this.fileUri = null;	
		this.updateGraphicR = true;
	}
	
	public void initEcore(String paramfileUri,EList<ClassRoleInstance> paramlistUnitClassRoleInstance)
	{
		this.fileUri = paramfileUri;
		this.listUnitClassRoleInstance = paramlistUnitClassRoleInstance;		
	}
	
	
	@Override
	public String getWindowTitle() {
	    return "Wizard to Define Visualization in a MetaModel";
	}

	@Override
	public boolean performFinish() {
		
		if(heuristicStrategy != null){
			
			String embeddedImage = Activator.getDefault().getPreferenceStore().getString(PreferenceOptions.GraphicR_ChoiceEmbedImage);
			if(embeddedImage.equals("true"))
				PerformEmbbedImageOperationBase64(heuristicStrategy.getGraphic_representation());
			//PerformRelationNodeElementsToAffixedCompartments
			PerformRelationNodeElementsToAffixedCompartments(heuristicStrategy.getGraphic_representation());
			PerformEReferenceContainer(heuristicStrategy.getGraphic_representation());
			// Register the XMI resource factory for the .graphicR extension
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("graphicR", new XMIResourceFactoryImpl());
		   	      
		    //Create Resource
		    URI fUri = GetURI();
		    Resource rs = heuristicStrategy.getNemf().getRes().createResource(fUri);	   
		    rs.getContents().add(heuristicStrategy.getGraphic_representation());			
			
			try {
				rs.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Finish Defining Concrete Sintax Visualization");
			return true;
		}
	    		
		return true;
	}	

	@Override
	public void addPages() {
		
		super.addPages();	
		pageSettings = new PageStrategySettings("Choose the Strategies to Define the Concrete Visualization");
		pageElements = new PageDiagramElements("Choose the Diagram Elements");
		pageDecorators = new PageDefineDiagramElementDecorator("Choose the Decorators for the Nodes, Edges and Links");
		
		//Set the List Unit of ClassRoleInstance
		pageSettings.setListUnitClassRoleInstance(this.listUnitClassRoleInstance);	
		
		//Add pages to the wizard
		addPage(pageSettings);
		addPage(pageElements);
		addPage(pageDecorators);				
	}
	
	@Override
	public IWizardPage getStartingPage() {
		
		if(isUpdateGraphicR()) {
			return pageElements;
		}
		
		return super.getStartingPage();
	}
	
	public HeuristicStrategy getHeuristicStrategy() {
		return heuristicStrategy;
	}

	public void setHeuristicStrategy(HeuristicStrategy heuristicStrategy) {
		this.heuristicStrategy = heuristicStrategy;
	}

	public EcoreEMF getNemf() {
		
		return getHeuristicStrategy().getNemf();
	}
	
	public URI GetURI()
	{
		URI graphicURI = null;
		if(fileUri==null)
			graphicURI = URI.createURI(heuristicStrategy.getNemf().getFileuri(), false);
		else
			graphicURI = URI.createURI(fileUri,false);
			
		graphicURI = graphicURI.trimFileExtension().appendFileExtension("graphicR");
    	return graphicURI;
			
	}
	
	private void PerformEmbbedImageOperationBase64(GraphicRepresentation graphic_representation) {
		
		Iterator<MMGraphic_Representation> graph = graphic_representation.getAllGraphicRepresentation().iterator();
		while (graph.hasNext()) {
			MMGraphic_Representation mmRepresentation = (MMGraphic_Representation) graph.next();
			//Cambiar
			Iterator<Layer> layers = ((RepresentationDD)mmRepresentation.getListRepresentations().get(0)).
											getLayers().iterator();
			while (layers.hasNext()) {
				Layer lay = (Layer) layers.next();
				Iterator<AllElements> diagElements = lay.getElements().iterator();
				while (diagElements.hasNext()) {
					AllElements diag = (AllElements) diagElements.next();
					if(diag instanceof Node)
					{
						Shape sh = ((Node) diag).getNode_shape();
						if(sh instanceof IconElement)
							((IconElement) sh).ImageBase64();
					}
				}
			}
		}
	}
	
	//Palette Description Link //Combine with elements in other layersss
	private static void PerformRelationNodeElementsToAffixedCompartments(GraphicRepresentation graphicR)
	{
		Iterator<MMGraphic_Representation> graph = graphicR.getAllGraphicRepresentation().iterator();
		while (graph.hasNext()) {
			MMGraphic_Representation mmRepresentation = (MMGraphic_Representation) graph.next();
			Iterator<Representation> itRepresentations = mmRepresentation.getListRepresentations().iterator();
			while (itRepresentations.hasNext()) {
				RepresentationDD representation = (RepresentationDD) itRepresentations.next();
				Iterator<Layer> layers = representation.getLayers().iterator();
				while (layers.hasNext()) {
					Layer lay = (Layer) layers.next();
					Iterator<AllElements> diagElements = lay.getElements().iterator();
					while (diagElements.hasNext()) {
						AllElements diag = (AllElements) diagElements.next();
						if(diag instanceof Node)
						{
							Iterator<AffixedCompartmentElement> itAffixedCompartment = ((Node) diag).getNode_elements().getAffixedCompartmentElements().iterator();
										
							while (itAffixedCompartment.hasNext()) {
								AffixedCompartmentElement affixedCompartment = (AffixedCompartmentElement) itAffixedCompartment.next();
								EReference ref = affixedCompartment.getAnEReference();
								EClass anRefEClass = (EClass) ref.getEType();
								
								EList<AllElements> DiagElements = new BasicEList<AllElements>();
								Iterator<Layer> itlayers = representation.getLayers().iterator();
								while (itlayers.hasNext()) {
									Layer layer = (Layer) itlayers.next();
									DiagElements.addAll(layer.getElements());
								}
								
								Iterator<AllElements> compareDiagElements = DiagElements.iterator();
								while (compareDiagElements.hasNext()) {
									AllElements typediagElement = (AllElements) compareDiagElements.next();
									if(typediagElement instanceof Node)
									{
										
											//Composition Relation-ship
											if(((Node)typediagElement).getAnEClass().equals(anRefEClass))
												affixedCompartment.getNodes().add((Node)typediagElement);
											else{
												//Inheritance Relation-ship
												EList<EClass> allClasses = ((Node)typediagElement).getAnEClass().getEAllSuperTypes();
												int index = allClasses.indexOf(anRefEClass);
												if(index!=-1)
												  affixedCompartment.getNodes().add((Node)typediagElement);
											}									
									}
								}							
							}
							
							Iterator<PaletteDescriptionLink> itPaletteDescrition = ((Node) diag).getNode_elements().getLinkPalette().iterator();
							while (itPaletteDescrition.hasNext()) {
								PaletteDescriptionLink paletteDescription = (PaletteDescriptionLink) itPaletteDescrition.next();
								EReference ref = paletteDescription.getAnEReference();
								EClass anRefEClass = (EClass) ref.getEType();
								
								EList<AllElements> DiagElements = new BasicEList<AllElements>();
								Iterator<Layer> itlayers = representation.getLayers().iterator();
								while (itlayers.hasNext()) {
									Layer layer = (Layer) itlayers.next();
									DiagElements.addAll(layer.getElements());
								}
								
								Iterator<AllElements> compareDiagElements = DiagElements.iterator();
								while (compareDiagElements.hasNext()) {
									DiagramElement typediagElement = (DiagramElement) compareDiagElements.next();
									if(typediagElement instanceof Node)
									{
										//Composition Relation-ship
										if(typediagElement.getAnEClass().equals(anRefEClass))
											paletteDescription.getAnDiagramElement().add((Node)typediagElement);
										else
										{
											//Inheritance Relation-ship
											EList<EClass> allClasses = typediagElement.getAnEClass().getEAllSuperTypes();
											int index = allClasses.indexOf(anRefEClass);
											if(index!=-1)
												paletteDescription.getAnDiagramElement().add((Node)typediagElement);
										}
									}
								}							
							}
						}
					}
				}				
			}
		}
	}	
	
	private void PerformEReferenceContainer(GraphicRepresentation graph) {
		
		Iterator<MMGraphic_Representation> mm = graph.getAllGraphicRepresentation().iterator();
		while (mm.hasNext()) {
			MMGraphic_Representation mmGraphic_Representation = (MMGraphic_Representation) mm.next();
			Iterator<Representation> itRepresentations = mmGraphic_Representation.getListRepresentations().iterator();
			while (itRepresentations.hasNext()) {
				Representation representation = (Representation) itRepresentations.next();
				if(representation instanceof RepresentationDD)
				{
					RepresentationDD dd = (RepresentationDD)representation;
					Iterator<Layer> layers = dd.getLayers().iterator();
					while (layers.hasNext()) {
						Layer layer = (Layer) layers.next();
						Iterator<AllElements> all = layer.getElements().iterator();
						while (all.hasNext()) {
							AllElements element = (AllElements) all.next();
							if(element instanceof Node)
							{
								//if(((Node) element).getContainerReference() == null)
								//{
									int index = getNemf().getList_classes().indexOf(((Node) element).getAnEClass());
									if (index == -1) //Do it by Name
										index = ActionTreePageDiagramElements.searchByName(((Node)element).getAnEClass(), getNemf().getList_classes());
									EList<Integer> listOfParents = getHeuristicStrategy().getEcoreContainment().getAllParents(index);
									Iterator<Integer> itParents = listOfParents.iterator();
									while (itParents.hasNext()) {
										Integer parentIndex = (Integer) itParents.next();
										EReference ref = GetFeatureNameContainment(getNemf().getList_classes().get(parentIndex)
																							, ((Node) element).getAnEClass());
										if(ref!=null)
											((Node) element).getContainerReference().add(ref);
									}
									
									//int getParentIndex = getHeuristicStrategy().getEcoreContainment().GetParent(index);									
									//if(getParentIndex!=-1)
									//{
									//EReference ref = GetFeatureNameContainment(getNemf().getList_classes().get(getParentIndex)
									//											, ((Node) element).getAnEClass());
									//		if(ref!=null)
									//			((Node) element).getContainerReference().add(ref);
												//((Node) element).setContainerReference(ref);	
									//}
								//}
							}
							else if(element instanceof Edge)
							{
								int index = getNemf().getList_classes().indexOf(((Edge) element).getAnEClass());
								if (index == -1) //Do it by Name
									index = ActionTreePageDiagramElements.searchByName(((Edge)element).getAnEClass(), getNemf().getList_classes());
								EList<Integer> listOfParents = getHeuristicStrategy().getEcoreContainment().getAllParents(index);
								Iterator<Integer> itParents = listOfParents.iterator();
								while (itParents.hasNext()) {
									
									Integer parentIndex = (Integer) itParents.next();
									EReference ref = GetFeatureNameContainment(getNemf().getList_classes().get(parentIndex)
																						, ((Edge) element).getAnEClass());
									if(ref!=null)
										((Edge) element).getContainerReference().add(ref);
								}		
								
								//int getParentIndex = getHeuristicStrategy().getEcoreContainment().GetParent(index);
								//if(getParentIndex!=-1)
								//{
								//EReference ref = GetFeatureNameContainment(getNemf().getList_classes().get(getParentIndex)
								//													, ((Edge) element).getAnEClass());
								//		if(ref!=null)
								//			((Edge) element).getContainerReference().add(ref);
											//((Edge) element).setContainerReference(ref);
								//}
							}
						}
					}
				}
			}
			
		}
	}
	
	public EReference GetFeatureNameContainment(EClass parentEClass, EClass childEClass) {
		
		EList<EReference> listReferences = parentEClass.getEAllContainments();
		int listEReferences = listReferences.size();
		//Direct Containments
		for (int i = 0; i < listReferences.size(); i++) {
			if(listReferences.get(i).getEType().equals(childEClass)==true)
				return listReferences.get(i);
		}
		
		EList<EClass> childEClassEAllSuperTypes = childEClass.getEAllSuperTypes();
		int listAllSuperTypes = childEClassEAllSuperTypes.size();
		//Inheritance Containments
		for (int i = 0; i < listAllSuperTypes; i++) {
			for (int j = 0; j < listEReferences; j++) {
				if(listReferences.get(j).getEType().equals(childEClassEAllSuperTypes.get(i)))
					return listReferences.get(j);
			}
		}
		//Didn't find the containment reference
		return null;
	}	
	
	public void setUpdateGraphicR(boolean updateGraphicR) {
		this.updateGraphicR = updateGraphicR;
	}
	
	public boolean isUpdateGraphicR() {
		return updateGraphicR;
	}
}
