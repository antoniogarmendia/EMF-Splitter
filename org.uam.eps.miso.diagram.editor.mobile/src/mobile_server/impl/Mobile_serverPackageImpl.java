/**
 */
package mobile_server.impl;

import mobile_server.EcoreMD;
import mobile_server.JSONMobile;
import mobile_server.Mobile_serverFactory;
import mobile_server.Mobile_serverPackage;
import mobile_server.Palette;
import mobile_server.diagram_editor.Diagram_editorPackage;
import mobile_server.diagram_editor.impl.Diagram_editorPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mobile_serverPackageImpl extends EPackageImpl implements Mobile_serverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreMDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonMobileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paletteEClass = null;

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
	 * @see mobile_server.Mobile_serverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mobile_serverPackageImpl() {
		super(eNS_URI, Mobile_serverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Mobile_serverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mobile_serverPackage init() {
		if (isInited) return (Mobile_serverPackage)EPackage.Registry.INSTANCE.getEPackage(Mobile_serverPackage.eNS_URI);

		// Obtain or create and register package
		Mobile_serverPackageImpl theMobile_serverPackage = (Mobile_serverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Mobile_serverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Mobile_serverPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Diagram_editorPackageImpl theDiagram_editorPackage = (Diagram_editorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Diagram_editorPackage.eNS_URI) instanceof Diagram_editorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Diagram_editorPackage.eNS_URI) : Diagram_editorPackage.eINSTANCE);

		// Create package meta-data objects
		theMobile_serverPackage.createPackageContents();
		theDiagram_editorPackage.createPackageContents();

		// Initialize created meta-data
		theMobile_serverPackage.initializePackageContents();
		theDiagram_editorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMobile_serverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Mobile_serverPackage.eNS_URI, theMobile_serverPackage);
		return theMobile_serverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreMD() {
		return ecoreMDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreMD_Name() {
		return (EAttribute)ecoreMDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreMD_Content() {
		return (EAttribute)ecoreMDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreMD_Uri() {
		return (EAttribute)ecoreMDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoreMD_ListPalette() {
		return (EReference)ecoreMDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONMobile() {
		return jsonMobileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSONMobile_ListEcores() {
		return (EReference)jsonMobileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPalette() {
		return paletteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_Name() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_Content() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_Version() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_EcoreURI() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_Extension() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobile_serverFactory getMobile_serverFactory() {
		return (Mobile_serverFactory)getEFactoryInstance();
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
		ecoreMDEClass = createEClass(ECORE_MD);
		createEAttribute(ecoreMDEClass, ECORE_MD__NAME);
		createEAttribute(ecoreMDEClass, ECORE_MD__CONTENT);
		createEAttribute(ecoreMDEClass, ECORE_MD__URI);
		createEReference(ecoreMDEClass, ECORE_MD__LIST_PALETTE);

		jsonMobileEClass = createEClass(JSON_MOBILE);
		createEReference(jsonMobileEClass, JSON_MOBILE__LIST_ECORES);

		paletteEClass = createEClass(PALETTE);
		createEAttribute(paletteEClass, PALETTE__NAME);
		createEAttribute(paletteEClass, PALETTE__CONTENT);
		createEAttribute(paletteEClass, PALETTE__VERSION);
		createEAttribute(paletteEClass, PALETTE__ECORE_URI);
		createEAttribute(paletteEClass, PALETTE__EXTENSION);
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

		// Obtain other dependent packages
		Diagram_editorPackage theDiagram_editorPackage = (Diagram_editorPackage)EPackage.Registry.INSTANCE.getEPackage(Diagram_editorPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDiagram_editorPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ecoreMDEClass, EcoreMD.class, "EcoreMD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcoreMD_Name(), ecorePackage.getEString(), "name", null, 0, 1, EcoreMD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreMD_Content(), ecorePackage.getEString(), "content", null, 0, 1, EcoreMD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreMD_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, EcoreMD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcoreMD_ListPalette(), this.getPalette(), null, "listPalette", null, 0, -1, EcoreMD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonMobileEClass, JSONMobile.class, "JSONMobile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJSONMobile_ListEcores(), this.getEcoreMD(), null, "listEcores", null, 0, -1, JSONMobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paletteEClass, Palette.class, "Palette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPalette_Name(), ecorePackage.getEString(), "name", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_Content(), ecorePackage.getEString(), "content", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_Version(), ecorePackage.getELong(), "version", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_EcoreURI(), ecorePackage.getEString(), "ecoreURI", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Mobile_serverPackageImpl
