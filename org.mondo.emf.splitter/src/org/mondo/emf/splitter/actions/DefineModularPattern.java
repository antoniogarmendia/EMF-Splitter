package org.mondo.emf.splitter.actions;

import java.io.IOException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.miso.wizard.instantiate.modular.pattern.wizard.DialogApplyModularPattern;
import org.miso.wizard.instantiate.modular.pattern.wizard.WizardApplyModularPattern;

import MetaModelGraph.Graph;
import MetaModelGraph.impl.MetaModelGraphFactoryImpl;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;

public class DefineModularPattern implements IHandler{

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
				
	}

	@Override
	public void dispose() {
			
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IStructuredSelection selection = (TreeSelection)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		Object firstelement = selection.getFirstElement();
		
		if(firstelement instanceof IResource){
			
			IResource resource = (IResource)firstelement;
			EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
			nemf.setFileuri(resource.getLocationURI().toString());
			
			WizardApplyModularPattern wizard = new WizardApplyModularPattern(nemf.getRs(),resource.getProject());
			DialogApplyModularPattern dialog = new DialogApplyModularPattern(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
												,wizard);
			wizard.setDialog(dialog);			
			
			dialog.setPageSize(500, 300);
			
			//Search (Ecore Name).mmgraph
			URI graphURI = URI.createURI(resource.getLocationURI().toString(), true).trimFileExtension().appendFileExtension("mmgraph");
			
			boolean fileExist = new ExtensibleURIConverterImpl().exists(graphURI, null);
			//Update/Override Modular Pattern
			if(fileExist == true){
				
				boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
													"Update/Override", 
															"A file with the modular pattern definition has been detected. "
															+ "Would you like to update the pattern?");
				
				
				//Update
				if(result==true){
					
					Resource res = nemf.getRes().getResource(graphURI, true);		
					
					try {
						res.load(null);
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					
					wizard.seteGraph((Graph) res.getContents().get(0));						
				} else {
					
					createGraphResource(nemf.getRes(), graphURI, wizard);					
				}			
			} else {
				
				createGraphResource(nemf.getRes(), graphURI, wizard);				
			}				
			
			if (dialog.open() == Window.OK) 
			{ 	
				System.out.println("OK");
			}
			else
			{
				System.out.println("Cancel");
			}					
		}	
		
		return null;
	}
	
	public void createGraphResource(ResourceSet reset, URI graphURI, WizardApplyModularPattern wizard) {
		
		Resource gResource = reset.createResource(graphURI);
		Graph  mmGraph = MetaModelGraphFactoryImpl.eINSTANCE.createGraph();
		gResource.getContents().add(mmGraph);			
		wizard.seteGraph(mmGraph);		
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
