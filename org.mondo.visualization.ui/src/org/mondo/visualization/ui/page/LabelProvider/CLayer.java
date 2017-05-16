package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.AdditionalLayer;
import graphic_representation.DefaultLayer;
import graphic_representation.Layer;

import org.eclipse.jface.viewers.ColumnLabelProvider;

public class CLayer extends ColumnLabelProvider{

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		if (element instanceof Layer) 
		{
			if(element instanceof DefaultLayer)
				return "Default Layer: " + ((Layer)element).getName();
			if(element instanceof AdditionalLayer)
				return "Additional Layer: " + ((Layer)element).getName();			
		}
		return null;
	}	
	
	

}
