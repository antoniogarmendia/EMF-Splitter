package org.uam.eps.modular.scope.wizard.def.reference;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import ScopeDefinition.ScopeRule;

public class ReferenceColumnLabelProvider extends ColumnLabelProvider {
	
	@Override
	public String getText(Object element) {
		
		if (element instanceof ScopeRule) {
			return ((ScopeRule) element).getEReference().getName();
		}
		
		return super.getText(element);
	}

}
