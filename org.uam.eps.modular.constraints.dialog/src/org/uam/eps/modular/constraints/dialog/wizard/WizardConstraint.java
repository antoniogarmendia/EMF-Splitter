package org.uam.eps.modular.constraints.dialog.wizard;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;

import constraints.MetamodelConstraint;
import constraints.impl.ConstraintsFactoryImpl;
import splitterLibrary.EcoreEMF;

public class WizardConstraint extends Wizard{

	protected ConstraintPatternPage patternPage;
	protected ConstraintDefinitionPage definitionPage;
	
	private MetamodelConstraint constraint;
	private EcoreEMF metaModel;
	
	public WizardConstraint(EcoreEMF metaModel) {
		
		constraint = ConstraintsFactoryImpl.eINSTANCE.createMetamodelConstraint();
		this.metaModel = metaModel;
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
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return true;
	}
	
	public void setConstraint(MetamodelConstraint constraint) {
		this.constraint = constraint;
	}
	
	@Override
	public String getWindowTitle() {
		
		return "Define the Constraint Pattern";
	}

}
