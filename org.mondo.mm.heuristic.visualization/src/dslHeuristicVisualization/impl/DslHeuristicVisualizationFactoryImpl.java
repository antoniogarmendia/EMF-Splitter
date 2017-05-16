/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.*;

import org.eclipse.emf.ecore.EClass;
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
public class DslHeuristicVisualizationFactoryImpl extends EFactoryImpl implements DslHeuristicVisualizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DslHeuristicVisualizationFactory init() {
		try {
			DslHeuristicVisualizationFactory theDslHeuristicVisualizationFactory = (DslHeuristicVisualizationFactory)EPackage.Registry.INSTANCE.getEFactory(DslHeuristicVisualizationPackage.eNS_URI);
			if (theDslHeuristicVisualizationFactory != null) {
				return theDslHeuristicVisualizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslHeuristicVisualizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslHeuristicVisualizationFactoryImpl() {
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
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY: return createHeuristicStrategy();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LINK: return createConcreteStrategyLink();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_FIRST_STRING: return createConcreteStrategyLabelFirstString();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_IDENTIFIER: return createConcreteStrategyLabelIdentifier();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER: return createConcreteStrategyLabelParameter();
			case DslHeuristicVisualizationPackage.LABEL_PARAMETER: return createLabelParameter();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_MAX_CONTAINMENT: return createConcreteStrategyMaxContainment();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_NO_PARENT: return createConcreteStrategyNoParent();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_PALETTE: return createConcreteStrategyPalette();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_SELECTION: return createConcreteStrategyArcSelection();
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER: return createDefaultArcParameter();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION: return createConcreteStrategyArcDirection();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_DEFAULT_DIRECTION: return createConcreteStrategyDefaultDirection();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION: return createConcreteStrategyDefaultNodeSelection();
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT: return createConcreteStrategyContainmentDiagramElement();
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT: return createEcoreMatrixContainment();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS: return createHeuristicStrategySettings();
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED: return createConcreteContainmentasAffixed();
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_LINKS: return createConcreteContainmentasLinks();
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_COMPARTMENTS: return createConcreteContainmentasCompartments();
			case DslHeuristicVisualizationPackage.REPRE_HEUR_SS: return createRepreHeurSS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeuristicStrategy createHeuristicStrategy() {
		HeuristicStrategyImpl heuristicStrategy = new HeuristicStrategyImpl();
		return heuristicStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyLink createConcreteStrategyLink() {
		ConcreteStrategyLinkImpl concreteStrategyLink = new ConcreteStrategyLinkImpl();
		return concreteStrategyLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyLabelFirstString createConcreteStrategyLabelFirstString() {
		ConcreteStrategyLabelFirstStringImpl concreteStrategyLabelFirstString = new ConcreteStrategyLabelFirstStringImpl();
		return concreteStrategyLabelFirstString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyLabelIdentifier createConcreteStrategyLabelIdentifier() {
		ConcreteStrategyLabelIdentifierImpl concreteStrategyLabelIdentifier = new ConcreteStrategyLabelIdentifierImpl();
		return concreteStrategyLabelIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyLabelParameter createConcreteStrategyLabelParameter() {
		ConcreteStrategyLabelParameterImpl concreteStrategyLabelParameter = new ConcreteStrategyLabelParameterImpl();
		return concreteStrategyLabelParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelParameter createLabelParameter() {
		LabelParameterImpl labelParameter = new LabelParameterImpl();
		return labelParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyMaxContainment createConcreteStrategyMaxContainment() {
		ConcreteStrategyMaxContainmentImpl concreteStrategyMaxContainment = new ConcreteStrategyMaxContainmentImpl();
		return concreteStrategyMaxContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyNoParent createConcreteStrategyNoParent() {
		ConcreteStrategyNoParentImpl concreteStrategyNoParent = new ConcreteStrategyNoParentImpl();
		return concreteStrategyNoParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyPalette createConcreteStrategyPalette() {
		ConcreteStrategyPaletteImpl concreteStrategyPalette = new ConcreteStrategyPaletteImpl();
		return concreteStrategyPalette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyArcSelection createConcreteStrategyArcSelection() {
		ConcreteStrategyArcSelectionImpl concreteStrategyArcSelection = new ConcreteStrategyArcSelectionImpl();
		return concreteStrategyArcSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultArcParameter createDefaultArcParameter() {
		DefaultArcParameterImpl defaultArcParameter = new DefaultArcParameterImpl();
		return defaultArcParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyArcDirection createConcreteStrategyArcDirection() {
		ConcreteStrategyArcDirectionImpl concreteStrategyArcDirection = new ConcreteStrategyArcDirectionImpl();
		return concreteStrategyArcDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyDefaultDirection createConcreteStrategyDefaultDirection() {
		ConcreteStrategyDefaultDirectionImpl concreteStrategyDefaultDirection = new ConcreteStrategyDefaultDirectionImpl();
		return concreteStrategyDefaultDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyDefaultNodeSelection createConcreteStrategyDefaultNodeSelection() {
		ConcreteStrategyDefaultNodeSelectionImpl concreteStrategyDefaultNodeSelection = new ConcreteStrategyDefaultNodeSelectionImpl();
		return concreteStrategyDefaultNodeSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteStrategyContainmentDiagramElement createConcreteStrategyContainmentDiagramElement() {
		ConcreteStrategyContainmentDiagramElementImpl concreteStrategyContainmentDiagramElement = new ConcreteStrategyContainmentDiagramElementImpl();
		return concreteStrategyContainmentDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreMatrixContainment createEcoreMatrixContainment() {
		EcoreMatrixContainmentImpl ecoreMatrixContainment = new EcoreMatrixContainmentImpl();
		return ecoreMatrixContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeuristicStrategySettings createHeuristicStrategySettings() {
		HeuristicStrategySettingsImpl heuristicStrategySettings = new HeuristicStrategySettingsImpl();
		return heuristicStrategySettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteContainmentasAffixed createConcreteContainmentasAffixed() {
		ConcreteContainmentasAffixedImpl concreteContainmentasAffixed = new ConcreteContainmentasAffixedImpl();
		return concreteContainmentasAffixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteContainmentasLinks createConcreteContainmentasLinks() {
		ConcreteContainmentasLinksImpl concreteContainmentasLinks = new ConcreteContainmentasLinksImpl();
		return concreteContainmentasLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteContainmentasCompartments createConcreteContainmentasCompartments() {
		ConcreteContainmentasCompartmentsImpl concreteContainmentasCompartments = new ConcreteContainmentasCompartmentsImpl();
		return concreteContainmentasCompartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepreHeurSS createRepreHeurSS() {
		RepreHeurSSImpl repreHeurSS = new RepreHeurSSImpl();
		return repreHeurSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslHeuristicVisualizationPackage getDslHeuristicVisualizationPackage() {
		return (DslHeuristicVisualizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DslHeuristicVisualizationPackage getPackage() {
		return DslHeuristicVisualizationPackage.eINSTANCE;
	}

} //DslHeuristicVisualizationFactoryImpl
