package org.mondo.emf.splitter.dsl.tao;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.mondo.editor.extensionpoints.IPatternImplementation;
import org.mondo.editor.extensionpoints.ValidationInfo;
import org.mondo.editor.graphiti.diagram.utils.ModelUtils;
import org.mondo.editor.ui.utils.patterns.PatternApplicationUtils;
import org.mondo.generate.visibility.project.createProject.CreateVisibilityPluginProject;
import org.uam.eps.modular.visibility.wizard.def.VisibilityWizard;

import dslPatterns.MMInterface;
import dslPatterns.Pattern;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;
import splitterLibrary.util.DSLtaoUtils;
import visibility.MetamodelVisibility;

public class DSLtaoCreateVisibilityProject implements IPatternImplementation {

	public DSLtaoCreateVisibilityProject() {
		
	}

	@Override
	public boolean execute(EPackage ePack, PatternInstance pattern, IPath iPath) {
		// TODO Auto-generated method stub
		IResource res = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(iPath);
		IProject current_pro = res.getProject();		
		EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
		//File uri of the ecore Meta-Model
		String fileuri = res.getLocationURI().toString().substring(0, 
				res.getLocationURI().toString().lastIndexOf("/")).concat("/"+iPath.removeFileExtension().lastSegment()+".ecore");
		
		//If *.ecore doesn't exist Create it!!
		IResource resEcore = ResourcesPlugin.getWorkspace().getRoot().
					getFileForLocation(Path.fromOSString(URI.createURI(fileuri,true).toFileString()));
		if(!resEcore.exists())
			try {
					ModelUtils.saveModel(fileuri, ePack);
			} catch (IOException e) {
					
				e.printStackTrace();
			}
		//END
		nemf.setFileuri(fileuri);
		//End
		nemf.setPackMetamodel(ePack);
		//Create Visibility Plugin Project
		CreateVisibilityPluginProject cVisibility = new CreateVisibilityPluginProject(current_pro.getName(), nemf, new NullProgressMonitor());
		cVisibility.setModel(pattern);
		cVisibility.CreateProject();
		//End
		System.out.println("Complete Creation of Visibility Plugin Project");
		return true;
	}

	@Override
	public ValidationInfo validate(EPackage ePack, PatternInstance pattern) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ENamedElement> getOptimalElements(EPackage ePack, MMInterface mminterface) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean applyPattern(EPackage ePack, Pattern pattern, PatternInstances patternInstances, IPath iPath) {
		
		URI resourceURI = ePack.eResource().getURI();
		Resource resourceMM = DSLtaoUtils.findEcoreMM(resourceURI);
			
		EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
		nemf.setRs(resourceMM);
		
		VisibilityWizard wizard = new VisibilityWizard(nemf);
		
		// find a resource mmgraph
		URI mmVisibilityURI = resourceURI.trimFileExtension().appendFileExtension("vis");
		
		boolean exist = new ExtensibleURIConverterImpl().exists(mmVisibilityURI, null);
		
		if (exist == true) {
			
			boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Update/Override", 
							"A file with visibility rules has been detected. "
							+ "Would you like to update the pattern?");
			
			//Update
			if (result == true) {
				
				ResourceSet reset = new ResourceSetImpl();
				Resource res = reset.getResource(mmVisibilityURI, true);
				
				EObject rootEObject = res.getContents().get(0);
				if (rootEObject instanceof MetamodelVisibility) {
					wizard.setVisibilityRules((MetamodelVisibility) rootEObject);
				}				
			}			
		}
		
		WizardDialog wizardDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		
		if (wizardDialog.open() == Window.OK) {
			
			// transform the visibility structure to the DSLtao(*.diagram)
			PatternInstance visInstance = wizard.getVisInstance();			
			// apply pattern to the diagram
			PatternApplicationUtils.applyPattern(DSLtaoUtils.transformFromAppliedPatternsToMMInterfaceRelDiagram(visInstance,pattern),
										DSLtaoUtils.getDiagramDSLtao(), pattern, patternInstances, "Visibility", false);
			
			System.out.println("The Visibility Structure was created!");		
		} else {
			System.out.println("The user cancelled the operation");
		}
		
		return true;
	}

}
