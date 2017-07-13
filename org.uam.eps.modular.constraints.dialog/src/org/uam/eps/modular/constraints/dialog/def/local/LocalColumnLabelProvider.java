package org.uam.eps.modular.constraints.dialog.def.local;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import constraints.Constraint;

public class LocalColumnLabelProvider extends ColumnLabelProvider {
	
	@Override
	public String getText(Object element) {

		if (element instanceof Constraint) {
			if (((Constraint) element).getEClass() == null)
				return "false";
			else
				return "true";
		}			
			
		return super.getText(element);
	}

}
