package org.uam.eps.modular.constraints.dialog.def.eclass;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import constraints.Constraint;

public class EClassColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		if (element instanceof Constraint) {
			
			EClass eClass = ((Constraint) element).getEClass();
			if (eClass != null)			
				return ((Constraint) element).getEClass().getName();
			else
				return "";
		}
		
		return super.getText(element);
	}
}
