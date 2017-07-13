package org.mondo.generate.constraint.project.createProject;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.mondo.generate.constraint.project.main.WorkflowConstraintProject;

import splitterLibrary.impl.CreateEclipseProjectImpl;

public class CreateConstraintProject extends CreateEclipseProjectImpl{
	
	final private String prop_address = "/org/mondo/generate/constraint/project/properties/default_plugin_features.properties";
	public String currentProjectName;
	public String plug_path;
	private EObject model;
	private String consURI;
	private String pathEcore;
	
	public CreateConstraintProject (String anProjectName, IProgressMonitor anMonitor, String consURI, String pathEcore) {
		
		super();
		Properties config = new Properties();
		InputStream is = CreateConstraintProject.class.getResourceAsStream(prop_address);
			
		try {
			config.load(is);
			String name = config.getProperty("prefix_name");
			is.close();
			this.currentProjectName = anProjectName;
			this.projectName = this.currentProjectName.concat("." + name);
			//Get the location
			this.plug_path = ResourcesPlugin.getWorkspace().getRoot().getProject(currentProjectName).getLocation().toString();
			//End 
			this.monitor = anMonitor;
			this.isPlugin = true;
			this.isMavenProject = false;
			this.model = null;
			this.consURI = consURI;
			this.pathEcore = pathEcore;
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
	}
	
	public EObject getModel() {
		return model;
	}
	
	public void setModel(EObject model) {
		this.model = model;
	}
	
	@Override
	public void CreateProject() {
		
		super.CreateProject();
		
		final IWorkspaceRunnable create = new IWorkspaceRunnable() {

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				
				project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				
				if (!project.exists()) {
					
					final IJavaProject javaproc = JavaCore.create(project);
					final IProjectDescription desc = project.getWorkspace().newProjectDescription(projectName);
					desc.setLocation(null);
					project.create(desc, monitor);
					project.open(monitor);
					AddNatureToProject(AddPluginNature(),desc);
					Required_Builder_Project(desc);
					project.setDescription(desc, monitor);
					CreateAllFoldersProject();
					Create_Src(monitor,javaproc);
					CreateAllPackages(javaproc);
					copyModelCons();
					boolean before = SwitchSuccessNotification(false);
					generateFiles();
		            SwitchSuccessNotification(before);
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
	
	protected void copyModelCons() {
		
		File consFile = new File(consURI);
		File newConsFile = new File(project.getLocation().append("constraints/").toString());
			
		try {
			FileUtils.copyFileToDirectory(consFile, newConsFile);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}

	protected void generateFiles() {
		
		//Get Workspace Path
		String current_plug_path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		File targetFolder = new File(current_plug_path + '/' + project.getName() + "/");
		
		final List<String> generatorargs = new ArrayList<String>();
		generatorargs.add(this.currentProjectName);	
		generatorargs.add(new File(consURI).getName());
		generatorargs.add(this.pathEcore);
		
		try {
			WorkflowConstraintProject generateAllFiles = new WorkflowConstraintProject(getModel(), targetFolder, generatorargs);
			generateAllFiles.doGenerate(BasicMonitor.toMonitor(monitor));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}

	protected void CreateAllPackages(IJavaProject javaproc) {
		
		CreateJavaPackages(javaproc, "");				
	}

	protected void Create_Src(IProgressMonitor monitor, IJavaProject javaproc) {
		
		EList<IClasspathEntry> classpathEntries = new BasicEList<IClasspathEntry>();
		final IFolder src = project.getFolder("src");
		final IClasspathEntry srcClasspathEntry = JavaCore.newSourceEntry(src.getFullPath());
		
		classpathEntries.add(srcClasspathEntry);
		
		classpathEntries.addAll(Arrays.asList(PreferenceConstants.getDefaultJRELibrary()));
		classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
		
		Create_Src_Classpath(javaproc,monitor,classpathEntries);		
	}

	protected void CreateAllFoldersProject() {
		
		CreateFolder("src");
		CreateFolder("META-INF");
		CreateFolder("constraints");
	}

	protected void Required_Builder_Project(IProjectDescription desc) {
		
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

	public EList<String> AddPluginNature()
	{
		EList<String> natures = new BasicEList<String>();
		return natures;
	}
	
	private boolean SwitchSuccessNotification(boolean notify) {
		
		boolean successNotifications = AcceleoPreferences.areSuccessNotificationsEnabled();
		if(successNotifications != notify)
		{
			AcceleoPreferences.switchSuccessNotifications(notify);
			return successNotifications;
		}
		return successNotifications;
	}
	

}