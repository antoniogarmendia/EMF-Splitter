/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy Arc Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.StrategyArcSelection#getArc_direction <em>Arc direction</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyArcSelection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StrategyArcSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Arc direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc direction</em>' reference.
	 * @see #setArc_direction(StrategyArcDirection)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyArcSelection_Arc_direction()
	 * @model
	 * @generated
	 */
	StrategyArcDirection getArc_direction();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.StrategyArcSelection#getArc_direction <em>Arc direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc direction</em>' reference.
	 * @see #getArc_direction()
	 * @generated
	 */
	void setArc_direction(StrategyArcDirection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean IsArc(EClass anEClass);

} // StrategyArcSelection
