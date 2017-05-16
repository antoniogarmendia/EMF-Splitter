package org.mondo.visualization.ui.page.LabelProvider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import graphic_representation.Border;
import graphic_representation.Color;
import graphic_representation.ConditionalStyle;
import graphic_representation.Node;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.SiriusSystemColors;

public class CBorderColor extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node) element).getNode_shape();
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();	
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		if(sh instanceof Border)
		{
			Color color =  ((Border) sh).getBorderColor();
			if(color instanceof SiriusSystemColors)
				return ((SiriusSystemColors) color).getName();
		}
		
		return "";
	}
	
}
