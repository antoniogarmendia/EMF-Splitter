/**
 */
package splitterLibrary;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Eclipse Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link splitterLibrary.CreateEclipseProject#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link splitterLibrary.CreateEclipseProject#getProject <em>Project</em>}</li>
 *   <li>{@link splitterLibrary.CreateEclipseProject#getIsPlugin <em>Is Plugin</em>}</li>
 *   <li>{@link splitterLibrary.CreateEclipseProject#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link splitterLibrary.CreateEclipseProject#getIsMavenProject <em>Is Maven Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see splitterLibrary.SplitterLibraryPackage#getCreateEclipseProject()
 * @model
 * @generated
 */
public interface CreateEclipseProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see splitterLibrary.SplitterLibraryPackage#getCreateEclipseProject_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link splitterLibrary.CreateEclipseProject#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(IProject)
	 * @see splitterLibrary.SplitterLibraryPackage#getCreateEclipseProject_Project()
	 * @model default="null" dataType="splitterLibrary.DTProject"
	 * @generated
	 */
	IProject getProject();

	/**
	 * Sets the value of the '{@link splitterLibrary.CreateEclipseProject#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(IProject value);

	/**
	 * Returns the value of the '<em><b>Is Plugin</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Plugin</em>' attribute.
	 * @see #setIsPlugin(Boolean)
	 * @see splitterLibrary.SplitterLibraryPackage#getCreateEclipseProject_IsPlugin()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIsPlugin();

	/**
	 * Sets the value of the '{@link splitterLibrary.CreateEclipseProject#getIsPlugin <em>Is Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Plugin</em>' attribute.
	 * @see #getIsPlugin()
	 * @generated
	 */
	void setIsPlugin(Boolean value);

	/**
	 * Returns the value of the '<em><b>Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor</em>' attribute.
	 * @see #setMonitor(IProgressMonitor)
	 * @see splitterLibrary.SplitterLibraryPackage#getCreateEclipseProject_Monitor()
	 * @model dataType="splitterLibrary.DTIProgressMonitor"
	 * @generated
	 */
	IProgressMonitor getMonitor();

	/**
	 * Sets the value of the '{@link splitterLibrary.CreateEclipseProject#getMonitor <em>Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor</em>' attribute.
	 * @see #getMonitor()
	 * @generated
	 */
	void setMonitor(IProgressMonitor value);

	/**
	 * Returns the value of the '<em><b>Is Maven Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Maven Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Maven Project</em>' attribute.
	 * @see #setIsMavenProject(Boolean)
	 * @see splitterLibrary.SplitterLibraryPackage#getCreateEclipseProject_IsMavenProject()
	 * @model
	 * @generated
	 */
	Boolean getIsMavenProject();

	/**
	 * Sets the value of the '{@link splitterLibrary.CreateEclipseProject#getIsMavenProject <em>Is Maven Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Maven Project</em>' attribute.
	 * @see #getIsMavenProject()
	 * @generated
	 */
	void setIsMavenProject(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CreateFolder(String foldername);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CreateProject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model natureIdsMany="true" descType="splitterLibrary.DTProjectDescription"
	 * @generated
	 */
	Boolean AddNatureToProject(EList<String> natureIds, IProjectDescription desc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="splitterLibrary.DTIPackageFragment" anJavaProjectDataType="splitterLibrary.DTJavaProject"
	 * @generated
	 */
	IPackageFragment CreateJavaPackages(IJavaProject anJavaProject, String anPackage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model anJavaProjectDataType="splitterLibrary.DTJavaProject" monitorDataType="splitterLibrary.DTIProgressMonitor" classEntriesDataType="splitterLibrary.DTIClasspathEntry" classEntriesMany="true"
	 * @generated
	 */
	Boolean Create_Src_Classpath(IJavaProject anJavaProject, IProgressMonitor monitor, EList<IClasspathEntry> classEntries);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Copy_Image(String source, String name, String target);

} // CreateEclipseProject
