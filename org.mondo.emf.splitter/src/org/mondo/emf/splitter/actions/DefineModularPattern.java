package org.mondo.emf.splitter.actions;

import java.io.IOException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.miso.wizard.instantiate.modular.pattern.wizard.DialogApplyModularPattern;
import org.miso.wizard.instantiate.modular.pattern.wizard.WizardApplyModularPattern;

import MetaModelGraph.Graph;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;

public class DefineModularPattern implements IHandler{

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IStructuredSelection selection = (TreeSelection)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		Object firstelement = selection.getFirstElement();
		
		if(firstelement instanceof IResource){
			
			IResource resource = (IResource)firstelement;
			EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
			nemf.setFileuri(resource.getLocationURI().toString());
			
			WizardApplyModularPattern wizard = new WizardApplyModularPattern(null,nemf.getRs(),resource.getProject());
			DialogApplyModularPattern dialog = new DialogApplyModularPattern(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
												,wizard);
			wizard.setDialog(dialog);			
			
			dialog.setPageSize(500, 300);
			
			//Search (Ecore Name).mmgraph
			//Update/Override Modular Pattern
			URI graphURI = URI.createURI(resource.getLocationURI().toString(), true).trimFileExtension().appendFileExtension("mmgraph");
			
			boolean fileExist = new ExtensibleURIConverterImpl().exists(graphURI, null);
			
			if(fileExist == true){
				
				boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
													"Update/Override", 
															"A file with the modular pattern definition has been detected. "
															+ "Would you like to update the pattern?");
				
				
				//Update
				if(result==true){
					Resource res = nemf.getRes().createResource(graphURI);
					try {
						res.load(null);
						wizard.seteGraph((Graph) res.getContents().get(0));
												
					} catch (IOException e) {						
						e.printStackTrace();
					}
				}				
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
		// TODO Auto-generated method stub
		
	}

}
