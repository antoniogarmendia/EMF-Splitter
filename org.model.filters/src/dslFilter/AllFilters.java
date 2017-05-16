/**
 */
package dslFilter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Filters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.AllFilters#isNegative <em>Negative</em>}</li>
 *   <li>{@link dslFilter.AllFilters#getGroupfilters <em>Groupfilters</em>}</li>
 *   <li>{@link dslFilter.AllFilters#getModelURI <em>Model URI</em>}</li>
 *   <li>{@link dslFilter.AllFilters#getList_EClasses <em>List EClasses</em>}</li>
 *   <li>{@link dslFilter.AllFilters#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getAllFilters()
 * @model
 * @generated
 */
public interface AllFilters extends EObject {
	/**
	 * Returns the value of the '<em><b>Negative</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative</em>' attribute.
	 * @see #setNegative(boolean)
	 * @see dslFilter.DslFilterPackage#getAllFilters_Negative()
	 * @model default="false"
	 * @generated
	 */
	boolean isNegative();

	/**
	 * Sets the value of the '{@link dslFilter.AllFilters#isNegative <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' attribute.
	 * @see #isNegative()
	 * @generated
	 */
	void setNegative(boolean value);

	/**
	 * Returns the value of the '<em><b>Groupfilters</b></em>' containment reference list.
	 * The list contents are of type {@link dslFilter.FilterGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupfilters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupfilters</em>' containment reference list.
	 * @see dslFilter.DslFilterPackage#getAllFilters_Groupfilters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilterGroup> getGroupfilters();

	/**
	 * Returns the value of the '<em><b>Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model URI</em>' attribute.
	 * @see #setModelURI(String)
	 * @see dslFilter.DslFilterPackage#getAllFilters_ModelURI()
	 * @model
	 * @generated
	 */
	String getModelURI();

	/**
	 * Sets the value of the '{@link dslFilter.AllFilters#getModelURI <em>Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model URI</em>' attribute.
	 * @see #getModelURI()
	 * @generated
	 */
	void setModelURI(String value);

	/**
	 * Returns the value of the '<em><b>List EClasses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List EClasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List EClasses</em>' reference list.
	 * @see dslFilter.DslFilterPackage#getAllFilters_List_EClasses()
	 * @model
	 * @generated
	 */
	EList<EClass> getList_EClasses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dslFilter.DslFilterPackage#getAllFilters_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dslFilter.AllFilters#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean Execute(TreeIterator<EObject> tree);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean InitAllFilters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="dslFilter.IntToEObjectMap<org.eclipse.emf.ecore.EIntegerObject, org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	EMap<Integer, EList<EObject>> AllEObjectsSatifiesCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean DeleteAllEObjectsSatisfiesCondition();

} // AllFilters
