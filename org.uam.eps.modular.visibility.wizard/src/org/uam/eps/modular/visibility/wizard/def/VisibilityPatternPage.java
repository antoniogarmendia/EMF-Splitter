package org.uam.eps.modular.visibility.wizard.def;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class VisibilityPatternPage extends WizardPage {
	
	final public static Image imageVisibilityPattern = AbstractUIPlugin.imageDescriptorFromPlugin
			("org.uam.eps.modular.visibility.wizard", "/icons/visibilityPattern.gif").createImage();
	
	public VisibilityPatternPage(String pageName) {
		
		super(pageName);
		setTitle("Define Visibility");
		setDescription("Vsibility Pattern");
	}

	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent,SWT.NONE);
		container.setLayout(new GridLayout());
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				
		Label labelImage = new Label(container, SWT.CENTER);
		labelImage.setImage(imageVisibilityPattern);
		GridData gridImage = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridImage.widthHint = 200;
		gridImage.heightHint = 270;
		labelImage.setLayoutData(gridImage);		
		
		setControl(container);
		setPageComplete(true);
	}

}
