package org.miso.wizard.instantiate.modular.pattern.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.WizardDialog;
import org.miso.wizard.instantiate.modular.pattern.pages.PageSelectClassProject;
import org.miso.wizard.instantiate.modular.pattern.utils.GraphToModularityPattern;
import org.miso.wizard.instantiate.modular.pattern.utils.PatternModularUtils;
import org.mondo.editor.ui.utils.patterns.PatternUtils;

import MetaModelGraph.Graph;
import dslHeuristicVisualization.DslHeuristicVisualizationFactory;
import dslHeuristicVisualization.EcoreMatrixContainment;
import dslPatterns.Pattern;
import dslPatterns.PatternSet;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.util.DSLtaoUtils;

public class WizardApplyModularPattern extends DynamicWizard{

	protected ModularityPatternPage patternPage;
	protected PageSelectClassProject pageProject;
	protected EList<EClass> listEClasses;
	protected EcoreMatrixContainment ecoreContainment;
	protected Graph eGraph;
	protected Resource eResource;
	private WizardDialog dialog;
	private IProject eProject;
	private PatternInstances modularInstance;
	private PatternInstance modInstance;
					
	public WizardApplyModularPattern(Resource eResource, IProject iProject) {
		
		super();
		this.eResource = eResource;
		this.eProject = iProject;
		this.eGraph =  null;
		this.modularInstance = null;
		this.modInstance = null;
		
		obtainEClassesResource();
		
		executeContainmentMatrix();
		setForcePreviousAndNextButtons(true);
		setWindowTitle("Wizard to Apply the Modularity Pattern");
	}
	
	public Graph getGraph(){
		
		return this.eGraph;
	}	
	
	public void seteGraph(Graph eGraph) {
		
		this.eGraph = eGraph;
	}
	
	@Override
	public void addPages() {
		
		super.addPages();
				
		//Select the Roots 
		patternPage = new ModularityPatternPage("Modularity Pattern");
		pageProject = new PageSelectClassProject("Select the Class Project",getListEClasses(),ecoreContainment);
		addPage(patternPage);
		addPage(pageProject);			
	}
	
	public EList<EClass> getListEClasses(){
		return this.listEClasses;
	}
	
	private void obtainEClassesResource() {
		
		this.listEClasses = new BasicEList<EClass>();
		TreeIterator<EObject> itContents = this.eResource.getAllContents();
		while (itContents.hasNext()) {
			EObject eObject = (EObject) itContents.next();
			if(eObject instanceof EClass)
			{
				this.listEClasses.add((EClass) eObject);
			}
		}
	
	}
	
	private void executeContainmentMatrix()
	{
		this.ecoreContainment = DslHeuristicVisualizationFactory.eINSTANCE.createEcoreMatrixContainment();
		this.ecoreContainment.GetDirectMatrixContainment(this.getListEClasses());
		this.ecoreContainment.GetPathMatrix();
	}
		
	
	@Override
	public boolean performFinish() {
		
		try {
			this.eGraph.eResource().save(null);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
					
		// obtain Modular Pattern
		PatternSet patternModel = PatternUtils.getPatternSetModel(this.eProject);
		Pattern modularPattern = DSLtaoUtils.getModularPattern(patternModel);
		DSLtaoUtils.setPatternAbsoluteUri(this.eProject, modularPattern.eResource());
		modularInstance = DSLtaoUtils.createPatternInstances();
		
		//convert graph to runtime patterns
		GraphToModularityPattern transoPattern = new GraphToModularityPattern(modularPattern);
		transoPattern.tranformGraphToModularityPattern(eGraph, modularInstance);
		this.modInstance = modularInstance.getAppliedPatterns().get(0);
		
		// save runtime patterns
		URI uri = this.eResource.getURI().trimFileExtension().appendFileExtension("rtpat");
		boolean exisRtpat = DSLtaoUtils.existRuntimePatterns(uri);
		
		if(exisRtpat == false) {
			//create runtime patterns
			PatternModularUtils.saveRuntimePatternModel(modularInstance, uri);
		}
		else {
			// update runtime patterns
			PatternModularUtils.savePatternInstanceInRtapt(uri,modularInstance.getAppliedPatterns().get(0),DSLtaoUtils.catModularity);
		}
		
		return true;
	}	

	public WizardDialog getDialog() {
		return dialog;
	}

	public void setDialog(WizardDialog dialog) {
		this.dialog = dialog;
	}	
	
	public PatternInstance getModularInstance() {
		return this.modInstance;
	}
	
 }
