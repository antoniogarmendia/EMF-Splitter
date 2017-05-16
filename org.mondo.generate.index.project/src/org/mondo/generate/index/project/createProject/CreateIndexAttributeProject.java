package org.mondo.generate.index.project.createProject;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.mondo.generate.index.project.main.WorkflowIndexProject;

import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.CreateEclipseProjectImpl;

public class CreateIndexAttributeProject extends CreateEclipseProjectImpl{

	final private String prop_address = "/org/mondo/generate/index/project/properties/default_plugin_features.properties";
	public String current_project_name;
	private String add_name;
	public String plug_path;
	private EcoreEMF ecoreMM;
	private EObject model;
	
	public CreateIndexAttributeProject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CreateIndexAttributeProject(String anProjectName, IProgressMonitor anMonitor, EcoreEMF anEcore)
	{
		super();
		Properties config = new Properties();
		InputStream is = CreateIndexAttributeProject.class.getResourceAsStream(prop_address);
		try {
			
			config.load(is);
			this.add_name = config.getProperty("prefix_name");
			is.close();
			this.current_project_name = anProjectName;
			this.projectName = current_project_name.concat("." + add_name);
			//Get the location
			this.plug_path = ResourcesPlugin.getWorkspace().getRoot().getProject(current_project_name).getLocation().toString();
			//End 
			this.monitor = anMonitor;
			this.isPlugin = true;
			this.isMavenProject = false;
			this.ecoreMM = anEcore;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public void CreateProject() {
		// TODO Auto-generated method stub
		super.CreateProject();
		
		final IWorkspaceRunnable create = new IWorkspaceRunnable(){

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				// TODO Auto-generated method stub
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
					boolean before = SwitchSuccessNotification(false);
					Generate_Files();
		            SwitchSuccessNotification(before);
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				}				
			}			
		};
		
		try {
			ResourcesPlugin.getWorkspace().run(create,monitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	public void CreateAllFoldersProject() {
		// TODO Auto-generated method stub
		CreateFolder("src");
		CreateFolder("META-INF");		
	}
	
	public void CreateAllPackages(IJavaProject anJavaProject){
		
		CreateJavaPackages(anJavaProject, "");
		CreateJavaPackages(anJavaProject,".definition");		
	}
	
	public EList<String> AddPluginNature()
	{
		EList<String> natures = new BasicEList<String>();
		return natures;
	}
	
	public void Required_Builder_Project(IProjectDescription desc){
		
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
	
	public void Create_Src(IProgressMonitor monitor,IJavaProject anJavaProject){
		
		EList<IClasspathEntry> classpathEntries = new BasicEList<IClasspathEntry>();
		final IFolder src = project.getFolder("src");
		final IClasspathEntry srcClasspathEntry = JavaCore.newSourceEntry(src.getFullPath());
		
		classpathEntries.add(srcClasspathEntry);
		
		classpathEntries.addAll(Arrays.asList(PreferenceConstants.getDefaultJRELibrary()));
		classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
		
		Create_Src_Classpath(anJavaProject,monitor,classpathEntries);		
	}
	
	private boolean SwitchSuccessNotification(boolean notify) {
		// TODO Auto-generated method stub
		
		boolean successNotifications = AcceleoPreferences.areSuccessNotificationsEnabled();
		if(successNotifications != notify)
		{
			AcceleoPreferences.switchSuccessNotifications(notify);
			return successNotifications;
		}
		return successNotifications;
	}
	
	public EObject getModel() {
		return model;
	}

	public void setModel(EObject model) {
		this.model = model;
	}	
	
	private void Generate_Files() {
		
		//Call Acceleo Templates
		//Get Workspace Path
		String current_plug_path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		File targetFolder = new File(current_plug_path + '/' + project.getName() + "/");
		final List<String> generatorargs = new ArrayList<String>();
		generatorargs.add(current_project_name);
		WorkflowIndexProject scopeFiles;
		try {
			scopeFiles = new WorkflowIndexProject(model, targetFolder, generatorargs);
			scopeFiles.doGenerate(BasicMonitor.toMonitor(monitor));	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//End		
	}
	
}
