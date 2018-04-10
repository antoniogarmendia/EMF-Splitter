package org.mondo.emf.splitter.dsl.tao;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.mondo.editor.extensionpoints.IPatternImplementation;
import org.mondo.editor.extensionpoints.ValidationInfo;
import org.mondo.editor.graphiti.diagram.utils.ModelUtils;
import org.mondo.editor.ui.utils.patterns.PatternApplicationUtils;
import org.mondo.generate.constraint.project.createProject.CreateConstraintProject;
import org.uam.eps.modular.constraints.dialog.wizard.WizardConstraint;

import constraints.MetamodelConstraint;
import dslPatterns.MMInterface;
import dslPatterns.Pattern;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;
import splitterLibrary.util.DSLtaoUtils;

public class DSLtaoCreateConstraintProject implements IPatternImplementation {

	public DSLtaoCreateConstraintProject() {
		
	}

	@Override
	public boolean execute(EPackage ePack, PatternInstance pattern, IPath iPath) {
		
		IResource res = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(iPath);
		IProject currentProject = res.getProject();
		//File uri of the ecore Meta-Model
		IPath ecorePath = iPath.removeFileExtension().addFileExtension("ecore");
		//If *.ecore doesn't exist Create it!!
		IResource resEcore = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(ecorePath);
		String pathEcore = resEcore.getFullPath().toString().substring(1,resEcore.getFullPath().toString().length());
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
			
		// file uri of the constraint model
		String consURI = res.getLocation().removeFileExtension().addFileExtension("cons").toString();
				
		CreateConstraintProject createConstraint = new CreateConstraintProject(currentProject.getName(),
										new NullProgressMonitor(), consURI,pathEcore);
		createConstraint.setModel(pattern);
		createConstraint.CreateProject();		
		
		System.out.println("Create Constraint Project");
		return true;
	}

	@Override
	public ValidationInfo validate(EPackage ePack, PatternInstance pattern) {
		
		return null;
	}

	@Override
	public List<ENamedElement> getOptimalElements(EPackage ePack, MMInterface mminterface) {
		
		return null;
	}

	@Override
	public boolean applyPattern(EPackage ePack, Pattern pattern, PatternInstances patternInstances, IPath iPath) {
		
		URI resourceURI = ePack.eResource().getURI();
		Resource resourceMM = DSLtaoUtils.findEcoreMM(resourceURI);
				
		EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
		nemf.setRs(resourceMM);
		
		WizardConstraint wizard = new WizardConstraint(nemf);
		
		// find a resource rtpat
		URI mmConsURI = resourceURI.trimFileExtension().appendFileExtension("cons");
		
		boolean exist = new ExtensibleURIConverterImpl().exists(mmConsURI, null);
		
		if (exist == true) {
			
			boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Update/Override", 
							"A file with constraints has been detected. "
							+ "Would you like to update the pattern?");
			
			//Update
			if (result == true) {
			
				ResourceSet reset = new ResourceSetImpl();
				Resource res = reset.getResource(mmConsURI, true);
				
				EObject rootEObject = res.getContents().get(0);
				if (rootEObject instanceof MetamodelConstraint) {
					wizard.setConstraint((MetamodelConstraint) rootEObject);
				}				
			}			
		}
		
		WizardDialog wizardDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		
		if (wizardDialog.open() == Window.OK) {
			
			// transform the constraint structure to the DSLtao(*.diagram)
			PatternInstance consInstance = wizard.getConsInstance();
			// apply pattern to the diagram
			PatternApplicationUtils.applyPattern(DSLtaoUtils.transformFromAppliedPatternsToMMInterfaceRelDiagram(consInstance,pattern),
						DSLtaoUtils.getDiagramDSLtao(), pattern, patternInstances, "Constraint", false);
			
			
			System.out.println("The Constraint Pattern was instantiated!");	
			
		} else {
			System.out.println("The user cancelled the operation");
		}
		
		return true;
	}

}
