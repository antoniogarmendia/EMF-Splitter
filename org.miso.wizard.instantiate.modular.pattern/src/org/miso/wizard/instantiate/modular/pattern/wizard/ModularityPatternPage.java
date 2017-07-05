package org.miso.wizard.instantiate.modular.pattern.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ModularityPatternPage extends WizardPage {

	final public static Image imageModularityPattern = AbstractUIPlugin.imageDescriptorFromPlugin
			("org.miso.wizard.instantiate.modular.pattern", "/icons/modularityPattern.gif").createImage();
	
	protected ModularityPatternPage(String pageName) {
		
		super(pageName);
		setTitle("Define Modular");
		setDescription("Modularity Pattern");
	}

	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.CENTER);
		container.setLayout(new GridLayout());
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				
		Label labelImage = new Label(container, SWT.CENTER);
		labelImage.setImage(imageModularityPattern);
		GridData gridImage = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridImage.widthHint = 500;
		gridImage.heightHint = 500;
		labelImage.setLayoutData(gridImage);		
		
		setControl(container);
		setPageComplete(true);
	}

}
