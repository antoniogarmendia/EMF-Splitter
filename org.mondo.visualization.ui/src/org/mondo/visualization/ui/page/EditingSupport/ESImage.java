package org.mondo.visualization.ui.page.EditingSupport;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.mondo.visualization.ui.page.EditingSupport.ESIconPalette.LoadResourceDialog;

import graphic_representation.ConditionalStyle;
import graphic_representation.IconElement;
import graphic_representation.Node;
import graphic_representation.Root;
import graphic_representation.Shape;

public class ESImage extends EditingSupport{

	public ESImage(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		DialogCellEditor cellEditor = new DialogCellEditor() {
			
			private Label labelPath;
			
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				LoadResourceDialog dialog = new LoadResourceDialog(cellEditorWindow.getShell(),"Select Image", SWT.NONE);
				if(dialog.open() == Window.OK) {
					return dialog.fileURI;
				}				
				return "";
			}
			
			@Override
			protected Button createButton(Composite parent) {
				
				Button btn = new Button(parent, SWT.NONE);
				btn.setText("...");
				return btn;
			}

			@Override
			protected Control createContents(Composite cell) {
				
				labelPath = new Label(cell, SWT.LEFT);
				labelPath.setFont(cell.getFont());
				labelPath.setBackground(cell.getBackground());
				String filepath = "";
				Shape sh = null;
				if(element instanceof Node)
					sh = ((Node) element).getNode_shape();
				else if(element instanceof Root)
					sh = ((Root) element).getRoot_shape();
				else if (element instanceof ConditionalStyle)
					sh = ((ConditionalStyle) element).getConditionalStyle();
				
				if(sh instanceof IconElement)
					filepath =  ((IconElement) sh).getFilepath();
				
				labelPath.setText((filepath==null)?"":filepath);
				return labelPath;				
			}

			@Override
			protected void updateContents(Object value) {
				
				if(value==null)
					value = "";
				super.updateContents(value);
			}			
		};
		
		cellEditor.create((Composite) getViewer().getControl());
		return cellEditor;		
	}

	@Override
	protected boolean canEdit(Object element) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node)element).getNode_shape();
		else if (element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		if(sh instanceof IconElement)
			return true;
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node)element).getNode_shape();
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		if(sh instanceof IconElement)
			return ((IconElement)sh).getFilepath()  == null ? "Define path" : ((IconElement)sh).getFilepath();	
		
		return "";
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		Shape sh = null;
		if(element instanceof Node)
			sh = ((Node) element).getNode_shape();
		else if(element instanceof Root)
			sh = ((Root) element).getRoot_shape();
		else if (element instanceof ConditionalStyle)
			sh = ((ConditionalStyle) element).getConditionalStyle();
		
		if(sh instanceof IconElement)
			((IconElement)sh).setFilepath((String)value);		
		
		getViewer().update(element, null);
	}

}
