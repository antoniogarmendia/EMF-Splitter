package org.miso.wizard.instantiate.modular.pattern.label.provider;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import MetaModelGraph.Composition;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;

public class LabelProviderEClassName extends ColumnLabelProvider{

	@Override
	public String getText(Object element) {
		
		if(element instanceof Node)
			return ((Node) element).getEClass().getName();
		
		if(element instanceof Composition)
			return /*((Composition) element).getEReference().getName() + "/" +*/ ((Composition) element).getTarget().getEClass().getName();

		if(element instanceof SubClass)
			return ((SubClass) element).getTarget().getEClass().getName();
			
			
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		
		if(element instanceof Composition)
			return getImageByName("/icons/Containment.gif");
					
		if(element instanceof SubClass)
			return getImageByName("/icons/Inheritance.gif");
		
		return super.getImage(element);
	}
	
	private Image getImageByName(String path){
		
		Device device = Display.getCurrent();
		return new Image(device, LabelProviderEClassName.class.getProtectionDomain().getCodeSource().getLocation().getFile().toString().concat(path));
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
