package org.mondo.visualization.ui.page.EditingSupport;

import graphic_representation.DiagramElement;
import graphic_representation.PaletteDescriptionLink;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

public class ESPalette extends EditingSupport{

	public ESPalette(TreeViewer viewer) {
		super(viewer);
		// TODO Auto-generated constructor stub
	}	

	@Override
	protected CellEditor getCellEditor(Object element) {
		// TODO Auto-generated method stub
		return new TextCellEditor((Composite) getViewer().getControl());		
	}

	@Override
	protected boolean canEdit(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof DiagramElement)
			return true;
		if(element instanceof PaletteDescriptionLink)
			return true;
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof DiagramElement){
			return ((DiagramElement)element).getDiag_palette().getPalette_name();
		}
		if(element instanceof PaletteDescriptionLink){
			return ((PaletteDescriptionLink)element).getPalette_name();
		}
		return element;
	}

	@Override
	protected void setValue(Object element, Object value) {
		// TODO Auto-generated method stub
		if(element instanceof DiagramElement){
			((DiagramElement)element).getDiag_palette().setPalette_name((String)value);			
		}		
		if(element instanceof PaletteDescriptionLink){
			((PaletteDescriptionLink)element).setPalette_name((String)value);
		}
		getViewer().update(element, null);
	}

}
