package org.miso.wizard.instantiate.modular.pattern.label.provider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import MetaModelGraph.Composition;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;

public class LabelProviderName extends ColumnLabelProvider{
	
	@Override
	public String getText(Object element) {

		Node node = null;
		if(element instanceof Composition)
			node = ((Composition) element).getTarget();
		else if(element instanceof SubClass)
			node = ((SubClass) element).getTarget();
		else if(element instanceof Node)
			node = (Node) element;
		
		if(node!=null){
			if(node.getName()!=null)
				return node.getName().getName();
		}
		
		return "";
	}
}
