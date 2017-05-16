package org.mondo.emf.splitter.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PlatformUI;
import org.mondo.visualization.ui.wizard.DialogConcreteVisualization;
import org.mondo.visualization.ui.wizard.WizardConcreteVisualization;

import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.RepreHeurSS;
import dslHeuristicVisualization.impl.DslHeuristicVisualizationFactoryImpl;
import graphic_representation.GraphicRepresentation;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.impl.Graphic_representationFactoryImpl;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;

public class DefineConcreteVisualization implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		System.out.println("Execute Wizard to Define Concrete Visualization");	
		
		IStructuredSelection selection = (TreeSelection)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		Object firstelement = selection.getFirstElement();
		WizardConcreteVisualization wizard = new WizardConcreteVisualization();
		
		if(firstelement instanceof IResource){
			
			IResource resource = (IResource)firstelement;
			
			//Search .graphicR
			GraphicRepresentation graph = searchGraphicR(resource);
			
			EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
			nemf.setFileuri(resource.getLocationURI().toString());
			HeuristicStrategy heuristicStrategy = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategy();
						
			if(graph == null) {
			
				graph = Graphic_representationFactoryImpl.eINSTANCE.createGraphicRepresentation();
				MMGraphic_Representation mmgraph = Graphic_representationFactoryImpl.eINSTANCE.createMMGraphic_Representation();
				mmgraph.getListRepresentations().add(Graphic_representationFactoryImpl.eINSTANCE.createRepresentationDD());
				graph.getAllGraphicRepresentation().add(mmgraph);
				wizard.setUpdateGraphicR(false);
			} else {
				
				Resource resourceHeur = nemf.getRes().createResource(URI.createPlatformResourceURI("/temp.heuristic",true));
				resourceHeur.getContents().add(heuristicStrategy);				
			}
			
			heuristicStrategy.setGraphic_representation(graph);
			RepreHeurSS repre = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createRepreHeurSS();
			repre.getHeuristicStrategySettings().add(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategySettings());
			heuristicStrategy.getListRepresentation().add(repre);
			heuristicStrategy.setNemf(nemf);
			wizard.setHeuristicStrategy(heuristicStrategy);			
		}
		
		DialogConcreteVisualization dialog = new DialogConcreteVisualization(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
				, wizard);
		
		dialog.open();	
		
		return null;
	}

	public GraphicRepresentation searchGraphicR(IResource resource) {
		
		URI graphicRURI = URI.createURI(resource.getLocationURI().toString(), true).trimFileExtension().
				appendFileExtension("graphicR");
		
		boolean fileExist = new ExtensibleURIConverterImpl().exists(graphicRURI, null);
		
		if(fileExist == true) {
			
			boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Update/Override", 
							"A file with the Graphic Representation Pattern definition has been detected. "
							+ "Would you like to update the pattern?");
			
			//Update 
			if(result == true) {
				
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource graphicR = resourceSet.getResource(graphicRURI, true);
				
				return (GraphicRepresentation) graphicR.getContents().get(0);
			}			
		}
		
		return null;
	}
	
	@Override
	public boolean isEnabled() {
		
		return true;
	}

	@Override
	public boolean isHandled() {
		
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		
	}

}
