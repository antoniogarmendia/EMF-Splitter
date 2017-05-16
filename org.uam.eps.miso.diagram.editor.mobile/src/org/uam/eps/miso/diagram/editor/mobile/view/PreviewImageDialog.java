package org.uam.eps.miso.diagram.editor.mobile.view;

import java.io.ByteArrayInputStream;


import org.apache.commons.codec.binary.Base64;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;


import mobile_server.diagram_editor.Diagram;

public class PreviewImageDialog extends Dialog{

	private Diagram imageDiagram;
		
	public PreviewImageDialog(Shell parentShell, Diagram imageDiagram) {
		super(parentShell);
		this.imageDiagram = imageDiagram;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// TODO Auto-generated method stub
		Composite container = (Composite) super.createDialogArea(parent);
		
		Label label = new Label (container, SWT.BORDER);
		byte[] img = Base64.decodeBase64(imageDiagram.getPreviewImageString());
			
		ByteArrayInputStream streamImage = new ByteArrayInputStream(img);
		ImageData data = new ImageData(streamImage);
		Image image = new Image(getShell().getDisplay(), data);
		label.setImage(image);
				
		return container;
	}
	
	@Override
	protected void configureShell(Shell newShell) {
	    super.configureShell(newShell);
	    newShell.setText("Diagram");
	}

	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		// TODO Auto-generated method stub
		if(label.equals("Cancel"))
			return null;
		return super.createButton(parent, id, label, defaultButton);
	}	
}
