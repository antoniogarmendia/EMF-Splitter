package org.mondo.emf.splitter.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PlatformUI;

import org.mondo.miso.table.ui.wizard.WizardDefineTableVisualization;
import org.mondo.miso.table.ui.wizard.DialogConcreteTableVisualization;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;

public class DefineTableConcreteVisualization implements IHandler {

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
		// TODO Auto-generated method stub
		System.out.println("Execute Wizard to Define Table Concrete Visualization");
		
		IStructuredSelection selection = (TreeSelection)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		Object firstelement = selection.getFirstElement();
		WizardDefineTableVisualization wizard = new WizardDefineTableVisualization();
		
		if(firstelement instanceof IResource){
			
			IResource resource = (IResource)firstelement;
			EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
			nemf.setFileuri(resource.getLocationURI().toString());
						
			DialogConcreteTableVisualization dialog = new DialogConcreteTableVisualization(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
				, wizard);
			
			wizard.setNemf(nemf);
			
			dialog.open();
		}
		
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
