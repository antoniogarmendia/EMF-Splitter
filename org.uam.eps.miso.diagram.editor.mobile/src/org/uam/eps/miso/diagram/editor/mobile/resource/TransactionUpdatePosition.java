package org.uam.eps.miso.diagram.editor.mobile.resource;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.impl.ViewImpl;
import org.eclipse.sirius.diagram.ArrangeConstraint;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.diagram.ui.tools.internal.editor.DDiagramEditorImpl;

@SuppressWarnings("restriction")
public class TransactionUpdatePosition extends RecordingCommand{

	private Map<URI,NodePosition> mapIdPosition;
	private DDiagramEditorImpl graphicalEditor;
	
	public TransactionUpdatePosition(TransactionalEditingDomain domain, Map<URI,NodePosition> mapIdPosition,DDiagramEditorImpl graphicalEditor) {
		super(domain);
		
		this.mapIdPosition = mapIdPosition;
		this.graphicalEditor = graphicalEditor;
	}	

	@Override
	protected void doExecute() {
		// TODO Auto-generated method stub
		//IGraphicalEditPart 
		DiagramEditPart graphicalPart = graphicalEditor.getDiagramEditPart();
		
		@SuppressWarnings("unchecked")
		Iterator<EditPart> children = graphicalPart.getChildren().iterator();
						
		while (children.hasNext()) {
			EditPart editPart = (EditPart) children.next();
			//org.eclipse.gmf.runtime.notation.impl.NodeImpl
			Object editModel = editPart.getModel();
			if(editModel instanceof org.eclipse.gmf.runtime.notation.impl.NodeImpl)
			{
				org.eclipse.gmf.runtime.notation.impl.NodeImpl node = ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) editModel);
				final LayoutConstraint layoutConstraint = node.getLayoutConstraint();
				EObject element = node.getElement();
				if (layoutConstraint instanceof Bounds) {
					final Bounds bounds = (Bounds) layoutConstraint;
					if(element instanceof DNodeSpec)
					{
						PinnedElement((DNodeSpec)element);
						EList<EObject> eListSemantic = ((DNodeSpec)element).getSemanticElements();
						if(eListSemantic.size()>=1)
						{
							EObject eObjectSemantic = eListSemantic.get(0);
							NodePosition pos = mapIdPosition.get(EcoreUtil.getURI(eObjectSemantic));
							bounds.setX(pos.getX());
							bounds.setY(pos.getY());							
						}
						else
						{
							System.out.println("Lista");
						}
					}
					else
					{
						System.out.println("DNodeSpec");
					}
				}
				else
				{
					System.out.println("Bounds");
				}
			}			
			graphicalPart.refresh();
		}		
	}

	private void PinnedElement(DNodeSpec element) {
		// TODO Auto-generated method stub
		((DNodeSpec)element).getArrangeConstraints().add(ArrangeConstraint.KEEP_LOCATION);
		((DNodeSpec)element).getArrangeConstraints().add(ArrangeConstraint.KEEP_SIZE);
		((DNodeSpec)element).getArrangeConstraints().add(ArrangeConstraint.KEEP_RATIO);
	}

}
