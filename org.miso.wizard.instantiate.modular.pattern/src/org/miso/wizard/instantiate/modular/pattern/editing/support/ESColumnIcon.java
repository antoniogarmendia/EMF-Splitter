package org.miso.wizard.instantiate.modular.pattern.editing.support;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import MetaModelGraph.Composition;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;

public class ESColumnIcon  extends EditingSupport{

	public ESColumnIcon(ColumnViewer viewer) {
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		DialogCellEditor dialogEditor =  new DialogCellEditor(){

			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				LoadResourceDialogIcon dialog = new LoadResourceDialogIcon(cellEditorWindow.getShell(), "Select the Image", SWT.NONE);
				
				if(dialog.open() == Window.OK){
					
					return dialog.getFileURI();
				}				
				return null;
			}			
			
		};
		
		dialogEditor.create((Composite) getViewer().getControl());		
		return dialogEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		Node node = getCurrentNode(element);
			
		return node.getIcon();
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		Node node = getCurrentNode(element);
		String uri = (String) value;
		node.setIcon(uri);
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
