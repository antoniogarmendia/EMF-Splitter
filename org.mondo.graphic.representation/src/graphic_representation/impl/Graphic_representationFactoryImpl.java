/**
 */
package graphic_representation.impl;

import graphic_representation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Graphic_representationFactoryImpl extends EFactoryImpl implements Graphic_representationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Graphic_representationFactory init() {
		try {
			Graphic_representationFactory theGraphic_representationFactory = (Graphic_representationFactory)EPackage.Registry.INSTANCE.getEFactory(Graphic_representationPackage.eNS_URI);
			if (theGraphic_representationFactory != null) {
				return theGraphic_representationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Graphic_representationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphic_representationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION: return createMMGraphic_Representation();
			case Graphic_representationPackage.DIAGRAM_ELEMENT: return createDiagramElement();
			case Graphic_representationPackage.ABSTRACT_ELEMENT: return createAbstractElement();
			case Graphic_representationPackage.EDGE: return createEdge();
			case Graphic_representationPackage.EDGE_LABEL_EATTRIBUTE: return createEdgeLabelEAttribute();
			case Graphic_representationPackage.NODE: return createNode();
			case Graphic_representationPackage.ICON_ELEMENT: return createIconElement();
			case Graphic_representationPackage.PALETTE_DESCRIPTION: return createPaletteDescription();
			case Graphic_representationPackage.NODE_ELEMENT: return createNode_Element();
			case Graphic_representationPackage.EXPANDABLE_ITEM: return createExpandableItem();
			case Graphic_representationPackage.EDGE_STYLE: return createEdge_Style();
			case Graphic_representationPackage.ROOT: return createRoot();
			case Graphic_representationPackage.EDGE_DIRECTION: return createEdge_Direction();
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION: return createGraphicRepresentation();
			case Graphic_representationPackage.SHAPE: return createShape();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT: return createShapeCompartmentGradient();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_PARALLELOGRAM: return createShapeCompartmentParallelogram();
			case Graphic_representationPackage.ELLIPSE: return createEllipse();
			case Graphic_representationPackage.NOTE: return createNote();
			case Graphic_representationPackage.DIAMOND: return createDiamond();
			case Graphic_representationPackage.RECTANGLE: return createRectangle();
			case Graphic_representationPackage.LINK: return createLink();
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK: return createPaletteDescriptionLink();
			case Graphic_representationPackage.DEFAULT_LAYER: return createDefaultLayer();
			case Graphic_representationPackage.ADDITIONAL_LAYER: return createAdditionalLayer();
			case Graphic_representationPackage.AFFIXED_ELEMENT: return createAffixedElement();
			case Graphic_representationPackage.COMPARTMENT_ELEMENT: return createCompartmentElement();
			case Graphic_representationPackage.LABEL_EATTRIBUTE: return createLabelEAttribute();
			case Graphic_representationPackage.GR_USER_COLOR_DEF: return createGRUserColorDef();
			case Graphic_representationPackage.RGB_COLOR: return createRGBColor();
			case Graphic_representationPackage.SIRIUS_SYSTEM_COLORS: return createSiriusSystemColors();
			case Graphic_representationPackage.REPRESENTATION_DD: return createRepresentationDD();
			case Graphic_representationPackage.REPRESENTATION_TABLE: return createRepresentationTable();
			case Graphic_representationPackage.LINE_GROUP: return createLineGroup();
			case Graphic_representationPackage.CONDITIONAL_STYLE: return createConditionalStyle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Graphic_representationPackage.GR_FONT_FORMAT:
				return createGRFontFormatFromString(eDataType, initialValue);
			case Graphic_representationPackage.LABEL_POSITION:
				return createLabelPositionFromString(eDataType, initialValue);
			case Graphic_representationPackage.CHILDREN_PRESENTATION:
				return createChildrenPresentationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Graphic_representationPackage.GR_FONT_FORMAT:
				return convertGRFontFormatToString(eDataType, instanceValue);
			case Graphic_representationPackage.LABEL_POSITION:
				return convertLabelPositionToString(eDataType, instanceValue);
			case Graphic_representationPackage.CHILDREN_PRESENTATION:
				return convertChildrenPresentationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMGraphic_Representation createMMGraphic_Representation() {
		MMGraphic_RepresentationImpl mmGraphic_Representation = new MMGraphic_RepresentationImpl();
		return mmGraphic_Representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement createDiagramElement() {
		DiagramElementImpl diagramElement = new DiagramElementImpl();
		return diagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElement createAbstractElement() {
		AbstractElementImpl abstractElement = new AbstractElementImpl();
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeLabelEAttribute createEdgeLabelEAttribute() {
		EdgeLabelEAttributeImpl edgeLabelEAttribute = new EdgeLabelEAttributeImpl();
		return edgeLabelEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconElement createIconElement() {
		IconElementImpl iconElement = new IconElementImpl();
		return iconElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaletteDescription createPaletteDescription() {
		PaletteDescriptionImpl paletteDescription = new PaletteDescriptionImpl();
		return paletteDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node_Element createNode_Element() {
		Node_ElementImpl node_Element = new Node_ElementImpl();
		return node_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandableItem createExpandableItem() {
		ExpandableItemImpl expandableItem = new ExpandableItemImpl();
		return expandableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge_Style createEdge_Style() {
		Edge_StyleImpl edge_Style = new Edge_StyleImpl();
		return edge_Style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge_Direction createEdge_Direction() {
		Edge_DirectionImpl edge_Direction = new Edge_DirectionImpl();
		return edge_Direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicRepresentation createGraphicRepresentation() {
		GraphicRepresentationImpl graphicRepresentation = new GraphicRepresentationImpl();
		return graphicRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShape() {
		ShapeImpl shape = new ShapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeCompartmentGradient createShapeCompartmentGradient() {
		ShapeCompartmentGradientImpl shapeCompartmentGradient = new ShapeCompartmentGradientImpl();
		return shapeCompartmentGradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeCompartmentParallelogram createShapeCompartmentParallelogram() {
		ShapeCompartmentParallelogramImpl shapeCompartmentParallelogram = new ShapeCompartmentParallelogramImpl();
		return shapeCompartmentParallelogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ellipse createEllipse() {
		EllipseImpl ellipse = new EllipseImpl();
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diamond createDiamond() {
		DiamondImpl diamond = new DiamondImpl();
		return diamond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaletteDescriptionLink createPaletteDescriptionLink() {
		PaletteDescriptionLinkImpl paletteDescriptionLink = new PaletteDescriptionLinkImpl();
		return paletteDescriptionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultLayer createDefaultLayer() {
		DefaultLayerImpl defaultLayer = new DefaultLayerImpl();
		return defaultLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalLayer createAdditionalLayer() {
		AdditionalLayerImpl additionalLayer = new AdditionalLayerImpl();
		return additionalLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffixedElement createAffixedElement() {
		AffixedElementImpl affixedElement = new AffixedElementImpl();
		return affixedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentElement createCompartmentElement() {
		CompartmentElementImpl compartmentElement = new CompartmentElementImpl();
		return compartmentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelEAttribute createLabelEAttribute() {
		LabelEAttributeImpl labelEAttribute = new LabelEAttributeImpl();
		return labelEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRUserColorDef createGRUserColorDef() {
		GRUserColorDefImpl grUserColorDef = new GRUserColorDefImpl();
		return grUserColorDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor createRGBColor() {
		RGBColorImpl rgbColor = new RGBColorImpl();
		return rgbColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiriusSystemColors createSiriusSystemColors() {
		SiriusSystemColorsImpl siriusSystemColors = new SiriusSystemColorsImpl();
		return siriusSystemColors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationTable createRepresentationTable() {
		RepresentationTableImpl representationTable = new RepresentationTableImpl();
		return representationTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationDD createRepresentationDD() {
		RepresentationDDImpl representationDD = new RepresentationDDImpl();
		return representationDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineGroup createLineGroup() {
		LineGroupImpl lineGroup = new LineGroupImpl();
		return lineGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalStyle createConditionalStyle() {
		ConditionalStyleImpl conditionalStyle = new ConditionalStyleImpl();
		return conditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRFontFormat createGRFontFormatFromString(EDataType eDataType, String initialValue) {
		GRFontFormat result = GRFontFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGRFontFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelPosition createLabelPositionFromString(EDataType eDataType, String initialValue) {
		LabelPosition result = LabelPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildrenPresentation createChildrenPresentationFromString(EDataType eDataType, String initialValue) {
		ChildrenPresentation result = ChildrenPresentation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChildrenPresentationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphic_representationPackage getGraphic_representationPackage() {
		return (Graphic_representationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Graphic_representationPackage getPackage() {
		return Graphic_representationPackage.eINSTANCE;
	}

} //Graphic_representationFactoryImpl
