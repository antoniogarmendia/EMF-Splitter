package org.uam.eps.modular.constraints.dialog.def.eclass;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import constraints.Constraint;

public class EClassEditingProvider extends EditingSupport {

	private DialogCellEditor dialogSelectEClass; 
	private EList<EClass> eListClasses;
	
	public EClassEditingProvider(ColumnViewer viewer, EList<EClass> eList) {
		
		super(viewer);
		this.eListClasses = eList;		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		this.dialogSelectEClass = new DialogCellEditor() {
			
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				ElementListSelectionDialog dialog = new ElementListSelectionDialog(cellEditorWindow.getShell(),
						new EClassLabelProvider());
				dialog.setTitle("Select the Class");
				dialog.setMessage("Select a String (* = any string, ? = any char):");
				dialog.setElements(eListClasses.toArray());
				
				if (dialog.open() == Dialog.OK) {
					
					return dialog.getFirstResult();
				}
				
				return null;
			}
		};

		dialogSelectEClass.create((Composite) getViewer().getControl());
		return dialogSelectEClass;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if (element instanceof Constraint) {
			
			EClass eClass = ((Constraint) element).getEClass();
			if (eClass == null)
				return false;			
		}	
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof Constraint) {
			EClass eClass =  ((Constraint) element).getEClass();
			if (eClass != null)
				return eClass.getName();
			else
				return "";
		}
		
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
				
		if (element != null) {
			
			if (element instanceof Constraint) {
				
				if (value instanceof EClass) {
					((Constraint) element).setEClass((EClass) value);
					getViewer().update(element, null);
				}			
			}			
		}		
	}

}
