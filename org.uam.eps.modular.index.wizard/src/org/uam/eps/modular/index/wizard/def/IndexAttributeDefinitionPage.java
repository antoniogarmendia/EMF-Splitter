package org.uam.eps.modular.index.wizard.def;

import java.util.Iterator;
import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.uam.eps.modular.index.wizard.def.eattribute.AttributeColumnLabelProvider;
import org.uam.eps.modular.index.wizard.def.eattribute.AttributeEditingProvider;
import org.uam.eps.modular.index.wizard.def.eclass.EClassColumnLabelProvider;
import org.uam.eps.modular.index.wizard.def.eclass.EClassEditingProvider;

import index.Index;
import index.MetamodelIndex;
import index.impl.IndexFactoryImpl;
import splitterLibrary.EcoreEMF;

public class IndexAttributeDefinitionPage extends WizardPage{

	private EcoreEMF metaModel;
	private MetamodelIndex index;
	private EList<EClass> listEClassesWAttributes;
	
	
	protected IndexAttributeDefinitionPage(String pageName, EcoreEMF metaModel, MetamodelIndex index) {
		
		super(pageName);		
		this.index = index;
		this.metaModel = metaModel;
		setTitle("Define Indexed Attributes");
		setDescription("Index Attribute Pattern");
		this.listEClassesWAttributes = new BasicEList<EClass>();
		initFindEClassWAttributes();
	}
	
	private void initFindEClassWAttributes() {
		
		Iterator<EClass> itEClasses = metaModel.getList_classes().iterator();
		while (itEClasses.hasNext()) {
			EClass eClass = (EClass) itEClasses.next();
			if(eClass.getEAllAttributes().size() > 0)
				this.listEClassesWAttributes.add(eClass);							
		}	
	}

	@Override
	public void createControl(Composite parent) {

		Composite contents = new Composite(parent, SWT.NONE);
		
		GridData contentsData = new GridData(SWT.FILL, SWT.FILL, true, true);
		contentsData.widthHint = 400;
		contentsData.heightHint = 250;
		contentsData.minimumHeight = 250;
		contents.setLayoutData(contentsData);
		
		GridLayout containerLayout = new GridLayout();
		containerLayout.numColumns = 1;
		contents.setLayout(containerLayout);
		
		TreeViewer viewer = new TreeViewer(contents, SWT.FULL_SELECTION);
		viewer.setContentProvider(new IndexAttributeTreeContentProvider());
		viewer.getTree().setHeaderVisible(true);
	    viewer.getTree().setLinesVisible(true);	
		
	    GridData treedata = new GridData(SWT.FILL, SWT.FILL, true, true);
	    viewer.getTree().setLayoutData(treedata);
	    viewer.getTree().setLayout(new FillLayout());
	    
	    TreeViewerColumn eNameColumn = new TreeViewerColumn(viewer, SWT.NONE);	    
	    eNameColumn.getColumn().setWidth(150);
	    eNameColumn.getColumn().setText("Class");
	    eNameColumn.setLabelProvider(new EClassColumnLabelProvider());
	    eNameColumn.setEditingSupport(new EClassEditingProvider(viewer,this.metaModel.getList_classes()));
	    
	    TreeViewerColumn eAttribute = new TreeViewerColumn(viewer, SWT.NONE);	    
	    eAttribute.getColumn().setWidth(150);
	    eAttribute.getColumn().setText("Attribute");
	    eAttribute.setLabelProvider(new AttributeColumnLabelProvider());
	    eAttribute.setEditingSupport(new AttributeEditingProvider(viewer));
	    
	    Button button = new Button(contents, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
                false));
        button.setText("Add Index Attribute");	
	    
        button.addSelectionListener(new SelectionAdapter() {
        	
        	public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
        		
        		Index indexAttribute = IndexFactoryImpl.eINSTANCE.createIndex();
        		Random randomGenerator = new Random();
        		EClass eClass = listEClassesWAttributes.get(randomGenerator.nextInt(listEClassesWAttributes.size()));
        		indexAttribute.setEClass(eClass);
        		EAttribute eAttribute = eClass.getEAllAttributes().get(randomGenerator.nextInt(eClass.getEAllAttributes().size()));
        		indexAttribute.setEAttribute(eAttribute);
        		index.getIndexes().add(indexAttribute);
        		viewer.refresh();
        	}
        });
	    
        viewer.setInput(index.getIndexes());
        
        //actions
        IndexAllActionDialog allActions = new IndexAllActionDialog(viewer, getShell());
        allActions.init();
                
		setControl(contents);
		setPageComplete(true);
	}
}
