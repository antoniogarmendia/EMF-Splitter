package org.uam.eps.modular.constraints.dialog.wizard;

import java.io.File;
import java.util.Random;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
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
import org.uam.eps.modular.constraints.dialog.def.contraint.ConstraintColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.contraint.ConstraintEditingProvider;
import org.uam.eps.modular.constraints.dialog.def.eclass.EClassColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.eclass.EClassEditingProvider;
import org.uam.eps.modular.constraints.dialog.def.name.NameColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.name.NameEditingProvider;

import constraints.Constraint;
import constraints.ConstraintsFactory;
import constraints.MetamodelConstraint;
import splitterLibrary.EcoreEMF;

public class ConstraintDefinitionPage extends WizardPage{

	private MetamodelConstraint constraints;
	private EcoreEMF metaModel;
	
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
		containerData.heightHint = 250;
		containerData.minimumHeight = 250;
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
	    eNameColumn.getColumn().setWidth(150);
	    eNameColumn.getColumn().setText("Name");
	    eNameColumn.setLabelProvider(new NameColumnLabelProvider());
	    eNameColumn.setEditingSupport(new NameEditingProvider(viewer));
	    
	    TreeViewerColumn eClassColumn = new TreeViewerColumn(viewer, SWT.NONE);
	    eClassColumn.getColumn().setWidth(150);
	    eClassColumn.getColumn().setText("EClass");
	    eClassColumn.setLabelProvider(new EClassColumnLabelProvider());
	    eClassColumn.setEditingSupport(new EClassEditingProvider(viewer,metaModel.getList_classes()));
	    
	    TreeViewerColumn contraintColumn = new TreeViewerColumn(viewer, SWT.NONE);
	    contraintColumn.getColumn().setWidth(250);
	    contraintColumn.getColumn().setText("Constraint");
	    contraintColumn.setLabelProvider(new ConstraintColumnLabelProvider());
	    
	    contraintColumn.setEditingSupport(new ConstraintEditingProvider(viewer));	    
	
	    Button button = new Button(container, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
                false));
        button.setText("Add Constraint");
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	
            	Constraint newConstraint = ConstraintsFactory.eINSTANCE.createConstraint();
            	Random randomGenerator = new Random();
            	newConstraint.setEClass(metaModel.getList_classes().
            			get(randomGenerator.nextInt(metaModel.getList_classes().size()))); 
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
