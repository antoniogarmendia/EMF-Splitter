/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see dslHeuristicVisualization.DslHeuristicVisualizationFactory
 * @model kind="package"
 * @generated
 */
public interface DslHeuristicVisualizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dslHeuristicVisualization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.dsl.org/dslHeuristicVisualization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visual";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslHeuristicVisualizationPackage eINSTANCE = dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.HeuristicStrategyImpl <em>Heuristic Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.HeuristicStrategyImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getHeuristicStrategy()
	 * @generated
	 */
	int HEURISTIC_STRATEGY = 0;

	/**
	 * The feature id for the '<em><b>Graphic representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Nemf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY__NEMF = 1;

	/**
	 * The feature id for the '<em><b>Ecore Containment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY__ECORE_CONTAINMENT = 2;

	/**
	 * The feature id for the '<em><b>Current Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY__CURRENT_REPRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Current MMGR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY__CURRENT_MMGR = 4;

	/**
	 * The feature id for the '<em><b>List Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY__LIST_REPRESENTATION = 5;

	/**
	 * The number of structural features of the '<em>Heuristic Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Execute Heuristics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY___EXECUTE_HEURISTICS = 0;

	/**
	 * The operation id for the '<em>Execute Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY___EXECUTE_ROOT_ELEMENT = 1;

	/**
	 * The operation id for the '<em>Execute Graphical Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY___EXECUTE_GRAPHICAL_ELEMENTS = 2;

	/**
	 * The operation id for the '<em>Get Feature Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY___GET_FEATURE_NAME__ECLASS_ECLASS = 3;

	/**
	 * The operation id for the '<em>Get EList EClassfrom EReference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY___GET_ELIST_ECLASSFROM_EREFERENCE__EREFERENCE = 4;

	/**
	 * The operation id for the '<em>Execute Direct Path Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY___EXECUTE_DIRECT_PATH_MATRIX = 5;

	/**
	 * The number of operations of the '<em>Heuristic Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyLinkImpl <em>Concrete Strategy Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyLinkImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyLink()
	 * @generated
	 */
	int CONCRETE_STRATEGY_LINK = 1;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Concrete Strategy Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.StrategyLabel <em>Strategy Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.StrategyLabel
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyLabel()
	 * @generated
	 */
	int STRATEGY_LABEL = 2;

	/**
	 * The number of structural features of the '<em>Strategy Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_LABEL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_LABEL___GET_LABEL__ECLASS = 0;

	/**
	 * The number of operations of the '<em>Strategy Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_LABEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyLabelFirstStringImpl <em>Concrete Strategy Label First String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyLabelFirstStringImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyLabelFirstString()
	 * @generated
	 */
	int CONCRETE_STRATEGY_LABEL_FIRST_STRING = 3;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Label First String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_FIRST_STRING_FEATURE_COUNT = STRATEGY_LABEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_FIRST_STRING___GET_LABEL__ECLASS = STRATEGY_LABEL___GET_LABEL__ECLASS;

	/**
	 * The number of operations of the '<em>Concrete Strategy Label First String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_FIRST_STRING_OPERATION_COUNT = STRATEGY_LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyLabelIdentifierImpl <em>Concrete Strategy Label Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyLabelIdentifierImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyLabelIdentifier()
	 * @generated
	 */
	int CONCRETE_STRATEGY_LABEL_IDENTIFIER = 4;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Label Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_IDENTIFIER_FEATURE_COUNT = STRATEGY_LABEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_IDENTIFIER___GET_LABEL__ECLASS = STRATEGY_LABEL___GET_LABEL__ECLASS;

	/**
	 * The number of operations of the '<em>Concrete Strategy Label Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_IDENTIFIER_OPERATION_COUNT = STRATEGY_LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyLabelParameterImpl <em>Concrete Strategy Label Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyLabelParameterImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyLabelParameter()
	 * @generated
	 */
	int CONCRETE_STRATEGY_LABEL_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Label parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER = STRATEGY_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Label Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_PARAMETER_FEATURE_COUNT = STRATEGY_LABEL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_PARAMETER___GET_LABEL__ECLASS = STRATEGY_LABEL___GET_LABEL__ECLASS;

	/**
	 * The number of operations of the '<em>Concrete Strategy Label Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_LABEL_PARAMETER_OPERATION_COUNT = STRATEGY_LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.LabelParameterImpl <em>Label Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.LabelParameterImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getLabelParameter()
	 * @generated
	 */
	int LABEL_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>List label</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER__LIST_LABEL = 0;

	/**
	 * The number of structural features of the '<em>Label Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>To Comma Separated String Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER___TO_COMMA_SEPARATED_STRING_LABEL = 0;

	/**
	 * The operation id for the '<em>Default Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER___DEFAULT_PARAMETERS = 1;

	/**
	 * The number of operations of the '<em>Label Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.StrategyRootSelection <em>Strategy Root Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.StrategyRootSelection
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyRootSelection()
	 * @generated
	 */
	int STRATEGY_ROOT_SELECTION = 7;

	/**
	 * The number of structural features of the '<em>Strategy Root Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ROOT_SELECTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ROOT_SELECTION___GET_ROOT__ELIST_ELIST = 0;

	/**
	 * The operation id for the '<em>List Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ROOT_SELECTION___LIST_ROOT__ELIST_ELIST = 1;

	/**
	 * The number of operations of the '<em>Strategy Root Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ROOT_SELECTION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyMaxContainmentImpl <em>Concrete Strategy Max Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyMaxContainmentImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyMaxContainment()
	 * @generated
	 */
	int CONCRETE_STRATEGY_MAX_CONTAINMENT = 8;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Max Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_MAX_CONTAINMENT_FEATURE_COUNT = STRATEGY_ROOT_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_MAX_CONTAINMENT___GET_ROOT__ELIST_ELIST = STRATEGY_ROOT_SELECTION___GET_ROOT__ELIST_ELIST;

	/**
	 * The operation id for the '<em>List Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_MAX_CONTAINMENT___LIST_ROOT__ELIST_ELIST = STRATEGY_ROOT_SELECTION___LIST_ROOT__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Concrete Strategy Max Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_MAX_CONTAINMENT_OPERATION_COUNT = STRATEGY_ROOT_SELECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyNoParentImpl <em>Concrete Strategy No Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyNoParentImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyNoParent()
	 * @generated
	 */
	int CONCRETE_STRATEGY_NO_PARENT = 9;

	/**
	 * The number of structural features of the '<em>Concrete Strategy No Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_NO_PARENT_FEATURE_COUNT = STRATEGY_ROOT_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_NO_PARENT___GET_ROOT__ELIST_ELIST = STRATEGY_ROOT_SELECTION___GET_ROOT__ELIST_ELIST;

	/**
	 * The operation id for the '<em>List Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_NO_PARENT___LIST_ROOT__ELIST_ELIST = STRATEGY_ROOT_SELECTION___LIST_ROOT__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Concrete Strategy No Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_NO_PARENT_OPERATION_COUNT = STRATEGY_ROOT_SELECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.StrategyPalette <em>Strategy Palette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.StrategyPalette
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyPalette()
	 * @generated
	 */
	int STRATEGY_PALETTE = 10;

	/**
	 * The number of structural features of the '<em>Strategy Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_PALETTE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Palette</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_PALETTE___GET_PALETTE__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Strategy Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_PALETTE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyPaletteImpl <em>Concrete Strategy Palette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyPaletteImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyPalette()
	 * @generated
	 */
	int CONCRETE_STRATEGY_PALETTE = 11;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_PALETTE_FEATURE_COUNT = STRATEGY_PALETTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Palette</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_PALETTE___GET_PALETTE__EOBJECT = STRATEGY_PALETTE___GET_PALETTE__EOBJECT;

	/**
	 * The number of operations of the '<em>Concrete Strategy Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_PALETTE_OPERATION_COUNT = STRATEGY_PALETTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.StrategyArcDirection <em>Strategy Arc Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.StrategyArcDirection
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyArcDirection()
	 * @generated
	 */
	int STRATEGY_ARC_DIRECTION = 14;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.StrategyArcSelection <em>Strategy Arc Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.StrategyArcSelection
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyArcSelection()
	 * @generated
	 */
	int STRATEGY_ARC_SELECTION = 12;

	/**
	 * The feature id for the '<em><b>Arc direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ARC_SELECTION__ARC_DIRECTION = 0;

	/**
	 * The number of structural features of the '<em>Strategy Arc Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ARC_SELECTION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Arc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ARC_SELECTION___IS_ARC__ECLASS = 0;

	/**
	 * The number of operations of the '<em>Strategy Arc Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ARC_SELECTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyArcSelectionImpl <em>Concrete Strategy Arc Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyArcSelectionImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyArcSelection()
	 * @generated
	 */
	int CONCRETE_STRATEGY_ARC_SELECTION = 13;

	/**
	 * The feature id for the '<em><b>Arc direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_ARC_SELECTION__ARC_DIRECTION = STRATEGY_ARC_SELECTION__ARC_DIRECTION;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Arc Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_ARC_SELECTION_FEATURE_COUNT = STRATEGY_ARC_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Arc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_ARC_SELECTION___IS_ARC__ECLASS = STRATEGY_ARC_SELECTION___IS_ARC__ECLASS;

	/**
	 * The number of operations of the '<em>Concrete Strategy Arc Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_ARC_SELECTION_OPERATION_COUNT = STRATEGY_ARC_SELECTION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strategy Arc Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ARC_DIRECTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Direction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ARC_DIRECTION___GET_DIRECTION__ECLASS = 0;

	/**
	 * The number of operations of the '<em>Strategy Arc Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_ARC_DIRECTION_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.ArcParameter <em>Arc Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.ArcParameter
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getArcParameter()
	 * @generated
	 */
	int ARC_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PARAMETER__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PARAMETER__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Arc Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Default Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PARAMETER___DEFAULT_PARAM = 0;

	/**
	 * The number of operations of the '<em>Arc Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PARAMETER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.DefaultArcParameterImpl <em>Default Arc Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.DefaultArcParameterImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getDefaultArcParameter()
	 * @generated
	 */
	int DEFAULT_ARC_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARC_PARAMETER__SOURCE = ARC_PARAMETER__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARC_PARAMETER__TARGET = ARC_PARAMETER__TARGET;

	/**
	 * The number of structural features of the '<em>Default Arc Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARC_PARAMETER_FEATURE_COUNT = ARC_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Default Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARC_PARAMETER___DEFAULT_PARAM = ARC_PARAMETER___DEFAULT_PARAM;

	/**
	 * The operation id for the '<em>To Comma Separated String Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARC_PARAMETER___TO_COMMA_SEPARATED_STRING_SOURCE = ARC_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To Comma Separated String Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARC_PARAMETER___TO_COMMA_SEPARATED_STRING_TARGET = ARC_PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Default Arc Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARC_PARAMETER_OPERATION_COUNT = ARC_PARAMETER_OPERATION_COUNT + 2;


	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyArcDirectionImpl <em>Concrete Strategy Arc Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyArcDirectionImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyArcDirection()
	 * @generated
	 */
	int CONCRETE_STRATEGY_ARC_DIRECTION = 17;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_ARC_DIRECTION__PARAM = STRATEGY_ARC_DIRECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Arc Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_ARC_DIRECTION_FEATURE_COUNT = STRATEGY_ARC_DIRECTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Direction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_ARC_DIRECTION___GET_DIRECTION__ECLASS = STRATEGY_ARC_DIRECTION___GET_DIRECTION__ECLASS;

	/**
	 * The operation id for the '<em>Contains String EReference Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_ARC_DIRECTION___CONTAINS_STRING_EREFERENCE_NAME__ELIST_STRING = STRATEGY_ARC_DIRECTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concrete Strategy Arc Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_ARC_DIRECTION_OPERATION_COUNT = STRATEGY_ARC_DIRECTION_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyDefaultDirectionImpl <em>Concrete Strategy Default Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyDefaultDirectionImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyDefaultDirection()
	 * @generated
	 */
	int CONCRETE_STRATEGY_DEFAULT_DIRECTION = 18;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Default Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_DEFAULT_DIRECTION_FEATURE_COUNT = STRATEGY_ARC_DIRECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Direction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_DEFAULT_DIRECTION___GET_DIRECTION__ECLASS = STRATEGY_ARC_DIRECTION___GET_DIRECTION__ECLASS;

	/**
	 * The number of operations of the '<em>Concrete Strategy Default Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_DEFAULT_DIRECTION_OPERATION_COUNT = STRATEGY_ARC_DIRECTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.StrategyNodeSelection <em>Strategy Node Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.StrategyNodeSelection
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyNodeSelection()
	 * @generated
	 */
	int STRATEGY_NODE_SELECTION = 19;

	/**
	 * The number of structural features of the '<em>Strategy Node Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_NODE_SELECTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_NODE_SELECTION___IS_NODE__ECLASS = 0;

	/**
	 * The number of operations of the '<em>Strategy Node Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_NODE_SELECTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyDefaultNodeSelectionImpl <em>Concrete Strategy Default Node Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyDefaultNodeSelectionImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyDefaultNodeSelection()
	 * @generated
	 */
	int CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION = 20;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Default Node Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION_FEATURE_COUNT = STRATEGY_NODE_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION___IS_NODE__ECLASS = STRATEGY_NODE_SELECTION___IS_NODE__ECLASS;

	/**
	 * The number of operations of the '<em>Concrete Strategy Default Node Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION_OPERATION_COUNT = STRATEGY_NODE_SELECTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.StrategyPossibleElements <em>Strategy Possible Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.StrategyPossibleElements
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyPossibleElements()
	 * @generated
	 */
	int STRATEGY_POSSIBLE_ELEMENTS = 21;

	/**
	 * The feature id for the '<em><b>EClass No Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_POSSIBLE_ELEMENTS__ECLASS_NO_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Strategy Possible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_POSSIBLE_ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Possible Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_POSSIBLE_ELEMENTS___POSSIBLE_ELEMENTS__ECLASS_ELIST_ELIST = 0;

	/**
	 * The number of operations of the '<em>Strategy Possible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_POSSIBLE_ELEMENTS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyContainmentDiagramElementImpl <em>Concrete Strategy Containment Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteStrategyContainmentDiagramElementImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyContainmentDiagramElement()
	 * @generated
	 */
	int CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>EClass No Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT__ECLASS_NO_ELEMENTS = STRATEGY_POSSIBLE_ELEMENTS__ECLASS_NO_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Concrete Strategy Containment Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT_FEATURE_COUNT = STRATEGY_POSSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Possible Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT___POSSIBLE_ELEMENTS__ECLASS_ELIST_ELIST = STRATEGY_POSSIBLE_ELEMENTS___POSSIBLE_ELEMENTS__ECLASS_ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Concrete Strategy Containment Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT_OPERATION_COUNT = STRATEGY_POSSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.EcoreMatrixContainmentImpl <em>Ecore Matrix Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.EcoreMatrixContainmentImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getEcoreMatrixContainment()
	 * @generated
	 */
	int ECORE_MATRIX_CONTAINMENT = 23;

	/**
	 * The feature id for the '<em><b>Direct Matrix Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT__DIRECT_MATRIX_CONTAINMENT = 0;

	/**
	 * The feature id for the '<em><b>Path Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT__PATH_MATRIX = 1;

	/**
	 * The number of structural features of the '<em>Ecore Matrix Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT___GET_PARENT__INTEGER = 0;

	/**
	 * The operation id for the '<em>Get Direct Matrix Containment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT___GET_DIRECT_MATRIX_CONTAINMENT__ELIST = 1;

	/**
	 * The operation id for the '<em>Get Path Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT___GET_PATH_MATRIX = 2;

	/**
	 * The operation id for the '<em>Copy Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT___COPY_MATRIX = 3;

	/**
	 * The operation id for the '<em>Print Direct Matrix Containment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT___PRINT_DIRECT_MATRIX_CONTAINMENT__ELIST = 4;

	/**
	 * The operation id for the '<em>Get EAll Childs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT___GET_EALL_CHILDS__ECLASS_ELIST = 5;

	/**
	 * The operation id for the '<em>Get All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT___GET_ALL_PARENTS__INTEGER = 6;

	/**
	 * The number of operations of the '<em>Ecore Matrix Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MATRIX_CONTAINMENT_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl <em>Heuristic Strategy Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getHeuristicStrategySettings()
	 * @generated
	 */
	int HEURISTIC_STRATEGY_SETTINGS = 24;

	/**
	 * The feature id for the '<em><b>Strategy label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Strategy root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Strategy palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE = 2;

	/**
	 * The feature id for the '<em><b>Strategy arc Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION = 3;

	/**
	 * The feature id for the '<em><b>Strategy node selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION = 4;

	/**
	 * The feature id for the '<em><b>Strategy possible Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_SETTINGS__STRATEGY_POSSIBLE_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Strategy linkcompartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LINKCOMPARTMENT = 6;

	/**
	 * The number of structural features of the '<em>Heuristic Strategy Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_SETTINGS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Heuristic Strategy Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_STRATEGY_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.StrategyLinkCompartment <em>Strategy Link Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.StrategyLinkCompartment
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyLinkCompartment()
	 * @generated
	 */
	int STRATEGY_LINK_COMPARTMENT = 25;

	/**
	 * The feature id for the '<em><b>List Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_LINK_COMPARTMENT__LIST_LINKS = 0;

	/**
	 * The feature id for the '<em><b>List Compartment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_LINK_COMPARTMENT__LIST_COMPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>List Affixed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_LINK_COMPARTMENT__LIST_AFFIXED = 2;

	/**
	 * The number of structural features of the '<em>Strategy Link Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_LINK_COMPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Execute Link Compartments Heuristics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_LINK_COMPARTMENT___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS = 0;

	/**
	 * The number of operations of the '<em>Strategy Link Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_LINK_COMPARTMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteContainmentasAffixedImpl <em>Concrete Containmentas Affixed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteContainmentasAffixedImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteContainmentasAffixed()
	 * @generated
	 */
	int CONCRETE_CONTAINMENTAS_AFFIXED = 26;

	/**
	 * The feature id for the '<em><b>List Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_AFFIXED__LIST_LINKS = STRATEGY_LINK_COMPARTMENT__LIST_LINKS;

	/**
	 * The feature id for the '<em><b>List Compartment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_AFFIXED__LIST_COMPARTMENT = STRATEGY_LINK_COMPARTMENT__LIST_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>List Affixed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_AFFIXED__LIST_AFFIXED = STRATEGY_LINK_COMPARTMENT__LIST_AFFIXED;

	/**
	 * The number of structural features of the '<em>Concrete Containmentas Affixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_AFFIXED_FEATURE_COUNT = STRATEGY_LINK_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute Link Compartments Heuristics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_AFFIXED___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS = STRATEGY_LINK_COMPARTMENT___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS;

	/**
	 * The number of operations of the '<em>Concrete Containmentas Affixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_AFFIXED_OPERATION_COUNT = STRATEGY_LINK_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteContainmentasLinksImpl <em>Concrete Containmentas Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteContainmentasLinksImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteContainmentasLinks()
	 * @generated
	 */
	int CONCRETE_CONTAINMENTAS_LINKS = 27;

	/**
	 * The feature id for the '<em><b>List Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_LINKS__LIST_LINKS = STRATEGY_LINK_COMPARTMENT__LIST_LINKS;

	/**
	 * The feature id for the '<em><b>List Compartment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_LINKS__LIST_COMPARTMENT = STRATEGY_LINK_COMPARTMENT__LIST_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>List Affixed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_LINKS__LIST_AFFIXED = STRATEGY_LINK_COMPARTMENT__LIST_AFFIXED;

	/**
	 * The number of structural features of the '<em>Concrete Containmentas Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_LINKS_FEATURE_COUNT = STRATEGY_LINK_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute Link Compartments Heuristics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_LINKS___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS = STRATEGY_LINK_COMPARTMENT___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS;

	/**
	 * The number of operations of the '<em>Concrete Containmentas Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_LINKS_OPERATION_COUNT = STRATEGY_LINK_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.ConcreteContainmentasCompartmentsImpl <em>Concrete Containmentas Compartments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.ConcreteContainmentasCompartmentsImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteContainmentasCompartments()
	 * @generated
	 */
	int CONCRETE_CONTAINMENTAS_COMPARTMENTS = 28;

	/**
	 * The feature id for the '<em><b>List Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_COMPARTMENTS__LIST_LINKS = STRATEGY_LINK_COMPARTMENT__LIST_LINKS;

	/**
	 * The feature id for the '<em><b>List Compartment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_COMPARTMENTS__LIST_COMPARTMENT = STRATEGY_LINK_COMPARTMENT__LIST_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>List Affixed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_COMPARTMENTS__LIST_AFFIXED = STRATEGY_LINK_COMPARTMENT__LIST_AFFIXED;

	/**
	 * The number of structural features of the '<em>Concrete Containmentas Compartments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_COMPARTMENTS_FEATURE_COUNT = STRATEGY_LINK_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute Link Compartments Heuristics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_COMPARTMENTS___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS = STRATEGY_LINK_COMPARTMENT___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS;

	/**
	 * The number of operations of the '<em>Concrete Containmentas Compartments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONTAINMENTAS_COMPARTMENTS_OPERATION_COUNT = STRATEGY_LINK_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslHeuristicVisualization.impl.RepreHeurSSImpl <em>Repre Heur SS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslHeuristicVisualization.impl.RepreHeurSSImpl
	 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getRepreHeurSS()
	 * @generated
	 */
	int REPRE_HEUR_SS = 29;

	/**
	 * The feature id for the '<em><b>Heuristic Strategy Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRE_HEUR_SS__HEURISTIC_STRATEGY_SETTINGS = 0;

	/**
	 * The number of structural features of the '<em>Repre Heur SS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRE_HEUR_SS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repre Heur SS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRE_HEUR_SS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.HeuristicStrategy <em>Heuristic Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heuristic Strategy</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategy
	 * @generated
	 */
	EClass getHeuristicStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link dslHeuristicVisualization.HeuristicStrategy#getGraphic_representation <em>Graphic representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphic representation</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategy#getGraphic_representation()
	 * @see #getHeuristicStrategy()
	 * @generated
	 */
	EReference getHeuristicStrategy_Graphic_representation();

	/**
	 * Returns the meta object for the reference '{@link dslHeuristicVisualization.HeuristicStrategy#getNemf <em>Nemf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nemf</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategy#getNemf()
	 * @see #getHeuristicStrategy()
	 * @generated
	 */
	EReference getHeuristicStrategy_Nemf();

	/**
	 * Returns the meta object for the reference '{@link dslHeuristicVisualization.HeuristicStrategy#getEcoreContainment <em>Ecore Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecore Containment</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategy#getEcoreContainment()
	 * @see #getHeuristicStrategy()
	 * @generated
	 */
	EReference getHeuristicStrategy_EcoreContainment();

	/**
	 * Returns the meta object for the attribute '{@link dslHeuristicVisualization.HeuristicStrategy#getCurrentRepresentation <em>Current Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Representation</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategy#getCurrentRepresentation()
	 * @see #getHeuristicStrategy()
	 * @generated
	 */
	EAttribute getHeuristicStrategy_CurrentRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link dslHeuristicVisualization.HeuristicStrategy#getCurrentMMGR <em>Current MMGR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current MMGR</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategy#getCurrentMMGR()
	 * @see #getHeuristicStrategy()
	 * @generated
	 */
	EAttribute getHeuristicStrategy_CurrentMMGR();

	/**
	 * Returns the meta object for the containment reference list '{@link dslHeuristicVisualization.HeuristicStrategy#getListRepresentation <em>List Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Representation</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategy#getListRepresentation()
	 * @see #getHeuristicStrategy()
	 * @generated
	 */
	EReference getHeuristicStrategy_ListRepresentation();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.HeuristicStrategy#ExecuteHeuristics() <em>Execute Heuristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Heuristics</em>' operation.
	 * @see dslHeuristicVisualization.HeuristicStrategy#ExecuteHeuristics()
	 * @generated
	 */
	EOperation getHeuristicStrategy__ExecuteHeuristics();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.HeuristicStrategy#Execute_Root_Element() <em>Execute Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Root Element</em>' operation.
	 * @see dslHeuristicVisualization.HeuristicStrategy#Execute_Root_Element()
	 * @generated
	 */
	EOperation getHeuristicStrategy__Execute_Root_Element();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.HeuristicStrategy#Execute_Graphical_Elements() <em>Execute Graphical Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Graphical Elements</em>' operation.
	 * @see dslHeuristicVisualization.HeuristicStrategy#Execute_Graphical_Elements()
	 * @generated
	 */
	EOperation getHeuristicStrategy__Execute_Graphical_Elements();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.HeuristicStrategy#GetFeatureName(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EClass) <em>Get Feature Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Name</em>' operation.
	 * @see dslHeuristicVisualization.HeuristicStrategy#GetFeatureName(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getHeuristicStrategy__GetFeatureName__EClass_EClass();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.HeuristicStrategy#GetEListEClassfromEReference(org.eclipse.emf.ecore.EReference) <em>Get EList EClassfrom EReference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EList EClassfrom EReference</em>' operation.
	 * @see dslHeuristicVisualization.HeuristicStrategy#GetEListEClassfromEReference(org.eclipse.emf.ecore.EReference)
	 * @generated
	 */
	EOperation getHeuristicStrategy__GetEListEClassfromEReference__EReference();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.HeuristicStrategy#ExecuteDirectPathMatrix() <em>Execute Direct Path Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Direct Path Matrix</em>' operation.
	 * @see dslHeuristicVisualization.HeuristicStrategy#ExecuteDirectPathMatrix()
	 * @generated
	 */
	EOperation getHeuristicStrategy__ExecuteDirectPathMatrix();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyLink <em>Concrete Strategy Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Link</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyLink
	 * @generated
	 */
	EClass getConcreteStrategyLink();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.StrategyLabel <em>Strategy Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Label</em>'.
	 * @see dslHeuristicVisualization.StrategyLabel
	 * @generated
	 */
	EClass getStrategyLabel();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.StrategyLabel#GetLabel(org.eclipse.emf.ecore.EClass) <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see dslHeuristicVisualization.StrategyLabel#GetLabel(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getStrategyLabel__GetLabel__EClass();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyLabelFirstString <em>Concrete Strategy Label First String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Label First String</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyLabelFirstString
	 * @generated
	 */
	EClass getConcreteStrategyLabelFirstString();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyLabelIdentifier <em>Concrete Strategy Label Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Label Identifier</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyLabelIdentifier
	 * @generated
	 */
	EClass getConcreteStrategyLabelIdentifier();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyLabelParameter <em>Concrete Strategy Label Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Label Parameter</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyLabelParameter
	 * @generated
	 */
	EClass getConcreteStrategyLabelParameter();

	/**
	 * Returns the meta object for the containment reference '{@link dslHeuristicVisualization.ConcreteStrategyLabelParameter#getLabel_parameter <em>Label parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label parameter</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyLabelParameter#getLabel_parameter()
	 * @see #getConcreteStrategyLabelParameter()
	 * @generated
	 */
	EReference getConcreteStrategyLabelParameter_Label_parameter();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.LabelParameter <em>Label Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Parameter</em>'.
	 * @see dslHeuristicVisualization.LabelParameter
	 * @generated
	 */
	EClass getLabelParameter();

	/**
	 * Returns the meta object for the attribute list '{@link dslHeuristicVisualization.LabelParameter#getList_label <em>List label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List label</em>'.
	 * @see dslHeuristicVisualization.LabelParameter#getList_label()
	 * @see #getLabelParameter()
	 * @generated
	 */
	EAttribute getLabelParameter_List_label();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.LabelParameter#toCommaSeparatedStringLabel() <em>To Comma Separated String Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Comma Separated String Label</em>' operation.
	 * @see dslHeuristicVisualization.LabelParameter#toCommaSeparatedStringLabel()
	 * @generated
	 */
	EOperation getLabelParameter__ToCommaSeparatedStringLabel();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.LabelParameter#DefaultParameters() <em>Default Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Default Parameters</em>' operation.
	 * @see dslHeuristicVisualization.LabelParameter#DefaultParameters()
	 * @generated
	 */
	EOperation getLabelParameter__DefaultParameters();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.StrategyRootSelection <em>Strategy Root Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Root Selection</em>'.
	 * @see dslHeuristicVisualization.StrategyRootSelection
	 * @generated
	 */
	EClass getStrategyRootSelection();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.StrategyRootSelection#Get_Root(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root</em>' operation.
	 * @see dslHeuristicVisualization.StrategyRootSelection#Get_Root(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getStrategyRootSelection__Get_Root__EList_EList();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.StrategyRootSelection#List_Root(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>List Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Root</em>' operation.
	 * @see dslHeuristicVisualization.StrategyRootSelection#List_Root(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getStrategyRootSelection__List_Root__EList_EList();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyMaxContainment <em>Concrete Strategy Max Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Max Containment</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyMaxContainment
	 * @generated
	 */
	EClass getConcreteStrategyMaxContainment();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyNoParent <em>Concrete Strategy No Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy No Parent</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyNoParent
	 * @generated
	 */
	EClass getConcreteStrategyNoParent();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.StrategyPalette <em>Strategy Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Palette</em>'.
	 * @see dslHeuristicVisualization.StrategyPalette
	 * @generated
	 */
	EClass getStrategyPalette();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.StrategyPalette#Get_Palette(org.eclipse.emf.ecore.EObject) <em>Get Palette</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Palette</em>' operation.
	 * @see dslHeuristicVisualization.StrategyPalette#Get_Palette(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStrategyPalette__Get_Palette__EObject();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyPalette <em>Concrete Strategy Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Palette</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyPalette
	 * @generated
	 */
	EClass getConcreteStrategyPalette();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.StrategyArcSelection <em>Strategy Arc Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Arc Selection</em>'.
	 * @see dslHeuristicVisualization.StrategyArcSelection
	 * @generated
	 */
	EClass getStrategyArcSelection();

	/**
	 * Returns the meta object for the reference '{@link dslHeuristicVisualization.StrategyArcSelection#getArc_direction <em>Arc direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arc direction</em>'.
	 * @see dslHeuristicVisualization.StrategyArcSelection#getArc_direction()
	 * @see #getStrategyArcSelection()
	 * @generated
	 */
	EReference getStrategyArcSelection_Arc_direction();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.StrategyArcSelection#IsArc(org.eclipse.emf.ecore.EClass) <em>Is Arc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Arc</em>' operation.
	 * @see dslHeuristicVisualization.StrategyArcSelection#IsArc(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getStrategyArcSelection__IsArc__EClass();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyArcSelection <em>Concrete Strategy Arc Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Arc Selection</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyArcSelection
	 * @generated
	 */
	EClass getConcreteStrategyArcSelection();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.StrategyArcDirection <em>Strategy Arc Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Arc Direction</em>'.
	 * @see dslHeuristicVisualization.StrategyArcDirection
	 * @generated
	 */
	EClass getStrategyArcDirection();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.StrategyArcDirection#Get_Direction(org.eclipse.emf.ecore.EClass) <em>Get Direction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Direction</em>' operation.
	 * @see dslHeuristicVisualization.StrategyArcDirection#Get_Direction(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getStrategyArcDirection__Get_Direction__EClass();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ArcParameter <em>Arc Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Parameter</em>'.
	 * @see dslHeuristicVisualization.ArcParameter
	 * @generated
	 */
	EClass getArcParameter();

	/**
	 * Returns the meta object for the attribute list '{@link dslHeuristicVisualization.ArcParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source</em>'.
	 * @see dslHeuristicVisualization.ArcParameter#getSource()
	 * @see #getArcParameter()
	 * @generated
	 */
	EAttribute getArcParameter_Source();

	/**
	 * Returns the meta object for the attribute list '{@link dslHeuristicVisualization.ArcParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target</em>'.
	 * @see dslHeuristicVisualization.ArcParameter#getTarget()
	 * @see #getArcParameter()
	 * @generated
	 */
	EAttribute getArcParameter_Target();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.ArcParameter#DefaultParam() <em>Default Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Default Param</em>' operation.
	 * @see dslHeuristicVisualization.ArcParameter#DefaultParam()
	 * @generated
	 */
	EOperation getArcParameter__DefaultParam();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.DefaultArcParameter <em>Default Arc Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Arc Parameter</em>'.
	 * @see dslHeuristicVisualization.DefaultArcParameter
	 * @generated
	 */
	EClass getDefaultArcParameter();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.DefaultArcParameter#toCommaSeparatedStringSource() <em>To Comma Separated String Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Comma Separated String Source</em>' operation.
	 * @see dslHeuristicVisualization.DefaultArcParameter#toCommaSeparatedStringSource()
	 * @generated
	 */
	EOperation getDefaultArcParameter__ToCommaSeparatedStringSource();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.DefaultArcParameter#toCommaSeparatedStringTarget() <em>To Comma Separated String Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Comma Separated String Target</em>' operation.
	 * @see dslHeuristicVisualization.DefaultArcParameter#toCommaSeparatedStringTarget()
	 * @generated
	 */
	EOperation getDefaultArcParameter__ToCommaSeparatedStringTarget();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyArcDirection <em>Concrete Strategy Arc Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Arc Direction</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyArcDirection
	 * @generated
	 */
	EClass getConcreteStrategyArcDirection();

	/**
	 * Returns the meta object for the reference '{@link dslHeuristicVisualization.ConcreteStrategyArcDirection#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyArcDirection#getParam()
	 * @see #getConcreteStrategyArcDirection()
	 * @generated
	 */
	EReference getConcreteStrategyArcDirection_Param();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.ConcreteStrategyArcDirection#ContainsStringEReferenceName(org.eclipse.emf.common.util.EList, java.lang.String) <em>Contains String EReference Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains String EReference Name</em>' operation.
	 * @see dslHeuristicVisualization.ConcreteStrategyArcDirection#ContainsStringEReferenceName(org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getConcreteStrategyArcDirection__ContainsStringEReferenceName__EList_String();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyDefaultDirection <em>Concrete Strategy Default Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Default Direction</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyDefaultDirection
	 * @generated
	 */
	EClass getConcreteStrategyDefaultDirection();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.StrategyNodeSelection <em>Strategy Node Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Node Selection</em>'.
	 * @see dslHeuristicVisualization.StrategyNodeSelection
	 * @generated
	 */
	EClass getStrategyNodeSelection();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.StrategyNodeSelection#IsNode(org.eclipse.emf.ecore.EClass) <em>Is Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Node</em>' operation.
	 * @see dslHeuristicVisualization.StrategyNodeSelection#IsNode(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getStrategyNodeSelection__IsNode__EClass();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyDefaultNodeSelection <em>Concrete Strategy Default Node Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Default Node Selection</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyDefaultNodeSelection
	 * @generated
	 */
	EClass getConcreteStrategyDefaultNodeSelection();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.StrategyPossibleElements <em>Strategy Possible Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Possible Elements</em>'.
	 * @see dslHeuristicVisualization.StrategyPossibleElements
	 * @generated
	 */
	EClass getStrategyPossibleElements();

	/**
	 * Returns the meta object for the reference list '{@link dslHeuristicVisualization.StrategyPossibleElements#getEClassNoElements <em>EClass No Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EClass No Elements</em>'.
	 * @see dslHeuristicVisualization.StrategyPossibleElements#getEClassNoElements()
	 * @see #getStrategyPossibleElements()
	 * @generated
	 */
	EReference getStrategyPossibleElements_EClassNoElements();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.StrategyPossibleElements#PossibleElements(org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Possible Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Possible Elements</em>' operation.
	 * @see dslHeuristicVisualization.StrategyPossibleElements#PossibleElements(org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getStrategyPossibleElements__PossibleElements__EClass_EList_EList();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteStrategyContainmentDiagramElement <em>Concrete Strategy Containment Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Strategy Containment Diagram Element</em>'.
	 * @see dslHeuristicVisualization.ConcreteStrategyContainmentDiagramElement
	 * @generated
	 */
	EClass getConcreteStrategyContainmentDiagramElement();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.EcoreMatrixContainment <em>Ecore Matrix Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Matrix Containment</em>'.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment
	 * @generated
	 */
	EClass getEcoreMatrixContainment();

	/**
	 * Returns the meta object for the attribute '{@link dslHeuristicVisualization.EcoreMatrixContainment#getDirect_MatrixContainment <em>Direct Matrix Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct Matrix Containment</em>'.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment#getDirect_MatrixContainment()
	 * @see #getEcoreMatrixContainment()
	 * @generated
	 */
	EAttribute getEcoreMatrixContainment_Direct_MatrixContainment();

	/**
	 * Returns the meta object for the attribute '{@link dslHeuristicVisualization.EcoreMatrixContainment#getPathMatrix <em>Path Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Matrix</em>'.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment#getPathMatrix()
	 * @see #getEcoreMatrixContainment()
	 * @generated
	 */
	EAttribute getEcoreMatrixContainment_PathMatrix();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.EcoreMatrixContainment#GetParent(java.lang.Integer) <em>Get Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent</em>' operation.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment#GetParent(java.lang.Integer)
	 * @generated
	 */
	EOperation getEcoreMatrixContainment__GetParent__Integer();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.EcoreMatrixContainment#GetDirectMatrixContainment(org.eclipse.emf.common.util.EList) <em>Get Direct Matrix Containment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Direct Matrix Containment</em>' operation.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment#GetDirectMatrixContainment(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getEcoreMatrixContainment__GetDirectMatrixContainment__EList();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.EcoreMatrixContainment#GetPathMatrix() <em>Get Path Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path Matrix</em>' operation.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment#GetPathMatrix()
	 * @generated
	 */
	EOperation getEcoreMatrixContainment__GetPathMatrix();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.EcoreMatrixContainment#CopyMatrix() <em>Copy Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Matrix</em>' operation.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment#CopyMatrix()
	 * @generated
	 */
	EOperation getEcoreMatrixContainment__CopyMatrix();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.EcoreMatrixContainment#PrintDirectMatrixContainment(org.eclipse.emf.common.util.EList) <em>Print Direct Matrix Containment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Direct Matrix Containment</em>' operation.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment#PrintDirectMatrixContainment(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getEcoreMatrixContainment__PrintDirectMatrixContainment__EList();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.EcoreMatrixContainment#getEAllChilds(org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EList) <em>Get EAll Childs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EAll Childs</em>' operation.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment#getEAllChilds(org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getEcoreMatrixContainment__GetEAllChilds__EClass_EList();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.EcoreMatrixContainment#getAllParents(java.lang.Integer) <em>Get All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parents</em>' operation.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment#getAllParents(java.lang.Integer)
	 * @generated
	 */
	EOperation getEcoreMatrixContainment__GetAllParents__Integer();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.HeuristicStrategySettings <em>Heuristic Strategy Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heuristic Strategy Settings</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategySettings
	 * @generated
	 */
	EClass getHeuristicStrategySettings();

	/**
	 * Returns the meta object for the containment reference '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_label <em>Strategy label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy label</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_label()
	 * @see #getHeuristicStrategySettings()
	 * @generated
	 */
	EReference getHeuristicStrategySettings_Strategy_label();

	/**
	 * Returns the meta object for the containment reference '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_root <em>Strategy root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy root</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_root()
	 * @see #getHeuristicStrategySettings()
	 * @generated
	 */
	EReference getHeuristicStrategySettings_Strategy_root();

	/**
	 * Returns the meta object for the containment reference '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_palette <em>Strategy palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy palette</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_palette()
	 * @see #getHeuristicStrategySettings()
	 * @generated
	 */
	EReference getHeuristicStrategySettings_Strategy_palette();

	/**
	 * Returns the meta object for the containment reference '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_arcSelection <em>Strategy arc Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy arc Selection</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_arcSelection()
	 * @see #getHeuristicStrategySettings()
	 * @generated
	 */
	EReference getHeuristicStrategySettings_Strategy_arcSelection();

	/**
	 * Returns the meta object for the containment reference '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_node_selection <em>Strategy node selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy node selection</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_node_selection()
	 * @see #getHeuristicStrategySettings()
	 * @generated
	 */
	EReference getHeuristicStrategySettings_Strategy_node_selection();

	/**
	 * Returns the meta object for the reference '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_possibleElements <em>Strategy possible Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strategy possible Elements</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_possibleElements()
	 * @see #getHeuristicStrategySettings()
	 * @generated
	 */
	EReference getHeuristicStrategySettings_Strategy_possibleElements();

	/**
	 * Returns the meta object for the reference '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_linkcompartment <em>Strategy linkcompartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strategy linkcompartment</em>'.
	 * @see dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_linkcompartment()
	 * @see #getHeuristicStrategySettings()
	 * @generated
	 */
	EReference getHeuristicStrategySettings_Strategy_linkcompartment();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.StrategyLinkCompartment <em>Strategy Link Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Link Compartment</em>'.
	 * @see dslHeuristicVisualization.StrategyLinkCompartment
	 * @generated
	 */
	EClass getStrategyLinkCompartment();

	/**
	 * Returns the meta object for the reference list '{@link dslHeuristicVisualization.StrategyLinkCompartment#getListLinks <em>List Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Links</em>'.
	 * @see dslHeuristicVisualization.StrategyLinkCompartment#getListLinks()
	 * @see #getStrategyLinkCompartment()
	 * @generated
	 */
	EReference getStrategyLinkCompartment_ListLinks();

	/**
	 * Returns the meta object for the reference list '{@link dslHeuristicVisualization.StrategyLinkCompartment#getListCompartment <em>List Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Compartment</em>'.
	 * @see dslHeuristicVisualization.StrategyLinkCompartment#getListCompartment()
	 * @see #getStrategyLinkCompartment()
	 * @generated
	 */
	EReference getStrategyLinkCompartment_ListCompartment();

	/**
	 * Returns the meta object for the reference list '{@link dslHeuristicVisualization.StrategyLinkCompartment#getListAffixed <em>List Affixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Affixed</em>'.
	 * @see dslHeuristicVisualization.StrategyLinkCompartment#getListAffixed()
	 * @see #getStrategyLinkCompartment()
	 * @generated
	 */
	EReference getStrategyLinkCompartment_ListAffixed();

	/**
	 * Returns the meta object for the '{@link dslHeuristicVisualization.StrategyLinkCompartment#ExecuteLinkCompartmentsHeuristics(org.eclipse.emf.ecore.EClass) <em>Execute Link Compartments Heuristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Link Compartments Heuristics</em>' operation.
	 * @see dslHeuristicVisualization.StrategyLinkCompartment#ExecuteLinkCompartmentsHeuristics(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getStrategyLinkCompartment__ExecuteLinkCompartmentsHeuristics__EClass();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteContainmentasAffixed <em>Concrete Containmentas Affixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Containmentas Affixed</em>'.
	 * @see dslHeuristicVisualization.ConcreteContainmentasAffixed
	 * @generated
	 */
	EClass getConcreteContainmentasAffixed();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteContainmentasLinks <em>Concrete Containmentas Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Containmentas Links</em>'.
	 * @see dslHeuristicVisualization.ConcreteContainmentasLinks
	 * @generated
	 */
	EClass getConcreteContainmentasLinks();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.ConcreteContainmentasCompartments <em>Concrete Containmentas Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Containmentas Compartments</em>'.
	 * @see dslHeuristicVisualization.ConcreteContainmentasCompartments
	 * @generated
	 */
	EClass getConcreteContainmentasCompartments();

	/**
	 * Returns the meta object for class '{@link dslHeuristicVisualization.RepreHeurSS <em>Repre Heur SS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repre Heur SS</em>'.
	 * @see dslHeuristicVisualization.RepreHeurSS
	 * @generated
	 */
	EClass getRepreHeurSS();

	/**
	 * Returns the meta object for the containment reference list '{@link dslHeuristicVisualization.RepreHeurSS#getHeuristicStrategySettings <em>Heuristic Strategy Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Heuristic Strategy Settings</em>'.
	 * @see dslHeuristicVisualization.RepreHeurSS#getHeuristicStrategySettings()
	 * @see #getRepreHeurSS()
	 * @generated
	 */
	EReference getRepreHeurSS_HeuristicStrategySettings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslHeuristicVisualizationFactory getDslHeuristicVisualizationFactory();

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
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.HeuristicStrategyImpl <em>Heuristic Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.HeuristicStrategyImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getHeuristicStrategy()
		 * @generated
		 */
		EClass HEURISTIC_STRATEGY = eINSTANCE.getHeuristicStrategy();

		/**
		 * The meta object literal for the '<em><b>Graphic representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION = eINSTANCE.getHeuristicStrategy_Graphic_representation();

		/**
		 * The meta object literal for the '<em><b>Nemf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY__NEMF = eINSTANCE.getHeuristicStrategy_Nemf();

		/**
		 * The meta object literal for the '<em><b>Ecore Containment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY__ECORE_CONTAINMENT = eINSTANCE.getHeuristicStrategy_EcoreContainment();

		/**
		 * The meta object literal for the '<em><b>Current Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEURISTIC_STRATEGY__CURRENT_REPRESENTATION = eINSTANCE.getHeuristicStrategy_CurrentRepresentation();

		/**
		 * The meta object literal for the '<em><b>Current MMGR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEURISTIC_STRATEGY__CURRENT_MMGR = eINSTANCE.getHeuristicStrategy_CurrentMMGR();

		/**
		 * The meta object literal for the '<em><b>List Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY__LIST_REPRESENTATION = eINSTANCE.getHeuristicStrategy_ListRepresentation();

		/**
		 * The meta object literal for the '<em><b>Execute Heuristics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEURISTIC_STRATEGY___EXECUTE_HEURISTICS = eINSTANCE.getHeuristicStrategy__ExecuteHeuristics();

		/**
		 * The meta object literal for the '<em><b>Execute Root Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEURISTIC_STRATEGY___EXECUTE_ROOT_ELEMENT = eINSTANCE.getHeuristicStrategy__Execute_Root_Element();

		/**
		 * The meta object literal for the '<em><b>Execute Graphical Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEURISTIC_STRATEGY___EXECUTE_GRAPHICAL_ELEMENTS = eINSTANCE.getHeuristicStrategy__Execute_Graphical_Elements();

		/**
		 * The meta object literal for the '<em><b>Get Feature Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEURISTIC_STRATEGY___GET_FEATURE_NAME__ECLASS_ECLASS = eINSTANCE.getHeuristicStrategy__GetFeatureName__EClass_EClass();

		/**
		 * The meta object literal for the '<em><b>Get EList EClassfrom EReference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEURISTIC_STRATEGY___GET_ELIST_ECLASSFROM_EREFERENCE__EREFERENCE = eINSTANCE.getHeuristicStrategy__GetEListEClassfromEReference__EReference();

		/**
		 * The meta object literal for the '<em><b>Execute Direct Path Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEURISTIC_STRATEGY___EXECUTE_DIRECT_PATH_MATRIX = eINSTANCE.getHeuristicStrategy__ExecuteDirectPathMatrix();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyLinkImpl <em>Concrete Strategy Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyLinkImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyLink()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_LINK = eINSTANCE.getConcreteStrategyLink();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.StrategyLabel <em>Strategy Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.StrategyLabel
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyLabel()
		 * @generated
		 */
		EClass STRATEGY_LABEL = eINSTANCE.getStrategyLabel();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY_LABEL___GET_LABEL__ECLASS = eINSTANCE.getStrategyLabel__GetLabel__EClass();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyLabelFirstStringImpl <em>Concrete Strategy Label First String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyLabelFirstStringImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyLabelFirstString()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_LABEL_FIRST_STRING = eINSTANCE.getConcreteStrategyLabelFirstString();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyLabelIdentifierImpl <em>Concrete Strategy Label Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyLabelIdentifierImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyLabelIdentifier()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_LABEL_IDENTIFIER = eINSTANCE.getConcreteStrategyLabelIdentifier();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyLabelParameterImpl <em>Concrete Strategy Label Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyLabelParameterImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyLabelParameter()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_LABEL_PARAMETER = eINSTANCE.getConcreteStrategyLabelParameter();

		/**
		 * The meta object literal for the '<em><b>Label parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER = eINSTANCE.getConcreteStrategyLabelParameter_Label_parameter();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.LabelParameterImpl <em>Label Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.LabelParameterImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getLabelParameter()
		 * @generated
		 */
		EClass LABEL_PARAMETER = eINSTANCE.getLabelParameter();

		/**
		 * The meta object literal for the '<em><b>List label</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_PARAMETER__LIST_LABEL = eINSTANCE.getLabelParameter_List_label();

		/**
		 * The meta object literal for the '<em><b>To Comma Separated String Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_PARAMETER___TO_COMMA_SEPARATED_STRING_LABEL = eINSTANCE.getLabelParameter__ToCommaSeparatedStringLabel();

		/**
		 * The meta object literal for the '<em><b>Default Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_PARAMETER___DEFAULT_PARAMETERS = eINSTANCE.getLabelParameter__DefaultParameters();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.StrategyRootSelection <em>Strategy Root Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.StrategyRootSelection
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyRootSelection()
		 * @generated
		 */
		EClass STRATEGY_ROOT_SELECTION = eINSTANCE.getStrategyRootSelection();

		/**
		 * The meta object literal for the '<em><b>Get Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY_ROOT_SELECTION___GET_ROOT__ELIST_ELIST = eINSTANCE.getStrategyRootSelection__Get_Root__EList_EList();

		/**
		 * The meta object literal for the '<em><b>List Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY_ROOT_SELECTION___LIST_ROOT__ELIST_ELIST = eINSTANCE.getStrategyRootSelection__List_Root__EList_EList();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyMaxContainmentImpl <em>Concrete Strategy Max Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyMaxContainmentImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyMaxContainment()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_MAX_CONTAINMENT = eINSTANCE.getConcreteStrategyMaxContainment();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyNoParentImpl <em>Concrete Strategy No Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyNoParentImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyNoParent()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_NO_PARENT = eINSTANCE.getConcreteStrategyNoParent();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.StrategyPalette <em>Strategy Palette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.StrategyPalette
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyPalette()
		 * @generated
		 */
		EClass STRATEGY_PALETTE = eINSTANCE.getStrategyPalette();

		/**
		 * The meta object literal for the '<em><b>Get Palette</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY_PALETTE___GET_PALETTE__EOBJECT = eINSTANCE.getStrategyPalette__Get_Palette__EObject();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyPaletteImpl <em>Concrete Strategy Palette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyPaletteImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyPalette()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_PALETTE = eINSTANCE.getConcreteStrategyPalette();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.StrategyArcSelection <em>Strategy Arc Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.StrategyArcSelection
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyArcSelection()
		 * @generated
		 */
		EClass STRATEGY_ARC_SELECTION = eINSTANCE.getStrategyArcSelection();

		/**
		 * The meta object literal for the '<em><b>Arc direction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_ARC_SELECTION__ARC_DIRECTION = eINSTANCE.getStrategyArcSelection_Arc_direction();

		/**
		 * The meta object literal for the '<em><b>Is Arc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY_ARC_SELECTION___IS_ARC__ECLASS = eINSTANCE.getStrategyArcSelection__IsArc__EClass();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyArcSelectionImpl <em>Concrete Strategy Arc Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyArcSelectionImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyArcSelection()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_ARC_SELECTION = eINSTANCE.getConcreteStrategyArcSelection();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.StrategyArcDirection <em>Strategy Arc Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.StrategyArcDirection
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyArcDirection()
		 * @generated
		 */
		EClass STRATEGY_ARC_DIRECTION = eINSTANCE.getStrategyArcDirection();

		/**
		 * The meta object literal for the '<em><b>Get Direction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY_ARC_DIRECTION___GET_DIRECTION__ECLASS = eINSTANCE.getStrategyArcDirection__Get_Direction__EClass();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.ArcParameter <em>Arc Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.ArcParameter
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getArcParameter()
		 * @generated
		 */
		EClass ARC_PARAMETER = eINSTANCE.getArcParameter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_PARAMETER__SOURCE = eINSTANCE.getArcParameter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_PARAMETER__TARGET = eINSTANCE.getArcParameter_Target();

		/**
		 * The meta object literal for the '<em><b>Default Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARC_PARAMETER___DEFAULT_PARAM = eINSTANCE.getArcParameter__DefaultParam();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.DefaultArcParameterImpl <em>Default Arc Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.DefaultArcParameterImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getDefaultArcParameter()
		 * @generated
		 */
		EClass DEFAULT_ARC_PARAMETER = eINSTANCE.getDefaultArcParameter();

		/**
		 * The meta object literal for the '<em><b>To Comma Separated String Source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFAULT_ARC_PARAMETER___TO_COMMA_SEPARATED_STRING_SOURCE = eINSTANCE.getDefaultArcParameter__ToCommaSeparatedStringSource();

		/**
		 * The meta object literal for the '<em><b>To Comma Separated String Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFAULT_ARC_PARAMETER___TO_COMMA_SEPARATED_STRING_TARGET = eINSTANCE.getDefaultArcParameter__ToCommaSeparatedStringTarget();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyArcDirectionImpl <em>Concrete Strategy Arc Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyArcDirectionImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyArcDirection()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_ARC_DIRECTION = eINSTANCE.getConcreteStrategyArcDirection();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_STRATEGY_ARC_DIRECTION__PARAM = eINSTANCE.getConcreteStrategyArcDirection_Param();

		/**
		 * The meta object literal for the '<em><b>Contains String EReference Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONCRETE_STRATEGY_ARC_DIRECTION___CONTAINS_STRING_EREFERENCE_NAME__ELIST_STRING = eINSTANCE.getConcreteStrategyArcDirection__ContainsStringEReferenceName__EList_String();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyDefaultDirectionImpl <em>Concrete Strategy Default Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyDefaultDirectionImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyDefaultDirection()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_DEFAULT_DIRECTION = eINSTANCE.getConcreteStrategyDefaultDirection();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.StrategyNodeSelection <em>Strategy Node Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.StrategyNodeSelection
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyNodeSelection()
		 * @generated
		 */
		EClass STRATEGY_NODE_SELECTION = eINSTANCE.getStrategyNodeSelection();

		/**
		 * The meta object literal for the '<em><b>Is Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY_NODE_SELECTION___IS_NODE__ECLASS = eINSTANCE.getStrategyNodeSelection__IsNode__EClass();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyDefaultNodeSelectionImpl <em>Concrete Strategy Default Node Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyDefaultNodeSelectionImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyDefaultNodeSelection()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION = eINSTANCE.getConcreteStrategyDefaultNodeSelection();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.StrategyPossibleElements <em>Strategy Possible Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.StrategyPossibleElements
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyPossibleElements()
		 * @generated
		 */
		EClass STRATEGY_POSSIBLE_ELEMENTS = eINSTANCE.getStrategyPossibleElements();

		/**
		 * The meta object literal for the '<em><b>EClass No Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_POSSIBLE_ELEMENTS__ECLASS_NO_ELEMENTS = eINSTANCE.getStrategyPossibleElements_EClassNoElements();

		/**
		 * The meta object literal for the '<em><b>Possible Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY_POSSIBLE_ELEMENTS___POSSIBLE_ELEMENTS__ECLASS_ELIST_ELIST = eINSTANCE.getStrategyPossibleElements__PossibleElements__EClass_EList_EList();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteStrategyContainmentDiagramElementImpl <em>Concrete Strategy Containment Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteStrategyContainmentDiagramElementImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteStrategyContainmentDiagramElement()
		 * @generated
		 */
		EClass CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT = eINSTANCE.getConcreteStrategyContainmentDiagramElement();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.EcoreMatrixContainmentImpl <em>Ecore Matrix Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.EcoreMatrixContainmentImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getEcoreMatrixContainment()
		 * @generated
		 */
		EClass ECORE_MATRIX_CONTAINMENT = eINSTANCE.getEcoreMatrixContainment();

		/**
		 * The meta object literal for the '<em><b>Direct Matrix Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_MATRIX_CONTAINMENT__DIRECT_MATRIX_CONTAINMENT = eINSTANCE.getEcoreMatrixContainment_Direct_MatrixContainment();

		/**
		 * The meta object literal for the '<em><b>Path Matrix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_MATRIX_CONTAINMENT__PATH_MATRIX = eINSTANCE.getEcoreMatrixContainment_PathMatrix();

		/**
		 * The meta object literal for the '<em><b>Get Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_MATRIX_CONTAINMENT___GET_PARENT__INTEGER = eINSTANCE.getEcoreMatrixContainment__GetParent__Integer();

		/**
		 * The meta object literal for the '<em><b>Get Direct Matrix Containment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_MATRIX_CONTAINMENT___GET_DIRECT_MATRIX_CONTAINMENT__ELIST = eINSTANCE.getEcoreMatrixContainment__GetDirectMatrixContainment__EList();

		/**
		 * The meta object literal for the '<em><b>Get Path Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_MATRIX_CONTAINMENT___GET_PATH_MATRIX = eINSTANCE.getEcoreMatrixContainment__GetPathMatrix();

		/**
		 * The meta object literal for the '<em><b>Copy Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_MATRIX_CONTAINMENT___COPY_MATRIX = eINSTANCE.getEcoreMatrixContainment__CopyMatrix();

		/**
		 * The meta object literal for the '<em><b>Print Direct Matrix Containment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_MATRIX_CONTAINMENT___PRINT_DIRECT_MATRIX_CONTAINMENT__ELIST = eINSTANCE.getEcoreMatrixContainment__PrintDirectMatrixContainment__EList();

		/**
		 * The meta object literal for the '<em><b>Get EAll Childs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_MATRIX_CONTAINMENT___GET_EALL_CHILDS__ECLASS_ELIST = eINSTANCE.getEcoreMatrixContainment__GetEAllChilds__EClass_EList();

		/**
		 * The meta object literal for the '<em><b>Get All Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_MATRIX_CONTAINMENT___GET_ALL_PARENTS__INTEGER = eINSTANCE.getEcoreMatrixContainment__GetAllParents__Integer();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl <em>Heuristic Strategy Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getHeuristicStrategySettings()
		 * @generated
		 */
		EClass HEURISTIC_STRATEGY_SETTINGS = eINSTANCE.getHeuristicStrategySettings();

		/**
		 * The meta object literal for the '<em><b>Strategy label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL = eINSTANCE.getHeuristicStrategySettings_Strategy_label();

		/**
		 * The meta object literal for the '<em><b>Strategy root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT = eINSTANCE.getHeuristicStrategySettings_Strategy_root();

		/**
		 * The meta object literal for the '<em><b>Strategy palette</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE = eINSTANCE.getHeuristicStrategySettings_Strategy_palette();

		/**
		 * The meta object literal for the '<em><b>Strategy arc Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION = eINSTANCE.getHeuristicStrategySettings_Strategy_arcSelection();

		/**
		 * The meta object literal for the '<em><b>Strategy node selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION = eINSTANCE.getHeuristicStrategySettings_Strategy_node_selection();

		/**
		 * The meta object literal for the '<em><b>Strategy possible Elements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY_SETTINGS__STRATEGY_POSSIBLE_ELEMENTS = eINSTANCE.getHeuristicStrategySettings_Strategy_possibleElements();

		/**
		 * The meta object literal for the '<em><b>Strategy linkcompartment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LINKCOMPARTMENT = eINSTANCE.getHeuristicStrategySettings_Strategy_linkcompartment();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.StrategyLinkCompartment <em>Strategy Link Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.StrategyLinkCompartment
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getStrategyLinkCompartment()
		 * @generated
		 */
		EClass STRATEGY_LINK_COMPARTMENT = eINSTANCE.getStrategyLinkCompartment();

		/**
		 * The meta object literal for the '<em><b>List Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_LINK_COMPARTMENT__LIST_LINKS = eINSTANCE.getStrategyLinkCompartment_ListLinks();

		/**
		 * The meta object literal for the '<em><b>List Compartment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_LINK_COMPARTMENT__LIST_COMPARTMENT = eINSTANCE.getStrategyLinkCompartment_ListCompartment();

		/**
		 * The meta object literal for the '<em><b>List Affixed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_LINK_COMPARTMENT__LIST_AFFIXED = eINSTANCE.getStrategyLinkCompartment_ListAffixed();

		/**
		 * The meta object literal for the '<em><b>Execute Link Compartments Heuristics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY_LINK_COMPARTMENT___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS = eINSTANCE.getStrategyLinkCompartment__ExecuteLinkCompartmentsHeuristics__EClass();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteContainmentasAffixedImpl <em>Concrete Containmentas Affixed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteContainmentasAffixedImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteContainmentasAffixed()
		 * @generated
		 */
		EClass CONCRETE_CONTAINMENTAS_AFFIXED = eINSTANCE.getConcreteContainmentasAffixed();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteContainmentasLinksImpl <em>Concrete Containmentas Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteContainmentasLinksImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteContainmentasLinks()
		 * @generated
		 */
		EClass CONCRETE_CONTAINMENTAS_LINKS = eINSTANCE.getConcreteContainmentasLinks();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.ConcreteContainmentasCompartmentsImpl <em>Concrete Containmentas Compartments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.ConcreteContainmentasCompartmentsImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getConcreteContainmentasCompartments()
		 * @generated
		 */
		EClass CONCRETE_CONTAINMENTAS_COMPARTMENTS = eINSTANCE.getConcreteContainmentasCompartments();

		/**
		 * The meta object literal for the '{@link dslHeuristicVisualization.impl.RepreHeurSSImpl <em>Repre Heur SS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslHeuristicVisualization.impl.RepreHeurSSImpl
		 * @see dslHeuristicVisualization.impl.DslHeuristicVisualizationPackageImpl#getRepreHeurSS()
		 * @generated
		 */
		EClass REPRE_HEUR_SS = eINSTANCE.getRepreHeurSS();

		/**
		 * The meta object literal for the '<em><b>Heuristic Strategy Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRE_HEUR_SS__HEURISTIC_STRATEGY_SETTINGS = eINSTANCE.getRepreHeurSS_HeuristicStrategySettings();

	}

} //DslHeuristicVisualizationPackage
