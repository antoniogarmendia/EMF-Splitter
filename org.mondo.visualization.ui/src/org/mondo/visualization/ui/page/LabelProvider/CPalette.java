package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.Node;
import graphic_representation.Edge;
import graphic_representation.PaletteDescriptionLink;

import org.eclipse.jface.viewers.ColumnLabelProvider;

public class CPalette  extends ColumnLabelProvider{

	private static final String palette = "";
	
	public CPalette() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof Node)
			return ((Node)element).getDiag_palette().getPalette_name();
		if(element instanceof Edge)
			return ((Edge)element).getDiag_palette().getPalette_name();
		if(element instanceof PaletteDescriptionLink)			
				return ((PaletteDescriptionLink)element).getPalette_name();
		return palette;
	}

}
