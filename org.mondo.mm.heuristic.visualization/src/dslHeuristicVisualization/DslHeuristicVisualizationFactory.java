/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage
 * @generated
 */
public interface DslHeuristicVisualizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslHeuristicVisualizationFactory eINSTANCE = dslHeuristicVisualization.impl.DslHeuristicVisualizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Heuristic Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heuristic Strategy</em>'.
	 * @generated
	 */
	HeuristicStrategy createHeuristicStrategy();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Link</em>'.
	 * @generated
	 */
	ConcreteStrategyLink createConcreteStrategyLink();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Label First String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Label First String</em>'.
	 * @generated
	 */
	ConcreteStrategyLabelFirstString createConcreteStrategyLabelFirstString();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Label Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Label Identifier</em>'.
	 * @generated
	 */
	ConcreteStrategyLabelIdentifier createConcreteStrategyLabelIdentifier();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Label Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Label Parameter</em>'.
	 * @generated
	 */
	ConcreteStrategyLabelParameter createConcreteStrategyLabelParameter();

	/**
	 * Returns a new object of class '<em>Label Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Parameter</em>'.
	 * @generated
	 */
	LabelParameter createLabelParameter();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Max Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Max Containment</em>'.
	 * @generated
	 */
	ConcreteStrategyMaxContainment createConcreteStrategyMaxContainment();

	/**
	 * Returns a new object of class '<em>Concrete Strategy No Parent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy No Parent</em>'.
	 * @generated
	 */
	ConcreteStrategyNoParent createConcreteStrategyNoParent();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Palette</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Palette</em>'.
	 * @generated
	 */
	ConcreteStrategyPalette createConcreteStrategyPalette();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Arc Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Arc Selection</em>'.
	 * @generated
	 */
	ConcreteStrategyArcSelection createConcreteStrategyArcSelection();

	/**
	 * Returns a new object of class '<em>Default Arc Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Arc Parameter</em>'.
	 * @generated
	 */
	DefaultArcParameter createDefaultArcParameter();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Arc Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Arc Direction</em>'.
	 * @generated
	 */
	ConcreteStrategyArcDirection createConcreteStrategyArcDirection();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Default Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Default Direction</em>'.
	 * @generated
	 */
	ConcreteStrategyDefaultDirection createConcreteStrategyDefaultDirection();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Default Node Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Default Node Selection</em>'.
	 * @generated
	 */
	ConcreteStrategyDefaultNodeSelection createConcreteStrategyDefaultNodeSelection();

	/**
	 * Returns a new object of class '<em>Concrete Strategy Containment Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Strategy Containment Diagram Element</em>'.
	 * @generated
	 */
	ConcreteStrategyContainmentDiagramElement createConcreteStrategyContainmentDiagramElement();

	/**
	 * Returns a new object of class '<em>Ecore Matrix Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Matrix Containment</em>'.
	 * @generated
	 */
	EcoreMatrixContainment createEcoreMatrixContainment();

	/**
	 * Returns a new object of class '<em>Heuristic Strategy Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heuristic Strategy Settings</em>'.
	 * @generated
	 */
	HeuristicStrategySettings createHeuristicStrategySettings();

	/**
	 * Returns a new object of class '<em>Concrete Containmentas Affixed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Containmentas Affixed</em>'.
	 * @generated
	 */
	ConcreteContainmentasAffixed createConcreteContainmentasAffixed();

	/**
	 * Returns a new object of class '<em>Concrete Containmentas Links</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Containmentas Links</em>'.
	 * @generated
	 */
	ConcreteContainmentasLinks createConcreteContainmentasLinks();

	/**
	 * Returns a new object of class '<em>Concrete Containmentas Compartments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Containmentas Compartments</em>'.
	 * @generated
	 */
	ConcreteContainmentasCompartments createConcreteContainmentasCompartments();

	/**
	 * Returns a new object of class '<em>Repre Heur SS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repre Heur SS</em>'.
	 * @generated
	 */
	RepreHeurSS createRepreHeurSS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DslHeuristicVisualizationPackage getDslHeuristicVisualizationPackage();

} //DslHeuristicVisualizationFactory
