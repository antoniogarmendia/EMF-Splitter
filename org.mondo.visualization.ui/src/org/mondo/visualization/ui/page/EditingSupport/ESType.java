package org.mondo.visualization.ui.page.EditingSupport;

import java.util.List;

import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.Edge_Direction;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.Layer;
import graphic_representation.Link;
import graphic_representation.Node;
import graphic_representation.impl.Graphic_representationFactoryImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

public class ESType extends EditingSupport{

	private ComboBoxCellEditor cellEditor;
	
	public ESType(ColumnViewer viewer) {
		
		super(viewer);		
		cellEditor = new ComboBoxCellEditor((Composite) getViewer().getControl(), new String[]{"Node","Edge"});	
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		return cellEditor;		 
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if(element instanceof DiagramElement)
			return true;
		else
			return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		if(element instanceof Node)
			return 0;
		if(element instanceof Edge)
			return 1;
		return 0;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if(value instanceof Integer){
			int val = (Integer)value;
			if(val==0 && element instanceof Edge){
				Edge edg = (Edge)element;
				Node nod = Graphic_representationFactoryImpl.eINSTANCE.createNode();
				nod.setAnEClass(edg.getAnEClass());
				nod.getContainerReference().clear();
				nod.getContainerReference().addAll(edg.getContainerReference());
				nod.setNode_elements(Graphic_representationFactoryImpl.eINSTANCE.createNode_Element());
				nod.setDiag_palette(Graphic_representationFactory.eINSTANCE.createPaletteDescription());
				nod.getDiag_palette().setPalette_name("Create " + nod.getAnEClass().getName());
				nod.setNode_shape(Graphic_representationFactory.eINSTANCE.createRectangle());
				SetOldToNewEObject((Edge)element, nod);				
			}
			else if(val==1 && element instanceof Node){
				Node nod = (Node)element;
				Edge edg = Graphic_representationFactoryImpl.eINSTANCE.createEdge();
				edg.getContainerReference().clear();
				edg.getContainerReference().addAll(nod.getContainerReference());
				//edg.setContainerReference(nod.getContainerReference());
				edg.setEdge_style(Graphic_representationFactory.eINSTANCE.createEdge_Style());
				EClass anEClass = nod.getAnEClass();
				List<EReference> listReferences = anEClass.getEAllReferences();
				int count = listReferences.size();
				boolean src = false;
				boolean trg = false;
				Edge_Direction dir = Graphic_representationFactoryImpl.eINSTANCE.createEdge_Direction();
				for (int i = 0; i < count; i++) {
					EReference eReference = listReferences.get(i);
					if(eReference.isContainment() == false)
					{
						Link linkValue = Graphic_representationFactoryImpl.eINSTANCE.createLink();
						linkValue.setAnEReference(eReference);
						if(!src){
							dir.setSourceLink(linkValue);							
							src = true;
						}
						else
							if(!trg){
								dir.setTargetLink(linkValue);
								trg = true;
								break;
							}
					}
				}
				if(src==true && trg==true){
					edg.setAnEClass(anEClass);
					edg.setDirections(dir);
					edg.setDiag_palette(Graphic_representationFactory.eINSTANCE.createPaletteDescription());
					edg.getDiag_palette().setPalette_name("Create " + nod.getAnEClass().getName());
					SetOldToNewEObject((DiagramElement)element, edg);	
				}
				else
				{
					MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							"Information about addition",
							"The class has no enough references.");
					return;
				}
			}		
		}		
	}
	
	private void SetOldToNewEObject(DiagramElement element, DiagramElement newElement) {
		
		Layer parent = (Layer)element.eContainer();
		int indexOfElement = parent.getElements().indexOf(element);
		Object[] expandElements = ((TreeViewer)getViewer()).getExpandedElements();
		parent.getElements().remove(indexOfElement);
		parent.getElements().add(indexOfElement, newElement);
		((TreeViewer)getViewer()).setExpandedElements(expandElements);
		getViewer().refresh(parent);	
	}
}
