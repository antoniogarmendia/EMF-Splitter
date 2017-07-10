package org.uam.eps.modular.scope.wizard.def;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;
import org.miso.wizard.instantiate.modular.pattern.utils.PatternModularUtils;
import org.mondo.generate.scope.project.createProject.DSLtaoScope;

import ScopeDefinition.MetaModelScope;
import ScopeDefinition.impl.ScopeDefinitionFactoryImpl;
import runtimePatterns.PatternInstance;
import splitterLibrary.EcoreEMF;
import splitterLibrary.util.DSLtaoUtils;

public class ScopeWizard extends Wizard{

	protected ScopePatternPage patternPage;
	protected ScopeDefinitionPage definitionPage;
	
	private MetaModelScope scopeRules;
	private PatternInstance scopeInstance;
	private EcoreEMF metaModel;
		
	public ScopeWizard(EcoreEMF metaModel) {
		
		super();
		this.metaModel = metaModel;
		this.scopeInstance = null;
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
	
	public MetaModelScope getScopeRules() {
		return scopeRules;
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
		URI scopeURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("scope");
		// obtain Rtpat URI
		URI rtpatURI = metaModel.getRs().getURI().trimFileExtension().appendFileExtension("rtpat");
		
		//save the cons
		ResourceSet reset = new ResourceSetImpl();
		Resource resource = reset.createResource(scopeURI);
		resource.getContents().add(this.scopeRules);
		
		try {
			
			resource.save(null);			
			//project
			IProject project = DSLtaoUtils.getProjectFromURI(scopeURI);
			// transform the scope structure to the DSLtao(*.diagram)
			DSLtaoScope transform = new DSLtaoScope(project);
			scopeInstance = transform.transformScopeToDSLtao(this.scopeRules);
						
			// save runtime patterns
			boolean exisRtpat = DSLtaoUtils.existRuntimePatterns(rtpatURI);
			
			if(exisRtpat == false) {
				//create runtime patterns
				PatternModularUtils.savePatternInstance(scopeInstance, rtpatURI);
			} else {
				// update runtime patterns
				PatternModularUtils.savePatternInstanceInRtapt(rtpatURI,scopeInstance,DSLtaoUtils.catScope);
			}			
		} catch (IOException e) {			
			e.printStackTrace();
		}

		return true;
	}
	
	public PatternInstance getScopeInstance() {
		return scopeInstance;
	}

}
