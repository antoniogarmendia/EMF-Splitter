package org.uam.eps.modular.scope.wizard.def;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;

import ScopeDefinition.MetaModelScope;
import ScopeDefinition.impl.ScopeDefinitionFactoryImpl;
import splitterLibrary.EcoreEMF;

public class ScopeWizard extends Wizard{

	protected ScopePatternPage patternPage;
	protected ScopeDefinitionPage definitionPage;
	
	private MetaModelScope scopeRules;
	private EcoreEMF metaModel;
		
	public ScopeWizard(EcoreEMF metaModel) {
		
		super();
		this.metaModel = metaModel;
		this.scopeRules = ScopeDefinitionFactoryImpl.eINSTANCE.createMetaModelScope();
	}

	@Override
	public void addPages() {
		
		super.addPages();
		patternPage = new ScopePatternPage("Scope Pattern");
		definitionPage = new ScopeDefinitionPage("Define Scoping Rules", this.scopeRules, this.metaModel);	
		
		// add pages
		addPage(patternPage);
		addPage(definitionPage);
	}	
	
	public void setScopeRules(MetaModelScope scopeRules) {
		this.scopeRules = scopeRules;
	}
	
	@Override
	public String getWindowTitle() {
		
		return "Define the Scope Pattern";
	}
	
	@Override
	public boolean performFinish() {
		
		// obtaint URI from metamodel
		URI consURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("scope");
		
		//save the cons
		ResourceSet reset = new ResourceSetImpl();
		Resource resource = reset.createResource(consURI);
		resource.getContents().add(this.scopeRules);
		
		try {
			
			resource.save(null);
			
		} catch (IOException e) {			
			e.printStackTrace();
		}

		return true;
	}
	
	

}
