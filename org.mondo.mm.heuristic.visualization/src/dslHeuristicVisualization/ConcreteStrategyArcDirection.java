/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Strategy Arc Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.ConcreteStrategyArcDirection#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getConcreteStrategyArcDirection()
 * @model
 * @generated
 */
public interface ConcreteStrategyArcDirection extends StrategyArcDirection {

	/**
	 * Returns the value of the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' reference.
	 * @see #setParam(ArcParameter)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getConcreteStrategyArcDirection_Param()
	 * @model
	 * @generated
	 */
	ArcParameter getParam();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.ConcreteStrategyArcDirection#getParam <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(ArcParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ListStringsMany="true"
	 * @generated
	 */
	boolean ContainsStringEReferenceName(EList<String> ListStrings, String anString);
} // ConcreteStrategyArcDirection
