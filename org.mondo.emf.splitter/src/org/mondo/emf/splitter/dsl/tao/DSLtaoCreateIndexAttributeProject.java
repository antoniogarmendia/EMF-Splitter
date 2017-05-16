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
import org.eclipse.emf.ecore.EPackage;
import org.mondo.editor.extensionpoints.IPatternImplementation;
import org.mondo.editor.extensionpoints.ValidationInfo;
import org.mondo.editor.graphiti.diagram.utils.ModelUtils;
import org.mondo.generate.index.project.createProject.CreateIndexAttributeProject;

import dslPatterns.MMInterface;
import dslPatterns.Pattern;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;

public class DSLtaoCreateIndexAttributeProject implements IPatternImplementation{

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
					// TODO Auto-generated catch block
				e.printStackTrace();
		}
		//END
		nemf.setFileuri(fileuri);
		nemf.setPackMetamodel(ePack);
		
		//Create Index Project
		CreateIndexAttributeProject createIndexproject = new CreateIndexAttributeProject(current_pro.getName(),
																	new NullProgressMonitor(), nemf);
		
		createIndexproject.setModel(pattern);
		createIndexproject.CreateProject();
		//End
		
		System.out.println("Complete Creation of IndexAttribute Plugin Project");
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
		// TODO Auto-generated method stub
		return false;
	}
	

}
