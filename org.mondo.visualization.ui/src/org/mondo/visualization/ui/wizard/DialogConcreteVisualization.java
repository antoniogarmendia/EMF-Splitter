package org.mondo.visualization.ui.wizard;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class DialogConcreteVisualization extends WizardDialog{

	
	private Button btnView;
	
	public DialogConcreteVisualization(Shell parentShell, IWizard newWizard) {
		
		super(parentShell, newWizard);
		setHelpAvailable(false);		
	}

	@Override
	public void updateButtons() {
		
		super.updateButtons();
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		
		super.createButtonsForButtonBar(parent);
		((GridLayout) parent.getLayout()).numColumns++;
		btnView = new Button(parent, SWT.PUSH);
		btnView.setText("Another Representation >");
		btnView.setVisible(false);						
	}	
	
	public Button getButtonView()
	{
		return btnView;
	}	
	
}
