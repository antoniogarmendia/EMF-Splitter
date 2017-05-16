/**
 */
package dslFilter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.Filter#getAnRule <em>An Rule</em>}</li>
 *   <li>{@link dslFilter.Filter#getAnEStructuralFeature <em>An EStructural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends FilterContent {
	/**
	 * Returns the value of the '<em><b>An Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Rule</em>' containment reference.
	 * @see #setAnRule(Rule)
	 * @see dslFilter.DslFilterPackage#getFilter_AnRule()
	 * @model containment="true"
	 * @generated
	 */
	Rule getAnRule();

	/**
	 * Sets the value of the '{@link dslFilter.Filter#getAnRule <em>An Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An Rule</em>' containment reference.
	 * @see #getAnRule()
	 * @generated
	 */
	void setAnRule(Rule value);

	/**
	 * Returns the value of the '<em><b>An EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An EStructural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An EStructural Feature</em>' reference.
	 * @see #setAnEStructuralFeature(EStructuralFeature)
	 * @see dslFilter.DslFilterPackage#getFilter_AnEStructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getAnEStructuralFeature();

	/**
	 * Sets the value of the '{@link dslFilter.Filter#getAnEStructuralFeature <em>An EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EStructural Feature</em>' reference.
	 * @see #getAnEStructuralFeature()
	 * @generated
	 */
	void setAnEStructuralFeature(EStructuralFeature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> GetRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> GetObjectReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean InitFilter();

} // Filter
