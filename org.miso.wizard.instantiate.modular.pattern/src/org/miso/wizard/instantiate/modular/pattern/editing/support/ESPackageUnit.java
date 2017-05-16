package org.miso.wizard.instantiate.modular.pattern.editing.support;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;

import MetaModelGraph.Composition;
import MetaModelGraph.EnumModular;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;
import MetaModelGraph.SubGraph;

public class ESPackageUnit extends EditingSupport{
	
	
	private ModularDialogCellEditor cellModularDialog;

	public ESPackageUnit(ColumnViewer viewer) {
		
		super(viewer);		
		cellModularDialog = new ModularDialogCellEditor();		
		cellModularDialog.create((Composite) getViewer().getControl());
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		return this.cellModularDialog;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		Node node = null;
		
		if(element instanceof Node){
			
			node = (Node) element;			
		}
		
		if(element instanceof Composition){
			
			Composition composition = (Composition) element;
			node = composition.getTarget();
		}
		
		if(element instanceof SubClass){
			
			SubClass subClass = (SubClass)element;
			node = subClass.getTarget();
		}
		
		if(node.getEClass().isAbstract() == true){
		
			MessageBox messageBox = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),SWT.ICON_ERROR);
			messageBox.setMessage("The class can not be abstract");	
			messageBox.setText("Modular Definition");
			messageBox.open();
			return false;
		}	
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		String result = "";
		List<EnumModular> listModularNotation = null;
		boolean isProject = false;
		Node node = null;
		
		if(element instanceof Node){
			
			node = (Node) element;			
		}
		
		if(element instanceof Composition){
			
			Composition composition = (Composition) element;
			node = composition.getTarget();
		}
		
		if(element instanceof SubClass){
			
			node = ((SubClass) element).getTarget();
		}			
		
		result = stringModularNotation(node.getEnumModularNotation());
		listModularNotation = node.getEnumModularNotation();
		isProject = isProject(node);
				
		this.cellModularDialog.setProject(isProject);
		this.cellModularDialog.setListModularSettings(listModularNotation);
		
		return result;
	}

	private boolean isProject(Node node) {
		
		EObject eObject = node.eContainer();
		if(eObject instanceof SubGraph){
			
			SubGraph subGraph = (SubGraph)eObject;
			if(subGraph.getRoot().equals(node))
				return true;
		}			
		
		return false;
	}

	private String stringModularNotation(EList<EnumModular> enumModularNotation) {
		
		String result = "";
		for (int i = 0; i < enumModularNotation.size(); i++) {
			EnumModular element = enumModularNotation.get(i);
			if(i+1 < enumModularNotation.size() == true)
				result = result + element.getName() + "|";
			else
				result = result + element.getName();
		}
		
		return result;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		//Check if there still one modular notation
		Node node = getCurrentNode(element);
		if(node.getEnumModularNotation().size()==0){
			node.setName(null);
			node.setExtension("");
			node.setIcon("");
		}
		else
			if(node.getEnumModularNotation().indexOf(EnumModular.UNIT)==-1){
				node.setExtension("");
			}

			
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
