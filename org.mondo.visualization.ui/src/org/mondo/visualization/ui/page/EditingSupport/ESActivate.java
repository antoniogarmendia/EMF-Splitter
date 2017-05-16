package org.mondo.visualization.ui.page.EditingSupport;

import graphic_representation.AffixedCompartmentElement;
import graphic_representation.AffixedElement;
import graphic_representation.CompartmentElement;
import graphic_representation.EdgeLabelEAttribute;
import graphic_representation.Edge_Direction;
import graphic_representation.LabelEAttribute;
import graphic_representation.Link;
import graphic_representation.Node_Element;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.impl.Graphic_representationFactoryImpl;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

public class ESActivate extends EditingSupport{
	
	private ComboBoxCellEditor cmb_editor;
	
	public ESActivate(ColumnViewer viewer) {
		
		super(viewer);		
		cmb_editor = new ComboBoxCellEditor((Composite) getViewer().getControl(), new String[]{});
		cmb_editor.setStyle(SWT.CENTER);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		if(element instanceof LabelEAttribute)//LabelEAttr
		{
			EAttribute attr = ((LabelEAttribute)element).getAnEAttribute();
			EClass class_attr = attr.getEContainingClass();
			AddEAllAttributes(class_attr);
			return cmb_editor;
		}
		
		if(element instanceof EdgeLabelEAttribute) { //Edge Attribute
			
			AddEAllAttributes(((EdgeLabelEAttribute)element).getLabelEAttribute().getEContainingClass());
			return cmb_editor;
		}
		
		if(element instanceof Link)
		{
			Link ref = (Link)element;
			EClass class_attr = ref.getAnEReference().getEContainingClass();
			AddEAllEReferences(class_attr);
			return cmb_editor;
		}
		
		if(element instanceof AffixedCompartmentElement)
		{
			EReference ref = ((AffixedCompartmentElement)element).getAnEReference();
			EClass class_attr = ref.getEContainingClass();
			AddEAllEReferencesContainments(class_attr);
			return cmb_editor;
		}	
		
		return null;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if(element instanceof LabelEAttribute || element instanceof Link || element instanceof AffixedCompartmentElement
				|| element instanceof EdgeLabelEAttribute)
			return true;
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (element instanceof LabelEAttribute) {
			EAttribute attr = ((LabelEAttribute) element).getAnEAttribute();
			return FindEAttribute(attr);
		}
		
		if (element instanceof EdgeLabelEAttribute)
			return FindEAttribute(((EdgeLabelEAttribute)element).getLabelEAttribute());
		
		if(element instanceof Link)
			return this.FindEReference(((Link)element).getAnEReference());	
		
		if(element instanceof AffixedCompartmentElement)
			return this.FindEReferenceContainment(((AffixedCompartmentElement)element).getAnEReference());
				
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
				
		if(element instanceof LabelEAttribute)
		{
			LabelEAttribute attrLabel = (LabelEAttribute)element;
			EClass class_attr = attrLabel.getAnEAttribute().getEContainingClass();
			EAttribute newattr = class_attr.getEAllAttributes().get(((Integer)value));
			if(!newattr.equals(attrLabel.getAnEAttribute())){
				EObject nodElementEObject = attrLabel.eContainer();
				if(nodElementEObject instanceof Node_Element)
				{
					Node_Element nodElement = (Node_Element)nodElementEObject;
					int index = this.MissingEAttribute(class_attr.getEAllAttributes(), nodElement.getLabelanEAttribute());
					if(index!=-1)
						attrLabel.setAnEAttribute(newattr);						
					else
						MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
								"Information about addition",
								"The attribute is already selected  as a label");
				}			
			}
		}
		
		if(element instanceof EdgeLabelEAttribute) {
			
			EdgeLabelEAttribute labelEdge = ((EdgeLabelEAttribute) element);
			EAttribute eAttribute = labelEdge.getLabelEAttribute();
			EClass eClass = eAttribute.getEContainingClass();
			EAttribute newEAttribute = eClass.getEAllAttributes().get((Integer)value);
			if(!newEAttribute.equals(eAttribute)) {
				labelEdge.setLabelEAttribute(newEAttribute);
			}			
		}
		
		if(element instanceof Link)
		{
			Link elementLink = (Link)element;
			EObject parent_elementLink = elementLink.eContainer();
			if(parent_elementLink instanceof Edge_Direction)
			{
				Edge_Direction edgDir = (Edge_Direction) parent_elementLink;
				EReference newRef = this.FindReferencebyPosition(elementLink.getAnEReference(), (Integer)value);
				if(edgDir.getSourceLink().equals(elementLink)){
					if(edgDir.getSourceLink().getAnEReference().equals(newRef) == false)
					{
						edgDir.getTargetLink().setAnEReference(edgDir.getSourceLink().getAnEReference());
						Link updateLink = edgDir.getSourceLink();
						updateLink.setAnEReference(newRef);
						getViewer().update(updateLink, null);
						getViewer().refresh();
					}
				}
				else if(edgDir.getTargetLink().equals(elementLink))
				{
					if(edgDir.getTargetLink().getAnEReference().equals(newRef) == false)
					{	
						edgDir.getSourceLink().setAnEReference(edgDir.getTargetLink().getAnEReference());
						Link updateLink = edgDir.getTargetLink();
						updateLink.setAnEReference(newRef);
						getViewer().update(updateLink, null);
						getViewer().refresh();
					}
				}				
			}	
			if(parent_elementLink instanceof Node_Element)
			{
				PaletteDescriptionLink linkref = (PaletteDescriptionLink) element;
				Node_Element parentNode_Element = (Node_Element) parent_elementLink;
				EList<PaletteDescriptionLink> full_list = parentNode_Element.getLinkPalette();
				EClass class_ref = linkref.getAnEReference().getEContainingClass();
				EReference newref = class_ref.getEAllReferences().get(((Integer)value));
				int index = FindEReferenceLinkPalette(full_list, newref);
				if(index==-1)
				{
					Iterator<AffixedCompartmentElement> itCompartAffixed = parentNode_Element.getAffixedCompartmentElements().iterator();
					while (itCompartAffixed.hasNext()) {
						AffixedCompartmentElement type = (AffixedCompartmentElement) itCompartAffixed.next();
						if(type.getAnEReference().equals(newref))
							{
								if(type instanceof AffixedElement)
									MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
											"Information about addition",
											"The Containment Reference is already selected  as an Affixed");
								else if(type instanceof CompartmentElement)
									MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
											"Information about addition",
											"The Containment Reference is already selected  as a Compartment");
								return;
							}
					}
					
					int pos = parentNode_Element.getLinkPalette().indexOf(linkref);
					PaletteDescriptionLink newlinkref  = Graphic_representationFactoryImpl.eINSTANCE.createPaletteDescriptionLink();
					newlinkref.setAnEReference(newref);
					newlinkref.setPalette_name("Create Link " + newref.getName());
					parentNode_Element.getLinkPalette().set(pos, newlinkref);
				}
				else
				{
					if(newref.equals(elementLink.getAnEReference()) == false)
						MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
																	"Information about addition",
																	"The reference is already selected  as a link");
				}
			}
		}	
		
		getViewer().update(element, null);	
		getViewer().refresh();
	}
	
	private void AddEAllAttributes(EClass class_attr) {
		
		EList<EAttribute> listEAttribute = class_attr.getEAllAttributes();
		ArrayList<String> list = new ArrayList<String>();
		int count = listEAttribute.size();
		for (int i = 0; i < count; i++) {
			list.add(listEAttribute.get(i).getName());
		}
		cmb_editor.setItems(list.toArray(new String[count]));
	}
	
	private void AddEAllEReferences(EClass class_attr) {
		
		EList<EReference> listEReference = class_attr.getEAllReferences();
		ArrayList<String> list = new ArrayList<String>();
		int count = listEReference.size();
		for (int i = 0; i < count; i++) {
			list.add(listEReference.get(i).getName());
		}
		cmb_editor.setItems(list.toArray(new String[count]));
	}
	
	private void AddEAllEReferencesContainments(EClass class_attr){
		
		EList<EReference> listEReference = class_attr.getEAllContainments();
		ArrayList<String> list = new ArrayList<String>();
		int count = listEReference.size();
		for (int i = 0; i < count; i++) {
			list.add(listEReference.get(i).getName());
		}
		cmb_editor.setItems(list.toArray(new String[count]));
		
	}	
	
	//Method for search the position of the EReference
	public int FindEReference(EReference ref){
		
		return ref.getEContainingClass().getEAllReferences().indexOf(ref);	
	}
	
	//Method for search the EReference from position
	public EReference FindReferencebyPosition(EReference ref,int pos)
	{
		EClass anEClass = ref.getEContainingClass();
		return anEClass.getEAllReferences().get(pos);
	}
	
	//Method for search the position of an EReference Containment
	public int FindEReferenceContainment(EReference ref){
	
		return ref.getEContainingClass().getEAllContainments().indexOf(ref);		
	}
	
	//Method for search the EReference Containment by position 
	public EReference FindReferenceContainmentbyPosition(EReference ref,int pos){
		
		EClass anEClass = ref.getEContainingClass();
		return anEClass.getEAllContainments().get(pos);
	}
	
	//Method for search the position of the EAttribute
	public int FindEAttribute(EAttribute attr){
		
		int indexEAttribute =  attr.getEContainingClass().getEAllAttributes().indexOf(attr);
		return indexEAttribute;		
	}
	
	public int FindEReferenceLinkPalette(EList<PaletteDescriptionLink> full_list, EReference ref){
		
		int count_list = full_list.size();
		for (int i = 0; i < count_list; i++) {
			if(full_list.get(i).getAnEReference().equals(ref))
				return i;
		}
		return -1;				
	}	
	
	private int MissingEAttribute(EList<EAttribute> fulllist, EList<LabelEAttribute> listLabelEAttribute)
	{
		Iterator<EAttribute> it_fullist = fulllist.iterator();		
		while (it_fullist.hasNext()) {
			EAttribute attr = (EAttribute) it_fullist.next();
			Iterator<LabelEAttribute> it_listLabelEAttribute = listLabelEAttribute.iterator();
			while (it_listLabelEAttribute.hasNext()) {
				LabelEAttribute labelAttribute = (LabelEAttribute) it_listLabelEAttribute.next();
				if(labelAttribute.getAnEAttribute().equals(attr))
					break;
				if(it_listLabelEAttribute.hasNext() == false)
					return fulllist.indexOf(attr);
			}
		}
		return -1;	
	}
}
