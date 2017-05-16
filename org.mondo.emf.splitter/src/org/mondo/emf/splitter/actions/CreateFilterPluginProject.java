package org.mondo.emf.splitter.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.mondo.acceleo.generate.filterui.createProject.CreateFilterProject;

import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;

public class CreateFilterPluginProject implements IHandler {

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
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if(window!=null)
		{
			ISelectionService selectionservice = (ISelectionService)window.getSelectionService();
			ISelection selection = selectionservice.getSelection();
			TreeSelection treeselection = (TreeSelection)selection;
			Object firstelement = treeselection.getFirstElement();
			if(firstelement instanceof IResource){
				IResource resource = (IResource)firstelement;
				IProject current_pro = resource.getProject();
				EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
				nemf.setFileuri(resource.getLocationURI().toString());
				//Create Filter Plugin Project
					CreateFilterProject cfil = new CreateFilterProject(current_pro.getName(),  new NullProgressMonitor(), nemf);
					cfil.CreateProject();
				//End
				System.out.println("Complete Creation of Filter Plugin Project");
			}
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
