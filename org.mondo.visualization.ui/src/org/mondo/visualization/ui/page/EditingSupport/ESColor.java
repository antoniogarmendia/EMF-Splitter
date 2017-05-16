package org.mondo.visualization.ui.page.EditingSupport;

import graphic_representation.Color;
import graphic_representation.ConditionalStyle;
import graphic_representation.Edge;
import graphic_representation.Edge_Style;
import graphic_representation.IconElement;
import graphic_representation.LabelEAttribute;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.ShapeColor;
import graphic_representation.SiriusSystemColors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.eclipse.swt.widgets.Composite;

public class ESColor extends EditingSupport{
	
	private ComboBoxCellEditor cell_Editor;

	public ESColor(ColumnViewer viewer) {
		
		super(viewer);		
		cell_Editor = new ComboBoxCellEditor((Composite) getViewer().getControl(),GetColorsName().toArray(new String[0]));
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		return cell_Editor;
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
		if(element instanceof Object[])
			return false;
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if(element instanceof Node) {
			Node nod = (Node)element;
			Shape sh = nod.getNode_shape();
			if(sh instanceof ShapeColor)
			{
				Color color = ((ShapeColor) sh).getColor();
				if(color instanceof SiriusSystemColors)
					return GetColorsName().indexOf(((SiriusSystemColors) color).getName());
			}
		} else if (element instanceof ConditionalStyle){
			
			Shape sh = ((ConditionalStyle) element).getConditionalStyle();
			if(sh instanceof ShapeColor) {
				
				Color color = ((ShapeColor) sh).getColor();
				if(color instanceof SiriusSystemColors)
					return GetColorsName().indexOf(((SiriusSystemColors) color).getName());
			}
		}
		
		if(element instanceof Root)
		{
			Root root = (Root)element;
			Shape sh = root.getRoot_shape();
			if(sh instanceof ShapeColor)
			{
				Color color = ((ShapeColor) sh).getColor();
				if(color instanceof SiriusSystemColors)
					return GetColorsName().indexOf(((SiriusSystemColors) color).getName());
			}
		}
		if(element instanceof Edge)
		{
			Edge edg = (Edge)element;
			Edge_Style sh = edg.getEdge_style();
			if(sh instanceof ShapeColor)
			{
				Color color = sh.getColor();
				if(color instanceof SiriusSystemColors)
					return GetColorsName().indexOf(((SiriusSystemColors) color).getName());
			}
		}
		
		if(element instanceof PaletteDescriptionLink)
		{
			Color color = ((PaletteDescriptionLink) element).getColor();
			if(color instanceof SiriusSystemColors)
				return GetColorsName().indexOf(((SiriusSystemColors) color).getName());	
		}	
			
		if(element instanceof LabelEAttribute)
		{
			Color color = ((LabelEAttribute) element).getColor();
			if(color instanceof SiriusSystemColors)
				return GetColorsName().indexOf(((SiriusSystemColors) color).getName());
		}
		return 0;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if(element instanceof Node)
		{
			Node nod = (Node)element;
			Shape sh = nod.getNode_shape();
			
			if(sh instanceof ShapeColor)
			{
				Color color = ((ShapeColor) sh).getColor();
				if(color instanceof SiriusSystemColors)
					((SiriusSystemColors) color).setName(GetColorsName().get((Integer)value));
			}
				
		} else if (element instanceof ConditionalStyle) {
			
			Shape sh = ((ConditionalStyle) element).getConditionalStyle();
			if(sh instanceof ShapeColor) {
				
				Color color = ((ShapeColor) sh).getColor();
				if(color instanceof SiriusSystemColors)
					((SiriusSystemColors) color).setName(GetColorsName().get((Integer)value));
			}
		}		
		
		if(element instanceof Root)
		{
			Root root = (Root)element;
			Shape sh = root.getRoot_shape();
			
			if(sh instanceof ShapeColor)
			{
				Color color = ((ShapeColor) sh).getColor();
				if(color instanceof SiriusSystemColors)
					((SiriusSystemColors) color).setName(GetColorsName().get((Integer)value));
			}				
		}		
		if(element instanceof Edge)
		{
			Edge_Style sh = ((Edge) element).getEdge_style();
			Color color = sh.getColor();

			if(color instanceof SiriusSystemColors)
			{
				((SiriusSystemColors) color).setName(GetColorsName().get((Integer)value));
			}
			
		}
		
		if(element instanceof PaletteDescriptionLink)
		{
			Color color = ((PaletteDescriptionLink) element).getColor();
			if(color instanceof SiriusSystemColors)
				((SiriusSystemColors) color).setName(GetColorsName().get((Integer)value));	
		}
		
		if(element instanceof LabelEAttribute)
		{
			Color color = ((LabelEAttribute) element).getColor();
			if(color instanceof SiriusSystemColors)
				((SiriusSystemColors) color).setName(GetColorsName().get((Integer)value));			
		}
		getViewer().update(element, null);
	}
	
	public static List<String> GetColorsName()
	{
		List<String> result = new ArrayList<String>();
		SystemColors[] colors = SystemColors.values();		
		for (SystemColors systemColors : colors) 
			result.add(systemColors.getName());
		return result;		
	}

}
