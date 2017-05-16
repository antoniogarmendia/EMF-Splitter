/**
 */
package splitterLibrary.impl;

import java.util.Comparator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import splitterLibrary.ArrayIndexComparator;
import splitterLibrary.CreateEclipseProject;
import splitterLibrary.EcoreEMF;
import splitterLibrary.GenModelEMF;
import splitterLibrary.SplitterLibraryFactory;
import splitterLibrary.SplitterLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplitterLibraryPackageImpl extends EPackageImpl implements SplitterLibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEclipseProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genModelEMFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreEMFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtProjectDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayIndexComparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dtProjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dtiProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dtGenModelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dtiFileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dtJavaProjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dtiPackageFragmentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dtiClasspathEntryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dtResourceSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dtResourceEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see splitterLibrary.SplitterLibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SplitterLibraryPackageImpl() {
		super(eNS_URI, SplitterLibraryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SplitterLibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SplitterLibraryPackage init() {
		if (isInited) return (SplitterLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(SplitterLibraryPackage.eNS_URI);

		// Obtain or create and register package
		SplitterLibraryPackageImpl theSplitterLibraryPackage = (SplitterLibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SplitterLibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SplitterLibraryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSplitterLibraryPackage.createPackageContents();

		// Initialize created meta-data
		theSplitterLibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSplitterLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SplitterLibraryPackage.eNS_URI, theSplitterLibraryPackage);
		return theSplitterLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateEclipseProject() {
		return createEclipseProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateEclipseProject_ProjectName() {
		return (EAttribute)createEclipseProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateEclipseProject_Project() {
		return (EAttribute)createEclipseProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateEclipseProject_IsPlugin() {
		return (EAttribute)createEclipseProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateEclipseProject_Monitor() {
		return (EAttribute)createEclipseProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateEclipseProject_IsMavenProject() {
		return (EAttribute)createEclipseProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateEclipseProject__CreateFolder__String() {
		return createEclipseProjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateEclipseProject__CreateProject() {
		return createEclipseProjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateEclipseProject__AddNatureToProject__EList_IProjectDescription() {
		return createEclipseProjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateEclipseProject__CreateJavaPackages__IJavaProject_String() {
		return createEclipseProjectEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateEclipseProject__Create_Src_Classpath__IJavaProject_IProgressMonitor_EList() {
		return createEclipseProjectEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateEclipseProject__Copy_Image__String_String_String() {
		return createEclipseProjectEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenModelEMF() {
		return genModelEMFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModelEMF_Model_code() {
		return (EAttribute)genModelEMFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModelEMF_Edit_code() {
		return (EAttribute)genModelEMFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModelEMF_Editor_code() {
		return (EAttribute)genModelEMFEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModelEMF_Contain_proxies() {
		return (EAttribute)genModelEMFEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenModelEMF_GenModel() {
		return (EAttribute)genModelEMFEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenModelEMF_Nemf() {
		return (EReference)genModelEMFEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenModelEMF__CreateGenModel() {
		return genModelEMFEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenModelEMF__GetFilepath() {
		return genModelEMFEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreEMF() {
		return ecoreEMFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreEMF_Fileuri() {
		return (EAttribute)ecoreEMFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoreEMF_List_classes() {
		return (EReference)ecoreEMFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoreEMF_PackMetamodel() {
		return (EReference)ecoreEMFEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreEMF_Res() {
		return (EAttribute)ecoreEMFEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreEMF_Rs() {
		return (EAttribute)ecoreEMFEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreEMF__GetRoot() {
		return ecoreEMFEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreEMF__GetIFile() {
		return ecoreEMFEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreEMF__GetRootPackage() {
		return ecoreEMFEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreEMF__GetClassifiers() {
		return ecoreEMFEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreEMF__SetPackagebyName__String() {
		return ecoreEMFEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTProjectDescription() {
		return dtProjectDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayIndexComparator() {
		return arrayIndexComparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayIndexComparator_Array() {
		return (EAttribute)arrayIndexComparatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayIndexComparator__CreateIndexArray__EList() {
		return arrayIndexComparatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparator() {
		return comparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDTProject() {
		return dtProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDTIProgressMonitor() {
		return dtiProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDTGenModel() {
		return dtGenModelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDTIFile() {
		return dtiFileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDTJavaProject() {
		return dtJavaProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDTIPackageFragment() {
		return dtiPackageFragmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDTIClasspathEntry() {
		return dtiClasspathEntryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDTResourceSet() {
		return dtResourceSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDTResource() {
		return dtResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitterLibraryFactory getSplitterLibraryFactory() {
		return (SplitterLibraryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		createEclipseProjectEClass = createEClass(CREATE_ECLIPSE_PROJECT);
		createEAttribute(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT__PROJECT_NAME);
		createEAttribute(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT__PROJECT);
		createEAttribute(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT__IS_PLUGIN);
		createEAttribute(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT__MONITOR);
		createEAttribute(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT__IS_MAVEN_PROJECT);
		createEOperation(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT___CREATE_FOLDER__STRING);
		createEOperation(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT___CREATE_PROJECT);
		createEOperation(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT___ADD_NATURE_TO_PROJECT__ELIST_IPROJECTDESCRIPTION);
		createEOperation(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT___CREATE_JAVA_PACKAGES__IJAVAPROJECT_STRING);
		createEOperation(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT___CREATE_SRC_CLASSPATH__IJAVAPROJECT_IPROGRESSMONITOR_ELIST);
		createEOperation(createEclipseProjectEClass, CREATE_ECLIPSE_PROJECT___COPY_IMAGE__STRING_STRING_STRING);

		genModelEMFEClass = createEClass(GEN_MODEL_EMF);
		createEAttribute(genModelEMFEClass, GEN_MODEL_EMF__MODEL_CODE);
		createEAttribute(genModelEMFEClass, GEN_MODEL_EMF__EDIT_CODE);
		createEAttribute(genModelEMFEClass, GEN_MODEL_EMF__EDITOR_CODE);
		createEAttribute(genModelEMFEClass, GEN_MODEL_EMF__CONTAIN_PROXIES);
		createEAttribute(genModelEMFEClass, GEN_MODEL_EMF__GEN_MODEL);
		createEReference(genModelEMFEClass, GEN_MODEL_EMF__NEMF);
		createEOperation(genModelEMFEClass, GEN_MODEL_EMF___CREATE_GEN_MODEL);
		createEOperation(genModelEMFEClass, GEN_MODEL_EMF___GET_FILEPATH);

		ecoreEMFEClass = createEClass(ECORE_EMF);
		createEAttribute(ecoreEMFEClass, ECORE_EMF__FILEURI);
		createEReference(ecoreEMFEClass, ECORE_EMF__LIST_CLASSES);
		createEReference(ecoreEMFEClass, ECORE_EMF__PACK_METAMODEL);
		createEAttribute(ecoreEMFEClass, ECORE_EMF__RES);
		createEAttribute(ecoreEMFEClass, ECORE_EMF__RS);
		createEOperation(ecoreEMFEClass, ECORE_EMF___GET_ROOT);
		createEOperation(ecoreEMFEClass, ECORE_EMF___GET_IFILE);
		createEOperation(ecoreEMFEClass, ECORE_EMF___GET_ROOT_PACKAGE);
		createEOperation(ecoreEMFEClass, ECORE_EMF___GET_CLASSIFIERS);
		createEOperation(ecoreEMFEClass, ECORE_EMF___SET_PACKAGEBY_NAME__STRING);

		dtProjectDescriptionEClass = createEClass(DT_PROJECT_DESCRIPTION);

		arrayIndexComparatorEClass = createEClass(ARRAY_INDEX_COMPARATOR);
		createEAttribute(arrayIndexComparatorEClass, ARRAY_INDEX_COMPARATOR__ARRAY);
		createEOperation(arrayIndexComparatorEClass, ARRAY_INDEX_COMPARATOR___CREATE_INDEX_ARRAY__ELIST);

		comparatorEClass = createEClass(COMPARATOR);

		// Create data types
		dtProjectEDataType = createEDataType(DT_PROJECT);
		dtiProgressMonitorEDataType = createEDataType(DTI_PROGRESS_MONITOR);
		dtGenModelEDataType = createEDataType(DT_GEN_MODEL);
		dtiFileEDataType = createEDataType(DTI_FILE);
		dtJavaProjectEDataType = createEDataType(DT_JAVA_PROJECT);
		dtiPackageFragmentEDataType = createEDataType(DTI_PACKAGE_FRAGMENT);
		dtiClasspathEntryEDataType = createEDataType(DTI_CLASSPATH_ENTRY);
		dtResourceSetEDataType = createEDataType(DT_RESOURCE_SET);
		dtResourceEDataType = createEDataType(DT_RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(comparatorEClass, "Integer");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getComparator());
		EGenericType g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		arrayIndexComparatorEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(createEclipseProjectEClass, CreateEclipseProject.class, "CreateEclipseProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateEclipseProject_ProjectName(), ecorePackage.getEString(), "ProjectName", null, 0, 1, CreateEclipseProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateEclipseProject_Project(), this.getDTProject(), "project", "null", 0, 1, CreateEclipseProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateEclipseProject_IsPlugin(), ecorePackage.getEBooleanObject(), "isPlugin", "true", 0, 1, CreateEclipseProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateEclipseProject_Monitor(), this.getDTIProgressMonitor(), "monitor", null, 0, 1, CreateEclipseProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateEclipseProject_IsMavenProject(), ecorePackage.getEBooleanObject(), "isMavenProject", null, 0, 1, CreateEclipseProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCreateEclipseProject__CreateFolder__String(), null, "CreateFolder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "foldername", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCreateEclipseProject__CreateProject(), null, "CreateProject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreateEclipseProject__AddNatureToProject__EList_IProjectDescription(), ecorePackage.getEBooleanObject(), "AddNatureToProject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "natureIds", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDTProjectDescription(), "desc", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreateEclipseProject__CreateJavaPackages__IJavaProject_String(), this.getDTIPackageFragment(), "CreateJavaPackages", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDTJavaProject(), "anJavaProject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "anPackage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreateEclipseProject__Create_Src_Classpath__IJavaProject_IProgressMonitor_EList(), ecorePackage.getEBooleanObject(), "Create_Src_Classpath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDTJavaProject(), "anJavaProject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDTIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDTIClasspathEntry(), "classEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreateEclipseProject__Copy_Image__String_String_String(), null, "Copy_Image", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genModelEMFEClass, GenModelEMF.class, "GenModelEMF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenModelEMF_Model_code(), ecorePackage.getEBooleanObject(), "model_code", "true", 0, 1, GenModelEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenModelEMF_Edit_code(), ecorePackage.getEBooleanObject(), "edit_code", "true", 0, 1, GenModelEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenModelEMF_Editor_code(), ecorePackage.getEBooleanObject(), "editor_code", "true", 0, 1, GenModelEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenModelEMF_Contain_proxies(), ecorePackage.getEBooleanObject(), "contain_proxies", "true", 0, 1, GenModelEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenModelEMF_GenModel(), this.getDTGenModel(), "genModel", null, 0, 1, GenModelEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenModelEMF_Nemf(), this.getEcoreEMF(), null, "nemf", null, 0, 1, GenModelEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGenModelEMF__CreateGenModel(), ecorePackage.getEBooleanObject(), "CreateGenModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGenModelEMF__GetFilepath(), ecorePackage.getEString(), "getFilepath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ecoreEMFEClass, EcoreEMF.class, "EcoreEMF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcoreEMF_Fileuri(), ecorePackage.getEString(), "fileuri", null, 0, 1, EcoreEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcoreEMF_List_classes(), ecorePackage.getEClass(), null, "list_classes", null, 0, -1, EcoreEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcoreEMF_PackMetamodel(), ecorePackage.getEPackage(), null, "packMetamodel", null, 0, 1, EcoreEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreEMF_Res(), this.getDTResourceSet(), "res", null, 0, 1, EcoreEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreEMF_Rs(), this.getDTResource(), "rs", null, 0, 1, EcoreEMF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEcoreEMF__GetRoot(), null, "GetRoot", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEcoreEMF__GetIFile(), this.getDTIFile(), "GetIFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEcoreEMF__GetRootPackage(), ecorePackage.getEPackage(), "GetRootPackage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcoreEMF__GetClassifiers(), null, "GetClassifiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEClassifier());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEcoreEMF__SetPackagebyName__String(), ecorePackage.getEBooleanObject(), "setPackagebyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "anpackname", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dtProjectDescriptionEClass, IProjectDescription.class, "DTProjectDescription", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayIndexComparatorEClass, ArrayIndexComparator.class, "ArrayIndexComparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayIndexComparator_Array(), ecorePackage.getEIntegerObject(), "array", null, 0, -1, ArrayIndexComparator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getArrayIndexComparator__CreateIndexArray__EList(), ecorePackage.getEIntegerObject(), "createIndexArray", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "array", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(comparatorEClass, Comparator.class, "Comparator", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(dtProjectEDataType, IProject.class, "DTProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dtiProgressMonitorEDataType, IProgressMonitor.class, "DTIProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dtGenModelEDataType, GenModel.class, "DTGenModel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dtiFileEDataType, IFile.class, "DTIFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dtJavaProjectEDataType, IJavaProject.class, "DTJavaProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dtiPackageFragmentEDataType, IPackageFragment.class, "DTIPackageFragment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dtiClasspathEntryEDataType, IClasspathEntry.class, "DTIClasspathEntry", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dtResourceSetEDataType, ResourceSet.class, "DTResourceSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dtResourceEDataType, Resource.class, "DTResource", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SplitterLibraryPackageImpl
