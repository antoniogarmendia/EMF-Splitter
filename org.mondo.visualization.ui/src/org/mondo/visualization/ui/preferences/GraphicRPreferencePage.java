package org.mondo.visualization.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.mondo.visualization.ui.Activator;

public class GraphicRPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	private BooleanFieldEditor embedImage;
	
	
	public GraphicRPreferencePage() {
		// TODO Auto-generated constructor stub	
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	public GraphicRPreferencePage(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public GraphicRPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
		title = "Graphic Representation Preferences";	
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		container.setLayout(new GridLayout());
			
		
		embedImage = new BooleanFieldEditor(PreferenceOptions.GraphicR_ChoiceEmbedImage, "Embed Image", container);
		embedImage.setPreferenceStore(getPreferenceStore());
		
		embedImage.load();
		
		return container;
	}

	@Override
	public boolean performOk() {
		// TODO Auto-generated method stub
		embedImage.store();
		return super.performOk();
	}
	
}
