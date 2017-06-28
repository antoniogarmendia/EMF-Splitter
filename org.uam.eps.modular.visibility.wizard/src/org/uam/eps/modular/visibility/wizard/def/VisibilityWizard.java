package org.uam.eps.modular.visibility.wizard.def;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;

import splitterLibrary.EcoreEMF;
import visibility.MetamodelVisibility;
import visibility.impl.VisibilityFactoryImpl;

public class VisibilityWizard extends Wizard{

	protected VisibilityPatternPage patternPage;
	protected VisibilityDefinitionPage definitionPage;
	
	private EcoreEMF metaModel;
	private MetamodelVisibility visibilityRules;
	
	public VisibilityWizard(EcoreEMF metaModel) {
		
		this.metaModel = metaModel;
		this.visibilityRules = VisibilityFactoryImpl.eINSTANCE.createMetamodelVisibility();		
	}

	@Override
	public void addPages() {
		
		super.addPages();
		patternPage = new VisibilityPatternPage("Definition of the Visibility Pattern");
		definitionPage = new VisibilityDefinitionPage("Add/Update Visibility rules", visibilityRules, metaModel);
		
		// add pages
		addPage(patternPage);
		addPage(definitionPage);		
	}	
	
	public void setVisibilityRules(MetamodelVisibility visibilityRules) {
		this.visibilityRules = visibilityRules;
	}
	
	@Override
	public String getWindowTitle() {
		
		return "Define the Visibility Pattern";
	}
	
	@Override
	public boolean performFinish() {
		
		// obtaint URI from metamodel
		URI consURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("vis");
		
		//save the cons
		ResourceSet reset = new ResourceSetImpl();
		Resource resource = reset.createResource(consURI);
		resource.getContents().add(this.visibilityRules);
	
		try {
			
			resource.save(null);
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return true;
	}

}
