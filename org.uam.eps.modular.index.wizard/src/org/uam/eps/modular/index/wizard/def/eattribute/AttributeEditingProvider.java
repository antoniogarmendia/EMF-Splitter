package org.uam.eps.modular.index.wizard.def.eattribute;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;
import index.Index;

public class AttributeEditingProvider extends EditingSupport {

	private ComboBoxCellEditor cellEditor;	
	
	public AttributeEditingProvider(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		if (element instanceof Index) {
			List<String> items = getStringEAttributes(((Index) element).getEClass());
			this.cellEditor = new ComboBoxCellEditor((Composite) getViewer().getControl(), items.toArray(new String[items.size()]));
		}
		return this.cellEditor;
	}

	private List<String> getStringEAttributes(EClass eClass) {
		
		List<String> items = new LinkedList<String>();
		Iterator<EAttribute> itEAttributs = eClass.getEAllAttributes().iterator();
		while (itEAttributs.hasNext()) {
			EAttribute eAttribute = (EAttribute) itEAttributs.next();
			items.add(eAttribute.getName());
		}
		return items;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof Index) {
			return getStringEAttributes(((Index) element).getEClass()).indexOf(((Index) element).getEAttribute().getName());
		}
		
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if (element instanceof Index) {
			
			Index indexAttribute = (Index) element;
			Integer index = (Integer) value;
			indexAttribute.setEAttribute(((Index) element).getEClass().getEAllAttributes().get(index));
			getViewer().update(element, null);			
		}
	}

}
