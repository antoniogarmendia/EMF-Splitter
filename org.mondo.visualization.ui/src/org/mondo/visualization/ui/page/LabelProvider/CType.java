package org.mondo.visualization.ui.page.LabelProvider;


import graphic_representation.Node;
import graphic_representation.Root;
import graphic_representation.impl.EdgeImpl;

import org.eclipse.jface.viewers.ColumnLabelProvider;

public class CType extends ColumnLabelProvider{
	
	private final String type = "";	
		
	public CType() {
		super();
		// TODO Auto-generated constructor stub		
	}

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof Root)
			return "Node";
		if(element instanceof Node)
			return "Node";
		if(element instanceof EdgeImpl)
			return "Edge";		
		return type;
	}		

}
