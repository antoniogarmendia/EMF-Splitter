package org.uam.eps.modular.scope.wizard.def.reference;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;
import org.uam.eps.modular.scope.wizard.def.ScopeDefinitionPage;

import ScopeDefinition.ScopeRule;

public class ReferenceEditingProvider extends EditingSupport {

	private EList<EReference> currentReferences;
	private ComboBoxCellEditor cellEditor;
	private List<String> stringsOfreferences;
	
	public ReferenceEditingProvider(ColumnViewer viewer) {
		
		super(viewer);				
	}
	
	public void initGetNameOfReferences() {
		
		this.stringsOfreferences = new LinkedList<String>();
		Iterator<EReference> itReferences = currentReferences.iterator();
		while (itReferences.hasNext()) {
			EReference eReference = (EReference) itReferences.next();
			stringsOfreferences.add(eReference.getName());
		}		
	}
	
	@Override
	protected CellEditor getCellEditor(Object element) {
		
		if (element instanceof ScopeRule) {
			this.currentReferences = ScopeDefinitionPage.getNoNContainmentReferences(((ScopeRule) element).getEClass());
			initGetNameOfReferences();
		}	
		
		this.cellEditor = new ComboBoxCellEditor((Composite) getViewer().getControl(),stringsOfreferences.toArray(new String[stringsOfreferences.size()]));		
		return this.cellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof ScopeRule) {
			
			return stringsOfreferences.indexOf(((ScopeRule) element).getEReference().getName());			
		}
		
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if (element instanceof ScopeRule) {
			
			ScopeRule rule = (ScopeRule) element;
			Integer index = (Integer) value;
			rule.setEReference(currentReferences.get(index));
			getViewer().update(element, null);
		}
	}

}
