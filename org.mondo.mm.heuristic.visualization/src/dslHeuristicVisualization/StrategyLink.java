/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy Link</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyLink()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StrategyLink extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<EReference> Get_Links(EClass anEClass);
} // StrategyLink
