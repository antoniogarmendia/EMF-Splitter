package org.uam.eps.modular.constraints.dialog.def.eclass;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import constraints.Constraint;

public class EClassColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		if (element instanceof Constraint) {
			return ((Constraint) element).getEClass().getName();
		}
		
		return super.getText(element);
	}
}
