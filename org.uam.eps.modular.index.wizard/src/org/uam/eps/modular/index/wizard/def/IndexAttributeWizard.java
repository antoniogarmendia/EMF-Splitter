package org.uam.eps.modular.index.wizard.def;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;
import org.miso.wizard.instantiate.modular.pattern.utils.PatternModularUtils;

import index.IndexFactory;
import index.MetamodelIndex;
import index.util.DSLtaoIndex;
import runtimePatterns.PatternInstance;
import splitterLibrary.EcoreEMF;
import splitterLibrary.util.DSLtaoUtils;

public class IndexAttributeWizard extends Wizard{

	protected IndexAttributePatternPage patternPage;
	protected IndexAttributeDefinitionPage definitionPage;
	
	private EcoreEMF metaModel;
	private MetamodelIndex index;
	private PatternInstance indexInstance;
	
	public IndexAttributeWizard(EcoreEMF metaModel) {
		super();
		this.metaModel = metaModel;
		this.index = IndexFactory.eINSTANCE.createMetamodelIndex();
		this.indexInstance = null;
	}
	
	@Override
	public void addPages() {
		
		super.addPages();
		this.patternPage = new IndexAttributePatternPage("Index Attribute Pattern");
		this.definitionPage = new IndexAttributeDefinitionPage("Define the Index Attribute Pattern", metaModel, index);
		
		// add pages to the wizard
		addPage(patternPage);
		addPage(definitionPage);		
	}
	
	@Override
	public boolean performFinish() {
		
		// obtaint URI from metamodel
		URI indexURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("index");
		
		//save the cons
		ResourceSet reset = new ResourceSetImpl();
		Resource resource = reset.createResource(indexURI);
		resource.getContents().add(this.index);
		
		try {
			
			resource.save(null);
			//project
			IProject project = DSLtaoUtils.getProjectFromURI(indexURI);			
			// transform the visibility structure to the DSLtao(*.diagram)
			DSLtaoIndex transform = new DSLtaoIndex(project);
			this.indexInstance = transform.transformIndexToDSLtao(index);
			
			// obtain Rtpat URI
			URI rtpatURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("rtpat");
			// save runtime patterns
			boolean exisRtpat = DSLtaoUtils.existRuntimePatterns(rtpatURI);
			
			if(exisRtpat == false) {
				//create runtime patterns
				PatternModularUtils.savePatternInstance(this.indexInstance, rtpatURI);
			} else {
				// update runtime patterns
				PatternModularUtils.savePatternInstanceInRtapt(rtpatURI,this.indexInstance,DSLtaoUtils.catIndex);
			}			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}	
		
		return true;
	}
	
	public void setIndex(MetamodelIndex index) {
		this.index = index;
	}
	
	public PatternInstance getIndexInstance() {
		return indexInstance;
	}
	
	@Override
	public String getWindowTitle() {
		
		return "Define the Index Attribute Pattern";
	}

}
