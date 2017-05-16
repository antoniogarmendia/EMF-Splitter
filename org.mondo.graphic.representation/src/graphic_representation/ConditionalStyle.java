/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.ConditionalStyle#getEAttribute <em>EAttribute</em>}</li>
 *   <li>{@link graphic_representation.ConditionalStyle#getValue <em>Value</em>}</li>
 *   <li>{@link graphic_representation.ConditionalStyle#getConditionalStyle <em>Conditional Style</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getConditionalStyle()
 * @model
 * @generated
 */
public interface ConditionalStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute</em>' reference.
	 * @see #setEAttribute(EAttribute)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalStyle_EAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getEAttribute();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalStyle#getEAttribute <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute</em>' reference.
	 * @see #getEAttribute()
	 * @generated
	 */
	void setEAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalStyle_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalStyle#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Conditional Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Style</em>' containment reference.
	 * @see #setConditionalStyle(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalStyle_ConditionalStyle()
	 * @model containment="true"
	 * @generated
	 */
	Shape getConditionalStyle();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalStyle#getConditionalStyle <em>Conditional Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Style</em>' containment reference.
	 * @see #getConditionalStyle()
	 * @generated
	 */
	void setConditionalStyle(Shape value);

} // ConditionalStyle
