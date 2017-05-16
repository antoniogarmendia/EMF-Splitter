package org.mondo.visualization.ui.page.EditingSupport;

import graphic_representation.ConditionalStyle;
import graphic_representation.Diamond;
import graphic_representation.Edge;
import graphic_representation.Edge_Direction;
import graphic_representation.Ellipse;
import graphic_representation.IconElement;
import graphic_representation.LabelEAttribute;
import graphic_representation.Link;
import graphic_representation.Node;
import graphic_representation.Note;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Rectangle;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.ShapeCompartmentParallelogram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

public class ESWidth extends EditingSupport{

	public ESWidth(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		return new TextCellEditor((Composite) getViewer().getControl());
	}

	@Override
	protected boolean canEdit(Object element) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node) element).getNode_shape();
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		if(sh instanceof IconElement)
			return false;
		if(element instanceof LabelEAttribute || element instanceof Object[])
			return false;
		if(element instanceof Link)
		{
			EObject parent = ((EObject) element).eContainer();
			if(parent instanceof Edge_Direction)
				return false;
				else
			return true;
		}
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node)element).getNode_shape();
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if(element instanceof Edge)
			return ((Edge) element).getEdge_style().getLineWidth();
		else if(element instanceof PaletteDescriptionLink)
			return ((PaletteDescriptionLink) element).getLineWidth();
		else if(element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		return this.GetTextWidth(sh);
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node)element).getNode_shape();
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
			
		if(sh instanceof Rectangle)
			((Rectangle)sh).setWidth(Integer.parseInt((String)value));
		else if(sh instanceof Ellipse)
			((Ellipse)sh).setVerticalDiameter(Integer.parseInt((String)value));
		else if(sh instanceof Diamond)
			((Diamond)sh).setSize(Integer.parseInt((String)value));
		else if(sh instanceof Note)
			((Note)sh).setSize(Integer.parseInt((String)value));
		else if(sh instanceof ShapeCompartmentGradient)
			((ShapeCompartmentGradient)sh).setWidth(Integer.parseInt((String)value));
		else if(sh instanceof ShapeCompartmentParallelogram)
			((ShapeCompartmentParallelogram)sh).setWidth(Integer.parseInt((String)value));
		else if(element instanceof PaletteDescriptionLink)
			((PaletteDescriptionLink) element).setLineWidth((String)value);
		else if(element instanceof Edge)
			((Edge) element).getEdge_style().setLineWidth((String)value);
				
		getViewer().update(element, null);
	}
	
	public String GetTextWidth(Shape shape)
	{
		if(shape instanceof Rectangle)
			return ((Rectangle)shape).getWidth().toString();
		if(shape instanceof Ellipse)
			return ((Ellipse)shape).getVerticalDiameter().toString();
		if(shape instanceof Diamond)
			return ((Diamond)shape).getSize().toString();
		if(shape instanceof Note)
			return ((Note)shape).getSize().toString();
		if(shape instanceof ShapeCompartmentGradient)
			return ((ShapeCompartmentGradient)shape).getWidth().toString();
		if(shape instanceof ShapeCompartmentParallelogram)
			return ((ShapeCompartmentParallelogram)shape).getWidth().toString();
		
		return "";
	}
	
	
}
