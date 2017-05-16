package org.mondo.visualization.ui.page.EditingSupport;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

import graphic_representation.Layer;

public class ESEClass extends EditingSupport{

	public ESEClass(ColumnViewer viewer) {
		super(viewer);
				
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
			
		return new TextCellEditor((Composite) getViewer().getControl());
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if(element instanceof Layer)
			return true;
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		if(element instanceof Layer)
			return ((Layer)element).getName();	
		return true;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if(element instanceof Layer)
			((Layer)element).setName((String)value);
		getViewer().update(element, null);		
	}	
	
}
