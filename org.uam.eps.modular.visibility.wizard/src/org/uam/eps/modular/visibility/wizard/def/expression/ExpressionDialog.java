package org.uam.eps.modular.visibility.wizard.def.expression;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ExpressionDialog extends Dialog {

	private String expression;
	private Text constraintText;
	
	protected ExpressionDialog(Shell parentShell, String expression) {
	
		super(parentShell);	
		this.expression = expression;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = (Composite) super.createDialogArea(parent);
		
		Label constraintLabel = new Label(container, SWT.NONE);
		constraintLabel.setText("Expression");			
		constraintText = new Text(container, SWT.MULTI | SWT.BORDER);
		
		GridData dataContent = new GridData(GridData.FILL_BOTH);
		dataContent.verticalAlignment = SWT.CENTER;
		dataContent.grabExcessHorizontalSpace = true;
		dataContent.grabExcessVerticalSpace = true;
		dataContent.heightHint = 300;	
		dataContent.widthHint = 500;
		constraintText.setLayoutData(dataContent);
		
		constraintText.setText(this.expression);
		
		return container;
	}
	
	@Override
	protected void okPressed() {
		
		this.expression = constraintText.getText();
		super.okPressed();		
	}
	
	public String getExpression() {
		return expression;
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		
		super.configureShell(newShell);
		newShell.setText("Define EOL Expression");
	}
	
}
