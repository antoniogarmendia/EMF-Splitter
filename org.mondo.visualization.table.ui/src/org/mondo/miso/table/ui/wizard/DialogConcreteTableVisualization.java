package org.mondo.miso.table.ui.wizard;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.mondo.miso.table.ui.wizard.pages.PageDefineTableRepresentation;

import graphic_representation.Graphic_representationFactory;
import graphic_representation.RepresentationTable;

public class DialogConcreteTableVisualization extends WizardDialog{

	public DialogConcreteTableVisualization(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		super.createButtonsForButtonBar(parent);
			
		((GridLayout) parent.getLayout()).numColumns++;
		Button btnView = new Button(parent, SWT.PUSH);
		btnView.setText("New Representation Table >");
		btnView.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				WizardDefineTableVisualization wizard = (WizardDefineTableVisualization)getWizard();
				PageDefineTableRepresentation newTable = new PageDefineTableRepresentation("Create Table Representation");
				
				RepresentationTable representationTable = Graphic_representationFactory.eINSTANCE.createRepresentationTable();
				representationTable.setRootTable(wizard.getRoot());
				wizard.getListRepresentationTable().add(representationTable);
							
				newTable.setPos(wizard.getListRepresentationTable().indexOf(representationTable));
				wizard.addPage(newTable);
				showPage(newTable);
				System.out.println("New Representation Table");
			}				
		});
		
	}	
	

}
