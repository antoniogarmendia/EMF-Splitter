package org.uam.eps.modular.scope.wizard.def.scope;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import ScopeDefinition.ScopeRule;

public class ScopeColumnLabelProvider extends ColumnLabelProvider {
	
	@Override
	public String getText(Object element) {
		
		if (element instanceof ScopeRule) {
			return ((ScopeRule) element).getScopeDefinition().getLiteral();
		}		
		return super.getText(element);
	}

}
