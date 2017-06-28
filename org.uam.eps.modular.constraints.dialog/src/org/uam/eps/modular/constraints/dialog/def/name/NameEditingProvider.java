package org.uam.eps.modular.constraints.dialog.def.name;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

import constraints.Constraint;

public class NameEditingProvider extends EditingSupport {

	public NameEditingProvider(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		return new TextCellEditor((Composite) getViewer().getControl());
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof Constraint) {
			return ((Constraint) element).getName();
		}		
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if (element instanceof Constraint && value instanceof String) {
			
			((Constraint) element).setName((String) value);
			getViewer().update(element, null);
		}
	}

}
