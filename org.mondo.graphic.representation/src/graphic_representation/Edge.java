/**
 */
package graphic_representation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Edge#getDirections <em>Directions</em>}</li>
 *   <li>{@link graphic_representation.Edge#getEdge_style <em>Edge style</em>}</li>
 *   <li>{@link graphic_representation.Edge#getEdgeLabel <em>Edge Label</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Directions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directions</em>' containment reference.
	 * @see #setDirections(Edge_Direction)
	 * @see graphic_representation.Graphic_representationPackage#getEdge_Directions()
	 * @model containment="true"
	 * @generated
	 */
	Edge_Direction getDirections();

	/**
	 * Sets the value of the '{@link graphic_representation.Edge#getDirections <em>Directions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directions</em>' containment reference.
	 * @see #getDirections()
	 * @generated
	 */
	void setDirections(Edge_Direction value);

	/**
	 * Returns the value of the '<em><b>Edge style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge style</em>' containment reference.
	 * @see #setEdge_style(Edge_Style)
	 * @see graphic_representation.Graphic_representationPackage#getEdge_Edge_style()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Edge_Style getEdge_style();

	/**
	 * Sets the value of the '{@link graphic_representation.Edge#getEdge_style <em>Edge style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge style</em>' containment reference.
	 * @see #getEdge_style()
	 * @generated
	 */
	void setEdge_style(Edge_Style value);

	/**
	 * Returns the value of the '<em><b>Edge Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Label</em>' containment reference.
	 * @see #setEdgeLabel(EdgeLabelEAttribute)
	 * @see graphic_representation.Graphic_representationPackage#getEdge_EdgeLabel()
	 * @model containment="true"
	 * @generated
	 */
	EdgeLabelEAttribute getEdgeLabel();

	/**
	 * Sets the value of the '{@link graphic_representation.Edge#getEdgeLabel <em>Edge Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Label</em>' containment reference.
	 * @see #getEdgeLabel()
	 * @generated
	 */
	void setEdgeLabel(EdgeLabelEAttribute value);

} // Edge
