package org.uam.eps.miso.diagram.editor.mobile.view;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.part.ViewPart;
import org.uam.eps.miso.diagram.editor.mobile.resource.XMLResourceDiagramEditor;
import org.uam.eps.miso.diagram.editor.mobile.rest.DiagramEditorServer;
import org.uam.eps.miso.diagram.editor.mobile.view.LabelProvider.CDateDiagram;
import org.uam.eps.miso.diagram.editor.mobile.view.LabelProvider.CNameDiagram;
import org.uam.eps.miso.diagram.editor.mobile.view.LabelProvider.CNameMM;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.IconElement;
import mobile_server.EcoreMD;
import mobile_server.Palette;
import mobile_server.diagram_editor.Diagram;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;

public class MobileServerView extends ViewPart{

	  private DiagramEditorServer server;
	  private CTabFolder tabFolder;	
	  
	  //Tab Item
	  private CTabItem itemMM; 
	  private CTabItem itemGR;
	  
	  //Scrolled Composite
	  private ScrolledComposite sc;
	  	 
	  //Tree 
	  private TreeViewer treeViewer;
	  private Tree tree;
	  
	  //TreeColumns
	  private TreeViewerColumn col_NameMM;
	  
	  //Actions
	  private Action actionSaveEcore;
	  
	  //Scrolled Composite Diagram
	  private ScrolledComposite scDiagram;
	  	  
	  //Tree Diagram
	  private TreeViewer treeViewerDiagram;
	  private Tree treeDiagram;
	  
	  //TreeColumns
	  private TreeViewerColumn col_NameDiagram;
	  private TreeViewerColumn col_DateDiagram;
	  
	  //Actions Diagram
	  private Action actionPreviewDiagram;
	  private Action actionSaveXMI;
	  private Action actionSaveXMIRepresentation;
	  private Action actionSaveXMIModellingProject;
	  
	  public MobileServerView() {
		super();
		tabFolder = null;
		tree = null;
		treeViewer = null;
		sc = null;		
		server = new DiagramEditorServer();
		//TreeColumns
		col_NameMM = null;
		//Table Items
		itemMM = null;
		//Actions
		actionSaveEcore = null;
		//Scrolled Composite Diagram
		scDiagram = null;
		//Tree Diagram
		treeViewerDiagram = null;
		treeDiagram = null;
		//TreeColumns
		col_NameDiagram = null;
		col_DateDiagram = null;
		
		//Actions Diagram
		actionPreviewDiagram = null;
		actionSaveXMI = null;
	  }
	  
	@PostConstruct
	public void createPartControl(Composite parent) {
		  
		  
		 tabFolder = new CTabFolder (parent, SWT.BORDER);
		 Composite containerMM = new Composite(tabFolder, SWT.NONE);	
		 //containerMM.setLayout(new FillLayout(SWT.HORIZONTAL));
		 containerMM.setLayout(new GridLayout(1,false));
		 
		 Composite containerDiagram = new Composite(tabFolder, SWT.NONE);
		 containerDiagram.setLayout(new FillLayout(SWT.HORIZONTAL));
		 
		 //Tab Item Meta-models
		 itemMM = new CTabItem (tabFolder, SWT.NONE);
		 itemMM.setControl(containerMM);
		 itemMM.setText("Meta-models");
		
		 //Refresh Button
		 Button btn_refresh = new Button((Composite)itemMM.getControl(), SWT.NONE);
		 btn_refresh.setText("Refresh");
		 btn_refresh.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				 FillTreeDiagram();
			}		 
			 
		 });
		 
		 		  
		 CreateTree();
		  
		 col_NameMM = new TreeViewerColumn(treeViewer, SWT.LEFT);
		 col_NameMM.getColumn().setWidth(180);
		 col_NameMM.getColumn().setText("Meta-model & Associated Palletes");
		  
		 FillTree();
		  
	 	 //Tab Item Graphic Representation
		 itemGR = new CTabItem(tabFolder, SWT.NONE);
		 itemGR.setControl(containerDiagram);
		 itemGR.setText("Diagrams");		  
		  
		 CreateTreeDiagrams();
		  
		 col_NameDiagram = new TreeViewerColumn(treeViewerDiagram, SWT.LEFT);
		 col_NameDiagram.getColumn().setWidth(180);
		 col_NameDiagram.getColumn().setText("Diagram Name");
		 
		 col_DateDiagram = new TreeViewerColumn(treeViewerDiagram, SWT.LEFT);
		 col_DateDiagram.getColumn().setWidth(180);
		 col_DateDiagram.getColumn().setText("Date");	
		 
		 FillTreeDiagram();
	  }

	  @Focus
	  public void setFocus() {
		 tabFolder.setFocus();
		 hookContextMenu();
		 hookContextMenuDiagram();
	  }
	  
	  private void CreateTree()
	  {
		  sc = new ScrolledComposite((Composite)itemMM.getControl(), SWT.V_SCROLL);
		  sc.setLayout(new GridLayout());
		  sc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			
		  tree = new Tree(sc, SWT.VIRTUAL | SWT.BORDER | SWT.NO_SCROLL | SWT.FULL_SELECTION ); 
		  tree.setHeaderVisible(true);
		  tree.setLinesVisible(true);
		  treeViewer = new TreeViewer(tree);
		  treeViewer.setUseHashlookup(true);
									
		  //GridLayout for Rows
		  GridLayout layoutTree = new GridLayout();
		  layoutTree.numColumns = 6;
		  layoutTree.marginWidth = 180;
	      layoutTree.horizontalSpacing = 20;
		  layoutTree.verticalSpacing = 20;
		  layoutTree.marginHeight = 80;
		  tree.setLayoutData(layoutTree);
		  //End
		  
		  sc.setExpandHorizontal(true);
		  sc.setExpandVertical(true);
		  sc.setAlwaysShowScrollBars(true);
		  sc.setContent(tree);
		  
		  makeActions();		  
	  }  
	  
	  public void CreateTreeDiagrams()
	  {
		  scDiagram = new ScrolledComposite((Composite)itemGR.getControl(), SWT.V_SCROLL);
		  scDiagram.setLayout(new GridLayout());
		  scDiagram.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true)); 
		  
		  treeDiagram = new Tree(scDiagram, SWT.VIRTUAL | SWT.BORDER | SWT.NO_SCROLL | SWT.FULL_SELECTION ); 
		  treeDiagram.setHeaderVisible(true);
		  treeDiagram.setLinesVisible(true);
		  treeViewerDiagram = new TreeViewer(treeDiagram);
		  treeViewerDiagram.setUseHashlookup(true);
		  
		  //GridLayout for Rows
		  GridLayout layoutTree = new GridLayout();
		  layoutTree.numColumns = 6;
		  layoutTree.marginWidth = 180;
	      layoutTree.horizontalSpacing = 20;
		  layoutTree.verticalSpacing = 20;
		  layoutTree.marginHeight = 80;
		  treeDiagram.setLayoutData(layoutTree);
		  //End
		  
		  scDiagram.setExpandHorizontal(true);
		  scDiagram.setExpandVertical(true);
		  scDiagram.setAlwaysShowScrollBars(true);
		  scDiagram.setContent(treeDiagram);	
		  
		  makeActionsDiagram();
	  }	 

	  public void FillTree()
	  {
		  col_NameMM.setLabelProvider(new CNameMM());
		  
		  treeViewer.setContentProvider(new MobileServerMMContentProvider());
		  treeViewer.setInput(server.getJSONMobile().getListEcores().toArray());
	  }
	  
	  public void FillTreeDiagram()
	  {
		  col_NameDiagram.setLabelProvider(new CNameDiagram());
		  
		  col_DateDiagram.setLabelProvider(new CDateDiagram());
		  
		  treeViewerDiagram.setContentProvider(new DiagramServerDiagramContentProvider());
		  treeViewerDiagram.setInput(server.getJSONDiagram().getList_diagrams().toArray());
	  }
	  
	  private void makeActions()
	  {
		actionSaveEcore = new Action() {

		@Override
		public void run() {
			Object obj = GetSelectedTreeViewerObject();
			if(obj instanceof Palette)
			{
				Palette pal = (Palette)obj;
				EcoreMD ecore = (EcoreMD)pal.eContainer();
				ContainerSelectionDialog dialogFolder = new ContainerSelectionDialog(
									PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
									ResourcesPlugin.getWorkspace().getRoot(), false,
									"Select Folder...");
				if(dialogFolder.open() == ContainerSelectionDialog.OK)
				{
					Object[] result = dialogFolder.getResult();
					if (result.length == 1) {
						String path = ((Path)result[0]).toString();
						try {
							
							//Save Ecore
							ResourceSet rSetMM = new ResourceSetImpl();
							rSetMM.getResourceFactoryRegistry().getExtensionToFactoryMap().put
							    (EcorePackage.eINSTANCE.getNsPrefix(), 
							    		new EcoreResourceFactoryImpl());
							
							 Resource resource = rSetMM.createResource(URI.createPlatformResourceURI(path+"/"+ecore.getName() +".ecore",true));
							
							 resource.load(new URIConverter.ReadableInputStream(ecore.getContent().toString()), null);
							 resource.save(null);
							 
							 resource.unload();
							 
							 //Save Graphic Representation
							 ResourceSet rSetGR = new ResourceSetImpl();
							 rSetGR.getResourceFactoryRegistry().getExtensionToFactoryMap().put
							 			(Graphic_representationPackage.eINSTANCE.getNsPrefix(), new XMIResourceFactoryImpl());
							 
							 
							 Resource resGR = rSetGR.createResource(URI.createPlatformResourceURI(path+"/"+ecore.getName() +".graphicR",true));
							 
							 resGR.load(new URIConverter.ReadableInputStream(pal.getContent()), null);
							 
							 IContainer fol = ResourcesPlugin.getWorkspace().getRoot().
									 				getContainerForLocation(new Path(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()
										 										+ path));
								 
							 ExtractIconsUpdateFilepath(resGR,fol.getProject());
							 
							 resGR.save(null);
							 resGR.unload();
								
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}					
			}
		}			
		};
		actionSaveEcore.setId("miso.mobile.view.SaveEcorePlusGraphicRepresentation");
		actionSaveEcore.setText("Save Ecore + Graphic Representation");
		actionSaveEcore.setToolTipText("Save Ecore + Graphic Representation");
	  }
	  
	  private void makeActionsDiagram()
	  {
		  actionPreviewDiagram = new Action() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Object obj = GetSelectedTreeViewerDiagramObject();
				if(obj instanceof Diagram)
				{
					PreviewImageDialog dialog = new PreviewImageDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().
				getSite().getShell(),((Diagram) obj));					
					dialog.open();
				}
			}		  
		  };
		  actionPreviewDiagram.setId("miso.mobile.viewDiagram.PreviewDiagram");
		  actionPreviewDiagram.setText("Preview Diagram");
		  actionPreviewDiagram.setToolTipText("Preview Diagram");
		  
		  actionSaveXMI = new Action() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Object obj = GetSelectedTreeViewerDiagramObject();
				if(obj instanceof Diagram)
				{
					Diagram diag = (Diagram)obj;
					ContainerSelectionDialog dialogFolder = new ContainerSelectionDialog(
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							ResourcesPlugin.getWorkspace().getRoot(), false,
							"Select Folder...");
					if(dialogFolder.open() == ContainerSelectionDialog.OK)
					{
						XMLResourceDiagramEditor xmlMiso = new XMLResourceDiagramEditor(diag);
						try {
							xmlMiso.SaveXMI(((Path)dialogFolder.getResult()[0]).toString(),false);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}			  
		  };
		  
		  actionSaveXMI.setId("miso.mobile.viewDiagram.SaveXMI");
		  actionSaveXMI.setText("Save XMI");
		  actionSaveXMI.setToolTipText("Save XMI");
		  
		  actionSaveXMIRepresentation = new Action() {

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerDiagramObject();
				if(obj instanceof Diagram)
				{
					Diagram diag = (Diagram)obj;
					ContainerSelectionDialog dialogFolder = new ContainerSelectionDialog(
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							ResourcesPlugin.getWorkspace().getRoot(), false,
							"Select Folder...");
					if(dialogFolder.open() == ContainerSelectionDialog.OK)
					{
						XMLResourceDiagramEditor xmlMiso = new XMLResourceDiagramEditor(diag);
						try {
							xmlMiso.SaveXMI(((Path)dialogFolder.getResult()[0]).toString(),true);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}			  
		};
		
		actionSaveXMIRepresentation.setId("miso.mobile.viewDiagram.SaveXMIRepresentation");
		actionSaveXMIRepresentation.setText("Save XMI + Representation");
		actionSaveXMIRepresentation.setToolTipText("Save XMI and Create the Representation");
		
		actionSaveXMIModellingProject = new Action(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}		
			
		};
		
		actionSaveXMIModellingProject.setId("miso.mobile.viewDiagram.SaveXMIModellingProject");
		actionSaveXMIModellingProject.setText("Save XMI + Modelling Project");
		actionSaveXMIModellingProject.setToolTipText("Save XMI, Create the Representation and the Modelling Project");
		
		
	  }
	  
	  private void hookContextMenu() {
			
		  MenuManager menuMgr = new MenuManager(){

			@Override
			public IContributionItem[] getItems() {
			// TODO Auto-generated method stub
        	IContributionItem[] items = super.getItems();
			 List<IContributionItem> filteredItems = new ArrayList<IContributionItem>();
				 for (IContributionItem item : items) {
					 if( item != null
				           && item.getId() != null
				           && item.getId().startsWith( "miso.mobile.view" ))
						 	filteredItems.add( item );					 
				 }
				 
				items = new IContributionItem[ filteredItems.size()];
				return filteredItems.toArray( items );
			}			  
		  };
		  
		  menuMgr.setRemoveAllWhenShown(true);
		  menuMgr.addMenuListener(new IMenuListener() {
			   	public void menuAboutToShow(IMenuManager manager) 
			   	{
					MobileServerView.this.fillContextMenu(manager);
				}
		  });
		  
		  Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		  treeViewer.getControl().setMenu(menu);
		  PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().
				getSite().registerContextMenu(menuMgr, treeViewer);		
	  }
	  
	  private void hookContextMenuDiagram() {
		  
		  MenuManager menuMgr = new MenuManager(){

				@Override
				public IContributionItem[] getItems() {
				// TODO Auto-generated method stub
	        	IContributionItem[] items = super.getItems();
				 List<IContributionItem> filteredItems = new ArrayList<IContributionItem>();
					 for (IContributionItem item : items) {
						 if( item != null
					           && item.getId() != null
					           && item.getId().startsWith( "miso.mobile.viewDiagram" ))
							 	filteredItems.add( item );					 
					 }
					 
					items = new IContributionItem[ filteredItems.size()];
					return filteredItems.toArray( items );
				}			  
			  };
			  
			  menuMgr.setRemoveAllWhenShown(true);
			  menuMgr.addMenuListener(new IMenuListener() {
				   	public void menuAboutToShow(IMenuManager manager) 
				   	{
						MobileServerView.this.fillContextMenuDiagram(manager);
					}
			  });
			  
			  Menu menu = menuMgr.createContextMenu(treeViewerDiagram.getControl());
			  treeViewerDiagram.getControl().setMenu(menu);
			  PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().
					getSite().registerContextMenu(menuMgr, treeViewerDiagram);		
	  }
	  
	  private void fillContextMenu(IMenuManager manager)
	  {
		  Object obj = this.GetSelectedTreeViewerObject();
		  if(obj instanceof Palette)
		  {
			  manager.add(actionSaveEcore);
		  }
	  }
	  
	  private void fillContextMenuDiagram(IMenuManager manager)
	  {
		  Object obj = this.GetSelectedTreeViewerDiagramObject();
		  if(obj instanceof Diagram)
		  {
			  manager.add(actionPreviewDiagram);
			  manager.add(actionSaveXMI);
			  manager.add(actionSaveXMIRepresentation);
			  manager.add(actionSaveXMIModellingProject);
		  }
	  }
	  
	  private Object GetSelectedTreeViewerObject(){
			
			ISelection selection = treeViewer.getSelection();
			return ((IStructuredSelection)selection).getFirstElement();		
	  }
	  
	  private Object GetSelectedTreeViewerDiagramObject(){
			
			ISelection selection = treeViewerDiagram.getSelection();
			return ((IStructuredSelection)selection).getFirstElement();		
	  }
	  
	 private void ExtractIconsUpdateFilepath(Resource graphicR, IProject pro)
	 {
		 //Create icons Folder
		 CreateFolderIcons(pro);
		  /*
		  * Navigate the model,
		  * Find all icons
		  * & Serialize
		  */
		 String pathWS = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		 String filepath = pathWS + "/" + pro.getName() + "/icons/";				  
		 File file = null;
		 TreeIterator<EObject> itgraphicR = graphicR.getAllContents();
		 int countImages = 1;
		 while (itgraphicR.hasNext()) {
			EObject eObject = (EObject) itgraphicR.next();
			if(eObject instanceof IconElement)
			{
				IconElement icon = (IconElement) eObject;
				String filePathIcon = icon.getFilepath();
				String imageName = null;
				if(!filePathIcon.equals(""))
					imageName = new Path(filePathIcon).lastSegment();
				else{
					imageName = Integer.toString(countImages) + ".png";
					countImages = countImages + 1;
					icon.setFilepath(imageName);
				}
				file = new File(filepath + "/" + imageName);
				try {
					if(file.createNewFile() == true)
					{
						byte[] image = Base64.decodeBase64(icon.getEmbeddedImage());
						FileUtils.writeByteArrayToFile(file, image);
						icon.setFilepath("/" + pro.getName() + "/icons/" + imageName);						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}			
		}
		 
		 System.out.println("ExtractIconsUpdateFilepath");
	 }
	 
	 private IFolder CreateFolderIcons(IProject pro)
	 {
		//Create icons Folder
		IFolder iconsFolder = pro.getFolder("icons");
		 if(iconsFolder.exists()==false)
		 {
			try {
				iconsFolder.create(false,true, new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 return iconsFolder;
	 }

	 
	
}
