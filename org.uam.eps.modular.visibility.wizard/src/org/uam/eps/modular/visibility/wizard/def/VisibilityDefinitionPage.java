package org.uam.eps.modular.visibility.wizard.def;

import java.util.Random;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.uam.eps.modular.visibility.wizard.def.eclass.EClassColumnLabelProvider;
import org.uam.eps.modular.visibility.wizard.def.eclass.EClassEditingProvider;
import org.uam.eps.modular.visibility.wizard.def.expression.ExpressionColumnLabelProvider;
import org.uam.eps.modular.visibility.wizard.def.expression.ExpressionEditingProvider;
import org.uam.eps.modular.visibility.wizard.def.visibility.VisibilityColumnLabelProvider;
import org.uam.eps.modular.visibility.wizard.def.visibility.VisibilityEditingProvider;

import splitterLibrary.EcoreEMF;
import visibility.MetamodelVisibility;
import visibility.Visibility;
import visibility.VisibilityDefinition;
import visibility.impl.VisibilityFactoryImpl;

public class VisibilityDefinitionPage extends WizardPage {

	private MetamodelVisibility visibilityRules;
	private EcoreEMF metaModel;
	
	protected VisibilityDefinitionPage(String pageName, MetamodelVisibility visibilityRules, EcoreEMF metaModel) {
		
		super(pageName);
		setTitle("Define Visibility Rules");
		setDescription("Visibility Pattern");
		this.metaModel = metaModel;
		this.visibilityRules = visibilityRules;		
	}

	@Override
	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent,SWT.NONE);
		
		GridData containerData = new GridData(SWT.FILL, SWT.FILL, true, true);
		containerData.widthHint = 400;
		containerData.heightHint = 250;
		containerData.minimumHeight = 250;
	    container.setLayoutData(containerData);
		
	    GridLayout containerLayout = new GridLayout();
	    containerLayout.numColumns = 1;
	    container.setLayout(containerLayout);
	    
	    TreeViewer viewer = new TreeViewer(container, SWT.FULL_SELECTION);
		viewer.setContentProvider(new VisibilityTreeContentProvider());
		viewer.getTree().setHeaderVisible(true);
	    viewer.getTree().setLinesVisible(true);	
	    
	    GridData treedata = new GridData(SWT.FILL, SWT.FILL, true, true);
	    viewer.getTree().setLayoutData(treedata);
	    viewer.getTree().setLayout(new FillLayout());
	    
	    TreeViewerColumn eNameColumn = new TreeViewerColumn(viewer, SWT.NONE);	    
	    eNameColumn.getColumn().setWidth(150);
	    eNameColumn.getColumn().setText("Class");
	    eNameColumn.setLabelProvider(new EClassColumnLabelProvider());
	    eNameColumn.setEditingSupport(new EClassEditingProvider(viewer, metaModel.getList_classes()));
	    
	    TreeViewerColumn eVisibility = new TreeViewerColumn(viewer, SWT.NONE);
	    eVisibility.getColumn().setWidth(100);
	    eVisibility.getColumn().setText("Visibility");
	    eVisibility.setLabelProvider(new VisibilityColumnLabelProvider());
	    eVisibility.setEditingSupport(new VisibilityEditingProvider(viewer));
	    
	    TreeViewerColumn expression = new TreeViewerColumn(viewer, SWT.NONE);
	    expression.getColumn().setWidth(200);
	    expression.getColumn().setText("Expression");
	    expression.setLabelProvider(new ExpressionColumnLabelProvider());
	    expression.setEditingSupport(new ExpressionEditingProvider(viewer));
	    
	    
	    Button button = new Button(container, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
                false));
        button.setText("Add Visibility Rule");
        button.addSelectionListener(new SelectionAdapter() {
        	
        	@Override
        	public void widgetSelected(SelectionEvent e) {
        		
        		Visibility rule = VisibilityFactoryImpl.eINSTANCE.createVisibility();
        		Random randomGenerator = new Random();
        		rule.setEClass(metaModel.getList_classes().
            			get(randomGenerator.nextInt(metaModel.getList_classes().size())));
        		rule.setExpression("");
        		rule.setVisibility(VisibilityDefinition.WORKSPACE);
        		visibilityRules.getVisibilityRules().add(rule);   
        		viewer.refresh();
        	}        	
		});       
		
	    viewer.setInput(visibilityRules.getVisibilityRules());	
	    
	    VisibilityAllActionDialog allActions = new VisibilityAllActionDialog(viewer,getShell());
	    allActions.init();	    
		setControl(container);
	}

}
