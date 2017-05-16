/**
 */
package Visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Visualization.NodeElement#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see Visualization.VisualizationPackage#getNodeElement()
 * @model
 * @generated
 */
public interface NodeElement extends GraphicElement {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(NodeElement)
	 * @see Visualization.VisualizationPackage#getNodeElement_Link()
	 * @model
	 * @generated
	 */
	NodeElement getLink();

	/**
	 * Sets the value of the '{@link Visualization.NodeElement#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(NodeElement value);

} // NodeElement
