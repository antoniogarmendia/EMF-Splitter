package org.mondo.miso.table.ui.wizard.pages.labelProvider;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ColumnLabelProvider;

import graphic_representation.LineGroup;

public class CFeatureColumn extends ColumnLabelProvider{

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof LineGroup)
			return "Line.".concat(((LineGroup) element).getFeatureReference().getName());
		if(element instanceof EClass)
			return ((EClass) element).getName();
		if(element instanceof EAttribute)
			return ((EAttribute) element).getName();
		return super.getText(element);
	}

	

}
