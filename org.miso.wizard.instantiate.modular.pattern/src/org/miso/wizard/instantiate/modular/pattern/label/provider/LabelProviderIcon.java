package org.miso.wizard.instantiate.modular.pattern.label.provider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import MetaModelGraph.Composition;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;

public class LabelProviderIcon extends ColumnLabelProvider{
	
	@Override
	public String getText(Object element) {
		
		Node node = getCurrentNode(element);
		
		return node.getIcon();
	}
	
	private Node getCurrentNode(Object element){
		
		Node node = null;
		if(element instanceof Node)
			node = (Node) element;
		else if(element instanceof SubClass)
			node = ((SubClass) element).getTarget();
		else if(element instanceof Composition)
			node = ((Composition) element).getTarget();
		
		return node;
	}

}
