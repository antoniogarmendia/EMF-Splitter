package org.uam.eps.modular.constraints.dialog.def.name;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import constraints.Constraint;


public class NameColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		if (element instanceof Constraint) {
			return ((Constraint) element).getName();
		}		
		return super.getText(element);
	}

}
