/**
 */
package Visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Visualization.EdgeElement#getSource <em>Source</em>}</li>
 *   <li>{@link Visualization.EdgeElement#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see Visualization.VisualizationPackage#getEdgeElement()
 * @model
 * @generated
 */
public interface EdgeElement extends GraphicElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NodeElement)
	 * @see Visualization.VisualizationPackage#getEdgeElement_Source()
	 * @model
	 * @generated
	 */
	NodeElement getSource();

	/**
	 * Sets the value of the '{@link Visualization.EdgeElement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NodeElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NodeElement)
	 * @see Visualization.VisualizationPackage#getEdgeElement_Target()
	 * @model
	 * @generated
	 */
	NodeElement getTarget();

	/**
	 * Sets the value of the '{@link Visualization.EdgeElement#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NodeElement value);

} // EdgeElement
