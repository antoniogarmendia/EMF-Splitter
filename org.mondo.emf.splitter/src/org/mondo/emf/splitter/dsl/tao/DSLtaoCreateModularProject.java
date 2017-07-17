package org.mondo.emf.splitter.dsl.tao;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.miso.wizard.instantiate.modular.pattern.wizard.DialogApplyModularPattern;
import org.miso.wizard.instantiate.modular.pattern.wizard.WizardApplyModularPattern;
import org.mondo.editor.extensionpoints.IPatternImplementation;
import org.mondo.editor.extensionpoints.ValidationInfo;

import runtimePatterns.ClassRoleInstance;
import runtimePatterns.FeatureRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import runtimePatterns.ReferenceRoleInstance;
import runtimePatterns.TypeFeatureRoleInstance;
import splitterLibrary.EcoreEMF;
import splitterLibrary.GenModelEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;
import dslPatterns.MMInterface;
import dslPatterns.Pattern;

import org.mondo.editor.graphiti.diagram.utils.ModelUtils;
import org.mondo.editor.ui.utils.patterns.MMInterfaceRelDiagram;
import org.mondo.editor.ui.utils.patterns.PatternApplicationUtils;
import org.mondo.generate.modular.project.create.project.CreateModularProject;

import com.google.common.collect.Iterables;

import MetaModelGraph.Graph;
import MetaModelGraph.impl.MetaModelGraphFactoryImpl;

public class DSLtaoCreateModularProject implements IPatternImplementation {

	public DSLtaoCreateModularProject() {
		
		
	}

	@Override
	public boolean execute(EPackage ePack, PatternInstance pattern, IPath iPath) {
		
		IResource res = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(iPath);
		IProject current_pro = res.getProject();		
		EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
		//File uri of the ecore Meta-Model
		IPath ecorePath = iPath.removeFileExtension().addFileExtension("ecore");
		//If *.ecore doesn't exist Create it!!
		IResource resEcore = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(ecorePath);
		if(!resEcore.exists())
		try {
			  Copier copier = new Copier();
			  EObject result = copier.copy(ePack);
			  copier.copyReferences();			  
			  ModelUtils.saveModel(resEcore.getLocationURI().toString(), result);
		} catch (IOException e) {
				
			e.printStackTrace();
		}
		//END
		nemf.setFileuri(resEcore.getLocationURI().toString());
		//End
		nemf.setPackMetamodel(ePack);		
		//Create GenModel, Generate Model Code & Edit Code & Editor Code
		GenModelEMF generate_genmodel = SplitterLibraryFactoryImpl.eINSTANCE.createGenModelEMF();
		generate_genmodel.setNemf(nemf);
		generate_genmodel.CreateGenModel();
		//End
		//Create Modular Plugin Project
		    CreateModularProject cmod = new CreateModularProject(current_pro.getName(), new NullProgressMonitor(),nemf);
		    cmod.setModelEObject(pattern);
			cmod.CreateProject();
		//End
		try {
			current_pro.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			
			e.printStackTrace();
		}
			System.out.println("Complete Creation of Modular Plugin Project" );
		return true;
	}

	@Override
	public ValidationInfo validate(EPackage ePack, PatternInstance pattern) {
		
		return null;
	}

	@Override
	public List<ENamedElement> getOptimalElements(EPackage ePack,
			MMInterface mminterface) {
		
		return null;
	}

	@Override
	public boolean applyPattern(EPackage ePack, Pattern pattern,
			PatternInstances patternInstances, IPath iPath) {
		
		URI resourceURI = ePack.eResource().getURI();
		
		String platformString = resourceURI.toPlatformString(false);
		String projectName = platformString.substring(1, platformString.indexOf("/", 1));		
				
		IProject pro = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);		
		
		// find ecore file
		URI metaM = resourceURI.trimFileExtension().appendFileExtension("ecore");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resourceMM = resourceSet.getResource(metaM, true);		
		
		WizardApplyModularPattern wizard = new WizardApplyModularPattern(resourceMM, pro);
		DialogApplyModularPattern dialog = new DialogApplyModularPattern(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
											, wizard);
		
		wizard.setDialog(dialog);			
		
		dialog.setPageSize(500, 300);	
		
		// find a resource mmgraph
		URI mmGraphURI = resourceURI.trimFileExtension().appendFileExtension("mmgraph");
				
		boolean fileExist = new ExtensibleURIConverterImpl().exists(mmGraphURI, null);
			
		if (fileExist == true) {
			
			boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							"Update/Override", 
									"A file with the modular pattern definition has been detected. "
									+ "Would you like to update the pattern?");
			
			//update 
			if(result == true) {
				
				Resource res = resourceMM.getResourceSet().getResource(mmGraphURI, true);
				wizard.seteGraph((Graph) res.getContents().get(0));					
			} else
				createGraphResource(resourceMM.getResourceSet(),mmGraphURI,wizard);
		} else
			createGraphResource(resourceMM.getResourceSet(),mmGraphURI,wizard);
		

		if (dialog.open() == Window.OK) 
		{ 	
			System.out.println("The Modular Structure was created!");
			// transform modular structure to the DSLtao(*.diagram) 
			PatternInstance modularInstance = wizard.getModularInstance();
			modularInstance.setAttached(false);
			transformPatternsCompatibleWithDiagram(ePack,modularInstance);
			
			/*
			 * if the meta-model has packages inside packages it gave me an error
			 * that's why I check first the meta-model 
			 * */
			if (checkMM(resourceMM) == true) {			
				// apply pattern to the diagram
				PatternApplicationUtils.applyPattern(transformFromAppliedPatternsToMMInterfaceRelDiagram(modularInstance,pattern),
						getDiagramDSLtao(), pattern, patternInstances, "Modularity", false);
				
				System.out.println("Modular Structure Applied to the Diagram");
			}
		}
		else
		{
			System.out.println("The user cancelled the operation");
		}
			
		return true;
	}
	
	private boolean checkMM(Resource resourceMM) {
		
		int size = resourceMM.getContents().size();
		if (size != 1)
			return false;
		
		EObject rootEObject = resourceMM.getContents().get(0);
		if (rootEObject instanceof EPackage) {
			
			EPackage pack = (EPackage) rootEObject;
			if (pack.getESubpackages().size() > 1)
				return false;			
		}		
		
		return true;
	}

	private void transformPatternsCompatibleWithDiagram(EPackage ePack, PatternInstance modularInstance) {
		
		EList<EClass> listEClasses = obtainEClasses(ePack);		
		Iterator<ClassRoleInstance> itClassRoleInstance = modularInstance.getClassInstances().iterator();
		while (itClassRoleInstance.hasNext()) {
			ClassRoleInstance classRoleInstance = (ClassRoleInstance) itClassRoleInstance.next();
			EClass eClass = searchEClassByName(listEClasses, classRoleInstance.getElement().getName());
			classRoleInstance.setElement(eClass);
			
			// set name
			Iterator<FeatureRoleInstance> itFeatures = classRoleInstance.getFeatureInstances().iterator();
			while (itFeatures.hasNext()) {
				FeatureRoleInstance featureRoleInstance = (FeatureRoleInstance) itFeatures.next();
				if (featureRoleInstance instanceof TypeFeatureRoleInstance) {
					
					TypeFeatureRoleInstance typeFeat = (TypeFeatureRoleInstance) featureRoleInstance;
					EAttribute eAttribute = searchEAttributeByName(eClass, typeFeat.getElement().getName());
					typeFeat.setElement(eAttribute);					
				}
			}
			
			//set composition
			Iterator<ReferenceRoleInstance> itReferences = classRoleInstance.getReferenceInstances().iterator();
			while (itReferences.hasNext()) {
				ReferenceRoleInstance referenceRoleInstance = (ReferenceRoleInstance) itReferences.next();
				EReference eReference = searchEReference(eClass, referenceRoleInstance.getElement().getName());
				referenceRoleInstance.setElement(eReference);				
			}			
		}
		
	}

	private void createGraphResource(ResourceSet resourceSet, URI mmGraphURI, WizardApplyModularPattern wizard) {
		
		Resource gResource = resourceSet.createResource(mmGraphURI);
		Graph  mmGraph = MetaModelGraphFactoryImpl.eINSTANCE.createGraph();
		gResource.getContents().add(mmGraph);			
		wizard.seteGraph(mmGraph);		
	}
	
	private EList<EClass> obtainEClasses(EPackage ePackage) {
		
		EClass[] aux = Iterables.toArray(Iterables.filter(ePackage.getEClassifiers(), EClass.class), EClass.class);
		EList<EClass> listEClasses = new BasicInternalEList<EClass>(EClass.class, aux.length,aux);
		EList<EPackage> listSubPackages = ePackage.getESubpackages();
		for (int i = 0; i < listSubPackages.size(); i++) {
			EPackage currentPack = listSubPackages.get(i);
			aux = Iterables.toArray(Iterables.filter(currentPack.getEClassifiers(), EClass.class), EClass.class);
			listEClasses.addAll(new BasicInternalEList<EClass>(EClass.class, aux.length,aux));
			listSubPackages.addAll(currentPack.getESubpackages());
		}
		
		return listEClasses;		
	}
	
	private EClass searchEClassByName(EList<EClass> listEClasses, String name) {
		
		
		Iterator<EClass> itEClasses =  listEClasses.iterator();
		while (itEClasses.hasNext()) {
			EClass eClass = (EClass) itEClasses.next();
			if(eClass.getName().equals(name))
				return eClass;
		}		
		return null;
	}
	
	private EAttribute searchEAttributeByName (EClass eClass, String name) {
		
		Iterator<EAttribute> itEAttributes = eClass.getEAllAttributes().iterator();
		while (itEAttributes.hasNext()) {
			EAttribute eAttribute = (EAttribute) itEAttributes.next();
			if (eAttribute.getName().equals(name))
				return eAttribute;
		}		
		return null;		
	}
	
	private EReference searchEReference (EClass eClass, String name) {
		
		Iterator<EReference> allContainments = eClass.getEAllContainments().iterator();
		while (allContainments.hasNext()) {
			EReference eReference = (EReference) allContainments.next();
			if (eReference.getName().equals(name))
				return eReference;
		}	
		
		return null;
	}
	
	private DiagramBehavior getDiagramDSLtao() {
		
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IDiagramContainerUI editor = (IDiagramContainerUI)activePage.getActiveEditor();
			
		return editor.getDiagramBehavior();		
	}
	
	private List<MMInterfaceRelDiagram> transformFromAppliedPatternsToMMInterfaceRelDiagram(PatternInstance modularInstance, Pattern pattern) {
		
		List<MMInterfaceRelDiagram> modularityMM = new LinkedList<MMInterfaceRelDiagram>();
		Iterator<ClassRoleInstance> itClassRoleInstance = modularInstance.getClassInstances().iterator();
		
		int order = 0;
		// add classes
		while (itClassRoleInstance.hasNext()) {
			ClassRoleInstance classRoleInstance = (ClassRoleInstance) itClassRoleInstance.next();
			MMInterface interfaceClassRoleInstance = classRoleInstance.getRole();
			String elementDiagram = classRoleInstance.getElement().getName();
			// add ClassRoleInstance
			MMInterfaceRelDiagram parentClassRoleInstance = new MMInterfaceRelDiagram
					(interfaceClassRoleInstance, elementDiagram, order, modularityMM);
			modularityMM.add(parentClassRoleInstance);		
			
			// add reference instances (composition)	
			Iterator<ReferenceRoleInstance> itReferenceInstances = classRoleInstance.getReferenceInstances().iterator();
			while (itReferenceInstances.hasNext()) {
				ReferenceRoleInstance referenceRoleInstance = (ReferenceRoleInstance) itReferenceInstances.next();
				String value = elementDiagram + "/" + referenceRoleInstance.getElement().getName();
				MMInterfaceRelDiagram mmReferenceRoleInstance = new MMInterfaceRelDiagram
						(referenceRoleInstance.getRole(), value, order, modularityMM);
				mmReferenceRoleInstance.setParent(parentClassRoleInstance);
				modularityMM.add(mmReferenceRoleInstance);
			}			
			
			// add FeatureType
			Iterator<FeatureRoleInstance> itFeatureInstances = classRoleInstance.getFeatureInstances().iterator();
			while (itFeatureInstances.hasNext()) {
				FeatureRoleInstance featureRoleInstance = (FeatureRoleInstance) itFeatureInstances.next();
				// add name feature
				if (featureRoleInstance instanceof TypeFeatureRoleInstance) {
					TypeFeatureRoleInstance type = (TypeFeatureRoleInstance) featureRoleInstance;
					String value = elementDiagram + "/" + type.getElement().getName(); 
					if (value != null) {
						MMInterfaceRelDiagram mmFeatureType = new MMInterfaceRelDiagram
								(type.getRole(), value, order, modularityMM);
						mmFeatureType.setParent(parentClassRoleInstance);						
						modularityMM.add(mmFeatureType);
					}
				}
				// add extension & icon
				else if (featureRoleInstance instanceof InstanceFeatureRoleInstance) {
					InstanceFeatureRoleInstance feat = (InstanceFeatureRoleInstance) featureRoleInstance;
					String value = feat.getValue();
					if (value != null) {						
						MMInterfaceRelDiagram mmFeatureRole = new MMInterfaceRelDiagram
								(feat.getRole(), value, order, modularityMM);	
						mmFeatureRole.setParent(parentClassRoleInstance);
						if(feat.getRole().getRef().get(0).getName().contains("icon"))
							parentClassRoleInstance.getChildren().add(mmFeatureRole);
						modularityMM.add(mmFeatureRole);
					}
				}
				
			}
			order++;
		}	
		
		return modularityMM;
	}
	
}
