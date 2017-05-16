/**
 */
package graphic_representation.util;

import graphic_representation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see graphic_representation.Graphic_representationPackage
 * @generated
 */
public class Graphic_representationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Graphic_representationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphic_representationSwitch() {
		if (modelPackage == null) {
			modelPackage = Graphic_representationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION: {
				MMGraphic_Representation mmGraphic_Representation = (MMGraphic_Representation)theEObject;
				T result = caseMMGraphic_Representation(mmGraphic_Representation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.ALL_ELEMENTS: {
				AllElements allElements = (AllElements)theEObject;
				T result = caseAllElements(allElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				T result = caseDiagramElement(diagramElement);
				if (result == null) result = caseAllElements(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.ABSTRACT_ELEMENT: {
				AbstractElement abstractElement = (AbstractElement)theEObject;
				T result = caseAbstractElement(abstractElement);
				if (result == null) result = caseAllElements(abstractElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseDiagramElement(edge);
				if (result == null) result = caseAllElements(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.EDGE_LABEL_EATTRIBUTE: {
				EdgeLabelEAttribute edgeLabelEAttribute = (EdgeLabelEAttribute)theEObject;
				T result = caseEdgeLabelEAttribute(edgeLabelEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseDiagramElement(node);
				if (result == null) result = caseAllElements(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.ICON_ELEMENT: {
				IconElement iconElement = (IconElement)theEObject;
				T result = caseIconElement(iconElement);
				if (result == null) result = caseShape(iconElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.PALETTE_DESCRIPTION: {
				PaletteDescription paletteDescription = (PaletteDescription)theEObject;
				T result = casePaletteDescription(paletteDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.NODE_ELEMENT: {
				Node_Element node_Element = (Node_Element)theEObject;
				T result = caseNode_Element(node_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.EXPANDABLE_ITEM: {
				ExpandableItem expandableItem = (ExpandableItem)theEObject;
				T result = caseExpandableItem(expandableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.EDGE_STYLE: {
				Edge_Style edge_Style = (Edge_Style)theEObject;
				T result = caseEdge_Style(edge_Style);
				if (result == null) result = caseShapeColor(edge_Style);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.EDGE_DIRECTION: {
				Edge_Direction edge_Direction = (Edge_Direction)theEObject;
				T result = caseEdge_Direction(edge_Direction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION: {
				GraphicRepresentation graphicRepresentation = (GraphicRepresentation)theEObject;
				T result = caseGraphicRepresentation(graphicRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT: {
				ShapeCompartmentGradient shapeCompartmentGradient = (ShapeCompartmentGradient)theEObject;
				T result = caseShapeCompartmentGradient(shapeCompartmentGradient);
				if (result == null) result = caseShape(shapeCompartmentGradient);
				if (result == null) result = caseShapeColor(shapeCompartmentGradient);
				if (result == null) result = caseBorder(shapeCompartmentGradient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.SHAPE_COMPARTMENT_PARALLELOGRAM: {
				ShapeCompartmentParallelogram shapeCompartmentParallelogram = (ShapeCompartmentParallelogram)theEObject;
				T result = caseShapeCompartmentParallelogram(shapeCompartmentParallelogram);
				if (result == null) result = caseShape(shapeCompartmentParallelogram);
				if (result == null) result = caseShapeColor(shapeCompartmentParallelogram);
				if (result == null) result = caseBorder(shapeCompartmentParallelogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.ELLIPSE: {
				Ellipse ellipse = (Ellipse)theEObject;
				T result = caseEllipse(ellipse);
				if (result == null) result = caseShape(ellipse);
				if (result == null) result = caseShapeColor(ellipse);
				if (result == null) result = caseBorder(ellipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.NOTE: {
				Note note = (Note)theEObject;
				T result = caseNote(note);
				if (result == null) result = caseShape(note);
				if (result == null) result = caseShapeColor(note);
				if (result == null) result = caseBorder(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.DIAMOND: {
				Diamond diamond = (Diamond)theEObject;
				T result = caseDiamond(diamond);
				if (result == null) result = caseShape(diamond);
				if (result == null) result = caseShapeColor(diamond);
				if (result == null) result = caseBorder(diamond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				T result = caseRectangle(rectangle);
				if (result == null) result = caseShape(rectangle);
				if (result == null) result = caseShapeColor(rectangle);
				if (result == null) result = caseBorder(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.SHAPE_COLOR: {
				ShapeColor shapeColor = (ShapeColor)theEObject;
				T result = caseShapeColor(shapeColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK: {
				PaletteDescriptionLink paletteDescriptionLink = (PaletteDescriptionLink)theEObject;
				T result = casePaletteDescriptionLink(paletteDescriptionLink);
				if (result == null) result = casePaletteDescription(paletteDescriptionLink);
				if (result == null) result = caseLink(paletteDescriptionLink);
				if (result == null) result = caseEdge_Style(paletteDescriptionLink);
				if (result == null) result = caseShapeColor(paletteDescriptionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.DEFAULT_LAYER: {
				DefaultLayer defaultLayer = (DefaultLayer)theEObject;
				T result = caseDefaultLayer(defaultLayer);
				if (result == null) result = caseLayer(defaultLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.ADDITIONAL_LAYER: {
				AdditionalLayer additionalLayer = (AdditionalLayer)theEObject;
				T result = caseAdditionalLayer(additionalLayer);
				if (result == null) result = caseLayer(additionalLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.AFFIXED_ELEMENT: {
				AffixedElement affixedElement = (AffixedElement)theEObject;
				T result = caseAffixedElement(affixedElement);
				if (result == null) result = caseAffixedCompartmentElement(affixedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.COMPARTMENT_ELEMENT: {
				CompartmentElement compartmentElement = (CompartmentElement)theEObject;
				T result = caseCompartmentElement(compartmentElement);
				if (result == null) result = caseAffixedCompartmentElement(compartmentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT: {
				AffixedCompartmentElement affixedCompartmentElement = (AffixedCompartmentElement)theEObject;
				T result = caseAffixedCompartmentElement(affixedCompartmentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.LABEL_EATTRIBUTE: {
				LabelEAttribute labelEAttribute = (LabelEAttribute)theEObject;
				T result = caseLabelEAttribute(labelEAttribute);
				if (result == null) result = caseShapeColor(labelEAttribute);
				if (result == null) result = caseGRLabelStyleDescription(labelEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.BORDER: {
				Border border = (Border)theEObject;
				T result = caseBorder(border);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.COLOR: {
				Color color = (Color)theEObject;
				T result = caseColor(color);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.GR_USER_COLOR: {
				GRUserColor grUserColor = (GRUserColor)theEObject;
				T result = caseGRUserColor(grUserColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.GR_USER_COLOR_DEF: {
				GRUserColorDef grUserColorDef = (GRUserColorDef)theEObject;
				T result = caseGRUserColorDef(grUserColorDef);
				if (result == null) result = caseColor(grUserColorDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.GR_COLOR_DESCRIPTION: {
				GRColorDescription grColorDescription = (GRColorDescription)theEObject;
				T result = caseGRColorDescription(grColorDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.RGB_COLOR_DESCRIPTION: {
				RGBColorDescription rgbColorDescription = (RGBColorDescription)theEObject;
				T result = caseRGBColorDescription(rgbColorDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.RGB_COLOR: {
				RGBColor rgbColor = (RGBColor)theEObject;
				T result = caseRGBColor(rgbColor);
				if (result == null) result = caseGRUserColor(rgbColor);
				if (result == null) result = caseRGBColorDescription(rgbColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.SIRIUS_SYSTEM_COLORS: {
				SiriusSystemColors siriusSystemColors = (SiriusSystemColors)theEObject;
				T result = caseSiriusSystemColors(siriusSystemColors);
				if (result == null) result = caseColor(siriusSystemColors);
				if (result == null) result = caseGRColorDescription(siriusSystemColors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.GR_LABEL_STYLE_DESCRIPTION: {
				GRLabelStyleDescription grLabelStyleDescription = (GRLabelStyleDescription)theEObject;
				T result = caseGRLabelStyleDescription(grLabelStyleDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.REPRESENTATION: {
				Representation representation = (Representation)theEObject;
				T result = caseRepresentation(representation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.REPRESENTATION_DD: {
				RepresentationDD representationDD = (RepresentationDD)theEObject;
				T result = caseRepresentationDD(representationDD);
				if (result == null) result = caseRepresentation(representationDD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.REPRESENTATION_TABLE: {
				RepresentationTable representationTable = (RepresentationTable)theEObject;
				T result = caseRepresentationTable(representationTable);
				if (result == null) result = caseRepresentation(representationTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.LINE_GROUP: {
				LineGroup lineGroup = (LineGroup)theEObject;
				T result = caseLineGroup(lineGroup);
				if (result == null) result = caseLine(lineGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graphic_representationPackage.CONDITIONAL_STYLE: {
				ConditionalStyle conditionalStyle = (ConditionalStyle)theEObject;
				T result = caseConditionalStyle(conditionalStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MM Graphic Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MM Graphic Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMGraphic_Representation(MMGraphic_Representation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllElements(AllElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractElement(AbstractElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Label EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Label EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeLabelEAttribute(EdgeLabelEAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconElement(IconElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Palette Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Palette Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaletteDescription(PaletteDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode_Element(Node_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expandable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expandable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpandableItem(ExpandableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge_Style(Edge_Style object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge_Direction(Edge_Direction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicRepresentation(GraphicRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Compartment Gradient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Compartment Gradient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeCompartmentGradient(ShapeCompartmentGradient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Compartment Parallelogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Compartment Parallelogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeCompartmentParallelogram(ShapeCompartmentParallelogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipse(Ellipse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diamond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diamond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiamond(Diamond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeColor(ShapeColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Palette Description Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Palette Description Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaletteDescriptionLink(PaletteDescriptionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultLayer(DefaultLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalLayer(AdditionalLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affixed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affixed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffixedElement(AffixedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentElement(CompartmentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affixed Compartment Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affixed Compartment Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffixedCompartmentElement(AffixedCompartmentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelEAttribute(LabelEAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorder(Border object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColor(Color object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR User Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR User Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRUserColor(GRUserColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR User Color Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR User Color Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRUserColorDef(GRUserColorDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR Color Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR Color Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRColorDescription(GRColorDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RGB Color Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RGB Color Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRGBColorDescription(RGBColorDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RGB Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRGBColor(RGBColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sirius System Colors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sirius System Colors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiriusSystemColors(SiriusSystemColors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR Label Style Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR Label Style Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLabelStyleDescription(GRLabelStyleDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentation(Representation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationTable(RepresentationTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation DD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation DD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationDD(RepresentationDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineGroup(LineGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalStyle(ConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Graphic_representationSwitch
