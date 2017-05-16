package org.mondo.visualization.ui.page.EditingSupport;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;

import graphic_representation.Border;
import graphic_representation.Color;
import graphic_representation.ConditionalStyle;
import graphic_representation.Node;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.SiriusSystemColors;

public class ESBorderColor extends EditingSupport {

	private ComboBoxCellEditor cell_Editor;	
	
	public ESBorderColor(ColumnViewer viewer) {
		
		super(viewer);		
		cell_Editor = new ComboBoxCellEditor((Composite) getViewer().getControl(),ESColor.GetColorsName().toArray(new String[0]));
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
		else if (element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		if(sh instanceof Border)
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
		{
			Color color = ((Border) sh).getBorderColor();
			if(color instanceof SiriusSystemColors)
				return ESColor.GetColorsName().indexOf(((SiriusSystemColors) color).getName());
		}
		
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
		{
			Color color = ((Border) sh).getBorderColor();
			if(color instanceof SiriusSystemColors)
				((SiriusSystemColors) color).setName(ESColor.GetColorsName().get((Integer)value));				
		}
		getViewer().update(element, null);
	}

}
