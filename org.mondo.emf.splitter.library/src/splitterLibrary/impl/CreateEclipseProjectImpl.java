/**
 */
package splitterLibrary.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ClasspathAttribute;
import org.eclipse.jdt.internal.core.ClasspathEntry;

import splitterLibrary.CreateEclipseProject;
import splitterLibrary.SplitterLibraryFactory;
import splitterLibrary.SplitterLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Eclipse Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link splitterLibrary.impl.CreateEclipseProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link splitterLibrary.impl.CreateEclipseProjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link splitterLibrary.impl.CreateEclipseProjectImpl#getIsPlugin <em>Is Plugin</em>}</li>
 *   <li>{@link splitterLibrary.impl.CreateEclipseProjectImpl#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link splitterLibrary.impl.CreateEclipseProjectImpl#getIsMavenProject <em>Is Maven Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class CreateEclipseProjectImpl extends MinimalEObjectImpl.Container implements CreateEclipseProject {
	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final IProject PROJECT_EDEFAULT = (IProject)SplitterLibraryFactory.eINSTANCE.createFromString(SplitterLibraryPackage.eINSTANCE.getDTProject(), "null");

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected IProject project = PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPlugin() <em>Is Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPlugin()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PLUGIN_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsPlugin() <em>Is Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPlugin()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPlugin = IS_PLUGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitor() <em>Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected static final IProgressMonitor MONITOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected IProgressMonitor monitor = MONITOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMavenProject() <em>Is Maven Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMavenProject()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MAVEN_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMavenProject() <em>Is Maven Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMavenProject()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMavenProject = IS_MAVEN_PROJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateEclipseProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplitterLibraryPackage.Literals.CREATE_ECLIPSE_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(IProject newProject) {
		IProject oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPlugin() {
		return isPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPlugin(Boolean newIsPlugin) {
		Boolean oldIsPlugin = isPlugin;
		isPlugin = newIsPlugin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_PLUGIN, oldIsPlugin, isPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor getMonitor() {
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitor(IProgressMonitor newMonitor) {
		IProgressMonitor oldMonitor = monitor;
		monitor = newMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__MONITOR, oldMonitor, monitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMavenProject() {
		return isMavenProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMavenProject(Boolean newIsMavenProject) {
		Boolean oldIsMavenProject = isMavenProject;
		isMavenProject = newIsMavenProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_MAVEN_PROJECT, oldIsMavenProject, isMavenProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @generated NOT
	 */
	public void CreateFolder(String foldername){
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		final IFolder folder = project.getFolder(new Path(foldername));
		if(!folder.exists())
			try {
				folder.create(true,true,monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void CreateProject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean AddNatureToProject(EList<String> natureIds, IProjectDescription desc){
				
		natureIds.add(JavaCore.NATURE_ID);
		if(isPlugin)
			natureIds.add("org.eclipse.pde.PluginNature");
		if(isMavenProject)
			natureIds.add("org.eclipse.m2e.core.maven2Nature");		
		desc.setNatureIds(natureIds.toArray(new String[natureIds.size()]));
		return true;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IPackageFragment CreateJavaPackages(IJavaProject anJavaProject, String anPackage) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		IResource pack_res = project.getFolder("src"); 
		IPackageFragment pack = null;
		try {
			pack = anJavaProject.getPackageFragmentRoot(pack_res).createPackageFragment(project.getName().toLowerCase().concat(anPackage), false, null);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean Create_Src_Classpath(IJavaProject anJavaProject, IProgressMonitor monitor, EList<IClasspathEntry> classEntries) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (isMavenProject)
		{
		  
		final IClasspathEntry mavenDependencies = JavaCore.newContainerEntry(new Path("org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER"),
				   											ClasspathEntry.NO_ACCESS_RULES, 
				   											new IClasspathAttribute[] { new ClasspathAttribute("maven.pomderived", "true") }, false);
		   classEntries.add(mavenDependencies);
		}
		try {
			anJavaProject.setRawClasspath(classEntries.toArray(new IClasspathEntry[classEntries.size()]), monitor);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void Copy_Image(String source,String name, String target) {
		
		try {
			IFolder imagesFolder = project.getFolder(target);
			FileInputStream fileStream = new FileInputStream(source);
			IFile new_fil = imagesFolder.getFile(name);
			if (new_fil.exists() == false)
				new_fil.create(fileStream, false, null);			
		} catch (FileNotFoundException | CoreException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT_NAME:
				return getProjectName();
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT:
				return getProject();
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_PLUGIN:
				return getIsPlugin();
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__MONITOR:
				return getMonitor();
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_MAVEN_PROJECT:
				return getIsMavenProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT:
				setProject((IProject)newValue);
				return;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_PLUGIN:
				setIsPlugin((Boolean)newValue);
				return;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__MONITOR:
				setMonitor((IProgressMonitor)newValue);
				return;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_MAVEN_PROJECT:
				setIsMavenProject((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_PLUGIN:
				setIsPlugin(IS_PLUGIN_EDEFAULT);
				return;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__MONITOR:
				setMonitor(MONITOR_EDEFAULT);
				return;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_MAVEN_PROJECT:
				setIsMavenProject(IS_MAVEN_PROJECT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_PLUGIN:
				return IS_PLUGIN_EDEFAULT == null ? isPlugin != null : !IS_PLUGIN_EDEFAULT.equals(isPlugin);
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__MONITOR:
				return MONITOR_EDEFAULT == null ? monitor != null : !MONITOR_EDEFAULT.equals(monitor);
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT__IS_MAVEN_PROJECT:
				return IS_MAVEN_PROJECT_EDEFAULT == null ? isMavenProject != null : !IS_MAVEN_PROJECT_EDEFAULT.equals(isMavenProject);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT___CREATE_FOLDER__STRING:
				CreateFolder((String)arguments.get(0));
				return null;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT___CREATE_PROJECT:
				CreateProject();
				return null;
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT___ADD_NATURE_TO_PROJECT__ELIST_IPROJECTDESCRIPTION:
				return AddNatureToProject((EList<String>)arguments.get(0), (IProjectDescription)arguments.get(1));
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT___CREATE_JAVA_PACKAGES__IJAVAPROJECT_STRING:
				return CreateJavaPackages((IJavaProject)arguments.get(0), (String)arguments.get(1));
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT___CREATE_SRC_CLASSPATH__IJAVAPROJECT_IPROGRESSMONITOR_ELIST:
				return Create_Src_Classpath((IJavaProject)arguments.get(0), (IProgressMonitor)arguments.get(1), (EList<IClasspathEntry>)arguments.get(2));
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT___COPY_IMAGE__STRING_STRING_STRING:
				Copy_Image((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ProjectName: ");
		result.append(projectName);
		result.append(", project: ");
		result.append(project);
		result.append(", isPlugin: ");
		result.append(isPlugin);
		result.append(", monitor: ");
		result.append(monitor);
		result.append(", isMavenProject: ");
		result.append(isMavenProject);
		result.append(')');
		return result.toString();
	}

} //CreateEclipseProjectImpl
