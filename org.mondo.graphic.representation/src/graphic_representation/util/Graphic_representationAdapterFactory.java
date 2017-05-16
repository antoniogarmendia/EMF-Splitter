/**
 */
package graphic_representation.util;

import graphic_representation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see graphic_representation.Graphic_representationPackage
 * @generated
 */
public class Graphic_representationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Graphic_representationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphic_representationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Graphic_representationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Graphic_representationSwitch<Adapter> modelSwitch =
		new Graphic_representationSwitch<Adapter>() {
			@Override
			public Adapter caseMMGraphic_Representation(MMGraphic_Representation object) {
				return createMMGraphic_RepresentationAdapter();
			}
			@Override
			public Adapter caseAllElements(AllElements object) {
				return createAllElementsAdapter();
			}
			@Override
			public Adapter caseDiagramElement(DiagramElement object) {
				return createDiagramElementAdapter();
			}
			@Override
			public Adapter caseAbstractElement(AbstractElement object) {
				return createAbstractElementAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseEdgeLabelEAttribute(EdgeLabelEAttribute object) {
				return createEdgeLabelEAttributeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseIconElement(IconElement object) {
				return createIconElementAdapter();
			}
			@Override
			public Adapter casePaletteDescription(PaletteDescription object) {
				return createPaletteDescriptionAdapter();
			}
			@Override
			public Adapter caseNode_Element(Node_Element object) {
				return createNode_ElementAdapter();
			}
			@Override
			public Adapter caseExpandableItem(ExpandableItem object) {
				return createExpandableItemAdapter();
			}
			@Override
			public Adapter caseEdge_Style(Edge_Style object) {
				return createEdge_StyleAdapter();
			}
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseEdge_Direction(Edge_Direction object) {
				return createEdge_DirectionAdapter();
			}
			@Override
			public Adapter caseGraphicRepresentation(GraphicRepresentation object) {
				return createGraphicRepresentationAdapter();
			}
			@Override
			public Adapter caseShape(Shape object) {
				return createShapeAdapter();
			}
			@Override
			public Adapter caseShapeCompartmentGradient(ShapeCompartmentGradient object) {
				return createShapeCompartmentGradientAdapter();
			}
			@Override
			public Adapter caseShapeCompartmentParallelogram(ShapeCompartmentParallelogram object) {
				return createShapeCompartmentParallelogramAdapter();
			}
			@Override
			public Adapter caseEllipse(Ellipse object) {
				return createEllipseAdapter();
			}
			@Override
			public Adapter caseNote(Note object) {
				return createNoteAdapter();
			}
			@Override
			public Adapter caseDiamond(Diamond object) {
				return createDiamondAdapter();
			}
			@Override
			public Adapter caseRectangle(Rectangle object) {
				return createRectangleAdapter();
			}
			@Override
			public Adapter caseShapeColor(ShapeColor object) {
				return createShapeColorAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter casePaletteDescriptionLink(PaletteDescriptionLink object) {
				return createPaletteDescriptionLinkAdapter();
			}
			@Override
			public Adapter caseLayer(Layer object) {
				return createLayerAdapter();
			}
			@Override
			public Adapter caseDefaultLayer(DefaultLayer object) {
				return createDefaultLayerAdapter();
			}
			@Override
			public Adapter caseAdditionalLayer(AdditionalLayer object) {
				return createAdditionalLayerAdapter();
			}
			@Override
			public Adapter caseAffixedElement(AffixedElement object) {
				return createAffixedElementAdapter();
			}
			@Override
			public Adapter caseCompartmentElement(CompartmentElement object) {
				return createCompartmentElementAdapter();
			}
			@Override
			public Adapter caseAffixedCompartmentElement(AffixedCompartmentElement object) {
				return createAffixedCompartmentElementAdapter();
			}
			@Override
			public Adapter caseLabelEAttribute(LabelEAttribute object) {
				return createLabelEAttributeAdapter();
			}
			@Override
			public Adapter caseBorder(Border object) {
				return createBorderAdapter();
			}
			@Override
			public Adapter caseColor(Color object) {
				return createColorAdapter();
			}
			@Override
			public Adapter caseGRUserColor(GRUserColor object) {
				return createGRUserColorAdapter();
			}
			@Override
			public Adapter caseGRUserColorDef(GRUserColorDef object) {
				return createGRUserColorDefAdapter();
			}
			@Override
			public Adapter caseGRColorDescription(GRColorDescription object) {
				return createGRColorDescriptionAdapter();
			}
			@Override
			public Adapter caseRGBColorDescription(RGBColorDescription object) {
				return createRGBColorDescriptionAdapter();
			}
			@Override
			public Adapter caseRGBColor(RGBColor object) {
				return createRGBColorAdapter();
			}
			@Override
			public Adapter caseSiriusSystemColors(SiriusSystemColors object) {
				return createSiriusSystemColorsAdapter();
			}
			@Override
			public Adapter caseGRLabelStyleDescription(GRLabelStyleDescription object) {
				return createGRLabelStyleDescriptionAdapter();
			}
			@Override
			public Adapter caseRepresentation(Representation object) {
				return createRepresentationAdapter();
			}
			@Override
			public Adapter caseRepresentationDD(RepresentationDD object) {
				return createRepresentationDDAdapter();
			}
			@Override
			public Adapter caseRepresentationTable(RepresentationTable object) {
				return createRepresentationTableAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseLineGroup(LineGroup object) {
				return createLineGroupAdapter();
			}
			@Override
			public Adapter caseConditionalStyle(ConditionalStyle object) {
				return createConditionalStyleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.MMGraphic_Representation <em>MM Graphic Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.MMGraphic_Representation
	 * @generated
	 */
	public Adapter createMMGraphic_RepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.AllElements <em>All Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.AllElements
	 * @generated
	 */
	public Adapter createAllElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.DiagramElement
	 * @generated
	 */
	public Adapter createDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.AbstractElement
	 * @generated
	 */
	public Adapter createAbstractElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.EdgeLabelEAttribute <em>Edge Label EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.EdgeLabelEAttribute
	 * @generated
	 */
	public Adapter createEdgeLabelEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.IconElement <em>Icon Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.IconElement
	 * @generated
	 */
	public Adapter createIconElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.PaletteDescription <em>Palette Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.PaletteDescription
	 * @generated
	 */
	public Adapter createPaletteDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Node_Element <em>Node Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Node_Element
	 * @generated
	 */
	public Adapter createNode_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.ExpandableItem <em>Expandable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.ExpandableItem
	 * @generated
	 */
	public Adapter createExpandableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Edge_Style <em>Edge Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Edge_Style
	 * @generated
	 */
	public Adapter createEdge_StyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Edge_Direction <em>Edge Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Edge_Direction
	 * @generated
	 */
	public Adapter createEdge_DirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.GraphicRepresentation <em>Graphic Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.GraphicRepresentation
	 * @generated
	 */
	public Adapter createGraphicRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.ShapeCompartmentGradient <em>Shape Compartment Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.ShapeCompartmentGradient
	 * @generated
	 */
	public Adapter createShapeCompartmentGradientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.ShapeCompartmentParallelogram <em>Shape Compartment Parallelogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.ShapeCompartmentParallelogram
	 * @generated
	 */
	public Adapter createShapeCompartmentParallelogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Ellipse
	 * @generated
	 */
	public Adapter createEllipseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Diamond <em>Diamond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Diamond
	 * @generated
	 */
	public Adapter createDiamondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Rectangle
	 * @generated
	 */
	public Adapter createRectangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.ShapeColor <em>Shape Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.ShapeColor
	 * @generated
	 */
	public Adapter createShapeColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.PaletteDescriptionLink <em>Palette Description Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.PaletteDescriptionLink
	 * @generated
	 */
	public Adapter createPaletteDescriptionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.DefaultLayer <em>Default Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.DefaultLayer
	 * @generated
	 */
	public Adapter createDefaultLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.AdditionalLayer <em>Additional Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.AdditionalLayer
	 * @generated
	 */
	public Adapter createAdditionalLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.AffixedElement <em>Affixed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.AffixedElement
	 * @generated
	 */
	public Adapter createAffixedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.CompartmentElement <em>Compartment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.CompartmentElement
	 * @generated
	 */
	public Adapter createCompartmentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.AffixedCompartmentElement <em>Affixed Compartment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.AffixedCompartmentElement
	 * @generated
	 */
	public Adapter createAffixedCompartmentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.LabelEAttribute <em>Label EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.LabelEAttribute
	 * @generated
	 */
	public Adapter createLabelEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Border
	 * @generated
	 */
	public Adapter createBorderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.GRUserColor <em>GR User Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.GRUserColor
	 * @generated
	 */
	public Adapter createGRUserColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.GRUserColorDef <em>GR User Color Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.GRUserColorDef
	 * @generated
	 */
	public Adapter createGRUserColorDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.GRColorDescription <em>GR Color Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.GRColorDescription
	 * @generated
	 */
	public Adapter createGRColorDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.RGBColorDescription <em>RGB Color Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.RGBColorDescription
	 * @generated
	 */
	public Adapter createRGBColorDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.RGBColor
	 * @generated
	 */
	public Adapter createRGBColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.SiriusSystemColors <em>Sirius System Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.SiriusSystemColors
	 * @generated
	 */
	public Adapter createSiriusSystemColorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.GRLabelStyleDescription <em>GR Label Style Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.GRLabelStyleDescription
	 * @generated
	 */
	public Adapter createGRLabelStyleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Representation
	 * @generated
	 */
	public Adapter createRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.RepresentationTable <em>Representation Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.RepresentationTable
	 * @generated
	 */
	public Adapter createRepresentationTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.RepresentationDD <em>Representation DD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.RepresentationDD
	 * @generated
	 */
	public Adapter createRepresentationDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.LineGroup <em>Line Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.LineGroup
	 * @generated
	 */
	public Adapter createLineGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphic_representation.ConditionalStyle <em>Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphic_representation.ConditionalStyle
	 * @generated
	 */
	public Adapter createConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Graphic_representationAdapterFactory
