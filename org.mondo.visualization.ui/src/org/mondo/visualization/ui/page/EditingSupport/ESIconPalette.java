package org.mondo.visualization.ui.page.EditingSupport;

import java.io.File;
import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.internal.filesystem.local.LocalFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.ide.dialogs.IDEResourceInfoUtils;
import org.eclipse.ui.internal.ide.dialogs.IFileStoreFilter;
import org.mondo.visualization.ui.wizard.ImageSelection;

import graphic_representation.DiagramElement;

public class ESIconPalette extends EditingSupport{

	public ESIconPalette(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
						
		DialogCellEditor dialogEditor =  new DialogCellEditor() {
			
			private Label labelPath;
			
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
								
				LoadResourceDialog dialog = new LoadResourceDialog(cellEditorWindow.getShell(),"Select Image", SWT.NONE);
				if(dialog.open() == Window.OK)
				{
					return dialog.fileURI;
				}				
				return "";
			}

			@Override
			protected Button createButton(Composite parent) {
			
				Button btn = new Button(parent, SWT.NONE);
				btn.setText("...");
				return btn;
			}

			@Override
			protected Control createContents(Composite cell) {
				
				labelPath = new Label(cell, SWT.LEFT);
				labelPath.setFont(cell.getFont());
				labelPath.setBackground(cell.getBackground());
				String filepath = "";
				if(element instanceof DiagramElement)
					filepath =  ((DiagramElement) element).getDiag_palette().getIcon_filepath();
				labelPath.setText((filepath==null)?"":filepath);
				return labelPath;				
			}

			@Override
			protected void updateContents(Object value) {
				
				if(value==null)
					value = "";
				super.updateContents(value);
			}				
		};
		
		dialogEditor.create((Composite) getViewer().getControl());
		return dialogEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if(element instanceof DiagramElement)
		{
			String filePath =  ((DiagramElement) element).getDiag_palette().getIcon_filepath();
			if(filePath==null)
				return "";
			else
				return filePath;
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if(element instanceof DiagramElement)
		{
			DiagramElement diagElement = (DiagramElement)element;
			diagElement.getDiag_palette().setIcon_filepath((String) value);
		}
		getViewer().update(element, null);
	}
	
	public static class LoadResourceDialog extends ResourceDialog
	{

		public Text txURI;
		public String fileURI;
		
		public LoadResourceDialog(Shell parent, String title, int style) {
			
			super(parent, title, style);
			
			fileURI = null;
		}

		@Override
		protected Control createDialogArea(Composite parent) {
						
			Composite container = new Composite(parent, SWT.NONE);
			container.setLayout(new GridLayout());
			container.setLayoutData(new GridData(GridData.FILL_BOTH));
			
			Composite containerGroupImage = new Composite(container, SWT.NONE);
			
			GridLayout layout = new GridLayout();			
			layout.numColumns = 2;
			containerGroupImage.setLayout(layout);
			containerGroupImage.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
						
			Label lb_name = new Label(containerGroupImage, SWT.NONE);
			lb_name.setText("Image URI:");			
			
			Button btn_selectWorkspace = new Button(containerGroupImage, SWT.PUSH);
			btn_selectWorkspace.setText("Browse Workspace...");
			prepareBrowseWorkspaceButton(btn_selectWorkspace);
			
			Composite containerGroupText = new Composite(container, SWT.NONE);
			GridLayout layoutText = new GridLayout();
			layoutText.numColumns = 1;	
			containerGroupText.setLayout(layoutText);
			containerGroupText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			txURI = new Text(containerGroupText, SWT.BORDER | SWT.SINGLE );			
			txURI.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			txURI.addModifyListener(new ModifyListener() {
				
				@Override
				public void modifyText(ModifyEvent e) {
					
					fileURI = txURI.getText();
				}
			});
									
			return container;
		}
		
		public void prepareBrowseWorkspaceButton(Button btn_selectWorkspace)
		{
			
			EList<String> listOfExtensions = new BasicEList<String>();
			listOfExtensions.add("jpg");
			listOfExtensions.add("png");
			listOfExtensions.add("gif");
			listOfExtensions.add("jpeg");
			listOfExtensions.add("tiff");
			listOfExtensions.add("svg");
			
			btn_selectWorkspace.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					
					ImageSelection selec = new ImageSelection(getParentShell(), new FileProvider(), 
							new FileContentProvider((IResource.FOLDER | IResource.FILE | SWT.APPLICATION_MODAL & IResource.FILE) != 0));
					selec.setTitle("File Selection");
					
					File rootFile = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile();
					URI fileURI = URI.create(rootFile.toURI().toString());
					
					try {
						selec.setInput(EFS.getStore(fileURI));
					} catch (CoreException e1) {
						
						e1.printStackTrace();
					}
					selec.setMessage("Select Image...");
					
					selec.addFilter(new ViewerFilter() {
						
						@Override
						public boolean select(Viewer viewer, Object parentElement, Object element) {
							
							LocalFile fil = (LocalFile) element;
													
							//Start with dot
							if(fil.getName().charAt(0)=='.')
								return false;
							//End
							if (!fil.fetchInfo().isDirectory()) {
								String name = fil.getName();
								int ext = name.lastIndexOf(".");
								String ext_str = name.substring(ext + 1);
								if(listOfExtensions.indexOf(ext_str)!=-1)
									return true;
								else
									return false;
							}
							return true;
						}
					});
					
					if (selec.open() == ImageSelection.OK){
						Object[] result = selec.getResult();
						if (result.length == 1) {
							LocalFile loc_file = ((LocalFile) result[0]);
							URIConverter converter = new ExtensibleURIConverterImpl();
							org.eclipse.emf.common.util.URI platformURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI("/", false);
							org.eclipse.emf.common.util.URI fileUri = org.eclipse.emf.common.util.URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + File.separator);
							converter.getURIMap().put(fileUri, platformURI);
							org.eclipse.emf.common.util.URI anfileURI = converter.normalize(org.eclipse.emf.common.util.URI.createURI(loc_file.toURI().toString()));
							txURI.setText(anfileURI.toPlatformString(true));							
						}						
					}
				}				
			});			
		}
		
		public static class FileProvider extends LabelProvider{
			
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
		
		private static class FileContentProvider implements ITreeContentProvider {

			private static final Object[] EMPTY = new Object[0];

			@SuppressWarnings("restriction")
			private IFileStoreFilter fileFilter;
			
			
			@SuppressWarnings("restriction")
			public FileContentProvider(final boolean showFiles) {
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
	}

}
