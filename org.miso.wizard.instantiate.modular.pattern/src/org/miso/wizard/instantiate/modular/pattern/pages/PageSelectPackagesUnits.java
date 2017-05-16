package org.miso.wizard.instantiate.modular.pattern.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.events.TreeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.miso.wizard.instantiate.modular.pattern.content.provider.GraphContentProvider;
import org.miso.wizard.instantiate.modular.pattern.editing.support.ESColumnExtension;
import org.miso.wizard.instantiate.modular.pattern.editing.support.ESColumnIcon;
import org.miso.wizard.instantiate.modular.pattern.editing.support.ESColumnName;
import org.miso.wizard.instantiate.modular.pattern.editing.support.ESPackageUnit;
import org.miso.wizard.instantiate.modular.pattern.label.provider.LabelProviderEClassName;
import org.miso.wizard.instantiate.modular.pattern.label.provider.LabelProviderExtension;
import org.miso.wizard.instantiate.modular.pattern.label.provider.LabelProviderIcon;
import org.miso.wizard.instantiate.modular.pattern.label.provider.LabelProviderName;
import org.miso.wizard.instantiate.modular.pattern.label.provider.LabelProviderPackageUnit;

import MetaModelGraph.Composition;
import MetaModelGraph.EnumModular;
import MetaModelGraph.Node;
import MetaModelGraph.Reference;
import MetaModelGraph.Relation;
import MetaModelGraph.SubClass;
import MetaModelGraph.SubGraph;
import MetaModelGraph.impl.MetaModelGraphFactoryImpl;


public class PageSelectPackagesUnits extends WizardPage{

	
	private Tree eTree;
	private TreeViewer eTreeViewer;
	private ScrolledComposite sc;
	private int clientWidth;
	private SubGraph subGraph;
	private EList<EClass> eListEClass;
			
	public PageSelectPackagesUnits(String pageName, EList<EClass> eListEClass, SubGraph subGraph) {
		
		super(pageName);	
		setTitle("Select the Packages and Units");
		setDescription("Select the appropriate class for packages and units");
		this.subGraph = subGraph;
		this.eListEClass = eListEClass;
		clientWidth = 770;
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
		
		sc = new ScrolledComposite(container, SWT.H_SCROLL | SWT.V_SCROLL );
		sc.setLayout(new GridLayout());
		sc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
						
		this.eTree = new Tree (this.sc, SWT.VIRTUAL | SWT.BORDER | SWT.FULL_SELECTION | SWT.NO_SCROLL); 
		this.eTree.setHeaderVisible(true);
		this.eTree.setLinesVisible(true);
		
		//initialize tree viewer
		this.eTreeViewer = new TreeViewer(this.eTree);
		this.eTreeViewer.setUseHashlookup(true);	
		
		
		/*
		 * The following listener ensures that the Tree is always large
		 * enough to not need to show its own vertical scrollbar.
		 */
		
		this.eTree.addTreeListener (new TreeListener () {
			
			@Override
			public void treeExpanded (TreeEvent e) {
				
				eTree.getDisplay().asyncExec(new Runnable() {
		
					@Override
					public void run() {
						int prefHeight = eTree.computeSize (SWT.DEFAULT, SWT.DEFAULT).y;
						eTree.setSize (clientWidth, prefHeight);
						sc.setMinSize(eTree.computeSize(clientWidth,prefHeight));						
					}					
				});
				
			}
		
			@Override
			public void treeCollapsed (TreeEvent e) {
			
				eTree.getDisplay().asyncExec(new Runnable() {
				
					@Override
					public void run() {
						
						int prefHeight = eTree.computeSize (SWT.DEFAULT, SWT.DEFAULT).y;
						eTree.setSize (clientWidth, prefHeight);
						sc.setMinSize(eTree.computeSize(clientWidth,prefHeight));
						
					}
				});
			}
		});
		
		/*
		 * The following listener ensures that a newly-selected item
		 * in the Tree is always visible.
		 */
		
		this.eTree.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				TreeItem [] selectedItems = eTree.getSelection();
				if (selectedItems.length > 0) {
					Rectangle itemRect = selectedItems[0].getBounds();
					Rectangle area = sc.getClientArea();
					Point origin = sc.getOrigin();
					if (itemRect.x < origin.x || itemRect.y < origin.y
							|| itemRect.x + itemRect.width > origin.x + area.width
							|| itemRect.y + itemRect.height > origin.y + area.height) {
						sc.setOrigin(itemRect.x, itemRect.y);
					}
				}
			};
		
		});
		
		/*
		 * The following listener scrolls the Tree one item at a time
		 * in response to MouseWheel events.
		 */
		
		this.eTree.addListener(SWT.MouseWheel, event -> {
			Point origin = sc.getOrigin();
			if (event.count < 0) {
				origin.y = Math.min(origin.y + eTree.getItemHeight(), eTree.getSize().y);
			} else {
				origin.y = Math.max(origin.y - eTree.getItemHeight(), 0);
			}
			sc.setOrigin(origin);
		});	
		
		
		TreeViewerColumn eColumnEClass = new TreeViewerColumn(eTreeViewer, SWT.LEFT);
		eColumnEClass.getColumn().setText("Containment Reference/Class Name");
		eColumnEClass.getColumn().setWidth(300);
		eColumnEClass.setLabelProvider(new LabelProviderEClassName());
		
		TreeViewerColumn eColumnPackageUnit = new TreeViewerColumn(eTreeViewer, SWT.LEFT);
		eColumnPackageUnit.getColumn().setText("Package or Unit");
		eColumnPackageUnit.getColumn().setWidth(150);
		eColumnPackageUnit.setLabelProvider(new LabelProviderPackageUnit());
		eColumnPackageUnit.setEditingSupport(new ESPackageUnit(this.eTreeViewer));
		
		TreeViewerColumn eColumName = new TreeViewerColumn(eTreeViewer, SWT.LEFT);
		eColumName.getColumn().setText("Name");
		eColumName.getColumn().setWidth(150);
		eColumName.setLabelProvider(new LabelProviderName());
		eColumName.setEditingSupport(new ESColumnName(eTreeViewer));
		
		TreeViewerColumn eColumIcon = new TreeViewerColumn(eTreeViewer, SWT.LEFT);
		eColumIcon.getColumn().setText("Icon");
		eColumIcon.getColumn().setWidth(150);
		eColumIcon.setLabelProvider(new LabelProviderIcon());
		eColumIcon.setEditingSupport(new ESColumnIcon(eTreeViewer));
		
		TreeViewerColumn eColumnExtension = new TreeViewerColumn(eTreeViewer, SWT.LEFT);
		eColumnExtension.getColumn().setText("Extension");
		eColumnExtension.getColumn().setWidth(150);
		eColumnExtension.setLabelProvider(new LabelProviderExtension());
		eColumnExtension.setEditingSupport(new ESColumnExtension(eTreeViewer));
		
		Composite containerButtons = new Composite(container, SWT.NONE);
		containerButtons.setLayoutData(new GridData(GridData.BEGINNING));
		containerButtons.setLayout(new GridLayout(2, false));
		
		Button btnHeuristic = new Button(containerButtons, SWT.PUSH);
		btnHeuristic.setText("Execute Heuristic");
		
		btnHeuristic.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			
				annotateProjectPackageAndUnits();
				eTreeViewer.refresh();
			}
			
		});
		
		Button btnClear = new Button(containerButtons, SWT.PUSH);
		btnClear.setText("Clear Heuristic");
		
		btnClear.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
			
				clearHeuristics();	
				eTreeViewer.refresh();
			}
			
		});
		
		container.pack();
		
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setAlwaysShowScrollBars(true);
		sc.setContent(this.eTree);
								
		setControl(container);		
	}
	
	protected void clearHeuristics() {
		
		Iterator<Node> itNodes = subGraph.getNodes().iterator();
		while (itNodes.hasNext()) {
			Node node = (Node) itNodes.next();
			node.getEnumModularNotation().clear();			
		}	
		
		annotateProject();
	}

	@Override
	public boolean canFlipToNextPage() {
		
		if(this.subGraph.getNodes().size()==1)		
			fillTreeOfContainments();
		fillWidgetTree();
		return super.canFlipToNextPage();
	}

	private void fillTreeOfContainments() {
		
		if(this.subGraph.getRoot()!=null)
		{
			Map<EClass, Node> mapElements = new ConcurrentHashMap<EClass, Node>();
			mapElements.put(this.subGraph.getRoot().getEClass(), subGraph.getRoot());	
			
			ArrayList<EClass> arrayEAllClasses = new ArrayList<EClass>(Arrays.asList(this.subGraph.getRoot().getEClass()));
									
			for (int i = 0; i < arrayEAllClasses.size(); i++) {
				
				EClass eClass = arrayEAllClasses.get(i);					
				Iterator<EReference> itEAllReferences = eClass.getEAllContainments().iterator();
				Node sourceNode = mapElements.get(eClass);
				
				//Take into account the SubClasses of the Node
				SubClasses(sourceNode,subGraph,arrayEAllClasses,mapElements,this.eListEClass);
				
				while (itEAllReferences.hasNext()) {
					
					EReference eReference = (EReference) itEAllReferences.next();
					EClassifier eClassifier = eReference.getEType();
					
					if(eClassifier instanceof EClass){
						
						EClass eClassType = (EClass) eClassifier;
						//Search in the Map of Elements
						Node node = mapElements.get(eClassType);
						if(node == null){
							
							node = MetaModelGraphFactoryImpl.eINSTANCE.createNode();
							node.setEClass(eClassType);
							subGraph.getNodes().add(node);
							mapElements.put(eClassType, node);
							arrayEAllClasses.add(eClassType);
							//SubClasses
							//SubClasses(node,subGraph,arrayEAllClasses,mapElements,this.eListEClass);									
						}					
						
						Relation eRelation = null;
						if(eReference.isContainment()){
						
							eRelation = MetaModelGraphFactoryImpl.eINSTANCE.createComposition();
							((Composition)eRelation).setEReference(eReference);	
							eRelation.setTarget(node);
							sourceNode.getCompositions().add((Composition) eRelation);
												
						}else{
							
							eRelation = MetaModelGraphFactoryImpl.eINSTANCE.createReference();
							((Reference)eRelation).setEReference(eReference);
							eRelation.setTarget(node);
							sourceNode.getReferences().add((Reference) eRelation);
						}
						
						subGraph.getRelations().add(eRelation);						
					}						
				}				
			}							
			
			annotateProject();
			fillWidgetTree();			
		}	
		
	}
	
	private void SubClasses(Node node, SubGraph subGraph, ArrayList<EClass> arrayEAllClasses,
			Map<EClass, Node> mapElements, EList<EClass> eClassesList) {
		
		Iterator<EClass> itListClasses = eClassesList.iterator();
		EClass eClassP = node.getEClass();
		while (itListClasses.hasNext()) {
		
			EClass eClass = (EClass) itListClasses.next();
			EList<EClass> listSuper = eClass.getEAllSuperTypes();
			EList<EClass> listDirectSuperClass = eClass.getESuperTypes();
			int index = listSuper.indexOf(eClassP);
			if(index != -1){
				Node subClassNode = mapElements.get(eClass);
				if(subClassNode == null){
					subClassNode = MetaModelGraphFactoryImpl.eINSTANCE.createNode();
					subClassNode.setEClass(eClass);
					subGraph.getNodes().add(subClassNode);
					mapElements.put(eClass, subClassNode);
					arrayEAllClasses.add(eClass);
				}
				SubClass sub = MetaModelGraphFactoryImpl.eINSTANCE.createSubClass();
				sub.setTarget(subClassNode);
				subGraph.getRelations().add(sub);
				node.getSubClasses().add(sub);
				if(listDirectSuperClass.indexOf(eClassP)!=-1)
					node.getDirectSubclasses().add(sub);
			}
		}		
		
	}
	
	private void annotateProject(){
		
		//Project 
		this.subGraph.getRoot().getEnumModularNotation().add(EnumModular.PROJECT);
					
		boolean existRecursion = detectRecursion(subGraph.getRoot());
		if(existRecursion == true)
			this.subGraph.getRoot().getEnumModularNotation().add(EnumModular.PACKAGE);		
		
	}

	private void annotateProjectPackageAndUnits() {
		
			
		boolean existRecursion = false;
		EList<Node> eListAllNodes = new BasicEList<Node>();
		eListAllNodes.add(subGraph.getRoot());
				
		for (int i = 0; i < eListAllNodes.size(); i++){
					
			Node sourceNode = eListAllNodes.get(i);
			if(sourceNode.equals(subGraph.getRoot())){
				
				//Analyze Compositions
				Iterator<Composition> itCompositions = sourceNode.getCompositions().iterator();
				while (itCompositions.hasNext()) {
					
					Composition composition = (Composition) itCompositions.next();
					Node currentNode = composition.getTarget();
					existRecursion = detectRecursion(currentNode);
					if(existRecursion==true){
						currentNode.getEnumModularNotation().add(EnumModular.PACKAGE);//RECURSION_PACKAGE
						
						if(eListAllNodes.indexOf(currentNode)==-1)
							eListAllNodes.add(currentNode);
					}
					else
					{
						boolean hasComp = hasCompositionLevel(currentNode,0);
						if(hasComp==true){
							
							currentNode.getEnumModularNotation().add(EnumModular.PACKAGE);
							
							if(eListAllNodes.indexOf(currentNode)==-1)
								eListAllNodes.add(currentNode);
						}
						else
							AnnotateUnit(currentNode);						
					}
				}
						
			}else{
						
				boolean hasCompo = hasCompositionLevel(sourceNode, 0);
				if(hasCompo == true){
					
					//Analyze Compositions
					Iterator<Composition> itCompositions = getAllCompositions(sourceNode).iterator();				
					while (itCompositions.hasNext()) {
						Composition composition = (Composition) itCompositions.next();
						Node currentNode = composition.getTarget();
						if(sourceNode.getEnumModularNotation().indexOf(EnumModular.PACKAGE)!=-1){//RECURSION_PACKAGE
							if(currentNode.getEClass().isAbstract() == false){
								currentNode.getEnumModularNotation().add(EnumModular.UNIT);
								
							}
							else
								AnnotateUnit(currentNode);							
						}
						else{
							existRecursion = detectRecursion(currentNode);
							if (existRecursion==true) {							
								currentNode.getEnumModularNotation().add(EnumModular.PACKAGE);//RECURSION_PACKAGE
								
							}
							else{
								boolean hasComp = hasCompositionLevel(currentNode,1);
								if(hasComp==true){
									currentNode.getEnumModularNotation().add(EnumModular.PACKAGE);	
									
								}
								else{
									currentNode.getEnumModularNotation().add(EnumModular.UNIT);
									
								}
							}
							if(eListAllNodes.indexOf(currentNode)==-1)
								eListAllNodes.add(currentNode);
						}
					}
							
					Iterator<SubClass> itAllSubClasses = sourceNode.getSubClasses().iterator();
					while (itAllSubClasses.hasNext()) {
						SubClass subClass = (SubClass) itAllSubClasses.next();
						
							if(eListAllNodes.indexOf(subClass.getTarget())==-1)
								eListAllNodes.add(subClass.getTarget());
														
					}
							
					existRecursion = detectRecursion(sourceNode);
					if(existRecursion == true){					
						
						sourceNode.getEnumModularNotation().add(EnumModular.PACKAGE);//RECURSION_PACKAGE
						
					}
					else{
						sourceNode.getEnumModularNotation().add(EnumModular.PACKAGE);
						
					}
				}
				else{
					
					AnnotateUnit(sourceNode);
				}				
				
			}
		}	
		
	}	
	
	private void AnnotateUnit(Node node){
		
		boolean existRecursion = detectRecursion(node);
		if(existRecursion == false)
				node.getEnumModularNotation().add(EnumModular.UNIT);				
		else{
			node.getEnumModularNotation().add(EnumModular.UNIT);//RECURSION_UNIT			
		}
		Iterator<SubClass> itAllSubClasses = node.getSubClasses().iterator();
		while (itAllSubClasses.hasNext()) {
			SubClass subClass = (SubClass) itAllSubClasses.next();
			existRecursion = detectRecursion(subClass.getTarget());
			if(existRecursion==false)
			{
				subClass.getTarget().getEnumModularNotation().add(EnumModular.UNIT);				
			}
			else{
				
				subClass.getTarget().getEnumModularNotation().add(EnumModular.UNIT);//RECURSION_UNIT				
			}			
		}		
	}
	
	private boolean detectRecursion(Node node) {
		
		EList<Node> listOfNodes = new BasicEList<Node>();
		listOfNodes.add(node);
		for (int i = 0; i < listOfNodes.size(); i++) {

			Node currentNode = listOfNodes.get(i);
			Iterator<Composition> itCompositions =  getAllCompositions(currentNode).iterator();
			while (itCompositions.hasNext()) {
				Composition composition = (Composition) itCompositions.next();
				Node target = composition.getTarget();
				if(target.equals(node) ^ isSubEClass(target, node)==true)
					return true;
				else{
					if(listOfNodes.indexOf(target)==-1)
						listOfNodes.add(target);
				}				
			}			
		}		
		return false;
	}
	
	private boolean isSubEClass(Node parent,Node children){
		
		Iterator<SubClass> itSubClasses = parent.getSubClasses().iterator();
		while (itSubClasses.hasNext()) {
			SubClass subClass = (SubClass) itSubClasses.next();
			if(subClass.getTarget().equals(children))
				return true;
		}
		return false;
	}
	
	
	private EList<Composition> getDirectAllCompositions(Node node){
		
		EList<Composition> eListCompositions = new BasicEList<Composition>();
		eListCompositions.addAll(node.getCompositions());	
				
		return eListCompositions;
	}
	
	private EList<Composition> getAllCompositionSubClass(Node node){
		
		EList<Composition> eListCompositions = new BasicEList<Composition>();
				
		Iterator<SubClass> itAllSubClasses = node.getSubClasses().iterator();
		while (itAllSubClasses.hasNext()) {
			SubClass subClass = (SubClass) itAllSubClasses.next();
			eListCompositions.addAll(subClass.getTarget().getCompositions());
		}
				
		return eListCompositions;		
	}
	
	private EList<Composition> getAllCompositions(Node node){
		
		EList<Composition> eListCompositions = new BasicEList<Composition>();
		eListCompositions.addAll(getDirectAllCompositions(node));
		eListCompositions.addAll(getAllCompositionSubClass(node));
		
		return eListCompositions;
	}
	
	/*
	 * True has composition to unvisited node 
	 * False has no composition
	 * */
	private boolean hasCompositionLevel(Node node,int level){
	
		Iterator<Composition> itCompositions = getAllCompositions(node).iterator();
		if(itCompositions.hasNext() == false)
			return false;
		while (itCompositions.hasNext()) {
			Composition composition = (Composition) itCompositions.next();
			Node currentNode = composition.getTarget();			
			if(currentNode.equals(node) == false){	
							
				if(currentNode.getEnumModularNotation().equals(EnumModular.DEFAULT) || level==1)
					return true;			
				else
					return hasCompositionLevel(currentNode, 1);
			}		
		}		
		return false;
	}

	private void fillWidgetTree() {
		
		deleteWidgetTree();
		
		this.eTreeViewer.setContentProvider(new GraphContentProvider(this.eTreeViewer));
		
		ArrayList<Object> arrayObjects = new ArrayList<Object>();
		arrayObjects.add(this.subGraph.getRoot());
		arrayObjects.addAll(this.subGraph.getRoot().getCompositions());
		
		this.eTreeViewer.setInput(arrayObjects.toArray());
			
		this.eTreeViewer.expandToLevel(2);
				
		int prefHeight = eTree.computeSize (SWT.DEFAULT, SWT.DEFAULT).y;
		this.eTree.setSize (this.clientWidth, prefHeight);
		this.sc.setMinSize(this.eTree.computeSize(this.clientWidth,prefHeight));
	}

	private void deleteWidgetTree() {
		
		this.eTree.setRedraw(false);
		this.eTree.removeAll();
		this.eTree.setRedraw(true);
	}
		
	public SubGraph getSubGraph() {
		return subGraph;
	}
}
