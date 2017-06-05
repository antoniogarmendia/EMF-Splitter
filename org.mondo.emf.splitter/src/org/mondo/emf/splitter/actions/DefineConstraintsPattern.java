package org.mondo.emf.splitter.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mondo.visualization.ui.wizard.WizardConcreteVisualization;
import org.uam.eps.modular.constraints.dialog.def.ConstraintDialog;

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
		
		if(firstelement instanceof IResource){
			
			IResource resource = (IResource)firstelement;
			
			EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
			nemf.setFileuri(resource.getLocationURI().toString());
			
			ConstraintDialog dialog = new ConstraintDialog(HandlerUtil.getActiveShell(event),nemf);
			
			dialog.open();
		}
		
		System.out.println("asdd");
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
