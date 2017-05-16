package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.AffixedElement;
import graphic_representation.CompartmentElement;
import graphic_representation.DefaultLayer;
import graphic_representation.Edge;
import graphic_representation.EdgeLabelEAttribute;
import graphic_representation.Edge_Direction;
import graphic_representation.LabelEAttribute;
import graphic_representation.Layer;
import graphic_representation.Link;
import graphic_representation.Node;
import graphic_representation.Node_Element;
import graphic_representation.Root;
import graphic_representation.impl.EdgeImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.mondo.visualization.ui.Activator;


public class CEClass extends ColumnLabelProvider{
		
	//Icons
	private static final Image EClass = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/EClass.gif").createImage();
	
	@Override
	public Image getImage(Object element) {
		
		if(element instanceof Node || element instanceof Edge|| element instanceof EClass || element instanceof Root)
			return EClass;
		return super.getImage(element);
	}

	public CEClass() {
		super();		
	}
	
	@Override
	public String getText(Object element) {
				
		if(element instanceof Layer)
			return ((Layer)element).getName();	
		
		if(element instanceof Root)
			return ((Root) element).getAnEClass().getName();
		
		if(element instanceof Node)
			return ((Node)element).getAnEClass().getName();
		
		if(element instanceof Edge)
			return ((EdgeImpl)element).getAnEClass().getName();
		
		if(element instanceof EClass)	
			return ((EClass)element).getName();		
		
		if(element instanceof Link)
		{
			EObject parent = ((Link) element).eContainer();
			if(parent instanceof Edge_Direction)
			{
				Edge_Direction edgDir = (Edge_Direction) parent;
				if(edgDir.getSourceLink().equals(element))
					return "EReference.Source";
				else
					return "EReference.Target";		
			}
			if(parent instanceof Node_Element)
				return "EReference.Link";			
		}		
		
		if(element instanceof LabelEAttribute)
			return "EAttribute.name";		
		
		if(element instanceof CompartmentElement)
			return "EReference.Compartment";
		
		if(element instanceof AffixedElement)
			return "EReference.Affixed";
		
		if(element instanceof EdgeLabelEAttribute)
			return "EAttribute.name";
		
		return super.getText(element);
	}

	@Override
	public Font getFont(Object element) {
		
		if(element instanceof DefaultLayer)
		{
			Font font = Display.getDefault().getSystemFont();
			FontData[] fontDatas = font.getFontData();
			for (FontData fontData : fontDatas) {
				fontData.setStyle(fontData.getStyle() | SWT.BOLD);
			}
			return new Font(Display.getDefault(), fontDatas);
		}
		return super.getFont(element);
	}	
}
