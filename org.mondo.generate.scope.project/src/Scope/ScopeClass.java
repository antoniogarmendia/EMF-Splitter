/**
 */
package Scope;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Scope.ScopeClass#getRSamePackage <em>RSame Package</em>}</li>
 *   <li>{@link Scope.ScopeClass#getRSameProject <em>RSame Project</em>}</li>
 *   <li>{@link Scope.ScopeClass#getRSameWorkSpace <em>RSame Work Space</em>}</li>
 *   <li>{@link Scope.ScopeClass#getRSameUnit <em>RSame Unit</em>}</li>
 * </ul>
 *
 * @see Scope.ScopePackage#getScopeClass()
 * @model
 * @generated
 */
public interface ScopeClass extends EObject {
	/**
	 * Returns the value of the '<em><b>RSame Package</b></em>' reference list.
	 * The list contents are of type {@link Scope.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RSame Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSame Package</em>' reference list.
	 * @see Scope.ScopePackage#getScopeClass_RSamePackage()
	 * @model
	 * @generated
	 */
	EList<Node> getRSamePackage();

	/**
	 * Returns the value of the '<em><b>RSame Project</b></em>' reference list.
	 * The list contents are of type {@link Scope.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RSame Project</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSame Project</em>' reference list.
	 * @see Scope.ScopePackage#getScopeClass_RSameProject()
	 * @model
	 * @generated
	 */
	EList<Node> getRSameProject();

	/**
	 * Returns the value of the '<em><b>RSame Work Space</b></em>' reference list.
	 * The list contents are of type {@link Scope.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RSame Work Space</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSame Work Space</em>' reference list.
	 * @see Scope.ScopePackage#getScopeClass_RSameWorkSpace()
	 * @model
	 * @generated
	 */
	EList<Node> getRSameWorkSpace();

	/**
	 * Returns the value of the '<em><b>RSame Unit</b></em>' reference list.
	 * The list contents are of type {@link Scope.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RSame Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSame Unit</em>' reference list.
	 * @see Scope.ScopePackage#getScopeClass_RSameUnit()
	 * @model
	 * @generated
	 */
	EList<Node> getRSameUnit();

} // ScopeClass
