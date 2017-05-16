package org.miso.wizard.instantiate.modular.pattern.content.provider;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;

import MetaModelGraph.Composition;
import MetaModelGraph.Node;
import MetaModelGraph.Relation;
import MetaModelGraph.SubClass;
import MetaModelGraph.SubGraph;

public class GraphContentProvider implements ITreeContentProvider{

	private TreeViewer eTreeViewer;
	
	public GraphContentProvider(TreeViewer pTreeViewer) {
		super();
		this.eTreeViewer = pTreeViewer;
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		
		return (Object[])inputElement;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
	
		if(parentElement instanceof Relation){
			
			Node node = null;
			if(parentElement instanceof Composition)
				node = ((Composition) parentElement).getTarget();
			else if (parentElement instanceof SubClass)
				node = ((SubClass) parentElement).getTarget();
			EList<Relation> eListNodes = new BasicEList<Relation>();
			eListNodes.addAll(getCompositions(node));
			eListNodes.addAll(getCompositionsSubClasses(node));
			return eListNodes.toArray();
		}		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		Widget widget = this.eTreeViewer.testFindItem(element);
		
		if(widget instanceof TreeItem){
			
			TreeItem treeItem = (TreeItem) widget;
			boolean expanded = treeItem.getExpanded();
			if(expanded==false){
				if(isVisible(element) == true)
					return false;
			}			
		}			
		
		if(element instanceof Relation){
			
			Node node = null;
			if(element instanceof Composition)
				node = ((Composition) element).getTarget();
			else if(element instanceof SubClass)
				node =  ((SubClass) element).getTarget();
			
			SubGraph subGraph = (SubGraph) node.eContainer();
			if(subGraph.getRoot().getEClass().equals(node.getEClass()))
				return false;			
			
			if(node.getCompositions().size()!=0){
				
				boolean checkComposition = checkCompositions(node);
				if(checkComposition == true)
					return true;				
			}
			if(node.getDirectSubclasses().size()!=0)
				return true;			
		}	
			
		return false;
	}
	
	public boolean checkCompositions(Node node){
		
		Iterator<Composition> itCompositions = node.getCompositions().iterator();
		while (itCompositions.hasNext()) {
			Composition composition = (Composition) itCompositions.next();
			if(!composition.getTarget().equals(node))
				return true;
		}
		
		return false;
	}
	
	public boolean checkSubClasses(Node node){
		
		Iterator<SubClass> itSubClasses = node.getSubClasses().iterator();
		while (itSubClasses.hasNext()) {
			SubClass subClass = (SubClass) itSubClasses.next();
			Iterator<Composition> itCompositions = subClass.getTarget().getCompositions().iterator();
			while (itCompositions.hasNext()) {
				Composition composition = (Composition) itCompositions.next();
				if(!composition.getTarget().equals(node))
					return true;			
			}
		}	
		return false;
	}
	
	public EList<Composition> getCompositions(Node node){
		
		EList<Composition> eListNodes = new BasicEList<Composition>();
		Iterator<Composition> itCompositions = node.getCompositions().iterator();
		while (itCompositions.hasNext()) {
			Composition composition = (Composition) itCompositions.next();
			if(!composition.getTarget().equals(node))
				eListNodes.add(composition);
		}
		return eListNodes;
	}
	
	public EList<SubClass> getCompositionsSubClasses(Node node){
		
		EList<SubClass> eListSubClasses = new BasicEList<SubClass>();
		Iterator<SubClass> itSubClasses = node.getDirectSubclasses().iterator();
		while (itSubClasses.hasNext()) {
			SubClass subClass = (SubClass) itSubClasses.next();
			eListSubClasses.add(subClass);			
		}		
		return eListSubClasses;
	}	
	
	private boolean isVisible(Object element){
		
		if(element instanceof Composition)
			return isVisibleComposition((Composition) element);
		else if(element instanceof SubClass)
			return isVisibleSubClass((SubClass) element);		
		return false;		
	}

	private boolean isVisibleComposition(Composition element) {
		
		Composition composition = null; 
		Object[] arrayExpandedElements = eTreeViewer.getExpandedElements();
		for (Object object : arrayExpandedElements) {
			if(object instanceof Composition){
				composition = (Composition)object;
				if(element.getTarget().getEClass().getName().equals(composition.getTarget().getEClass().getName()))
				{
					if(element.getEReference().getName().equals(composition.getEReference().getName()))
						return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean isVisibleSubClass(SubClass element){
		
		SubClass subClass = null; 
		Object[] arrayExpandedElements = eTreeViewer.getExpandedElements();
		for (Object object : arrayExpandedElements) {
			if(object instanceof SubClass){
				subClass = (SubClass)object;
				if(element.getTarget().getEClass().getName().equals(subClass.getTarget().getEClass().getName()))
					return true;				
			}
		}
		
		return false;
	}
}
