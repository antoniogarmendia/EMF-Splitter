package org.mondo.miso.table.ui.wizard;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.mondo.miso.table.ui.wizard.pages.PageDefineTableRepresentation;

import dslHeuristicVisualization.EcoreMatrixContainment;
import dslHeuristicVisualization.HeuristicStrategySettings;
import dslHeuristicVisualization.impl.DslHeuristicVisualizationFactoryImpl;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.LineGroup;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.RepresentationTable;
import splitterLibrary.EcoreEMF;

public class WizardDefineTableVisualization extends Wizard{

	//Pages Define the Table Representation
	private PageDefineTableRepresentation pageDefineTable;
	
	private EcoreEMF nemf;
	private EList<RepresentationTable> listRepresentations;
	
	
	public WizardDefineTableVisualization() {
		super();
		listRepresentations = new BasicEList<RepresentationTable>();			
	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();	
		this.setForcePreviousAndNextButtons(true);
		
		RepresentationTable representationTable = Graphic_representationFactory.eINSTANCE.createRepresentationTable();
		representationTable.setRootTable(getRoot());
		listRepresentations.add(representationTable);
		pageDefineTable = new PageDefineTableRepresentation("Create Table Representation");
		pageDefineTable.setPos(listRepresentations.indexOf(representationTable));
		addPage(pageDefineTable);
		
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		IWizardPage[] pages = getPages();
		int count = pages.length;
		for (int i = 0; i < count; i++) {
			IWizardPage iWizardPage = pages[i];
			if(iWizardPage instanceof PageDefineTableRepresentation)
			{
				Tree tree = ((PageDefineTableRepresentation) iWizardPage).getTree();
				int pos = ((PageDefineTableRepresentation) iWizardPage).getPos();
				UpdateTableRepresentation(tree,pos);				
			}
		}	
		
		//Search Graphic Representation
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("graphicR", new XMIResourceFactoryImpl());
		
	    //Create Resource
	    URI fUri = GetURI();
	    ResourceSet rSet = new ResourceSetImpl();
	    Resource res = rSet.getResource(fUri, true);
	    
	    if(res!=null)
	    {
	    	TreeIterator<EObject> it = res.getAllContents();
	    	while (it.hasNext()) {
				EObject eObject = (EObject) it.next();
				if(eObject instanceof MMGraphic_Representation)
				{
					((MMGraphic_Representation) eObject).getListRepresentations().addAll(getListRepresentationTable());
					break;
				}
			}
	    	try {
				res.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    else
	    {
	    	MessageDialog.openInformation(getShell(),"Information",
					"There are no resource to save the Representation Table");
			return true;
	    }
		//End
		
		return true;
	}
	
	public URI GetURI()
	{
		URI graphicURI = URI.createURI(getNemf().getFileuri(),true);
		graphicURI = graphicURI.trimFileExtension().appendFileExtension("graphicR");
    	return graphicURI;			
	}
	
	
	public void UpdateTableRepresentation(Tree tree, int pos)
	{
		RepresentationTable rT = listRepresentations.get(pos);
		TreeItem[] items = tree.getItems();
		for (int i = 0; i < items.length; i++) {
			TreeItem treeItem = items[i];
			if(treeItem.getChecked() == true)
			{
				LineGroup lineGroup = (LineGroup) treeItem.getData(); 
				TreeItem[] lineChildsEClass = treeItem.getItems();
				for (int j = 0; j < lineChildsEClass.length; j++) {
					TreeItem treeEClass = lineChildsEClass[j];
					if(treeEClass.getChecked() == true)
					{
						TreeItem[] childsEAttributes = treeEClass.getItems();
						for (int k = 0; k < childsEAttributes.length; k++) {
							TreeItem treeEAttribute = childsEAttributes[k];
							if(treeEAttribute.getChecked() == true)
							{
								rT.getColumns().add((EAttribute) treeEAttribute.getData());
							}
						}
					}
					else
					{
						lineGroup.getListEClasses().remove(treeEClass.getData());
					}
				}
			}
			else
			{
				rT.getLines().remove(treeItem.getData());
			}
		}
	}
	
	public EcoreEMF getNemf() {
		return nemf;
	}

	public void setNemf(EcoreEMF nemf) {
		this.nemf = nemf;
	}

	public RepresentationTable getRepresentationTable(int pos) {
		return listRepresentations.get(pos);
	}
	
	public EList<RepresentationTable> getListRepresentationTable()
	{
		return listRepresentations;
	}
	
	public EClass getRoot()
	{
		//Select Table Root
		EcoreMatrixContainment ecoreContainment = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createEcoreMatrixContainment();
		ecoreContainment.GetDirectMatrixContainment(nemf.getList_classes());
		ecoreContainment.GetPathMatrix();
		HeuristicStrategySettings settings = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategySettings();
		return settings.getStrategy_root().Get_Root(ecoreContainment.getPathMatrix(), nemf.getList_classes());		
	}
		

}
