package org.mondo.visualization.ui.page.diagram.element;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.mondo.visualization.ui.page.SelectionElementsLayerClasses;

import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.HeuristicStrategySettings;
import dslHeuristicVisualization.StrategyPossibleElements;
import graphic_representation.AffixedElement;
import graphic_representation.AllElements;
import graphic_representation.CompartmentElement;
import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.EdgeLabelEAttribute;
import graphic_representation.LabelEAttribute;
import graphic_representation.Layer;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.RepresentationDD;
import graphic_representation.Root;

public class DeleteActionTreePageDiagramElements extends AActionPageDiagramElements{

	//Delete Actions
	private Action actionNameDelete;
	private Action actionLinkDelete;
	private Action actionCompartmentsDelete;	
	private Action actionAffixedDelete;
	private Action actionLayerDelete;
	private Action actionNodeDelete;
	private Action actionEdgeDelete;
	private Action actionRemoveRooot;
	private Action actionDeleteAll;
	
	//Delete Edge Name
	private Action actionDeleteEdgeName;
		
	public DeleteActionTreePageDiagramElements(TreeViewer treeViewer, Shell shell, HeuristicStrategy heuristicStrategy,
			HeuristicStrategySettings heuristicStrategySettings, List listOfWarning) {
		super(treeViewer, shell, heuristicStrategy, heuristicStrategySettings, listOfWarning);		
	}

	public void makeActions() {
		
		makeActionNameDelete();
		makeActionLinkDelete();
		makeActionCompartmentsDelete();	
		makeActionAffixedDelete();
		makeActionLayerDelete();
		makeActionNodeDelete();
		makeActionEdgeDelete();
		makeActionRemoveRooot();
		makeActionDeleteAll();
		makeActionDeleteEdgeName();
	}
	
	private void makeActionDeleteEdgeName() {
		
		actionDeleteEdgeName = new Action() {
			
			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();	
				if (obj instanceof EdgeLabelEAttribute) {
					
					EdgeLabelEAttribute label = (EdgeLabelEAttribute) obj;
					EcoreUtil.remove(label);
					getTreeViewer().remove(obj);
				}				
			}
			
		};	
		
		actionDeleteEdgeName.setId("com.wizard.visualization.DeleteEdgeLabelName");
		actionDeleteEdgeName.setText("Delete Edge Label");
		actionDeleteEdgeName.setToolTipText("Delete Edge Label");
	}
	
	
	private void makeActionNameDelete() {
		
		actionNameDelete = new Action(){//Delete Action Label EAttribute

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();				
				if(obj instanceof LabelEAttribute)//Update the Model
				{
					LabelEAttribute labelEAttribute = (LabelEAttribute)obj;
					EcoreUtil.remove(labelEAttribute);//Update Model
					getTreeViewer().remove(obj);	 //Update Tree Viewer					
				}				
			}			
		};
		
		actionNameDelete.setId("com.wizard.visualization.DeleteLabelName");
		actionNameDelete.setText("Delete Label");
		actionNameDelete.setToolTipText("Delete Label");
	}
	
	private void makeActionLinkDelete() {
		
		actionLinkDelete = new Action() { //Delete Action Link

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();				
				if(obj instanceof PaletteDescriptionLink)//Update the Model
				{
					PaletteDescriptionLink link = (PaletteDescriptionLink)obj;
					EcoreUtil.remove(link);//Update the Model
					getTreeViewer().remove(obj);//Update Tree Viewer				
				}				
			}			
		};
		
		actionLinkDelete.setId("com.wizard.visualization.DeleteLinkReference");
		actionLinkDelete.setText("Delete Link");
		actionLinkDelete.setToolTipText("Delete Link");
	}
	
	private void makeActionCompartmentsDelete() {
		
		//Delete Action Compartments
		actionCompartmentsDelete = new Action() {//Delete Compartment

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof CompartmentElement)
				{
					CompartmentElement compart = (CompartmentElement)obj;
					EcoreUtil.remove(compart);//Update the Model
					getTreeViewer().remove(obj);//Update Tree Viewer
				}				
			}			
		};
				
		actionCompartmentsDelete.setId("com.wizard.visualization.DeleteCompartmentReference");
		actionCompartmentsDelete.setText("Delete Compartment");
		actionCompartmentsDelete.setToolTipText("Delete Compartment");
	}
	
	private void makeActionAffixedDelete() {
		
		actionAffixedDelete = new Action() {//Delete Affixed

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof AffixedElement)//Update the Model
				{
					AffixedElement affixed = (AffixedElement)obj;
					EcoreUtil.remove(affixed);//Update the Model
					getTreeViewer().remove(obj);//Update Tree Viewer
				}
			}			
		};
		
		actionAffixedDelete.setId("com.wizard.visualization.DeleteAffixed");
		actionAffixedDelete.setText("Delete Affixed");
		actionAffixedDelete.setToolTipText("Delete Affixed");
	}
	
	private void makeActionLayerDelete() {
		
		actionLayerDelete = new Action() {//Delete Additional Layer

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof Layer)
				{
					SelectionElementsLayerClasses dg = new SelectionElementsLayerClasses(getShell());
					Layer lay = (Layer)obj;
					EObject parentGraphEObject = lay.eContainer();
					Object[] input = (Object[]) getTreeViewer().getInput();
					if(parentGraphEObject instanceof MMGraphic_Representation)
					{
						EList<Layer> listLayers = ((RepresentationDD)input[0]).getLayers();
						dg.setLayers(listLayers);
						dg.setLayertoDelete(lay);						
						if(lay.getElements().size() == 0)
						{
							if(((RepresentationDD)input[0]).getRoot().getRootLayer() == null)
							{
								EcoreUtil.remove(lay);//Update the Model
								getTreeViewer().remove(obj);//Update Tree Viewer
								getTreeViewer().refresh();
								return;
							}
							else if(((RepresentationDD)input[0]).getRoot().getRootLayer().equals(lay) == false)
							{
								EcoreUtil.remove(lay);//Update the Model
								getTreeViewer().remove(obj);//Update Tree Viewer
								getTreeViewer().refresh();
								return;
							}
						}							
						if(dg.open() == Dialog.OK)
						{
							String selec = dg.getSelec();
							if(selec.equals("Without Layer"))//Without Layer
							{
								Object objs = getTreeViewer().getInput();
								if(objs instanceof Object[]){
									Object[] elements = (Object[])objs;
									if(elements[1] instanceof StrategyPossibleElements)
									{
										StrategyPossibleElements strat = (StrategyPossibleElements)elements[1];
										Iterator<AllElements> itDiagramElements = lay.getElements().iterator();
										while (itDiagramElements.hasNext()) {
											AllElements element = (DiagramElement) itDiagramElements.next();
											if(element instanceof DiagramElement){
												DiagramElement current_diagElement = (DiagramElement) element;
												strat.getEClassNoElements().add(current_diagElement.getAnEClass());
											}
										}
									}
								}	
								((RepresentationDD)input[0]).getRoot().setRootLayer(null);
							}
							else
							{
								Layer otherLayer = FindLayerByName(listLayers,selec);
								if(otherLayer!=null)
								{
									((RepresentationDD)input[0]).getRoot().setRootLayer(otherLayer);
									otherLayer.getElements().addAll(lay.getElements());
								}
							}
							EcoreUtil.remove(lay);//Update the Model
							getTreeViewer().remove(obj);//Update Tree Viewer
							getTreeViewer().refresh();							
						}
					}
				}				
			}					
		};
		
		actionLayerDelete.setId("com.wizard.visualization.DeleteAdditionalLayer");
		actionLayerDelete.setText("Delete Additional Layer");
		actionLayerDelete.setToolTipText("Delete Additional Layer");
		
	}
	
	private void makeActionNodeDelete() {
		
		actionNodeDelete = new Action(){//Delete Node

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof Node)
				{
					DeleteFromWarnings(((Node) obj).getAnEClass());
					Layer lay = (Layer)(((Node)obj).eContainer());
					Object[] input = (Object[]) getTreeViewer().getInput();
					StrategyPossibleElements strat = (StrategyPossibleElements) input[1];
					strat.getEClassNoElements().add(((Node) obj).getAnEClass());
					lay.getElements().remove(obj);	
					getTreeViewer().refresh(lay);
					getTreeViewer().refresh();
					System.out.println("Delete Node");										
				}			
			}			
		};
		
		actionNodeDelete.setId("com.wizard.visualization.NodeDelete");
		actionNodeDelete.setText("Delete Node");
		actionNodeDelete.setToolTipText("Delete Node");	
	}
	
	private void makeActionEdgeDelete() {
		
		actionEdgeDelete = new Action() {

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof Edge)
				{
					Layer lay = (Layer)(((Edge)obj).eContainer());
					Object[] input = (Object[]) getTreeViewer().getInput();
					StrategyPossibleElements strat = (StrategyPossibleElements) input[1];
					strat.getEClassNoElements().add(((Edge) obj).getAnEClass());
					EcoreUtil.remove((EObject) obj);
					getTreeViewer().refresh(lay);
					getTreeViewer().refresh();
					System.out.println("Delete Edge");
				}
			}			
			
		};
		
		actionEdgeDelete.setId("com.wizard.visualization.DeleteEdge");
		actionEdgeDelete.setText("Delete Edge");
		actionEdgeDelete.setToolTipText("Delete Edge");
	}
	
	private void makeActionRemoveRooot() {
		
		actionRemoveRooot = new Action() {//Remove Root
			
			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof Root)
				{
					Root root = (Root)obj;
					root.setRootLayer(null);
					getTreeViewer().refresh();
				}
			}
			
		};
		
		actionRemoveRooot.setId("com.wizard.visualization.RemoveRoot");
		actionRemoveRooot.setText("Remove Root");
		actionRemoveRooot.setToolTipText("Remove Root");
	}
	
	private void makeActionDeleteAll() {
		
		actionDeleteAll = new Action() {//Delete All

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof StructuredSelection)
				{
					Iterator<?> itObejcts = ((StructuredSelection) obj).iterator();
					while (itObejcts.hasNext()) {
						Object object = itObejcts.next();
						if(object instanceof Edge)
						{
							Layer lay = (Layer)(((Edge)object).eContainer());
							Object[] input = (Object[]) getTreeViewer().getInput();
							StrategyPossibleElements strat = (StrategyPossibleElements) input[1];
							strat.getEClassNoElements().add(((Edge) object).getAnEClass());
							EcoreUtil.remove((EObject) object);
							getTreeViewer().refresh(lay);
							getTreeViewer().refresh();
							System.out.println("Delete Edge");
						}
						if(object instanceof Node)
						{
							DeleteFromWarnings(((Node) object).getAnEClass());
							Layer lay = (Layer)(((Node)object).eContainer());
							Object[] input = (Object[]) getTreeViewer().getInput();
							StrategyPossibleElements strat = (StrategyPossibleElements) input[1];
							strat.getEClassNoElements().add(((Node) object).getAnEClass());
							lay.getElements().remove(object);	
							getTreeViewer().refresh(lay);
							getTreeViewer().refresh();
							System.out.println("Delete Node");										
						}
					}
				}
			}			
		};		
		
		actionDeleteAll.setId("com.wizard.visualization.DeleteAll");
		actionDeleteAll.setText("Delete All");
		actionDeleteAll.setToolTipText("Delete All");
	}	

	public Action getActionNameDelete() {
		return actionNameDelete;
	}

	public Action getActionLinkDelete() {
		return actionLinkDelete;
	}

	public Action getActionCompartmentsDelete() {
		return actionCompartmentsDelete;
	}

	public Action getActionAffixedDelete() {
		return actionAffixedDelete;
	}

	public Action getActionLayerDelete() {
		return actionLayerDelete;
	}

	public Action getActionNodeDelete() {
		return actionNodeDelete;
	}

	public Action getActionEdgeDelete() {
		return actionEdgeDelete;
	}

	public Action getActionRemoveRooot() {
		return actionRemoveRooot;
	}

	public Action getActionDeleteAll() {
		return actionDeleteAll;
	}	
	
	public Action getActionDeleteEdgeLabelName() {
		return actionDeleteEdgeName;
	}
	
}
