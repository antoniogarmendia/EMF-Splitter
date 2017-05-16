package org.miso.wizard.instantiate.modular.pattern.label.provider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class EClassLabelProvider implements ILabelProvider {

	public EClassLabelProvider() {}
	
	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImage(Object element) {
		
		Device device = Display.getCurrent();
		return new Image(device, EClassLabelProvider.class.getProtectionDomain().getCodeSource().getLocation().getFile().toString().concat("/icons/EClass.gif"));
		
	}

	@Override
	public String getText(Object element) {
		
		if(element instanceof EClass)
			return ((EClass) element).getName();
		return element.toString();
	}
	
	
}
