package org.uam.eps.miso.diagram.editor.mobile.view.LabelProvider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import mobile_server.EcoreMD;
import mobile_server.Palette;

public class CNameMM extends ColumnLabelProvider{

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof EcoreMD)
			return ((EcoreMD) element).getName();
		if(element instanceof Palette)
			return ((Palette) element).getName();
		return super.getText(element);
	}	

}
