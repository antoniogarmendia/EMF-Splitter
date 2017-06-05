package org.miso.wizard.instantiate.modular.pattern.pages;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.miso.wizard.instantiate.modular.pattern.label.provider.EClassRootContentProvider;
import org.miso.wizard.instantiate.modular.pattern.pages.filter.EClassFilter;
import org.miso.wizard.instantiate.modular.pattern.pages.filter.TableCheckProvider;
import org.miso.wizard.instantiate.modular.pattern.wizard.WizardApplyModularPattern;

import MetaModelGraph.Graph;
import MetaModelGraph.Node;
import MetaModelGraph.SubGraph;
import MetaModelGraph.impl.MetaModelGraphFactoryImpl;

import org.miso.wizard.instantiate.modular.pattern.label.provider.EClassLabelProvider;

import dslHeuristicVisualization.ConcreteStrategyMaxContainment;
import dslHeuristicVisualization.ConcreteStrategyNoParent;
import dslHeuristicVisualization.DslHeuristicVisualizationFactory;
import dslHeuristicVisualization.EcoreMatrixContainment;

public class PageSelectClassProject extends WizardPage{

	
	private EClassFilter filterEClass;
	private EList<EClass> eList;
	private EList<EClass> eListRoots;
	private EcoreMatrixContainment ecoreContainment;
		
	public PageSelectClassProject(String pageName, EList<EClass> eList, EcoreMatrixContainment ecoreContainment) {
		super(pageName);
		setTitle("Select the Class Project");
		setDescription("Select the appropriate class");
		this.eList = eList;
		this.ecoreContainment = ecoreContainment;
		this.eListRoots = new BasicEList<EClass>();		
	}

	@Override
	public void createControl(Composite parent) {
		
		//Define container
		final Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		//Filter Text
		final Text txtFilter = new Text(container, SWT.BORDER | SWT.SEARCH);
		GridData txtFilterData = new GridData(SWT.FILL);
		txtFilterData.horizontalAlignment = SWT.FILL;
		txtFilterData.grabExcessHorizontalSpace = true;
		txtFilter.setLayoutData(txtFilterData);
			
		possibleRootsOrder();		
			
		final CheckboxTableViewer tableOfRoots = CheckboxTableViewer.newCheckList(container, SWT.BORDER);
		tableOfRoots.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		
		EClassRootContentProvider contentProvider = new EClassRootContentProvider();
		
		EClassLabelProvider labelProvider = new EClassLabelProvider();
		tableOfRoots.setContentProvider(contentProvider);
		tableOfRoots.setLabelProvider(labelProvider);
		tableOfRoots.setInput(eListRoots.toArray());
		
		ICheckStateProvider checkStateProvider = new TableCheckProvider(((WizardApplyModularPattern) getWizard()).getGraph());
		tableOfRoots.setCheckStateProvider(checkStateProvider);				
		
		tableOfRoots.addCheckStateListener(new ICheckStateListener() {
			
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				
				Object element = event.getElement();
				boolean isChecked = event.getChecked();
				WizardApplyModularPattern wizard = (WizardApplyModularPattern) getWizard();
				
				if(isChecked == true){
							
					addPackUnitPage(wizard,(EClass)element);
					
				}else{
					
					removePackUnitPage(wizard,(EClass)element);
					removeProjectEClass((EClass)element);
					
				}			
				
				wizard.getDialog().updateButtons();
			}			
		});	
				
		filterEClass = new EClassFilter();
		
		txtFilter.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				filterEClass.setSearchText(((Text)e.widget).getText());
				tableOfRoots.refresh();
			}
		});
		
		tableOfRoots.addFilter(filterEClass);
		
		setControl(container);
		setPageComplete(false);
		
		updateTableOfRoot(tableOfRoots);	
	}
		
	private void updateTableOfRoot(CheckboxTableViewer tableOfRoots) {
		
		WizardApplyModularPattern wizard = (WizardApplyModularPattern) getWizard();
		Graph graph = wizard.getGraph();
		Iterator<SubGraph> itSubGraphs = graph.getSubgraph().iterator();
		while (itSubGraphs.hasNext()) {
			SubGraph subGraph = (SubGraph) itSubGraphs.next();
			if(subGraph.getRoot()!=null){
				int index = eListRoots.indexOf(subGraph.getRoot().getEClass());
				tableOfRoots.getTable().getItem(index).setChecked(true);
				//Add Page
				PageSelectPackagesUnits pagePackUnits = new PageSelectPackagesUnits("Select the Packages & Folders",eList,subGraph);
				wizard.addPage(pagePackUnits);				
			}
		}
		
		if(wizard.getGraph().getSubgraph().size()>0)
			setPageComplete(true);
		
	}
	
	public void removeProjectEClass(EClass eClass){
		
		WizardApplyModularPattern wizard = (WizardApplyModularPattern) getWizard();
		Iterator<SubGraph> itSubGraphs = wizard.getGraph().getSubgraph().iterator();
		while (itSubGraphs.hasNext()) {
			SubGraph subGraph = (SubGraph) itSubGraphs.next();
			EClass eClassRoot = subGraph.getRoot().getEClass();
			if(eClass.equals(eClassRoot)){
				wizard.getGraph().getSubgraph().remove(subGraph);
				break;
			}				
		}
		
		if(wizard.getGraph().getSubgraph().size()==0)
			setPageComplete(false);
		else
			setPageComplete(true);		
	}
	
	public void possibleRootsOrder()
	{
		ConcreteStrategyMaxContainment getRoot = DslHeuristicVisualizationFactory.eINSTANCE.createConcreteStrategyMaxContainment();
		ConcreteStrategyNoParent getRootNoParent = DslHeuristicVisualizationFactory.eINSTANCE.createConcreteStrategyNoParent();
		EClass eClassRoot = getRootNoParent.Get_Root(ecoreContainment.getPathMatrix(), eList);
		
		this.eListRoots = getRoot.List_Root(ecoreContainment.getPathMatrix(), eList);	
		
		if(eClassRoot!=null)
		{
			this.eListRoots.remove(eClassRoot);
			this.eListRoots.add(0, eClassRoot);
		}		
	}
	
	private void removePackUnitPage(WizardApplyModularPattern wizard, EClass eClass) {
		
		Iterator<IWizardPage> itPages = wizard.getListPages().iterator();
		itPages.next();
		while (itPages.hasNext()) {
			IWizardPage iWizardPage = (IWizardPage) itPages.next();
			if(iWizardPage instanceof PageSelectPackagesUnits){
				PageSelectPackagesUnits currentPage = (PageSelectPackagesUnits) iWizardPage;
				if(eClass.equals(currentPage.getSubGraph().getRoot().getEClass()))
					itPages.remove();
			}				
		}
	}

	private void addPackUnitPage(WizardApplyModularPattern wizard, EClass eClass) {
		
		//Add Page
		SubGraph subGraph = MetaModelGraphFactoryImpl.eINSTANCE.createSubGraph();
				
		//Create Root
		Node rootNode = MetaModelGraphFactoryImpl.eINSTANCE.createNode();
		rootNode.setEClass(eClass);
		subGraph.getNodes().add(rootNode);
		subGraph.setRoot(rootNode);
		wizard.getGraph().getSubgraph().add(subGraph);
		
		PageSelectPackagesUnits pagePackUnits = new PageSelectPackagesUnits("Select the Packages & Folders",eList,subGraph);
		wizard.addPage(pagePackUnits);
		
		setPageComplete(true);
	}
	
}
