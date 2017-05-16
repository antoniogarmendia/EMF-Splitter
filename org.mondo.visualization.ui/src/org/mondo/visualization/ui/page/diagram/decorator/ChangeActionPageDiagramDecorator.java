package org.mondo.visualization.ui.page.diagram.decorator;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;

import graphic_representation.Edge;
import graphic_representation.Node;

public class ChangeActionPageDiagramDecorator {
	
	private Action actionCopyLayout;
	private TreeViewer treeViewer;
	
	public ChangeActionPageDiagramDecorator(TreeViewer treeViewer) {
		super();
		this.treeViewer = treeViewer;
	}

	public void makeActions()
	{
		makeActionCopyLayout();		
	}

	private void makeActionCopyLayout() {
		
		actionCopyLayout = new Action(){

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				Object input = getTreeViewer().getInput();
				if(input instanceof Object[])					
				{
					Object[] inputArray = (Object[])input;
					if(obj instanceof Node)
						CopyLayoutNode(inputArray,(Node)obj);
					else if(obj instanceof Edge)
						CopyLayoutEdge(inputArray,(Edge)obj);				
				}			
				getTreeViewer().refresh();
				System.out.println("Copy Layout");
			}

			private void CopyLayoutEdge(Object[] inputArray, Edge obj) {
				// TODO Auto-generated method stub
				for (int i = 0; i < inputArray.length; i++) {
					Object object = inputArray[i];
					if(object instanceof Edge)
					{
						Edge edg = (Edge)object;
						edg.getDirections().getSourceLink().setDecoratorName(obj.getDirections().getSourceLink().getDecoratorName());
						edg.getDirections().getTargetLink().setDecoratorName(obj.getDirections().getTargetLink().getDecoratorName());
						edg.setEdge_style(EcoreUtil.copy(obj.getEdge_style()));
					}
				}
			}

			private void CopyLayoutNode(Object[] inputArray, Node objCopy) {
				
				for (int i = 0; i < inputArray.length; i++) {
					Object object = inputArray[i];
					if(object instanceof Node)
					{
						Node node = (Node)object;
						node.setNode_shape(EcoreUtil.copy(objCopy.getNode_shape()));						
					}
				}
			}		
			
		};
		
		actionCopyLayout.setId("com.wizard.visualization.decorator.ActionCopyLayout");
		actionCopyLayout.setText("Copy Style to All");
		actionCopyLayout.setToolTipText("Copy Style to All");
		
	}
	
	public Action getActionCopyLayout()
	{
		return this.actionCopyLayout;
	}
	
	public TreeViewer getTreeViewer() {
		return this.treeViewer;
	}
	
	public Object GetSelectedTreeViewerObject(){
		
		ISelection selection = treeViewer.getSelection();
		
		if(((IStructuredSelection)selection).size() == 1)
			return ((IStructuredSelection)selection).getFirstElement();
		else
			return selection;
	}

}
