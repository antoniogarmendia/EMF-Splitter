/**
 */
package mondoSirius;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.sirius.diagram.description.DescriptionPackage;

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
 * @see mondoSirius.MondoSiriusFactory
 * @model kind="package"
 * @generated
 */
public interface MondoSiriusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mondoSirius";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.import.mm.sirius";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mondoSirius";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MondoSiriusPackage eINSTANCE = mondoSirius.impl.MondoSiriusPackageImpl.init();

	/**
	 * The meta object id for the '{@link mondoSirius.impl.TestDiagramDescriptionImpl <em>Test Diagram Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mondoSirius.impl.TestDiagramDescriptionImpl
	 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestDiagramDescription()
	 * @generated
	 */
	int TEST_DIAGRAM_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Drop Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__DROP_DESCRIPTIONS = DescriptionPackage.DIAGRAM_DESCRIPTION__DROP_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__DOCUMENTATION = DescriptionPackage.DIAGRAM_DESCRIPTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>End User Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__END_USER_DOCUMENTATION = DescriptionPackage.DIAGRAM_DESCRIPTION__END_USER_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__NAME = DescriptionPackage.DIAGRAM_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__LABEL = DescriptionPackage.DIAGRAM_DESCRIPTION__LABEL;

	/**
	 * The feature id for the '<em><b>Title Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__TITLE_EXPRESSION = DescriptionPackage.DIAGRAM_DESCRIPTION__TITLE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__INITIALISATION = DescriptionPackage.DIAGRAM_DESCRIPTION__INITIALISATION;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__METAMODEL = DescriptionPackage.DIAGRAM_DESCRIPTION__METAMODEL;

	/**
	 * The feature id for the '<em><b>Show On Startup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__SHOW_ON_STARTUP = DescriptionPackage.DIAGRAM_DESCRIPTION__SHOW_ON_STARTUP;

	/**
	 * The feature id for the '<em><b>Paste Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__PASTE_DESCRIPTIONS = DescriptionPackage.DIAGRAM_DESCRIPTION__PASTE_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__FILTERS = DescriptionPackage.DIAGRAM_DESCRIPTION__FILTERS;

	/**
	 * The feature id for the '<em><b>All Edge Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__ALL_EDGE_MAPPINGS = DescriptionPackage.DIAGRAM_DESCRIPTION__ALL_EDGE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>All Node Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__ALL_NODE_MAPPINGS = DescriptionPackage.DIAGRAM_DESCRIPTION__ALL_NODE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>All Container Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__ALL_CONTAINER_MAPPINGS = DescriptionPackage.DIAGRAM_DESCRIPTION__ALL_CONTAINER_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Validation Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__VALIDATION_SET = DescriptionPackage.DIAGRAM_DESCRIPTION__VALIDATION_SET;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__CONCERNS = DescriptionPackage.DIAGRAM_DESCRIPTION__CONCERNS;

	/**
	 * The feature id for the '<em><b>All Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__ALL_TOOLS = DescriptionPackage.DIAGRAM_DESCRIPTION__ALL_TOOLS;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__DOMAIN_CLASS = DescriptionPackage.DIAGRAM_DESCRIPTION__DOMAIN_CLASS;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__PRECONDITION_EXPRESSION = DescriptionPackage.DIAGRAM_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Default Concern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__DEFAULT_CONCERN = DescriptionPackage.DIAGRAM_DESCRIPTION__DEFAULT_CONCERN;

	/**
	 * The feature id for the '<em><b>Root Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__ROOT_EXPRESSION = DescriptionPackage.DIAGRAM_DESCRIPTION__ROOT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Init</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__INIT = DescriptionPackage.DIAGRAM_DESCRIPTION__INIT;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__LAYOUT = DescriptionPackage.DIAGRAM_DESCRIPTION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Diagram Initialisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__DIAGRAM_INITIALISATION = DescriptionPackage.DIAGRAM_DESCRIPTION__DIAGRAM_INITIALISATION;

	/**
	 * The feature id for the '<em><b>Default Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__DEFAULT_LAYER = DescriptionPackage.DIAGRAM_DESCRIPTION__DEFAULT_LAYER;

	/**
	 * The feature id for the '<em><b>Additional Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__ADDITIONAL_LAYERS = DescriptionPackage.DIAGRAM_DESCRIPTION__ADDITIONAL_LAYERS;

	/**
	 * The feature id for the '<em><b>All Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__ALL_LAYERS = DescriptionPackage.DIAGRAM_DESCRIPTION__ALL_LAYERS;

	/**
	 * The feature id for the '<em><b>All Activated Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__ALL_ACTIVATED_TOOLS = DescriptionPackage.DIAGRAM_DESCRIPTION__ALL_ACTIVATED_TOOLS;

	/**
	 * The feature id for the '<em><b>Node Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__NODE_MAPPINGS = DescriptionPackage.DIAGRAM_DESCRIPTION__NODE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Edge Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__EDGE_MAPPINGS = DescriptionPackage.DIAGRAM_DESCRIPTION__EDGE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Edge Mapping Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__EDGE_MAPPING_IMPORTS = DescriptionPackage.DIAGRAM_DESCRIPTION__EDGE_MAPPING_IMPORTS;

	/**
	 * The feature id for the '<em><b>Container Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__CONTAINER_MAPPINGS = DescriptionPackage.DIAGRAM_DESCRIPTION__CONTAINER_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Reused Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__REUSED_MAPPINGS = DescriptionPackage.DIAGRAM_DESCRIPTION__REUSED_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Tool Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__TOOL_SECTION = DescriptionPackage.DIAGRAM_DESCRIPTION__TOOL_SECTION;

	/**
	 * The feature id for the '<em><b>Reused Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__REUSED_TOOLS = DescriptionPackage.DIAGRAM_DESCRIPTION__REUSED_TOOLS;

	/**
	 * The feature id for the '<em><b>Enable Popup Bars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__ENABLE_POPUP_BARS = DescriptionPackage.DIAGRAM_DESCRIPTION__ENABLE_POPUP_BARS;

	/**
	 * The number of structural features of the '<em>Test Diagram Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION_FEATURE_COUNT = DescriptionPackage.DIAGRAM_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEST_DIAGRAM_DESCRIPTION___CREATE_DIAGRAM = DescriptionPackage.DIAGRAM_DESCRIPTION___CREATE_DIAGRAM;

	/**
	 * The number of operations of the '<em>Test Diagram Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEST_DIAGRAM_DESCRIPTION_OPERATION_COUNT = DescriptionPackage.DIAGRAM_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mondoSirius.impl.TestTableEditionImpl <em>Test Table Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mondoSirius.impl.TestTableEditionImpl
	 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestTableEdition()
	 * @generated
	 */
	int TEST_TABLE_EDITION = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__DOCUMENTATION = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>End User Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__END_USER_DOCUMENTATION = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__END_USER_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__NAME = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__LABEL = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__LABEL;

	/**
	 * The feature id for the '<em><b>Title Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__TITLE_EXPRESSION = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__TITLE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Initialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__INITIALISATION = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__INITIALISATION;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__METAMODEL = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__METAMODEL;

	/**
	 * The feature id for the '<em><b>Show On Startup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__SHOW_ON_STARTUP = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__SHOW_ON_STARTUP;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__PRECONDITION_EXPRESSION = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__DOMAIN_CLASS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__DOMAIN_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Representation Creation Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__OWNED_REPRESENTATION_CREATION_DESCRIPTIONS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__OWNED_REPRESENTATION_CREATION_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Reused Representation Creation Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__REUSED_REPRESENTATION_CREATION_DESCRIPTIONS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__REUSED_REPRESENTATION_CREATION_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>All Representation Creation Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__ALL_REPRESENTATION_CREATION_DESCRIPTIONS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__ALL_REPRESENTATION_CREATION_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Owned Representation Navigation Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__OWNED_REPRESENTATION_NAVIGATION_DESCRIPTIONS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__OWNED_REPRESENTATION_NAVIGATION_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Reused Representation Navigation Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__REUSED_REPRESENTATION_NAVIGATION_DESCRIPTIONS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__REUSED_REPRESENTATION_NAVIGATION_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>All Representation Navigation Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__ALL_REPRESENTATION_NAVIGATION_DESCRIPTIONS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__ALL_REPRESENTATION_NAVIGATION_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Owned Line Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__OWNED_LINE_MAPPINGS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__OWNED_LINE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Reused Line Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__REUSED_LINE_MAPPINGS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__REUSED_LINE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>All Line Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__ALL_LINE_MAPPINGS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__ALL_LINE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Owned Create Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__OWNED_CREATE_LINE = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__OWNED_CREATE_LINE;

	/**
	 * The feature id for the '<em><b>Reused Create Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__REUSED_CREATE_LINE = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__REUSED_CREATE_LINE;

	/**
	 * The feature id for the '<em><b>All Create Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__ALL_CREATE_LINE = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__ALL_CREATE_LINE;

	/**
	 * The feature id for the '<em><b>Initial Header Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__INITIAL_HEADER_COLUMN_WIDTH = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__INITIAL_HEADER_COLUMN_WIDTH;

	/**
	 * The feature id for the '<em><b>Imported Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__IMPORTED_ELEMENTS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__IMPORTED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Owned Column Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__OWNED_COLUMN_MAPPINGS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__OWNED_COLUMN_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Reused Column Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__REUSED_COLUMN_MAPPINGS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__REUSED_COLUMN_MAPPINGS;

	/**
	 * The feature id for the '<em><b>All Column Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__ALL_COLUMN_MAPPINGS = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION__ALL_COLUMN_MAPPINGS;

	/**
	 * The number of structural features of the '<em>Test Table Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION_FEATURE_COUNT = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Test Table Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEST_TABLE_EDITION_OPERATION_COUNT = org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.EDITION_TABLE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mondoSirius.impl.TestViewpointImpl <em>Test Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mondoSirius.impl.TestViewpointImpl
	 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestViewpoint()
	 * @generated
	 */
	int TEST_VIEWPOINT = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__DOCUMENTATION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>End User Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__END_USER_DOCUMENTATION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__END_USER_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__NAME = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__LABEL = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__LABEL;

	/**
	 * The feature id for the '<em><b>Model File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__MODEL_FILE_EXTENSION = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__MODEL_FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>Validation Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__VALIDATION_SET = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__VALIDATION_SET;

	/**
	 * The feature id for the '<em><b>Owned Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__OWNED_REPRESENTATIONS = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__OWNED_REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Representation Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__OWNED_REPRESENTATION_EXTENSIONS = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__OWNED_REPRESENTATION_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Owned Java Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__OWNED_JAVA_EXTENSIONS = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__OWNED_JAVA_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Owned MM Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__OWNED_MM_EXTENSIONS = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__OWNED_MM_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Owned Feature Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__OWNED_FEATURE_EXTENSIONS = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__OWNED_FEATURE_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__ICON = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__ICON;

	/**
	 * The feature id for the '<em><b>Owned Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__OWNED_TEMPLATES = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__OWNED_TEMPLATES;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__CONFLICTS = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Reuses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__REUSES = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__REUSES;

	/**
	 * The feature id for the '<em><b>Customizes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__CUSTOMIZES = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT__CUSTOMIZES;

	/**
	 * The number of structural features of the '<em>Test Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT_FEATURE_COUNT = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEST_VIEWPOINT___INIT_VIEW__EOBJECT = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT___INIT_VIEW__EOBJECT;

	/**
	 * The number of operations of the '<em>Test Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TEST_VIEWPOINT_OPERATION_COUNT = org.eclipse.sirius.viewpoint.description.DescriptionPackage.VIEWPOINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link mondoSirius.TestDiagramDescription <em>Test Diagram Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Diagram Description</em>'.
	 * @see mondoSirius.TestDiagramDescription
	 * @generated
	 */
	EClass getTestDiagramDescription();

	/**
	 * Returns the meta object for class '{@link mondoSirius.TestTableEdition <em>Test Table Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Table Edition</em>'.
	 * @see mondoSirius.TestTableEdition
	 * @generated
	 */
	EClass getTestTableEdition();

	/**
	 * Returns the meta object for class '{@link mondoSirius.TestViewpoint <em>Test Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Viewpoint</em>'.
	 * @see mondoSirius.TestViewpoint
	 * @generated
	 */
	EClass getTestViewpoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MondoSiriusFactory getMondoSiriusFactory();

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
		 * The meta object literal for the '{@link mondoSirius.impl.TestDiagramDescriptionImpl <em>Test Diagram Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mondoSirius.impl.TestDiagramDescriptionImpl
		 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestDiagramDescription()
		 * @generated
		 */
		EClass TEST_DIAGRAM_DESCRIPTION = eINSTANCE.getTestDiagramDescription();

		/**
		 * The meta object literal for the '{@link mondoSirius.impl.TestTableEditionImpl <em>Test Table Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mondoSirius.impl.TestTableEditionImpl
		 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestTableEdition()
		 * @generated
		 */
		EClass TEST_TABLE_EDITION = eINSTANCE.getTestTableEdition();

		/**
		 * The meta object literal for the '{@link mondoSirius.impl.TestViewpointImpl <em>Test Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mondoSirius.impl.TestViewpointImpl
		 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestViewpoint()
		 * @generated
		 */
		EClass TEST_VIEWPOINT = eINSTANCE.getTestViewpoint();

	}

} //MondoSiriusPackage
