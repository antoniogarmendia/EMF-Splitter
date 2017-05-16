/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Edge_Direction#getSourceLink <em>Source Link</em>}</li>
 *   <li>{@link graphic_representation.Edge_Direction#getTargetLink <em>Target Link</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getEdge_Direction()
 * @model
 * @generated
 */
public interface Edge_Direction extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Link</em>' containment reference.
	 * @see #setSourceLink(Link)
	 * @see graphic_representation.Graphic_representationPackage#getEdge_Direction_SourceLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getSourceLink();

	/**
	 * Sets the value of the '{@link graphic_representation.Edge_Direction#getSourceLink <em>Source Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Link</em>' containment reference.
	 * @see #getSourceLink()
	 * @generated
	 */
	void setSourceLink(Link value);

	/**
	 * Returns the value of the '<em><b>Target Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Link</em>' containment reference.
	 * @see #setTargetLink(Link)
	 * @see graphic_representation.Graphic_representationPackage#getEdge_Direction_TargetLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getTargetLink();

	/**
	 * Sets the value of the '{@link graphic_representation.Edge_Direction#getTargetLink <em>Target Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Link</em>' containment reference.
	 * @see #getTargetLink()
	 * @generated
	 */
	void setTargetLink(Link value);

} // Edge_Direction
