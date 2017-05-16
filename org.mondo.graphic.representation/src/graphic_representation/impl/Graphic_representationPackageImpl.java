/**
 */
package graphic_representation.impl;

import graphic_representation.AbstractElement;
import graphic_representation.AdditionalLayer;
import graphic_representation.AffixedCompartmentElement;
import graphic_representation.AffixedElement;
import graphic_representation.AllElements;
import graphic_representation.Border;
import graphic_representation.ChildrenPresentation;
import graphic_representation.Color;
import graphic_representation.CompartmentElement;
import graphic_representation.ConditionalStyle;
import graphic_representation.DefaultLayer;
import graphic_representation.DiagramElement;
import graphic_representation.Diamond;
import graphic_representation.Edge;
import graphic_representation.EdgeLabelEAttribute;
import graphic_representation.Edge_Direction;
import graphic_representation.Edge_Style;
import graphic_representation.Ellipse;
import graphic_representation.ExpandableItem;
import graphic_representation.GRColorDescription;
import graphic_representation.GRFontFormat;
import graphic_representation.GRLabelStyleDescription;
import graphic_representation.GRUserColor;
import graphic_representation.GRUserColorDef;
import graphic_representation.GraphicRepresentation;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.IconElement;
import graphic_representation.LabelEAttribute;
import graphic_representation.LabelPosition;
import graphic_representation.Layer;
import graphic_representation.Line;
import graphic_representation.LineGroup;
import graphic_representation.Link;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.Node;
import graphic_representation.Node_Element;
import graphic_representation.Note;
import graphic_representation.PaletteDescription;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.RGBColor;
import graphic_representation.RGBColorDescription;
import graphic_representation.Rectangle;
import graphic_representation.Representation;
import graphic_representation.RepresentationDD;
import graphic_representation.RepresentationTable;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.ShapeColor;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.ShapeCompartmentParallelogram;
import graphic_representation.SiriusSystemColors;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Graphic_representationPackageImpl extends EPackageImpl implements Graphic_representationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mmGraphic_RepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeLabelEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paletteDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass node_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edge_StyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edge_DirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeCompartmentGradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeCompartmentParallelogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diamondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paletteDescriptionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affixedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affixedCompartmentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grUserColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grUserColorDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grColorDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbColorDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusSystemColorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grLabelStyleDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationDDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum grFontFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum childrenPresentationEEnum = null;

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
	 * @see graphic_representation.Graphic_representationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Graphic_representationPackageImpl() {
		super(eNS_URI, Graphic_representationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Graphic_representationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Graphic_representationPackage init() {
		if (isInited) return (Graphic_representationPackage)EPackage.Registry.INSTANCE.getEPackage(Graphic_representationPackage.eNS_URI);

		// Obtain or create and register package
		Graphic_representationPackageImpl theGraphic_representationPackage = (Graphic_representationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Graphic_representationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Graphic_representationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ViewpointPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGraphic_representationPackage.createPackageContents();

		// Initialize created meta-data
		theGraphic_representationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphic_representationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Graphic_representationPackage.eNS_URI, theGraphic_representationPackage);
		return theGraphic_representationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMGraphic_Representation() {
		return mmGraphic_RepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMMGraphic_Representation_Extension() {
		return (EAttribute)mmGraphic_RepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMGraphic_Representation_ListRepresentations() {
		return (EReference)mmGraphic_RepresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMMGraphic_Representation_IsGeopalette() {
		return (EAttribute)mmGraphic_RepresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllElements() {
		return allElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramElement() {
		return diagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElement_AnEClass() {
		return (EReference)diagramElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElement_Diag_palette() {
		return (EReference)diagramElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElement_ContainerReference() {
		return (EReference)diagramElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractElement() {
		return abstractElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElement_AnEClass() {
		return (EReference)abstractElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElement_Node_elements() {
		return (EReference)abstractElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Directions() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Edge_style() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_EdgeLabel() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeLabelEAttribute() {
		return edgeLabelEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeLabelEAttribute_LabelEAttribute() {
		return (EReference)edgeLabelEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Node_elements() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Node_shape() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Expandable() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_ConditionalStyle() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Presentation() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconElement() {
		return iconElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconElement_Filepath() {
		return (EAttribute)iconElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconElement_EmbeddedImage() {
		return (EAttribute)iconElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIconElement__ImageBase64() {
		return iconElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaletteDescription() {
		return paletteDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaletteDescription_Icon_filepath() {
		return (EAttribute)paletteDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaletteDescription_Palette_name() {
		return (EAttribute)paletteDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaletteDescription_IsDraggable() {
		return (EAttribute)paletteDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode_Element() {
		return node_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Element_LabelanEAttribute() {
		return (EReference)node_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Element_LinkPalette() {
		return (EReference)node_ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Element_AffixedCompartmentElements() {
		return (EReference)node_ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Element_ExpandableItems() {
		return (EReference)node_ElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode_Element__IsCompartment() {
		return node_ElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpandableItem() {
		return expandableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpandableItem_Index() {
		return (EAttribute)expandableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandableItem_AnEReference() {
		return (EReference)expandableItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge_Style() {
		return edge_StyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Style_LineStyle() {
		return (EAttribute)edge_StyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Style_LineWidth() {
		return (EAttribute)edge_StyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_AnEClass() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Root_node_elements() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Root_shape() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_RootLayer() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge_Direction() {
		return edge_DirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Direction_SourceLink() {
		return (EReference)edge_DirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Direction_TargetLink() {
		return (EReference)edge_DirectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicRepresentation() {
		return graphicRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicRepresentation_AllGraphicRepresentation() {
		return (EReference)graphicRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicRepresentation_Name() {
		return (EAttribute)graphicRepresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicRepresentation_UserColors() {
		return (EReference)graphicRepresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeCompartmentGradient() {
		return shapeCompartmentGradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeCompartmentGradient_Width() {
		return (EAttribute)shapeCompartmentGradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeCompartmentGradient_Height() {
		return (EAttribute)shapeCompartmentGradientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeCompartmentGradient_CornerHeight() {
		return (EAttribute)shapeCompartmentGradientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeCompartmentGradient_CornerWidth() {
		return (EAttribute)shapeCompartmentGradientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeCompartmentGradient_ForeGroundColor() {
		return (EReference)shapeCompartmentGradientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeCompartmentParallelogram() {
		return shapeCompartmentParallelogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeCompartmentParallelogram_Width() {
		return (EAttribute)shapeCompartmentParallelogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeCompartmentParallelogram_Height() {
		return (EAttribute)shapeCompartmentParallelogramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipse() {
		return ellipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_HorizontalDiameter() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_VerticalDiameter() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Size() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiamond() {
		return diamondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiamond_Size() {
		return (EAttribute)diamondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangle() {
		return rectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangle_Width() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangle_Height() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeColor() {
		return shapeColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeColor_Color() {
		return (EReference)shapeColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_AnEReference() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_AnDiagramElement() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_DecoratorName() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaletteDescriptionLink() {
		return paletteDescriptionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaletteDescriptionLink_SourceDecoratorName() {
		return (EAttribute)paletteDescriptionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayer_Name() {
		return (EAttribute)layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_Elements() {
		return (EReference)layerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultLayer() {
		return defaultLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalLayer() {
		return additionalLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffixedElement() {
		return affixedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentElement() {
		return compartmentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffixedCompartmentElement() {
		return affixedCompartmentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffixedCompartmentElement_AnEReference() {
		return (EReference)affixedCompartmentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffixedCompartmentElement_Nodes() {
		return (EReference)affixedCompartmentElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelEAttribute() {
		return labelEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelEAttribute_AnEAttribute() {
		return (EReference)labelEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorder() {
		return borderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorder_BorderColor() {
		return (EReference)borderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRUserColor() {
		return grUserColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRUserColorDef() {
		return grUserColorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRUserColorDef_Color() {
		return (EReference)grUserColorDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRColorDescription() {
		return grColorDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRColorDescription_Name() {
		return (EAttribute)grColorDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGBColorDescription() {
		return rgbColorDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColorDescription_Name() {
		return (EAttribute)rgbColorDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGBColor() {
		return rgbColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_Red() {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_Green() {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_Blue() {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiriusSystemColors() {
		return siriusSystemColorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSiriusSystemColors__GetSystemColorDescription__String() {
		return siriusSystemColorsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRLabelStyleDescription() {
		return grLabelStyleDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRLabelStyleDescription_LabelFormat() {
		return (EAttribute)grLabelStyleDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRLabelStyleDescription_ShowIcon() {
		return (EAttribute)grLabelStyleDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRLabelStyleDescription_LabelPosition() {
		return (EAttribute)grLabelStyleDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationTable() {
		return representationTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationTable_RootTable() {
		return (EReference)representationTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationTable_Lines() {
		return (EReference)representationTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationTable_Columns() {
		return (EReference)representationTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationDD() {
		return representationDDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentationDD_Name() {
		return (EAttribute)representationDDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationDD_Root() {
		return (EReference)representationDDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationDD_Layers() {
		return (EReference)representationDDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_FeatureReference() {
		return (EReference)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_ListEClasses() {
		return (EReference)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineGroup() {
		return lineGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineGroup_ListLines() {
		return (EReference)lineGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalStyle() {
		return conditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStyle_EAttribute() {
		return (EReference)conditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalStyle_Value() {
		return (EAttribute)conditionalStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStyle_ConditionalStyle() {
		return (EReference)conditionalStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGRFontFormat() {
		return grFontFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelPosition() {
		return labelPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChildrenPresentation() {
		return childrenPresentationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorder_BorderStyle() {
		return (EAttribute)borderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorder_BorderWidth() {
		return (EAttribute)borderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphic_representationFactory getGraphic_representationFactory() {
		return (Graphic_representationFactory)getEFactoryInstance();
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
		mmGraphic_RepresentationEClass = createEClass(MM_GRAPHIC_REPRESENTATION);
		createEAttribute(mmGraphic_RepresentationEClass, MM_GRAPHIC_REPRESENTATION__EXTENSION);
		createEReference(mmGraphic_RepresentationEClass, MM_GRAPHIC_REPRESENTATION__LIST_REPRESENTATIONS);
		createEAttribute(mmGraphic_RepresentationEClass, MM_GRAPHIC_REPRESENTATION__IS_GEOPALETTE);

		allElementsEClass = createEClass(ALL_ELEMENTS);

		diagramElementEClass = createEClass(DIAGRAM_ELEMENT);
		createEReference(diagramElementEClass, DIAGRAM_ELEMENT__AN_ECLASS);
		createEReference(diagramElementEClass, DIAGRAM_ELEMENT__DIAG_PALETTE);
		createEReference(diagramElementEClass, DIAGRAM_ELEMENT__CONTAINER_REFERENCE);

		abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
		createEReference(abstractElementEClass, ABSTRACT_ELEMENT__AN_ECLASS);
		createEReference(abstractElementEClass, ABSTRACT_ELEMENT__NODE_ELEMENTS);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__DIRECTIONS);
		createEReference(edgeEClass, EDGE__EDGE_STYLE);
		createEReference(edgeEClass, EDGE__EDGE_LABEL);

		edgeLabelEAttributeEClass = createEClass(EDGE_LABEL_EATTRIBUTE);
		createEReference(edgeLabelEAttributeEClass, EDGE_LABEL_EATTRIBUTE__LABEL_EATTRIBUTE);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__NODE_ELEMENTS);
		createEReference(nodeEClass, NODE__NODE_SHAPE);
		createEAttribute(nodeEClass, NODE__EXPANDABLE);
		createEReference(nodeEClass, NODE__CONDITIONAL_STYLE);
		createEAttribute(nodeEClass, NODE__PRESENTATION);

		iconElementEClass = createEClass(ICON_ELEMENT);
		createEAttribute(iconElementEClass, ICON_ELEMENT__FILEPATH);
		createEAttribute(iconElementEClass, ICON_ELEMENT__EMBEDDED_IMAGE);
		createEOperation(iconElementEClass, ICON_ELEMENT___IMAGE_BASE64);

		paletteDescriptionEClass = createEClass(PALETTE_DESCRIPTION);
		createEAttribute(paletteDescriptionEClass, PALETTE_DESCRIPTION__ICON_FILEPATH);
		createEAttribute(paletteDescriptionEClass, PALETTE_DESCRIPTION__PALETTE_NAME);
		createEAttribute(paletteDescriptionEClass, PALETTE_DESCRIPTION__IS_DRAGGABLE);

		node_ElementEClass = createEClass(NODE_ELEMENT);
		createEReference(node_ElementEClass, NODE_ELEMENT__LABELAN_EATTRIBUTE);
		createEReference(node_ElementEClass, NODE_ELEMENT__LINK_PALETTE);
		createEReference(node_ElementEClass, NODE_ELEMENT__AFFIXED_COMPARTMENT_ELEMENTS);
		createEReference(node_ElementEClass, NODE_ELEMENT__EXPANDABLE_ITEMS);
		createEOperation(node_ElementEClass, NODE_ELEMENT___IS_COMPARTMENT);

		expandableItemEClass = createEClass(EXPANDABLE_ITEM);
		createEAttribute(expandableItemEClass, EXPANDABLE_ITEM__INDEX);
		createEReference(expandableItemEClass, EXPANDABLE_ITEM__AN_EREFERENCE);

		edge_StyleEClass = createEClass(EDGE_STYLE);
		createEAttribute(edge_StyleEClass, EDGE_STYLE__LINE_STYLE);
		createEAttribute(edge_StyleEClass, EDGE_STYLE__LINE_WIDTH);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__AN_ECLASS);
		createEReference(rootEClass, ROOT__ROOT_NODE_ELEMENTS);
		createEReference(rootEClass, ROOT__ROOT_SHAPE);
		createEReference(rootEClass, ROOT__ROOT_LAYER);

		edge_DirectionEClass = createEClass(EDGE_DIRECTION);
		createEReference(edge_DirectionEClass, EDGE_DIRECTION__SOURCE_LINK);
		createEReference(edge_DirectionEClass, EDGE_DIRECTION__TARGET_LINK);

		graphicRepresentationEClass = createEClass(GRAPHIC_REPRESENTATION);
		createEReference(graphicRepresentationEClass, GRAPHIC_REPRESENTATION__ALL_GRAPHIC_REPRESENTATION);
		createEAttribute(graphicRepresentationEClass, GRAPHIC_REPRESENTATION__NAME);
		createEReference(graphicRepresentationEClass, GRAPHIC_REPRESENTATION__USER_COLORS);

		shapeEClass = createEClass(SHAPE);

		shapeCompartmentGradientEClass = createEClass(SHAPE_COMPARTMENT_GRADIENT);
		createEAttribute(shapeCompartmentGradientEClass, SHAPE_COMPARTMENT_GRADIENT__WIDTH);
		createEAttribute(shapeCompartmentGradientEClass, SHAPE_COMPARTMENT_GRADIENT__HEIGHT);
		createEAttribute(shapeCompartmentGradientEClass, SHAPE_COMPARTMENT_GRADIENT__CORNER_HEIGHT);
		createEAttribute(shapeCompartmentGradientEClass, SHAPE_COMPARTMENT_GRADIENT__CORNER_WIDTH);
		createEReference(shapeCompartmentGradientEClass, SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR);

		shapeCompartmentParallelogramEClass = createEClass(SHAPE_COMPARTMENT_PARALLELOGRAM);
		createEAttribute(shapeCompartmentParallelogramEClass, SHAPE_COMPARTMENT_PARALLELOGRAM__WIDTH);
		createEAttribute(shapeCompartmentParallelogramEClass, SHAPE_COMPARTMENT_PARALLELOGRAM__HEIGHT);

		ellipseEClass = createEClass(ELLIPSE);
		createEAttribute(ellipseEClass, ELLIPSE__HORIZONTAL_DIAMETER);
		createEAttribute(ellipseEClass, ELLIPSE__VERTICAL_DIAMETER);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__SIZE);

		diamondEClass = createEClass(DIAMOND);
		createEAttribute(diamondEClass, DIAMOND__SIZE);

		rectangleEClass = createEClass(RECTANGLE);
		createEAttribute(rectangleEClass, RECTANGLE__WIDTH);
		createEAttribute(rectangleEClass, RECTANGLE__HEIGHT);

		shapeColorEClass = createEClass(SHAPE_COLOR);
		createEReference(shapeColorEClass, SHAPE_COLOR__COLOR);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__AN_EREFERENCE);
		createEReference(linkEClass, LINK__AN_DIAGRAM_ELEMENT);
		createEAttribute(linkEClass, LINK__DECORATOR_NAME);

		paletteDescriptionLinkEClass = createEClass(PALETTE_DESCRIPTION_LINK);
		createEAttribute(paletteDescriptionLinkEClass, PALETTE_DESCRIPTION_LINK__SOURCE_DECORATOR_NAME);

		layerEClass = createEClass(LAYER);
		createEAttribute(layerEClass, LAYER__NAME);
		createEReference(layerEClass, LAYER__ELEMENTS);

		defaultLayerEClass = createEClass(DEFAULT_LAYER);

		additionalLayerEClass = createEClass(ADDITIONAL_LAYER);

		affixedElementEClass = createEClass(AFFIXED_ELEMENT);

		compartmentElementEClass = createEClass(COMPARTMENT_ELEMENT);

		affixedCompartmentElementEClass = createEClass(AFFIXED_COMPARTMENT_ELEMENT);
		createEReference(affixedCompartmentElementEClass, AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE);
		createEReference(affixedCompartmentElementEClass, AFFIXED_COMPARTMENT_ELEMENT__NODES);

		labelEAttributeEClass = createEClass(LABEL_EATTRIBUTE);
		createEReference(labelEAttributeEClass, LABEL_EATTRIBUTE__AN_EATTRIBUTE);

		borderEClass = createEClass(BORDER);
		createEAttribute(borderEClass, BORDER__BORDER_STYLE);
		createEAttribute(borderEClass, BORDER__BORDER_WIDTH);
		createEReference(borderEClass, BORDER__BORDER_COLOR);

		colorEClass = createEClass(COLOR);

		grUserColorEClass = createEClass(GR_USER_COLOR);

		grUserColorDefEClass = createEClass(GR_USER_COLOR_DEF);
		createEReference(grUserColorDefEClass, GR_USER_COLOR_DEF__COLOR);

		grColorDescriptionEClass = createEClass(GR_COLOR_DESCRIPTION);
		createEAttribute(grColorDescriptionEClass, GR_COLOR_DESCRIPTION__NAME);

		rgbColorDescriptionEClass = createEClass(RGB_COLOR_DESCRIPTION);
		createEAttribute(rgbColorDescriptionEClass, RGB_COLOR_DESCRIPTION__NAME);

		rgbColorEClass = createEClass(RGB_COLOR);
		createEAttribute(rgbColorEClass, RGB_COLOR__RED);
		createEAttribute(rgbColorEClass, RGB_COLOR__GREEN);
		createEAttribute(rgbColorEClass, RGB_COLOR__BLUE);

		siriusSystemColorsEClass = createEClass(SIRIUS_SYSTEM_COLORS);
		createEOperation(siriusSystemColorsEClass, SIRIUS_SYSTEM_COLORS___GET_SYSTEM_COLOR_DESCRIPTION__STRING);

		grLabelStyleDescriptionEClass = createEClass(GR_LABEL_STYLE_DESCRIPTION);
		createEAttribute(grLabelStyleDescriptionEClass, GR_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT);
		createEAttribute(grLabelStyleDescriptionEClass, GR_LABEL_STYLE_DESCRIPTION__SHOW_ICON);
		createEAttribute(grLabelStyleDescriptionEClass, GR_LABEL_STYLE_DESCRIPTION__LABEL_POSITION);

		representationEClass = createEClass(REPRESENTATION);

		representationDDEClass = createEClass(REPRESENTATION_DD);
		createEAttribute(representationDDEClass, REPRESENTATION_DD__NAME);
		createEReference(representationDDEClass, REPRESENTATION_DD__ROOT);
		createEReference(representationDDEClass, REPRESENTATION_DD__LAYERS);

		representationTableEClass = createEClass(REPRESENTATION_TABLE);
		createEReference(representationTableEClass, REPRESENTATION_TABLE__ROOT_TABLE);
		createEReference(representationTableEClass, REPRESENTATION_TABLE__LINES);
		createEReference(representationTableEClass, REPRESENTATION_TABLE__COLUMNS);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__FEATURE_REFERENCE);
		createEReference(lineEClass, LINE__LIST_ECLASSES);

		lineGroupEClass = createEClass(LINE_GROUP);
		createEReference(lineGroupEClass, LINE_GROUP__LIST_LINES);

		conditionalStyleEClass = createEClass(CONDITIONAL_STYLE);
		createEReference(conditionalStyleEClass, CONDITIONAL_STYLE__EATTRIBUTE);
		createEAttribute(conditionalStyleEClass, CONDITIONAL_STYLE__VALUE);
		createEReference(conditionalStyleEClass, CONDITIONAL_STYLE__CONDITIONAL_STYLE);

		// Create enums
		grFontFormatEEnum = createEEnum(GR_FONT_FORMAT);
		labelPositionEEnum = createEEnum(LABEL_POSITION);
		childrenPresentationEEnum = createEEnum(CHILDREN_PRESENTATION);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		diagramElementEClass.getESuperTypes().add(this.getAllElements());
		abstractElementEClass.getESuperTypes().add(this.getAllElements());
		edgeEClass.getESuperTypes().add(this.getDiagramElement());
		nodeEClass.getESuperTypes().add(this.getDiagramElement());
		iconElementEClass.getESuperTypes().add(this.getShape());
		edge_StyleEClass.getESuperTypes().add(this.getShapeColor());
		shapeCompartmentGradientEClass.getESuperTypes().add(this.getShape());
		shapeCompartmentGradientEClass.getESuperTypes().add(this.getShapeColor());
		shapeCompartmentGradientEClass.getESuperTypes().add(this.getBorder());
		shapeCompartmentParallelogramEClass.getESuperTypes().add(this.getShape());
		shapeCompartmentParallelogramEClass.getESuperTypes().add(this.getShapeColor());
		shapeCompartmentParallelogramEClass.getESuperTypes().add(this.getBorder());
		ellipseEClass.getESuperTypes().add(this.getShape());
		ellipseEClass.getESuperTypes().add(this.getShapeColor());
		ellipseEClass.getESuperTypes().add(this.getBorder());
		noteEClass.getESuperTypes().add(this.getShape());
		noteEClass.getESuperTypes().add(this.getShapeColor());
		noteEClass.getESuperTypes().add(this.getBorder());
		diamondEClass.getESuperTypes().add(this.getShape());
		diamondEClass.getESuperTypes().add(this.getShapeColor());
		diamondEClass.getESuperTypes().add(this.getBorder());
		rectangleEClass.getESuperTypes().add(this.getShape());
		rectangleEClass.getESuperTypes().add(this.getShapeColor());
		rectangleEClass.getESuperTypes().add(this.getBorder());
		paletteDescriptionLinkEClass.getESuperTypes().add(this.getPaletteDescription());
		paletteDescriptionLinkEClass.getESuperTypes().add(this.getLink());
		paletteDescriptionLinkEClass.getESuperTypes().add(this.getEdge_Style());
		defaultLayerEClass.getESuperTypes().add(this.getLayer());
		additionalLayerEClass.getESuperTypes().add(this.getLayer());
		affixedElementEClass.getESuperTypes().add(this.getAffixedCompartmentElement());
		compartmentElementEClass.getESuperTypes().add(this.getAffixedCompartmentElement());
		labelEAttributeEClass.getESuperTypes().add(this.getShapeColor());
		labelEAttributeEClass.getESuperTypes().add(this.getGRLabelStyleDescription());
		grUserColorDefEClass.getESuperTypes().add(this.getColor());
		rgbColorEClass.getESuperTypes().add(this.getGRUserColor());
		rgbColorEClass.getESuperTypes().add(this.getRGBColorDescription());
		siriusSystemColorsEClass.getESuperTypes().add(this.getColor());
		siriusSystemColorsEClass.getESuperTypes().add(this.getGRColorDescription());
		representationDDEClass.getESuperTypes().add(this.getRepresentation());
		representationTableEClass.getESuperTypes().add(this.getRepresentation());
		lineGroupEClass.getESuperTypes().add(this.getLine());

		// Initialize classes, features, and operations; add parameters
		initEClass(mmGraphic_RepresentationEClass, MMGraphic_Representation.class, "MMGraphic_Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMMGraphic_Representation_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, MMGraphic_Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMGraphic_Representation_ListRepresentations(), this.getRepresentation(), null, "listRepresentations", null, 0, -1, MMGraphic_Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMGraphic_Representation_IsGeopalette(), ecorePackage.getEBoolean(), "isGeopalette", "false", 0, 1, MMGraphic_Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allElementsEClass, AllElements.class, "AllElements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramElement_AnEClass(), ecorePackage.getEClass(), null, "anEClass", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramElement_Diag_palette(), this.getPaletteDescription(), null, "diag_palette", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramElement_ContainerReference(), ecorePackage.getEReference(), null, "containerReference", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractElement_AnEClass(), ecorePackage.getEClass(), null, "anEClass", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractElement_Node_elements(), this.getNode_Element(), null, "node_elements", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Directions(), this.getEdge_Direction(), null, "directions", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Edge_style(), this.getEdge_Style(), null, "edge_style", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_EdgeLabel(), this.getEdgeLabelEAttribute(), null, "edgeLabel", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeLabelEAttributeEClass, EdgeLabelEAttribute.class, "EdgeLabelEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeLabelEAttribute_LabelEAttribute(), theEcorePackage.getEAttribute(), null, "labelEAttribute", null, 0, 1, EdgeLabelEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Node_elements(), this.getNode_Element(), null, "node_elements", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Node_shape(), this.getShape(), null, "node_shape", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Expandable(), ecorePackage.getEBoolean(), "expandable", "false", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ConditionalStyle(), this.getConditionalStyle(), null, "conditionalStyle", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Presentation(), this.getChildrenPresentation(), "presentation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconElementEClass, IconElement.class, "IconElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconElement_Filepath(), ecorePackage.getEString(), "filepath", null, 0, 1, IconElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIconElement_EmbeddedImage(), ecorePackage.getEString(), "embeddedImage", "null", 0, 1, IconElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIconElement__ImageBase64(), null, "ImageBase64", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paletteDescriptionEClass, PaletteDescription.class, "PaletteDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaletteDescription_Icon_filepath(), ecorePackage.getEString(), "icon_filepath", null, 0, 1, PaletteDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaletteDescription_Palette_name(), ecorePackage.getEString(), "palette_name", null, 0, 1, PaletteDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaletteDescription_IsDraggable(), ecorePackage.getEBoolean(), "isDraggable", "true", 0, 1, PaletteDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(node_ElementEClass, Node_Element.class, "Node_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Element_LabelanEAttribute(), this.getLabelEAttribute(), null, "LabelanEAttribute", null, 0, -1, Node_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Element_LinkPalette(), this.getPaletteDescriptionLink(), null, "linkPalette", null, 0, -1, Node_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Element_AffixedCompartmentElements(), this.getAffixedCompartmentElement(), null, "affixedCompartmentElements", null, 0, -1, Node_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Element_ExpandableItems(), this.getExpandableItem(), null, "expandableItems", null, 0, -1, Node_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNode_Element__IsCompartment(), ecorePackage.getEBoolean(), "isCompartment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expandableItemEClass, ExpandableItem.class, "ExpandableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpandableItem_Index(), ecorePackage.getEInt(), "index", "0", 0, 1, ExpandableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpandableItem_AnEReference(), theEcorePackage.getEReference(), null, "anEReference", null, 0, 1, ExpandableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edge_StyleEClass, Edge_Style.class, "Edge_Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Style_LineStyle(), ecorePackage.getEString(), "LineStyle", "solid", 0, 1, Edge_Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Style_LineWidth(), ecorePackage.getEString(), "LineWidth", "0", 0, 1, Edge_Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_AnEClass(), ecorePackage.getEClass(), null, "anEClass", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Root_node_elements(), this.getNode_Element(), null, "root_node_elements", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Root_shape(), this.getShape(), null, "root_shape", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_RootLayer(), this.getLayer(), null, "rootLayer", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edge_DirectionEClass, Edge_Direction.class, "Edge_Direction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Direction_SourceLink(), this.getLink(), null, "sourceLink", null, 0, 1, Edge_Direction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Direction_TargetLink(), this.getLink(), null, "targetLink", null, 0, 1, Edge_Direction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicRepresentationEClass, GraphicRepresentation.class, "GraphicRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicRepresentation_AllGraphicRepresentation(), this.getMMGraphic_Representation(), null, "allGraphicRepresentation", null, 0, -1, GraphicRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicRepresentation_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphicRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicRepresentation_UserColors(), this.getGRUserColor(), null, "userColors", null, 0, -1, GraphicRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shapeCompartmentGradientEClass, ShapeCompartmentGradient.class, "ShapeCompartmentGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeCompartmentGradient_Width(), ecorePackage.getEIntegerObject(), "width", "10", 0, 1, ShapeCompartmentGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeCompartmentGradient_Height(), ecorePackage.getEIntegerObject(), "height", "10", 0, 1, ShapeCompartmentGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeCompartmentGradient_CornerHeight(), ecorePackage.getEIntegerObject(), "cornerHeight", "10", 0, 1, ShapeCompartmentGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeCompartmentGradient_CornerWidth(), ecorePackage.getEIntegerObject(), "cornerWidth", "10", 0, 1, ShapeCompartmentGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeCompartmentGradient_ForeGroundColor(), this.getColor(), null, "foreGroundColor", null, 0, 1, ShapeCompartmentGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeCompartmentParallelogramEClass, ShapeCompartmentParallelogram.class, "ShapeCompartmentParallelogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeCompartmentParallelogram_Width(), ecorePackage.getEIntegerObject(), "width", "10", 0, 1, ShapeCompartmentParallelogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeCompartmentParallelogram_Height(), ecorePackage.getEIntegerObject(), "height", "10", 0, 1, ShapeCompartmentParallelogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEllipse_HorizontalDiameter(), ecorePackage.getEIntegerObject(), "horizontalDiameter", "3", 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_VerticalDiameter(), ecorePackage.getEIntegerObject(), "verticalDiameter", "3", 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Size(), ecorePackage.getEIntegerObject(), "size", "5", 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diamondEClass, Diamond.class, "Diamond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiamond_Size(), ecorePackage.getEIntegerObject(), "size", "5", 0, 1, Diamond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangle_Width(), ecorePackage.getEIntegerObject(), "width", "10", 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangle_Height(), ecorePackage.getEIntegerObject(), "height", "5", 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeColorEClass, ShapeColor.class, "ShapeColor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeColor_Color(), this.getColor(), null, "color", null, 0, 1, ShapeColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_AnEReference(), ecorePackage.getEReference(), null, "anEReference", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_AnDiagramElement(), this.getNode(), null, "anDiagramElement", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_DecoratorName(), ecorePackage.getEString(), "decoratorName", "NoDecoration", 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paletteDescriptionLinkEClass, PaletteDescriptionLink.class, "PaletteDescriptionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaletteDescriptionLink_SourceDecoratorName(), ecorePackage.getEString(), "sourceDecoratorName", "NoDecoration", 0, 1, PaletteDescriptionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerEClass, Layer.class, "Layer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayer_Elements(), this.getAllElements(), null, "elements", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultLayerEClass, DefaultLayer.class, "DefaultLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionalLayerEClass, AdditionalLayer.class, "AdditionalLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(affixedElementEClass, AffixedElement.class, "AffixedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compartmentElementEClass, CompartmentElement.class, "CompartmentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(affixedCompartmentElementEClass, AffixedCompartmentElement.class, "AffixedCompartmentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAffixedCompartmentElement_AnEReference(), ecorePackage.getEReference(), null, "anEReference", null, 0, 1, AffixedCompartmentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAffixedCompartmentElement_Nodes(), this.getNode(), null, "nodes", null, 0, -1, AffixedCompartmentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEAttributeEClass, LabelEAttribute.class, "LabelEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelEAttribute_AnEAttribute(), ecorePackage.getEAttribute(), null, "anEAttribute", null, 0, 1, LabelEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(borderEClass, Border.class, "Border", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBorder_BorderStyle(), ecorePackage.getEString(), "borderStyle", "solid", 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBorder_BorderWidth(), ecorePackage.getEString(), "borderWidth", "0", 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBorder_BorderColor(), this.getColor(), null, "borderColor", null, 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorEClass, Color.class, "Color", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grUserColorEClass, GRUserColor.class, "GRUserColor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grUserColorDefEClass, GRUserColorDef.class, "GRUserColorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGRUserColorDef_Color(), this.getGRUserColor(), null, "color", null, 0, 1, GRUserColorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grColorDescriptionEClass, GRColorDescription.class, "GRColorDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGRColorDescription_Name(), ecorePackage.getEString(), "name", "blue", 0, 1, GRColorDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rgbColorDescriptionEClass, RGBColorDescription.class, "RGBColorDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGBColorDescription_Name(), ecorePackage.getEString(), "name", " ", 0, 1, RGBColorDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rgbColorEClass, RGBColor.class, "RGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGBColor_Red(), ecorePackage.getEInt(), "red", null, 1, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_Green(), ecorePackage.getEInt(), "green", null, 1, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_Blue(), ecorePackage.getEInt(), "blue", null, 1, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siriusSystemColorsEClass, SiriusSystemColors.class, "SiriusSystemColors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSiriusSystemColors__GetSystemColorDescription__String(), theDescriptionPackage.getSystemColor(), "getSystemColorDescription", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(grLabelStyleDescriptionEClass, GRLabelStyleDescription.class, "GRLabelStyleDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGRLabelStyleDescription_LabelFormat(), this.getGRFontFormat(), "labelFormat", null, 0, -1, GRLabelStyleDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRLabelStyleDescription_ShowIcon(), ecorePackage.getEBoolean(), "showIcon", "false", 0, 1, GRLabelStyleDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRLabelStyleDescription_LabelPosition(), this.getLabelPosition(), "labelPosition", null, 0, 1, GRLabelStyleDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationEClass, Representation.class, "Representation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(representationDDEClass, RepresentationDD.class, "RepresentationDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentationDD_Name(), ecorePackage.getEString(), "name", null, 0, 1, RepresentationDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationDD_Root(), this.getRoot(), null, "root", null, 0, 1, RepresentationDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationDD_Layers(), this.getLayer(), null, "layers", null, 0, -1, RepresentationDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationTableEClass, RepresentationTable.class, "RepresentationTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentationTable_RootTable(), theEcorePackage.getEClass(), null, "rootTable", null, 0, 1, RepresentationTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationTable_Lines(), this.getLine(), null, "lines", null, 0, -1, RepresentationTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationTable_Columns(), theEcorePackage.getEAttribute(), null, "columns", null, 0, -1, RepresentationTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_FeatureReference(), theEcorePackage.getEReference(), null, "featureReference", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_ListEClasses(), theEcorePackage.getEClass(), null, "listEClasses", null, 0, -1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineGroupEClass, LineGroup.class, "LineGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineGroup_ListLines(), this.getLine(), null, "listLines", null, 0, -1, LineGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalStyleEClass, ConditionalStyle.class, "ConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStyle_EAttribute(), theEcorePackage.getEAttribute(), null, "eAttribute", null, 0, 1, ConditionalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalStyle_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConditionalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStyle_ConditionalStyle(), this.getShape(), null, "conditionalStyle", null, 0, 1, ConditionalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(grFontFormatEEnum, GRFontFormat.class, "GRFontFormat");
		addEEnumLiteral(grFontFormatEEnum, GRFontFormat.ITALIC);
		addEEnumLiteral(grFontFormatEEnum, GRFontFormat.BOLD);
		addEEnumLiteral(grFontFormatEEnum, GRFontFormat.UNDERLINE);
		addEEnumLiteral(grFontFormatEEnum, GRFontFormat.STRIKE_THROUGH);

		initEEnum(labelPositionEEnum, LabelPosition.class, "LabelPosition");
		addEEnumLiteral(labelPositionEEnum, LabelPosition.BORDER);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.NODE);

		initEEnum(childrenPresentationEEnum, ChildrenPresentation.class, "ChildrenPresentation");
		addEEnumLiteral(childrenPresentationEEnum, ChildrenPresentation.FREEFORM);
		addEEnumLiteral(childrenPresentationEEnum, ChildrenPresentation.LIST);
		addEEnumLiteral(childrenPresentationEEnum, ChildrenPresentation.HORIZONTALSTACK);
		addEEnumLiteral(childrenPresentationEEnum, ChildrenPresentation.VERTICALSTACK);

		// Create resource
		createResource(eNS_URI);
	}

} //Graphic_representationPackageImpl
