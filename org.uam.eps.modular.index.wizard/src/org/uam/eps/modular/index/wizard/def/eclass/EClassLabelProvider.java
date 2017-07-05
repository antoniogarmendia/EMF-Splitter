package org.uam.eps.modular.index.wizard.def.eclass;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EClassLabelProvider implements ILabelProvider {

	final public static Image imageEClass = AbstractUIPlugin.imageDescriptorFromPlugin
			("org.miso.wizard.instantiate.modular.pattern", "/icons/EClass.gif").createImage();
	
	@Override
	public void addListener(ILabelProviderListener listener) {
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		
	}

	@Override
	public Image getImage(Object element) {
		return imageEClass;
	}

	@Override
	public String getText(Object element) {
		
		if (element instanceof EClass) {
			return ((EClass) element).getName();
		}			
		return "unknown";
	}

}
