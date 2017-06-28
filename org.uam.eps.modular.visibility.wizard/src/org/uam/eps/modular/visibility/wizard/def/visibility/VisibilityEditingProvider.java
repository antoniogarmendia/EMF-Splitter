package org.uam.eps.modular.visibility.wizard.def.visibility;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;

import visibility.Visibility;
import visibility.VisibilityDefinition;

public class VisibilityEditingProvider extends EditingSupport {
	
	private ComboBoxCellEditor cellEditor;
	private List<String> listOfEnum;

	public VisibilityEditingProvider(ColumnViewer viewer) {
		
		super(viewer);		
		listOfEnum = getArrayofStringVisibility();
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		cellEditor = new ComboBoxCellEditor((Composite) getViewer().getControl(),
				listOfEnum.toArray(new String[listOfEnum.size()]));
		return cellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof Visibility) {
			
			return listOfEnum.indexOf(((Visibility) element).getVisibility().getLiteral());
		}		
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if (element instanceof Visibility) {
			
			Visibility visibility = (Visibility) element;
			Integer index = (Integer) value;
			visibility.setVisibility(VisibilityDefinition.get(index));
			getViewer().update(element, null);
		}		
	}
	
	private List<String> getArrayofStringVisibility() {
		
		List<String> stringOfValues = new ArrayList<String>();
		VisibilityDefinition[] visibilityArray = VisibilityDefinition.values();
		for (VisibilityDefinition visibilityDefinition : visibilityArray) {
			stringOfValues.add(visibilityDefinition.getLiteral());
		}		
		return stringOfValues;
	}

}
