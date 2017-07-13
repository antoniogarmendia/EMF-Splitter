package org.uam.eps.modular.constraints.dialog.def.local;

import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;

import constraints.Constraint;

public class LocalEditingProvider extends EditingSupport {

	private EList<EClass> eList;
	
	public LocalEditingProvider(ColumnViewer viewer, EList<EClass> eList) {
		
		super(viewer);		
		this.eList = eList;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		return new CheckboxCellEditor((Composite) getViewer().getControl());
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof Constraint) {
			if (((Constraint) element).getEClass() == null)
				return false;
			else
				return true;
		}
		return null;	
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if (element instanceof Constraint) {
			
			Constraint cons = (Constraint) element;
			if (value instanceof Boolean) {
				
				Boolean v = (Boolean) value;				
				if (v == false) {
					cons.setEClass(null);
				} else {
					Random randomGenerator = new Random();
					cons.setEClass(eList.
	            			get(randomGenerator.nextInt(eList.size())));
				}	
				getViewer().update(element, null);
			}			
		}	
	}

}
