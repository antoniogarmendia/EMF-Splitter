package org.miso.wizard.instantiate.modular.pattern.pages.filter;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ICheckStateProvider;

import MetaModelGraph.Graph;
import MetaModelGraph.SubGraph;

public class TableCheckProvider implements ICheckStateProvider{

	private Graph graph;
	
	public TableCheckProvider(Graph pGraph) {
		this.graph = pGraph;
	}
	
	@Override
	public boolean isChecked(Object element) {
		
		if(element instanceof EClass)
			return findEClassRoot((EClass) element);		
		
		return false;
	}

	@Override
	public boolean isGrayed(Object element) {
		// do nothing
		return false;
	}
	
	private boolean findEClassRoot(EClass eClass){
		
		Iterator<SubGraph> itSubGraph = graph.getSubgraph().iterator();
		while (itSubGraph.hasNext()) {
			SubGraph subGraph = (SubGraph) itSubGraph.next();
			if(eClass.equals(subGraph.getRoot().getEClass()))
				return true;
		}
		
		return false;
	}

}
