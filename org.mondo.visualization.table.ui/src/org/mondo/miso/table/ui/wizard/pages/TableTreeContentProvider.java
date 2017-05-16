package org.mondo.miso.table.ui.wizard.pages;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import graphic_representation.LineGroup;

public class TableTreeContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement) {
		// TODO Auto-generated method stub
		return (Object[])inputElement;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		// TODO Auto-generated method stub
		if(parentElement instanceof LineGroup)
		{
			return ((LineGroup) parentElement).getListEClasses().toArray(new Object[]{});
		}
		if(parentElement instanceof EClass)
		{
			return ((EClass) parentElement).getEAllAttributes().toArray(new Object[]{});
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof LineGroup)
		{
			if(((LineGroup) element).getListEClasses().size()>0)
				return true;			
		}
		if(element instanceof EClass)
		{
			EList<EAttribute> listEAttributtes = ((EClass) element).getEAllAttributes();
			if(listEAttributtes.size()>0)
				return true;
		}
		
		return false;
	}

}
