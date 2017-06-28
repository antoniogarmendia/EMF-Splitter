package org.uam.eps.modular.visibility.wizard.def.visibility;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import visibility.Visibility;

public class VisibilityColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		if (element instanceof Visibility) {
			return ((Visibility) element).getVisibility().getLiteral();
		}
		
		return super.getText(element);
	}

}
