package org.mondo.miso.table.ui.wizard.pages;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.mondo.miso.table.ui.wizard.WizardDefineTableVisualization;
import org.mondo.miso.table.ui.wizard.pages.editing.support.ESFeatureColumn;
import org.mondo.miso.table.ui.wizard.pages.labelProvider.CFeatureColumn;

import graphic_representation.Graphic_representationFactory;
import graphic_representation.LineGroup;
import graphic_representation.RepresentationTable;
import splitterLibrary.EcoreEMF;

public class PageDefineTableRepresentation extends WizardPage{

	private Text root_class;
	private TreeViewer treeViewer;
	private Tree tree;
	private int pos;
	
	//Columns
	private TreeViewerColumn col_LinesColumns;
	
	public PageDefineTableRepresentation(String pageName) {
		
		super(pageName);		
		setTitle("Define Table Elements for MetaModel");
		setDescription("Select the Table Representation");
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		Composite container = new Composite(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout(3,true);
		container.setLayout(layout);
		
		Label label_project = new Label(container, SWT.NONE);
		label_project.setText("Table Root Class: ");
		
		root_class = new Text(container, SWT.BORDER | SWT.SINGLE);
		root_class.setText("Undetected Root");
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		root_class.setLayoutData(gd);
		
		Button btn_selectroot = new Button(container,SWT.None);
		btn_selectroot.setText("Select Table Class...");
			
		btn_selectroot.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				ElementListSelectionDialog dlgElements = new ElementListSelectionDialog(getShell(), Get_LabelProvider());
				dlgElements.setTitle("Select Table Class");
				dlgElements.setMessage("Select a String (* = any string, ? = any char):");
				dlgElements.setElements(getEcoreEMF().getList_classes().toArray());
				
				if(dlgElements.open() == Dialog.OK)
				{
					EClass cls = (EClass) dlgElements.getFirstResult();
					getRepresentationTable().getLines().clear();
					getRepresentationTable().setRootTable(cls);
					Fill_Tree();
				}
			}		
			
		});
		
		
		Composite treeContainer = new Composite(container, SWT.NONE);
		treeContainer.setLayout(new GridLayout());
		
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.horizontalSpan = 3;
		data.grabExcessHorizontalSpace = true;
		treeContainer.setLayoutData(data);
		
		Create_Tree(treeContainer);
		Fill_Tree();
		setControl(container);	
		setPageComplete(false);
	}
	
	public void Create_Tree(Composite parent)
	{
		//Scrolled Composite
		ScrolledComposite sc = new ScrolledComposite(parent, SWT.V_SCROLL);
		sc.setLayout(new FillLayout());//new GridLayout()
		sc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		tree = new Tree(sc, SWT.VIRTUAL | SWT.BORDER | SWT.CHECK ); 
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		treeViewer = new TreeViewer(tree);
		treeViewer.setUseHashlookup(true);
			
		GridData treedata = new GridData(SWT.FILL, SWT.FILL, true, true);
		tree.setLayoutData(treedata);
		tree.setLayout(new FillLayout());
			
		//EClass Column
		col_LinesColumns = new TreeViewerColumn(treeViewer, SWT.LEFT);
		col_LinesColumns.getColumn().setWidth(180);
		col_LinesColumns.getColumn().setText("Lines and Columns");
		
		//Listener
		tree.addListener(SWT.Selection, event ->{
			 if (event.detail == SWT.CHECK) {
				 TreeItem item = (TreeItem) event.item;
				 Object anEObject = item.getData();
				 boolean checked = item.getChecked();
				 if(anEObject instanceof EAttribute)
				 {
					 if(checked == true)
					 {
						 CheckAllParent(item);
						 setPageComplete(true);
					 }	 
					 else
					 {
						 UnCheckAllParent(item);
						 CheckPageComplete();
					 }
				 }
				 else
				 {
					 item.setChecked(false);
					 UnCheckAllParent(item);
					 UnCheckAllChildren(item);
				 }				 
				 //System.out.println("Check!!");
			 }
		});			
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setAlwaysShowScrollBars(true);
		sc.setContent(tree);
			
	}	
	
	public void UnCheckAllChildren(TreeItem item)
	{
		TreeItem[] items = item.getItems();
		for (int i = 0; i < items.length; i++) {
			TreeItem treeItem = items[i];
			treeItem.setChecked(false);
			UnCheckAllChildren(treeItem);
		}
	}
	
	public void CheckPageComplete()
	{
		TreeItem[] items = tree.getItems();
		for (int i = 0; i < items.length; i++) {
			TreeItem treeItem = items[i];
			if(treeItem.getChecked() == true)
				break;
			else
				if(i+1>=items.length)
				{
					setPageComplete(false);
				}
		}
	}
	
	public void CheckAllParent(TreeItem item)
	{
		TreeItem parent = item.getParentItem();
		if(parent!=null)
		{
			if(parent.getChecked() == false)
			{
				parent.setChecked(true);
				CheckAllParent(parent);
			}
		}
	}
	
	public void UnCheckAllParent(TreeItem item) {
		
		TreeItem parent = item.getParentItem();
		if(parent!=null)
		{
			if(parent.getChecked() == true)
			{
				TreeItem[] items = parent.getItems();
				int count = items.length;
				TreeItem itemChild = null;
				for (int i = 0; i < count; i++) {
					itemChild = items[i];
					if(itemChild.getChecked() == true)
						break;
					else
						if(i+1==count)
						{
							parent.setChecked(false);
							UnCheckAllParent(parent);
						}
				}
			}
		}
		
	}
	
	public void Fill_Tree()
	{
		EClass rootTableClass = getRepresentationTable().getRootTable();
		if(rootTableClass!=null)
		{
			root_class.setText(rootTableClass.getName());
			RefreshRepresentationTable();
						
			Delete_Tree();	
			//Columns
			col_LinesColumns.setLabelProvider(new CFeatureColumn());
			col_LinesColumns.setEditingSupport(new ESFeatureColumn(treeViewer));
			//TreeViewer
			treeViewer.setContentProvider(new TableTreeContentProvider());
			treeViewer.setInput(getRepresentationTable().getLines().toArray(new Object[]{}));
		}
		else
		{
			root_class.setText("Undetected Root");
		}
	}	
	
	public void Delete_Tree()
	{
		tree.setRedraw(false);
		tree.removeAll();
		tree.setRedraw(true);
	}
	
	public void RefreshRepresentationTable()
	{
		Iterator<EReference> itReferences = getRepresentationTable().getRootTable().getEAllReferences().iterator();
		while (itReferences.hasNext()) {
			EReference eReference = (EReference) itReferences.next();
			LineGroup l = Graphic_representationFactory.eINSTANCE.createLineGroup();
			l.setFeatureReference(eReference);
			l.getListEClasses().addAll(getEAllChildrenClasses(getEcoreEMF().getList_classes(), (EClass) eReference.getEType()));
			l.getListEClasses().add((EClass)eReference.getEType());
			getRepresentationTable().getLines().add(l);			
		}		
	}
	
	public RepresentationTable getRepresentationTable()
	{
		return ((WizardDefineTableVisualization)getWizard()).getRepresentationTable(getPos());
	}
		
	public EList<EClass> getEAllChildrenClasses(EList<EClass> listEClasses, EClass anEClass)
	{
		EList<EClass> listChildren = new BasicEList<EClass>();
		Iterator<EClass> itClasses = listEClasses.iterator();
		while (itClasses.hasNext()) {
			EClass eClass = (EClass) itClasses.next();
			EList<EClass> listofSuperTypes = eClass.getEAllSuperTypes();
			if(listofSuperTypes.indexOf(anEClass)!=-1)
				listChildren.add(eClass);
		}
		
		return listChildren;
	}
	
	public EcoreEMF getEcoreEMF()
	{
		return ((WizardDefineTableVisualization)getWizard()).getNemf();
	}
	
	protected ILabelProvider Get_LabelProvider()
	{
		return new ILabelProvider() {

			@Override
			public void addListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean isLabelProperty(Object element, String property) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void removeListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Image getImage(Object element) {
				// TODO Auto-generated method stub
				getShell().getDisplay();
				// TODO Auto-generated method stub
				Device device = Display.getCurrent();
				return new Image(device, PageDefineTableRepresentation.class.getProtectionDomain().getCodeSource().getLocation().getFile().toString().concat("/icons/EClass.gif"));
			}

			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				EClass anEClass = (EClass) element;
				return anEClass.getName();
			}			
		};		
	}

	@Override
	public void setVisible(boolean visible) {
		// TODO Auto-generated method stub
		super.setVisible(visible);
		if(visible == false)
		{
			System.out.println("Hacer cosas!!");			
		}
	}
	
	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;		
	}
	
	public Tree getTree()
	{
		return this.tree;
	}
	
}
