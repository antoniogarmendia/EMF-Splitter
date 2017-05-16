package org.mondo.visualization.ui.page;

import graphic_representation.Edge;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Root;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class GraphicDiagramElementContentProvider implements ITreeContentProvider{

	@Override
	public void dispose() {
				
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				
	}

	@Override
	public Object[] getElements(Object inputElement) {
		
		return (Object[])inputElement;		
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		
		if(parentElement instanceof Edge){
			Edge edge = (Edge)parentElement;
			return new Object[]{edge.getDirections().getSourceLink(),
								edge.getDirections().getTargetLink()
								};		
		}	
		if(parentElement instanceof Node)
		{
			Node nod = (Node)parentElement;
			Object[] listLabelAttributes = nod.getNode_elements().getLabelanEAttribute().toArray(new Object[]{});
			Object[] listLink = nod.getNode_elements().getLinkPalette().toArray(new Object[]{});
			Object[] listConditionalStyles = nod.getConditionalStyle().toArray(new Object[]{}); 
			
			Object[] allObjects = ArrayUtils.addAll(listLabelAttributes, listLink);
			return 	ArrayUtils.addAll(allObjects, listConditionalStyles);								
		}
		if(parentElement instanceof Root)
		{
			Root root = (Root)parentElement;
			return root.getRoot_node_elements().getLabelanEAttribute().toArray();
		}
		if(parentElement instanceof PaletteDescriptionLink)
		{
			PaletteDescriptionLink link = (PaletteDescriptionLink) parentElement;
			return new Object[]{
								 new Object[]{"Source", link},
								 new Object[]{"Target", link}
								};
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		if(element instanceof Node || element instanceof Edge || element instanceof Root || element instanceof PaletteDescriptionLink)
			return true;
		return false;
	}

}
