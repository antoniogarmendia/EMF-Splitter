package org.mondo.visualization.ui.page.EditingSupport;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.mondo.visualization.ui.wizard.ConditionalStyleDialog;
import org.mondo.visualization.ui.wizard.ContainerDialog;

import graphic_representation.Color;
import graphic_representation.ConditionalStyle;
import graphic_representation.Node;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.SiriusSystemColors;

public class ESDiagramElement extends EditingSupport {

	private DialogCellEditor cellStyleDialog;
	private DialogCellEditor cellStyleCompartment;
	
	public ESDiagramElement(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		if (element instanceof ConditionalStyle) {
		
			cellStyleDialog = getCellStyleDialog(element);		
			cellStyleDialog.create((Composite) getViewer().getControl());
			return cellStyleDialog;	
			
		} else if (element instanceof Node) {
			
			cellStyleCompartment = getCellStyleCompartment(element);			
			cellStyleCompartment.create((Composite) getViewer().getControl());
			return cellStyleCompartment;
		}
		
		return null;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if(element instanceof ConditionalStyle) {
			return true;
		} else if (element instanceof Node) {
			return ((Node) element).getNode_elements().isCompartment();
		}
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof ConditionalStyle) 
			return "Conditional Style: " + ((ConditionalStyle)element).getEAttribute().getName() + "=" + 
				((ConditionalStyle)element).getValue();
		else if (element instanceof Node) {
			return ((Node) element).getAnEClass().getName();
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
			
	}
	
	private DialogCellEditor getCellStyleCompartment(Object element) {
		
		return new DialogCellEditor() {

			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				if (element instanceof Node) {
					
					Node node = (Node) element;
					ContainerDialog dialog = new ContainerDialog(cellEditorWindow.getShell(), node);
					if (dialog.open() == Dialog.OK) {
						
						node.setPresentation(dialog.getPresentation());
						if (node.getNode_shape() instanceof ShapeCompartmentGradient) {
							
							ShapeCompartmentGradient sh = (ShapeCompartmentGradient) node.getNode_shape();
							Color fColor = sh.getForeGroundColor();	
							if (fColor instanceof SiriusSystemColors)
								((SiriusSystemColors) fColor).setName(dialog.getfColor());
							sh.setCornerHeight(dialog.getHeight());
							sh.setCornerWidth(dialog.getWidth());							
						}						
					}					
				}				
				return null;
			}				
		};
	}
	
	private DialogCellEditor getCellStyleDialog(Object element) {
		
		return new DialogCellEditor() {
			
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				if(element instanceof ConditionalStyle) {
					
					ConditionalStyle condStyle = (ConditionalStyle)	element;
					EObject parentEObject = ((ConditionalStyle) element).eContainer();					
					if (parentEObject instanceof Node) {
					
						EClass eClass = ((Node) parentEObject).getAnEClass();
						ConditionalStyleDialog dialogStyle = new ConditionalStyleDialog(cellEditorWindow.getShell(), eClass);
						dialogStyle.seteAttribute(condStyle.getEAttribute());
						dialogStyle.setValue(condStyle.getValue());
						
						if(dialogStyle.open() == Dialog.OK) {
							
							condStyle.setEAttribute(dialogStyle.geteAttribute());
							condStyle.setValue(dialogStyle.getValue());	
							updateContents("Conditional Style: " + condStyle.getEAttribute().getName() + "=" + 
								 condStyle.getValue());
							getViewer().update(element, null);
						}							
					}
				}
				return null;
			}			
			
		};
		
	}

}
