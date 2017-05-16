/**
 */
package Modularity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Modularity.Container#getContainees <em>Containees</em>}</li>
 * </ul>
 *
 * @see Modularity.ModularityPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Containees</b></em>' containment reference list.
	 * The list contents are of type {@link Modularity.Containee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containees</em>' containment reference list.
	 * @see Modularity.ModularityPackage#getContainer_Containees()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Containee> getContainees();

} // Container
