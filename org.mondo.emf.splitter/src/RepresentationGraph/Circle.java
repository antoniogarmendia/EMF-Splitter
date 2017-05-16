/**
 */
package RepresentationGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RepresentationGraph.Circle#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see RepresentationGraph.RepresentationGraphPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends ContainerElement {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(Float)
	 * @see RepresentationGraph.RepresentationGraphPackage#getCircle_Radius()
	 * @model default="3"
	 * @generated
	 */
	Float getRadius();

	/**
	 * Sets the value of the '{@link RepresentationGraph.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(Float value);

} // Circle
