package org.miso.wizard.instantiate.modular.pattern.editing.support;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;

import MetaModelGraph.Composition;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;

public class ESColumnName extends EditingSupport{

	
	private ComboBoxCellEditor cellEditor;
	private List<String> showNames;
	private EList<EAttribute> listAttributes;
	
	public ESColumnName(ColumnViewer viewer) {
		super(viewer);
		cellEditor = new ComboBoxCellEditor((Composite) getViewer().getControl(),new String[]{});
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		Node node = getCurrentNode(element);
		EClass eClass = node.getEClass();
		Iterator<EAttribute> allAttributes  = eClass.getEAllAttributes().iterator();
		showNames = new ArrayList<String>();
		listAttributes = new BasicEList<EAttribute>();
				
		while (allAttributes.hasNext()) {
			EAttribute currentAttribute = (EAttribute) allAttributes.next();
			String eClassifier = currentAttribute.getEType().getInstanceTypeName();
			if (eClassifier != null){
				if (eClassifier.contains("String")){
				
					showNames.add(currentAttribute.getName());
					listAttributes.add(currentAttribute);				
				}
			}
		}
			
		this.cellEditor.setItems(showNames.toArray(new String[showNames.size()]));
			
		return this.cellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		Node node = getCurrentNode(element);
				
		if(node!=null){
			
			if(node.getEnumModularNotation().size()>0)
				return true;
		}
		
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		Node node = getCurrentNode(element);
		EAttribute eAttribute = node.getName();
		if(eAttribute!=null){
			
			int indexOf = this.listAttributes.indexOf(eAttribute.getName());
			if(indexOf!=-1)
				return indexOf;
		}
		
		return 0;
	}

	@Override
	protected void setValue(Object element, Object value) {

		Node node = getCurrentNode(element);
		int index = (Integer)value;
		if(index!=-1)
			node.setName(listAttributes.get(index));
		
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
