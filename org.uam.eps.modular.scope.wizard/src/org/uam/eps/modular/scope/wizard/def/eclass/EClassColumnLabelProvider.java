package org.uam.eps.modular.scope.wizard.def.eclass;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import ScopeDefinition.ScopeRule;

public class EClassColumnLabelProvider extends ColumnLabelProvider {
	
	@Override
	public String getText(Object element) {
		
		if (element instanceof ScopeRule)
			return ((ScopeRule) element).getEClass().getName();
		
		return super.getText(element);
	}

}
