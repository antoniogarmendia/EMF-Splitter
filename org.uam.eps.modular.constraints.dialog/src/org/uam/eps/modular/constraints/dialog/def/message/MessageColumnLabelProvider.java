package org.uam.eps.modular.constraints.dialog.def.message;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import constraints.Constraint;

public class MessageColumnLabelProvider extends ColumnLabelProvider {
	
	@Override
	public String getText(Object element) {

		if (element instanceof Constraint) {
			return ((Constraint) element).getErrorMessage();
		}
		return super.getText(element);
	}

}
