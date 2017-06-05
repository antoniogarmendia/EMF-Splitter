package org.miso.wizard.instantiate.modular.pattern.pages.filter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class EClassFilter extends ViewerFilter {

	private String searchString;

	public EClassFilter() {
	
	}
	
    public void setSearchText(String s) {
            //Ensure that the value can be used for matching
    		this.searchString = ".*" + s.toLowerCase() + ".*";
    }
	
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		
		if (searchString == null || searchString.length() == 0) {
            return true;
		}
		
		EClass eClass = (EClass) element;
		if(eClass.getName().toLowerCase().matches(searchString))
			return true;
				
		return false;
	}

	@Override
	public boolean isFilterProperty(Object element, String property) {
		
		return super.isFilterProperty(element, property);
	}
	
	@Override
	public Object[] filter(Viewer viewer, Object parent, Object[] elements) {
		
		return super.filter(viewer, parent, elements);
	}
	
	@Override
	public Object[] filter(Viewer viewer, TreePath parentPath, Object[] elements) {
		
		return super.filter(viewer, parentPath, elements);
	}

	
}
