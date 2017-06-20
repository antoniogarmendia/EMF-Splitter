package org.uam.eps.modular.constraints.dialog.def.contraint;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import constraints.Constraint;

public class ConstraintColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		if (element instanceof Constraint) {
			return ((Constraint) element).getStatement();
		}
		return super.getText(element);
	}
}
