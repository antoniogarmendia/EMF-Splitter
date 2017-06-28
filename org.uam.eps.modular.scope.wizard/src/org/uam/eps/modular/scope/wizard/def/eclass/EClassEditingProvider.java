package org.uam.eps.modular.scope.wizard.def.eclass;

import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.uam.eps.modular.scope.wizard.def.ScopeDefinitionPage;

import ScopeDefinition.ScopeRule;

public class EClassEditingProvider extends EditingSupport {

	private DialogCellEditor dialogSelectEClass;
	private EList<EClass> eListClasses;
	
	public EClassEditingProvider(ColumnViewer viewer, EList<EClass> eList) {
		
		super(viewer);
		this.eListClasses = eList;		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		this.dialogSelectEClass = new DialogCellEditor((Composite) getViewer().getControl()) {

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
		
		return dialogSelectEClass;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {

		if (element instanceof ScopeRule) {
			return ((ScopeRule) element).getEClass().getName();
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if (element != null) {
			
			if (element instanceof ScopeRule) {
				
				if (value instanceof EClass) {
					
					Random randomGenerator = new Random();
					((ScopeRule) element).setEClass((EClass) value);
					EList<EReference> listReferences = ScopeDefinitionPage.getNoNContainmentReferences((EClass) value);
					((ScopeRule) element).setEReference(listReferences.get(randomGenerator.nextInt(listReferences.size())));					
					getViewer().update(element, null);
				}				
			}			
		}		
	}

}
