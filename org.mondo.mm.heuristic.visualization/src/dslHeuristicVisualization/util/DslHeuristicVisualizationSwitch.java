/**
 */
package dslHeuristicVisualization.util;

import dslHeuristicVisualization.*;

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
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage
 * @generated
 */
public class DslHeuristicVisualizationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslHeuristicVisualizationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslHeuristicVisualizationSwitch() {
		if (modelPackage == null) {
			modelPackage = DslHeuristicVisualizationPackage.eINSTANCE;
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
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY: {
				HeuristicStrategy heuristicStrategy = (HeuristicStrategy)theEObject;
				T result = caseHeuristicStrategy(heuristicStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LINK: {
				ConcreteStrategyLink concreteStrategyLink = (ConcreteStrategyLink)theEObject;
				T result = caseConcreteStrategyLink(concreteStrategyLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.STRATEGY_LABEL: {
				StrategyLabel strategyLabel = (StrategyLabel)theEObject;
				T result = caseStrategyLabel(strategyLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_FIRST_STRING: {
				ConcreteStrategyLabelFirstString concreteStrategyLabelFirstString = (ConcreteStrategyLabelFirstString)theEObject;
				T result = caseConcreteStrategyLabelFirstString(concreteStrategyLabelFirstString);
				if (result == null) result = caseStrategyLabel(concreteStrategyLabelFirstString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_IDENTIFIER: {
				ConcreteStrategyLabelIdentifier concreteStrategyLabelIdentifier = (ConcreteStrategyLabelIdentifier)theEObject;
				T result = caseConcreteStrategyLabelIdentifier(concreteStrategyLabelIdentifier);
				if (result == null) result = caseStrategyLabel(concreteStrategyLabelIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER: {
				ConcreteStrategyLabelParameter concreteStrategyLabelParameter = (ConcreteStrategyLabelParameter)theEObject;
				T result = caseConcreteStrategyLabelParameter(concreteStrategyLabelParameter);
				if (result == null) result = caseStrategyLabel(concreteStrategyLabelParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.LABEL_PARAMETER: {
				LabelParameter labelParameter = (LabelParameter)theEObject;
				T result = caseLabelParameter(labelParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.STRATEGY_ROOT_SELECTION: {
				StrategyRootSelection strategyRootSelection = (StrategyRootSelection)theEObject;
				T result = caseStrategyRootSelection(strategyRootSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_MAX_CONTAINMENT: {
				ConcreteStrategyMaxContainment concreteStrategyMaxContainment = (ConcreteStrategyMaxContainment)theEObject;
				T result = caseConcreteStrategyMaxContainment(concreteStrategyMaxContainment);
				if (result == null) result = caseStrategyRootSelection(concreteStrategyMaxContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_NO_PARENT: {
				ConcreteStrategyNoParent concreteStrategyNoParent = (ConcreteStrategyNoParent)theEObject;
				T result = caseConcreteStrategyNoParent(concreteStrategyNoParent);
				if (result == null) result = caseStrategyRootSelection(concreteStrategyNoParent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.STRATEGY_PALETTE: {
				StrategyPalette strategyPalette = (StrategyPalette)theEObject;
				T result = caseStrategyPalette(strategyPalette);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_PALETTE: {
				ConcreteStrategyPalette concreteStrategyPalette = (ConcreteStrategyPalette)theEObject;
				T result = caseConcreteStrategyPalette(concreteStrategyPalette);
				if (result == null) result = caseStrategyPalette(concreteStrategyPalette);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.STRATEGY_ARC_SELECTION: {
				StrategyArcSelection strategyArcSelection = (StrategyArcSelection)theEObject;
				T result = caseStrategyArcSelection(strategyArcSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_SELECTION: {
				ConcreteStrategyArcSelection concreteStrategyArcSelection = (ConcreteStrategyArcSelection)theEObject;
				T result = caseConcreteStrategyArcSelection(concreteStrategyArcSelection);
				if (result == null) result = caseStrategyArcSelection(concreteStrategyArcSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.STRATEGY_ARC_DIRECTION: {
				StrategyArcDirection strategyArcDirection = (StrategyArcDirection)theEObject;
				T result = caseStrategyArcDirection(strategyArcDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.ARC_PARAMETER: {
				ArcParameter arcParameter = (ArcParameter)theEObject;
				T result = caseArcParameter(arcParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER: {
				DefaultArcParameter defaultArcParameter = (DefaultArcParameter)theEObject;
				T result = caseDefaultArcParameter(defaultArcParameter);
				if (result == null) result = caseArcParameter(defaultArcParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION: {
				ConcreteStrategyArcDirection concreteStrategyArcDirection = (ConcreteStrategyArcDirection)theEObject;
				T result = caseConcreteStrategyArcDirection(concreteStrategyArcDirection);
				if (result == null) result = caseStrategyArcDirection(concreteStrategyArcDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_DEFAULT_DIRECTION: {
				ConcreteStrategyDefaultDirection concreteStrategyDefaultDirection = (ConcreteStrategyDefaultDirection)theEObject;
				T result = caseConcreteStrategyDefaultDirection(concreteStrategyDefaultDirection);
				if (result == null) result = caseStrategyArcDirection(concreteStrategyDefaultDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.STRATEGY_NODE_SELECTION: {
				StrategyNodeSelection strategyNodeSelection = (StrategyNodeSelection)theEObject;
				T result = caseStrategyNodeSelection(strategyNodeSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION: {
				ConcreteStrategyDefaultNodeSelection concreteStrategyDefaultNodeSelection = (ConcreteStrategyDefaultNodeSelection)theEObject;
				T result = caseConcreteStrategyDefaultNodeSelection(concreteStrategyDefaultNodeSelection);
				if (result == null) result = caseStrategyNodeSelection(concreteStrategyDefaultNodeSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.STRATEGY_POSSIBLE_ELEMENTS: {
				StrategyPossibleElements strategyPossibleElements = (StrategyPossibleElements)theEObject;
				T result = caseStrategyPossibleElements(strategyPossibleElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT: {
				ConcreteStrategyContainmentDiagramElement concreteStrategyContainmentDiagramElement = (ConcreteStrategyContainmentDiagramElement)theEObject;
				T result = caseConcreteStrategyContainmentDiagramElement(concreteStrategyContainmentDiagramElement);
				if (result == null) result = caseStrategyPossibleElements(concreteStrategyContainmentDiagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT: {
				EcoreMatrixContainment ecoreMatrixContainment = (EcoreMatrixContainment)theEObject;
				T result = caseEcoreMatrixContainment(ecoreMatrixContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS: {
				HeuristicStrategySettings heuristicStrategySettings = (HeuristicStrategySettings)theEObject;
				T result = caseHeuristicStrategySettings(heuristicStrategySettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.STRATEGY_LINK_COMPARTMENT: {
				StrategyLinkCompartment strategyLinkCompartment = (StrategyLinkCompartment)theEObject;
				T result = caseStrategyLinkCompartment(strategyLinkCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED: {
				ConcreteContainmentasAffixed concreteContainmentasAffixed = (ConcreteContainmentasAffixed)theEObject;
				T result = caseConcreteContainmentasAffixed(concreteContainmentasAffixed);
				if (result == null) result = caseStrategyLinkCompartment(concreteContainmentasAffixed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_LINKS: {
				ConcreteContainmentasLinks concreteContainmentasLinks = (ConcreteContainmentasLinks)theEObject;
				T result = caseConcreteContainmentasLinks(concreteContainmentasLinks);
				if (result == null) result = caseStrategyLinkCompartment(concreteContainmentasLinks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_COMPARTMENTS: {
				ConcreteContainmentasCompartments concreteContainmentasCompartments = (ConcreteContainmentasCompartments)theEObject;
				T result = caseConcreteContainmentasCompartments(concreteContainmentasCompartments);
				if (result == null) result = caseStrategyLinkCompartment(concreteContainmentasCompartments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslHeuristicVisualizationPackage.REPRE_HEUR_SS: {
				RepreHeurSS repreHeurSS = (RepreHeurSS)theEObject;
				T result = caseRepreHeurSS(repreHeurSS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heuristic Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heuristic Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeuristicStrategy(HeuristicStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyLink(ConcreteStrategyLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyLabel(StrategyLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Label First String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Label First String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyLabelFirstString(ConcreteStrategyLabelFirstString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Label Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Label Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyLabelIdentifier(ConcreteStrategyLabelIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Label Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Label Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyLabelParameter(ConcreteStrategyLabelParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelParameter(LabelParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Root Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Root Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyRootSelection(StrategyRootSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Max Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Max Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyMaxContainment(ConcreteStrategyMaxContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy No Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy No Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyNoParent(ConcreteStrategyNoParent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Palette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Palette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyPalette(StrategyPalette object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Palette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Palette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyPalette(ConcreteStrategyPalette object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Arc Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Arc Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyArcSelection(StrategyArcSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Arc Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Arc Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyArcSelection(ConcreteStrategyArcSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Arc Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Arc Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyArcDirection(StrategyArcDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcParameter(ArcParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Arc Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Arc Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultArcParameter(DefaultArcParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Arc Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Arc Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyArcDirection(ConcreteStrategyArcDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Default Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Default Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyDefaultDirection(ConcreteStrategyDefaultDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Node Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Node Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyNodeSelection(StrategyNodeSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Default Node Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Default Node Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyDefaultNodeSelection(ConcreteStrategyDefaultNodeSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Possible Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Possible Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyPossibleElements(StrategyPossibleElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Strategy Containment Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Strategy Containment Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStrategyContainmentDiagramElement(ConcreteStrategyContainmentDiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore Matrix Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore Matrix Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreMatrixContainment(EcoreMatrixContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heuristic Strategy Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heuristic Strategy Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeuristicStrategySettings(HeuristicStrategySettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Link Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Link Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyLinkCompartment(StrategyLinkCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Containmentas Affixed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Containmentas Affixed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteContainmentasAffixed(ConcreteContainmentasAffixed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Containmentas Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Containmentas Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteContainmentasLinks(ConcreteContainmentasLinks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Containmentas Compartments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Containmentas Compartments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteContainmentasCompartments(ConcreteContainmentasCompartments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repre Heur SS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repre Heur SS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepreHeurSS(RepreHeurSS object) {
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

} //DslHeuristicVisualizationSwitch
