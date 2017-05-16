/**
 */
package splitterLibrary;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see splitterLibrary.SplitterLibraryFactory
 * @model kind="package"
 * @generated
 */
public interface SplitterLibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "splitterLibrary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.org/splitterLibrary";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "splitterLibrary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SplitterLibraryPackage eINSTANCE = splitterLibrary.impl.SplitterLibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link splitterLibrary.impl.CreateEclipseProjectImpl <em>Create Eclipse Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see splitterLibrary.impl.CreateEclipseProjectImpl
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getCreateEclipseProject()
	 * @generated
	 */
	int CREATE_ECLIPSE_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT__PROJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Is Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT__IS_PLUGIN = 2;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT__MONITOR = 3;

	/**
	 * The feature id for the '<em><b>Is Maven Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT__IS_MAVEN_PROJECT = 4;

	/**
	 * The number of structural features of the '<em>Create Eclipse Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Create Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT___CREATE_FOLDER__STRING = 0;

	/**
	 * The operation id for the '<em>Create Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT___CREATE_PROJECT = 1;

	/**
	 * The operation id for the '<em>Add Nature To Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT___ADD_NATURE_TO_PROJECT__ELIST_IPROJECTDESCRIPTION = 2;

	/**
	 * The operation id for the '<em>Create Java Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT___CREATE_JAVA_PACKAGES__IJAVAPROJECT_STRING = 3;

	/**
	 * The operation id for the '<em>Create Src Classpath</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT___CREATE_SRC_CLASSPATH__IJAVAPROJECT_IPROGRESSMONITOR_ELIST = 4;

	/**
	 * The operation id for the '<em>Copy Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT___COPY_IMAGE__STRING_STRING_STRING = 5;

	/**
	 * The number of operations of the '<em>Create Eclipse Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ECLIPSE_PROJECT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link splitterLibrary.impl.GenModelEMFImpl <em>Gen Model EMF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see splitterLibrary.impl.GenModelEMFImpl
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getGenModelEMF()
	 * @generated
	 */
	int GEN_MODEL_EMF = 1;

	/**
	 * The feature id for the '<em><b>Model code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF__MODEL_CODE = 0;

	/**
	 * The feature id for the '<em><b>Edit code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF__EDIT_CODE = 1;

	/**
	 * The feature id for the '<em><b>Editor code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF__EDITOR_CODE = 2;

	/**
	 * The feature id for the '<em><b>Contain proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF__CONTAIN_PROXIES = 3;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF__GEN_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Nemf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF__NEMF = 5;

	/**
	 * The number of structural features of the '<em>Gen Model EMF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Create Gen Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF___CREATE_GEN_MODEL = 0;

	/**
	 * The operation id for the '<em>Get Filepath</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF___GET_FILEPATH = 1;

	/**
	 * The number of operations of the '<em>Gen Model EMF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_EMF_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link splitterLibrary.impl.EcoreEMFImpl <em>Ecore EMF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see splitterLibrary.impl.EcoreEMFImpl
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getEcoreEMF()
	 * @generated
	 */
	int ECORE_EMF = 2;

	/**
	 * The feature id for the '<em><b>Fileuri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF__FILEURI = 0;

	/**
	 * The feature id for the '<em><b>List classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF__LIST_CLASSES = 1;

	/**
	 * The feature id for the '<em><b>Pack Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF__PACK_METAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF__RES = 3;

	/**
	 * The feature id for the '<em><b>Rs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF__RS = 4;

	/**
	 * The number of structural features of the '<em>Ecore EMF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF___GET_ROOT = 0;

	/**
	 * The operation id for the '<em>Get IFile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF___GET_IFILE = 1;

	/**
	 * The operation id for the '<em>Get Root Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF___GET_ROOT_PACKAGE = 2;

	/**
	 * The operation id for the '<em>Get Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF___GET_CLASSIFIERS = 3;

	/**
	 * The operation id for the '<em>Set Packageby Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF___SET_PACKAGEBY_NAME__STRING = 4;

	/**
	 * The number of operations of the '<em>Ecore EMF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_EMF_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link splitterLibrary.impl.DTProjectDescriptionImpl <em>DT Project Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see splitterLibrary.impl.DTProjectDescriptionImpl
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTProjectDescription()
	 * @generated
	 */
	int DT_PROJECT_DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>DT Project Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_PROJECT_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DT Project Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_PROJECT_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link splitterLibrary.impl.ArrayIndexComparatorImpl <em>Array Index Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see splitterLibrary.impl.ArrayIndexComparatorImpl
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getArrayIndexComparator()
	 * @generated
	 */
	int ARRAY_INDEX_COMPARATOR = 4;

	/**
	 * The meta object id for the '{@link java.util.Comparator <em>Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Comparator
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 5;

	/**
	 * The number of structural features of the '<em>Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEX_COMPARATOR__ARRAY = COMPARATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Index Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEX_COMPARATOR_FEATURE_COUNT = COMPARATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Index Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEX_COMPARATOR___CREATE_INDEX_ARRAY__ELIST = COMPARATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Array Index Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEX_COMPARATOR_OPERATION_COUNT = COMPARATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>DT Project</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTProject()
	 * @generated
	 */
	int DT_PROJECT = 6;

	/**
	 * The meta object id for the '<em>DTI Progress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTIProgressMonitor()
	 * @generated
	 */
	int DTI_PROGRESS_MONITOR = 7;

	/**
	 * The meta object id for the '<em>DT Gen Model</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenModel
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTGenModel()
	 * @generated
	 */
	int DT_GEN_MODEL = 8;


	/**
	 * The meta object id for the '<em>DTI File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTIFile()
	 * @generated
	 */
	int DTI_FILE = 9;


	/**
	 * The meta object id for the '<em>DT Java Project</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jdt.core.IJavaProject
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTJavaProject()
	 * @generated
	 */
	int DT_JAVA_PROJECT = 10;


	/**
	 * The meta object id for the '<em>DTI Package Fragment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jdt.core.IPackageFragment
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTIPackageFragment()
	 * @generated
	 */
	int DTI_PACKAGE_FRAGMENT = 11;


	/**
	 * The meta object id for the '<em>DTI Classpath Entry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jdt.core.IClasspathEntry
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTIClasspathEntry()
	 * @generated
	 */
	int DTI_CLASSPATH_ENTRY = 12;


	/**
	 * The meta object id for the '<em>DT Resource Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTResourceSet()
	 * @generated
	 */
	int DT_RESOURCE_SET = 13;


	/**
	 * The meta object id for the '<em>DT Resource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTResource()
	 * @generated
	 */
	int DT_RESOURCE = 14;


	/**
	 * Returns the meta object for class '{@link splitterLibrary.CreateEclipseProject <em>Create Eclipse Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Eclipse Project</em>'.
	 * @see splitterLibrary.CreateEclipseProject
	 * @generated
	 */
	EClass getCreateEclipseProject();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.CreateEclipseProject#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see splitterLibrary.CreateEclipseProject#getProjectName()
	 * @see #getCreateEclipseProject()
	 * @generated
	 */
	EAttribute getCreateEclipseProject_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.CreateEclipseProject#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see splitterLibrary.CreateEclipseProject#getProject()
	 * @see #getCreateEclipseProject()
	 * @generated
	 */
	EAttribute getCreateEclipseProject_Project();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.CreateEclipseProject#getIsPlugin <em>Is Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Plugin</em>'.
	 * @see splitterLibrary.CreateEclipseProject#getIsPlugin()
	 * @see #getCreateEclipseProject()
	 * @generated
	 */
	EAttribute getCreateEclipseProject_IsPlugin();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.CreateEclipseProject#getMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor</em>'.
	 * @see splitterLibrary.CreateEclipseProject#getMonitor()
	 * @see #getCreateEclipseProject()
	 * @generated
	 */
	EAttribute getCreateEclipseProject_Monitor();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.CreateEclipseProject#getIsMavenProject <em>Is Maven Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Maven Project</em>'.
	 * @see splitterLibrary.CreateEclipseProject#getIsMavenProject()
	 * @see #getCreateEclipseProject()
	 * @generated
	 */
	EAttribute getCreateEclipseProject_IsMavenProject();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.CreateEclipseProject#CreateFolder(java.lang.String) <em>Create Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Folder</em>' operation.
	 * @see splitterLibrary.CreateEclipseProject#CreateFolder(java.lang.String)
	 * @generated
	 */
	EOperation getCreateEclipseProject__CreateFolder__String();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.CreateEclipseProject#CreateProject() <em>Create Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Project</em>' operation.
	 * @see splitterLibrary.CreateEclipseProject#CreateProject()
	 * @generated
	 */
	EOperation getCreateEclipseProject__CreateProject();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.CreateEclipseProject#AddNatureToProject(org.eclipse.emf.common.util.EList, org.eclipse.core.resources.IProjectDescription) <em>Add Nature To Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Nature To Project</em>' operation.
	 * @see splitterLibrary.CreateEclipseProject#AddNatureToProject(org.eclipse.emf.common.util.EList, org.eclipse.core.resources.IProjectDescription)
	 * @generated
	 */
	EOperation getCreateEclipseProject__AddNatureToProject__EList_IProjectDescription();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.CreateEclipseProject#CreateJavaPackages(org.eclipse.jdt.core.IJavaProject, java.lang.String) <em>Create Java Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Java Packages</em>' operation.
	 * @see splitterLibrary.CreateEclipseProject#CreateJavaPackages(org.eclipse.jdt.core.IJavaProject, java.lang.String)
	 * @generated
	 */
	EOperation getCreateEclipseProject__CreateJavaPackages__IJavaProject_String();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.CreateEclipseProject#Create_Src_Classpath(org.eclipse.jdt.core.IJavaProject, org.eclipse.core.runtime.IProgressMonitor, org.eclipse.emf.common.util.EList) <em>Create Src Classpath</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Src Classpath</em>' operation.
	 * @see splitterLibrary.CreateEclipseProject#Create_Src_Classpath(org.eclipse.jdt.core.IJavaProject, org.eclipse.core.runtime.IProgressMonitor, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCreateEclipseProject__Create_Src_Classpath__IJavaProject_IProgressMonitor_EList();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.CreateEclipseProject#Copy_Image(java.lang.String, java.lang.String, java.lang.String) <em>Copy Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Image</em>' operation.
	 * @see splitterLibrary.CreateEclipseProject#Copy_Image(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCreateEclipseProject__Copy_Image__String_String_String();

	/**
	 * Returns the meta object for class '{@link splitterLibrary.GenModelEMF <em>Gen Model EMF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Model EMF</em>'.
	 * @see splitterLibrary.GenModelEMF
	 * @generated
	 */
	EClass getGenModelEMF();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.GenModelEMF#getModel_code <em>Model code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model code</em>'.
	 * @see splitterLibrary.GenModelEMF#getModel_code()
	 * @see #getGenModelEMF()
	 * @generated
	 */
	EAttribute getGenModelEMF_Model_code();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.GenModelEMF#getEdit_code <em>Edit code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit code</em>'.
	 * @see splitterLibrary.GenModelEMF#getEdit_code()
	 * @see #getGenModelEMF()
	 * @generated
	 */
	EAttribute getGenModelEMF_Edit_code();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.GenModelEMF#getEditor_code <em>Editor code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor code</em>'.
	 * @see splitterLibrary.GenModelEMF#getEditor_code()
	 * @see #getGenModelEMF()
	 * @generated
	 */
	EAttribute getGenModelEMF_Editor_code();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.GenModelEMF#getContain_proxies <em>Contain proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contain proxies</em>'.
	 * @see splitterLibrary.GenModelEMF#getContain_proxies()
	 * @see #getGenModelEMF()
	 * @generated
	 */
	EAttribute getGenModelEMF_Contain_proxies();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.GenModelEMF#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Model</em>'.
	 * @see splitterLibrary.GenModelEMF#getGenModel()
	 * @see #getGenModelEMF()
	 * @generated
	 */
	EAttribute getGenModelEMF_GenModel();

	/**
	 * Returns the meta object for the reference '{@link splitterLibrary.GenModelEMF#getNemf <em>Nemf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nemf</em>'.
	 * @see splitterLibrary.GenModelEMF#getNemf()
	 * @see #getGenModelEMF()
	 * @generated
	 */
	EReference getGenModelEMF_Nemf();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.GenModelEMF#CreateGenModel() <em>Create Gen Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Model</em>' operation.
	 * @see splitterLibrary.GenModelEMF#CreateGenModel()
	 * @generated
	 */
	EOperation getGenModelEMF__CreateGenModel();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.GenModelEMF#getFilepath() <em>Get Filepath</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Filepath</em>' operation.
	 * @see splitterLibrary.GenModelEMF#getFilepath()
	 * @generated
	 */
	EOperation getGenModelEMF__GetFilepath();

	/**
	 * Returns the meta object for class '{@link splitterLibrary.EcoreEMF <em>Ecore EMF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore EMF</em>'.
	 * @see splitterLibrary.EcoreEMF
	 * @generated
	 */
	EClass getEcoreEMF();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.EcoreEMF#getFileuri <em>Fileuri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fileuri</em>'.
	 * @see splitterLibrary.EcoreEMF#getFileuri()
	 * @see #getEcoreEMF()
	 * @generated
	 */
	EAttribute getEcoreEMF_Fileuri();

	/**
	 * Returns the meta object for the reference list '{@link splitterLibrary.EcoreEMF#getList_classes <em>List classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List classes</em>'.
	 * @see splitterLibrary.EcoreEMF#getList_classes()
	 * @see #getEcoreEMF()
	 * @generated
	 */
	EReference getEcoreEMF_List_classes();

	/**
	 * Returns the meta object for the reference '{@link splitterLibrary.EcoreEMF#getPackMetamodel <em>Pack Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pack Metamodel</em>'.
	 * @see splitterLibrary.EcoreEMF#getPackMetamodel()
	 * @see #getEcoreEMF()
	 * @generated
	 */
	EReference getEcoreEMF_PackMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.EcoreEMF#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res</em>'.
	 * @see splitterLibrary.EcoreEMF#getRes()
	 * @see #getEcoreEMF()
	 * @generated
	 */
	EAttribute getEcoreEMF_Res();

	/**
	 * Returns the meta object for the attribute '{@link splitterLibrary.EcoreEMF#getRs <em>Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rs</em>'.
	 * @see splitterLibrary.EcoreEMF#getRs()
	 * @see #getEcoreEMF()
	 * @generated
	 */
	EAttribute getEcoreEMF_Rs();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.EcoreEMF#GetRoot() <em>Get Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root</em>' operation.
	 * @see splitterLibrary.EcoreEMF#GetRoot()
	 * @generated
	 */
	EOperation getEcoreEMF__GetRoot();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.EcoreEMF#GetIFile() <em>Get IFile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get IFile</em>' operation.
	 * @see splitterLibrary.EcoreEMF#GetIFile()
	 * @generated
	 */
	EOperation getEcoreEMF__GetIFile();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.EcoreEMF#GetRootPackage() <em>Get Root Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Package</em>' operation.
	 * @see splitterLibrary.EcoreEMF#GetRootPackage()
	 * @generated
	 */
	EOperation getEcoreEMF__GetRootPackage();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.EcoreEMF#GetClassifiers() <em>Get Classifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Classifiers</em>' operation.
	 * @see splitterLibrary.EcoreEMF#GetClassifiers()
	 * @generated
	 */
	EOperation getEcoreEMF__GetClassifiers();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.EcoreEMF#setPackagebyName(java.lang.String) <em>Set Packageby Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Packageby Name</em>' operation.
	 * @see splitterLibrary.EcoreEMF#setPackagebyName(java.lang.String)
	 * @generated
	 */
	EOperation getEcoreEMF__SetPackagebyName__String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.core.resources.IProjectDescription <em>DT Project Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT Project Description</em>'.
	 * @see org.eclipse.core.resources.IProjectDescription
	 * @model instanceClass="org.eclipse.core.resources.IProjectDescription"
	 * @generated
	 */
	EClass getDTProjectDescription();

	/**
	 * Returns the meta object for class '{@link splitterLibrary.ArrayIndexComparator <em>Array Index Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Index Comparator</em>'.
	 * @see splitterLibrary.ArrayIndexComparator
	 * @generated
	 */
	EClass getArrayIndexComparator();

	/**
	 * Returns the meta object for the attribute list '{@link splitterLibrary.ArrayIndexComparator#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array</em>'.
	 * @see splitterLibrary.ArrayIndexComparator#getArray()
	 * @see #getArrayIndexComparator()
	 * @generated
	 */
	EAttribute getArrayIndexComparator_Array();

	/**
	 * Returns the meta object for the '{@link splitterLibrary.ArrayIndexComparator#createIndexArray(org.eclipse.emf.common.util.EList) <em>Create Index Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Index Array</em>' operation.
	 * @see splitterLibrary.ArrayIndexComparator#createIndexArray(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getArrayIndexComparator__CreateIndexArray__EList();

	/**
	 * Returns the meta object for class '{@link java.util.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparator</em>'.
	 * @see java.util.Comparator
	 * @model instanceClass="java.util.Comparator" typeParameters="Integer"
	 * @generated
	 */
	EClass getComparator();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>DT Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DT Project</em>'.
	 * @see org.eclipse.core.resources.IProject
	 * @model instanceClass="org.eclipse.core.resources.IProject"
	 * @generated
	 */
	EDataType getDTProject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>DTI Progress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DTI Progress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getDTIProgressMonitor();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel <em>DT Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DT Gen Model</em>'.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenModel
	 * @model instanceClass="org.eclipse.emf.codegen.ecore.genmodel.GenModel"
	 * @generated
	 */
	EDataType getDTGenModel();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>DTI File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DTI File</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile"
	 * @generated
	 */
	EDataType getDTIFile();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jdt.core.IJavaProject <em>DT Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DT Java Project</em>'.
	 * @see org.eclipse.jdt.core.IJavaProject
	 * @model instanceClass="org.eclipse.jdt.core.IJavaProject"
	 * @generated
	 */
	EDataType getDTJavaProject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jdt.core.IPackageFragment <em>DTI Package Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DTI Package Fragment</em>'.
	 * @see org.eclipse.jdt.core.IPackageFragment
	 * @model instanceClass="org.eclipse.jdt.core.IPackageFragment"
	 * @generated
	 */
	EDataType getDTIPackageFragment();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jdt.core.IClasspathEntry <em>DTI Classpath Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DTI Classpath Entry</em>'.
	 * @see org.eclipse.jdt.core.IClasspathEntry
	 * @model instanceClass="org.eclipse.jdt.core.IClasspathEntry"
	 * @generated
	 */
	EDataType getDTIClasspathEntry();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.ResourceSet <em>DT Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DT Resource Set</em>'.
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @model instanceClass="org.eclipse.emf.ecore.resource.ResourceSet"
	 * @generated
	 */
	EDataType getDTResourceSet();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>DT Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DT Resource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource"
	 * @generated
	 */
	EDataType getDTResource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SplitterLibraryFactory getSplitterLibraryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link splitterLibrary.impl.CreateEclipseProjectImpl <em>Create Eclipse Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see splitterLibrary.impl.CreateEclipseProjectImpl
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getCreateEclipseProject()
		 * @generated
		 */
		EClass CREATE_ECLIPSE_PROJECT = eINSTANCE.getCreateEclipseProject();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ECLIPSE_PROJECT__PROJECT_NAME = eINSTANCE.getCreateEclipseProject_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ECLIPSE_PROJECT__PROJECT = eINSTANCE.getCreateEclipseProject_Project();

		/**
		 * The meta object literal for the '<em><b>Is Plugin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ECLIPSE_PROJECT__IS_PLUGIN = eINSTANCE.getCreateEclipseProject_IsPlugin();

		/**
		 * The meta object literal for the '<em><b>Monitor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ECLIPSE_PROJECT__MONITOR = eINSTANCE.getCreateEclipseProject_Monitor();

		/**
		 * The meta object literal for the '<em><b>Is Maven Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ECLIPSE_PROJECT__IS_MAVEN_PROJECT = eINSTANCE.getCreateEclipseProject_IsMavenProject();

		/**
		 * The meta object literal for the '<em><b>Create Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_ECLIPSE_PROJECT___CREATE_FOLDER__STRING = eINSTANCE.getCreateEclipseProject__CreateFolder__String();

		/**
		 * The meta object literal for the '<em><b>Create Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_ECLIPSE_PROJECT___CREATE_PROJECT = eINSTANCE.getCreateEclipseProject__CreateProject();

		/**
		 * The meta object literal for the '<em><b>Add Nature To Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_ECLIPSE_PROJECT___ADD_NATURE_TO_PROJECT__ELIST_IPROJECTDESCRIPTION = eINSTANCE.getCreateEclipseProject__AddNatureToProject__EList_IProjectDescription();

		/**
		 * The meta object literal for the '<em><b>Create Java Packages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_ECLIPSE_PROJECT___CREATE_JAVA_PACKAGES__IJAVAPROJECT_STRING = eINSTANCE.getCreateEclipseProject__CreateJavaPackages__IJavaProject_String();

		/**
		 * The meta object literal for the '<em><b>Create Src Classpath</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_ECLIPSE_PROJECT___CREATE_SRC_CLASSPATH__IJAVAPROJECT_IPROGRESSMONITOR_ELIST = eINSTANCE.getCreateEclipseProject__Create_Src_Classpath__IJavaProject_IProgressMonitor_EList();

		/**
		 * The meta object literal for the '<em><b>Copy Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_ECLIPSE_PROJECT___COPY_IMAGE__STRING_STRING_STRING = eINSTANCE.getCreateEclipseProject__Copy_Image__String_String_String();

		/**
		 * The meta object literal for the '{@link splitterLibrary.impl.GenModelEMFImpl <em>Gen Model EMF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see splitterLibrary.impl.GenModelEMFImpl
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getGenModelEMF()
		 * @generated
		 */
		EClass GEN_MODEL_EMF = eINSTANCE.getGenModelEMF();

		/**
		 * The meta object literal for the '<em><b>Model code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_MODEL_EMF__MODEL_CODE = eINSTANCE.getGenModelEMF_Model_code();

		/**
		 * The meta object literal for the '<em><b>Edit code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_MODEL_EMF__EDIT_CODE = eINSTANCE.getGenModelEMF_Edit_code();

		/**
		 * The meta object literal for the '<em><b>Editor code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_MODEL_EMF__EDITOR_CODE = eINSTANCE.getGenModelEMF_Editor_code();

		/**
		 * The meta object literal for the '<em><b>Contain proxies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_MODEL_EMF__CONTAIN_PROXIES = eINSTANCE.getGenModelEMF_Contain_proxies();

		/**
		 * The meta object literal for the '<em><b>Gen Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_MODEL_EMF__GEN_MODEL = eINSTANCE.getGenModelEMF_GenModel();

		/**
		 * The meta object literal for the '<em><b>Nemf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MODEL_EMF__NEMF = eINSTANCE.getGenModelEMF_Nemf();

		/**
		 * The meta object literal for the '<em><b>Create Gen Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_MODEL_EMF___CREATE_GEN_MODEL = eINSTANCE.getGenModelEMF__CreateGenModel();

		/**
		 * The meta object literal for the '<em><b>Get Filepath</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_MODEL_EMF___GET_FILEPATH = eINSTANCE.getGenModelEMF__GetFilepath();

		/**
		 * The meta object literal for the '{@link splitterLibrary.impl.EcoreEMFImpl <em>Ecore EMF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see splitterLibrary.impl.EcoreEMFImpl
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getEcoreEMF()
		 * @generated
		 */
		EClass ECORE_EMF = eINSTANCE.getEcoreEMF();

		/**
		 * The meta object literal for the '<em><b>Fileuri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_EMF__FILEURI = eINSTANCE.getEcoreEMF_Fileuri();

		/**
		 * The meta object literal for the '<em><b>List classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_EMF__LIST_CLASSES = eINSTANCE.getEcoreEMF_List_classes();

		/**
		 * The meta object literal for the '<em><b>Pack Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_EMF__PACK_METAMODEL = eINSTANCE.getEcoreEMF_PackMetamodel();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_EMF__RES = eINSTANCE.getEcoreEMF_Res();

		/**
		 * The meta object literal for the '<em><b>Rs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_EMF__RS = eINSTANCE.getEcoreEMF_Rs();

		/**
		 * The meta object literal for the '<em><b>Get Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_EMF___GET_ROOT = eINSTANCE.getEcoreEMF__GetRoot();

		/**
		 * The meta object literal for the '<em><b>Get IFile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_EMF___GET_IFILE = eINSTANCE.getEcoreEMF__GetIFile();

		/**
		 * The meta object literal for the '<em><b>Get Root Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_EMF___GET_ROOT_PACKAGE = eINSTANCE.getEcoreEMF__GetRootPackage();

		/**
		 * The meta object literal for the '<em><b>Get Classifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_EMF___GET_CLASSIFIERS = eINSTANCE.getEcoreEMF__GetClassifiers();

		/**
		 * The meta object literal for the '<em><b>Set Packageby Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_EMF___SET_PACKAGEBY_NAME__STRING = eINSTANCE.getEcoreEMF__SetPackagebyName__String();

		/**
		 * The meta object literal for the '{@link splitterLibrary.impl.DTProjectDescriptionImpl <em>DT Project Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see splitterLibrary.impl.DTProjectDescriptionImpl
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTProjectDescription()
		 * @generated
		 */
		EClass DT_PROJECT_DESCRIPTION = eINSTANCE.getDTProjectDescription();

		/**
		 * The meta object literal for the '{@link splitterLibrary.impl.ArrayIndexComparatorImpl <em>Array Index Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see splitterLibrary.impl.ArrayIndexComparatorImpl
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getArrayIndexComparator()
		 * @generated
		 */
		EClass ARRAY_INDEX_COMPARATOR = eINSTANCE.getArrayIndexComparator();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_INDEX_COMPARATOR__ARRAY = eINSTANCE.getArrayIndexComparator_Array();

		/**
		 * The meta object literal for the '<em><b>Create Index Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARRAY_INDEX_COMPARATOR___CREATE_INDEX_ARRAY__ELIST = eINSTANCE.getArrayIndexComparator__CreateIndexArray__EList();

		/**
		 * The meta object literal for the '{@link java.util.Comparator <em>Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Comparator
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getComparator()
		 * @generated
		 */
		EClass COMPARATOR = eINSTANCE.getComparator();

		/**
		 * The meta object literal for the '<em>DT Project</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTProject()
		 * @generated
		 */
		EDataType DT_PROJECT = eINSTANCE.getDTProject();

		/**
		 * The meta object literal for the '<em>DTI Progress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTIProgressMonitor()
		 * @generated
		 */
		EDataType DTI_PROGRESS_MONITOR = eINSTANCE.getDTIProgressMonitor();

		/**
		 * The meta object literal for the '<em>DT Gen Model</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.codegen.ecore.genmodel.GenModel
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTGenModel()
		 * @generated
		 */
		EDataType DT_GEN_MODEL = eINSTANCE.getDTGenModel();

		/**
		 * The meta object literal for the '<em>DTI File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTIFile()
		 * @generated
		 */
		EDataType DTI_FILE = eINSTANCE.getDTIFile();

		/**
		 * The meta object literal for the '<em>DT Java Project</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jdt.core.IJavaProject
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTJavaProject()
		 * @generated
		 */
		EDataType DT_JAVA_PROJECT = eINSTANCE.getDTJavaProject();

		/**
		 * The meta object literal for the '<em>DTI Package Fragment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jdt.core.IPackageFragment
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTIPackageFragment()
		 * @generated
		 */
		EDataType DTI_PACKAGE_FRAGMENT = eINSTANCE.getDTIPackageFragment();

		/**
		 * The meta object literal for the '<em>DTI Classpath Entry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jdt.core.IClasspathEntry
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTIClasspathEntry()
		 * @generated
		 */
		EDataType DTI_CLASSPATH_ENTRY = eINSTANCE.getDTIClasspathEntry();

		/**
		 * The meta object literal for the '<em>DT Resource Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.ResourceSet
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTResourceSet()
		 * @generated
		 */
		EDataType DT_RESOURCE_SET = eINSTANCE.getDTResourceSet();

		/**
		 * The meta object literal for the '<em>DT Resource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see splitterLibrary.impl.SplitterLibraryPackageImpl#getDTResource()
		 * @generated
		 */
		EDataType DT_RESOURCE = eINSTANCE.getDTResource();

	}

} //SplitterLibraryPackage
