/**
 */
package dslFilter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.FilterGroup#getContents <em>Contents</em>}</li>
 *   <li>{@link dslFilter.FilterGroup#getListSatifiesCondition <em>List Satifies Condition</em>}</li>
 *   <li>{@link dslFilter.FilterGroup#getAnEClass <em>An EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getFilterGroup()
 * @model
 * @generated
 */
public interface FilterGroup extends FilterContent, FilterAttributes {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link dslFilter.FilterContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see dslFilter.DslFilterPackage#getFilterGroup_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilterContent> getContents();

	/**
	 * Returns the value of the '<em><b>List Satifies Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Satifies Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Satifies Condition</em>' containment reference list.
	 * @see dslFilter.DslFilterPackage#getFilterGroup_ListSatifiesCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getListSatifiesCondition();

	/**
	 * Returns the value of the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An EClass</em>' reference.
	 * @see #setAnEClass(EClass)
	 * @see dslFilter.DslFilterPackage#getFilterGroup_AnEClass()
	 * @model
	 * @generated
	 */
	EClass getAnEClass();

	/**
	 * Sets the value of the '{@link dslFilter.FilterGroup#getAnEClass <em>An EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EClass</em>' reference.
	 * @see #getAnEClass()
	 * @generated
	 */
	void setAnEClass(EClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean InitFilterGroup(Integer count);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isClassInterfaceEObject(EObject anEObject);

} // FilterGroup
