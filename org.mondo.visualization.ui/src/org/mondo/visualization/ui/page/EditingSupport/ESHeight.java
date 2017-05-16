package org.mondo.visualization.ui.page.EditingSupport;

import graphic_representation.ConditionalStyle;
import graphic_representation.Diamond;
import graphic_representation.Edge;
import graphic_representation.Ellipse;
import graphic_representation.IconElement;
import graphic_representation.LabelEAttribute;
import graphic_representation.Link;
import graphic_representation.Node;
import graphic_representation.Note;
import graphic_representation.Rectangle;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.ShapeCompartmentParallelogram;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

public class ESHeight extends EditingSupport{

	public ESHeight(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		return new TextCellEditor((Composite) getViewer().getControl());
	}

	@Override
	protected boolean canEdit(Object element) {
		
		Shape shape = null;
		if(element instanceof Node)
			shape = ((Node)element).getNode_shape();
		else if(element instanceof Root)	
			shape = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			shape = ((ConditionalStyle) element).getConditionalStyle();
			
		if(shape instanceof IconElement || shape instanceof Diamond || shape instanceof Note)
			return false;
		if(element instanceof Edge)
			return false;
		if(element instanceof LabelEAttribute || element instanceof Object[] || element instanceof Link)
			return false;
		return true;		
	}

	@Override
	protected Object getValue(Object element) {
		
		Shape sh =  null;
		if(element instanceof Node)
			sh = ((Node)element).getNode_shape();
		else if(element instanceof Root) 
			sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		return this.GetTextHeight(sh);		
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node)element).getNode_shape();
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if(element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
				
		if(sh instanceof Rectangle)
			((Rectangle)sh).setHeight(Integer.parseInt((String)value));
		else if(sh instanceof Ellipse)
			((Ellipse)sh).setHorizontalDiameter(Integer.parseInt((String)value));
		else if(sh instanceof ShapeCompartmentGradient)
			((ShapeCompartmentGradient)sh).setHeight(Integer.parseInt((String)value));
		else if(sh instanceof ShapeCompartmentParallelogram)
			((ShapeCompartmentParallelogram)sh).setHeight(Integer.parseInt((String)value));
				
		getViewer().update(element, null);
	}
	
	public String GetTextHeight(Shape shape)
	{
		if(shape instanceof Rectangle)
			return ((Rectangle)shape).getHeight().toString();
		else if(shape instanceof Ellipse)
			return ((Ellipse)shape).getHorizontalDiameter().toString();
		else if(shape instanceof ShapeCompartmentGradient)
			return ((ShapeCompartmentGradient)shape).getHeight().toString();
		else if(shape instanceof ShapeCompartmentParallelogram)
			return ((ShapeCompartmentParallelogram)shape).getHeight().toString();
		
		return "";
	}

}
