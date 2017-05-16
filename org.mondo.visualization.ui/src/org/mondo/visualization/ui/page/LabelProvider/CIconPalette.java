package org.mondo.visualization.ui.page.LabelProvider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import graphic_representation.DiagramElement;


public class CIconPalette extends ColumnLabelProvider{

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof DiagramElement)
			return ((DiagramElement) element).getDiag_palette().getIcon_filepath();
		return "";
	}

}
