package org.uam.eps.modular.constraints.dialog.def.message;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import constraints.Constraint;

public class MessageEditingProvider extends EditingSupport {

	private DialogCellEditor dialogConstraint;
	
	public MessageEditingProvider(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {

		this.dialogConstraint = new DialogCellEditor() {

			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				cellEditorWindow.getShell().setText("Add/Update Error Message");			
				
				if (element instanceof Constraint) {
					
					String errorMessage = ((Constraint) element).getErrorMessage();
					if (errorMessage == null)
						errorMessage = "";
							
					MessageDialog dialog = new MessageDialog(cellEditorWindow.getShell(), errorMessage);
						
					if (dialog.open() == Dialog.OK) {
						
						return dialog.getErrorMessage();
					}
				}
				
				return null;
			}			
			
		};		
		
		dialogConstraint.create((Composite) getViewer().getControl());
		return dialogConstraint;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {

		if (element instanceof Constraint) {
			return ((Constraint) element).getErrorMessage();
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if (element instanceof Constraint && value instanceof String) {
			((Constraint) element).setErrorMessage((String) value);
			getViewer().update(element, null);
		}
	}

}
