package org.mondo.visualization.ui.page.diagram.element;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.HeuristicStrategySettings;
import graphic_representation.AffixedCompartmentElement;
import graphic_representation.LabelEAttribute;
import graphic_representation.Layer;
import graphic_representation.PaletteDescriptionLink;

public abstract class AActionPageDiagramElements {
	
	private TreeViewer treeViewer;
	private HeuristicStrategy heuristicStrategy;
	private HeuristicStrategySettings heuristicStrategySettings;
	private Shell shell;
	private List listOfWarning;
		
	public List getListOfWarning() {
		return listOfWarning;
	}

	public AActionPageDiagramElements(TreeViewer treeViewer, Shell shell,
							HeuristicStrategy heuristicStrategy, HeuristicStrategySettings heuristicStrategySettings,
							List listOfWarning) {
		super();
		this.treeViewer = treeViewer;
		this.heuristicStrategy = heuristicStrategy;
		this.heuristicStrategySettings = heuristicStrategySettings;
		this.shell = shell;
		this.listOfWarning = listOfWarning;
	}
	
	public Object GetSelectedTreeViewerObject(){
		
		ISelection selection = treeViewer.getSelection();
		
		if(((IStructuredSelection)selection).size() == 1)
			return ((IStructuredSelection)selection).getFirstElement();
		else
			return selection;
	}

	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	public void setTreeViewer(TreeViewer treeViewer) {
		this.treeViewer = treeViewer;
	}
	
	public int MissingEReference(EList<EReference> fulllist, EList<PaletteDescriptionLink> list, EList<AffixedCompartmentElement> listAffixedCompartment)
	{
		
		int count_list = list.size();
		int count_fulllist = fulllist.size();
		int count_listAffixedCompartment = listAffixedCompartment.size();
		boolean find = false;
		boolean findaffixedcompartment = false;
		for (int i = 0; i < count_fulllist; i++) {
			
			for (int j = 0; j < count_listAffixedCompartment; j++) {
				
				if(listAffixedCompartment.get(j).getAnEReference().equals(fulllist.get(i))==true)
				{
					findaffixedcompartment = true;
					break;
				}				
							
			}
			if(findaffixedcompartment==false)
			{
				for (int j = 0; j < count_list; j++) {
					
					if(fulllist.get(i).equals(list.get(j).getAnEReference())){
						 find = true;
					 	 break;
					}
				}
				if(find==false)
					return i;
				find=false;				
			}
			findaffixedcompartment = false;
		}
		
		return -1;
	}
	
	public int MissingEAttribute(EList<EAttribute> fulllist, EList<LabelEAttribute> listLabelEAttribute)
	{
		Iterator<EAttribute> it_fullist = fulllist.iterator();
		Iterator<LabelEAttribute> it_listLabelEAttribute = listLabelEAttribute.iterator();
		if(it_listLabelEAttribute.hasNext() == false && it_fullist.hasNext() == true)
			return fulllist.indexOf(it_fullist.next());
		else
			if(it_listLabelEAttribute.hasNext() == false && it_fullist.hasNext() == false)
				return -1;
		while (it_fullist.hasNext()) {
			EAttribute attr = it_fullist.next();
			it_listLabelEAttribute = listLabelEAttribute.iterator();
			while (it_listLabelEAttribute.hasNext()) {
				LabelEAttribute labelAttribute = it_listLabelEAttribute.next();
				if(labelAttribute.getAnEAttribute().equals(attr))
					break;
				if(it_listLabelEAttribute.hasNext() == false)
					return fulllist.indexOf(attr);
			}
		}
		return -1;		
	}
	
	public Shell getShell()
	{
		return this.shell;
	}
	
	public HeuristicStrategy getHeuristicStrategy() {
		
		return this.heuristicStrategy;
	}
	
	public HeuristicStrategySettings getHeuristicStrategySettings()
	{
		return this.heuristicStrategySettings;
	}
	
	public Layer FindLayerByName(EList<Layer> listLayers, String selec) {
		
		Iterator<Layer> itLayers = listLayers.iterator();
		while (itLayers.hasNext()) {
			Layer currentLay = itLayers.next();
			if(currentLay.getName().equals(selec) == true)
				return currentLay;
		}		
		return null;
	}	
	
	public void DeleteFromWarnings(EClass anEClass)
	{
		String[] items = listOfWarning.getItems();
		for (String string : items) {
			if(string.contains("- " + anEClass.getName() + " -") == true)
				listOfWarning.remove(string);
		}
	}
}
