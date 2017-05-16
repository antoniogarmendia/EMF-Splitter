package org.mondo.visualization.ui.page.LabelProvider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import graphic_representation.Border;
import graphic_representation.ConditionalStyle;
import graphic_representation.Node;
import graphic_representation.Root;
import graphic_representation.Shape;

public class CBorderWidth extends ColumnLabelProvider {
	
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
			return ((Border) sh).getBorderWidth();
		
		return "";
	}

}
