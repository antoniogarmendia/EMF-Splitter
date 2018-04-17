package org.mondo.visualization.ui.page.diagram.element;

import graphic_representation.AllElements;
import graphic_representation.DiagramElement;
import graphic_representation.Layer;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.RepresentationDD;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.events.TreeListener;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.mondo.visualization.ui.page.RootSelectionDialog;
import org.mondo.visualization.ui.page.EditingSupport.ESActivate;
import org.mondo.visualization.ui.page.EditingSupport.ESEClass;
import org.mondo.visualization.ui.page.EditingSupport.ESIconPalette;
import org.mondo.visualization.ui.page.EditingSupport.ESPalette;
import org.mondo.visualization.ui.page.EditingSupport.ESType;
import org.mondo.visualization.ui.page.LabelProvider.CActivate;
import org.mondo.visualization.ui.page.LabelProvider.CEClass;
import org.mondo.visualization.ui.page.LabelProvider.CIconPalette;
import org.mondo.visualization.ui.page.LabelProvider.CPalette;
import org.mondo.visualization.ui.page.LabelProvider.CType;
import org.mondo.visualization.ui.wizard.WizardConcreteVisualization;

import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.HeuristicStrategySettings;

public class PageDiagramElements extends WizardPage {
	
	private Composite container;
	//Scrolled Composite
	private ScrolledComposite sc;
	private int clientwidth;
	//Tree 
	private TreeViewer treeViewer;
	private Tree tree;
	
	//Columns
	private TreeViewerColumn col_eclass;
	private TreeViewerColumn col_activate;
	private TreeViewerColumn col_type;
	private TreeViewerColumn col_palette;
	private TreeViewerColumn col_iconPalette;
	
	//Controls
	private Text root_class;
	private int representation;
	private int currentMMGR;
	
	private Text txt_extension;
	private org.eclipse.swt.widgets.List listOfWarning;
			
	public PageDiagramElements(String pageName) {
		super(pageName);
		representation = 0;
		currentMMGR = 0;
		clientwidth = 774;
		setTitle("Define Diagram Elements for MetaModel");
		setDescription("Select the Representation of each class");	
	}

	@Override
	public void createControl(Composite parent) {
		
		//Define Container
		container = new Composite(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		
		Label label_project = new Label(container, SWT.NONE);
		label_project.setText("Root Class: ");
		
		root_class = new Text(container, SWT.BORDER | SWT.SINGLE);
		root_class.setText("Undetected Root");
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		root_class.setLayoutData(gd);
		
		Button btn_selectroot = new Button(container,SWT.None);
		btn_selectroot.setText("Select Root Class...");
		
		btn_selectroot.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				RootSelectionDialog dlg = new RootSelectionDialog(getShell(), Get_LabelProvider());
				dlg.setTitle("Select the Root Class");
				dlg.setMessage("Select a String (* = any string, ? = any char):");
				dlg.setElements(getHeuristicStrategy().getNemf().getList_classes().toArray());
				
				if(dlg.open() == Dialog.OK)
				{
					EClass cls = (EClass) dlg.getFirstResult();
					((RepresentationDD)getHeuristicStrategy().getGraphic_representation().
							getAllGraphicRepresentation().get(getCurrentMMGR()).
									getListRepresentations().get(getRepresentation())).getRoot().setAnEClass(cls);
					//Reset the Graphic Representation
					if(dlg.isExecHeuristicBoolean() == true){
						getHeuristicStrategy().Execute_Graphical_Elements();
						listOfWarning.removeAll();
					}						
					else{
						ValidateAll();					
					}
					//Reset all information
					Fill_Tree();
				}				
			}
			
		});	
		
		//List of nodes
		Label label_listnodes = new Label(container, SWT.TOP);
		label_listnodes.setText("List of Nodes");
		
		Create_Tree();
		new Label(container, SWT.TOP);
		//Extension
		Label label_extension = new Label(container, SWT.TOP);
		label_extension.setText("Extension");
		
		txt_extension = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd_ext = new GridData();
		gd_ext.widthHint = 170;		
		txt_extension.setLayoutData(gd_ext);
		
		txt_extension.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				getGraphicRepresentation().setExtension(txt_extension.getText());
			}
			
			@Override
			public void focusGained(FocusEvent e) {
								
			}
		});
		
		new Label(container, SWT.TOP);
				
		//Warnings 
		Label lbl_warning = new Label(container, SWT.TOP);
		lbl_warning.setText("Warnings");
		
		listOfWarning = new org.eclipse.swt.widgets.List(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		GridData layoutList = new GridData();
		layoutList.widthHint = 400;
		layoutList.heightHint = 50;
		listOfWarning.setLayoutData(layoutList);
		
		CreateMenu();
		
		setControl(container);
		setPageComplete(true);
	}
		
	public void Create_Tree(){
		
		sc = new ScrolledComposite(container, SWT.V_SCROLL);
		sc.setLayout(new GridLayout());
		sc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		tree = new Tree(sc, SWT.VIRTUAL | SWT.BORDER | SWT.NO_SCROLL | SWT.FULL_SELECTION | SWT.MULTI ); 
		//tree.
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		treeViewer = new TreeViewer(tree);
		treeViewer.setUseHashlookup(true);
								
		//GridLayout for Rows
		GridLayout layoutTree = new GridLayout();
		layoutTree.numColumns = 6;
		layoutTree.marginWidth = 180;
		layoutTree.horizontalSpacing = 20;
		layoutTree.verticalSpacing = 20;
		layoutTree.marginHeight = 80;
		tree.setLayoutData(layoutTree);
		//End
				
		//EClass Column
		col_eclass = new TreeViewerColumn(treeViewer, SWT.LEFT);
		col_eclass.getColumn().setWidth(180);
		col_eclass.getColumn().setText("Layers");
				
		//Activate the class to assign visualization 
		col_activate = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_activate.getColumn().setWidth(130);
		col_activate.getColumn().setText("Diagram Element");
		
		//Type Column
		col_type = new TreeViewerColumn(treeViewer, SWT.LEFT);
		col_type.getColumn().setWidth(100);
		col_type.getColumn().setText("Type");
				
		//Palette Column
		col_palette = new TreeViewerColumn(treeViewer, SWT.LEFT);
		col_palette.getColumn().setWidth(180);
		col_palette.getColumn().setText("Palette");
		
		//Icon Palette
		col_iconPalette = new TreeViewerColumn(treeViewer, SWT.NONE);
		col_iconPalette.getColumn().setWidth(170);
		col_iconPalette.getColumn().setText("Icon Palette");
				
		/*
		 * The following listener ensures that the Tree is always large
		 * enough to not need to show its own vertical scrollbar.
		 */
		tree.addTreeListener (new TreeListener () {
			
			@Override
			public void treeExpanded (TreeEvent e) {
				
				tree.getDisplay().asyncExec(new Runnable() {
						
						@Override
						public void run() {
							
							if(!tree.isDisposed()){
								int prefHeight = tree.computeSize (SWT.DEFAULT, SWT.DEFAULT).y;
								tree.setSize (clientwidth, prefHeight);
								sc.setMinSize(tree.computeSize(clientwidth,prefHeight));
							}
						}
					});			
			}
			
			@Override
			public void treeCollapsed (TreeEvent e) {
				
				tree.getDisplay().asyncExec(new Runnable() {
					
						@Override
						public void run() {
							
							if(!tree.isDisposed()){
								int prefHeight = tree.computeSize (SWT.DEFAULT, SWT.DEFAULT).y;
								tree.setSize (clientwidth, prefHeight);
								sc.setMinSize(tree.computeSize(clientwidth,prefHeight));
							}
						}
					});
				}
			
			
			});		
		
			
			/*
			 * The following listener scrolls the Tree one item at a time
			 * in response to MouseWheel events.
			 */
			tree.addListener(SWT.MouseWheel, new Listener() {
				@Override
				public void handleEvent(Event event) {
					Point origin = sc.getOrigin();
					if (event.count < 0) {
						origin.y = Math.min(origin.y + tree.getItemHeight(), tree.getSize().y);
					} else {
						origin.y = Math.max(origin.y - tree.getItemHeight(), 0);
					}
					sc.setOrigin(origin);
				}
			});
			
			/*
			 * The following listener specify width 
			 * and height of a cell's content
			 * */
			
			tree.addListener(SWT.MeasureItem, new Listener() {
				
				@Override
				public void handleEvent(Event event) {
					
					int clientWidth = tree.getClientArea().width;
					event.height = event.gc.getFontMetrics().getHeight() + 10;
					event.width = clientWidth + 10;
				}
			});			
			
			//CreateMenu();
			
			sc.setExpandHorizontal(true);
			sc.setExpandVertical(true);
			sc.setAlwaysShowScrollBars(true);
			sc.setContent(tree);			
	}	
	
	public void Fill_Tree(){
		
 		EObject asd = (EObject)getGraphicRepresentation();
		
 		Object asd1 = asd.eResource();
 		
		EClass rootEClass = ((RepresentationDD)getGraphicRepresentation().getListRepresentations().get(getCurrentRepresentation())).getRoot().getAnEClass();
		if(rootEClass != null)
		{
			root_class.setText(rootEClass.getName());			
		}
		else
		{
			root_class.setText("Undetected Root");
		}
		
		txt_extension.setText(getGraphicRepresentation().getExtension());
		
		Delete_Tree();	
		
		col_eclass.setLabelProvider(new CEClass());
		col_eclass.setEditingSupport(new ESEClass(treeViewer));
		
		col_activate.setLabelProvider(new CActivate());
		col_activate.setEditingSupport(new ESActivate(treeViewer));
		
		
		col_type.setLabelProvider(new CType());
		col_type.setEditingSupport(new ESType(treeViewer));
		
		
		col_palette.setLabelProvider(new CPalette());		
		col_palette.setEditingSupport(new ESPalette(treeViewer));
		
		col_iconPalette.setLabelProvider(new CIconPalette());
		col_iconPalette.setEditingSupport(new ESIconPalette(treeViewer));
		
		treeViewer.setContentProvider(new GraphicTreeContentProvider());
		
		//Update the Classes that are not part of the diagram
		updateNoElements();		
		
		treeViewer.setInput(new Object[]{getGraphicRepresentation().getListRepresentations().get(getRepresentation()),
										getHeuristicStrategySettings().getStrategy_possibleElements()});	
		
		//Expand Layers
		treeViewer.expandToLevel(2);
		
		int prefHeight = tree.computeSize (SWT.DEFAULT, SWT.DEFAULT).y + (8 * GetSize(getGraphicRepresentation()));
		tree.setSize (clientwidth, prefHeight);
		sc.setMinSize(tree.computeSize(clientwidth,prefHeight));		
	}
	
	//Update the EClass that which are not part of diagram
	private void updateNoElements() {
		
		if (((WizardConcreteVisualization)getWizard()).isUpdateGraphicR() == true) {
			
			getHeuristicStrategy().ExecuteDirectPathMatrix();
			Iterator<EClass> itEClass = ((WizardConcreteVisualization)getWizard()).getHeuristicStrategy().getNemf().getList_classes().iterator();
			while (itEClass.hasNext()) {
				EClass eClass = (EClass) itEClass.next();
				if(isDiagramElement(eClass) == false)
					getHeuristicStrategySettings().getStrategy_possibleElements().getEClassNoElements().add(eClass);
			}	
			ValidateAll();
		}		
	}
	
	//Search if the EClass is part of the diagram
	private boolean isDiagramElement(EClass anEClass) {
		
		
		Iterator<Layer> iteratorLayers = ((RepresentationDD)getGraphicRepresentation().getListRepresentations().get(getRepresentation())).getLayers().iterator();
		while (iteratorLayers.hasNext()) {
			Layer layer = (Layer) iteratorLayers.next();
			Iterator<AllElements> allElements = layer.getElements().iterator();
			while (allElements.hasNext()) {
				AllElements currentElement = (AllElements) allElements.next();
				if(currentElement instanceof DiagramElement) {
					DiagramElement diag = (DiagramElement) currentElement;
					if(diag.getAnEClass().equals(anEClass))
						return true;
				}
			}			
		}
		return false;
	}

	int GetSize(MMGraphic_Representation gR)
	{
		int count = ((RepresentationDD)gR.getListRepresentations().get(getCurrentRepresentation())).getLayers().size();
		Iterator<Layer> layers = ((RepresentationDD)gR.getListRepresentations().get(getCurrentRepresentation())).getLayers().iterator();
		while (layers.hasNext()) {
			Layer type = layers.next();
			count = count + type.getElements().size();
		}
		return count;
	}
		
	public void Delete_Tree(){
		
		tree.setRedraw(false);
		tree.removeAll();
		tree.setRedraw(true);		
	}
	
	public HeuristicStrategy getHeuristicStrategy(){
		
		WizardConcreteVisualization wizard = (WizardConcreteVisualization)getWizard();
		return wizard.getHeuristicStrategy();
	}
	
	public HeuristicStrategySettings getHeuristicStrategySettings() {
		return getHeuristicStrategy().getListRepresentation().get(getCurrentMMGR()).
				getHeuristicStrategySettings().get(getRepresentation());
	}
	
	public MMGraphic_Representation getGraphicRepresentation(){
		return getHeuristicStrategy().getGraphic_representation().getAllGraphicRepresentation().get(getCurrentMMGR());
	}
		
	protected ILabelProvider Get_LabelProvider()
	{
		return new ILabelProvider() {
			
			@Override
			public void removeListener(ILabelProviderListener listener) {
								
			}
			
			@Override
			public boolean isLabelProperty(Object element, String property) {
				
				return false;
			}
			
			@Override
			public void dispose() {
								
			}
			
			@Override
			public void addListener(ILabelProviderListener listener) {
						
			}
			
			@Override
			public String getText(Object element) {
				
				EClass anEClass = (EClass) element;
				return anEClass.getName();
			}
			
			@Override
			public Image getImage(Object element) {
				
				getShell().getDisplay();
				Device device = Display.getCurrent();
				return new Image(device, PageDiagramElements.class.getProtectionDomain().getCodeSource().getLocation().getFile().toString().concat("/icons/EClass.gif"));
			}
		};
	}
	
	
	public void CreateMenu()
	{
		
		ActionTreePageDiagramElements allActions = new ActionTreePageDiagramElements(getTreeViewer(), "com.wizard.visualization",
							getShell(), getHeuristicStrategy(), getHeuristicStrategySettings(),getGraphicRepresentation().getListRepresentations().get(getCurrentRepresentation())
							,listOfWarning);		
		allActions.Execute();		
	}
	
	
	
	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	@Override
	public boolean canFlipToNextPage() {
		
		Fill_Tree();
		return super.canFlipToNextPage();
	}
	
	public int getRepresentation() {
		return representation;
	}

	public void setRepresentation(int representation) {
		this.representation = representation;
	}
	
	public void ValidateAll()
	{
		Iterator<Layer> layers = ((RepresentationDD)getGraphicRepresentation().getListRepresentations().get(getCurrentRepresentation())).getLayers().iterator();
		EClass rootEClass = ((RepresentationDD)getGraphicRepresentation().getListRepresentations().get(getCurrentRepresentation())).getRoot().getAnEClass();
		while (layers.hasNext()) {
			Layer lay = layers.next();
			Iterator<AllElements> itDiagramElements = lay.getElements().iterator();
			while (itDiagramElements.hasNext()) {
				AllElements element = itDiagramElements.next();
				if(element instanceof DiagramElement){
				DiagramElement diagElement = (DiagramElement) element;
				if(ActionTreePageDiagramElements.PossibleElement(rootEClass, getHeuristicStrategy().getEcoreContainment().getPathMatrix(),
						getHeuristicStrategy().getNemf().getList_classes(), diagElement.getAnEClass()) == false)
				{
					listOfWarning.add("- " + diagElement.getAnEClass().getName() + " - This class is not contained in the root");
				}
				}
			}
		}
	}
	
	public int getCurrentMMGR() {
		return currentMMGR;
	}

	public void setCurrentMMGR(int currentMMGR) {
		this.currentMMGR = currentMMGR;
	}	
	
	public int getCurrentRepresentation()
	{
		return this.representation;
	}
	
	public void setCurrentRepresentation(int representation)
	{
		this.representation = representation;
	}	
	
}
