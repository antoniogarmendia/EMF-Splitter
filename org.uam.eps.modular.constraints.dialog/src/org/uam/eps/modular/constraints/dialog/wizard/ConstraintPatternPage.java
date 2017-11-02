package org.uam.eps.modular.constraints.dialog.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ConstraintPatternPage extends WizardPage{

	final public static Image imageConstraintPattern = AbstractUIPlugin.imageDescriptorFromPlugin
			("org.uam.eps.modular.constraints.dialog", "/icons/constraintPattern.gif").createImage();
	
	protected ConstraintPatternPage(String pageName) {
		
		super(pageName);	
		setTitle("Define Constraints");
		setDescription("Constraint Pattern");
	}

	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.CENTER);
		container.setLayout(new GridLayout());
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				
		Label labelImage = new Label(container, SWT.CENTER);
		labelImage.setImage(imageConstraintPattern);
		GridData gridImage = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridImage.widthHint = 200;
		gridImage.heightHint = 280;
		labelImage.setLayoutData(gridImage);		
		
		setControl(container);
		setPageComplete(true);		
	}
	
}
