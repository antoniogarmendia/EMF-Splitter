package org.uam.eps.modular.constraints.dialog.def;

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
import constraints.Constraint;

public class ConstraintAllActionDialog {
	
	private TreeViewer viewer;
	private MenuManager menuManager;
	
	//Actions
	private Action actionDeleteConstraint;
	
	public ConstraintAllActionDialog(TreeViewer viewer, Shell shell) {
		super();
		this.viewer = viewer;
		this.menuManager = new MenuManager(){
				@Override
				public IContributionItem[] getItems() {
					
					IContributionItem[] items = super.getItems();
					 List<IContributionItem> filteredItems = new ArrayList<IContributionItem>();
						 for (IContributionItem item : items) {
							 if( item != null
							           && item.getId() != null
							           && item.getId().startsWith( "com.wizard.constraint.definition" ))
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
	
	private void fillContextMenu(IMenuManager manager) {
		
		Object obj = this.GetSelectedTreeViewerObject();
		
		if (obj instanceof Constraint) {
			manager.add(actionDeleteConstraint);
		}
		
	}

	private Object GetSelectedTreeViewerObject() {
		
		ISelection selection = viewer.getSelection();
		
		if(((IStructuredSelection)selection).size() == 1)
			return ((IStructuredSelection)selection).getFirstElement();
		else
			return selection;
	}

	public void makeActions() {
		
		makeActionDeleteConstraint();
	}
	
	private void makeActionDeleteConstraint() {
		
		this.actionDeleteConstraint = new Action() {
			
			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Constraint) {
					EcoreUtil.delete((EObject) obj);
					viewer.refresh();
				}				
				System.out.println("Delete");
			}
		};
		
		this.actionDeleteConstraint.setId("com.wizard.constraint.definition.delete.constraint");
		this.actionDeleteConstraint.setText("Delete Constraint");
		this.actionDeleteConstraint.setToolTipText("Delete Constraint");
	}	
	
}
