package org.uam.eps.modular.visibility.wizard.def.expression;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import visibility.Visibility;

public class ExpressionColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		if (element instanceof Visibility) {
			return ((Visibility) element).getExpression();
		}			
		return super.getText(element);
	}

}
