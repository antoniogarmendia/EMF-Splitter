package org.mondo.modular.filterui.ext;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;

public class FilterAttribute {
	
	public IWorkbenchPage page;
	public IWorkbenchPart part;
	public Display display;
	public TreeViewer filterViewer;
	public Resource resource;	
	public Composite composite;
		
	public FilterAttribute(IWorkbenchPage page, IWorkbenchPart part,
			Display display, TreeViewer filterViewer, Resource resource,
			Composite composite) {
		
		this.page = page;
		this.part = part;
		this.display = display;
		this.filterViewer = filterViewer;
		this.resource = resource;
		this.composite = composite;		
	}

	public IWorkbenchPage getPage() {
		return page;
	}

	public void setPage(IWorkbenchPage page) {
		this.page = page;
	}

	public IWorkbenchPart getPart() {
		return part;
	}

	public void setPart(IWorkbenchPart part) {
		this.part = part;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public TreeViewer getFilterViewer() {
		return filterViewer;
	}

	public void setFilterViewer(TreeViewer filterViewer) {
		this.filterViewer = filterViewer;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Composite getComposite() {
		return composite;
	}

	public void setComposite(Composite composite) {
		this.composite = composite;
	}
	
}
