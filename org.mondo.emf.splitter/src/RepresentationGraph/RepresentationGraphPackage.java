/**
 */
package RepresentationGraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see RepresentationGraph.RepresentationGraphFactory
 * @model kind="package"
 * @generated
 */
public interface RepresentationGraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RepresentationGraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.dsl.org/mmPatterns/representationGraph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "repGraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepresentationGraphPackage eINSTANCE = RepresentationGraph.impl.RepresentationGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link RepresentationGraph.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RepresentationGraph.impl.DiagramImpl
	 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RepresentationGraph.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RepresentationGraph.impl.GraphicElementImpl
	 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getGraphicElement()
	 * @generated
	 */
	int GRAPHIC_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__PALETTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__PALETTE_ICON_PATH = 2;

	/**
	 * The number of structural features of the '<em>Graphic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Graphic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RepresentationGraph.impl.EdgeElementImpl <em>Edge Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RepresentationGraph.impl.EdgeElementImpl
	 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getEdgeElement()
	 * @generated
	 */
	int EDGE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ELEMENT__COLOR = GRAPHIC_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ELEMENT__PALETTE_NAME = GRAPHIC_ELEMENT__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ELEMENT__PALETTE_ICON_PATH = GRAPHIC_ELEMENT__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ELEMENT__SOURCE = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ELEMENT__TARGET = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ELEMENT_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edge Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ELEMENT_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RepresentationGraph.impl.NodeElementImpl <em>Node Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RepresentationGraph.impl.NodeElementImpl
	 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getNodeElement()
	 * @generated
	 */
	int NODE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__COLOR = GRAPHIC_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__PALETTE_NAME = GRAPHIC_ELEMENT__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__PALETTE_ICON_PATH = GRAPHIC_ELEMENT__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__LINK = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__LABEL = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RepresentationGraph.impl.IconElementImpl <em>Icon Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RepresentationGraph.impl.IconElementImpl
	 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getIconElement()
	 * @generated
	 */
	int ICON_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT__COLOR = NODE_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT__PALETTE_NAME = NODE_ELEMENT__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT__PALETTE_ICON_PATH = NODE_ELEMENT__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT__LINK = NODE_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT__LABEL = NODE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Filepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT__FILEPATH = NODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Icon Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT_FEATURE_COUNT = NODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Icon Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT_OPERATION_COUNT = NODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RepresentationGraph.impl.ContainerElementImpl <em>Container Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RepresentationGraph.impl.ContainerElementImpl
	 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getContainerElement()
	 * @generated
	 */
	int CONTAINER_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__COLOR = NODE_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__PALETTE_NAME = NODE_ELEMENT__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__PALETTE_ICON_PATH = NODE_ELEMENT__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__LINK = NODE_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__LABEL = NODE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__CONTAINS = NODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_FEATURE_COUNT = NODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_OPERATION_COUNT = NODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RepresentationGraph.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RepresentationGraph.impl.CircleImpl
	 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__COLOR = CONTAINER_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__PALETTE_NAME = CONTAINER_ELEMENT__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__PALETTE_ICON_PATH = CONTAINER_ELEMENT__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LINK = CONTAINER_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LABEL = CONTAINER_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CONTAINS = CONTAINER_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RepresentationGraph.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RepresentationGraph.impl.RectangleImpl
	 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__COLOR = CONTAINER_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__PALETTE_NAME = CONTAINER_ELEMENT__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__PALETTE_ICON_PATH = CONTAINER_ELEMENT__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LINK = CONTAINER_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LABEL = CONTAINER_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CONTAINS = CONTAINER_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__WIDTH = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__HEIGHT = CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RepresentationGraph.impl.RhombusImpl <em>Rhombus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RepresentationGraph.impl.RhombusImpl
	 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getRhombus()
	 * @generated
	 */
	int RHOMBUS = 8;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS__COLOR = CONTAINER_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS__PALETTE_NAME = CONTAINER_ELEMENT__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS__PALETTE_ICON_PATH = CONTAINER_ELEMENT__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS__LINK = CONTAINER_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS__LABEL = CONTAINER_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS__CONTAINS = CONTAINER_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS__WIDTH = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS__HEIGHT = CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rhombus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rhombus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHOMBUS_OPERATION_COUNT = CONTAINER_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link RepresentationGraph.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see RepresentationGraph.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link RepresentationGraph.Diagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see RepresentationGraph.Diagram#getElements()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Elements();

	/**
	 * Returns the meta object for class '{@link RepresentationGraph.EdgeElement <em>Edge Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Element</em>'.
	 * @see RepresentationGraph.EdgeElement
	 * @generated
	 */
	EClass getEdgeElement();

	/**
	 * Returns the meta object for the reference '{@link RepresentationGraph.EdgeElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see RepresentationGraph.EdgeElement#getSource()
	 * @see #getEdgeElement()
	 * @generated
	 */
	EReference getEdgeElement_Source();

	/**
	 * Returns the meta object for the reference '{@link RepresentationGraph.EdgeElement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see RepresentationGraph.EdgeElement#getTarget()
	 * @see #getEdgeElement()
	 * @generated
	 */
	EReference getEdgeElement_Target();

	/**
	 * Returns the meta object for class '{@link RepresentationGraph.NodeElement <em>Node Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Element</em>'.
	 * @see RepresentationGraph.NodeElement
	 * @generated
	 */
	EClass getNodeElement();

	/**
	 * Returns the meta object for the reference list '{@link RepresentationGraph.NodeElement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see RepresentationGraph.NodeElement#getLink()
	 * @see #getNodeElement()
	 * @generated
	 */
	EReference getNodeElement_Link();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.NodeElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see RepresentationGraph.NodeElement#getLabel()
	 * @see #getNodeElement()
	 * @generated
	 */
	EAttribute getNodeElement_Label();

	/**
	 * Returns the meta object for class '{@link RepresentationGraph.IconElement <em>Icon Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Element</em>'.
	 * @see RepresentationGraph.IconElement
	 * @generated
	 */
	EClass getIconElement();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.IconElement#getFilepath <em>Filepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filepath</em>'.
	 * @see RepresentationGraph.IconElement#getFilepath()
	 * @see #getIconElement()
	 * @generated
	 */
	EAttribute getIconElement_Filepath();

	/**
	 * Returns the meta object for class '{@link RepresentationGraph.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see RepresentationGraph.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see RepresentationGraph.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for class '{@link RepresentationGraph.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see RepresentationGraph.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.Rectangle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see RepresentationGraph.Rectangle#getWidth()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Width();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.Rectangle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see RepresentationGraph.Rectangle#getHeight()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Height();

	/**
	 * Returns the meta object for class '{@link RepresentationGraph.GraphicElement <em>Graphic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Element</em>'.
	 * @see RepresentationGraph.GraphicElement
	 * @generated
	 */
	EClass getGraphicElement();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.GraphicElement#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see RepresentationGraph.GraphicElement#getColor()
	 * @see #getGraphicElement()
	 * @generated
	 */
	EAttribute getGraphicElement_Color();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.GraphicElement#getPaletteName <em>Palette Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette Name</em>'.
	 * @see RepresentationGraph.GraphicElement#getPaletteName()
	 * @see #getGraphicElement()
	 * @generated
	 */
	EAttribute getGraphicElement_PaletteName();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.GraphicElement#getPaletteIconPath <em>Palette Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette Icon Path</em>'.
	 * @see RepresentationGraph.GraphicElement#getPaletteIconPath()
	 * @see #getGraphicElement()
	 * @generated
	 */
	EAttribute getGraphicElement_PaletteIconPath();

	/**
	 * Returns the meta object for class '{@link RepresentationGraph.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Element</em>'.
	 * @see RepresentationGraph.ContainerElement
	 * @generated
	 */
	EClass getContainerElement();

	/**
	 * Returns the meta object for the containment reference list '{@link RepresentationGraph.ContainerElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see RepresentationGraph.ContainerElement#getContains()
	 * @see #getContainerElement()
	 * @generated
	 */
	EReference getContainerElement_Contains();

	/**
	 * Returns the meta object for class '{@link RepresentationGraph.Rhombus <em>Rhombus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rhombus</em>'.
	 * @see RepresentationGraph.Rhombus
	 * @generated
	 */
	EClass getRhombus();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.Rhombus#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see RepresentationGraph.Rhombus#getWidth()
	 * @see #getRhombus()
	 * @generated
	 */
	EAttribute getRhombus_Width();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationGraph.Rhombus#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see RepresentationGraph.Rhombus#getHeight()
	 * @see #getRhombus()
	 * @generated
	 */
	EAttribute getRhombus_Height();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepresentationGraphFactory getRepresentationGraphFactory();

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
		 * The meta object literal for the '{@link RepresentationGraph.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RepresentationGraph.impl.DiagramImpl
		 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__ELEMENTS = eINSTANCE.getDiagram_Elements();

		/**
		 * The meta object literal for the '{@link RepresentationGraph.impl.EdgeElementImpl <em>Edge Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RepresentationGraph.impl.EdgeElementImpl
		 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getEdgeElement()
		 * @generated
		 */
		EClass EDGE_ELEMENT = eINSTANCE.getEdgeElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_ELEMENT__SOURCE = eINSTANCE.getEdgeElement_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_ELEMENT__TARGET = eINSTANCE.getEdgeElement_Target();

		/**
		 * The meta object literal for the '{@link RepresentationGraph.impl.NodeElementImpl <em>Node Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RepresentationGraph.impl.NodeElementImpl
		 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getNodeElement()
		 * @generated
		 */
		EClass NODE_ELEMENT = eINSTANCE.getNodeElement();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ELEMENT__LINK = eINSTANCE.getNodeElement_Link();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ELEMENT__LABEL = eINSTANCE.getNodeElement_Label();

		/**
		 * The meta object literal for the '{@link RepresentationGraph.impl.IconElementImpl <em>Icon Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RepresentationGraph.impl.IconElementImpl
		 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getIconElement()
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
		 * The meta object literal for the '{@link RepresentationGraph.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RepresentationGraph.impl.CircleImpl
		 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '{@link RepresentationGraph.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RepresentationGraph.impl.RectangleImpl
		 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getRectangle()
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
		 * The meta object literal for the '{@link RepresentationGraph.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RepresentationGraph.impl.GraphicElementImpl
		 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getGraphicElement()
		 * @generated
		 */
		EClass GRAPHIC_ELEMENT = eINSTANCE.getGraphicElement();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ELEMENT__COLOR = eINSTANCE.getGraphicElement_Color();

		/**
		 * The meta object literal for the '<em><b>Palette Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ELEMENT__PALETTE_NAME = eINSTANCE.getGraphicElement_PaletteName();

		/**
		 * The meta object literal for the '<em><b>Palette Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ELEMENT__PALETTE_ICON_PATH = eINSTANCE.getGraphicElement_PaletteIconPath();

		/**
		 * The meta object literal for the '{@link RepresentationGraph.impl.ContainerElementImpl <em>Container Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RepresentationGraph.impl.ContainerElementImpl
		 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getContainerElement()
		 * @generated
		 */
		EClass CONTAINER_ELEMENT = eINSTANCE.getContainerElement();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ELEMENT__CONTAINS = eINSTANCE.getContainerElement_Contains();

		/**
		 * The meta object literal for the '{@link RepresentationGraph.impl.RhombusImpl <em>Rhombus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RepresentationGraph.impl.RhombusImpl
		 * @see RepresentationGraph.impl.RepresentationGraphPackageImpl#getRhombus()
		 * @generated
		 */
		EClass RHOMBUS = eINSTANCE.getRhombus();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RHOMBUS__WIDTH = eINSTANCE.getRhombus_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RHOMBUS__HEIGHT = eINSTANCE.getRhombus_Height();

	}

} //RepresentationGraphPackage
