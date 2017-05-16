/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Label EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.EdgeLabelEAttribute#getLabelEAttribute <em>Label EAttribute</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getEdgeLabelEAttribute()
 * @model
 * @generated
 */
public interface EdgeLabelEAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Label EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label EAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label EAttribute</em>' reference.
	 * @see #setLabelEAttribute(EAttribute)
	 * @see graphic_representation.Graphic_representationPackage#getEdgeLabelEAttribute_LabelEAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getLabelEAttribute();

	/**
	 * Sets the value of the '{@link graphic_representation.EdgeLabelEAttribute#getLabelEAttribute <em>Label EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label EAttribute</em>' reference.
	 * @see #getLabelEAttribute()
	 * @generated
	 */
	void setLabelEAttribute(EAttribute value);

} // EdgeLabelEAttribute
