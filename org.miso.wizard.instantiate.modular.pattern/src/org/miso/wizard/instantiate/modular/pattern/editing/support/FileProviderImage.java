
package org.miso.wizard.instantiate.modular.pattern.editing.support;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class FileProviderImage extends LabelProvider{
	
	private static final Image IMG_FILE = PlatformUI.getWorkbench()
			.getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE);
	
	private static final Image IMG_FOLDER = PlatformUI.getWorkbench()
			.getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);

	@Override
	public Image getImage(Object element) {
		
		if (element instanceof IFileStore) {
			IFileStore curr_fs = (IFileStore) element;
							
			if (curr_fs.fetchInfo().isDirectory())
				return IMG_FOLDER;
			else
				return IMG_FILE;
		}
		return null;
	}	
	
	
	@Override
	public String getText(Object element) {
		if (element instanceof IFileStore) {
			return ((IFileStore) element).getName();
		}
		return super.getText(element);
	}

}
