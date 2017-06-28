package org.uam.eps.modular.constraints.dialog.def.contraint;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ConstraintDialog extends Dialog{
	
	private String statement;
	private Text constraintText;
	
	
	protected ConstraintDialog(Shell parentShell, String statement) {
		
		super(parentShell);	
		this.statement = statement;		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = (Composite) super.createDialogArea(parent);
				
		Label constraintLabel = new Label(container, SWT.NONE);
		constraintLabel.setText("Statement");			
		constraintText = new Text(container, SWT.MULTI | SWT.BORDER);
		
		GridData dataContent = new GridData(GridData.FILL_BOTH);
		dataContent.verticalAlignment = SWT.CENTER;
		dataContent.grabExcessHorizontalSpace = true;
		dataContent.grabExcessVerticalSpace = true;
		dataContent.heightHint = 300;	
		dataContent.widthHint = 500;
		constraintText.setLayoutData(dataContent);
		
		constraintText.setText(this.statement);
		
		return container;
	}
	
	@Override
	protected void okPressed() {
		
		statement = constraintText.getText();
		super.okPressed();		
	}
	
	public String getStatement() {
		return statement;
	}

}
