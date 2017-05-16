package org.mondo.generate.visibility.project.createProject;

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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.mondo.generate.visibility.project.main.WorkflowVisibilityProject;

import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.CreateEclipseProjectImpl;

public class CreateVisibilityPluginProject extends CreateEclipseProjectImpl{

	final private String prop_address = "/org/mondo/generate/visibility/project/properties/default_visibility.properties";
	static final public String runtime_pattern_ext = runtimePatterns.RuntimePatternsPackage.eINSTANCE.getNsPrefix();
	private EObject model;
	private String current_project_name;
	private EcoreEMF nemf; 
	
	public CreateVisibilityPluginProject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CreateVisibilityPluginProject(String anprojectname,EcoreEMF annemf, IProgressMonitor anmonitor)
	{
		Properties config = new Properties();
		InputStream is = CreateVisibilityPluginProject.class.getResourceAsStream(prop_address);
		try {
			config.load(is);
			String add_name = config.getProperty("prefix_name");
			is.close();
			this.current_project_name = anprojectname;
			this.projectName = anprojectname.concat("." + add_name);
			this.monitor = anmonitor;
			this.nemf = annemf;
			this.isPlugin = true;
			this.isMavenProject = false;
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void CreateAllFoldersProject() {
		
		CreateFolder("src");
		CreateFolder("META-INF");		
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
			ResourcesPlugin.getWorkspace().run(create, monitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void CreateAllPackages(IJavaProject javaproc) {
		// TODO Auto-generated method stub
		CreateJavaPackages(javaproc,".definition");
	}

	private void Generate_Files() {
		
		//Get Workspace Path
		String current_plug_path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		File targetFolder = new File(current_plug_path + '/' + project.getName() + "/");
		try {
			final List<String> generatorargs = new ArrayList<String>();
			generatorargs.add(current_project_name);
			WorkflowVisibilityProject visibilityFiles = null;
			if(getModel()!=null)
				visibilityFiles = new WorkflowVisibilityProject(getModel(), targetFolder,generatorargs);
			else
				visibilityFiles = new WorkflowVisibilityProject(URI.createURI(GetModelURI()), targetFolder,generatorargs);
			
			visibilityFiles.doGenerate(BasicMonitor.toMonitor(monitor));
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	private String GetModelURI() {
		// TODO Auto-generated method stub
		return nemf.getFileuri().substring(0, nemf.getFileuri().lastIndexOf('.')).concat("." + runtime_pattern_ext);
	}

	public EList<String> AddPluginNature() {
		// TODO Auto-generated method stub
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

}
