/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see graphic_representation.Graphic_representationFactory
 * @model kind="package"
 * @generated
 */
public interface Graphic_representationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphic_representation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.org/graphic_representation/1.0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphicR";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Graphic_representationPackage eINSTANCE = graphic_representation.impl.Graphic_representationPackageImpl.init();

	/**
	 * The meta object id for the '{@link graphic_representation.impl.MMGraphic_RepresentationImpl <em>MM Graphic Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.MMGraphic_RepresentationImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getMMGraphic_Representation()
	 * @generated
	 */
	int MM_GRAPHIC_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_GRAPHIC_REPRESENTATION__EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>List Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_GRAPHIC_REPRESENTATION__LIST_REPRESENTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Is Geopalette</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_GRAPHIC_REPRESENTATION__IS_GEOPALETTE = 2;

	/**
	 * The number of structural features of the '<em>MM Graphic Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_GRAPHIC_REPRESENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MM Graphic Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_GRAPHIC_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.AllElementsImpl <em>All Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.AllElementsImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAllElements()
	 * @generated
	 */
	int ALL_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>All Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ELEMENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>All Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.DiagramElementImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__AN_ECLASS = ALL_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diag palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__DIAG_PALETTE = ALL_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__CONTAINER_REFERENCE = ALL_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = ALL_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_OPERATION_COUNT = ALL_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.AbstractElementImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAbstractElement()
	 * @generated
	 */
	int ABSTRACT_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__AN_ECLASS = ALL_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__NODE_ELEMENTS = ALL_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_FEATURE_COUNT = ALL_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_OPERATION_COUNT = ALL_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.EdgeImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 4;

	/**
	 * The feature id for the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__AN_ECLASS = DIAGRAM_ELEMENT__AN_ECLASS;

	/**
	 * The feature id for the '<em><b>Diag palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DIAG_PALETTE = DIAGRAM_ELEMENT__DIAG_PALETTE;

	/**
	 * The feature id for the '<em><b>Container Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONTAINER_REFERENCE = DIAGRAM_ELEMENT__CONTAINER_REFERENCE;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DIRECTIONS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edge style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDGE_STYLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edge Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDGE_LABEL = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.EdgeLabelEAttributeImpl <em>Edge Label EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.EdgeLabelEAttributeImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEdgeLabelEAttribute()
	 * @generated
	 */
	int EDGE_LABEL_EATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Label EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_EATTRIBUTE__LABEL_EATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Edge Label EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_EATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Edge Label EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_EATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.NodeImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AN_ECLASS = DIAGRAM_ELEMENT__AN_ECLASS;

	/**
	 * The feature id for the '<em><b>Diag palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DIAG_PALETTE = DIAGRAM_ELEMENT__DIAG_PALETTE;

	/**
	 * The feature id for the '<em><b>Container Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAINER_REFERENCE = DIAGRAM_ELEMENT__CONTAINER_REFERENCE;

	/**
	 * The feature id for the '<em><b>Node elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_ELEMENTS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_SHAPE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expandable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EXPANDABLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditional Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONDITIONAL_STYLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PRESENTATION = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.IconElementImpl <em>Icon Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.IconElementImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getIconElement()
	 * @generated
	 */
	int ICON_ELEMENT = 7;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.PaletteDescriptionImpl <em>Palette Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.PaletteDescriptionImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getPaletteDescription()
	 * @generated
	 */
	int PALETTE_DESCRIPTION = 8;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.Node_ElementImpl <em>Node Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.Node_ElementImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getNode_Element()
	 * @generated
	 */
	int NODE_ELEMENT = 9;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.RootImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 12;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.Edge_DirectionImpl <em>Edge Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.Edge_DirectionImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEdge_Direction()
	 * @generated
	 */
	int EDGE_DIRECTION = 13;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.GraphicRepresentationImpl <em>Graphic Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.GraphicRepresentationImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGraphicRepresentation()
	 * @generated
	 */
	int GRAPHIC_REPRESENTATION = 14;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.ShapeImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 15;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Filepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT__FILEPATH = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Embedded Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT__EMBEDDED_IMAGE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Icon Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Image Base64</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT___IMAGE_BASE64 = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Icon Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon filepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION__ICON_FILEPATH = 0;

	/**
	 * The feature id for the '<em><b>Palette name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION__PALETTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION__IS_DRAGGABLE = 2;

	/**
	 * The number of structural features of the '<em>Palette Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Palette Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Labelan EAttribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__LABELAN_EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Link Palette</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__LINK_PALETTE = 1;

	/**
	 * The feature id for the '<em><b>Affixed Compartment Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__AFFIXED_COMPARTMENT_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Expandable Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__EXPANDABLE_ITEMS = 3;

	/**
	 * The number of structural features of the '<em>Node Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Is Compartment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT___IS_COMPARTMENT = 0;

	/**
	 * The number of operations of the '<em>Node Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.ExpandableItemImpl <em>Expandable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.ExpandableItemImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getExpandableItem()
	 * @generated
	 */
	int EXPANDABLE_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDABLE_ITEM__INDEX = 0;

	/**
	 * The feature id for the '<em><b>An EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDABLE_ITEM__AN_EREFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Expandable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDABLE_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expandable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDABLE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.ShapeCompartmentGradientImpl <em>Shape Compartment Gradient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.ShapeCompartmentGradientImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getShapeCompartmentGradient()
	 * @generated
	 */
	int SHAPE_COMPARTMENT_GRADIENT = 16;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.ShapeCompartmentParallelogramImpl <em>Shape Compartment Parallelogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.ShapeCompartmentParallelogramImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getShapeCompartmentParallelogram()
	 * @generated
	 */
	int SHAPE_COMPARTMENT_PARALLELOGRAM = 17;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.EllipseImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 18;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.RectangleImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 21;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.ShapeColorImpl <em>Shape Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.ShapeColorImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getShapeColor()
	 * @generated
	 */
	int SHAPE_COLOR = 22;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COLOR__COLOR = 0;

	/**
	 * The number of structural features of the '<em>Shape Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COLOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shape Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COLOR_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link graphic_representation.impl.Edge_StyleImpl <em>Edge Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.Edge_StyleImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEdge_Style()
	 * @generated
	 */
	int EDGE_STYLE = 11;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__COLOR = SHAPE_COLOR__COLOR;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__LINE_STYLE = SHAPE_COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__LINE_WIDTH = SHAPE_COLOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_FEATURE_COUNT = SHAPE_COLOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_OPERATION_COUNT = SHAPE_COLOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__AN_ECLASS = 0;

	/**
	 * The feature id for the '<em><b>Root node elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ROOT_NODE_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Root shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ROOT_SHAPE = 2;

	/**
	 * The feature id for the '<em><b>Root Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ROOT_LAYER = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Source Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DIRECTION__SOURCE_LINK = 0;

	/**
	 * The feature id for the '<em><b>Target Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DIRECTION__TARGET_LINK = 1;

	/**
	 * The number of structural features of the '<em>Edge Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DIRECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Edge Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DIRECTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>All Graphic Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_REPRESENTATION__ALL_GRAPHIC_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_REPRESENTATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>User Colors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_REPRESENTATION__USER_COLORS = 2;

	/**
	 * The number of structural features of the '<em>Graphic Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_REPRESENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Graphic Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT__COLOR = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT__BORDER_STYLE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT__BORDER_WIDTH = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT__WIDTH = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT__HEIGHT = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Corner Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT__CORNER_HEIGHT = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Corner Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT__CORNER_WIDTH = SHAPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fore Ground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR = SHAPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Shape Compartment Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Shape Compartment Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_GRADIENT_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_PARALLELOGRAM__COLOR = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_PARALLELOGRAM__BORDER_STYLE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_PARALLELOGRAM__BORDER_WIDTH = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_PARALLELOGRAM__BORDER_COLOR = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_PARALLELOGRAM__WIDTH = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_PARALLELOGRAM__HEIGHT = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Shape Compartment Parallelogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_PARALLELOGRAM_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Shape Compartment Parallelogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_COMPARTMENT_PARALLELOGRAM_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__COLOR = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BORDER_STYLE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BORDER_WIDTH = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BORDER_COLOR = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Horizontal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__HORIZONTAL_DIAMETER = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vertical Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__VERTICAL_DIAMETER = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.NoteImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 19;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__COLOR = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__BORDER_STYLE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__BORDER_WIDTH = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__BORDER_COLOR = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__SIZE = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.DiamondImpl <em>Diamond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.DiamondImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getDiamond()
	 * @generated
	 */
	int DIAMOND = 20;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__COLOR = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__BORDER_STYLE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__BORDER_WIDTH = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__BORDER_COLOR = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__SIZE = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Diamond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Diamond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__COLOR = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BORDER_STYLE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BORDER_WIDTH = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BORDER_COLOR = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__WIDTH = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__HEIGHT = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.LinkImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 23;

	/**
	 * The feature id for the '<em><b>An EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__AN_EREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>An Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__AN_DIAGRAM_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Decorator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DECORATOR_NAME = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link graphic_representation.impl.PaletteDescriptionLinkImpl <em>Palette Description Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.PaletteDescriptionLinkImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getPaletteDescriptionLink()
	 * @generated
	 */
	int PALETTE_DESCRIPTION_LINK = 24;

	/**
	 * The feature id for the '<em><b>Icon filepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__ICON_FILEPATH = PALETTE_DESCRIPTION__ICON_FILEPATH;

	/**
	 * The feature id for the '<em><b>Palette name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__PALETTE_NAME = PALETTE_DESCRIPTION__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Is Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__IS_DRAGGABLE = PALETTE_DESCRIPTION__IS_DRAGGABLE;

	/**
	 * The feature id for the '<em><b>An EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__AN_EREFERENCE = PALETTE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>An Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__AN_DIAGRAM_ELEMENT = PALETTE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decorator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__DECORATOR_NAME = PALETTE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__COLOR = PALETTE_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__LINE_STYLE = PALETTE_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__LINE_WIDTH = PALETTE_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Decorator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK__SOURCE_DECORATOR_NAME = PALETTE_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Palette Description Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK_FEATURE_COUNT = PALETTE_DESCRIPTION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Palette Description Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_DESCRIPTION_LINK_OPERATION_COUNT = PALETTE_DESCRIPTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link graphic_representation.Layer <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.Layer
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.DefaultLayerImpl <em>Default Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.DefaultLayerImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getDefaultLayer()
	 * @generated
	 */
	int DEFAULT_LAYER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LAYER__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LAYER__ELEMENTS = LAYER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Default Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LAYER_FEATURE_COUNT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LAYER_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.AdditionalLayerImpl <em>Additional Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.AdditionalLayerImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAdditionalLayer()
	 * @generated
	 */
	int ADDITIONAL_LAYER = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_LAYER__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_LAYER__ELEMENTS = LAYER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Additional Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_LAYER_FEATURE_COUNT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Additional Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_LAYER_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link graphic_representation.impl.AffixedCompartmentElementImpl <em>Affixed Compartment Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.AffixedCompartmentElementImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAffixedCompartmentElement()
	 * @generated
	 */
	int AFFIXED_COMPARTMENT_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>An EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_COMPARTMENT_ELEMENT__NODES = 1;

	/**
	 * The number of structural features of the '<em>Affixed Compartment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_COMPARTMENT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Affixed Compartment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_COMPARTMENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.AffixedElementImpl <em>Affixed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.AffixedElementImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAffixedElement()
	 * @generated
	 */
	int AFFIXED_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>An EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_ELEMENT__AN_EREFERENCE = AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_ELEMENT__NODES = AFFIXED_COMPARTMENT_ELEMENT__NODES;

	/**
	 * The number of structural features of the '<em>Affixed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_ELEMENT_FEATURE_COUNT = AFFIXED_COMPARTMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Affixed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_ELEMENT_OPERATION_COUNT = AFFIXED_COMPARTMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.CompartmentElementImpl <em>Compartment Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.CompartmentElementImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getCompartmentElement()
	 * @generated
	 */
	int COMPARTMENT_ELEMENT = 29;

	/**
	 * The feature id for the '<em><b>An EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT__AN_EREFERENCE = AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT__NODES = AFFIXED_COMPARTMENT_ELEMENT__NODES;

	/**
	 * The number of structural features of the '<em>Compartment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT_FEATURE_COUNT = AFFIXED_COMPARTMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compartment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT_OPERATION_COUNT = AFFIXED_COMPARTMENT_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link graphic_representation.impl.LabelEAttributeImpl <em>Label EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.LabelEAttributeImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLabelEAttribute()
	 * @generated
	 */
	int LABEL_EATTRIBUTE = 31;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE__COLOR = SHAPE_COLOR__COLOR;

	/**
	 * The feature id for the '<em><b>Label Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE__LABEL_FORMAT = SHAPE_COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE__SHOW_ICON = SHAPE_COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE__LABEL_POSITION = SHAPE_COLOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>An EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE__AN_EATTRIBUTE = SHAPE_COLOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Label EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE_FEATURE_COUNT = SHAPE_COLOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Label EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE_OPERATION_COUNT = SHAPE_COLOR_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link graphic_representation.impl.BorderImpl <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.BorderImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 32;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__BORDER_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__BORDER_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__BORDER_COLOR = 2;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link graphic_representation.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.ColorImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 33;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.GRUserColorImpl <em>GR User Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.GRUserColorImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRUserColor()
	 * @generated
	 */
	int GR_USER_COLOR = 34;

	/**
	 * The number of structural features of the '<em>GR User Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_USER_COLOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>GR User Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_USER_COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.GRUserColorDefImpl <em>GR User Color Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.GRUserColorDefImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRUserColorDef()
	 * @generated
	 */
	int GR_USER_COLOR_DEF = 35;

	/**
	 * The feature id for the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_USER_COLOR_DEF__COLOR = COLOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GR User Color Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_USER_COLOR_DEF_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GR User Color Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_USER_COLOR_DEF_OPERATION_COUNT = COLOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.GRColorDescriptionImpl <em>GR Color Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.GRColorDescriptionImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRColorDescription()
	 * @generated
	 */
	int GR_COLOR_DESCRIPTION = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_COLOR_DESCRIPTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>GR Color Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_COLOR_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GR Color Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_COLOR_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.RGBColorDescriptionImpl <em>RGB Color Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.RGBColorDescriptionImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRGBColorDescription()
	 * @generated
	 */
	int RGB_COLOR_DESCRIPTION = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_DESCRIPTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>RGB Color Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RGB Color Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.RGBColorImpl <em>RGB Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.RGBColorImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRGBColor()
	 * @generated
	 */
	int RGB_COLOR = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__NAME = GR_USER_COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__RED = GR_USER_COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__GREEN = GR_USER_COLOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__BLUE = GR_USER_COLOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_FEATURE_COUNT = GR_USER_COLOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_OPERATION_COUNT = GR_USER_COLOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.SiriusSystemColorsImpl <em>Sirius System Colors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.SiriusSystemColorsImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getSiriusSystemColors()
	 * @generated
	 */
	int SIRIUS_SYSTEM_COLORS = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_SYSTEM_COLORS__NAME = COLOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sirius System Colors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_SYSTEM_COLORS_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get System Color Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_SYSTEM_COLORS___GET_SYSTEM_COLOR_DESCRIPTION__STRING = COLOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sirius System Colors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_SYSTEM_COLORS_OPERATION_COUNT = COLOR_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link graphic_representation.impl.GRLabelStyleDescriptionImpl <em>GR Label Style Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.GRLabelStyleDescriptionImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRLabelStyleDescription()
	 * @generated
	 */
	int GR_LABEL_STYLE_DESCRIPTION = 40;

	/**
	 * The feature id for the '<em><b>Label Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Show Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LABEL_STYLE_DESCRIPTION__SHOW_ICON = 1;

	/**
	 * The feature id for the '<em><b>Label Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LABEL_STYLE_DESCRIPTION__LABEL_POSITION = 2;

	/**
	 * The number of structural features of the '<em>GR Label Style Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LABEL_STYLE_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GR Label Style Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LABEL_STYLE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.RepresentationImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 41;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.RepresentationTableImpl <em>Representation Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.RepresentationTableImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRepresentationTable()
	 * @generated
	 */
	int REPRESENTATION_TABLE = 43;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.RepresentationDDImpl <em>Representation DD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.RepresentationDDImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRepresentationDD()
	 * @generated
	 */
	int REPRESENTATION_DD = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_DD__NAME = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_DD__ROOT = REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_DD__LAYERS = REPRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Representation DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_DD_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Representation DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_DD_OPERATION_COUNT = REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TABLE__ROOT_TABLE = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TABLE__LINES = REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TABLE__COLUMNS = REPRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Representation Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TABLE_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Representation Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_TABLE_OPERATION_COUNT = REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.LineImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 44;

	/**
	 * The feature id for the '<em><b>Feature Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FEATURE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>List EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LIST_ECLASSES = 1;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.LineGroupImpl <em>Line Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.LineGroupImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLineGroup()
	 * @generated
	 */
	int LINE_GROUP = 45;

	/**
	 * The feature id for the '<em><b>Feature Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_GROUP__FEATURE_REFERENCE = LINE__FEATURE_REFERENCE;

	/**
	 * The feature id for the '<em><b>List EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_GROUP__LIST_ECLASSES = LINE__LIST_ECLASSES;

	/**
	 * The feature id for the '<em><b>List Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_GROUP__LIST_LINES = LINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_GROUP_FEATURE_COUNT = LINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_GROUP_OPERATION_COUNT = LINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graphic_representation.impl.ConditionalStyleImpl <em>Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.impl.ConditionalStyleImpl
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getConditionalStyle()
	 * @generated
	 */
	int CONDITIONAL_STYLE = 46;

	/**
	 * The feature id for the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STYLE__EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STYLE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Conditional Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STYLE__CONDITIONAL_STYLE = 2;

	/**
	 * The number of structural features of the '<em>Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STYLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.GRFontFormat <em>GR Font Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.GRFontFormat
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRFontFormat()
	 * @generated
	 */
	int GR_FONT_FORMAT = 47;

	/**
	 * The meta object id for the '{@link graphic_representation.LabelPosition <em>Label Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.LabelPosition
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLabelPosition()
	 * @generated
	 */
	int LABEL_POSITION = 48;


	/**
	 * The meta object id for the '{@link graphic_representation.ChildrenPresentation <em>Children Presentation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.ChildrenPresentation
	 * @see graphic_representation.impl.Graphic_representationPackageImpl#getChildrenPresentation()
	 * @generated
	 */
	int CHILDREN_PRESENTATION = 49;


	/**
	 * Returns the meta object for class '{@link graphic_representation.MMGraphic_Representation <em>MM Graphic Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MM Graphic Representation</em>'.
	 * @see graphic_representation.MMGraphic_Representation
	 * @generated
	 */
	EClass getMMGraphic_Representation();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.MMGraphic_Representation#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see graphic_representation.MMGraphic_Representation#getExtension()
	 * @see #getMMGraphic_Representation()
	 * @generated
	 */
	EAttribute getMMGraphic_Representation_Extension();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.MMGraphic_Representation#getListRepresentations <em>List Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Representations</em>'.
	 * @see graphic_representation.MMGraphic_Representation#getListRepresentations()
	 * @see #getMMGraphic_Representation()
	 * @generated
	 */
	EReference getMMGraphic_Representation_ListRepresentations();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.MMGraphic_Representation#isIsGeopalette <em>Is Geopalette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Geopalette</em>'.
	 * @see graphic_representation.MMGraphic_Representation#isIsGeopalette()
	 * @see #getMMGraphic_Representation()
	 * @generated
	 */
	EAttribute getMMGraphic_Representation_IsGeopalette();

	/**
	 * Returns the meta object for class '{@link graphic_representation.AllElements <em>All Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Elements</em>'.
	 * @see graphic_representation.AllElements
	 * @generated
	 */
	EClass getAllElements();

	/**
	 * Returns the meta object for class '{@link graphic_representation.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see graphic_representation.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.DiagramElement#getAnEClass <em>An EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EClass</em>'.
	 * @see graphic_representation.DiagramElement#getAnEClass()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_AnEClass();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.DiagramElement#getDiag_palette <em>Diag palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diag palette</em>'.
	 * @see graphic_representation.DiagramElement#getDiag_palette()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Diag_palette();

	/**
	 * Returns the meta object for the reference list '{@link graphic_representation.DiagramElement#getContainerReference <em>Container Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container Reference</em>'.
	 * @see graphic_representation.DiagramElement#getContainerReference()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_ContainerReference();

	/**
	 * Returns the meta object for class '{@link graphic_representation.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element</em>'.
	 * @see graphic_representation.AbstractElement
	 * @generated
	 */
	EClass getAbstractElement();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.AbstractElement#getAnEClass <em>An EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EClass</em>'.
	 * @see graphic_representation.AbstractElement#getAnEClass()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EReference getAbstractElement_AnEClass();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.AbstractElement#getNode_elements <em>Node elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node elements</em>'.
	 * @see graphic_representation.AbstractElement#getNode_elements()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EReference getAbstractElement_Node_elements();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see graphic_representation.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Edge#getDirections <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Directions</em>'.
	 * @see graphic_representation.Edge#getDirections()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Directions();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Edge#getEdge_style <em>Edge style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edge style</em>'.
	 * @see graphic_representation.Edge#getEdge_style()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Edge_style();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Edge#getEdgeLabel <em>Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edge Label</em>'.
	 * @see graphic_representation.Edge#getEdgeLabel()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_EdgeLabel();

	/**
	 * Returns the meta object for class '{@link graphic_representation.EdgeLabelEAttribute <em>Edge Label EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Label EAttribute</em>'.
	 * @see graphic_representation.EdgeLabelEAttribute
	 * @generated
	 */
	EClass getEdgeLabelEAttribute();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.EdgeLabelEAttribute#getLabelEAttribute <em>Label EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label EAttribute</em>'.
	 * @see graphic_representation.EdgeLabelEAttribute#getLabelEAttribute()
	 * @see #getEdgeLabelEAttribute()
	 * @generated
	 */
	EReference getEdgeLabelEAttribute_LabelEAttribute();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see graphic_representation.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Node#getNode_elements <em>Node elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node elements</em>'.
	 * @see graphic_representation.Node#getNode_elements()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Node_elements();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Node#getNode_shape <em>Node shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node shape</em>'.
	 * @see graphic_representation.Node#getNode_shape()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Node_shape();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Node#isExpandable <em>Expandable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expandable</em>'.
	 * @see graphic_representation.Node#isExpandable()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Expandable();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.Node#getConditionalStyle <em>Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Style</em>'.
	 * @see graphic_representation.Node#getConditionalStyle()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ConditionalStyle();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Node#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see graphic_representation.Node#getPresentation()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Presentation();

	/**
	 * Returns the meta object for class '{@link graphic_representation.IconElement <em>Icon Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Element</em>'.
	 * @see graphic_representation.IconElement
	 * @generated
	 */
	EClass getIconElement();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.IconElement#getFilepath <em>Filepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filepath</em>'.
	 * @see graphic_representation.IconElement#getFilepath()
	 * @see #getIconElement()
	 * @generated
	 */
	EAttribute getIconElement_Filepath();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.IconElement#getEmbeddedImage <em>Embedded Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded Image</em>'.
	 * @see graphic_representation.IconElement#getEmbeddedImage()
	 * @see #getIconElement()
	 * @generated
	 */
	EAttribute getIconElement_EmbeddedImage();

	/**
	 * Returns the meta object for the '{@link graphic_representation.IconElement#ImageBase64() <em>Image Base64</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Image Base64</em>' operation.
	 * @see graphic_representation.IconElement#ImageBase64()
	 * @generated
	 */
	EOperation getIconElement__ImageBase64();

	/**
	 * Returns the meta object for class '{@link graphic_representation.PaletteDescription <em>Palette Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palette Description</em>'.
	 * @see graphic_representation.PaletteDescription
	 * @generated
	 */
	EClass getPaletteDescription();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.PaletteDescription#getIcon_filepath <em>Icon filepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon filepath</em>'.
	 * @see graphic_representation.PaletteDescription#getIcon_filepath()
	 * @see #getPaletteDescription()
	 * @generated
	 */
	EAttribute getPaletteDescription_Icon_filepath();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.PaletteDescription#getPalette_name <em>Palette name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette name</em>'.
	 * @see graphic_representation.PaletteDescription#getPalette_name()
	 * @see #getPaletteDescription()
	 * @generated
	 */
	EAttribute getPaletteDescription_Palette_name();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.PaletteDescription#isIsDraggable <em>Is Draggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Draggable</em>'.
	 * @see graphic_representation.PaletteDescription#isIsDraggable()
	 * @see #getPaletteDescription()
	 * @generated
	 */
	EAttribute getPaletteDescription_IsDraggable();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Node_Element <em>Node Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Element</em>'.
	 * @see graphic_representation.Node_Element
	 * @generated
	 */
	EClass getNode_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.Node_Element#getLabelanEAttribute <em>Labelan EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labelan EAttribute</em>'.
	 * @see graphic_representation.Node_Element#getLabelanEAttribute()
	 * @see #getNode_Element()
	 * @generated
	 */
	EReference getNode_Element_LabelanEAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.Node_Element#getLinkPalette <em>Link Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Palette</em>'.
	 * @see graphic_representation.Node_Element#getLinkPalette()
	 * @see #getNode_Element()
	 * @generated
	 */
	EReference getNode_Element_LinkPalette();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.Node_Element#getAffixedCompartmentElements <em>Affixed Compartment Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affixed Compartment Elements</em>'.
	 * @see graphic_representation.Node_Element#getAffixedCompartmentElements()
	 * @see #getNode_Element()
	 * @generated
	 */
	EReference getNode_Element_AffixedCompartmentElements();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.Node_Element#getExpandableItems <em>Expandable Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expandable Items</em>'.
	 * @see graphic_representation.Node_Element#getExpandableItems()
	 * @see #getNode_Element()
	 * @generated
	 */
	EReference getNode_Element_ExpandableItems();

	/**
	 * Returns the meta object for the '{@link graphic_representation.Node_Element#isCompartment() <em>Is Compartment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compartment</em>' operation.
	 * @see graphic_representation.Node_Element#isCompartment()
	 * @generated
	 */
	EOperation getNode_Element__IsCompartment();

	/**
	 * Returns the meta object for class '{@link graphic_representation.ExpandableItem <em>Expandable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expandable Item</em>'.
	 * @see graphic_representation.ExpandableItem
	 * @generated
	 */
	EClass getExpandableItem();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.ExpandableItem#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see graphic_representation.ExpandableItem#getIndex()
	 * @see #getExpandableItem()
	 * @generated
	 */
	EAttribute getExpandableItem_Index();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.ExpandableItem#getAnEReference <em>An EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EReference</em>'.
	 * @see graphic_representation.ExpandableItem#getAnEReference()
	 * @see #getExpandableItem()
	 * @generated
	 */
	EReference getExpandableItem_AnEReference();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Edge_Style <em>Edge Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Style</em>'.
	 * @see graphic_representation.Edge_Style
	 * @generated
	 */
	EClass getEdge_Style();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Edge_Style#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see graphic_representation.Edge_Style#getLineStyle()
	 * @see #getEdge_Style()
	 * @generated
	 */
	EAttribute getEdge_Style_LineStyle();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Edge_Style#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see graphic_representation.Edge_Style#getLineWidth()
	 * @see #getEdge_Style()
	 * @generated
	 */
	EAttribute getEdge_Style_LineWidth();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see graphic_representation.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.Root#getAnEClass <em>An EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EClass</em>'.
	 * @see graphic_representation.Root#getAnEClass()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_AnEClass();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Root#getRoot_node_elements <em>Root node elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root node elements</em>'.
	 * @see graphic_representation.Root#getRoot_node_elements()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Root_node_elements();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Root#getRoot_shape <em>Root shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root shape</em>'.
	 * @see graphic_representation.Root#getRoot_shape()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Root_shape();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.Root#getRootLayer <em>Root Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Layer</em>'.
	 * @see graphic_representation.Root#getRootLayer()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_RootLayer();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Edge_Direction <em>Edge Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Direction</em>'.
	 * @see graphic_representation.Edge_Direction
	 * @generated
	 */
	EClass getEdge_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Edge_Direction#getSourceLink <em>Source Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Link</em>'.
	 * @see graphic_representation.Edge_Direction#getSourceLink()
	 * @see #getEdge_Direction()
	 * @generated
	 */
	EReference getEdge_Direction_SourceLink();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Edge_Direction#getTargetLink <em>Target Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Link</em>'.
	 * @see graphic_representation.Edge_Direction#getTargetLink()
	 * @see #getEdge_Direction()
	 * @generated
	 */
	EReference getEdge_Direction_TargetLink();

	/**
	 * Returns the meta object for class '{@link graphic_representation.GraphicRepresentation <em>Graphic Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Representation</em>'.
	 * @see graphic_representation.GraphicRepresentation
	 * @generated
	 */
	EClass getGraphicRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.GraphicRepresentation#getAllGraphicRepresentation <em>All Graphic Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Graphic Representation</em>'.
	 * @see graphic_representation.GraphicRepresentation#getAllGraphicRepresentation()
	 * @see #getGraphicRepresentation()
	 * @generated
	 */
	EReference getGraphicRepresentation_AllGraphicRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.GraphicRepresentation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic_representation.GraphicRepresentation#getName()
	 * @see #getGraphicRepresentation()
	 * @generated
	 */
	EAttribute getGraphicRepresentation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.GraphicRepresentation#getUserColors <em>User Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Colors</em>'.
	 * @see graphic_representation.GraphicRepresentation#getUserColors()
	 * @see #getGraphicRepresentation()
	 * @generated
	 */
	EReference getGraphicRepresentation_UserColors();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see graphic_representation.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for class '{@link graphic_representation.ShapeCompartmentGradient <em>Shape Compartment Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Compartment Gradient</em>'.
	 * @see graphic_representation.ShapeCompartmentGradient
	 * @generated
	 */
	EClass getShapeCompartmentGradient();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.ShapeCompartmentGradient#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see graphic_representation.ShapeCompartmentGradient#getWidth()
	 * @see #getShapeCompartmentGradient()
	 * @generated
	 */
	EAttribute getShapeCompartmentGradient_Width();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.ShapeCompartmentGradient#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see graphic_representation.ShapeCompartmentGradient#getHeight()
	 * @see #getShapeCompartmentGradient()
	 * @generated
	 */
	EAttribute getShapeCompartmentGradient_Height();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.ShapeCompartmentGradient#getCornerHeight <em>Corner Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Height</em>'.
	 * @see graphic_representation.ShapeCompartmentGradient#getCornerHeight()
	 * @see #getShapeCompartmentGradient()
	 * @generated
	 */
	EAttribute getShapeCompartmentGradient_CornerHeight();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.ShapeCompartmentGradient#getCornerWidth <em>Corner Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Width</em>'.
	 * @see graphic_representation.ShapeCompartmentGradient#getCornerWidth()
	 * @see #getShapeCompartmentGradient()
	 * @generated
	 */
	EAttribute getShapeCompartmentGradient_CornerWidth();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.ShapeCompartmentGradient#getForeGroundColor <em>Fore Ground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fore Ground Color</em>'.
	 * @see graphic_representation.ShapeCompartmentGradient#getForeGroundColor()
	 * @see #getShapeCompartmentGradient()
	 * @generated
	 */
	EReference getShapeCompartmentGradient_ForeGroundColor();

	/**
	 * Returns the meta object for class '{@link graphic_representation.ShapeCompartmentParallelogram <em>Shape Compartment Parallelogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Compartment Parallelogram</em>'.
	 * @see graphic_representation.ShapeCompartmentParallelogram
	 * @generated
	 */
	EClass getShapeCompartmentParallelogram();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.ShapeCompartmentParallelogram#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see graphic_representation.ShapeCompartmentParallelogram#getWidth()
	 * @see #getShapeCompartmentParallelogram()
	 * @generated
	 */
	EAttribute getShapeCompartmentParallelogram_Width();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.ShapeCompartmentParallelogram#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see graphic_representation.ShapeCompartmentParallelogram#getHeight()
	 * @see #getShapeCompartmentParallelogram()
	 * @generated
	 */
	EAttribute getShapeCompartmentParallelogram_Height();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see graphic_representation.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Ellipse#getHorizontalDiameter <em>Horizontal Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Diameter</em>'.
	 * @see graphic_representation.Ellipse#getHorizontalDiameter()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_HorizontalDiameter();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Ellipse#getVerticalDiameter <em>Vertical Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Diameter</em>'.
	 * @see graphic_representation.Ellipse#getVerticalDiameter()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_VerticalDiameter();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see graphic_representation.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Note#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see graphic_representation.Note#getSize()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Size();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Diamond <em>Diamond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diamond</em>'.
	 * @see graphic_representation.Diamond
	 * @generated
	 */
	EClass getDiamond();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Diamond#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see graphic_representation.Diamond#getSize()
	 * @see #getDiamond()
	 * @generated
	 */
	EAttribute getDiamond_Size();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see graphic_representation.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Rectangle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see graphic_representation.Rectangle#getWidth()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Width();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Rectangle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see graphic_representation.Rectangle#getHeight()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Height();

	/**
	 * Returns the meta object for class '{@link graphic_representation.ShapeColor <em>Shape Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Color</em>'.
	 * @see graphic_representation.ShapeColor
	 * @generated
	 */
	EClass getShapeColor();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.ShapeColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see graphic_representation.ShapeColor#getColor()
	 * @see #getShapeColor()
	 * @generated
	 */
	EReference getShapeColor_Color();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see graphic_representation.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.Link#getAnEReference <em>An EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EReference</em>'.
	 * @see graphic_representation.Link#getAnEReference()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_AnEReference();

	/**
	 * Returns the meta object for the reference list '{@link graphic_representation.Link#getAnDiagramElement <em>An Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>An Diagram Element</em>'.
	 * @see graphic_representation.Link#getAnDiagramElement()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_AnDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Link#getDecoratorName <em>Decorator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorator Name</em>'.
	 * @see graphic_representation.Link#getDecoratorName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_DecoratorName();

	/**
	 * Returns the meta object for class '{@link graphic_representation.PaletteDescriptionLink <em>Palette Description Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palette Description Link</em>'.
	 * @see graphic_representation.PaletteDescriptionLink
	 * @generated
	 */
	EClass getPaletteDescriptionLink();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.PaletteDescriptionLink#getSourceDecoratorName <em>Source Decorator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Decorator Name</em>'.
	 * @see graphic_representation.PaletteDescriptionLink#getSourceDecoratorName()
	 * @see #getPaletteDescriptionLink()
	 * @generated
	 */
	EAttribute getPaletteDescriptionLink_SourceDecoratorName();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see graphic_representation.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Layer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic_representation.Layer#getName()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.Layer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see graphic_representation.Layer#getElements()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Elements();

	/**
	 * Returns the meta object for class '{@link graphic_representation.DefaultLayer <em>Default Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Layer</em>'.
	 * @see graphic_representation.DefaultLayer
	 * @generated
	 */
	EClass getDefaultLayer();

	/**
	 * Returns the meta object for class '{@link graphic_representation.AdditionalLayer <em>Additional Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Layer</em>'.
	 * @see graphic_representation.AdditionalLayer
	 * @generated
	 */
	EClass getAdditionalLayer();

	/**
	 * Returns the meta object for class '{@link graphic_representation.AffixedElement <em>Affixed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affixed Element</em>'.
	 * @see graphic_representation.AffixedElement
	 * @generated
	 */
	EClass getAffixedElement();

	/**
	 * Returns the meta object for class '{@link graphic_representation.CompartmentElement <em>Compartment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Element</em>'.
	 * @see graphic_representation.CompartmentElement
	 * @generated
	 */
	EClass getCompartmentElement();

	/**
	 * Returns the meta object for class '{@link graphic_representation.AffixedCompartmentElement <em>Affixed Compartment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affixed Compartment Element</em>'.
	 * @see graphic_representation.AffixedCompartmentElement
	 * @generated
	 */
	EClass getAffixedCompartmentElement();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.AffixedCompartmentElement#getAnEReference <em>An EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EReference</em>'.
	 * @see graphic_representation.AffixedCompartmentElement#getAnEReference()
	 * @see #getAffixedCompartmentElement()
	 * @generated
	 */
	EReference getAffixedCompartmentElement_AnEReference();

	/**
	 * Returns the meta object for the reference list '{@link graphic_representation.AffixedCompartmentElement#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see graphic_representation.AffixedCompartmentElement#getNodes()
	 * @see #getAffixedCompartmentElement()
	 * @generated
	 */
	EReference getAffixedCompartmentElement_Nodes();

	/**
	 * Returns the meta object for class '{@link graphic_representation.LabelEAttribute <em>Label EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label EAttribute</em>'.
	 * @see graphic_representation.LabelEAttribute
	 * @generated
	 */
	EClass getLabelEAttribute();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.LabelEAttribute#getAnEAttribute <em>An EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EAttribute</em>'.
	 * @see graphic_representation.LabelEAttribute#getAnEAttribute()
	 * @see #getLabelEAttribute()
	 * @generated
	 */
	EReference getLabelEAttribute_AnEAttribute();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see graphic_representation.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.Border#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Border Color</em>'.
	 * @see graphic_representation.Border#getBorderColor()
	 * @see #getBorder()
	 * @generated
	 */
	EReference getBorder_BorderColor();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see graphic_representation.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for class '{@link graphic_representation.GRUserColor <em>GR User Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GR User Color</em>'.
	 * @see graphic_representation.GRUserColor
	 * @generated
	 */
	EClass getGRUserColor();

	/**
	 * Returns the meta object for class '{@link graphic_representation.GRUserColorDef <em>GR User Color Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GR User Color Def</em>'.
	 * @see graphic_representation.GRUserColorDef
	 * @generated
	 */
	EClass getGRUserColorDef();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.GRUserColorDef#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Color</em>'.
	 * @see graphic_representation.GRUserColorDef#getColor()
	 * @see #getGRUserColorDef()
	 * @generated
	 */
	EReference getGRUserColorDef_Color();

	/**
	 * Returns the meta object for class '{@link graphic_representation.GRColorDescription <em>GR Color Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GR Color Description</em>'.
	 * @see graphic_representation.GRColorDescription
	 * @generated
	 */
	EClass getGRColorDescription();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.GRColorDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic_representation.GRColorDescription#getName()
	 * @see #getGRColorDescription()
	 * @generated
	 */
	EAttribute getGRColorDescription_Name();

	/**
	 * Returns the meta object for class '{@link graphic_representation.RGBColorDescription <em>RGB Color Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB Color Description</em>'.
	 * @see graphic_representation.RGBColorDescription
	 * @generated
	 */
	EClass getRGBColorDescription();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.RGBColorDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic_representation.RGBColorDescription#getName()
	 * @see #getRGBColorDescription()
	 * @generated
	 */
	EAttribute getRGBColorDescription_Name();

	/**
	 * Returns the meta object for class '{@link graphic_representation.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB Color</em>'.
	 * @see graphic_representation.RGBColor
	 * @generated
	 */
	EClass getRGBColor();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.RGBColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see graphic_representation.RGBColor#getRed()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.RGBColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see graphic_representation.RGBColor#getGreen()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.RGBColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see graphic_representation.RGBColor#getBlue()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Blue();

	/**
	 * Returns the meta object for class '{@link graphic_representation.SiriusSystemColors <em>Sirius System Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius System Colors</em>'.
	 * @see graphic_representation.SiriusSystemColors
	 * @generated
	 */
	EClass getSiriusSystemColors();

	/**
	 * Returns the meta object for the '{@link graphic_representation.SiriusSystemColors#getSystemColorDescription(java.lang.String) <em>Get System Color Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get System Color Description</em>' operation.
	 * @see graphic_representation.SiriusSystemColors#getSystemColorDescription(java.lang.String)
	 * @generated
	 */
	EOperation getSiriusSystemColors__GetSystemColorDescription__String();

	/**
	 * Returns the meta object for class '{@link graphic_representation.GRLabelStyleDescription <em>GR Label Style Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GR Label Style Description</em>'.
	 * @see graphic_representation.GRLabelStyleDescription
	 * @generated
	 */
	EClass getGRLabelStyleDescription();

	/**
	 * Returns the meta object for the attribute list '{@link graphic_representation.GRLabelStyleDescription#getLabelFormat <em>Label Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Label Format</em>'.
	 * @see graphic_representation.GRLabelStyleDescription#getLabelFormat()
	 * @see #getGRLabelStyleDescription()
	 * @generated
	 */
	EAttribute getGRLabelStyleDescription_LabelFormat();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.GRLabelStyleDescription#isShowIcon <em>Show Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Icon</em>'.
	 * @see graphic_representation.GRLabelStyleDescription#isShowIcon()
	 * @see #getGRLabelStyleDescription()
	 * @generated
	 */
	EAttribute getGRLabelStyleDescription_ShowIcon();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.GRLabelStyleDescription#getLabelPosition <em>Label Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Position</em>'.
	 * @see graphic_representation.GRLabelStyleDescription#getLabelPosition()
	 * @see #getGRLabelStyleDescription()
	 * @generated
	 */
	EAttribute getGRLabelStyleDescription_LabelPosition();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see graphic_representation.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for class '{@link graphic_representation.RepresentationTable <em>Representation Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Table</em>'.
	 * @see graphic_representation.RepresentationTable
	 * @generated
	 */
	EClass getRepresentationTable();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.RepresentationTable#getRootTable <em>Root Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Table</em>'.
	 * @see graphic_representation.RepresentationTable#getRootTable()
	 * @see #getRepresentationTable()
	 * @generated
	 */
	EReference getRepresentationTable_RootTable();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.RepresentationTable#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see graphic_representation.RepresentationTable#getLines()
	 * @see #getRepresentationTable()
	 * @generated
	 */
	EReference getRepresentationTable_Lines();

	/**
	 * Returns the meta object for the reference list '{@link graphic_representation.RepresentationTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see graphic_representation.RepresentationTable#getColumns()
	 * @see #getRepresentationTable()
	 * @generated
	 */
	EReference getRepresentationTable_Columns();

	/**
	 * Returns the meta object for class '{@link graphic_representation.RepresentationDD <em>Representation DD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation DD</em>'.
	 * @see graphic_representation.RepresentationDD
	 * @generated
	 */
	EClass getRepresentationDD();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.RepresentationDD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic_representation.RepresentationDD#getName()
	 * @see #getRepresentationDD()
	 * @generated
	 */
	EAttribute getRepresentationDD_Name();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.RepresentationDD#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see graphic_representation.RepresentationDD#getRoot()
	 * @see #getRepresentationDD()
	 * @generated
	 */
	EReference getRepresentationDD_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.RepresentationDD#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see graphic_representation.RepresentationDD#getLayers()
	 * @see #getRepresentationDD()
	 * @generated
	 */
	EReference getRepresentationDD_Layers();

	/**
	 * Returns the meta object for class '{@link graphic_representation.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see graphic_representation.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.Line#getFeatureReference <em>Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Reference</em>'.
	 * @see graphic_representation.Line#getFeatureReference()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_FeatureReference();

	/**
	 * Returns the meta object for the reference list '{@link graphic_representation.Line#getListEClasses <em>List EClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List EClasses</em>'.
	 * @see graphic_representation.Line#getListEClasses()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_ListEClasses();

	/**
	 * Returns the meta object for class '{@link graphic_representation.LineGroup <em>Line Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Group</em>'.
	 * @see graphic_representation.LineGroup
	 * @generated
	 */
	EClass getLineGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.LineGroup#getListLines <em>List Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Lines</em>'.
	 * @see graphic_representation.LineGroup#getListLines()
	 * @see #getLineGroup()
	 * @generated
	 */
	EReference getLineGroup_ListLines();

	/**
	 * Returns the meta object for class '{@link graphic_representation.ConditionalStyle <em>Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Style</em>'.
	 * @see graphic_representation.ConditionalStyle
	 * @generated
	 */
	EClass getConditionalStyle();

	/**
	 * Returns the meta object for the reference '{@link graphic_representation.ConditionalStyle#getEAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute</em>'.
	 * @see graphic_representation.ConditionalStyle#getEAttribute()
	 * @see #getConditionalStyle()
	 * @generated
	 */
	EReference getConditionalStyle_EAttribute();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.ConditionalStyle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see graphic_representation.ConditionalStyle#getValue()
	 * @see #getConditionalStyle()
	 * @generated
	 */
	EAttribute getConditionalStyle_Value();

	/**
	 * Returns the meta object for the containment reference '{@link graphic_representation.ConditionalStyle#getConditionalStyle <em>Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditional Style</em>'.
	 * @see graphic_representation.ConditionalStyle#getConditionalStyle()
	 * @see #getConditionalStyle()
	 * @generated
	 */
	EReference getConditionalStyle_ConditionalStyle();

	/**
	 * Returns the meta object for enum '{@link graphic_representation.GRFontFormat <em>GR Font Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GR Font Format</em>'.
	 * @see graphic_representation.GRFontFormat
	 * @generated
	 */
	EEnum getGRFontFormat();

	/**
	 * Returns the meta object for enum '{@link graphic_representation.LabelPosition <em>Label Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Position</em>'.
	 * @see graphic_representation.LabelPosition
	 * @generated
	 */
	EEnum getLabelPosition();

	/**
	 * Returns the meta object for enum '{@link graphic_representation.ChildrenPresentation <em>Children Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Children Presentation</em>'.
	 * @see graphic_representation.ChildrenPresentation
	 * @generated
	 */
	EEnum getChildrenPresentation();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Border#getBorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Style</em>'.
	 * @see graphic_representation.Border#getBorderStyle()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_BorderStyle();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.Border#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see graphic_representation.Border#getBorderWidth()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_BorderWidth();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Graphic_representationFactory getGraphic_representationFactory();

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
		 * The meta object literal for the '{@link graphic_representation.impl.MMGraphic_RepresentationImpl <em>MM Graphic Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.MMGraphic_RepresentationImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getMMGraphic_Representation()
		 * @generated
		 */
		EClass MM_GRAPHIC_REPRESENTATION = eINSTANCE.getMMGraphic_Representation();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MM_GRAPHIC_REPRESENTATION__EXTENSION = eINSTANCE.getMMGraphic_Representation_Extension();

		/**
		 * The meta object literal for the '<em><b>List Representations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MM_GRAPHIC_REPRESENTATION__LIST_REPRESENTATIONS = eINSTANCE.getMMGraphic_Representation_ListRepresentations();

		/**
		 * The meta object literal for the '<em><b>Is Geopalette</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MM_GRAPHIC_REPRESENTATION__IS_GEOPALETTE = eINSTANCE.getMMGraphic_Representation_IsGeopalette();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.AllElementsImpl <em>All Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.AllElementsImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAllElements()
		 * @generated
		 */
		EClass ALL_ELEMENTS = eINSTANCE.getAllElements();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.DiagramElementImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '<em><b>An EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__AN_ECLASS = eINSTANCE.getDiagramElement_AnEClass();

		/**
		 * The meta object literal for the '<em><b>Diag palette</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__DIAG_PALETTE = eINSTANCE.getDiagramElement_Diag_palette();

		/**
		 * The meta object literal for the '<em><b>Container Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__CONTAINER_REFERENCE = eINSTANCE.getDiagramElement_ContainerReference();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.AbstractElementImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAbstractElement()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

		/**
		 * The meta object literal for the '<em><b>An EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT__AN_ECLASS = eINSTANCE.getAbstractElement_AnEClass();

		/**
		 * The meta object literal for the '<em><b>Node elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT__NODE_ELEMENTS = eINSTANCE.getAbstractElement_Node_elements();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.EdgeImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Directions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__DIRECTIONS = eINSTANCE.getEdge_Directions();

		/**
		 * The meta object literal for the '<em><b>Edge style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__EDGE_STYLE = eINSTANCE.getEdge_Edge_style();

		/**
		 * The meta object literal for the '<em><b>Edge Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__EDGE_LABEL = eINSTANCE.getEdge_EdgeLabel();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.EdgeLabelEAttributeImpl <em>Edge Label EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.EdgeLabelEAttributeImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEdgeLabelEAttribute()
		 * @generated
		 */
		EClass EDGE_LABEL_EATTRIBUTE = eINSTANCE.getEdgeLabelEAttribute();

		/**
		 * The meta object literal for the '<em><b>Label EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_LABEL_EATTRIBUTE__LABEL_EATTRIBUTE = eINSTANCE.getEdgeLabelEAttribute_LabelEAttribute();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.NodeImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Node elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE_ELEMENTS = eINSTANCE.getNode_Node_elements();

		/**
		 * The meta object literal for the '<em><b>Node shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE_SHAPE = eINSTANCE.getNode_Node_shape();

		/**
		 * The meta object literal for the '<em><b>Expandable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EXPANDABLE = eINSTANCE.getNode_Expandable();

		/**
		 * The meta object literal for the '<em><b>Conditional Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CONDITIONAL_STYLE = eINSTANCE.getNode_ConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PRESENTATION = eINSTANCE.getNode_Presentation();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.IconElementImpl <em>Icon Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.IconElementImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getIconElement()
		 * @generated
		 */
		EClass ICON_ELEMENT = eINSTANCE.getIconElement();

		/**
		 * The meta object literal for the '<em><b>Filepath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_ELEMENT__FILEPATH = eINSTANCE.getIconElement_Filepath();

		/**
		 * The meta object literal for the '<em><b>Embedded Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_ELEMENT__EMBEDDED_IMAGE = eINSTANCE.getIconElement_EmbeddedImage();

		/**
		 * The meta object literal for the '<em><b>Image Base64</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICON_ELEMENT___IMAGE_BASE64 = eINSTANCE.getIconElement__ImageBase64();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.PaletteDescriptionImpl <em>Palette Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.PaletteDescriptionImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getPaletteDescription()
		 * @generated
		 */
		EClass PALETTE_DESCRIPTION = eINSTANCE.getPaletteDescription();

		/**
		 * The meta object literal for the '<em><b>Icon filepath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALETTE_DESCRIPTION__ICON_FILEPATH = eINSTANCE.getPaletteDescription_Icon_filepath();

		/**
		 * The meta object literal for the '<em><b>Palette name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALETTE_DESCRIPTION__PALETTE_NAME = eINSTANCE.getPaletteDescription_Palette_name();

		/**
		 * The meta object literal for the '<em><b>Is Draggable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALETTE_DESCRIPTION__IS_DRAGGABLE = eINSTANCE.getPaletteDescription_IsDraggable();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.Node_ElementImpl <em>Node Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.Node_ElementImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getNode_Element()
		 * @generated
		 */
		EClass NODE_ELEMENT = eINSTANCE.getNode_Element();

		/**
		 * The meta object literal for the '<em><b>Labelan EAttribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ELEMENT__LABELAN_EATTRIBUTE = eINSTANCE.getNode_Element_LabelanEAttribute();

		/**
		 * The meta object literal for the '<em><b>Link Palette</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ELEMENT__LINK_PALETTE = eINSTANCE.getNode_Element_LinkPalette();

		/**
		 * The meta object literal for the '<em><b>Affixed Compartment Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ELEMENT__AFFIXED_COMPARTMENT_ELEMENTS = eINSTANCE.getNode_Element_AffixedCompartmentElements();

		/**
		 * The meta object literal for the '<em><b>Expandable Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ELEMENT__EXPANDABLE_ITEMS = eINSTANCE.getNode_Element_ExpandableItems();

		/**
		 * The meta object literal for the '<em><b>Is Compartment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE_ELEMENT___IS_COMPARTMENT = eINSTANCE.getNode_Element__IsCompartment();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.ExpandableItemImpl <em>Expandable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.ExpandableItemImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getExpandableItem()
		 * @generated
		 */
		EClass EXPANDABLE_ITEM = eINSTANCE.getExpandableItem();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPANDABLE_ITEM__INDEX = eINSTANCE.getExpandableItem_Index();

		/**
		 * The meta object literal for the '<em><b>An EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANDABLE_ITEM__AN_EREFERENCE = eINSTANCE.getExpandableItem_AnEReference();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.Edge_StyleImpl <em>Edge Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.Edge_StyleImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEdge_Style()
		 * @generated
		 */
		EClass EDGE_STYLE = eINSTANCE.getEdge_Style();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__LINE_STYLE = eINSTANCE.getEdge_Style_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__LINE_WIDTH = eINSTANCE.getEdge_Style_LineWidth();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.RootImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>An EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__AN_ECLASS = eINSTANCE.getRoot_AnEClass();

		/**
		 * The meta object literal for the '<em><b>Root node elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ROOT_NODE_ELEMENTS = eINSTANCE.getRoot_Root_node_elements();

		/**
		 * The meta object literal for the '<em><b>Root shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ROOT_SHAPE = eINSTANCE.getRoot_Root_shape();

		/**
		 * The meta object literal for the '<em><b>Root Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ROOT_LAYER = eINSTANCE.getRoot_RootLayer();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.Edge_DirectionImpl <em>Edge Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.Edge_DirectionImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEdge_Direction()
		 * @generated
		 */
		EClass EDGE_DIRECTION = eINSTANCE.getEdge_Direction();

		/**
		 * The meta object literal for the '<em><b>Source Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DIRECTION__SOURCE_LINK = eINSTANCE.getEdge_Direction_SourceLink();

		/**
		 * The meta object literal for the '<em><b>Target Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DIRECTION__TARGET_LINK = eINSTANCE.getEdge_Direction_TargetLink();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.GraphicRepresentationImpl <em>Graphic Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.GraphicRepresentationImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGraphicRepresentation()
		 * @generated
		 */
		EClass GRAPHIC_REPRESENTATION = eINSTANCE.getGraphicRepresentation();

		/**
		 * The meta object literal for the '<em><b>All Graphic Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_REPRESENTATION__ALL_GRAPHIC_REPRESENTATION = eINSTANCE.getGraphicRepresentation_AllGraphicRepresentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_REPRESENTATION__NAME = eINSTANCE.getGraphicRepresentation_Name();

		/**
		 * The meta object literal for the '<em><b>User Colors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_REPRESENTATION__USER_COLORS = eINSTANCE.getGraphicRepresentation_UserColors();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.ShapeImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.ShapeCompartmentGradientImpl <em>Shape Compartment Gradient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.ShapeCompartmentGradientImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getShapeCompartmentGradient()
		 * @generated
		 */
		EClass SHAPE_COMPARTMENT_GRADIENT = eINSTANCE.getShapeCompartmentGradient();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_COMPARTMENT_GRADIENT__WIDTH = eINSTANCE.getShapeCompartmentGradient_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_COMPARTMENT_GRADIENT__HEIGHT = eINSTANCE.getShapeCompartmentGradient_Height();

		/**
		 * The meta object literal for the '<em><b>Corner Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_COMPARTMENT_GRADIENT__CORNER_HEIGHT = eINSTANCE.getShapeCompartmentGradient_CornerHeight();

		/**
		 * The meta object literal for the '<em><b>Corner Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_COMPARTMENT_GRADIENT__CORNER_WIDTH = eINSTANCE.getShapeCompartmentGradient_CornerWidth();

		/**
		 * The meta object literal for the '<em><b>Fore Ground Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR = eINSTANCE.getShapeCompartmentGradient_ForeGroundColor();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.ShapeCompartmentParallelogramImpl <em>Shape Compartment Parallelogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.ShapeCompartmentParallelogramImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getShapeCompartmentParallelogram()
		 * @generated
		 */
		EClass SHAPE_COMPARTMENT_PARALLELOGRAM = eINSTANCE.getShapeCompartmentParallelogram();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_COMPARTMENT_PARALLELOGRAM__WIDTH = eINSTANCE.getShapeCompartmentParallelogram_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_COMPARTMENT_PARALLELOGRAM__HEIGHT = eINSTANCE.getShapeCompartmentParallelogram_Height();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.EllipseImpl <em>Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.EllipseImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '<em><b>Horizontal Diameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__HORIZONTAL_DIAMETER = eINSTANCE.getEllipse_HorizontalDiameter();

		/**
		 * The meta object literal for the '<em><b>Vertical Diameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__VERTICAL_DIAMETER = eINSTANCE.getEllipse_VerticalDiameter();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.NoteImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__SIZE = eINSTANCE.getNote_Size();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.DiamondImpl <em>Diamond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.DiamondImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getDiamond()
		 * @generated
		 */
		EClass DIAMOND = eINSTANCE.getDiamond();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAMOND__SIZE = eINSTANCE.getDiamond_Size();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.RectangleImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__WIDTH = eINSTANCE.getRectangle_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__HEIGHT = eINSTANCE.getRectangle_Height();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.ShapeColorImpl <em>Shape Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.ShapeColorImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getShapeColor()
		 * @generated
		 */
		EClass SHAPE_COLOR = eINSTANCE.getShapeColor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_COLOR__COLOR = eINSTANCE.getShapeColor_Color();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.LinkImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>An EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__AN_EREFERENCE = eINSTANCE.getLink_AnEReference();

		/**
		 * The meta object literal for the '<em><b>An Diagram Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__AN_DIAGRAM_ELEMENT = eINSTANCE.getLink_AnDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Decorator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__DECORATOR_NAME = eINSTANCE.getLink_DecoratorName();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.PaletteDescriptionLinkImpl <em>Palette Description Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.PaletteDescriptionLinkImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getPaletteDescriptionLink()
		 * @generated
		 */
		EClass PALETTE_DESCRIPTION_LINK = eINSTANCE.getPaletteDescriptionLink();

		/**
		 * The meta object literal for the '<em><b>Source Decorator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALETTE_DESCRIPTION_LINK__SOURCE_DECORATOR_NAME = eINSTANCE.getPaletteDescriptionLink_SourceDecoratorName();

		/**
		 * The meta object literal for the '{@link graphic_representation.Layer <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.Layer
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__ELEMENTS = eINSTANCE.getLayer_Elements();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.DefaultLayerImpl <em>Default Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.DefaultLayerImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getDefaultLayer()
		 * @generated
		 */
		EClass DEFAULT_LAYER = eINSTANCE.getDefaultLayer();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.AdditionalLayerImpl <em>Additional Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.AdditionalLayerImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAdditionalLayer()
		 * @generated
		 */
		EClass ADDITIONAL_LAYER = eINSTANCE.getAdditionalLayer();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.AffixedElementImpl <em>Affixed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.AffixedElementImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAffixedElement()
		 * @generated
		 */
		EClass AFFIXED_ELEMENT = eINSTANCE.getAffixedElement();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.CompartmentElementImpl <em>Compartment Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.CompartmentElementImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getCompartmentElement()
		 * @generated
		 */
		EClass COMPARTMENT_ELEMENT = eINSTANCE.getCompartmentElement();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.AffixedCompartmentElementImpl <em>Affixed Compartment Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.AffixedCompartmentElementImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getAffixedCompartmentElement()
		 * @generated
		 */
		EClass AFFIXED_COMPARTMENT_ELEMENT = eINSTANCE.getAffixedCompartmentElement();

		/**
		 * The meta object literal for the '<em><b>An EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE = eINSTANCE.getAffixedCompartmentElement_AnEReference();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFIXED_COMPARTMENT_ELEMENT__NODES = eINSTANCE.getAffixedCompartmentElement_Nodes();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.LabelEAttributeImpl <em>Label EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.LabelEAttributeImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLabelEAttribute()
		 * @generated
		 */
		EClass LABEL_EATTRIBUTE = eINSTANCE.getLabelEAttribute();

		/**
		 * The meta object literal for the '<em><b>An EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_EATTRIBUTE__AN_EATTRIBUTE = eINSTANCE.getLabelEAttribute_AnEAttribute();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.BorderImpl <em>Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.BorderImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getBorder()
		 * @generated
		 */
		EClass BORDER = eINSTANCE.getBorder();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDER__BORDER_COLOR = eINSTANCE.getBorder_BorderColor();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.ColorImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.GRUserColorImpl <em>GR User Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.GRUserColorImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRUserColor()
		 * @generated
		 */
		EClass GR_USER_COLOR = eINSTANCE.getGRUserColor();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.GRUserColorDefImpl <em>GR User Color Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.GRUserColorDefImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRUserColorDef()
		 * @generated
		 */
		EClass GR_USER_COLOR_DEF = eINSTANCE.getGRUserColorDef();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GR_USER_COLOR_DEF__COLOR = eINSTANCE.getGRUserColorDef_Color();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.GRColorDescriptionImpl <em>GR Color Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.GRColorDescriptionImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRColorDescription()
		 * @generated
		 */
		EClass GR_COLOR_DESCRIPTION = eINSTANCE.getGRColorDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GR_COLOR_DESCRIPTION__NAME = eINSTANCE.getGRColorDescription_Name();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.RGBColorDescriptionImpl <em>RGB Color Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.RGBColorDescriptionImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRGBColorDescription()
		 * @generated
		 */
		EClass RGB_COLOR_DESCRIPTION = eINSTANCE.getRGBColorDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR_DESCRIPTION__NAME = eINSTANCE.getRGBColorDescription_Name();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.RGBColorImpl <em>RGB Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.RGBColorImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRGBColor()
		 * @generated
		 */
		EClass RGB_COLOR = eINSTANCE.getRGBColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__RED = eINSTANCE.getRGBColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__GREEN = eINSTANCE.getRGBColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__BLUE = eINSTANCE.getRGBColor_Blue();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.SiriusSystemColorsImpl <em>Sirius System Colors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.SiriusSystemColorsImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getSiriusSystemColors()
		 * @generated
		 */
		EClass SIRIUS_SYSTEM_COLORS = eINSTANCE.getSiriusSystemColors();

		/**
		 * The meta object literal for the '<em><b>Get System Color Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIRIUS_SYSTEM_COLORS___GET_SYSTEM_COLOR_DESCRIPTION__STRING = eINSTANCE.getSiriusSystemColors__GetSystemColorDescription__String();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.GRLabelStyleDescriptionImpl <em>GR Label Style Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.GRLabelStyleDescriptionImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRLabelStyleDescription()
		 * @generated
		 */
		EClass GR_LABEL_STYLE_DESCRIPTION = eINSTANCE.getGRLabelStyleDescription();

		/**
		 * The meta object literal for the '<em><b>Label Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GR_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT = eINSTANCE.getGRLabelStyleDescription_LabelFormat();

		/**
		 * The meta object literal for the '<em><b>Show Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GR_LABEL_STYLE_DESCRIPTION__SHOW_ICON = eINSTANCE.getGRLabelStyleDescription_ShowIcon();

		/**
		 * The meta object literal for the '<em><b>Label Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GR_LABEL_STYLE_DESCRIPTION__LABEL_POSITION = eINSTANCE.getGRLabelStyleDescription_LabelPosition();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.RepresentationImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.RepresentationTableImpl <em>Representation Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.RepresentationTableImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRepresentationTable()
		 * @generated
		 */
		EClass REPRESENTATION_TABLE = eINSTANCE.getRepresentationTable();

		/**
		 * The meta object literal for the '<em><b>Root Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_TABLE__ROOT_TABLE = eINSTANCE.getRepresentationTable_RootTable();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_TABLE__LINES = eINSTANCE.getRepresentationTable_Lines();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_TABLE__COLUMNS = eINSTANCE.getRepresentationTable_Columns();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.RepresentationDDImpl <em>Representation DD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.RepresentationDDImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getRepresentationDD()
		 * @generated
		 */
		EClass REPRESENTATION_DD = eINSTANCE.getRepresentationDD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_DD__NAME = eINSTANCE.getRepresentationDD_Name();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_DD__ROOT = eINSTANCE.getRepresentationDD_Root();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_DD__LAYERS = eINSTANCE.getRepresentationDD_Layers();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.LineImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Feature Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__FEATURE_REFERENCE = eINSTANCE.getLine_FeatureReference();

		/**
		 * The meta object literal for the '<em><b>List EClasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__LIST_ECLASSES = eINSTANCE.getLine_ListEClasses();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.LineGroupImpl <em>Line Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.LineGroupImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLineGroup()
		 * @generated
		 */
		EClass LINE_GROUP = eINSTANCE.getLineGroup();

		/**
		 * The meta object literal for the '<em><b>List Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_GROUP__LIST_LINES = eINSTANCE.getLineGroup_ListLines();

		/**
		 * The meta object literal for the '{@link graphic_representation.impl.ConditionalStyleImpl <em>Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.impl.ConditionalStyleImpl
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getConditionalStyle()
		 * @generated
		 */
		EClass CONDITIONAL_STYLE = eINSTANCE.getConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STYLE__EATTRIBUTE = eINSTANCE.getConditionalStyle_EAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_STYLE__VALUE = eINSTANCE.getConditionalStyle_Value();

		/**
		 * The meta object literal for the '<em><b>Conditional Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STYLE__CONDITIONAL_STYLE = eINSTANCE.getConditionalStyle_ConditionalStyle();

		/**
		 * The meta object literal for the '{@link graphic_representation.GRFontFormat <em>GR Font Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.GRFontFormat
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getGRFontFormat()
		 * @generated
		 */
		EEnum GR_FONT_FORMAT = eINSTANCE.getGRFontFormat();

		/**
		 * The meta object literal for the '{@link graphic_representation.LabelPosition <em>Label Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.LabelPosition
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getLabelPosition()
		 * @generated
		 */
		EEnum LABEL_POSITION = eINSTANCE.getLabelPosition();

		/**
		 * The meta object literal for the '{@link graphic_representation.ChildrenPresentation <em>Children Presentation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.ChildrenPresentation
		 * @see graphic_representation.impl.Graphic_representationPackageImpl#getChildrenPresentation()
		 * @generated
		 */
		EEnum CHILDREN_PRESENTATION = eINSTANCE.getChildrenPresentation();

		/**
		 * The meta object literal for the '<em><b>Border Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__BORDER_STYLE = eINSTANCE.getBorder_BorderStyle();

		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__BORDER_WIDTH = eINSTANCE.getBorder_BorderWidth();

	}

} //Graphic_representationPackage
