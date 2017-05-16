package org.miso.wizard.instantiate.modular.pattern.editing.support;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import MetaModelGraph.Composition;
import MetaModelGraph.EnumModular;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;

public class ESColumnExtension  extends EditingSupport{

	public ESColumnExtension(ColumnViewer viewer) {
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		return new TextCellEditor((Composite) getViewer().getControl(), SWT.NONE);
	}

	@Override
	protected boolean canEdit(Object element) {
		
		Node node = getCurrentNode(element);
		int index = node.getEnumModularNotation().indexOf(EnumModular.UNIT);
		
		if(index!=-1)
			return true;
		
		return false;
	}

	@Override
	protected Object getValue(Object element) {

		Node node = getCurrentNode(element);
		
		if(node.getExtension()!=null)
			return node.getExtension();
		else
			return "";
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		Node node = getCurrentNode(element);
		String extension = (String) value;
		
		node.setExtension(extension);
		
		getViewer().refresh();		
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
