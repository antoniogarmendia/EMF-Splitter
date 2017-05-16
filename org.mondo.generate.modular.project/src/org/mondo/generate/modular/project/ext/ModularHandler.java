package org.mondo.generate.modular.project.ext;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class ModularHandler extends AbstractHandler{

	protected IFile getIFile(ExecutionEvent ee){
		
		Object obj = getFirstElement(ee);
		if(obj instanceof IContainer)
		{
			IContainer fol = (IContainer)obj;
			IFile file = fol.getFile(new Path(fol.getName() + ".xmi"));
			return file;
		}	
		else
			if(obj instanceof IFile)
				return (IFile) obj;
		return null;		
	}
	
	protected IContainer getIFolder(ExecutionEvent ee){
		
		Object obj = getFirstElement(ee);
		if(obj instanceof IContainer)
			return (IContainer) obj;
		return null;
	}
	
	private Object getFirstElement(ExecutionEvent ee)
	{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(ee);
		
		if(window!=null)
		{
			ISelectionService selectionservice = (ISelectionService)window.getSelectionService();
			ISelection selection = selectionservice.getSelection();
			TreeSelection treeselection = (TreeSelection)selection;
			Object firstelement = treeselection.getFirstElement();
			return firstelement;
		}	
		return null;
	}
	
}
