package org.miso.wizard.instantiate.modular.pattern.editing.support;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.internal.ide.dialogs.IDEResourceInfoUtils;
import org.eclipse.ui.internal.ide.dialogs.IFileStoreFilter;

public class FileImageContentProvider implements ITreeContentProvider{

	private static final Object[] EMPTY = new Object[0];

	@SuppressWarnings("restriction")
	private IFileStoreFilter fileFilter;
	
	
	@SuppressWarnings("restriction")
	public FileImageContentProvider(final boolean showFiles) {
		fileFilter = new IFileStoreFilter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.ui.internal.ide.dialogs.IFileStoreFilter#accept(org.eclipse.core.filesystem.IFileStore)
			 */
			@Override
			public boolean accept(IFileStore file) {
				if (!file.fetchInfo().isDirectory() && showFiles == false) {
					return false;
				}
				return true;
			}
		};
	}			
	
	@Override
	public void dispose() {
				
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				
	}

	@Override
	public Object[] getElements(Object inputElement) {
		
		return getChildren(inputElement);
	}

	@SuppressWarnings("restriction")
	@Override
	public Object[] getChildren(Object parentElement) {
		
		if (parentElement instanceof IFileStore) {
			IFileStore[] children = IDEResourceInfoUtils.listFileStores(
					(IFileStore) parentElement, fileFilter,
					new NullProgressMonitor());
			if (children != null) {
				return children;
			}
		}
		return EMPTY;	
	}

	@Override
	public Object getParent(Object element) {
		
		if (element instanceof IFileStore) {
			return ((IFileStore) element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
	
		return getChildren(element).length > 0;
	}			
}
