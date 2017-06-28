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
import org.uam.eps.modular.constraints.dialog.wizard.WizardConstraint;

import constraints.MetamodelConstraint;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;

public class DefineConstraintsPattern implements IHandler{

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
			
			WizardConstraint wizard = new WizardConstraint(nemf);
				
			//search constraints
			URI constraintModel = URI.createPlatformResourceURI(resource.getFullPath().toString(), true).
						trimFileExtension().appendFileExtension("cons");
			
			boolean exist = new ExtensibleURIConverterImpl().exists(constraintModel, null);
			
			if (exist == true) {
				
				boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
						"Update/Override", 
								"A file with constraint definitions has been detected. "
								+ "Would you like to update the pattern?");
				
				//Update
				if (result == true) {
					
					ResourceSet reset = new ResourceSetImpl();
					Resource res = reset.getResource(constraintModel, true);
					
					EObject rootEObject = res.getContents().get(0);
					if (rootEObject instanceof MetamodelConstraint) {
						wizard.setConstraint((MetamodelConstraint) rootEObject);
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
