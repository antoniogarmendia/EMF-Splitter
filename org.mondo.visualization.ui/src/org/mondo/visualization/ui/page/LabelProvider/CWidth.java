package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.ConditionalStyle;
import graphic_representation.Diamond;
import graphic_representation.Edge;
import graphic_representation.Ellipse;
import graphic_representation.Node;
import graphic_representation.Note;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Rectangle;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.ShapeCompartmentParallelogram;

import org.eclipse.jface.viewers.ColumnLabelProvider;

public class CWidth extends ColumnLabelProvider{

	public CWidth() {		
		super();		
	}

	@Override
	public String getText(Object element) {
		
		Shape sh = null;
		if(element instanceof Node)
			 sh = ((Node)element).getNode_shape();
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if(element instanceof PaletteDescriptionLink)
			return ((PaletteDescriptionLink) element).getLineWidth();
		else if(element instanceof Edge)
			return ((Edge) element).getEdge_style().getLineWidth();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		return GetTextWidthShape(sh);
	}	
	
	public String GetTextWidthShape(Shape shape)
	{
		if(shape instanceof Rectangle)
			return ((Rectangle)shape).getWidth().toString();
		if(shape instanceof Ellipse)
			return ((Ellipse)shape).getVerticalDiameter().toString();
		if(shape instanceof ShapeCompartmentGradient)
			return ((ShapeCompartmentGradient)shape).getWidth().toString();
		if(shape instanceof ShapeCompartmentParallelogram)
			return ((ShapeCompartmentParallelogram)shape).getWidth().toString();
		if(shape instanceof Diamond)
			return ((Diamond)shape).getSize().toString();
		if(shape instanceof Note)
			return ((Note)shape).getSize().toString();
		
		return "";
	}
	
}
