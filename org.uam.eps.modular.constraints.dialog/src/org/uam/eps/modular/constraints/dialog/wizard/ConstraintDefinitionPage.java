package org.uam.eps.modular.constraints.dialog.wizard;

import org.eclipse.emf.ecore.EPackage;
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
import org.uam.eps.modular.constraints.dialog.def.ConstraintAllActionDialog;
import org.uam.eps.modular.constraints.dialog.def.ConstraintTreeContentProvider;
import org.uam.eps.modular.constraints.dialog.def.constraint.definition.ConstraintDefinitionColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.constraint.definition.ConstraintDefinitionEditingProvider;
import org.uam.eps.modular.constraints.dialog.def.context.eclass.EClassColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.context.eclass.EClassEditingProvider;
import org.uam.eps.modular.constraints.dialog.def.contraint.ConstraintColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.contraint.ConstraintEditingProvider;
import org.uam.eps.modular.constraints.dialog.def.message.MessageColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.message.MessageEditingProvider;
import org.uam.eps.modular.constraints.dialog.def.name.NameColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.name.NameEditingProvider;

import constraints.Constraint;
import constraints.ConstraintsFactory;
import constraints.MetamodelConstraint;
import splitterLibrary.EcoreEMF;

public class ConstraintDefinitionPage extends WizardPage{

	private MetamodelConstraint constraints;
	private EcoreEMF metaModel; //BasicEList
	
	protected ConstraintDefinitionPage(String pageName, MetamodelConstraint constraints, EcoreEMF nemf) {
		
		super(pageName);
		this.constraints = constraints;
		this.metaModel = nemf;
		setTitle("Define Constraints");
		setDescription("Constraint Pattern");
	}

	@Override
	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		
		GridData containerData = new GridData(SWT.FILL, SWT.FILL, true, true);
		containerData.widthHint = 400;
		containerData.heightHint = 280;
		container.setLayoutData(containerData);
	    
	    GridLayout containerLayout = new GridLayout();
	    containerLayout.numColumns = 1;
	    container.setLayout(containerLayout);
					
		TreeViewer viewer = new TreeViewer(container, SWT.FULL_SELECTION);
		viewer.setContentProvider(new ConstraintTreeContentProvider());
		viewer.getTree().setHeaderVisible(true);
	    viewer.getTree().setLinesVisible(true);	 
	    
	    GridData treedata = new GridData(SWT.FILL, SWT.FILL, true, true);
	    viewer.getTree().setLayoutData(treedata);
	    viewer.getTree().setLayout(new FillLayout());
	    	 
	    TreeViewerColumn eNameColumn = new TreeViewerColumn(viewer, SWT.NONE);	    
	    eNameColumn.getColumn().setWidth(120);
	    eNameColumn.getColumn().setText("Name");
	    eNameColumn.setLabelProvider(new NameColumnLabelProvider());
	    eNameColumn.setEditingSupport(new NameEditingProvider(viewer));
	    
	    TreeViewerColumn eGlobalColumn = new TreeViewerColumn(viewer, SWT.NONE);
	    eGlobalColumn.getColumn().setWidth(110);
	    eGlobalColumn.getColumn().setText("Constraint Scope");
	    eGlobalColumn.setLabelProvider(new ConstraintDefinitionColumnLabelProvider());
	    eGlobalColumn.setEditingSupport(new ConstraintDefinitionEditingProvider(viewer,metaModel.getList_classes()));
	    	    
	    TreeViewerColumn eClassColumn = new TreeViewerColumn(viewer, SWT.NONE);
	    eClassColumn.getColumn().setWidth(90);
	    eClassColumn.getColumn().setText("Context");
	    eClassColumn.setLabelProvider(new EClassColumnLabelProvider());
	    eClassColumn.setEditingSupport(new EClassEditingProvider(viewer,metaModel.getList_classes()));
	    
	    TreeViewerColumn contraintColumn = new TreeViewerColumn(viewer, SWT.NONE);
	    contraintColumn.getColumn().setWidth(150);
	    contraintColumn.getColumn().setText("Constraint");
	    contraintColumn.setLabelProvider(new ConstraintColumnLabelProvider());	    
	    contraintColumn.setEditingSupport(new ConstraintEditingProvider(viewer));
	    	    	
	    TreeViewerColumn messageColumn = new TreeViewerColumn(viewer, SWT.NONE);
	    messageColumn.getColumn().setWidth(150);
	    messageColumn.getColumn().setText("Error Message");
	    messageColumn.setLabelProvider(new MessageColumnLabelProvider());
	    messageColumn.setEditingSupport(new MessageEditingProvider(viewer));
	    
	    Button button = new Button(container, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
                false));
        button.setText("Add Constraint");
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	
            	Constraint newConstraint = ConstraintsFactory.eINSTANCE.createConstraint();
            	newConstraint.setName("Constraint" + (constraints.getConstraints().size() + 1));
            	newConstraint.setStatement("");
                constraints.getConstraints().add(newConstraint);
                viewer.refresh();
            }
        });
	        
        viewer.setInput(constraints.getConstraints());
        this.constraints.setMetamodel(((EPackage)metaModel.getRs().getContents().get(0)).getNsURI());
        
        ConstraintAllActionDialog allActions = new ConstraintAllActionDialog(viewer,getShell());
        allActions.init();	    
	    
		setControl(container);
		setPageComplete(true);
	}

}
