package org.uam.eps.modular.constraints.dialog.def.contraint;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.Bullet;
import org.eclipse.swt.custom.LineStyleEvent;
import org.eclipse.swt.custom.LineStyleListener;
import org.eclipse.swt.custom.ST;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GlyphMetrics;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.uam.eps.modular.constraints.dialog.def.eol.EolStandAlone;

public class ConstraintDialog extends Dialog{
	
	private String statement;
	private StyledText constraintText;
	
	
	protected ConstraintDialog(Shell parentShell, String statement) {
		
		super(parentShell);	
		this.statement = statement;		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = (Composite) super.createDialogArea(parent);
				
		Label constraintLabel = new Label(container, SWT.NONE);
		constraintLabel.setText("Statement");			
		constraintText = new StyledText(container, SWT.MULTI | SWT.BORDER);
		
		GridData dataContent = new GridData(GridData.FILL_BOTH);
		dataContent.verticalAlignment = SWT.CENTER;
		dataContent.grabExcessHorizontalSpace = true;
		dataContent.grabExcessVerticalSpace = true;
		dataContent.heightHint = 300;	
		dataContent.widthHint = 500;
		constraintText.setLayoutData(dataContent);
		
		constraintText.setText(this.statement);
		
		Composite buttonsContent = new Composite(container, SWT.NONE);
		
		GridLayout buttonsCompositeLayout = new GridLayout();
		buttonsCompositeLayout.numColumns = 2;
		buttonsContent.setLayout(buttonsCompositeLayout);
		
		Button buttonFile = new Button(buttonsContent, SWT.PUSH);
		buttonFile.setText("Constraint From File");
		buttonFile.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				ResourceDialog dialog = new ResourceDialog(getShell(), "Select File", SWT.NONE);
				if(dialog.open() == Window.OK) {
					
					java.util.List<URI> uris = dialog.getURIs();
					if (uris.size() > 0) {
						
						URI fileURI = uris.get(0);
						IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(fileURI.toPlatformString(true)));
						try {
							InputStream fis = file.getContents();
							InputStreamReader reader = new InputStreamReader(fis);
							BufferedReader Buff = new BufferedReader(reader);
							// for reading one line
							String line = null;
							constraintText.setText("");
							// keep reading till readLine returns null
							while ((line = Buff.readLine()) != null) {
							    // keep appending last line read to buffer						
							    constraintText.setText(constraintText.getText() + line + "\r\n");
							}						
							
							statement = constraintText.getText();
						} catch (CoreException | IOException e1) {
							
							e1.printStackTrace();
						}						
					}					
				}				
			}
		});	
		
		Button buttonValidate = new Button(buttonsContent, SWT.PUSH);
		buttonValidate.setText("Validate Constraint");
					
		Composite errorComposite = new Composite(container, SWT.NONE);
		
		GridLayout errorCompositeLayout = new GridLayout();
		errorCompositeLayout.numColumns = 1;
		errorComposite.setLayout(errorCompositeLayout);
		
		Label errorLabel = new Label(errorComposite, SWT.NONE);
		errorLabel.setText("Errors");
		
		List listOfErrors = new List(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		
		GridData layoutList = new GridData();
		layoutList.widthHint = 500;
		layoutList.heightHint = 100;
		
		listOfErrors.setLayoutData(layoutList);
		
		// validate		
		buttonValidate.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				// EOL temporary file
		  try {
				File tempFile = File.createTempFile("tempEOLFile", ".eol");
				BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
				bw.write(constraintText.getText());
				bw.close();
				
				EolStandAlone eolExecution = new EolStandAlone(null, tempFile.toURI(), null);
				
				java.util.List<ParseProblem> problems = eolExecution.parse();
				listOfErrors.removeAll();
				if (problems.size() > 0) {
					Iterator<ParseProblem> itProblems = problems.iterator();
					while (itProblems.hasNext()) {
						ParseProblem parseProblem = (ParseProblem) itProblems.next();
						listOfErrors.add(parseProblem.getLine() + "-" + parseProblem.getReason());
					}						
				} else {
					listOfErrors.add("--0 Errors--");
				}					
				tempFile.delete();					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}				
			}			
		});
		
		showLineNumbers();
		return container;
	}
	
	private void showLineNumbers() {
		
		this.constraintText.addLineStyleListener(new LineStyleListener()
		{
		    public void lineGetStyle(LineStyleEvent e)
		    {
		        //Set the line number
		        e.bulletIndex = constraintText.getLineAtOffset(e.lineOffset);

		        //Set the style, 12 pixles wide for each digit
		        StyleRange style = new StyleRange();
		        style.metrics = new GlyphMetrics(0, 0, Integer.toString(constraintText.getLineCount()+1).length()*12);

		        //Create and set the bullet
		        e.bullet = new Bullet(ST.BULLET_NUMBER,style);
		    }
		});
	}

	@Override
	protected void okPressed() {
		
		statement = constraintText.getText();
		super.okPressed();		
	}
	
	@Override
	public Shell getShell() {
		Shell shell = super.getShell();
		shell.setText("Define Statement");
		return shell;
	}
	
	public String getStatement() {
		return statement;
	}

}
