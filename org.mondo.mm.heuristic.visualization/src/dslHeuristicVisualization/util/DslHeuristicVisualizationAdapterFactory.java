/**
 */
package dslHeuristicVisualization.util;

import dslHeuristicVisualization.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage
 * @generated
 */
public class DslHeuristicVisualizationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslHeuristicVisualizationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslHeuristicVisualizationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DslHeuristicVisualizationPackage.eINSTANCE;
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
	protected DslHeuristicVisualizationSwitch<Adapter> modelSwitch =
		new DslHeuristicVisualizationSwitch<Adapter>() {
			@Override
			public Adapter caseHeuristicStrategy(HeuristicStrategy object) {
				return createHeuristicStrategyAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyLink(ConcreteStrategyLink object) {
				return createConcreteStrategyLinkAdapter();
			}
			@Override
			public Adapter caseStrategyLabel(StrategyLabel object) {
				return createStrategyLabelAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyLabelFirstString(ConcreteStrategyLabelFirstString object) {
				return createConcreteStrategyLabelFirstStringAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyLabelIdentifier(ConcreteStrategyLabelIdentifier object) {
				return createConcreteStrategyLabelIdentifierAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyLabelParameter(ConcreteStrategyLabelParameter object) {
				return createConcreteStrategyLabelParameterAdapter();
			}
			@Override
			public Adapter caseLabelParameter(LabelParameter object) {
				return createLabelParameterAdapter();
			}
			@Override
			public Adapter caseStrategyRootSelection(StrategyRootSelection object) {
				return createStrategyRootSelectionAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyMaxContainment(ConcreteStrategyMaxContainment object) {
				return createConcreteStrategyMaxContainmentAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyNoParent(ConcreteStrategyNoParent object) {
				return createConcreteStrategyNoParentAdapter();
			}
			@Override
			public Adapter caseStrategyPalette(StrategyPalette object) {
				return createStrategyPaletteAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyPalette(ConcreteStrategyPalette object) {
				return createConcreteStrategyPaletteAdapter();
			}
			@Override
			public Adapter caseStrategyArcSelection(StrategyArcSelection object) {
				return createStrategyArcSelectionAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyArcSelection(ConcreteStrategyArcSelection object) {
				return createConcreteStrategyArcSelectionAdapter();
			}
			@Override
			public Adapter caseStrategyArcDirection(StrategyArcDirection object) {
				return createStrategyArcDirectionAdapter();
			}
			@Override
			public Adapter caseArcParameter(ArcParameter object) {
				return createArcParameterAdapter();
			}
			@Override
			public Adapter caseDefaultArcParameter(DefaultArcParameter object) {
				return createDefaultArcParameterAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyArcDirection(ConcreteStrategyArcDirection object) {
				return createConcreteStrategyArcDirectionAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyDefaultDirection(ConcreteStrategyDefaultDirection object) {
				return createConcreteStrategyDefaultDirectionAdapter();
			}
			@Override
			public Adapter caseStrategyNodeSelection(StrategyNodeSelection object) {
				return createStrategyNodeSelectionAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyDefaultNodeSelection(ConcreteStrategyDefaultNodeSelection object) {
				return createConcreteStrategyDefaultNodeSelectionAdapter();
			}
			@Override
			public Adapter caseStrategyPossibleElements(StrategyPossibleElements object) {
				return createStrategyPossibleElementsAdapter();
			}
			@Override
			public Adapter caseConcreteStrategyContainmentDiagramElement(ConcreteStrategyContainmentDiagramElement object) {
				return createConcreteStrategyContainmentDiagramElementAdapter();
			}
			@Override
			public Adapter caseEcoreMatrixContainment(EcoreMatrixContainment object) {
				return createEcoreMatrixContainmentAdapter();
			}
			@Override
			public Adapter caseHeuristicStrategySettings(HeuristicStrategySettings object) {
				return createHeuristicStrategySettingsAdapter();
			}
			@Override
			public Adapter caseStrategyLinkCompartment(StrategyLinkCompartment object) {
				return createStrategyLinkCompartmentAdapter();
			}
			@Override
			public Adapter caseConcreteContainmentasAffixed(ConcreteContainmentasAffixed object) {
				return createConcreteContainmentasAffixedAdapter();
			}
			@Override
			public Adapter caseConcreteContainmentasLinks(ConcreteContainmentasLinks object) {
				return createConcreteContainmentasLinksAdapter();
			}
			@Override
			public Adapter caseConcreteContainmentasCompartments(ConcreteContainmentasCompartments object) {
				return createConcreteContainmentasCompartmentsAdapter();
			}
			@Override
			public Adapter caseRepreHeurSS(RepreHeurSS object) {
				return createRepreHeurSSAdapter();
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
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.HeuristicStrategy <em>Heuristic Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.HeuristicStrategy
	 * @generated
	 */
	public Adapter createHeuristicStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyLink <em>Concrete Strategy Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyLink
	 * @generated
	 */
	public Adapter createConcreteStrategyLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.StrategyLabel <em>Strategy Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.StrategyLabel
	 * @generated
	 */
	public Adapter createStrategyLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyLabelFirstString <em>Concrete Strategy Label First String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyLabelFirstString
	 * @generated
	 */
	public Adapter createConcreteStrategyLabelFirstStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyLabelIdentifier <em>Concrete Strategy Label Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyLabelIdentifier
	 * @generated
	 */
	public Adapter createConcreteStrategyLabelIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyLabelParameter <em>Concrete Strategy Label Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyLabelParameter
	 * @generated
	 */
	public Adapter createConcreteStrategyLabelParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.LabelParameter <em>Label Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.LabelParameter
	 * @generated
	 */
	public Adapter createLabelParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.StrategyRootSelection <em>Strategy Root Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.StrategyRootSelection
	 * @generated
	 */
	public Adapter createStrategyRootSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyMaxContainment <em>Concrete Strategy Max Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyMaxContainment
	 * @generated
	 */
	public Adapter createConcreteStrategyMaxContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyNoParent <em>Concrete Strategy No Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyNoParent
	 * @generated
	 */
	public Adapter createConcreteStrategyNoParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.StrategyPalette <em>Strategy Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.StrategyPalette
	 * @generated
	 */
	public Adapter createStrategyPaletteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyPalette <em>Concrete Strategy Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyPalette
	 * @generated
	 */
	public Adapter createConcreteStrategyPaletteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.StrategyArcSelection <em>Strategy Arc Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.StrategyArcSelection
	 * @generated
	 */
	public Adapter createStrategyArcSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyArcSelection <em>Concrete Strategy Arc Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyArcSelection
	 * @generated
	 */
	public Adapter createConcreteStrategyArcSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.StrategyArcDirection <em>Strategy Arc Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.StrategyArcDirection
	 * @generated
	 */
	public Adapter createStrategyArcDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ArcParameter <em>Arc Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ArcParameter
	 * @generated
	 */
	public Adapter createArcParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.DefaultArcParameter <em>Default Arc Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.DefaultArcParameter
	 * @generated
	 */
	public Adapter createDefaultArcParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyArcDirection <em>Concrete Strategy Arc Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyArcDirection
	 * @generated
	 */
	public Adapter createConcreteStrategyArcDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyDefaultDirection <em>Concrete Strategy Default Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyDefaultDirection
	 * @generated
	 */
	public Adapter createConcreteStrategyDefaultDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.StrategyNodeSelection <em>Strategy Node Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.StrategyNodeSelection
	 * @generated
	 */
	public Adapter createStrategyNodeSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyDefaultNodeSelection <em>Concrete Strategy Default Node Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyDefaultNodeSelection
	 * @generated
	 */
	public Adapter createConcreteStrategyDefaultNodeSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.StrategyPossibleElements <em>Strategy Possible Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.StrategyPossibleElements
	 * @generated
	 */
	public Adapter createStrategyPossibleElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteStrategyContainmentDiagramElement <em>Concrete Strategy Containment Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteStrategyContainmentDiagramElement
	 * @generated
	 */
	public Adapter createConcreteStrategyContainmentDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.EcoreMatrixContainment <em>Ecore Matrix Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.EcoreMatrixContainment
	 * @generated
	 */
	public Adapter createEcoreMatrixContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.HeuristicStrategySettings <em>Heuristic Strategy Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.HeuristicStrategySettings
	 * @generated
	 */
	public Adapter createHeuristicStrategySettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.StrategyLinkCompartment <em>Strategy Link Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.StrategyLinkCompartment
	 * @generated
	 */
	public Adapter createStrategyLinkCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteContainmentasAffixed <em>Concrete Containmentas Affixed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteContainmentasAffixed
	 * @generated
	 */
	public Adapter createConcreteContainmentasAffixedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteContainmentasLinks <em>Concrete Containmentas Links</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteContainmentasLinks
	 * @generated
	 */
	public Adapter createConcreteContainmentasLinksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.ConcreteContainmentasCompartments <em>Concrete Containmentas Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.ConcreteContainmentasCompartments
	 * @generated
	 */
	public Adapter createConcreteContainmentasCompartmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslHeuristicVisualization.RepreHeurSS <em>Repre Heur SS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslHeuristicVisualization.RepreHeurSS
	 * @generated
	 */
	public Adapter createRepreHeurSSAdapter() {
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

} //DslHeuristicVisualizationAdapterFactory
