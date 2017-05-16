package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.Color;
import graphic_representation.ConditionalStyle;
import graphic_representation.Edge;
import graphic_representation.Edge_Style;
import graphic_representation.LabelEAttribute;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.ShapeColor;
import graphic_representation.SiriusSystemColors;

import org.eclipse.jface.viewers.ColumnLabelProvider;

public class CColor extends ColumnLabelProvider{
	
	public CColor() {
		
		super();		
	}

	@Override
	public String getText(Object element) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node)element).getNode_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		else if(element instanceof Edge)
		{
			Edge_Style edgStyle = ((Edge)element).getEdge_style();
			Color color = edgStyle.getColor();
				if(color instanceof SiriusSystemColors)
					return ((SiriusSystemColors) color).getName();			
		}
		else if(element instanceof Root)
			sh = ((Root)element).getRoot_shape();
		else if(element instanceof LabelEAttribute)
			return ((LabelEAttribute) element).getColor() instanceof SiriusSystemColors? 
					((SiriusSystemColors)((LabelEAttribute) element).getColor()).getName(): "";
					else if(element instanceof PaletteDescriptionLink)
					{
						Color color = ((PaletteDescriptionLink) element).getColor();
						if(color instanceof SiriusSystemColors)
							return ((SiriusSystemColors) color).getName();	
					}				
					
		return getColorShape(sh);
	}	
	
	public String getColorShape(Shape shape)
	{
		if(shape instanceof ShapeColor)
		{
			Color color = ((ShapeColor) shape).getColor();			
			if(color instanceof SiriusSystemColors)
				return ((SiriusSystemColors) color).getName();
		}		
		return "";		
	}
}
