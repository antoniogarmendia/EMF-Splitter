package org.mondo.generate.modular.project.general.create.project;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.mondo.generate.modular.project.general.create.project.main.GeneralModularProject;

import runtimePatterns.ClassRoleInstance;
import runtimePatterns.FeatureRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.impl.CreateEclipseProjectImpl;

public class CreateGeneralModularProject extends CreateEclipseProjectImpl{
	
	final private String propertiesAddress = "/org/mondo/generate/modular/project/general/create/project/properties/defaultFeatures.properties";
	
	private String projectParentName;
	private String projectName;
	private IProgressMonitor monitor;
	private URI modelUri;
	private EObject eObject;
	
	private void initGeneralModularProject(String projectName, IProgressMonitor monitor) {
		
		this.projectParentName = projectName;
		this.monitor = monitor;	
		this.isMavenProject = false;
		
		//Get Project Name
		Properties config = new Properties();
		
		InputStream is = CreateGeneralModularProject.class.getResourceAsStream(propertiesAddress);
		
		try {
			config.load(is);
			String addSuffix = config.getProperty("prefix_name");
			is.close();
			this.projectName = this.projectParentName.concat("." + addSuffix);
			
		} catch (IOException e) {			
			e.printStackTrace();
		}	
		
	}
	
	public CreateGeneralModularProject(String projectName, URI modelUri, IProgressMonitor monitor) {
		
		this.modelUri = modelUri;
		this.eObject = null;	
		initGeneralModularProject(projectName,monitor);
	}
	
	public CreateGeneralModularProject(String projectName, EObject eObject, IProgressMonitor monitor) {
		
		this.eObject = eObject;
		this.modelUri = null;
		initGeneralModularProject(projectName,monitor);
	}
	
	@Override
	public void CreateProject() {
		
		super.CreateProject();
		final IWorkspaceRunnable create = new IWorkspaceRunnable(){

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				
				project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				if (!project.exists()) {
					
					final IJavaProject javaproc = JavaCore.create(project);
					final IProjectDescription desc = project.getWorkspace().newProjectDescription(projectName);
					desc.setLocation(null);
					project.create(desc, monitor);
					project.open(monitor);
					AddNatureToProject(new BasicEList<String>(),desc);
					requiredBuilderProject(desc);
					project.setDescription(desc, monitor);
					createAllFoldersProject();
					createSrc(monitor, javaproc);
					copyIcons();
					boolean before = switchSuccessNotification(false);
		            generateFiles();
		            switchSuccessNotification(before);
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				}				
			}			
		};		
		
		try {
			ResourcesPlugin.getWorkspace().run(create,monitor);			
		} catch (CoreException e) {
			
			e.printStackTrace();
		}
		
	}	
	
	public void generateFiles() {
		
		//Get Workspace Path
		String current_plug_path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		File targetFolder = new File(current_plug_path + '/' + project.getName() + "/");
		
		final List<String> generatorargs = new ArrayList<String>();
		generatorargs.add(projectParentName);
		generatorargs.add(this.getGenModel());
		
		GeneralModularProject generateAllFiles = null;
		
		try {
			
			if(this.eObject !=null) {
				generateAllFiles = new GeneralModularProject(this.eObject, targetFolder, generatorargs);
			} else {
				generateAllFiles = new GeneralModularProject(this.modelUri, targetFolder, generatorargs);
			}				
			
			generateAllFiles.doGenerate(BasicMonitor.toMonitor(monitor));
			
		} catch (IOException e) {				
				e.printStackTrace();
		}	
		
	}
	
	public String getGenModel() {
		
		if(this.eObject != null) {
			URI patternURI = this.eObject.eResource().getURI();
			URI genModelURI = patternURI.trimFileExtension().appendFileExtension("genmodel");
			return genModelURI.devicePath();
		}
		return null;
	}

	public boolean switchSuccessNotification(boolean notify) {
		
		boolean successNotifications = AcceleoPreferences.areSuccessNotificationsEnabled();
		if(successNotifications != notify)
		{
			AcceleoPreferences.switchSuccessNotifications(notify);
			return successNotifications;
		}
		return successNotifications;		
	}

	public void requiredBuilderProject(IProjectDescription desc){
		
		List<ICommand> builders = new ArrayList<>();
		
		final ICommand java = desc.newCommand();
	    java.setBuilderName(JavaCore.BUILDER_ID);
	    builders.add(java);
	    
	    final ICommand manifest = desc.newCommand();
        manifest.setBuilderName("org.eclipse.pde.ManifestBuilder");
        builders.add(manifest);

        final ICommand schema = desc.newCommand();
        schema.setBuilderName("org.eclipse.pde.SchemaBuilder");
        builders.add(schema);
        
        if (isMavenProject)
        {
            final ICommand mvn_schema = desc.newCommand();
            mvn_schema.setBuilderName("org.eclipse.m2e.core.maven2Builder");
            builders.add(mvn_schema);
        }
        
        desc.setBuildSpec(builders.toArray(new ICommand[builders.size()]));
	}
	
	public void createAllFoldersProject() {
		
		CreateFolder("src");
		CreateFolder("icons");
		CreateFolder("META-INF");
	}
	
	public void createSrc(IProgressMonitor monitor, IJavaProject javaProject) {
		
		EList<IClasspathEntry> classpathEntries = new BasicEList<IClasspathEntry>();
		final IFolder src = project.getFolder("src");
		final IClasspathEntry srcClasspathEntry = JavaCore.newSourceEntry(src.getFullPath());
		
		classpathEntries.add(srcClasspathEntry);
		
		classpathEntries.addAll(Arrays.asList(PreferenceConstants.getDefaultJRELibrary()));
		classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
		
		Create_Src_Classpath(javaProject,monitor,classpathEntries);		
	}
	
	public void copyIcons() {
		
		final String workspacePath = CreateGeneralModularProject.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		Copy_Image(workspacePath.concat("icons/Pro.png"),"Pro.png", "icons");	
		
		String currentPlugPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		EObject rootEObject = getEObject();
		if(rootEObject instanceof PatternInstances){
			
			PatternInstances patternInstances = (PatternInstances) rootEObject;
			Iterator<PatternInstance> itAppliedPatterns = patternInstances.getAppliedPatterns().iterator();
			
			while (itAppliedPatterns.hasNext()) {
				
				PatternInstance patternInstance = (PatternInstance) itAppliedPatterns.next();
				Iterator<ClassRoleInstance> itClassRoles = patternInstance.getClassInstances().iterator();
				while (itClassRoles.hasNext()) {
					
					ClassRoleInstance classRoleInstance = (ClassRoleInstance) itClassRoles.next();
					if(isClassRoleProject(classRoleInstance)==true) {
						
						Iterator<FeatureRoleInstance> itFeatures = classRoleInstance.getFeatureInstances().iterator();
						while (itFeatures.hasNext()) {
							FeatureRoleInstance featureRoleInstance = (FeatureRoleInstance) itFeatures.next();
								if(featureRoleInstance instanceof InstanceFeatureRoleInstance) {
									
									InstanceFeatureRoleInstance instFeature = (InstanceFeatureRoleInstance)featureRoleInstance;
									if(instFeature.getRole().getRef() != null) {
										
										if(existInstanceFeature(instFeature.getRole().getRef(),"icon") == true){
											
											if(!(instFeature.getValue().equals("/root") || instFeature.getValue().equals(""))){
												String source = instFeature.getValue().subSequence(instFeature.getValue().lastIndexOf('/')+1, instFeature.getValue().length()).toString();
												Copy_Image(currentPlugPath.concat("/" + instFeature.getValue()),source, "icons");
											}
										}
									}									
								}
						}
					}
				}
			}			
			
			System.out.println("CopyIcons!");
		}		
	}
	
	private boolean existInstanceFeature(EList<EAttribute> list, String feat)
	{
		Iterator<EAttribute> it = list.iterator();
		while (it.hasNext()) {
			EAttribute eAttribute = (EAttribute) it.next();
			if(eAttribute.getName().equals(feat))
				return true;
		}
		return false;
	}
	
	private boolean isClassRoleProject(ClassRoleInstance classRole){
		
		Iterator<EClass> itRef = classRole.getRole().getRef().iterator();
		while (itRef.hasNext()) {
			EClass eClass = (EClass) itRef.next();
			if(eClass.getName().equalsIgnoreCase("project"))
				return true;
		}
		return false;
	}	
	
	private EObject getEObject(){
		
		if(this.eObject != null)
			return this.eObject;
		else{
			
			ResourceSet reset = new ResourceSetImpl();
			Resource resource = reset.getResource(modelUri,true);
			return resource.getContents().get(0);
		}
	}

}
