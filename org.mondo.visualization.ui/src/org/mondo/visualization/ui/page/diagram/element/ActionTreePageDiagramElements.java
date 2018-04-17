package org.mondo.visualization.ui.page.diagram.element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.HeuristicStrategySettings;
import graphic_representation.AdditionalLayer;
import graphic_representation.AffixedElement;
import graphic_representation.CompartmentElement;
import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.EdgeLabelEAttribute;
import graphic_representation.LabelEAttribute;
import graphic_representation.Layer;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Representation;
import graphic_representation.RepresentationDD;
import graphic_representation.Root;

public class ActionTreePageDiagramElements {
	
	private TreeViewer treeViewer;
	private MenuManager menuMgr;
	private org.eclipse.swt.widgets.List listOfWarning;
	
	private String menuFilter;
	private Shell shell;
	
	private AddActionPageDiagramElements actionsDiagramElements;
	private DeleteActionTreePageDiagramElements deleteDiagramElements;
	private ChangeActionTreePageDiagramElements changeDiagramElements;
	
	private HeuristicStrategy heuristicStrategy;
	private HeuristicStrategySettings heuristicStrategySettings;
	private Representation representation;
		
	public ActionTreePageDiagramElements(TreeViewer treeViewer, String menuFilter, Shell shell, HeuristicStrategy heuristicStrategy,
										HeuristicStrategySettings heuristicStrategySettings,
										Representation representation, org.eclipse.swt.widgets.List listOfWarning)
	{
		this.treeViewer = treeViewer;
		this.menuFilter = menuFilter;
		this.listOfWarning = listOfWarning;
		this.shell = shell;
		this.heuristicStrategy = heuristicStrategy;
		this.heuristicStrategySettings = heuristicStrategySettings;
		this.representation = representation;
		this.menuMgr = new MenuManager(){
			
			// Do not accept items from other plug-ins.
			@Override
			public IContributionItem[] getItems() {
							
				 IContributionItem[] items = super.getItems();
				 List<IContributionItem> filteredItems = new ArrayList<IContributionItem>();
					 for (IContributionItem item : items) {
						 if( item != null
						           && item.getId() != null
						           && item.getId().startsWith( menuFilter ))
						         filteredItems.add( item );					 
					 }
				 
					 items = new IContributionItem[ filteredItems.size()];
					 return filteredItems.toArray( items );
			}
			
		};
		
		menuMgr.setRemoveAllWhenShown(true);		
		actionsDiagramElements = new AddActionPageDiagramElements(getTreeViewer(),getShell(),
										getHeuristicStrategy(),getHeuristicStrategySettings(),listOfWarning);		
		deleteDiagramElements = new DeleteActionTreePageDiagramElements(getTreeViewer(),getShell(),
										getHeuristicStrategy(),getHeuristicStrategySettings(),listOfWarning);		
		changeDiagramElements = new ChangeActionTreePageDiagramElements(getTreeViewer(),getShell(),
										getHeuristicStrategy(),getHeuristicStrategySettings(),listOfWarning);				
	}	
	
	public void Execute()
	{
		actionsDiagramElements.makeActions();
		deleteDiagramElements.makeActions();
		changeDiagramElements.makeActions();
		
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ActionTreePageDiagramElements.this.fillContextMenu(manager);
			}
		});
		
		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		treeViewer.getControl().setMenu(menu);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().
		registerContextMenu(menuMgr, treeViewer);
	}

	private Representation getRepresentation() {
		// TODO Auto-generated method stub
		return this.representation;
	}

	private HeuristicStrategy getHeuristicStrategy() {
		// TODO Auto-generated method stub
		return this.heuristicStrategy;
	}

	protected void fillContextMenu(IMenuManager manager) {
		// TODO Auto-generated method stub
		Object obj = this.GetSelectedTreeViewerObject();
		if(obj instanceof StructuredSelection)
		{
			manager.add(deleteDiagramElements.getActionDeleteAll());
			manager.add(changeDiagramElements.getActionChangeToNode());
			manager.add(actionsDiagramElements.getActionAddAllAffixed());
		}
		if(obj instanceof Layer)
		{
			Layer lay = (Layer)obj;
			Representation graphRepresentation = (Representation) lay.eContainer();
			manager.add(actionsDiagramElements.getActionLayer());
			if(((RepresentationDD)graphRepresentation).getRoot().getRootLayer() == null)
				manager.add(actionsDiagramElements.getActionShowRoot());
			if(obj instanceof AdditionalLayer)
				manager.add(deleteDiagramElements.getActionLayerDelete());
		}
		else if(obj instanceof Root)
		{
			manager.add(actionsDiagramElements.getActionName());
			manager.add(actionsDiagramElements.getActionLink());
			manager.add(actionsDiagramElements.getActionCompartment());
			manager.add(actionsDiagramElements.getActionAffixed());
			manager.add(deleteDiagramElements.getActionRemoveRooot());
		}
		else if(obj instanceof Edge)
		{
			manager.add(deleteDiagramElements.getActionEdgeDelete());
			manager.add(actionsDiagramElements.getActionNameEdge());			
		}
		else if(obj instanceof Node){
			manager.add(actionsDiagramElements.getActionName());
			manager.add(actionsDiagramElements.getActionLink());
			manager.add(actionsDiagramElements.getActionCompartment());
			manager.add(actionsDiagramElements.getActionAffixed());
			manager.add(deleteDiagramElements.getActionNodeDelete());
			manager.add(actionsDiagramElements.getActionAddAllAffixed());
		}
		else if(obj instanceof LabelEAttribute)
		{
			manager.add(deleteDiagramElements.getActionNameDelete());
		}
		else if (obj instanceof EdgeLabelEAttribute) {
			manager.add(deleteDiagramElements.getActionDeleteEdgeLabelName());
		}			
		else if(obj instanceof PaletteDescriptionLink)
		{
			manager.add(deleteDiagramElements.getActionLinkDelete());
			PaletteDescriptionLink paletteLink = (PaletteDescriptionLink)obj;
			if(paletteLink.getAnEReference().isContainment() == true)
			{
				manager.add(changeDiagramElements.getActionChangeToAffixed());
				manager.add(changeDiagramElements.getActionChangeToCompartment());
			}
		}
		else if(obj instanceof CompartmentElement)
		{
			manager.add(deleteDiagramElements.getActionCompartmentsDelete());
			manager.add(changeDiagramElements.getActionChangeToAffixed());
			manager.add(changeDiagramElements.getActionChangeToLink());
		}
		else if(obj instanceof AffixedElement)
		{
			manager.add(deleteDiagramElements.getActionAffixedDelete());
			manager.add(changeDiagramElements.getActionChangeToCompartment());
			manager.add(changeDiagramElements.getActionChangeToLink());
		}
		else if (obj instanceof EClass)
		{
			Object[] input = (Object[]) treeViewer.getInput();
			
			Iterator<Layer> itLayers = ((RepresentationDD)input[0]).getLayers().iterator();
			
			MenuManager subMenuNode = new MenuManager("Add Node","com.wizard.visualization.MenuAddNode");
			MenuManager subMenuEdge = new MenuManager("Add Edge","com.wizard.visualization.MenuAddEdge");
			
			while (itLayers.hasNext()) {
				
				Layer type = itLayers.next();
				actionsDiagramElements.makeDinamycallyActionAddToLayerNode(type);
				
				subMenuNode.add(actionsDiagramElements.getActionAddToLayer());
				
				subMenuEdge.add(actionsDiagramElements.getActionAddToLayer());				
			}
			
			manager.add(subMenuNode);
			manager.add(subMenuEdge);
		}
		
		if(obj instanceof DiagramElement || obj instanceof Root)
		{
			EObject layerEObject = null;
			EObject graphEObject = null;
			
			if(obj instanceof DiagramElement)
			{
				DiagramElement nod = (DiagramElement)obj;		
				layerEObject = nod.eContainer();
				graphEObject = nod.eContainer().eContainer();
			}
			if(obj instanceof Root)
			{
				Root root = (Root)obj;
				layerEObject = root.getRootLayer();
				graphEObject = root.eContainer();
			}
			
			if(graphEObject instanceof MMGraphic_Representation && layerEObject instanceof Layer)
			{
				MMGraphic_Representation graph = (MMGraphic_Representation)graphEObject;
				Layer layer = (Layer)layerEObject;
				int layersCount = ((RepresentationDD)getRepresentation()).getLayers().size();
				if(layersCount > 1)
				{
					MenuManager subMenuChangeLayer = new MenuManager("Change Layer","com.wizard.visualization.ChangeLayer");
					Iterator<Layer> itLayers = ((RepresentationDD)getRepresentation()).getLayers().iterator();
					while (itLayers.hasNext()) {
						Layer type = itLayers.next();
						
						if(layer.equals(type) == false)
						{
							changeDiagramElements.makeDynamicallyActionChangeLayer(type);
							subMenuChangeLayer.add(changeDiagramElements.getActionChangeLayer());
						}
					}	
					
					manager.add(subMenuChangeLayer);
					System.out.println("Change Layer");
				}				
			}	
		}
	}

	public Object GetSelectedTreeViewerObject(){
		
		ISelection selection = treeViewer.getSelection();
		
		if(((IStructuredSelection)selection).size() == 1)
			return ((IStructuredSelection)selection).getFirstElement();
		else
			return selection;
	}
	
	public TreeViewer getTreeViewer() {
		return treeViewer;
	}


	public void setTreeViewer(TreeViewer treeViewer) {
		this.treeViewer = treeViewer;
	}
	
	public MenuManager getMenuMgr() {
		return menuMgr;
	}
	
	public String getMenuFilter()
	{
		return this.menuFilter;
	}

	public Shell getShell()
	{
		return this.shell;
	}
	
	public org.eclipse.swt.widgets.List getListOfWarning() {
		return listOfWarning;
	}
	
	public HeuristicStrategySettings getHeuristicStrategySettings()
	{
		return this.heuristicStrategySettings;
	}
	
	public static boolean PossibleElement(EClass rootEClass, EList<EList<Boolean>> pathMatrix, EList<EClass> listEClass, EClass possibleElement)
	{
		int indexRoot = listEClass.indexOf(rootEClass);
		if(indexRoot == -1)
			indexRoot = searchByName(rootEClass,listEClass);
		int indexPossible = listEClass.indexOf(possibleElement);
		if(indexPossible == -1)
			indexPossible = searchByName(possibleElement,listEClass);
		if(pathMatrix.get(indexRoot).get(indexPossible).equals(true))
			return true;
		else
			return false;
	}	
	
	public static int searchByName(EClass rootEClass, EList<EClass> listEClass) {
		
		for (int i = 0; i < listEClass.size(); i++) {
			if(listEClass.get(i).getName().equals(rootEClass.getName()))
				return i;
		}
		
		return -1;
	}
	
	
}
