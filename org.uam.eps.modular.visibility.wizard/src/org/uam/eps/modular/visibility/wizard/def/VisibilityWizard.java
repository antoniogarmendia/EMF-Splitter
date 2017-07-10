package org.uam.eps.modular.visibility.wizard.def;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;
import org.miso.wizard.instantiate.modular.pattern.utils.PatternModularUtils;

import runtimePatterns.PatternInstance;
import splitterLibrary.EcoreEMF;
import splitterLibrary.util.DSLtaoUtils;
import visibility.MetamodelVisibility;
import visibility.impl.VisibilityFactoryImpl;
import visibility.util.DSLtaoVisibility;

public class VisibilityWizard extends Wizard{

	protected VisibilityPatternPage patternPage;
	protected VisibilityDefinitionPage definitionPage;
	
	private EcoreEMF metaModel;
	private MetamodelVisibility visibilityRules;
	private PatternInstance visInstance;
	
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
	
	public MetamodelVisibility getVisibilityRules() {
		return visibilityRules;
	}
	
	@Override
	public String getWindowTitle() {
		
		return "Define the Visibility Pattern";
	}
	
	@Override
	public boolean performFinish() {
		
		// obtaint URI from metamodel
		URI visURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("vis");
		
		//save the cons
		ResourceSet reset = new ResourceSetImpl();
		Resource resource = reset.createResource(visURI);
		resource.getContents().add(this.visibilityRules);		
	
		try {
			
			resource.save(null);
			//project
			IProject project = DSLtaoUtils.getProjectFromURI(visURI);
			// transform the visibility structure to the DSLtao(*.diagram)
			DSLtaoVisibility transform = new DSLtaoVisibility(project);
			visInstance = transform.transformVisibilityToDSLtao(this.visibilityRules);
			
			// obtain Rtpat URI
			URI rtpatURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("rtpat");
			// save runtime patterns
			boolean exisRtpat = DSLtaoUtils.existRuntimePatterns(rtpatURI);
			
			if(exisRtpat == false) {
				//create runtime patterns
				PatternModularUtils.savePatternInstance(visInstance, rtpatURI);
			} else {
				// update runtime patterns
				PatternModularUtils.savePatternInstanceInRtapt(rtpatURI,visInstance,DSLtaoUtils.catVisibility);
			}			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return true;
	}
	
	public PatternInstance getVisInstance() {
		return visInstance;
	}

}
