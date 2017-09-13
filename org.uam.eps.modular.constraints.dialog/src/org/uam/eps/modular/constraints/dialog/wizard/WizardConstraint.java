package org.uam.eps.modular.constraints.dialog.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;
import org.miso.wizard.instantiate.modular.pattern.utils.PatternModularUtils;

import constraints.MetamodelConstraint;
import constraints.impl.ConstraintsFactoryImpl;
import constraints.util.DSLtaoConstraint;
import runtimePatterns.PatternInstance;
import splitterLibrary.EcoreEMF;
import splitterLibrary.util.DSLtaoUtils;

public class WizardConstraint extends Wizard{

	protected ConstraintPatternPage patternPage;
	protected ConstraintDefinitionPage definitionPage;
		
	private MetamodelConstraint constraint;
	private EcoreEMF metaModel;
	private PatternInstance consInstance;
	
	public WizardConstraint(EcoreEMF metaModel) {
		
		constraint = ConstraintsFactoryImpl.eINSTANCE.createMetamodelConstraint();
		this.metaModel = metaModel;
		this.consInstance = null;
	}
	
	@Override
	public void addPages() {
		
		super.addPages();
		patternPage = new ConstraintPatternPage("Constraint Pattern");
		definitionPage = new ConstraintDefinitionPage("Definition of the Constraint",constraint,this.metaModel);
		
		// add pages to the wizard
		addPage(patternPage);
		addPage(definitionPage);		
	}
	
	@Override
	public boolean performFinish() {
		
		// obtaint URI from metamodel
		URI consURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("cons");
		
		//save the cons
		ResourceSet reset = new ResourceSetImpl();
		Resource resource = reset.createResource(consURI);
		resource.getContents().add(this.constraint);
		
		try {
			
			resource.save(null);
			//project
			IProject project = DSLtaoUtils.getProjectFromURI(consURI);
			// transform the visibility structure to the DSLtao(*.diagram)
			DSLtaoConstraint transform = new DSLtaoConstraint(project);
			consInstance = transform.transformConstraintToDSLtao(this.constraint);
			
			// obtain Rtpat URI
			URI rtpatURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("rtpat");
			
			// save runtime patterns
			boolean exisRtpat = DSLtaoUtils.existRuntimePatterns(rtpatURI);
			
			if(exisRtpat == false) {
				//create runtime patterns
				PatternModularUtils.savePatternInstance(consInstance, rtpatURI);
			} else {
				// update runtime patterns
				PatternModularUtils.savePatternInstanceInRtapt(rtpatURI,consInstance,DSLtaoUtils.catConstraint);
			}			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return true;
	}
	
	public PatternInstance getConsInstance() {
		return consInstance;
	}
	
	public void setConstraint(MetamodelConstraint constraint) {
		this.constraint = constraint;
	}
	
	@Override
	public String getWindowTitle() {
		
		return "Define the Constraint Pattern";
	}

}
