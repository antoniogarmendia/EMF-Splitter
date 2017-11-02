package org.uam.eps.modular.constraints.dialog.def.context.eclass;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import constraints.Constraint;

public class EClassEditingProvider extends EditingSupport {

	private DialogCellEditor dialogSelectEClass; 
	private EList<EClass> eListClasses;
	private static final String notDefined = "-Not defined-";
	
	public EClassEditingProvider(ColumnViewer viewer, EList<EClass> eList) {
		
		super(viewer);
		this.eListClasses = eList;		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		this.dialogSelectEClass = new DialogCellEditor() {
			
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				boolean isContextDefined = false;
				if (element instanceof Constraint) {
					EClass eClass =  ((Constraint) element).getEClass();
					if (eClass != null)
						isContextDefined = true;
				}
				
				ContextElementListDialog dialog = new ContextElementListDialog(cellEditorWindow.getShell(),
						new EClassLabelProvider(),isContextDefined);
				dialog.setTitle("Select the Class");
				dialog.setMessage("Select a String (* = any string, ? = any char):");
				dialog.setElements(eListClasses.toArray());				
				if (dialog.open() == Dialog.OK) {
					
					if (dialog.isContextDefined() == false) {
						return "-Not defined-";
					}	
					
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
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		
		if (element instanceof Constraint) {
			EClass eClass =  ((Constraint) element).getEClass();
			if (eClass != null) {
				System.out.println("paso por aqui1");
				System.out.println(eClass.getName());
				return eClass.getName();				
			}
			else
				return "-Not defined-";
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
				} else if (value instanceof String) {
					String strValue = (String) value;
					if (strValue.equals(notDefined)) {
						((Constraint) element).setEClass(null);
						getViewer().update(element, null);
					}
				}			
			}			
		}		
	}

}
