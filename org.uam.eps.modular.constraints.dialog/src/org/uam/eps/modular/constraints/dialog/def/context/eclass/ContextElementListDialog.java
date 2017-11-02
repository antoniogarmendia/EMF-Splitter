package org.uam.eps.modular.constraints.dialog.def.context.eclass;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;


public class ContextElementListDialog extends ElementListSelectionDialog{
	
	private boolean isContextDefined;
	private Text filterText;
		
	public ContextElementListDialog(Shell parent, ILabelProvider renderer, boolean isContextDefined) {
		super(parent, renderer);		
		this.isContextDefined = isContextDefined;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		final Composite contents = (Composite) super.createDialogArea(parent);
		
		Button buttonContext = new Button(contents, SWT.CHECK);
		buttonContext.setText("Do not define context");
		buttonContext.setSelection(!isContextDefined);
		
		buttonContext.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {			
				
				isContextDefined = !buttonContext.getSelection();
				setEnabledOfWidgets();										
			}			
		});		
		
		setEnabledOfWidgets();	
		
		return contents;
	}
	
	public void setEnabledOfWidgets() {
		
		if (isContextDefined == false) {										
			fFilteredList.setEnabled(false);
			filterText.setEnabled(false);			
		}
		else {					
			fFilteredList.setEnabled(true);
			filterText.setEnabled(true);
		}		
	}
	
	@Override
	protected Text createFilterText(Composite parent) {
		
		filterText = super.createFilterText(parent);
		return filterText;
	}
	
	public boolean isContextDefined() {
		return isContextDefined;
	}
	
	public void resultEqualNull() {		
		setResult(null);
	}
}
