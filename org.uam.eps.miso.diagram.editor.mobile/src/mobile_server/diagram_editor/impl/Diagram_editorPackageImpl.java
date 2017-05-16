/**
 */
package mobile_server.diagram_editor.impl;

import mobile_server.Mobile_serverPackage;
import mobile_server.diagram_editor.Diagram;
import mobile_server.diagram_editor.Diagram_editorFactory;
import mobile_server.diagram_editor.Diagram_editorPackage;
import mobile_server.diagram_editor.JSONDiagram;

import mobile_server.impl.Mobile_serverPackageImpl;

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
public class Diagram_editorPackageImpl extends EPackageImpl implements Diagram_editorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonDiagramEClass = null;

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
	 * @see mobile_server.diagram_editor.Diagram_editorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Diagram_editorPackageImpl() {
		super(eNS_URI, Diagram_editorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Diagram_editorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Diagram_editorPackage init() {
		if (isInited) return (Diagram_editorPackage)EPackage.Registry.INSTANCE.getEPackage(Diagram_editorPackage.eNS_URI);

		// Obtain or create and register package
		Diagram_editorPackageImpl theDiagram_editorPackage = (Diagram_editorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Diagram_editorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Diagram_editorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Mobile_serverPackageImpl theMobile_serverPackage = (Mobile_serverPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Mobile_serverPackage.eNS_URI) instanceof Mobile_serverPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Mobile_serverPackage.eNS_URI) : Mobile_serverPackage.eINSTANCE);

		// Create package meta-data objects
		theDiagram_editorPackage.createPackageContents();
		theMobile_serverPackage.createPackageContents();

		// Initialize created meta-data
		theDiagram_editorPackage.initializePackageContents();
		theMobile_serverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagram_editorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Diagram_editorPackage.eNS_URI, theDiagram_editorPackage);
		return theDiagram_editorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Name() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Date() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_PreviewImageString() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Content() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Extension() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_AnPalette() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONDiagram() {
		return jsonDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSONDiagram_List_diagrams() {
		return (EReference)jsonDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram_editorFactory getDiagram_editorFactory() {
		return (Diagram_editorFactory)getEFactoryInstance();
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
		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__NAME);
		createEAttribute(diagramEClass, DIAGRAM__DATE);
		createEAttribute(diagramEClass, DIAGRAM__PREVIEW_IMAGE_STRING);
		createEAttribute(diagramEClass, DIAGRAM__CONTENT);
		createEAttribute(diagramEClass, DIAGRAM__EXTENSION);
		createEReference(diagramEClass, DIAGRAM__AN_PALETTE);

		jsonDiagramEClass = createEClass(JSON_DIAGRAM);
		createEReference(jsonDiagramEClass, JSON_DIAGRAM__LIST_DIAGRAMS);
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
		Mobile_serverPackage theMobile_serverPackage = (Mobile_serverPackage)EPackage.Registry.INSTANCE.getEPackage(Mobile_serverPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Date(), ecorePackage.getEString(), "date", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_PreviewImageString(), ecorePackage.getEString(), "previewImageString", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Content(), ecorePackage.getEString(), "content", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_AnPalette(), theMobile_serverPackage.getPalette(), null, "anPalette", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonDiagramEClass, JSONDiagram.class, "JSONDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJSONDiagram_List_diagrams(), this.getDiagram(), null, "list_diagrams", null, 0, -1, JSONDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Diagram_editorPackageImpl
