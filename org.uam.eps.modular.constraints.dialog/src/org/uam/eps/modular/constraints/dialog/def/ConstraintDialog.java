package org.uam.eps.modular.constraints.dialog.def;

import java.io.IOException;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.uam.eps.modular.constraints.dialog.def.contraint.ConstraintColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.contraint.ConstraintEditingProvider;
import org.uam.eps.modular.constraints.dialog.def.eclass.EClassColumnLabelProvider;
import org.uam.eps.modular.constraints.dialog.def.eclass.EClassEditingProvider;

import constraints.Constraint;
import constraints.ConstraintsFactory;
import constraints.MetamodelConstraint;
import splitterLibrary.EcoreEMF;

public class ConstraintDialog extends Dialog{

	public EcoreEMF metaModel;
	public MetamodelConstraint constraints;
	public boolean updateConstraint;
	
	public ConstraintDialog(Shell parentShell, EcoreEMF metaModel) {
		
		super(parentShell);
		this.metaModel = metaModel;
		this.constraints = ConstraintsFactory.eINSTANCE.createMetamodelConstraint();
		this.updateConstraint = false;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = (Composite) super.createDialogArea(parent);
		
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
            	newConstraint.setStatement("");
                constraints.getConstraints().add(newConstraint);
                viewer.refresh();
            }
        });
	        
        viewer.setInput(constraints.getConstraints());
        this.constraints.setMetamodel(((EPackage)metaModel.getRs().getContents().get(0)).getNsURI());
        
        ConstraintAllActionDialog allActions = new ConstraintAllActionDialog(viewer,getShell());
        allActions.init();
                
        return container;
	}
	
	public void setConstraints(MetamodelConstraint constraints) {
		this.constraints = constraints;
	}
	
	@Override
	protected boolean isResizable() {
		
		return true;
	}
	
	@Override
	protected Point getInitialSize() {
		
		return new Point(450, 350);
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		
		super.configureShell(newShell);
		newShell.setText("Define contraints for the Meta-model");
	}
	
	@Override
	protected void okPressed() {
		
		super.okPressed();
		// obtaint URI from metamodel
		URI consURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("cons");
		//save the cons
		ResourceSet reset = new ResourceSetImpl();
		Resource resource = reset.createResource(consURI);
		resource.getContents().add(this.constraints);
		
		try {
			
			resource.save(null);
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
