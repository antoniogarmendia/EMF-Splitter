package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.ConditionalStyle;
import graphic_representation.Ellipse;
import graphic_representation.Node;
import graphic_representation.Rectangle;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.ShapeCompartmentParallelogram;

import org.eclipse.jface.viewers.ColumnLabelProvider;

public class CHeight extends ColumnLabelProvider{

	public CHeight() {
		
		super();		
	}

	@Override
	public String getText(Object element) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node)element).getNode_shape();			
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
			
		return GetHeightTextShape(sh);
	}
	
	public String GetHeightTextShape(Shape shape)
	{
		if(shape instanceof Rectangle)
			return ((Rectangle)shape).getHeight().toString();
		if(shape instanceof Ellipse)
			return ((Ellipse)shape).getHorizontalDiameter().toString();
		if(shape instanceof ShapeCompartmentGradient)
			return ((ShapeCompartmentGradient)shape).getHeight().toString();
		if(shape instanceof ShapeCompartmentParallelogram)
			return ((ShapeCompartmentParallelogram)shape).getHeight().toString();
		return "";
	}
	
}
