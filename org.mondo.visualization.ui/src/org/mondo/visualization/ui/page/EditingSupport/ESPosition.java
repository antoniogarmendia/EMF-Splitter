package org.mondo.visualization.ui.page.EditingSupport;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;

import graphic_representation.LabelEAttribute;
import graphic_representation.LabelPosition;

public class ESPosition extends EditingSupport {

	private  ComboBoxCellEditor cell_Editor;
	
	public ESPosition(ColumnViewer viewer) {
		super(viewer);
		// TODO Auto-generated constructor stub
		cell_Editor = new ComboBoxCellEditor((Composite) getViewer().getControl(),GetLabelPositionName().toArray(new String[0]));
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		// TODO Auto-generated method stub
		return cell_Editor;
	}

	@Override
	protected boolean canEdit(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof LabelEAttribute)
			return true;
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof LabelEAttribute)
			return GetLabelPositionName().indexOf(((LabelEAttribute) element).getLabelPosition().getName());
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		// TODO Auto-generated method stub
		if(element instanceof LabelEAttribute)
			((LabelEAttribute) element).setLabelPosition(LabelPosition.get((Integer)value));
		getViewer().update(element, null);
	}
	
	public static List<String> GetLabelPositionName()
	{
		List<String> result = new ArrayList<String>();
		LabelPosition[] position = LabelPosition.values();
		for (LabelPosition pos : position) {
			result.add(pos.getName());
		}
		return result;
	}

}
