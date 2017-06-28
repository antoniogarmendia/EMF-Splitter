package org.mondo.emf.splitter.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.uam.eps.modular.visibility.wizard.def.VisibilityWizard;

import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;
import visibility.MetamodelVisibility;

public class DefineVisibilityPattern implements IHandler {

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
		
		if(firstelement instanceof IResource) {
			
			IResource resource = (IResource)firstelement;
			
			EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
			nemf.setFileuri(resource.getLocationURI().toString());
			
			VisibilityWizard wizard = new VisibilityWizard(nemf);
			
			//search constraints
			URI visibilityModel = URI.createPlatformResourceURI(resource.getFullPath().toString(), true).
						trimFileExtension().appendFileExtension("vis");
			
			boolean exist = new ExtensibleURIConverterImpl().exists(visibilityModel, null);
			
			if (exist == true) {
				
				boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
						"Update/Override", 
								"A file with visibility definitions has been detected. "
								+ "Would you like to update the pattern?");
				
				//Update
				if (result == true) {
					
					ResourceSet reset = new ResourceSetImpl();
					Resource res = reset.getResource(visibilityModel, true);
					
					EObject rootEObject = res.getContents().get(0);
					if (rootEObject instanceof MetamodelVisibility) {
						wizard.setVisibilityRules((MetamodelVisibility) rootEObject);
					}				
				}
				
			}			
			
			WizardDialog wizardDialog = new WizardDialog(HandlerUtil.getActiveShell(event), wizard);
			wizardDialog.open();			
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
