package org.uam.eps.modular.scope.wizard.def;

import java.util.Iterator;
import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
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
import org.uam.eps.modular.scope.wizard.def.eclass.EClassColumnLabelProvider;
import org.uam.eps.modular.scope.wizard.def.eclass.EClassEditingProvider;
import org.uam.eps.modular.scope.wizard.def.reference.ReferenceColumnLabelProvider;
import org.uam.eps.modular.scope.wizard.def.reference.ReferenceEditingProvider;
import org.uam.eps.modular.scope.wizard.def.scope.ScopeColumnLabelProvider;
import org.uam.eps.modular.scope.wizard.def.scope.ScopeEditingProvider;

import ScopeDefinition.MetaModelScope;
import ScopeDefinition.ScopeDefinitionEnum;
import ScopeDefinition.ScopeRule;
import ScopeDefinition.impl.ScopeDefinitionFactoryImpl;
import splitterLibrary.EcoreEMF;

public class ScopeDefinitionPage extends WizardPage{

	private MetaModelScope scopeRules;
	private EcoreEMF metaModel;
	private EList<EClass> listEClassesWReferences;
		
	protected ScopeDefinitionPage(String pageName, MetaModelScope scopeRules, EcoreEMF metaModel) {
		
		super(pageName);
		setTitle("Define Scope Rules");
		setDescription("Scope Pattern");
		this.metaModel = metaModel;
		this.scopeRules = scopeRules;
		this.listEClassesWReferences = new BasicEList<EClass>();
		initFindEClassWRerenferences();
	}

	private void initFindEClassWRerenferences() {
		
		Iterator<EClass> itEClasses = metaModel.getList_classes().iterator();
		while (itEClasses.hasNext()) {
			EClass eClass = (EClass) itEClasses.next();
			Iterator<EReference> itReferences = eClass.getEAllReferences().iterator();
			while (itReferences.hasNext()) {
				EReference eReference = (EReference) itReferences.next();
				if (eReference.isContainment() == false) {
					listEClassesWReferences.add(eClass);
					break;
				}
			}
		}		
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
		viewer.setContentProvider(new ScopeTreeContentProvider());
		viewer.getTree().setHeaderVisible(true);
	    viewer.getTree().setLinesVisible(true);
		
	    GridData treedata = new GridData(SWT.FILL, SWT.FILL, true, true);
	    viewer.getTree().setLayoutData(treedata);
	    viewer.getTree().setLayout(new FillLayout());
	    
	    TreeViewerColumn eNameColumn = new TreeViewerColumn(viewer, SWT.NONE);	    
	    eNameColumn.getColumn().setWidth(150);
	    eNameColumn.getColumn().setText("Class");
	    eNameColumn.setLabelProvider(new EClassColumnLabelProvider());
	    eNameColumn.setEditingSupport(new EClassEditingProvider(viewer, this.listEClassesWReferences));
	    
	    TreeViewerColumn eScope = new TreeViewerColumn(viewer, SWT.NONE);
	    eScope.getColumn().setWidth(150);
	    eScope.getColumn().setText("Scope");
	    eScope.setLabelProvider(new ScopeColumnLabelProvider());
	    eScope.setEditingSupport(new ScopeEditingProvider(viewer));
		
	    TreeViewerColumn reference = new TreeViewerColumn(viewer, SWT.NONE);
	    reference.getColumn().setWidth(200);
	    reference.getColumn().setText("Reference");
	    reference.setLabelProvider(new ReferenceColumnLabelProvider());
	    reference.setEditingSupport(new ReferenceEditingProvider(viewer));
	    	    
	    Button button = new Button(container, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
                false));
        button.setText("Add Scope Rules");	    
	    
        button.addSelectionListener(new SelectionAdapter() {
        	
        	public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
        		
        		ScopeRule rule = ScopeDefinitionFactoryImpl.eINSTANCE.createScopeRule();
        		Random randomGenerator = new Random();
        		EClass eClass = listEClassesWReferences.get(randomGenerator.nextInt(listEClassesWReferences.size()));
        		rule.setEClass(eClass);
        		rule.setScopeDefinition(ScopeDefinitionEnum.SAME_WORKSPACE);
        		EList<EReference> listOfReferences = getNoNContainmentReferences(eClass);
        		rule.setEReference(listOfReferences.get(randomGenerator.nextInt(listOfReferences.size())));        		
        		scopeRules.getScopeRules().add(rule);        		
        		viewer.refresh();
        	};
        });
	    
        viewer.setInput(scopeRules.getScopeRules());	
        
        // actions
        ScopeAllActionDialog allActions = new ScopeAllActionDialog(viewer,getShell());
        allActions.init();
        
		setControl(container);		
	}
	
	public static EList<EReference> getNoNContainmentReferences(EClass eClass) {
		
		EList<EReference> listOfReferences = new BasicEList<EReference>();
		Iterator<EReference> itReferences = eClass.getEAllReferences().iterator();
		while (itReferences.hasNext()) {
			EReference eReference = (EReference) itReferences.next();
			if (eReference.isContainment() == false) {
				listOfReferences.add(eReference);				
			}
		}				
		return listOfReferences;
	}

}
