package org.mondo.visualization.ui.page.diagram.decorator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Shell;
import org.mondo.visualization.ui.wizard.ConditionalStyleDialog;

import graphic_representation.ConditionalStyle;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.Node;

public class AddNodeActionPageDiagramDecorator {
	
	private TreeViewer treeViewer;	
	private Shell shell;
	
	private Action actionAddConditionalStyle;
	private Action actionDeleteConditionalStyle;
	
	public AddNodeActionPageDiagramDecorator(TreeViewer treeViewer, Shell shell) {
		this.treeViewer = treeViewer;
		this.shell = shell;
	}
	
	public void makeActions() {
		makeActionAddConditionalStyle();
		makeActionDeleteConditionalStyle();
	}
	
	private void makeActionDeleteConditionalStyle() {
		
		actionDeleteConditionalStyle = new Action() {
			
			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof ConditionalStyle) {
					EObject parentEObject = ((ConditionalStyle) obj).eContainer();
					EcoreUtil.remove((EObject) obj);
					treeViewer.refresh(parentEObject);
				}
			}
			
		};
		
		actionDeleteConditionalStyle.setId("com.wizard.visualization.decorator.AddNodeConditionalStyle");
		actionDeleteConditionalStyle.setText("Delete Conditional Style");
		actionDeleteConditionalStyle.setToolTipText("Delete Conditional Style");
	}

	private void makeActionAddConditionalStyle() {
		
		actionAddConditionalStyle = new Action() {
			
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Node) {
					Node node = (Node) obj;
					ConditionalStyleDialog dialog = new ConditionalStyleDialog(shell, node.getAnEClass());
					if (dialog.open() == Dialog.OK) {
						//Create Conditional Style and get values from the dialog
						ConditionalStyle style = Graphic_representationFactory.eINSTANCE.createConditionalStyle();
						style.setEAttribute(dialog.geteAttribute());
						style.setValue(dialog.getValue());
						style.setConditionalStyle(EcoreUtil.copy(node.getNode_shape()));
						node.getConditionalStyle().add(style);
						treeViewer.refresh(obj);
					}
				}
			}			
		};
		
		actionAddConditionalStyle.setId("com.wizard.visualization.decorator.AddNodeConditionalStyle");
		actionAddConditionalStyle.setText("Add Conditional Style");
		actionAddConditionalStyle.setToolTipText("Conditional Style");		
	}
	
	public Action getAddConditionalStyle() {
		return actionAddConditionalStyle;
	}
	
	public Action getActionDeleteConditionalStyle() {
		return actionDeleteConditionalStyle;
	}
	
	public Object GetSelectedTreeViewerObject(){
		
		ISelection selection = treeViewer.getSelection();
		
		if(((IStructuredSelection)selection).size() == 1)
			return ((IStructuredSelection)selection).getFirstElement();
		else
			return selection;
	}

}
