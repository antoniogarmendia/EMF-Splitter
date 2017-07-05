package org.uam.eps.modular.index.wizard.def.eattribute;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import index.Index;

public class AttributeColumnLabelProvider extends ColumnLabelProvider {
	
	@Override
	public String getText(Object element) {
		
		if(element instanceof Index)
			return ((Index) element).getEAttribute().getName();
		
		return super.getText(element);
	}

}
