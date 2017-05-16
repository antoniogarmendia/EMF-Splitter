/**
 */
package RepresentationGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RepresentationGraph.EdgeElement#getSource <em>Source</em>}</li>
 *   <li>{@link RepresentationGraph.EdgeElement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see RepresentationGraph.RepresentationGraphPackage#getEdgeElement()
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
	 * @see RepresentationGraph.RepresentationGraphPackage#getEdgeElement_Source()
	 * @model required="true"
	 * @generated
	 */
	NodeElement getSource();

	/**
	 * Sets the value of the '{@link RepresentationGraph.EdgeElement#getSource <em>Source</em>}' reference.
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
	 * @see RepresentationGraph.RepresentationGraphPackage#getEdgeElement_Target()
	 * @model required="true"
	 * @generated
	 */
	NodeElement getTarget();

	/**
	 * Sets the value of the '{@link RepresentationGraph.EdgeElement#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NodeElement value);

} // EdgeElement
