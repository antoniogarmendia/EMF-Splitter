/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy Root Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyRootSelection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StrategyRootSelection extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ContainmentMatrixMany="true" listEClassMany="true"
	 * @generated
	 */
	EClass Get_Root(EList<EList<Boolean>> ContainmentMatrix, EList<EClass> listEClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ContainmentMatrixMany="true" listEClassMany="true"
	 * @generated
	 */
	EList<EClass> List_Root(EList<EList<Boolean>> ContainmentMatrix, EList<EClass> listEClass);
} // StrategyRootSelection
