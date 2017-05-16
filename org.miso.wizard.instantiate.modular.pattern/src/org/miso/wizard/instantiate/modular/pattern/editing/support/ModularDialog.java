package org.miso.wizard.instantiate.modular.pattern.editing.support;

import java.util.LinkedList;
import java.util.List;

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

import MetaModelGraph.EnumModular;

public class ModularDialog extends Dialog{

	
	private List<EnumModular> listModularSettings;
	private boolean isProject;
	
	private static final EnumModular[] modularArray = 
			new EnumModular[]{
					EnumModular.PROJECT,
					EnumModular.PACKAGE,
					EnumModular.UNIT
			};
	
	public ModularDialog(Shell parentShell) {
		super(parentShell);	
		listModularSettings = new LinkedList<EnumModular>();
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();			
		layout.numColumns = 1;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label lblFontFormat = new Label(container, SWT.NONE);
		lblFontFormat.setText("Modular Annotation");
		
		for (EnumModular enumModular : modularArray) {
			
			Button btn = new Button(container, SWT.CHECK);
			btn.setText(enumModular.getName());
			
			if(enumModular.equals(EnumModular.PROJECT) && isProject){
				btn.setEnabled(false);					
			}
			else{
				
				btn.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						
						if(btn.getSelection() == true)
							getListModularSettings().add(EnumModular.getByName(btn.getText()));
						else
							getListModularSettings().remove(EnumModular.getByName(btn.getText()));					
					}
				});
			}
			//Check current selected notations
			int index = getListModularSettings().indexOf(EnumModular.getByName(btn.getText()));
			if(index!=-1)
				btn.setSelection(true);
		}	
		
		return container;
	}
		
	public List<EnumModular> getListModularSettings() {
		return this.listModularSettings;
	}
	
	public void setListModularSettings(List<EnumModular> plistModularSettings){
		this.listModularSettings = plistModularSettings;
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		
		super.configureShell(newShell);
		newShell.setText("Select Modularity Concept");
	}
	
	public boolean isProject() {
		return isProject;
	}

	public void setProject(boolean isProject) {
		this.isProject = isProject;
	}
}
