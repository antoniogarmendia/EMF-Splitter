/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ArcParameter;
import dslHeuristicVisualization.ConcreteContainmentasAffixed;
import dslHeuristicVisualization.ConcreteContainmentasCompartments;
import dslHeuristicVisualization.ConcreteContainmentasLinks;
import dslHeuristicVisualization.ConcreteStrategyArcDirection;
import dslHeuristicVisualization.ConcreteStrategyArcSelection;
import dslHeuristicVisualization.ConcreteStrategyContainmentDiagramElement;
import dslHeuristicVisualization.ConcreteStrategyDefaultDirection;
import dslHeuristicVisualization.ConcreteStrategyDefaultNodeSelection;
import dslHeuristicVisualization.ConcreteStrategyLabelFirstString;
import dslHeuristicVisualization.ConcreteStrategyLabelIdentifier;
import dslHeuristicVisualization.ConcreteStrategyLabelParameter;
import dslHeuristicVisualization.ConcreteStrategyLink;
import dslHeuristicVisualization.ConcreteStrategyMaxContainment;
import dslHeuristicVisualization.ConcreteStrategyNoParent;
import dslHeuristicVisualization.ConcreteStrategyPalette;
import dslHeuristicVisualization.DefaultArcParameter;
import dslHeuristicVisualization.DslHeuristicVisualizationFactory;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.EcoreMatrixContainment;
import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.HeuristicStrategySettings;
import dslHeuristicVisualization.LabelParameter;
import dslHeuristicVisualization.RepreHeurSS;
import dslHeuristicVisualization.StrategyArcDirection;
import dslHeuristicVisualization.StrategyArcSelection;
import dslHeuristicVisualization.StrategyLabel;
import dslHeuristicVisualization.StrategyLinkCompartment;
import dslHeuristicVisualization.StrategyNodeSelection;
import dslHeuristicVisualization.StrategyPalette;
import dslHeuristicVisualization.StrategyPossibleElements;
import dslHeuristicVisualization.StrategyRootSelection;
import graphic_representation.Graphic_representationPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import splitterLibrary.SplitterLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslHeuristicVisualizationPackageImpl extends EPackageImpl implements DslHeuristicVisualizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heuristicStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyLabelFirstStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyLabelIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyLabelParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyRootSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyMaxContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyNoParentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyPaletteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyPaletteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyArcSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyArcSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyArcDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultArcParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyArcDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyDefaultDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyNodeSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyDefaultNodeSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyPossibleElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStrategyContainmentDiagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreMatrixContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heuristicStrategySettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyLinkCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteContainmentasAffixedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteContainmentasLinksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteContainmentasCompartmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repreHeurSSEClass = null;

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
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DslHeuristicVisualizationPackageImpl() {
		super(eNS_URI, DslHeuristicVisualizationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DslHeuristicVisualizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DslHeuristicVisualizationPackage init() {
		if (isInited) return (DslHeuristicVisualizationPackage)EPackage.Registry.INSTANCE.getEPackage(DslHeuristicVisualizationPackage.eNS_URI);

		// Obtain or create and register package
		DslHeuristicVisualizationPackageImpl theDslHeuristicVisualizationPackage = (DslHeuristicVisualizationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DslHeuristicVisualizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DslHeuristicVisualizationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Graphic_representationPackage.eINSTANCE.eClass();
		SplitterLibraryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDslHeuristicVisualizationPackage.createPackageContents();

		// Initialize created meta-data
		theDslHeuristicVisualizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDslHeuristicVisualizationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DslHeuristicVisualizationPackage.eNS_URI, theDslHeuristicVisualizationPackage);
		return theDslHeuristicVisualizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeuristicStrategy() {
		return heuristicStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategy_Graphic_representation() {
		return (EReference)heuristicStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategy_Nemf() {
		return (EReference)heuristicStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategy_EcoreContainment() {
		return (EReference)heuristicStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeuristicStrategy_CurrentRepresentation() {
		return (EAttribute)heuristicStrategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeuristicStrategy_CurrentMMGR() {
		return (EAttribute)heuristicStrategyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategy_ListRepresentation() {
		return (EReference)heuristicStrategyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHeuristicStrategy__ExecuteHeuristics() {
		return heuristicStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHeuristicStrategy__Execute_Root_Element() {
		return heuristicStrategyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHeuristicStrategy__Execute_Graphical_Elements() {
		return heuristicStrategyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHeuristicStrategy__GetFeatureName__EClass_EClass() {
		return heuristicStrategyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHeuristicStrategy__GetEListEClassfromEReference__EReference() {
		return heuristicStrategyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHeuristicStrategy__ExecuteDirectPathMatrix() {
		return heuristicStrategyEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyLink() {
		return concreteStrategyLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyLabel() {
		return strategyLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategyLabel__GetLabel__EClass() {
		return strategyLabelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyLabelFirstString() {
		return concreteStrategyLabelFirstStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyLabelIdentifier() {
		return concreteStrategyLabelIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyLabelParameter() {
		return concreteStrategyLabelParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteStrategyLabelParameter_Label_parameter() {
		return (EReference)concreteStrategyLabelParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelParameter() {
		return labelParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelParameter_List_label() {
		return (EAttribute)labelParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabelParameter__ToCommaSeparatedStringLabel() {
		return labelParameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabelParameter__DefaultParameters() {
		return labelParameterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyRootSelection() {
		return strategyRootSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategyRootSelection__Get_Root__EList_EList() {
		return strategyRootSelectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategyRootSelection__List_Root__EList_EList() {
		return strategyRootSelectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyMaxContainment() {
		return concreteStrategyMaxContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyNoParent() {
		return concreteStrategyNoParentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyPalette() {
		return strategyPaletteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategyPalette__Get_Palette__EObject() {
		return strategyPaletteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyPalette() {
		return concreteStrategyPaletteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyArcSelection() {
		return strategyArcSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyArcSelection_Arc_direction() {
		return (EReference)strategyArcSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategyArcSelection__IsArc__EClass() {
		return strategyArcSelectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyArcSelection() {
		return concreteStrategyArcSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyArcDirection() {
		return strategyArcDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategyArcDirection__Get_Direction__EClass() {
		return strategyArcDirectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcParameter() {
		return arcParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcParameter_Source() {
		return (EAttribute)arcParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcParameter_Target() {
		return (EAttribute)arcParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArcParameter__DefaultParam() {
		return arcParameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultArcParameter() {
		return defaultArcParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefaultArcParameter__ToCommaSeparatedStringSource() {
		return defaultArcParameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefaultArcParameter__ToCommaSeparatedStringTarget() {
		return defaultArcParameterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyArcDirection() {
		return concreteStrategyArcDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteStrategyArcDirection_Param() {
		return (EReference)concreteStrategyArcDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteStrategyArcDirection__ContainsStringEReferenceName__EList_String() {
		return concreteStrategyArcDirectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyDefaultDirection() {
		return concreteStrategyDefaultDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyNodeSelection() {
		return strategyNodeSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategyNodeSelection__IsNode__EClass() {
		return strategyNodeSelectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyDefaultNodeSelection() {
		return concreteStrategyDefaultNodeSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyPossibleElements() {
		return strategyPossibleElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyPossibleElements_EClassNoElements() {
		return (EReference)strategyPossibleElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategyPossibleElements__PossibleElements__EClass_EList_EList() {
		return strategyPossibleElementsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStrategyContainmentDiagramElement() {
		return concreteStrategyContainmentDiagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreMatrixContainment() {
		return ecoreMatrixContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreMatrixContainment_Direct_MatrixContainment() {
		return (EAttribute)ecoreMatrixContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreMatrixContainment_PathMatrix() {
		return (EAttribute)ecoreMatrixContainmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreMatrixContainment__GetParent__Integer() {
		return ecoreMatrixContainmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreMatrixContainment__GetDirectMatrixContainment__EList() {
		return ecoreMatrixContainmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreMatrixContainment__GetPathMatrix() {
		return ecoreMatrixContainmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreMatrixContainment__CopyMatrix() {
		return ecoreMatrixContainmentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreMatrixContainment__PrintDirectMatrixContainment__EList() {
		return ecoreMatrixContainmentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreMatrixContainment__GetEAllChilds__EClass_EList() {
		return ecoreMatrixContainmentEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreMatrixContainment__GetAllParents__Integer() {
		return ecoreMatrixContainmentEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeuristicStrategySettings() {
		return heuristicStrategySettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategySettings_Strategy_label() {
		return (EReference)heuristicStrategySettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategySettings_Strategy_root() {
		return (EReference)heuristicStrategySettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategySettings_Strategy_palette() {
		return (EReference)heuristicStrategySettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategySettings_Strategy_arcSelection() {
		return (EReference)heuristicStrategySettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategySettings_Strategy_node_selection() {
		return (EReference)heuristicStrategySettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategySettings_Strategy_possibleElements() {
		return (EReference)heuristicStrategySettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeuristicStrategySettings_Strategy_linkcompartment() {
		return (EReference)heuristicStrategySettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyLinkCompartment() {
		return strategyLinkCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyLinkCompartment_ListLinks() {
		return (EReference)strategyLinkCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyLinkCompartment_ListCompartment() {
		return (EReference)strategyLinkCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyLinkCompartment_ListAffixed() {
		return (EReference)strategyLinkCompartmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategyLinkCompartment__ExecuteLinkCompartmentsHeuristics__EClass() {
		return strategyLinkCompartmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteContainmentasAffixed() {
		return concreteContainmentasAffixedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteContainmentasLinks() {
		return concreteContainmentasLinksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteContainmentasCompartments() {
		return concreteContainmentasCompartmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepreHeurSS() {
		return repreHeurSSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepreHeurSS_HeuristicStrategySettings() {
		return (EReference)repreHeurSSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslHeuristicVisualizationFactory getDslHeuristicVisualizationFactory() {
		return (DslHeuristicVisualizationFactory)getEFactoryInstance();
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
		heuristicStrategyEClass = createEClass(HEURISTIC_STRATEGY);
		createEReference(heuristicStrategyEClass, HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION);
		createEReference(heuristicStrategyEClass, HEURISTIC_STRATEGY__NEMF);
		createEReference(heuristicStrategyEClass, HEURISTIC_STRATEGY__ECORE_CONTAINMENT);
		createEAttribute(heuristicStrategyEClass, HEURISTIC_STRATEGY__CURRENT_REPRESENTATION);
		createEAttribute(heuristicStrategyEClass, HEURISTIC_STRATEGY__CURRENT_MMGR);
		createEReference(heuristicStrategyEClass, HEURISTIC_STRATEGY__LIST_REPRESENTATION);
		createEOperation(heuristicStrategyEClass, HEURISTIC_STRATEGY___EXECUTE_HEURISTICS);
		createEOperation(heuristicStrategyEClass, HEURISTIC_STRATEGY___EXECUTE_ROOT_ELEMENT);
		createEOperation(heuristicStrategyEClass, HEURISTIC_STRATEGY___EXECUTE_GRAPHICAL_ELEMENTS);
		createEOperation(heuristicStrategyEClass, HEURISTIC_STRATEGY___GET_FEATURE_NAME__ECLASS_ECLASS);
		createEOperation(heuristicStrategyEClass, HEURISTIC_STRATEGY___GET_ELIST_ECLASSFROM_EREFERENCE__EREFERENCE);
		createEOperation(heuristicStrategyEClass, HEURISTIC_STRATEGY___EXECUTE_DIRECT_PATH_MATRIX);

		concreteStrategyLinkEClass = createEClass(CONCRETE_STRATEGY_LINK);

		strategyLabelEClass = createEClass(STRATEGY_LABEL);
		createEOperation(strategyLabelEClass, STRATEGY_LABEL___GET_LABEL__ECLASS);

		concreteStrategyLabelFirstStringEClass = createEClass(CONCRETE_STRATEGY_LABEL_FIRST_STRING);

		concreteStrategyLabelIdentifierEClass = createEClass(CONCRETE_STRATEGY_LABEL_IDENTIFIER);

		concreteStrategyLabelParameterEClass = createEClass(CONCRETE_STRATEGY_LABEL_PARAMETER);
		createEReference(concreteStrategyLabelParameterEClass, CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER);

		labelParameterEClass = createEClass(LABEL_PARAMETER);
		createEAttribute(labelParameterEClass, LABEL_PARAMETER__LIST_LABEL);
		createEOperation(labelParameterEClass, LABEL_PARAMETER___TO_COMMA_SEPARATED_STRING_LABEL);
		createEOperation(labelParameterEClass, LABEL_PARAMETER___DEFAULT_PARAMETERS);

		strategyRootSelectionEClass = createEClass(STRATEGY_ROOT_SELECTION);
		createEOperation(strategyRootSelectionEClass, STRATEGY_ROOT_SELECTION___GET_ROOT__ELIST_ELIST);
		createEOperation(strategyRootSelectionEClass, STRATEGY_ROOT_SELECTION___LIST_ROOT__ELIST_ELIST);

		concreteStrategyMaxContainmentEClass = createEClass(CONCRETE_STRATEGY_MAX_CONTAINMENT);

		concreteStrategyNoParentEClass = createEClass(CONCRETE_STRATEGY_NO_PARENT);

		strategyPaletteEClass = createEClass(STRATEGY_PALETTE);
		createEOperation(strategyPaletteEClass, STRATEGY_PALETTE___GET_PALETTE__EOBJECT);

		concreteStrategyPaletteEClass = createEClass(CONCRETE_STRATEGY_PALETTE);

		strategyArcSelectionEClass = createEClass(STRATEGY_ARC_SELECTION);
		createEReference(strategyArcSelectionEClass, STRATEGY_ARC_SELECTION__ARC_DIRECTION);
		createEOperation(strategyArcSelectionEClass, STRATEGY_ARC_SELECTION___IS_ARC__ECLASS);

		concreteStrategyArcSelectionEClass = createEClass(CONCRETE_STRATEGY_ARC_SELECTION);

		strategyArcDirectionEClass = createEClass(STRATEGY_ARC_DIRECTION);
		createEOperation(strategyArcDirectionEClass, STRATEGY_ARC_DIRECTION___GET_DIRECTION__ECLASS);

		arcParameterEClass = createEClass(ARC_PARAMETER);
		createEAttribute(arcParameterEClass, ARC_PARAMETER__SOURCE);
		createEAttribute(arcParameterEClass, ARC_PARAMETER__TARGET);
		createEOperation(arcParameterEClass, ARC_PARAMETER___DEFAULT_PARAM);

		defaultArcParameterEClass = createEClass(DEFAULT_ARC_PARAMETER);
		createEOperation(defaultArcParameterEClass, DEFAULT_ARC_PARAMETER___TO_COMMA_SEPARATED_STRING_SOURCE);
		createEOperation(defaultArcParameterEClass, DEFAULT_ARC_PARAMETER___TO_COMMA_SEPARATED_STRING_TARGET);

		concreteStrategyArcDirectionEClass = createEClass(CONCRETE_STRATEGY_ARC_DIRECTION);
		createEReference(concreteStrategyArcDirectionEClass, CONCRETE_STRATEGY_ARC_DIRECTION__PARAM);
		createEOperation(concreteStrategyArcDirectionEClass, CONCRETE_STRATEGY_ARC_DIRECTION___CONTAINS_STRING_EREFERENCE_NAME__ELIST_STRING);

		concreteStrategyDefaultDirectionEClass = createEClass(CONCRETE_STRATEGY_DEFAULT_DIRECTION);

		strategyNodeSelectionEClass = createEClass(STRATEGY_NODE_SELECTION);
		createEOperation(strategyNodeSelectionEClass, STRATEGY_NODE_SELECTION___IS_NODE__ECLASS);

		concreteStrategyDefaultNodeSelectionEClass = createEClass(CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION);

		strategyPossibleElementsEClass = createEClass(STRATEGY_POSSIBLE_ELEMENTS);
		createEReference(strategyPossibleElementsEClass, STRATEGY_POSSIBLE_ELEMENTS__ECLASS_NO_ELEMENTS);
		createEOperation(strategyPossibleElementsEClass, STRATEGY_POSSIBLE_ELEMENTS___POSSIBLE_ELEMENTS__ECLASS_ELIST_ELIST);

		concreteStrategyContainmentDiagramElementEClass = createEClass(CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT);

		ecoreMatrixContainmentEClass = createEClass(ECORE_MATRIX_CONTAINMENT);
		createEAttribute(ecoreMatrixContainmentEClass, ECORE_MATRIX_CONTAINMENT__DIRECT_MATRIX_CONTAINMENT);
		createEAttribute(ecoreMatrixContainmentEClass, ECORE_MATRIX_CONTAINMENT__PATH_MATRIX);
		createEOperation(ecoreMatrixContainmentEClass, ECORE_MATRIX_CONTAINMENT___GET_PARENT__INTEGER);
		createEOperation(ecoreMatrixContainmentEClass, ECORE_MATRIX_CONTAINMENT___GET_DIRECT_MATRIX_CONTAINMENT__ELIST);
		createEOperation(ecoreMatrixContainmentEClass, ECORE_MATRIX_CONTAINMENT___GET_PATH_MATRIX);
		createEOperation(ecoreMatrixContainmentEClass, ECORE_MATRIX_CONTAINMENT___COPY_MATRIX);
		createEOperation(ecoreMatrixContainmentEClass, ECORE_MATRIX_CONTAINMENT___PRINT_DIRECT_MATRIX_CONTAINMENT__ELIST);
		createEOperation(ecoreMatrixContainmentEClass, ECORE_MATRIX_CONTAINMENT___GET_EALL_CHILDS__ECLASS_ELIST);
		createEOperation(ecoreMatrixContainmentEClass, ECORE_MATRIX_CONTAINMENT___GET_ALL_PARENTS__INTEGER);

		heuristicStrategySettingsEClass = createEClass(HEURISTIC_STRATEGY_SETTINGS);
		createEReference(heuristicStrategySettingsEClass, HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL);
		createEReference(heuristicStrategySettingsEClass, HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT);
		createEReference(heuristicStrategySettingsEClass, HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE);
		createEReference(heuristicStrategySettingsEClass, HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION);
		createEReference(heuristicStrategySettingsEClass, HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION);
		createEReference(heuristicStrategySettingsEClass, HEURISTIC_STRATEGY_SETTINGS__STRATEGY_POSSIBLE_ELEMENTS);
		createEReference(heuristicStrategySettingsEClass, HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LINKCOMPARTMENT);

		strategyLinkCompartmentEClass = createEClass(STRATEGY_LINK_COMPARTMENT);
		createEReference(strategyLinkCompartmentEClass, STRATEGY_LINK_COMPARTMENT__LIST_LINKS);
		createEReference(strategyLinkCompartmentEClass, STRATEGY_LINK_COMPARTMENT__LIST_COMPARTMENT);
		createEReference(strategyLinkCompartmentEClass, STRATEGY_LINK_COMPARTMENT__LIST_AFFIXED);
		createEOperation(strategyLinkCompartmentEClass, STRATEGY_LINK_COMPARTMENT___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS);

		concreteContainmentasAffixedEClass = createEClass(CONCRETE_CONTAINMENTAS_AFFIXED);

		concreteContainmentasLinksEClass = createEClass(CONCRETE_CONTAINMENTAS_LINKS);

		concreteContainmentasCompartmentsEClass = createEClass(CONCRETE_CONTAINMENTAS_COMPARTMENTS);

		repreHeurSSEClass = createEClass(REPRE_HEUR_SS);
		createEReference(repreHeurSSEClass, REPRE_HEUR_SS__HEURISTIC_STRATEGY_SETTINGS);
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
		Graphic_representationPackage theGraphic_representationPackage = (Graphic_representationPackage)EPackage.Registry.INSTANCE.getEPackage(Graphic_representationPackage.eNS_URI);
		SplitterLibraryPackage theSplitterLibraryPackage = (SplitterLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(SplitterLibraryPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		concreteStrategyLabelFirstStringEClass.getESuperTypes().add(this.getStrategyLabel());
		concreteStrategyLabelIdentifierEClass.getESuperTypes().add(this.getStrategyLabel());
		concreteStrategyLabelParameterEClass.getESuperTypes().add(this.getStrategyLabel());
		concreteStrategyMaxContainmentEClass.getESuperTypes().add(this.getStrategyRootSelection());
		concreteStrategyNoParentEClass.getESuperTypes().add(this.getStrategyRootSelection());
		concreteStrategyPaletteEClass.getESuperTypes().add(this.getStrategyPalette());
		concreteStrategyArcSelectionEClass.getESuperTypes().add(this.getStrategyArcSelection());
		defaultArcParameterEClass.getESuperTypes().add(this.getArcParameter());
		concreteStrategyArcDirectionEClass.getESuperTypes().add(this.getStrategyArcDirection());
		concreteStrategyDefaultDirectionEClass.getESuperTypes().add(this.getStrategyArcDirection());
		concreteStrategyDefaultNodeSelectionEClass.getESuperTypes().add(this.getStrategyNodeSelection());
		concreteStrategyContainmentDiagramElementEClass.getESuperTypes().add(this.getStrategyPossibleElements());
		concreteContainmentasAffixedEClass.getESuperTypes().add(this.getStrategyLinkCompartment());
		concreteContainmentasLinksEClass.getESuperTypes().add(this.getStrategyLinkCompartment());
		concreteContainmentasCompartmentsEClass.getESuperTypes().add(this.getStrategyLinkCompartment());

		// Initialize classes, features, and operations; add parameters
		initEClass(heuristicStrategyEClass, HeuristicStrategy.class, "HeuristicStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeuristicStrategy_Graphic_representation(), theGraphic_representationPackage.getGraphicRepresentation(), null, "graphic_representation", null, 0, 1, HeuristicStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeuristicStrategy_Nemf(), theSplitterLibraryPackage.getEcoreEMF(), null, "nemf", null, 0, 1, HeuristicStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeuristicStrategy_EcoreContainment(), this.getEcoreMatrixContainment(), null, "ecoreContainment", null, 0, 1, HeuristicStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeuristicStrategy_CurrentRepresentation(), ecorePackage.getEIntegerObject(), "currentRepresentation", null, 0, 1, HeuristicStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeuristicStrategy_CurrentMMGR(), theEcorePackage.getEIntegerObject(), "currentMMGR", null, 0, 1, HeuristicStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeuristicStrategy_ListRepresentation(), this.getRepreHeurSS(), null, "listRepresentation", null, 0, -1, HeuristicStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHeuristicStrategy__ExecuteHeuristics(), null, "ExecuteHeuristics", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHeuristicStrategy__Execute_Root_Element(), null, "Execute_Root_Element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHeuristicStrategy__Execute_Graphical_Elements(), null, "Execute_Graphical_Elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getHeuristicStrategy__GetFeatureName__EClass_EClass(), ecorePackage.getEReference(), "GetFeatureName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "parentEClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "childEClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHeuristicStrategy__GetEListEClassfromEReference__EReference(), theGraphic_representationPackage.getNode(), "GetEListEClassfromEReference", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEReference(), "anEReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHeuristicStrategy__ExecuteDirectPathMatrix(), null, "ExecuteDirectPathMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteStrategyLinkEClass, ConcreteStrategyLink.class, "ConcreteStrategyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategyLabelEClass, StrategyLabel.class, "StrategyLabel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStrategyLabel__GetLabel__EClass(), ecorePackage.getEAttribute(), "GetLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "anEClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteStrategyLabelFirstStringEClass, ConcreteStrategyLabelFirstString.class, "ConcreteStrategyLabelFirstString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteStrategyLabelIdentifierEClass, ConcreteStrategyLabelIdentifier.class, "ConcreteStrategyLabelIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteStrategyLabelParameterEClass, ConcreteStrategyLabelParameter.class, "ConcreteStrategyLabelParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteStrategyLabelParameter_Label_parameter(), this.getLabelParameter(), null, "label_parameter", null, 0, 1, ConcreteStrategyLabelParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelParameterEClass, LabelParameter.class, "LabelParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelParameter_List_label(), ecorePackage.getEString(), "list_label", null, 0, -1, LabelParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLabelParameter__ToCommaSeparatedStringLabel(), ecorePackage.getEString(), "toCommaSeparatedStringLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLabelParameter__DefaultParameters(), null, "DefaultParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strategyRootSelectionEClass, StrategyRootSelection.class, "StrategyRootSelection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStrategyRootSelection__Get_Root__EList_EList(), ecorePackage.getEClass(), "Get_Root", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ContainmentMatrix", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "listEClass", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStrategyRootSelection__List_Root__EList_EList(), ecorePackage.getEClass(), "List_Root", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ContainmentMatrix", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "listEClass", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteStrategyMaxContainmentEClass, ConcreteStrategyMaxContainment.class, "ConcreteStrategyMaxContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteStrategyNoParentEClass, ConcreteStrategyNoParent.class, "ConcreteStrategyNoParent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategyPaletteEClass, StrategyPalette.class, "StrategyPalette", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStrategyPalette__Get_Palette__EObject(), ecorePackage.getEString(), "Get_Palette", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "anEObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteStrategyPaletteEClass, ConcreteStrategyPalette.class, "ConcreteStrategyPalette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategyArcSelectionEClass, StrategyArcSelection.class, "StrategyArcSelection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategyArcSelection_Arc_direction(), this.getStrategyArcDirection(), null, "arc_direction", null, 0, 1, StrategyArcSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStrategyArcSelection__IsArc__EClass(), ecorePackage.getEBooleanObject(), "IsArc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "anEClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteStrategyArcSelectionEClass, ConcreteStrategyArcSelection.class, "ConcreteStrategyArcSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategyArcDirectionEClass, StrategyArcDirection.class, "StrategyArcDirection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStrategyArcDirection__Get_Direction__EClass(), theGraphic_representationPackage.getEdge_Direction(), "Get_Direction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "anEClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arcParameterEClass, ArcParameter.class, "ArcParameter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcParameter_Source(), ecorePackage.getEString(), "source", null, 0, -1, ArcParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArcParameter_Target(), ecorePackage.getEString(), "target", null, 0, -1, ArcParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArcParameter__DefaultParam(), null, "DefaultParam", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultArcParameterEClass, DefaultArcParameter.class, "DefaultArcParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDefaultArcParameter__ToCommaSeparatedStringSource(), ecorePackage.getEString(), "toCommaSeparatedStringSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDefaultArcParameter__ToCommaSeparatedStringTarget(), ecorePackage.getEString(), "toCommaSeparatedStringTarget", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteStrategyArcDirectionEClass, ConcreteStrategyArcDirection.class, "ConcreteStrategyArcDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteStrategyArcDirection_Param(), this.getArcParameter(), null, "param", null, 0, 1, ConcreteStrategyArcDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getConcreteStrategyArcDirection__ContainsStringEReferenceName__EList_String(), ecorePackage.getEBoolean(), "ContainsStringEReferenceName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ListStrings", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "anString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteStrategyDefaultDirectionEClass, ConcreteStrategyDefaultDirection.class, "ConcreteStrategyDefaultDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategyNodeSelectionEClass, StrategyNodeSelection.class, "StrategyNodeSelection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStrategyNodeSelection__IsNode__EClass(), ecorePackage.getEBooleanObject(), "IsNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "anEClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteStrategyDefaultNodeSelectionEClass, ConcreteStrategyDefaultNodeSelection.class, "ConcreteStrategyDefaultNodeSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategyPossibleElementsEClass, StrategyPossibleElements.class, "StrategyPossibleElements", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategyPossibleElements_EClassNoElements(), ecorePackage.getEClass(), null, "EClassNoElements", null, 0, -1, StrategyPossibleElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStrategyPossibleElements__PossibleElements__EClass_EList_EList(), ecorePackage.getEClass(), "PossibleElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "rootEClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(ecorePackage.getEBooleanObject());
		g2.getETypeArguments().add(g3);
		addEParameter(op, g1, "pathMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "listEClass", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteStrategyContainmentDiagramElementEClass, ConcreteStrategyContainmentDiagramElement.class, "ConcreteStrategyContainmentDiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecoreMatrixContainmentEClass, EcoreMatrixContainment.class, "EcoreMatrixContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(ecorePackage.getEBooleanObject());
		g2.getETypeArguments().add(g3);
		initEAttribute(getEcoreMatrixContainment_Direct_MatrixContainment(), g1, "direct_MatrixContainment", null, 0, 1, EcoreMatrixContainment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(ecorePackage.getEBooleanObject());
		g2.getETypeArguments().add(g3);
		initEAttribute(getEcoreMatrixContainment_PathMatrix(), g1, "pathMatrix", null, 0, 1, EcoreMatrixContainment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEcoreMatrixContainment__GetParent__Integer(), ecorePackage.getEIntegerObject(), "GetParent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcoreMatrixContainment__GetDirectMatrixContainment__EList(), ecorePackage.getEBooleanObject(), "GetDirectMatrixContainment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "listEClass", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEcoreMatrixContainment__GetPathMatrix(), ecorePackage.getEBooleanObject(), "GetPathMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEcoreMatrixContainment__CopyMatrix(), null, "CopyMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcoreMatrixContainment__PrintDirectMatrixContainment__EList(), null, "PrintDirectMatrixContainment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "listEClass", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcoreMatrixContainment__GetEAllChilds__EClass_EList(), theEcorePackage.getEClass(), "getEAllChilds", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "listEClass", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcoreMatrixContainment__GetAllParents__Integer(), ecorePackage.getEIntegerObject(), "getAllParents", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(heuristicStrategySettingsEClass, HeuristicStrategySettings.class, "HeuristicStrategySettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeuristicStrategySettings_Strategy_label(), this.getStrategyLabel(), null, "strategy_label", null, 0, 1, HeuristicStrategySettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeuristicStrategySettings_Strategy_root(), this.getStrategyRootSelection(), null, "strategy_root", null, 0, 1, HeuristicStrategySettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeuristicStrategySettings_Strategy_palette(), this.getStrategyPalette(), null, "strategy_palette", null, 0, 1, HeuristicStrategySettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeuristicStrategySettings_Strategy_arcSelection(), this.getStrategyArcSelection(), null, "strategy_arcSelection", null, 0, 1, HeuristicStrategySettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeuristicStrategySettings_Strategy_node_selection(), this.getStrategyNodeSelection(), null, "strategy_node_selection", null, 0, 1, HeuristicStrategySettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeuristicStrategySettings_Strategy_possibleElements(), this.getStrategyPossibleElements(), null, "strategy_possibleElements", null, 0, 1, HeuristicStrategySettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeuristicStrategySettings_Strategy_linkcompartment(), this.getStrategyLinkCompartment(), null, "strategy_linkcompartment", null, 0, 1, HeuristicStrategySettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyLinkCompartmentEClass, StrategyLinkCompartment.class, "StrategyLinkCompartment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategyLinkCompartment_ListLinks(), ecorePackage.getEReference(), null, "listLinks", null, 0, -1, StrategyLinkCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategyLinkCompartment_ListCompartment(), ecorePackage.getEReference(), null, "listCompartment", null, 0, -1, StrategyLinkCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategyLinkCompartment_ListAffixed(), ecorePackage.getEReference(), null, "listAffixed", null, 0, -1, StrategyLinkCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStrategyLinkCompartment__ExecuteLinkCompartmentsHeuristics__EClass(), null, "ExecuteLinkCompartmentsHeuristics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "anEClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteContainmentasAffixedEClass, ConcreteContainmentasAffixed.class, "ConcreteContainmentasAffixed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteContainmentasLinksEClass, ConcreteContainmentasLinks.class, "ConcreteContainmentasLinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteContainmentasCompartmentsEClass, ConcreteContainmentasCompartments.class, "ConcreteContainmentasCompartments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repreHeurSSEClass, RepreHeurSS.class, "RepreHeurSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepreHeurSS_HeuristicStrategySettings(), this.getHeuristicStrategySettings(), null, "heuristicStrategySettings", null, 0, -1, RepreHeurSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DslHeuristicVisualizationPackageImpl
