package org.uam.eps.modular.visibility.wizard.def.expression;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import visibility.Visibility;

public class ExpressionEditingProvider extends EditingSupport {

	private DialogCellEditor cellEditor;
	
	public ExpressionEditingProvider(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		this.cellEditor = new DialogCellEditor((Composite) getViewer().getControl(), SWT.BORDER){

			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				if (element instanceof Visibility) {
					
					String expression = ((Visibility) element).getExpression();
					ExpressionDialog dialog = new ExpressionDialog(cellEditorWindow.getShell(), expression);
					
					if (dialog.open() == Dialog.OK) {
						
						return dialog.getExpression();
					}							
				}
				return null;
				
			}			
		};		
		
		return this.cellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {

		if (element instanceof Visibility)
			return ((Visibility) element).getExpression();		
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if (element instanceof Visibility) {
			String newValue = (String) value;
			((Visibility) element).setExpression(newValue);
			getViewer().update(element, null);
		}
	}

}
