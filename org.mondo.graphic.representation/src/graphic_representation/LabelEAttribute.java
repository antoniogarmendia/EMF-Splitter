/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.LabelEAttribute#getAnEAttribute <em>An EAttribute</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getLabelEAttribute()
 * @model
 * @generated
 */
public interface LabelEAttribute extends ShapeColor, GRLabelStyleDescription {
	/**
	 * Returns the value of the '<em><b>An EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An EAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An EAttribute</em>' reference.
	 * @see #setAnEAttribute(EAttribute)
	 * @see graphic_representation.Graphic_representationPackage#getLabelEAttribute_AnEAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getAnEAttribute();

	/**
	 * Sets the value of the '{@link graphic_representation.LabelEAttribute#getAnEAttribute <em>An EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EAttribute</em>' reference.
	 * @see #getAnEAttribute()
	 * @generated
	 */
	void setAnEAttribute(EAttribute value);

} // LabelEAttribute
