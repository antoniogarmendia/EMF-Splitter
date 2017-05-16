/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repre Heur SS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.RepreHeurSS#getHeuristicStrategySettings <em>Heuristic Strategy Settings</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getRepreHeurSS()
 * @model
 * @generated
 */
public interface RepreHeurSS extends EObject {
	/**
	 * Returns the value of the '<em><b>Heuristic Strategy Settings</b></em>' containment reference list.
	 * The list contents are of type {@link dslHeuristicVisualization.HeuristicStrategySettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heuristic Strategy Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heuristic Strategy Settings</em>' containment reference list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getRepreHeurSS_HeuristicStrategySettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeuristicStrategySettings> getHeuristicStrategySettings();

} // RepreHeurSS
