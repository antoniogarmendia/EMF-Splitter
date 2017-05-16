/**
 */
package Filter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filterable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Filter.Filterable#getAKey <em>AKey</em>}</li>
 *   <li>{@link Filter.Filterable#getRKey <em>RKey</em>}</li>
 * </ul>
 * </p>
 *
 * @see Filter.FilterPackage#getFilterable()
 * @model
 * @generated
 */
public interface Filterable extends EObject {
	/**
	 * Returns the value of the '<em><b>AKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AKey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AKey</em>' attribute.
	 * @see #setAKey(Object)
	 * @see Filter.FilterPackage#getFilterable_AKey()
	 * @model required="true"
	 * @generated
	 */
	Object getAKey();

	/**
	 * Sets the value of the '{@link Filter.Filterable#getAKey <em>AKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AKey</em>' attribute.
	 * @see #getAKey()
	 * @generated
	 */
	void setAKey(Object value);

	/**
	 * Returns the value of the '<em><b>RKey</b></em>' containment reference list.
	 * The list contents are of type {@link Filter.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RKey</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RKey</em>' containment reference list.
	 * @see Filter.FilterPackage#getFilterable_RKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getRKey();

} // Filterable
