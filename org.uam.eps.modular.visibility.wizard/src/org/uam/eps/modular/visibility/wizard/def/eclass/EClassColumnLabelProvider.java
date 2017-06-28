package org.uam.eps.modular.visibility.wizard.def.eclass;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import visibility.Visibility;

public class EClassColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		if (element instanceof Visibility)
			return ((Visibility) element).getEClass().getName();
		return super.getText(element);
	}

}
