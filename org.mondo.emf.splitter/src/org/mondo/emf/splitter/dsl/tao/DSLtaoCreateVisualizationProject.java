package org.mondo.emf.splitter.dsl.tao;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.miso.wizard.instantiate.modular.pattern.utils.GraphToModularityPattern;
import org.miso.wizard.instantiate.modular.pattern.utils.PatternModularUtils;
import org.mondo.acceleo.generate.sirius.createProject.CreateSiriusPluginProject;
import org.mondo.editor.extensionpoints.IPatternImplementation;
import org.mondo.editor.extensionpoints.ValidationInfo;
import org.mondo.editor.graphiti.diagram.utils.ModelUtils;
import org.mondo.editor.ui.utils.patterns.MMInterfaceRelDiagram;
import org.mondo.editor.ui.utils.patterns.PatternApplicationUtils;
import org.mondo.editor.ui.utils.patterns.PatternUtils;
import org.mondo.editor.ui.utils.patterns.RuntimePatternsModelUtils;
import org.mondo.visualization.ui.libraryrtpat.XMIRuntimePatternsImplImpl;
import org.mondo.visualization.ui.wizard.DialogConcreteVisualization;
import org.mondo.visualization.ui.wizard.WizardConcreteVisualization;

import com.google.common.collect.Iterables;

import RepresentationGraph.RepresentationGraphFactory;
import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.RepreHeurSS;
import dslHeuristicVisualization.impl.DslHeuristicVisualizationFactoryImpl;
import runtimePatterns.ClassRoleInstance;
import runtimePatterns.FeatureRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;

import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;

import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import runtimePatterns.ReferenceRoleInstance;
import runtimePatterns.TypeFeatureRoleInstance;
import runtimePatterns.impl.RuntimePatternsFactoryImpl;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;
import splitterLibrary.util.DSLtaoUtils;
import dslPatterns.ClassInterface;
import dslPatterns.ComplexFeatureMain;
import dslPatterns.FeatureInstance;
import dslPatterns.FeatureInterface;
import dslPatterns.FeatureType;
import dslPatterns.MMInterface;
import dslPatterns.Pattern;
import dslPatterns.PatternMetaModel;
import dslPatterns.PatternSet;
import dslPatterns.ReferenceInterface;
import graphic_representation.AllElements;
import graphic_representation.DiagramElement;
import graphic_representation.GraphicRepresentation;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.RepresentationDD;
import graphic_representation.Shape;
import graphic_representation.impl.Graphic_representationFactoryImpl;


public class DSLtaoCreateVisualizationProject implements IPatternImplementation {

	public DSLtaoCreateVisualizationProject() {
		
	}

	@Override
	public boolean execute(EPackage ePack, PatternInstance pattern, IPath iPath) {
		IResource res = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(iPath);
		IProject current_pro = res.getProject();		
		EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
		//File uri of the ecore Meta-Model
		String fileuri = res.getLocationURI().toString().substring(0, 
			res.getLocationURI().toString().lastIndexOf("/")).concat("/"+iPath.removeFileExtension().lastSegment()+".ecore");
		//If *.ecore doesn't exist Create it!!
		IResource resEcore = ResourcesPlugin.getWorkspace().getRoot().
								getFileForLocation(Path.fromOSString(URI.createURI(fileuri,true).toFileString()));
		if(!resEcore.exists())
			try {
					ModelUtils.saveModel(fileuri, ePack);
			} catch (IOException e) {
					
				e.printStackTrace();
			}
		//END
		nemf.setFileuri(fileuri);
			//Create Visual Plugin Project(Sirius)
				CreateSiriusPluginProject csirius = new CreateSiriusPluginProject(current_pro.getName(),nemf, new NullProgressMonitor());
				csirius.CreateProject();
			//End Creation
				
		System.out.println("Complete Visual Plugin Project Creation");		
		return true;
	}

	@Override
	public ValidationInfo validate(EPackage ePack, PatternInstance pattern) {
		// Nothing to do
		return null;
	}

	@Override
	public List<ENamedElement> getOptimalElements(EPackage ePack,
			MMInterface mminterface) {
		// Nothing to do
		return null;
	}

	@Override
	public boolean applyPattern(EPackage ePack, Pattern pattern,
			PatternInstances patternInstances, IPath iPath) {
		
		URI resourceURI = ePack.eResource().getURI();
		//File URI of the Diagram Model
		IResource resEcore = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(iPath);
		
		EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
		nemf.setPackMetamodel(ePack);
		
		WizardConcreteVisualization wizard_visualization = new WizardConcreteVisualization();
		
		//Create Heuristic Strategy
		HeuristicStrategy heuristicStrategy = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategy();
		//Try insert a resource
		ResourceSet reset = new ResourceSetImpl();
		Resource resStrategy = reset.createResource(resourceURI.trimFileExtension().appendFileExtension("strategy"));
		resStrategy.getContents().add(heuristicStrategy);
		//End
		GraphicRepresentation graph = Graphic_representationFactoryImpl.eINSTANCE.createGraphicRepresentation();
		MMGraphic_Representation mmgraph = Graphic_representationFactoryImpl.eINSTANCE.createMMGraphic_Representation();
		mmgraph.getListRepresentations().add(Graphic_representationFactoryImpl.eINSTANCE.createRepresentationDD());
		graph.getAllGraphicRepresentation().add(mmgraph);
		heuristicStrategy.setGraphic_representation(graph);
		RepreHeurSS repre = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createRepreHeurSS();
		repre.getHeuristicStrategySettings().add(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategySettings());
		heuristicStrategy.getListRepresentation().add(repre);
		heuristicStrategy.setNemf(nemf);		
		//End
		
		//Search if Modularity pattern has been applied
		PatternInstance patternModularity = XMIRuntimePatternsImplImpl.getModularityPatternInstance(patternInstances);
		if(patternModularity!=null){
			wizard_visualization.initEcore(resEcore.getLocationURI().toString(),XMIRuntimePatternsImplImpl.GetUnitsPatternModularity(patternModularity));
		}
		else
			wizard_visualization.initEcore(resEcore.getLocationURI().toString(),null);
		
		//Graphical Representation Wizard
		DialogConcreteVisualization	 dialog = new DialogConcreteVisualization(PlatformUI.getWorkbench().
				getActiveWorkbenchWindow().getShell(),wizard_visualization);
		
		
		//Search a graphic representation
		URI graphicR = resourceURI.trimFileExtension().appendFileExtension("graphicR");
		
		boolean fileExist = new ExtensibleURIConverterImpl().exists(graphicR, null);
		
		wizard_visualization.setHeuristicStrategy(heuristicStrategy);
		
		if (fileExist == true) {
			
			boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Update/Override", 
							"A file with the graphical representation pattern definition has been detected. "
							+ "Would you like to update the pattern?");
			
			//update 
			if(result == true) {
				
				//ResourceSet reset = new ResourceSetImpl();
				Resource res = reset.getResource(graphicR, true);
				try {
					res.load(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
				GraphicRepresentation gR = (GraphicRepresentation) res.getContents().get(0);
				heuristicStrategy.setGraphic_representation(gR);
				graph = gR;
				wizard_visualization.setHeuristicStrategy(heuristicStrategy);
			}			
		} else {
			wizard_visualization.setUpdateGraphicR(false);
		}
			
				
		if (dialog.open() == Window.OK) 
		{ 	
			IProject project = resEcore.getProject();
			// obtain Graph-Representation Pattern
			PatternSet patternModel = PatternUtils.getPatternSetModel(project);
			Pattern graphPattern = DSLtaoUtils.getGraphRepresentation(patternModel);
			DSLtaoUtils.setPatternAbsoluteUri(project, graphPattern.eResource());
			
			PatternInstances graphInstance = DSLtaoUtils.createPatternInstances();
			
			//convert GraphicalRepresentation to runtime patterns
			GRToDSLtaoGraph transoPattern = new GRToDSLtaoGraph(graphPattern);
			transoPattern.tranformGRToGraphBasedPattern(graph, graphInstance);
			//graphInstance.getAppliedPatterns().get(0);
			
			// save runtime patterns
			URI uri = resourceURI.trimFileExtension().appendFileExtension("rtpat");
			boolean exisRtpat = DSLtaoUtils.existRuntimePatterns(uri);
			
			// update runtime patterns
			PatternModularUtils.savePatternInstanceInRtapt(uri,graphInstance.getAppliedPatterns().get(0),DSLtaoUtils.catGraphRepresentation);
			
			transformPatternsCompatibleWithDiagram(ePack,graphInstance.getAppliedPatterns().get(0));
			
			// apply pattern to the diagram
			PatternApplicationUtils.applyPattern(transformFromAppliedPatternsToMMInterfaceRelDiagram(graphInstance.getAppliedPatterns().get(0),pattern),
					getDiagramDSLtao(), pattern, patternInstances, "Graph-based Representation", false);
			
			System.out.println("Apply Pattern");
		
		//GraphicRepresentation graphicR = wizard_visualization.getHeuristicStrategy().getGraphic_representation();
				
		//Add Pattern Instances to Diagram
			/*
			IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorPart editor = activePage.getActiveEditor();
						
			if (editor instanceof IDiagramContainerUI){
				
				DiagramBehavior diagramB = ((IDiagramContainerUI)editor).getDiagramBehavior();
				EList<PatternInstance> pis = ConvertGraphicRepresentationtoPatternInstance(graph,patternInstances,pattern);
				final CommandStack commandStack = diagramB.getEditingDomain().getCommandStack();
				
				//DrawingPattern(pattern, ((ComplexFeatureMain) pattern.getRootVariant().getAndChildren().get(0)).getMetaModel(), diagramB, patternInstances);
				
				commandStack.execute(new RecordingCommand(diagramB.getEditingDomain()) {

					@Override
					protected void doExecute() {
						
						patternInstances.getAppliedPatterns().addAll(pis);
					}
				});			
				
				
				//saveRuntimePatternsInstances(diagramB, pis);
			}
			*/
			
			
			
		//End
				
		System.out.println("Dedicated for Graph Based Representation");
		}
		
		return true;
	}
	
private DiagramBehavior getDiagramDSLtao() {
		
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IDiagramContainerUI editor = (IDiagramContainerUI)activePage.getActiveEditor();
			
		return editor.getDiagramBehavior();		
	}
	
private List<MMInterfaceRelDiagram> transformFromAppliedPatternsToMMInterfaceRelDiagram(PatternInstance modularInstance, Pattern pattern) {
		
		List<MMInterfaceRelDiagram> modularityMM = new LinkedList<MMInterfaceRelDiagram>();
		Iterator<ClassRoleInstance> itClassRoleInstance = modularInstance.getClassInstances().iterator();
		
		int order = 0;
		// add classes
		while (itClassRoleInstance.hasNext()) {
			ClassRoleInstance classRoleInstance = (ClassRoleInstance) itClassRoleInstance.next();
			MMInterface interfaceClassRoleInstance = classRoleInstance.getRole();
			String elementDiagram = classRoleInstance.getElement().getName();
			// add ClassRoleInstance
			MMInterfaceRelDiagram parentClassRoleInstance = new MMInterfaceRelDiagram
					(interfaceClassRoleInstance, elementDiagram, order, modularityMM);
			modularityMM.add(parentClassRoleInstance);		
			
			// add reference instances (composition)	
			Iterator<ReferenceRoleInstance> itReferenceInstances = classRoleInstance.getReferenceInstances().iterator();
			while (itReferenceInstances.hasNext()) {
				ReferenceRoleInstance referenceRoleInstance = (ReferenceRoleInstance) itReferenceInstances.next();
				String value = elementDiagram + "/" + referenceRoleInstance.getElement().getName();
				MMInterfaceRelDiagram mmReferenceRoleInstance = new MMInterfaceRelDiagram
						(referenceRoleInstance.getRole(), value, order, modularityMM);
				mmReferenceRoleInstance.setParent(parentClassRoleInstance);
				modularityMM.add(mmReferenceRoleInstance);
			}			
			
			// add FeatureType
			Iterator<FeatureRoleInstance> itFeatureInstances = classRoleInstance.getFeatureInstances().iterator();
			while (itFeatureInstances.hasNext()) {
				FeatureRoleInstance featureRoleInstance = (FeatureRoleInstance) itFeatureInstances.next();
				// add name feature
				if (featureRoleInstance instanceof TypeFeatureRoleInstance) {
					TypeFeatureRoleInstance type = (TypeFeatureRoleInstance) featureRoleInstance;
					String value = elementDiagram + "/" + type.getElement().getName(); 
					if (value != null) {
						MMInterfaceRelDiagram mmFeatureType = new MMInterfaceRelDiagram
								(type.getRole(), value, order, modularityMM);
						mmFeatureType.setParent(parentClassRoleInstance);						
						modularityMM.add(mmFeatureType);
					}
				}
				// add extension & icon
				else if (featureRoleInstance instanceof InstanceFeatureRoleInstance) {
					InstanceFeatureRoleInstance feat = (InstanceFeatureRoleInstance) featureRoleInstance;
					String value = feat.getValue();
					if (value != null) {						
						MMInterfaceRelDiagram mmFeatureRole = new MMInterfaceRelDiagram
								(feat.getRole(), value, order, modularityMM);	
						mmFeatureRole.setParent(parentClassRoleInstance);
						if(feat.getRole().getRef().get(0).getName().contains("icon"))
							parentClassRoleInstance.getChildren().add(mmFeatureRole);
						modularityMM.add(mmFeatureRole);
					}
				}
				
			}
			order++;
		}	
		
		return modularityMM;
	}
	
	
	public EList<PatternInstance> ConvertGraphicRepresentationtoPatternInstance(GraphicRepresentation graph, PatternInstances patternInstances,Pattern pattern)
	{
		 EList<PatternInstance> listUnitPatternInstances = new BasicEList<PatternInstance>();
		 Iterator<MMGraphic_Representation> listUnits = graph.getAllGraphicRepresentation().iterator();
		 while (listUnits.hasNext()) {
			 PatternInstance pat = RuntimePatternsFactoryImpl.eINSTANCE.createPatternInstance();
			 
			 MMGraphic_Representation type = (MMGraphic_Representation) listUnits.next();
			 pat.setPattern(pattern);
			 ClassRoleInstance diagrameClass = RuntimePatternsFactoryImpl.eINSTANCE.createClassRoleInstance();
			 diagrameClass.setElement(((RepresentationDD)type.getListRepresentations().get(0)).getRoot().getAnEClass());
			 pat.setIdent(pattern.getName() + " " + ((RepresentationDD)type.getListRepresentations().get(0)).getRoot().getAnEClass().getName());
			 
			 Iterator<AllElements> diag_elements = ((RepresentationDD)type.getListRepresentations().get(0)).getLayers().get(0).getElements().iterator();
			 //EList<FeatureRoleInstance> listRoleInstance = new BasicEList<FeatureRoleInstance>();			 
			 
			 ComplexFeatureMain eComplexFeeature = (ComplexFeatureMain) pattern.getRootVariant().getAndChildren().get(0);
			 PatternMetaModel met = eComplexFeeature.getMetaModel();
			 EList<ClassInterface> eClassInterfaces = met.getClassInterfaces();
			 EList<ReferenceInterface> eClassRefInterfaces = met.getRefInterfaces();
			 
			 diagrameClass.setRole(GetClassInterface(eClassInterfaces, RepresentationGraphFactory.eINSTANCE.createDiagram().eClass()));
			 
			 
			 ClassRoleInstance eClassInstance = null;
			 while (diag_elements.hasNext()) {
				 AllElements element = (AllElements) diag_elements.next();
				 if(element instanceof DiagramElement)
				 {
				 DiagramElement diag = (DiagramElement) element;
				 eClassInstance = RuntimePatternsFactoryImpl.eINSTANCE.createClassRoleInstance();
				 if(diag instanceof graphic_representation.Edge)
				 {
					eClassInstance.setElement(diag.getAnEClass());
					eClassInstance.setRole(GetClassInterface(eClassInterfaces, RepresentationGraphFactory.eINSTANCE.createEdgeElement().eClass()));
					//Source Reference
					ReferenceRoleInstance featSource = RuntimePatternsFactoryImpl.eINSTANCE.createReferenceRoleInstance();
					featSource.setElement(((graphic_representation.Edge) diag).getDirections().getSourceLink().getAnEReference());
					featSource.setRole(GetClassRefInterface(eClassRefInterfaces, "source"));
					eClassInstance.getReferenceInstances().add(featSource);
					
					//Target Reference
					ReferenceRoleInstance featTarget = RuntimePatternsFactoryImpl.eINSTANCE.createReferenceRoleInstance();
					featTarget.setElement(((graphic_representation.Edge) diag).getDirections().getTargetLink().getAnEReference());
					featTarget.setRole(GetClassRefInterface(eClassRefInterfaces, "target"));
					eClassInstance.getReferenceInstances().add(featTarget);
					
					pat.getClassInstances().add(eClassInstance);
				 }
				 else if (diag instanceof graphic_representation.Node){
					
					 eClassInstance.setElement(diag.getAnEClass());
					 Shape sh = ((graphic_representation.Node) diag).getNode_shape();
					 
					 if(sh instanceof graphic_representation.Ellipse)
						 eClassInstance.setRole(GetClassInterface(eClassInterfaces, RepresentationGraphFactory.eINSTANCE.createCircle().eClass()));
					 else if(sh instanceof graphic_representation.Rectangle)
						 eClassInstance.setRole(GetClassInterface(eClassInterfaces, RepresentationGraphFactory.eINSTANCE.createRectangle().eClass()));
					 
					 pat.getClassInstances().add(eClassInstance);
				 }
			  }
			 }	 
			 pat.getClassInstances().add(0,diagrameClass);
			 listUnitPatternInstances.add(pat);		 
			 
			 System.out.println("Graphical Representation to GraphRepresentation");
		}	 
		 
		 return listUnitPatternInstances;
	}
	
	private ReferenceInterface GetClassRefInterface(EList<ReferenceInterface> eClassRefInterfaces,
			String name) {
		
		Iterator<ReferenceInterface> iteratorClassRefInterfaces = eClassRefInterfaces.iterator();
		while (iteratorClassRefInterfaces.hasNext()) {
			ReferenceInterface type = (ReferenceInterface) iteratorClassRefInterfaces.next();
			if(type.getRef().getName().equals(name))
					return type;	
		}		
		return null;
	}

	public static void saveRuntimePatternsInstances(DiagramBehavior diagramBehavior, EList<PatternInstance> pis){
		
		TransactionalEditingDomain domain = diagramBehavior.getEditingDomain();
		
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				// TODO Auto-generated method stub
				List<PatternInstance> listPis = RuntimePatternsModelUtils.getAllAppliedPatterns(diagramBehavior);
				listPis.addAll(pis);				
			}
			
		});
	}
	
	public ClassInterface GetClassInterface(EList<ClassInterface> eClassInterfaces, EClass anEClass)
	{
		Iterator<ClassInterface> iteratorClassInterfaces = eClassInterfaces.iterator();
		while (iteratorClassInterfaces.hasNext()) {
			ClassInterface type = (ClassInterface) iteratorClassInterfaces.next();
			EClass typeEClass = type.getRef().get(0);
			if(typeEClass.isAbstract()==false && typeEClass.isInterface()==false)
			{
				EObject obj = RepresentationGraphFactory.eINSTANCE.create(typeEClass);
				EObject obj1 = RepresentationGraphFactory.eINSTANCE.create(anEClass);
				//EClass as = anEClass.eClass();
				//Boolean asw = obj.getClass().isInstance(obj1);
				if(obj.getClass().isInstance(obj1))
					return type;
			}
		}		
		return null;		
	}
	
	public void DrawingPattern(Pattern pat, PatternMetaModel metamodel, DiagramBehavior db, PatternInstances pis){
		
		List<MMInterfaceRelDiagram> patternRelDiagram = new LinkedList<MMInterfaceRelDiagram>();
		//boolean first = true;
		 for (FeatureInterface fi: metamodel.getAttrInterfaces()){  
			  if (PatternUtils.existsEAttribute(fi))
				  if (fi instanceof FeatureType){
					  MMInterfaceRelDiagram relElement = new MMInterfaceRelDiagram(fi, "", patternRelDiagram);
					  patternRelDiagram.add(relElement);
				  }else {//FeatureInstance
					  MMInterfaceRelDiagram relElement = new MMInterfaceRelDiagram(fi, PatternUtils.getDefaultValue((FeatureInstance)fi), patternRelDiagram);
					  patternRelDiagram.add(relElement);
				  }
		  }
		  for (ReferenceInterface ri: metamodel.getRefInterfaces())	 {   	
			  if (PatternUtils.existsEReference(ri)){
				  MMInterfaceRelDiagram relElement = new MMInterfaceRelDiagram(ri, "", patternRelDiagram);
				  patternRelDiagram.add(relElement);
			  }
		  }
		  
		 //String patternInstanceName = RuntimePatternsModelUtils.getPatternNameValid(pis, pat.getName());
		 //PatternApplicationUtils.applyPattern(patternRelDiagram, db, pat, pis, patternInstanceName, false);
	}
	
	private void transformPatternsCompatibleWithDiagram(EPackage ePack, PatternInstance patternInstance) {
		
		EList<EClass> listEClasses = obtainEClasses(ePack);		
		Iterator<ClassRoleInstance> itClassRoleInstance = patternInstance.getClassInstances().iterator();
		while (itClassRoleInstance.hasNext()) {
			ClassRoleInstance classRoleInstance = (ClassRoleInstance) itClassRoleInstance.next();
			EClass eClass = searchEClassByName(listEClasses, classRoleInstance.getElement().getName());
			classRoleInstance.setElement(eClass);
			
			// set name
			Iterator<FeatureRoleInstance> itFeatures = classRoleInstance.getFeatureInstances().iterator();
			while (itFeatures.hasNext()) {
				FeatureRoleInstance featureRoleInstance = (FeatureRoleInstance) itFeatures.next();
				if (featureRoleInstance instanceof TypeFeatureRoleInstance) {
					
					TypeFeatureRoleInstance typeFeat = (TypeFeatureRoleInstance) featureRoleInstance;
					EAttribute eAttribute = searchEAttributeByName(eClass, typeFeat.getElement().getName());
					typeFeat.setElement(eAttribute);					
				}
			}
			
			//set composition
			Iterator<ReferenceRoleInstance> itReferences = classRoleInstance.getReferenceInstances().iterator();
			while (itReferences.hasNext()) {
				ReferenceRoleInstance referenceRoleInstance = (ReferenceRoleInstance) itReferences.next();
				EReference eReference = searchEReference(eClass, referenceRoleInstance.getElement().getName());
				referenceRoleInstance.setElement(eReference);				
			}			
		}
		
	}
	
	private EList<EClass> obtainEClasses(EPackage ePackage) {
		
		EClass[] aux = Iterables.toArray(Iterables.filter(ePackage.getEClassifiers(), EClass.class), EClass.class);
		EList<EClass> listEClasses = new BasicInternalEList<EClass>(EClass.class, aux.length,aux);
		EList<EPackage> listSubPackages = ePackage.getESubpackages();
		for (int i = 0; i < listSubPackages.size(); i++) {
			EPackage currentPack = listSubPackages.get(i);
			aux = Iterables.toArray(Iterables.filter(currentPack.getEClassifiers(), EClass.class), EClass.class);
			listEClasses.addAll(new BasicInternalEList<EClass>(EClass.class, aux.length,aux));
			listSubPackages.addAll(currentPack.getESubpackages());
		}
		
		return listEClasses;		
	}
	
private EClass searchEClassByName(EList<EClass> listEClasses, String name) {
		
		
		Iterator<EClass> itEClasses =  listEClasses.iterator();
		while (itEClasses.hasNext()) {
			EClass eClass = (EClass) itEClasses.next();
			if(eClass.getName().equals(name))
				return eClass;
		}		
		return null;
	}
	
	private EAttribute searchEAttributeByName (EClass eClass, String name) {
		
		Iterator<EAttribute> itEAttributes = eClass.getEAllAttributes().iterator();
		while (itEAttributes.hasNext()) {
			EAttribute eAttribute = (EAttribute) itEAttributes.next();
			if (eAttribute.getName().equals(name))
				return eAttribute;
		}		
		return null;		
	}
	
	private EReference searchEReference (EClass eClass, String name) {
		
		Iterator<EReference> allContainments = eClass.getEAllContainments().iterator();
		while (allContainments.hasNext()) {
			EReference eReference = (EReference) allContainments.next();
			if (eReference.getName().equals(name))
				return eReference;
		}	
		
		return null;
	}

}
