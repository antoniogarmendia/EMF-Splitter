package org.uam.eps.modular.visibility.wizard.def;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import visibility.Visibility;

public class VisibilityAllActionDialog {
	
	private TreeViewer viewer;
	private MenuManager menuManager;
	
	//Actions
	private Action actionDeleteVisibilityRule;

	public VisibilityAllActionDialog(TreeViewer viewer, Shell shell) {
		
		this.viewer = viewer;
		this.menuManager = new MenuManager() {
				
			@Override
			public IContributionItem[] getItems() {
				
				IContributionItem[] items = super.getItems();
				 List<IContributionItem> filteredItems = new ArrayList<IContributionItem>();
					 for (IContributionItem item : items) {
						 if( item != null
						           && item.getId() != null
						           && item.getId().startsWith( "com.wizard.visibility.definition" ))
						         filteredItems.add( item );					 
					 }
				 
					 items = new IContributionItem[ filteredItems.size()];
				return filteredItems.toArray( items );				
			}
		};
		
		this.menuManager.setRemoveAllWhenShown(true);			
	}
	
	public void init() {
		
		makeActions();
		
		this.menuManager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});
		
		Menu menu = this.menuManager.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().
		registerContextMenu(this.menuManager, viewer);		
	}

	public void fillContextMenu(IMenuManager manager) {
		
		Object obj = this.GetSelectedTreeViewerObject();
		
		if (obj instanceof Visibility) {
			manager.add(actionDeleteVisibilityRule);
		}
		
	}

	private Object GetSelectedTreeViewerObject() {
		
		ISelection selection = viewer.getSelection();
		
		if(((IStructuredSelection)selection).size() == 1)
			return ((IStructuredSelection)selection).getFirstElement();
		else
			return selection;		
	}

	private void makeActions() {

		makeActionDeleteConstraint();		
	}

	private void makeActionDeleteConstraint() {
		
		this.actionDeleteVisibilityRule = new Action() {
			
			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Visibility) {
					EcoreUtil.delete((EObject) obj);
					viewer.refresh();
				}				
				System.out.println("Delete");
			}
		};
		
		this.actionDeleteVisibilityRule.setId("com.wizard.visibility.definition.delete.rule");
		this.actionDeleteVisibilityRule.setText("Delete Visibility Rule");
		this.actionDeleteVisibilityRule.setToolTipText("Delete Visibility Rule");		
	}
}
