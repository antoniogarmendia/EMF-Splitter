/**
 */
package dslFilter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.FilterAttributes#getName <em>Name</em>}</li>
 *   <li>{@link dslFilter.FilterAttributes#getAnLogicOperation <em>An Logic Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getFilterAttributes()
 * @model abstract="true"
 * @generated
 */
public interface FilterAttributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Filters"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dslFilter.DslFilterPackage#getFilterAttributes_Name()
	 * @model default="Filters"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dslFilter.FilterAttributes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>An Logic Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Logic Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Logic Operation</em>' reference.
	 * @see #setAnLogicOperation(CLogicOperation)
	 * @see dslFilter.DslFilterPackage#getFilterAttributes_AnLogicOperation()
	 * @model
	 * @generated
	 */
	CLogicOperation getAnLogicOperation();

	/**
	 * Sets the value of the '{@link dslFilter.FilterAttributes#getAnLogicOperation <em>An Logic Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An Logic Operation</em>' reference.
	 * @see #getAnLogicOperation()
	 * @generated
	 */
	void setAnLogicOperation(CLogicOperation value);

} // FilterAttributes
