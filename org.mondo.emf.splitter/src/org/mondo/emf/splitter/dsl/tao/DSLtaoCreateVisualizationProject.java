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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.mondo.acceleo.generate.sirius.createProject.CreateSiriusPluginProject;
import org.mondo.editor.extensionpoints.IPatternImplementation;
import org.mondo.editor.extensionpoints.ValidationInfo;
import org.mondo.editor.graphiti.diagram.utils.ModelUtils;
import org.mondo.editor.ui.utils.patterns.MMInterfaceRelDiagram;
import org.mondo.editor.ui.utils.patterns.PatternUtils;
import org.mondo.editor.ui.utils.patterns.RuntimePatternsModelUtils;
import org.mondo.visualization.ui.libraryrtpat.XMIRuntimePatternsImplImpl;
import org.mondo.visualization.ui.wizard.DialogConcreteVisualization;
import org.mondo.visualization.ui.wizard.WizardConcreteVisualization;

import RepresentationGraph.RepresentationGraphFactory;
import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.RepreHeurSS;
import dslHeuristicVisualization.impl.DslHeuristicVisualizationFactoryImpl;
import runtimePatterns.ClassRoleInstance;

import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;

import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import runtimePatterns.ReferenceRoleInstance;
import runtimePatterns.impl.RuntimePatternsFactoryImpl;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;
import dslPatterns.ClassInterface;
import dslPatterns.ComplexFeatureMain;
import dslPatterns.FeatureInstance;
import dslPatterns.FeatureInterface;
import dslPatterns.FeatureType;
import dslPatterns.MMInterface;
import dslPatterns.Pattern;
import dslPatterns.PatternMetaModel;
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
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute(EPackage ePack, PatternInstance pattern, IPath iPath) {
		// TODO Auto-generated method stub
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
					// TODO Auto-generated catch block
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ENamedElement> getOptimalElements(EPackage ePack,
			MMInterface mminterface) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean applyPattern(EPackage ePack, Pattern pattern,
			PatternInstances patternInstances, IPath iPath) {
		// TODO Auto-generated method stub
		//File URI of the Diagram Model
		IResource resEcore = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(iPath);
		
		EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
		nemf.setPackMetamodel(ePack);
		
		WizardConcreteVisualization wizard_visualization = new WizardConcreteVisualization();
		
		//Create Heuristic Strategy
		HeuristicStrategy heuristicStrategy = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategy();
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
		
		wizard_visualization.setHeuristicStrategy(heuristicStrategy);
		
		DialogConcreteVisualization	 dialog = new DialogConcreteVisualization(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),wizard_visualization);
		
		if (dialog.open() == Window.OK) 
		{ 	
		
		//GraphicRepresentation graphicR = wizard_visualization.getHeuristicStrategy().getGraphic_representation();
				
		//Add Pattern Instances to Diagram
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
						// TODO Auto-generated method stub
						patternInstances.getAppliedPatterns().addAll(pis);
					}
				});			
				
				
				//saveRuntimePatternsInstances(diagramB, pis);
			}
		//End
				
		System.out.println("Dedicated for Graph Based Representation");
		}
		
		return true;
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

}
