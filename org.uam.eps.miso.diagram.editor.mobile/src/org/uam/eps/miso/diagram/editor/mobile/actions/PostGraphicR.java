package org.uam.eps.miso.diagram.editor.mobile.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.uam.eps.miso.diagram.editor.mobile.rest.DiagramEditorServer;

public class PostGraphicR implements IHandler {

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
				ResourceSet reSet = new ResourceSetImpl();
				Resource graphic = reSet.getResource(URI.createURI(resource.getLocationURI().toString(),true),true);
				//Diagram Server Editor
				DiagramEditorServer server = new DiagramEditorServer();
				server.PostGraphicRepresentationInit(graphic);
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
