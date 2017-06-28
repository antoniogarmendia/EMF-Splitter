package org.uam.eps.modular.scope.wizard.def;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ScopePatternPage extends WizardPage{

	final public static Image imageScopePattern = AbstractUIPlugin.imageDescriptorFromPlugin
			("org.uam.eps.modular.scope.wizard", "/icons/scopePattern.gif").createImage();
	
	protected ScopePatternPage(String pageName) {
		
		super(pageName);
		setTitle("Define Scope");
		setDescription("Scope Pattern");
	}

	@Override
	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout());
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				
		Label labelImage = new Label(container, SWT.CENTER);
		labelImage.setImage(imageScopePattern);
		GridData gridImage = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridImage.widthHint = 600;
		gridImage.heightHint = 400;
		labelImage.setLayoutData(gridImage);		
		
		setControl(container);	
	}	
}
