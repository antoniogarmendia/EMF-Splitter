package org.mondo.emf.splitter.dsl.tao;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.miso.wizard.instantiate.modular.pattern.wizard.DialogApplyModularPattern;
import org.miso.wizard.instantiate.modular.pattern.wizard.WizardApplyModularPattern;
import org.mondo.editor.extensionpoints.IPatternImplementation;
import org.mondo.editor.extensionpoints.ValidationInfo;

import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.EcoreEMF;
import splitterLibrary.GenModelEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;
import dslPatterns.MMInterface;
import dslPatterns.Pattern;

import org.mondo.editor.graphiti.diagram.utils.ModelUtils;
import org.mondo.generate.modular.project.create.project.CreateModularProject;

public class DSLtaoCreateModularProject implements IPatternImplementation {

	public DSLtaoCreateModularProject() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute(EPackage ePack, PatternInstance pattern, IPath iPath) {
		// TODO Auto-generated method stub
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
				// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Complete Creation of Modular Plugin Project" );
		return true;
	}

	@Override
	public ValidationInfo validate(EPackage ePack, PatternInstance pattern) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ENamedElement> getOptimalElements(EPackage ePack,
			MMInterface mminterface) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean applyPattern(EPackage ePack, Pattern pattern,
			PatternInstances patternInstances, IPath iPath) {
		
		WizardApplyModularPattern wizard = new WizardApplyModularPattern(ePack,null,null);// Error (project is missing)
		DialogApplyModularPattern dialog = new DialogApplyModularPattern(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
											, wizard);
		
		dialog.getShell().setSize(500,500);//Size of the wizard
		
		if (dialog.open() == Window.OK) 
		{ 	
			System.out.println("OK");
		}
		else
		{
			System.out.println("Cancel");
		}
		
		return false;//true
	}
}
