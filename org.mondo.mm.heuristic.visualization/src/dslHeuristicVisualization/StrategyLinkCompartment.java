/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy Link Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.StrategyLinkCompartment#getListLinks <em>List Links</em>}</li>
 *   <li>{@link dslHeuristicVisualization.StrategyLinkCompartment#getListCompartment <em>List Compartment</em>}</li>
 *   <li>{@link dslHeuristicVisualization.StrategyLinkCompartment#getListAffixed <em>List Affixed</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyLinkCompartment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StrategyLinkCompartment extends EObject {
	/**
	 * Returns the value of the '<em><b>List Links</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Links</em>' reference list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyLinkCompartment_ListLinks()
	 * @model
	 * @generated
	 */
	EList<EReference> getListLinks();

	/**
	 * Returns the value of the '<em><b>List Compartment</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Compartment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Compartment</em>' reference list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyLinkCompartment_ListCompartment()
	 * @model
	 * @generated
	 */
	EList<EReference> getListCompartment();

	/**
	 * Returns the value of the '<em><b>List Affixed</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Affixed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Affixed</em>' reference list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyLinkCompartment_ListAffixed()
	 * @model
	 * @generated
	 */
	EList<EReference> getListAffixed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ExecuteLinkCompartmentsHeuristics(EClass anEClass);

} // StrategyLinkCompartment
