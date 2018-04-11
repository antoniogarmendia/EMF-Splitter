package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.AffixedCompartmentElement;
import graphic_representation.AffixedElement;
import graphic_representation.CompartmentElement;
import graphic_representation.EdgeLabelEAttribute;
import graphic_representation.LabelEAttribute;
import graphic_representation.Link;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.mondo.visualization.ui.Activator;

public class CActivate extends ColumnLabelProvider {

	//Icons
	private static final Image EAttribute = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/EAttribute.gif").createImage();
	private static final Image EReference = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/EReference.gif").createImage();
	
	@Override
	public String getText(Object element) {
		
		if(element instanceof EdgeLabelEAttribute)
			return ((EdgeLabelEAttribute) element).getLabelEAttribute().getName();
		if(element instanceof Link)
			return ((Link) element).getAnEReference().getName();
		if(element instanceof AffixedCompartmentElement)
			return ((AffixedCompartmentElement) element).getAnEReference().getName();
		
		if(element instanceof LabelEAttribute)
			return ((LabelEAttribute) element).getAnEAttribute().getName();
		return "";
	}

	@Override
	public Image getImage(Object element) {
		
		if(element instanceof LabelEAttribute || element instanceof EdgeLabelEAttribute)
			return EAttribute;
		if(element instanceof AffixedElement || element instanceof CompartmentElement || element instanceof Link)
			return EReference;		
		return super.getImage(element);
	}	

}
