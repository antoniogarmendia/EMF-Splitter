/**
 */
package Visualization;

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
 * @see Visualization.VisualizationFactory
 * @model kind="package"
 * @generated
 */
public interface VisualizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Visualization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.dsl.org/mmPatterns/visualization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visualization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizationPackage eINSTANCE = Visualization.impl.VisualizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link Visualization.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Visualization.impl.RootImpl
	 * @see Visualization.impl.VisualizationPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Visualization.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Visualization.impl.GraphicElementImpl
	 * @see Visualization.impl.VisualizationPackageImpl#getGraphicElement()
	 * @generated
	 */
	int GRAPHIC_ELEMENT = 3;

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
	 * The meta object id for the '{@link Visualization.impl.EdgeElementImpl <em>Edge Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Visualization.impl.EdgeElementImpl
	 * @see Visualization.impl.VisualizationPackageImpl#getEdgeElement()
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
	 * The meta object id for the '{@link Visualization.impl.NodeElementImpl <em>Node Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Visualization.impl.NodeElementImpl
	 * @see Visualization.impl.VisualizationPackageImpl#getNodeElement()
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
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT__LINK = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ELEMENT_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link Visualization.impl.IconElementImpl <em>Icon Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Visualization.impl.IconElementImpl
	 * @see Visualization.impl.VisualizationPackageImpl#getIconElement()
	 * @generated
	 */
	int ICON_ELEMENT = 4;

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
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_ELEMENT__LINK = NODE_ELEMENT__LINK;

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
	 * The meta object id for the '{@link Visualization.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Visualization.impl.ShapeImpl
	 * @see Visualization.impl.VisualizationPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__COLOR = NODE_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PALETTE_NAME = NODE_ELEMENT__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PALETTE_ICON_PATH = NODE_ELEMENT__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINK = NODE_ELEMENT__LINK;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = NODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = NODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Visualization.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Visualization.impl.CircleImpl
	 * @see Visualization.impl.VisualizationPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__PALETTE_NAME = SHAPE__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__PALETTE_ICON_PATH = SHAPE__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LINK = SHAPE__LINK;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Visualization.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Visualization.impl.RectangleImpl
	 * @see Visualization.impl.VisualizationPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__PALETTE_NAME = SHAPE__PALETTE_NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__PALETTE_ICON_PATH = SHAPE__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LINK = SHAPE__LINK;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__WIDTH = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__HEIGHT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Visualization.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see Visualization.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link Visualization.Root#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see Visualization.Root#getElements()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Elements();

	/**
	 * Returns the meta object for class '{@link Visualization.EdgeElement <em>Edge Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Element</em>'.
	 * @see Visualization.EdgeElement
	 * @generated
	 */
	EClass getEdgeElement();

	/**
	 * Returns the meta object for the reference '{@link Visualization.EdgeElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Visualization.EdgeElement#getSource()
	 * @see #getEdgeElement()
	 * @generated
	 */
	EReference getEdgeElement_Source();

	/**
	 * Returns the meta object for the reference '{@link Visualization.EdgeElement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Visualization.EdgeElement#getTarget()
	 * @see #getEdgeElement()
	 * @generated
	 */
	EReference getEdgeElement_Target();

	/**
	 * Returns the meta object for class '{@link Visualization.NodeElement <em>Node Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Element</em>'.
	 * @see Visualization.NodeElement
	 * @generated
	 */
	EClass getNodeElement();

	/**
	 * Returns the meta object for the reference '{@link Visualization.NodeElement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see Visualization.NodeElement#getLink()
	 * @see #getNodeElement()
	 * @generated
	 */
	EReference getNodeElement_Link();

	/**
	 * Returns the meta object for class '{@link Visualization.GraphicElement <em>Graphic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Element</em>'.
	 * @see Visualization.GraphicElement
	 * @generated
	 */
	EClass getGraphicElement();

	/**
	 * Returns the meta object for the attribute '{@link Visualization.GraphicElement#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see Visualization.GraphicElement#getColor()
	 * @see #getGraphicElement()
	 * @generated
	 */
	EAttribute getGraphicElement_Color();

	/**
	 * Returns the meta object for the attribute '{@link Visualization.GraphicElement#getPaletteName <em>Palette Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette Name</em>'.
	 * @see Visualization.GraphicElement#getPaletteName()
	 * @see #getGraphicElement()
	 * @generated
	 */
	EAttribute getGraphicElement_PaletteName();

	/**
	 * Returns the meta object for the attribute '{@link Visualization.GraphicElement#getPaletteIconPath <em>Palette Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette Icon Path</em>'.
	 * @see Visualization.GraphicElement#getPaletteIconPath()
	 * @see #getGraphicElement()
	 * @generated
	 */
	EAttribute getGraphicElement_PaletteIconPath();

	/**
	 * Returns the meta object for class '{@link Visualization.IconElement <em>Icon Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Element</em>'.
	 * @see Visualization.IconElement
	 * @generated
	 */
	EClass getIconElement();

	/**
	 * Returns the meta object for the attribute '{@link Visualization.IconElement#getFilepath <em>Filepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filepath</em>'.
	 * @see Visualization.IconElement#getFilepath()
	 * @see #getIconElement()
	 * @generated
	 */
	EAttribute getIconElement_Filepath();

	/**
	 * Returns the meta object for class '{@link Visualization.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see Visualization.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for class '{@link Visualization.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see Visualization.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link Visualization.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see Visualization.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for class '{@link Visualization.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see Visualization.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute '{@link Visualization.Rectangle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see Visualization.Rectangle#getWidth()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Width();

	/**
	 * Returns the meta object for the attribute '{@link Visualization.Rectangle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see Visualization.Rectangle#getHeight()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Height();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualizationFactory getVisualizationFactory();

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
		 * The meta object literal for the '{@link Visualization.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Visualization.impl.RootImpl
		 * @see Visualization.impl.VisualizationPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ELEMENTS = eINSTANCE.getRoot_Elements();

		/**
		 * The meta object literal for the '{@link Visualization.impl.EdgeElementImpl <em>Edge Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Visualization.impl.EdgeElementImpl
		 * @see Visualization.impl.VisualizationPackageImpl#getEdgeElement()
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
		 * The meta object literal for the '{@link Visualization.impl.NodeElementImpl <em>Node Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Visualization.impl.NodeElementImpl
		 * @see Visualization.impl.VisualizationPackageImpl#getNodeElement()
		 * @generated
		 */
		EClass NODE_ELEMENT = eINSTANCE.getNodeElement();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ELEMENT__LINK = eINSTANCE.getNodeElement_Link();

		/**
		 * The meta object literal for the '{@link Visualization.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Visualization.impl.GraphicElementImpl
		 * @see Visualization.impl.VisualizationPackageImpl#getGraphicElement()
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
		 * The meta object literal for the '{@link Visualization.impl.IconElementImpl <em>Icon Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Visualization.impl.IconElementImpl
		 * @see Visualization.impl.VisualizationPackageImpl#getIconElement()
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
		 * The meta object literal for the '{@link Visualization.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Visualization.impl.ShapeImpl
		 * @see Visualization.impl.VisualizationPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link Visualization.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Visualization.impl.CircleImpl
		 * @see Visualization.impl.VisualizationPackageImpl#getCircle()
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
		 * The meta object literal for the '{@link Visualization.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Visualization.impl.RectangleImpl
		 * @see Visualization.impl.VisualizationPackageImpl#getRectangle()
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

	}

} //VisualizationPackage
