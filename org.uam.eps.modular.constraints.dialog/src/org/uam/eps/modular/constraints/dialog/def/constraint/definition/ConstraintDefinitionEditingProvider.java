package org.uam.eps.modular.constraints.dialog.def.constraint.definition;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;

import constraints.Constraint;
import constraints.ConstraintDefinition;

public class ConstraintDefinitionEditingProvider extends EditingSupport {

	private ComboBoxCellEditor cellEditor;
	private EList<EClass> eListClasses;
	
	public ConstraintDefinitionEditingProvider(ColumnViewer viewer, EList<EClass> eList) {
		super(viewer);			
		this.eListClasses = eList;
	}	

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		this.cellEditor = new ComboBoxCellEditor((Composite) getViewer().getControl(),getListConstraintDefinition().toArray(new String[0]));				
		
		return this.cellEditor;
	}
	
	private List<String> getListConstraintDefinition() {
		
		List<String> strings = new LinkedList<String>();
		ConstraintDefinition[] constraints = ConstraintDefinition.values();
		for (int i = 0; i < constraints.length; i++) {
			ConstraintDefinition constraintDefinition = constraints[i];
			strings.add(constraintDefinition.getName());
		}		
		return strings;	
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof Constraint) {
			if (((Constraint) element).getDefinition() != null) {
				
				return getListConstraintDefinition().indexOf(((Constraint) element).getDefinition().getName());				
			}
		}
		return null;	
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if (element instanceof Constraint) {
			
			Constraint constraint = (Constraint) element;
			Integer index = (Integer) value;
			ConstraintDefinition constraintDef = ConstraintDefinition.get(index);
			if (constraintDef.equals(ConstraintDefinition.GLOBAL) || 
				  constraintDef.equals(ConstraintDefinition.SAME_ROOT_PACKAGE))
				constraint.setEClass(null);
			else {
				if (constraint.getEClass() == null) {
					Random randomGenerator = new Random();
					constraint.setEClass(this.eListClasses.
	            			get(randomGenerator.nextInt(this.eListClasses.size()))); 
				}
			}
			
			constraint.setDefinition(constraintDef);
			getViewer().update(element, null);
		}			
	}

}
