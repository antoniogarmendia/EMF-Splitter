package org.uam.eps.modular.scope.wizard.def.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;

import ScopeDefinition.ScopeDefinitionEnum;
import ScopeDefinition.ScopeRule;

public class ScopeEditingProvider extends EditingSupport {

	private ComboBoxCellEditor cellEditor;
	private List<String> listOfEnum;
	
	public ScopeEditingProvider(ColumnViewer viewer) {
		
		super(viewer);	
		this.listOfEnum = getArrayofStringScope();
	}

	private List<String> getArrayofStringScope() {
		
		List<String> stringOfValues = new ArrayList<String>();
		int size = ScopeDefinitionEnum.values().length;
		for (int i = 0; i < size; i++) {
			stringOfValues.add(ScopeDefinitionEnum.get(i).getLiteral());
		}				
		return stringOfValues;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		this.cellEditor = new ComboBoxCellEditor((Composite) getViewer().getControl(), listOfEnum.toArray(new String[listOfEnum.size()]));
		return this.cellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof ScopeRule) {
			
			return listOfEnum.indexOf(((ScopeRule) element).getScopeDefinition().getLiteral());
		}		
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
				
		if (element instanceof ScopeRule) {
			
			ScopeRule rule = (ScopeRule) element;
			Integer index = (Integer) value;
			rule.setScopeDefinition(ScopeDefinitionEnum.get(index));
			getViewer().update(element, null);
		}
	}
}
