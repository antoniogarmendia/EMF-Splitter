package org.mondo.visualization.ui.page.diagram.element;

import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.Layer;
import graphic_representation.Node;
import graphic_representation.RepresentationDD;
import graphic_representation.Root;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import dslHeuristicVisualization.StrategyPossibleElements;


public class GraphicTreeContentProvider implements ITreeContentProvider {
	
	private static Object[] EMPTY_ARRAY = new Object[0];
		
	public GraphicTreeContentProvider() {
		
		super();		
	}
	
	@Override
	public void dispose() {
				
	}
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
						
	}

	@Override
	public Object[] getElements(Object inputElement) {
		
		Object[] layerObjects = ((RepresentationDD) ((Object[])inputElement)[0]).getLayers().toArray(new Object[]{});
		Object[] strategy = ((StrategyPossibleElements) ((Object[])inputElement)[1]).getEClassNoElements().toArray(new Object[]{});
		return ArrayUtils.addAll(layerObjects, strategy);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
				
		//Layer Children
		if(parentElement instanceof Layer)
		{
			Layer layElement = (Layer) parentElement;
			RepresentationDD mmRepresentation = (RepresentationDD) layElement.eContainer();
			Layer rootLayer = mmRepresentation.getRoot().getRootLayer();
			if(rootLayer != null){
				if(mmRepresentation.getRoot().getRootLayer().equals(layElement))
					return ArrayUtils.addAll(new Object[]{mmRepresentation.getRoot()}, ((Layer)parentElement).getElements().toArray());
			}				
				return ((Layer)parentElement).getElements().toArray();
		}
		
		if(parentElement instanceof Root)
		{
			Root root = (Root) parentElement;
			Object[] attributes = root.getRoot_node_elements().getLabelanEAttribute().toArray(new Object[]{});
			Object[] links = root.getRoot_node_elements().getLinkPalette().toArray(new Object[]{});
			Object[] affixedCompartments = root.getRoot_node_elements().getAffixedCompartmentElements().toArray(new Object[]{});
			Object[] allObjects = ArrayUtils.addAll(attributes,affixedCompartments);
			return ArrayUtils.addAll(allObjects, links ); 
		}		
		if(parentElement instanceof Node){
			Node nod = (Node)parentElement;
			
			Object[] attributes = nod.getNode_elements().getLabelanEAttribute().toArray(new Object[]{});
			Object[] links = nod.getNode_elements().getLinkPalette().toArray(new Object[]{});
			Object[] affixedCompartments = nod.getNode_elements().getAffixedCompartmentElements().toArray(new Object[]{});		
						
			Object[] allObjects = ArrayUtils.addAll(attributes,affixedCompartments);
			return ArrayUtils.addAll(allObjects, links );			
		}
		//Edge Children
		else if(parentElement instanceof Edge){
			
			Edge edge = (Edge)parentElement;	
			if(edge.getEdgeLabel()==null)
				return new Object[]{edge.getDirections().getSourceLink(),edge.getDirections().getTargetLink()};		
			else
				return new Object[]{edge.getEdgeLabel(),edge.getDirections().getSourceLink(),edge.getDirections().getTargetLink()};	
		}	
		
		return EMPTY_ARRAY;
	}	

	@Override
	public Object getParent(Object element) {
		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
				
		if(element instanceof Layer)
			return true;		
		else if(element instanceof DiagramElement || element instanceof Root)
			return true;
		
		return false;
	}	
}
