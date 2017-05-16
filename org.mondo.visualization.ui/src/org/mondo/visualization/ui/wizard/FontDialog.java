package org.mondo.visualization.ui.wizard;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import graphic_representation.GRFontFormat;;


public class FontDialog extends Dialog {
	
	private EList<GRFontFormat> listOfFontFormat;
	private Boolean showIcon;
	
	public EList<GRFontFormat> getListOfFontFormat() {
		return listOfFontFormat;
	}

	public FontDialog(Shell parent) {
		
		super(parent);		
		listOfFontFormat = new BasicEList<GRFontFormat>();
		showIcon = false;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout();			
		layout.numColumns = 1;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label lblFontFormat = new Label(container, SWT.NONE);
		lblFontFormat.setText("Label Format");	
		
		GRFontFormat[] fontTypes = GRFontFormat.values();	
		for (GRFontFormat fontFormat : fontTypes) {
			Button btn = new Button(container, SWT.CHECK);
			btn.setText(fontFormat.getName());
			btn.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					
					if(btn.getSelection() == true)
						listOfFontFormat.add(GRFontFormat.getByName(btn.getText()));
						else
							listOfFontFormat.remove(GRFontFormat.getByName(btn.getText()));
				}				
			});
			if(listOfFontFormat.indexOf(fontFormat)!=-1)
				btn.setSelection(true);
			else
				btn.setSelection(false);
		}	
		
		Label lblIcon = new Label(container, SWT.NONE);
		lblIcon.setText("Icon");
		
		Button btn = new Button(container, SWT.CHECK);
		btn.setText("Show Icon");
		btn.setSelection(showIcon);
		btn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				showIcon = btn.getSelection();
			}	
				
		});
		
		return container;
	}
	
	 @Override
	 protected void configureShell(Shell newShell) {
	    super.configureShell(newShell);
	    newShell.setText("Select Font Format");
	 }

	public void setListOfFontFormat(EList<GRFontFormat> listOfFontFormat) {
		this.listOfFontFormat = listOfFontFormat;
	}

	public Boolean getShowIcon() {
		return showIcon;
	}

	public void setShowIcon(Boolean showIcon) {
		this.showIcon = showIcon;
	}	 
	 
}
