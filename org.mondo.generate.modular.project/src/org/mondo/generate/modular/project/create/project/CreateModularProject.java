package org.mondo.generate.modular.project.create.project;

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
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
import org.mondo.generate.modular.project.general.create.project.CreateGeneralModularProject;
import org.mondo.generate.modular.project.main.WorkFlowModularProject;

import runtimePatterns.ClassRoleInstance;
import runtimePatterns.FeatureRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.CreateEclipseProjectImpl;

public class CreateModularProject extends CreateEclipseProjectImpl{

	final private String prop_address = "/org/mondo/generate/modular/project/properties/default_plugin_features.properties";
	static final public String runtime_pattern_ext = runtimePatterns.RuntimePatternsPackage.eINSTANCE.getNsPrefix();
	static final public String genmodel_ext = GenModelPackage.eNS_PREFIX;
	static final public String work_path = CreateModularProject.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	public String plug_path;
	public String current_project_name; 
	private EcoreEMF nemf;
	private EObject model;
	private String add_name;
	
	public CreateModularProject() {
		super();		
	}
	
	public CreateModularProject(String anprojectname, IProgressMonitor anmonitor, EcoreEMF annemf){
		
		super();
		Properties config = new Properties();
		try {
			InputStream is = CreateModularProject.class.getResourceAsStream(prop_address);
			config.load(is);
			add_name = config.getProperty("prefix_name");
			is.close();
			this.current_project_name = anprojectname;
			//Get the location
			plug_path = ResourcesPlugin.getWorkspace().getRoot().getProject(anprojectname).getLocation().toString();
			//End 
			this.projectName = anprojectname.concat("." + add_name);
			this.monitor = anmonitor;
			this.isPlugin = true;
			this.isMavenProject = false;
			this.nemf = annemf;
			this.model = null;
			} catch (IOException e) {
				
			e.printStackTrace();
		}		
	}
	
	@Override
	public void CreateProject() {
				
		super.CreateProject();
		
		PatternInstances patternInstances = getPatternInstances();
		Iterator<PatternInstance> patternsIterator = getModularityPatterns(patternInstances).iterator();
		String parentName = this.projectName;
		while (patternsIterator.hasNext()) {
			PatternInstance patternInstance = (PatternInstance) patternsIterator.next();
			String nameProjectClassRoleInstance = getNameProjectClassRoleInstance(patternInstance);
			this.projectName = parentName + "." + nameProjectClassRoleInstance;
			setModelEObject(patternInstance);
			createSingleProject();
		}	
		
		CreateGeneralModularProject generalProject = new CreateGeneralModularProject(current_project_name, patternInstances, monitor);
		generalProject.CreateProject();
				
	}
	
	private String getNameProjectClassRoleInstance(PatternInstance patternInstance) {
		
		Iterator<ClassRoleInstance> classInstancesIterator = patternInstance.getClassInstances().iterator();
		
		while (classInstancesIterator.hasNext()) {
			ClassRoleInstance classRoleInstance = (ClassRoleInstance) classInstancesIterator.next();
			Iterator<EClass> ref = classRoleInstance.getRole().getRef().iterator();
			while (ref.hasNext()) {
				EClass eClass = (EClass) ref.next();
				if(eClass.getName().equals("Project"))
					return classRoleInstance.getElement().getName().toLowerCase();
			}
		}
		
		return null;
	}

	public void createSingleProject(){
		
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
					 AddNatureToProject(AddPluginNature(),desc);
					 Required_Builder_Project(desc);
					 project.setDescription(desc, monitor);
					 createAllFoldersProject();
		             Create_Src(monitor,javaproc);
		             CreateAllPackages(javaproc);
		             Copy_Icons();
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
			
			e.printStackTrace();
		}
		
	}
	

	public void createAllFoldersProject() {
		
		CreateFolder("src");
		CreateFolder("icons");
		CreateFolder("META-INF");
	}
	
	public void CreateAllPackages(IJavaProject anJavaProject){
		
		/*
		CreateJavaPackages(anJavaProject, "");
		CreateJavaPackages(anJavaProject,".editors");
		CreateJavaPackages(anJavaProject,".decorator");
		CreateJavaPackages(anJavaProject,".wizard");
		CreateJavaPackages(anJavaProject,".wizard.folder");
		CreateJavaPackages(anJavaProject,".wizard.file");
		CreateJavaPackages(anJavaProject,".actions");
		CreateJavaPackages(anJavaProject,".propertysource");
		CreateJavaPackages(anJavaProject,".preferences");
		*/
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
	
	public void Generate_Files(){		
		
		//Get Workspace Path
		String current_plug_path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		File targetFolder = new File(current_plug_path + '/' + project.getName() + "/");
		try {
			final List<String> generatorargs = new ArrayList<String>();
			generatorargs.add(current_project_name);
			generatorargs.add(nemf.GetRootPackage().getName());
			generatorargs.add(this.getGenModel());
			WorkFlowModularProject modular_files = null;
			if(model!=null)
				modular_files = new WorkFlowModularProject(getModelEObject(), targetFolder,generatorargs);
			else
				modular_files = new WorkFlowModularProject(URI.createURI(GetModel()), targetFolder,generatorargs);
		
			modular_files.doGenerate(BasicMonitor.toMonitor(monitor));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}	
	
	public void Copy_Icons()
	{
		TreeIterator<EObject> tree = null;
		if(getModelEObject()==null){
			ResourceSet rs = new ResourceSetImpl();
			Resource res = rs.createResource(URI.createURI(GetModel())); 
			try {
				res.load(null);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			 tree = res.getAllContents();
		} 
		else
			tree = getModelEObject().eAllContents();
		EObject obj = null;
		boolean project_img = false;
		boolean folder_img = false;
		boolean file_img = false;
		
		String currentPlugPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		while(tree.hasNext()){
			obj = tree.next();
			if(obj instanceof ClassRoleInstance){
				ClassRoleInstance clazz = (ClassRoleInstance)obj;
				EList<FeatureRoleInstance> list = clazz.getFeatureInstances();
				for (FeatureRoleInstance featureRoleInstance : list) {
					if(featureRoleInstance instanceof InstanceFeatureRoleInstance)
					{
						InstanceFeatureRoleInstance inst_feat = (InstanceFeatureRoleInstance)featureRoleInstance;
						if(inst_feat.getRole().getRef()!=null)
						{
							if(inst_feat.getRole().getRef().size()!=0)
							{
								if(existInstanceFeature(inst_feat.getRole().getRef(),"icon") == true)
								{
									if(!(inst_feat.getValue().equals("/root") || inst_feat.getValue().equals(""))){
										String source = inst_feat.getValue().subSequence(inst_feat.getValue().lastIndexOf('/')+1, inst_feat.getValue().length()).toString();
										Copy_Image(currentPlugPath.concat("/" + inst_feat.getValue()),source, "icons");
									}
								else 
									{
										String cad = clazz.getRole().getRef().get(0).getName();
										if(cad.equals("Project"))
											if(project_img==false)
											{
												Copy_Image(work_path.concat("icons/icons_modular/Pro.png"),"Pro.png", "icons");
												project_img = true;
												break;
											}
											else
												break;
										if(cad.equals("Package"))
											if(folder_img==false)
											{
												Copy_Image(work_path.concat("icons/icons_modular/Folder.png"),"Folder.png", "icons");
												folder_img = true;
												break;
											}
											else
												break;
										if(cad.equals("Unit"))
											if(file_img==false)
											{
												Copy_Image(work_path.concat("icons/icons_modular/File.png"),"File.png", "icons");
												file_img = true;
												break;
											}
											else
												break;
										}
								}
							}								
						}						
					}
				}
			}			
		}		
	}
	
	public String GetModel(){
		//Runtime patterns model(http://mondo.org/runtimePatterns) runtime_pattern_ext
		//Same name, but different extension
		return nemf.getFileuri().substring(0, nemf.getFileuri().lastIndexOf('.')).concat("." + runtime_pattern_ext);
	}
	
	public EObject getModelEObject() {
		return model;
	}
	
	public String getGenModel(){
		if(getModelEObject() != null)
			return getModelEObject().eResource().getURI().trimFileExtension().appendFileExtension(genmodel_ext).toFileString();
		return nemf.GetIFile().getFullPath().toString().substring(0, nemf.GetIFile().getFullPath().toString().lastIndexOf('.')).concat("." + genmodel_ext);
	}

	public void setModelEObject(EObject model) {
		this.model = model;
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
	
	private EList<PatternInstance> getModularityPatterns(PatternInstances patterns){
		
		EList<PatternInstance> patternsList = new BasicEList<PatternInstance>();
		
		Iterator<PatternInstance> itAppliedPatterns = patterns.getAppliedPatterns().iterator();
			
			while (itAppliedPatterns.hasNext()) {
				PatternInstance patternInstance = (PatternInstance) itAppliedPatterns.next();
				if(isModularPattern(patternInstance)==true)
					patternsList.add(patternInstance); 
			}			
		
		
		return patternsList;
	}
	
	private PatternInstances getPatternInstances(){
		
		URI patternsURI = URI.createURI(GetModel());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource patternsResource = resourceSet.createResource(patternsURI);
		
		try {
			patternsResource.load(null);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return (patternsResource.getContents().get(0) instanceof PatternInstances) ? 
									(PatternInstances) patternsResource.getContents().get(0) : null;
	}
	
	private boolean isModularPattern(PatternInstance patternInstance){
		
		if(patternInstance.getPattern().getName().equals("Modularity"))
			return true;
		return false;
	}
	
}
