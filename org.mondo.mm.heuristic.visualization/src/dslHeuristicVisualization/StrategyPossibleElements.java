/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy Possible Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.StrategyPossibleElements#getEClassNoElements <em>EClass No Elements</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyPossibleElements()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StrategyPossibleElements extends EObject {
	/**
	 * Returns the value of the '<em><b>EClass No Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass No Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass No Elements</em>' reference list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyPossibleElements_EClassNoElements()
	 * @model
	 * @generated
	 */
	EList<EClass> getEClassNoElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pathMatrixMany="false" listEClassMany="true"
	 * @generated
	 */
	EList<EClass> PossibleElements(EClass rootEClass, EList<EList<Boolean>> pathMatrix, EList<EClass> listEClass);

} // StrategyPossibleElements
