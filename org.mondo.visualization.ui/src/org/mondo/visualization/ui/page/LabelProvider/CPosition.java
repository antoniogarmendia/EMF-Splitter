package org.mondo.visualization.ui.page.LabelProvider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import graphic_representation.LabelEAttribute;

public class CPosition extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof LabelEAttribute)
			return ((LabelEAttribute) element).getLabelPosition().getName();
		return "";
	}

}
