package org.uam.eps.miso.diagram.editor.mobile.view.LabelProvider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import mobile_server.diagram_editor.Diagram;

public class CNameDiagram extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof Diagram)
			return ((Diagram) element).getName();
		return super.getText(element);
	}	
	
}
