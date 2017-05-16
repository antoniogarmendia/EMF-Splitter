package org.mondo.visualization.ui.page.diagram.element;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.HeuristicStrategySettings;
import graphic_representation.AffixedCompartmentElement;
import graphic_representation.AffixedElement;
import graphic_representation.CompartmentElement;
import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.Edge_Direction;
import graphic_representation.Ellipse;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.Layer;
import graphic_representation.Link;
import graphic_representation.Node;
import graphic_representation.Node_Element;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Rectangle;
import graphic_representation.Root;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.impl.Graphic_representationFactoryImpl;

public class ChangeActionTreePageDiagramElements extends AActionPageDiagramElements{
	
	//Change Actions
	private Action actionChangeToAffixed;
	private Action actionChangeToCompartment;
	private Action actionChangeToLink;
	private Action actionChangeLayer;
	private Action actionChangeToNode;
	
	private Action actionChangeToEdge;
		
	public ChangeActionTreePageDiagramElements(TreeViewer treeViewer, Shell shell, HeuristicStrategy heuristicStrategy,
			HeuristicStrategySettings heuristicStrategySettings, List listOfWarning) {
		super(treeViewer, shell, heuristicStrategy, heuristicStrategySettings, listOfWarning);
		// TODO Auto-generated constructor stub
	}

	public void makeActions() {
		// TODO Auto-generated method stub
		makeActionChangeToAffixed();
		makeActionChangeToCompartment();
		makeActionChangeToLink();	
		makeActionChangeToNode();
		makeActionChangeToEdge();
	}
	
	public void makeActionChangeToAffixed(){
		
		actionChangeToAffixed = new Action() { //Change to Affixed(Bordered)

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Object obj = GetSelectedTreeViewerObject();
				EObject parentElement = null;
				EReference ref = null;
				if(obj instanceof Link)
				{
					Link link = (Link)obj;
					ref = link.getAnEReference();
					parentElement = link.eContainer();					
				}
				if(obj instanceof CompartmentElement)
				{
					CompartmentElement compart = (CompartmentElement)obj;
					ref = compart.getAnEReference();
					parentElement = compart.eContainer();
				}				
				if(parentElement instanceof Node_Element)
				{
					Node_Element node_Element = (Node_Element)parentElement;
					AffixedElement affixed = Graphic_representationFactoryImpl.eINSTANCE.createAffixedElement();
					affixed.setAnEReference(ref);
					node_Element.getAffixedCompartmentElements().add(affixed);
					EObject parent = node_Element.eContainer();
					if(parent instanceof Node)
					{
						Ellipse elli = Graphic_representationFactoryImpl.eINSTANCE.createEllipse();
						elli.setBorderColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						elli.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						((Node) parent).setNode_shape(elli);
					}					
					EcoreUtil.remove((EObject) obj);				
					getTreeViewer().remove(obj);
					getTreeViewer().refresh();
				}				
			}		
			
		};
		
		actionChangeToAffixed.setId("com.wizard.visualization.ChangeToAffixed");
		actionChangeToAffixed.setText("Change to Affixed");
		actionChangeToAffixed.setToolTipText("Change to Affixed");
		
	};
	
	public void makeActionChangeToCompartment(){
		
		actionChangeToCompartment = new Action() { //Change to Compartment

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Object obj = GetSelectedTreeViewerObject();
				EObject parentElement = null;
				EReference ref = null;
				if(obj instanceof Link)
				{
					Link link = (Link)obj;
					ref = link.getAnEReference();
					parentElement = link.eContainer();					
				}
				if(obj instanceof AffixedElement)
				{
					AffixedElement affixed = (AffixedElement)obj;
					ref = affixed.getAnEReference();
					parentElement = affixed.eContainer();
				}				
				if(parentElement instanceof Node_Element)
				{
					Node_Element node_Element = (Node_Element)parentElement;
					CompartmentElement compart = Graphic_representationFactoryImpl.eINSTANCE.createCompartmentElement();
					compart.setAnEReference(ref);
					node_Element.getAffixedCompartmentElements().add(compart);
					EcoreUtil.remove((EObject) obj);
					EObject containerElement = node_Element.eContainer();
					if(containerElement instanceof Root)
					{
						ShapeCompartmentGradient shape = Graphic_representationFactoryImpl.eINSTANCE.createShapeCompartmentGradient();
						shape.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						shape.setBorderColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						((Root) containerElement).setRoot_shape(shape);
					}
					if(containerElement instanceof Node)
					{
						Rectangle shape = Graphic_representationFactoryImpl.eINSTANCE.createRectangle();
						shape.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						shape.setBorderColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						((Node) containerElement).setNode_shape(shape);
					}
					
					getTreeViewer().remove(obj);
					getTreeViewer().refresh();
				}	
			}			
		};				
			
		actionChangeToCompartment.setId("com.wizard.visualization.ChangeToCompartment");
		actionChangeToCompartment.setText("Change to Compartment");
		actionChangeToCompartment.setToolTipText("Change to Compartment");
		
	};
	
	public void makeActionChangeToLink(){
		
		actionChangeToLink = new Action() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Object obj = GetSelectedTreeViewerObject();
				EObject parentElement = null;
				EReference ref = null;
				if(obj instanceof AffixedCompartmentElement)
				{
					AffixedCompartmentElement element = (AffixedCompartmentElement) obj;
					ref = element.getAnEReference();
					parentElement = element.eContainer();
				}				
				if(parentElement instanceof Node_Element)
				{
					Node_Element node_Element = (Node_Element)parentElement;
					PaletteDescriptionLink link = Graphic_representationFactoryImpl.eINSTANCE.createPaletteDescriptionLink();
					link.setAnEReference(ref);
					link.setPalette_name("Create Link to " + ref.getName());
					node_Element.getLinkPalette().add(link);
					EcoreUtil.remove((EObject) obj);
					getTreeViewer().remove(obj);
					getTreeViewer().refresh();
				}
			}			
		};
		
		actionChangeToLink.setId("com.wizard.visualization.ChangeToLink");
		actionChangeToLink.setText("Change to Link");
		actionChangeToLink.setToolTipText("Change to Link");
		
	};
	
	public void makeDynamicallyActionChangeLayer(Layer type){
		
		actionChangeLayer = new Action() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof DiagramElement)
					type.getElements().add((DiagramElement) obj);
				if(obj instanceof Root)
					((Root) obj).setRootLayer(type);
				getTreeViewer().refresh();																	
			}
		};							
		actionChangeLayer.setId("com.wizard.visualization.ChangeLayer" + type.getName());
		actionChangeLayer.setText("Change Layer: " + type.getName());
		actionChangeLayer.setToolTipText("Change Layer");		
	};
	

	private void makeActionChangeToNode() {
		// TODO Auto-generated method stub
		actionChangeToNode = new Action() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof StructuredSelection)
				{
					Iterator<?> itObejcts = ((StructuredSelection) obj).iterator();
					while (itObejcts.hasNext()) {
						Object object = itObejcts.next();
						if(object instanceof Edge)
						{
							Edge edg = (Edge)object;
							Node nod = Graphic_representationFactoryImpl.eINSTANCE.createNode();
							nod.setAnEClass(edg.getAnEClass());
							nod.getContainerReference().clear();
							nod.getContainerReference().addAll(edg.getContainerReference());
							//nod.setContainerReference(edg.getContainerReference());
							nod.setNode_elements(Graphic_representationFactoryImpl.eINSTANCE.createNode_Element());
							nod.setDiag_palette(Graphic_representationFactory.eINSTANCE.createPaletteDescription());
							nod.getDiag_palette().setPalette_name("Create " + nod.getAnEClass().getName());
							nod.setNode_shape(Graphic_representationFactory.eINSTANCE.createRectangle());
							SetOldToNewEObject(edg, nod);	
						}
						
					}
				}
				System.out.println("Aqui estas");
				getTreeViewer().refresh();																	
			}
		};							
		actionChangeToNode.setId("com.wizard.visualization.ChangeAllToNodes");
		actionChangeToNode.setText("Change All to Nodes");
		actionChangeToNode.setToolTipText("Change All to Nodes");		
	}
	
	private void makeActionChangeToEdge() {
		// TODO Auto-generated method stub
		actionChangeToEdge = new Action() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof StructuredSelection)
				{
					Iterator<?> itObejcts = ((StructuredSelection) obj).iterator();
					while (itObejcts.hasNext()) {
						Object object = itObejcts.next();
						if(object instanceof Node)
						{
							Node nod = (Node)object;
							Edge edg = Graphic_representationFactoryImpl.eINSTANCE.createEdge();
							edg.getContainerReference().clear();
							edg.getContainerReference().addAll(nod.getContainerReference());
							//edg.setContainerReference(nod.getContainerReference());
							edg.setEdge_style(Graphic_representationFactory.eINSTANCE.createEdge_Style());
							EClass anEClass = nod.getAnEClass();
							java.util.List<EReference> listReferences = anEClass.getEAllReferences();
							int count = listReferences.size();
							boolean src = false;
							boolean trg = false;
							Edge_Direction dir = Graphic_representationFactoryImpl.eINSTANCE.createEdge_Direction();
							for (int i = 0; i < count; i++) {
								EReference eReference = listReferences.get(i);
								if(eReference.isContainment() == false)
								{
									Link linkValue = Graphic_representationFactoryImpl.eINSTANCE.createLink();
									linkValue.setAnEReference(eReference);
									if(!src){
										dir.setSourceLink(linkValue);							
										src = true;
									}
									else
										if(!trg){
											dir.setTargetLink(linkValue);
											trg = true;
											break;
										}
								}
							}
							if(src==true && trg==true){
								edg.setAnEClass(anEClass);
								edg.setDirections(dir);
								edg.setDiag_palette(Graphic_representationFactory.eINSTANCE.createPaletteDescription());
								edg.getDiag_palette().setPalette_name("Create " + nod.getAnEClass().getName());
								SetOldToNewEObject((DiagramElement)object, edg);	
							}
							else
							{
								MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
										"Information about addition",
										"The class has no enough references.");
								return;
							}	
						}
					}
				}
				getTreeViewer().refresh();																	
			}
		};							
		actionChangeToEdge.setId("com.wizard.visualization.ChangeAllToEdges");
		actionChangeToEdge.setText("Change All to Edges");
		actionChangeToEdge.setToolTipText("Change All to Edges");
	}	
	
	public Action getActionChangeToAffixed(){
		
		return this.actionChangeToAffixed;
	};	
	
	public Action getActionChangeToCompartment(){
		
		return this.actionChangeToCompartment;
	};
	
	public Action getActionChangeToLink(){
		
		return this.actionChangeToLink;
	};
	
	public Action getActionChangeLayer(){
		
		return this.actionChangeLayer;
	};
	
	public Action getActionChangeToNode() {
		return actionChangeToNode;
	}
	
	private void SetOldToNewEObject(DiagramElement element, DiagramElement newElement) {
		// TODO Auto-generated method stub
		Layer parent = (Layer)element.eContainer();
		int indexOfElement = parent.getElements().indexOf(element);
		Object[] expandElements = ((TreeViewer)getTreeViewer()).getExpandedElements();
		parent.getElements().remove(indexOfElement);
		parent.getElements().add(indexOfElement, newElement);
		((TreeViewer)getTreeViewer()).setExpandedElements(expandElements);
		getTreeViewer().refresh(parent);	
	}
}
