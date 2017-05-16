package org.mondo.visualization.ui.page.EditingSupport;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.sirius.diagram.LineStyle;
import org.eclipse.swt.widgets.Composite;

import graphic_representation.Border;
import graphic_representation.ConditionalStyle;
import graphic_representation.Edge;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Root;
import graphic_representation.Shape;

public class ESBorderStyle extends EditingSupport {

	private ComboBoxCellEditor cell_Editor;
	
	public ESBorderStyle(ColumnViewer viewer) {
		
		super(viewer);		
		cell_Editor = new ComboBoxCellEditor((Composite) getViewer().getControl(),GetLineStyleName().toArray(new String[0]));
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
		
		if(sh instanceof Border)
			return true;
		
		if(element instanceof Edge)
			return true;
		
		if(element instanceof PaletteDescriptionLink)
			return true;
		
		return false;		
	}

	@Override
	protected Object getValue(Object element) {
		
		Shape sh = null;
		if(element instanceof Node)
		 sh = ((Node) element).getNode_shape();
		else if(element instanceof Root)
		 sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		if(sh instanceof Border)
			return GetLineStyleName().indexOf(((Border) sh).getBorderStyle());
		
		if(element instanceof Edge)
			return GetLineStyleName().indexOf(((Edge) element).getEdge_style().getLineStyle());
		
		if(element instanceof PaletteDescriptionLink)
			return GetLineStyleName().indexOf(((PaletteDescriptionLink) element).getLineStyle());
				
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node) element).getNode_shape();
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		if(sh instanceof Border)
			 ((Border) sh).setBorderStyle(GetLineStyleName().get((Integer)value));
		
		if(element instanceof Edge)
			((Edge) element).getEdge_style().setLineStyle(GetLineStyleName().get((Integer)value));
		
		if(element instanceof PaletteDescriptionLink)
			((PaletteDescriptionLink) element).setLineStyle(GetLineStyleName().get((Integer)value));
		
		getViewer().update(element, null);
	}
	
	public static List<String> GetLineStyleName()
	{
		List<String> result = new ArrayList<String>();
		LineStyle[] styles = LineStyle.values();
		for (LineStyle style : styles) {
			result.add(style.getName());
		}
		return result;		
	}

}
