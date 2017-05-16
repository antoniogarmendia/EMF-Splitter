/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy Compartments</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyCompartments()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StrategyCompartments extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<EReference> Get_Compartments(EClass anEClass);

} // StrategyCompartments
