package org.uam.eps.modular.index.wizard.def;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class IndexAttributePatternPage extends WizardPage{

	final public static Image imageIndexAttributePattern = AbstractUIPlugin.imageDescriptorFromPlugin
			("org.uam.eps.modular.index.wizard", "/icons/IndexAttribute.gif").createImage();
	
	protected IndexAttributePatternPage(String pageName) {
		
		super(pageName);
		setTitle("Define Index Attributes");
		setDescription("Index Attribute Pattern");
	}

	@Override
	public void createControl(Composite parent) {
		
		Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayout(new GridLayout());
		contents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				
		Label labelImage = new Label(contents, SWT.CENTER);
		labelImage.setImage(imageIndexAttributePattern);
		GridData gridImage = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridImage.widthHint = 200;
		gridImage.heightHint = 250;
		labelImage.setLayoutData(gridImage);
		
		setControl(contents);
		setPageComplete(true);
	}
}
