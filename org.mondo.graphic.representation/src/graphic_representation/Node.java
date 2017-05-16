/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Node#getNode_elements <em>Node elements</em>}</li>
 *   <li>{@link graphic_representation.Node#getNode_shape <em>Node shape</em>}</li>
 *   <li>{@link graphic_representation.Node#isExpandable <em>Expandable</em>}</li>
 *   <li>{@link graphic_representation.Node#getConditionalStyle <em>Conditional Style</em>}</li>
 *   <li>{@link graphic_representation.Node#getPresentation <em>Presentation</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Node elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node elements</em>' containment reference.
	 * @see #setNode_elements(Node_Element)
	 * @see graphic_representation.Graphic_representationPackage#getNode_Node_elements()
	 * @model containment="true"
	 * @generated
	 */
	Node_Element getNode_elements();

	/**
	 * Sets the value of the '{@link graphic_representation.Node#getNode_elements <em>Node elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node elements</em>' containment reference.
	 * @see #getNode_elements()
	 * @generated
	 */
	void setNode_elements(Node_Element value);

	/**
	 * Returns the value of the '<em><b>Node shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node shape</em>' containment reference.
	 * @see #setNode_shape(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getNode_Node_shape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getNode_shape();

	/**
	 * Sets the value of the '{@link graphic_representation.Node#getNode_shape <em>Node shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node shape</em>' containment reference.
	 * @see #getNode_shape()
	 * @generated
	 */
	void setNode_shape(Shape value);

	/**
	 * Returns the value of the '<em><b>Expandable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expandable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expandable</em>' attribute.
	 * @see #setExpandable(boolean)
	 * @see graphic_representation.Graphic_representationPackage#getNode_Expandable()
	 * @model default="false"
	 * @generated
	 */
	boolean isExpandable();

	/**
	 * Sets the value of the '{@link graphic_representation.Node#isExpandable <em>Expandable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expandable</em>' attribute.
	 * @see #isExpandable()
	 * @generated
	 */
	void setExpandable(boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Style</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.ConditionalStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Style</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getNode_ConditionalStyle()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalStyle> getConditionalStyle();

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * The literals are from the enumeration {@link graphic_representation.ChildrenPresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see graphic_representation.ChildrenPresentation
	 * @see #setPresentation(ChildrenPresentation)
	 * @see graphic_representation.Graphic_representationPackage#getNode_Presentation()
	 * @model
	 * @generated
	 */
	ChildrenPresentation getPresentation();

	/**
	 * Sets the value of the '{@link graphic_representation.Node#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see graphic_representation.ChildrenPresentation
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(ChildrenPresentation value);

} // Node
