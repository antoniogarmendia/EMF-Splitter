/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.AbstractElement#getAnEClass <em>An EClass</em>}</li>
 *   <li>{@link graphic_representation.AbstractElement#getNode_elements <em>Node elements</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getAbstractElement()
 * @model
 * @generated
 */
public interface AbstractElement extends AllElements {
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
	 * @see graphic_representation.Graphic_representationPackage#getAbstractElement_AnEClass()
	 * @model
	 * @generated
	 */
	EClass getAnEClass();

	/**
	 * Sets the value of the '{@link graphic_representation.AbstractElement#getAnEClass <em>An EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EClass</em>' reference.
	 * @see #getAnEClass()
	 * @generated
	 */
	void setAnEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Node elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node elements</em>' containment reference.
	 * @see #setNode_elements(Node_Element)
	 * @see graphic_representation.Graphic_representationPackage#getAbstractElement_Node_elements()
	 * @model containment="true"
	 * @generated
	 */
	Node_Element getNode_elements();

	/**
	 * Sets the value of the '{@link graphic_representation.AbstractElement#getNode_elements <em>Node elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node elements</em>' containment reference.
	 * @see #getNode_elements()
	 * @generated
	 */
	void setNode_elements(Node_Element value);

} // AbstractElement
