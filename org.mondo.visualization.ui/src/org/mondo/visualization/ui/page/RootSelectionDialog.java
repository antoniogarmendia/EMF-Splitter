package org.mondo.visualization.ui.page;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class RootSelectionDialog extends ElementListSelectionDialog {

	private boolean execHeuristicBoolean;	
	
	public boolean isExecHeuristicBoolean() {
		return execHeuristicBoolean;
	}

	public RootSelectionDialog(Shell parent, ILabelProvider renderer) {
		super(parent, renderer);
		execHeuristicBoolean = true;		
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		final Composite contents = (Composite) super.createDialogArea(parent);
		
		Button execHeuristic = new Button(contents, SWT.CHECK);
		execHeuristic.setText("Execute Heuristic again");
		execHeuristic.setSelection(execHeuristicBoolean);
		
		execHeuristic.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
		
				execHeuristicBoolean = execHeuristic.getSelection();
			}		
			
		});
		
		return contents;
	}

}
