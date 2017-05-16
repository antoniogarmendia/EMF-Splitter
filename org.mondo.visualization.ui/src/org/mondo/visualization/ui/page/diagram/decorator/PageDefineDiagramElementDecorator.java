package org.mondo.visualization.ui.page.diagram.decorator;

import graphic_representation.Layer;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.RepresentationDD;
import graphic_representation.impl.Graphic_representationFactoryImpl;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.events.TreeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.mondo.visualization.ui.page.GraphicDiagramElementContentProvider;
import org.mondo.visualization.ui.page.EditingSupport.ESBorderColor;
import org.mondo.visualization.ui.page.EditingSupport.ESBorderStyle;
import org.mondo.visualization.ui.page.EditingSupport.ESBorderWidth;
import org.mondo.visualization.ui.page.EditingSupport.ESColor;
import org.mondo.visualization.ui.page.EditingSupport.ESDiagramElement;
import org.mondo.visualization.ui.page.EditingSupport.ESDiagramElementDecorator;
import org.mondo.visualization.ui.page.EditingSupport.ESHeight;
import org.mondo.visualization.ui.page.EditingSupport.ESImage;
import org.mondo.visualization.ui.page.EditingSupport.ESPosition;
import org.mondo.visualization.ui.page.EditingSupport.ESWidth;
import org.mondo.visualization.ui.page.LabelProvider.CBorderColor;
import org.mondo.visualization.ui.page.LabelProvider.CBorderStyle;
import org.mondo.visualization.ui.page.LabelProvider.CBorderWidth;
import org.mondo.visualization.ui.page.LabelProvider.CColor;
import org.mondo.visualization.ui.page.LabelProvider.CDiagramElementDecorator;
import org.mondo.visualization.ui.page.LabelProvider.CDiagramElement;
import org.mondo.visualization.ui.page.LabelProvider.CHeight;
import org.mondo.visualization.ui.page.LabelProvider.CImage;
import org.mondo.visualization.ui.page.LabelProvider.CPosition;
import org.mondo.visualization.ui.page.LabelProvider.CWidth;
import org.mondo.visualization.ui.page.diagram.element.PageDiagramElements;
import org.mondo.visualization.ui.wizard.DialogConcreteVisualization;
import org.mondo.visualization.ui.wizard.WizardConcreteVisualization;

import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.impl.DslHeuristicVisualizationFactoryImpl;

public class PageDefineDiagramElementDecorator extends WizardPage{

	private Composite container;
	//Tree 
	private TreeViewer treeViewer;
	private Tree tree;
	
	//Scrolled Composite
	private ScrolledComposite sc;
	private int clientwidth;
	
	//Columns
	private TreeViewerColumn col_eclass;
	private TreeViewerColumn col_decorator;
	private TreeViewerColumn col_width;
	private TreeViewerColumn col_height;
	private TreeViewerColumn col_color;
	private TreeViewerColumn col_borderColor;
	private TreeViewerColumn col_borderStyle;
	private TreeViewerColumn col_borderWidth;
	private TreeViewerColumn col_position;
	private TreeViewerColumn col_image;	
	
	private int representation;
	private int currentMMGR;
	
	public PageDefineDiagramElementDecorator(String pageName) {
		
		super(pageName);		
		representation = 0;
		setTitle("Define the style for the Diagram Elements");
		setDescription("Choose within the defined styles");		
	}

	@Override
	public void createControl(Composite parent) {
			
		//Define Container
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		//End Define Container
		
		CreateTreeViewer(container);
		
		CreateMenu();
		
		setControl(container);
		setPageComplete(true);
	}
	
	private void CreateMenu()
	{
		ActionPageDiagramDecorator allActions = new ActionPageDiagramDecorator(treeViewer, getShell());
		allActions.Execute();
	}

	private void CreateTreeViewer(Composite composite) {
				
		sc = new ScrolledComposite(composite, SWT.V_SCROLL);
		sc.setLayout(new GridLayout());
		sc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		tree = new Tree(sc, SWT.VIRTUAL | SWT.BORDER | SWT.MULTI | SWT.NO_SCROLL | SWT.FULL_SELECTION); 
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		treeViewer = new TreeViewer(tree);
		
		//GridLayout for Rows
		GridLayout layoutTree = new GridLayout();
		layoutTree.numColumns = 2;
		layoutTree.marginWidth = 180;
		layoutTree.horizontalSpacing = 20;
		layoutTree.verticalSpacing = 20;
		layoutTree.marginHeight = 80;
		tree.setLayoutData(layoutTree);
		//End
		
		//EClass Column
		col_eclass = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_eclass.getColumn().setWidth(180);
		col_eclass.getColumn().setText("Class");
		col_eclass.setLabelProvider(new CDiagramElement());
		col_eclass.setEditingSupport(new ESDiagramElement(treeViewer));
		
		//Edge Decorator
		col_decorator = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_decorator.getColumn().setWidth(150);
		col_decorator.getColumn().setText("Shape");
		col_decorator.setLabelProvider(new CDiagramElementDecorator());
		col_decorator.setEditingSupport(new ESDiagramElementDecorator(treeViewer));
		
		//Width Column
		col_width = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_width.getColumn().setWidth(50);
		col_width.getColumn().setText("Width");
		col_width.setLabelProvider(new CWidth());
		col_width.setEditingSupport(new ESWidth(treeViewer));
		
		//Height Column
		col_height = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_height.getColumn().setWidth(50);
		col_height.getColumn().setText("Height");
		col_height.setLabelProvider(new CHeight());
		col_height.setEditingSupport(new ESHeight(treeViewer));
		
		//Color Column
		col_color = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_color.getColumn().setWidth(100);
		col_color.getColumn().setText("Color");
		col_color.setLabelProvider(new CColor());
		col_color.setEditingSupport(new ESColor(treeViewer));
		
		//Border Color Column
		col_borderColor = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_borderColor.getColumn().setWidth(100);
		col_borderColor.getColumn().setText("Border Color");
		col_borderColor.setLabelProvider(new CBorderColor());
		col_borderColor.setEditingSupport(new ESBorderColor(treeViewer));
		
		//Border Style Column
		col_borderStyle = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_borderStyle.getColumn().setWidth(100);
		col_borderStyle.getColumn().setText("Style");
		col_borderStyle.setLabelProvider(new CBorderStyle());
		col_borderStyle.setEditingSupport(new ESBorderStyle(treeViewer));
		
		//Border Width Column
		col_borderWidth = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_borderWidth.getColumn().setWidth(100);
		col_borderWidth.getColumn().setText("Border Width");
		col_borderWidth.setLabelProvider(new CBorderWidth());
		col_borderWidth.setEditingSupport(new ESBorderWidth(treeViewer));
		
		//LabelEAttribute Position
		col_position = new TreeViewerColumn(treeViewer, SWT.NONE);
		col_position.getColumn().setWidth(100);
		col_position.getColumn().setText("Label Position");
		col_position.setLabelProvider(new CPosition());
		col_position.setEditingSupport(new ESPosition(treeViewer));
		
		//Workspace Image
		col_image = new TreeViewerColumn(treeViewer, SWT.CENTER);
		col_image.getColumn().setWidth(300);
		col_image.getColumn().setText("Image Path");
		col_image.setLabelProvider(new CImage());
		col_image.setEditingSupport(new ESImage(treeViewer));
		
		ResizeTree();
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setAlwaysShowScrollBars(true);
		sc.setContent(tree);
		

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
							
							int prefHeight = tree.computeSize (SWT.DEFAULT, SWT.DEFAULT).y;
							tree.setSize (clientwidth, prefHeight);
							sc.setMinSize(tree.computeSize(clientwidth,prefHeight));
						}
					});			
			}
			@Override
			public void treeCollapsed (TreeEvent e) {
				
				tree.getDisplay().asyncExec(new Runnable() {
					
						@Override
						public void run() {
							
							int prefHeight = tree.computeSize (SWT.DEFAULT, SWT.DEFAULT).y;
							tree.setSize (clientwidth, prefHeight);
							sc.setMinSize(tree.computeSize(clientwidth,prefHeight));
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
		
	}

	public void ResizeTree(){		
		tree.setSize(SWT.DEFAULT,SWT.DEFAULT);
	}

	public HeuristicStrategy getHeuristicStrategy() {
		
		WizardConcreteVisualization wizard = (WizardConcreteVisualization)getWizard();
		return wizard.getHeuristicStrategy();
	}	
	
	public MMGraphic_Representation getGraphicRepresentation(){
		return getHeuristicStrategy().getGraphic_representation().getAllGraphicRepresentation().get(getCurrentMMGR());
	}
	
	public void Fill_Tree() {
		
		Delete_Tree();		
		//All Diagram Elements of all layers
		ArrayList<EObject> allDiagramElements = new ArrayList<EObject>();
		Iterator<Layer> itAllLayers = ((RepresentationDD)getGraphicRepresentation().getListRepresentations().get(getRepresentation())).getLayers().iterator();
		Layer lay = ((RepresentationDD)getGraphicRepresentation().getListRepresentations().get(0)).getRoot().getRootLayer();
		if(lay != null)
			allDiagramElements.add(((RepresentationDD)getGraphicRepresentation().getListRepresentations().get(getRepresentation())).getRoot());
		while (itAllLayers.hasNext()) {
			Layer layer = (Layer) itAllLayers.next();
			allDiagramElements.addAll(layer.getElements());			
		}			
		//End
		treeViewer.setContentProvider(new GraphicDiagramElementContentProvider());
		
		treeViewer.setInput(allDiagramElements.toArray());
		
		sc.setMinSize(tree.computeSize(SWT.DEFAULT, SWT.DEFAULT));	
		clientwidth = tree.getSize().x;
	}	

	public void Delete_Tree()
	{
		tree.setRedraw(false);
		tree.removeAll();
		tree.setRedraw(true);
	}

	@Override
	public void setVisible(boolean visible) {
		
		if (visible == true) {
			
			//View			
			((DialogConcreteVisualization)getWizard().getContainer()).getButtonView().setVisible(true);
			((DialogConcreteVisualization)getWizard().getContainer()).getButtonView().addSelectionListener(ButtonViewSelected());
			
			//End View
			Fill_Tree();
		} else {
			
			((DialogConcreteVisualization)getWizard().getContainer()).getButtonView().setVisible(false);
			((DialogConcreteVisualization)getWizard().getContainer()).getButtonView().removeSelectionListener(ButtonViewSelected());
		}	
			
		
		super.setVisible(visible);
	}
	
	public int getRepresentation() {
		return representation;
	}

	public void setRepresentation(int representation) {
		this.representation = representation;
	}

	public int getCurrentMMGR() {
		return currentMMGR;
	}
	
	public void setCurrentMMGR(int i) {
		
		currentMMGR = i; 
	}
	
	public SelectionAdapter ButtonViewSelected()
	{
		return new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				PageDiagramElements elements = new PageDiagramElements("Choose the Diagram Elements");
				PageDefineDiagramElementDecorator decorator = new PageDefineDiagramElementDecorator("Choose the Decorators for the Nodes, Edges and Links");
				elements.setCurrentMMGR(getCurrentMMGR());
				decorator.setCurrentMMGR(getCurrentMMGR()); 
				elements.setRepresentation(getRepresentation() + 1);
				decorator.setRepresentation(getRepresentation() + 1);
				
				getGraphicRepresentation().getListRepresentations().add(Graphic_representationFactoryImpl.eINSTANCE.createRepresentationDD());
				getHeuristicStrategy().setCurrentRepresentation(getRepresentation() + 1);
				getHeuristicStrategy().getListRepresentation().get(getCurrentMMGR()).getHeuristicStrategySettings().
							add(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategySettings());				
				
				getHeuristicStrategy().Execute_Root_Element();
				getHeuristicStrategy().Execute_Graphical_Elements();
				((Wizard)getWizard()).addPage(elements);
				((Wizard)getWizard()).addPage(decorator);
				
				IWizardContainer wiz = getWizard().getContainer();
				if(wiz instanceof DialogConcreteVisualization)
				{
					DialogConcreteVisualization dialog = (DialogConcreteVisualization) wiz;
					dialog.showPage(elements);					
				}					
			}			
		};
	}	
}
