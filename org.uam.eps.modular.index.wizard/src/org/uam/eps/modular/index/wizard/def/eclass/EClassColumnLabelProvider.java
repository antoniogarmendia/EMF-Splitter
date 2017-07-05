package org.uam.eps.modular.index.wizard.def.eclass;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import index.Index;

public class EClassColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		if(element instanceof Index)
			return ((Index) element).getEClass().getName();
		
		return super.getText(element);
	}

}
