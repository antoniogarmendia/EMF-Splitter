package org.uam.eps.modular.constraints.dialog.def.constraint.definition;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import constraints.Constraint;

public class ConstraintDefinitionColumnLabelProvider extends ColumnLabelProvider {
	
	@Override
	public String getText(Object element) {

		if (element instanceof Constraint) {
			if (((Constraint) element).getDefinition() != null)
				return ((Constraint) element).getDefinition().getName();			
		}			
			
		return super.getText(element);
	}

}
