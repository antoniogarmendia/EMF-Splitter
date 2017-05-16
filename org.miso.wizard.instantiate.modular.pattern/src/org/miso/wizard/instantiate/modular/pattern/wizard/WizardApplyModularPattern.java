package org.miso.wizard.instantiate.modular.pattern.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.jface.wizard.WizardDialog;
import org.miso.wizard.instantiate.modular.pattern.pages.PageSelectClassProject;
import org.miso.wizard.instantiate.modular.pattern.utils.GraphToModularityPattern;
import org.miso.wizard.instantiate.modular.pattern.utils.PatternModularUtils;
import org.mondo.editor.ui.utils.patterns.PatternUtils;

import com.google.common.collect.Iterables;

import MetaModelGraph.Graph;
import MetaModelGraph.impl.MetaModelGraphFactoryImpl;
import dslHeuristicVisualization.DslHeuristicVisualizationFactory;
import dslHeuristicVisualization.EcoreMatrixContainment;
import dslPatterns.Pattern;
import dslPatterns.PatternSet;
import runtimePatterns.PatternInstances;

public class WizardApplyModularPattern extends DynamicWizard{

	protected PageSelectClassProject pageProject;
	protected EPackage ePackage;
	protected EList<EClass> listEClasses;
	protected EcoreMatrixContainment ecoreContainment;
	protected Graph eGraph;
	protected Resource eResource;
	private WizardDialog dialog;
	private IProject eProject;
		
	public WizardApplyModularPattern(EPackage ePackage, Resource eResource, IProject iProject) {
		
		super();
		this.ePackage = ePackage;
		this.eResource = eResource;
		this.eGraph = MetaModelGraphFactoryImpl.eINSTANCE.createGraph();
		this.eProject = iProject;
		
		if(this.ePackage!=null)
			obtainEClasses();
		else
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
		pageProject = new PageSelectClassProject("Select the Class Project",getListEClasses(),ecoreContainment);
		addPage(pageProject);			
	}
	
	public EList<EClass> getListEClasses(){
		return this.listEClasses;
	}
	
	private void obtainEClasses() {
		
		EClass[] aux = Iterables.toArray(Iterables.filter(this.ePackage.getEClassifiers(), EClass.class), EClass.class);
		this.listEClasses = new BasicInternalEList<EClass>(EClass.class, aux.length,aux);
		EList<EPackage> listSubPackages = this.ePackage.getESubpackages();
		for (int i = 0; i < listSubPackages.size(); i++) {
			EPackage currentPack = listSubPackages.get(i);
			aux = Iterables.toArray(Iterables.filter(currentPack.getEClassifiers(), EClass.class), EClass.class);
			this.listEClasses.addAll(new BasicInternalEList<EClass>(EClass.class, aux.length,aux));
			listSubPackages.addAll(currentPack.getESubpackages());
		}
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
	
		Resource res =  this.eGraph.eResource();
		if(res==null){
			ResourceSet reset = new ResourceSetImpl();					
			res = reset.createResource(this.eResource.getURI().trimFileExtension().appendFileExtension("mmgraph"));
			res.getContents().add(this.eGraph);			
		}
		
		//Save Graph Model
		try {
			res.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
		// obtain Modular Pattern
		PatternSet patternModel = PatternUtils.getPatternSetModel(this.eProject);
		Pattern modularPattern = PatternModularUtils.getModularPattern(patternModel);
		setPatternAbsoluteUri(modularPattern.eResource());
		PatternInstances patternInstances = PatternModularUtils.createPatternInstances();
		
		//convert graph to runtime patterns
		GraphToModularityPattern transoPattern = new GraphToModularityPattern(modularPattern);
		transoPattern.tranformGraphToModularityPattern(eGraph, patternInstances);	
		
		// save runtime patterns
		URI uri = this.eResource.getURI().trimFileExtension().appendFileExtension("rtpat");
		PatternModularUtils.saveRuntimePatternModel(patternInstances, uri);
		
		return true;
	}

	public WizardDialog getDialog() {
		return dialog;
	}

	public void setDialog(WizardDialog dialog) {
		this.dialog = dialog;
	}	
	
	/*
	 * Convert relative to absolute. 
	 * This is because DSLtao do the inverse.
	 * @param resource
	 * */
	
	private void setPatternAbsoluteUri(Resource resource){
		
		URI absoluteUri = URI.createPlatformResourceURI(this.eProject.getName() + "/" + resource.getURI().toString(), true);
		resource.setURI(absoluteUri);
	}
	
 }
