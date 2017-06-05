package org.miso.wizard.instantiate.modular.pattern.label.provider;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import MetaModelGraph.Composition;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;

public class LabelProviderEClassName extends ColumnLabelProvider{

	//íconos
	final public static Image imageComposition = AbstractUIPlugin.
			imageDescriptorFromPlugin("org.miso.wizard.instantiate.modular.pattern", "/icons/Containment.gif").createImage();
	
	final public static Image imageSubClass = AbstractUIPlugin.
			imageDescriptorFromPlugin("org.miso.wizard.instantiate.modular.pattern", "/icons/Inheritance.gif").createImage();
			
	@Override
	public String getText(Object element) {
		
		if(element instanceof Node)
			return ((Node) element).getEClass().getName();
		
		if(element instanceof Composition)
			return ((Composition) element).getTarget().getEClass().getName();

		if(element instanceof SubClass)
			return ((SubClass) element).getTarget().getEClass().getName();
			
			
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		
		if(element instanceof Composition)
			return imageComposition;
					
		if(element instanceof SubClass)
			return imageSubClass;
		
		return super.getImage(element);
	}
	
	@Override
	public Font getFont(Object element) {

		Font font = super.getFont(element);
		Node node = null;
		if(element instanceof Composition){
			
			Composition composition = (Composition)element;
			node = composition.getTarget();
		}			
		
		if(element instanceof Node)
			node = (Node)element;
		
		if(element instanceof SubClass)
			node = ((SubClass) element).getTarget();
			
		
		if(node.getEClass().isAbstract() == true)
			return getItalicFont(Display.getCurrent().getActiveShell().getFont());
		
		
		return font;
	}
	
	private Font getItalicFont(Font font){
		
		FontDescriptor boldDescriptor = FontDescriptor.createFrom(font).setStyle(SWT.ITALIC);
        Font italicFont = boldDescriptor.createFont(Display.getCurrent());
        return italicFont;
	}
	
	
}
