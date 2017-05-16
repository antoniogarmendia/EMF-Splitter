/**
 */
package RepresentationGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rhombus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RepresentationGraph.Rhombus#getWidth <em>Width</em>}</li>
 *   <li>{@link RepresentationGraph.Rhombus#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see RepresentationGraph.RepresentationGraphPackage#getRhombus()
 * @model
 * @generated
 */
public interface Rhombus extends ContainerElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Float)
	 * @see RepresentationGraph.RepresentationGraphPackage#getRhombus_Width()
	 * @model default="5"
	 * @generated
	 */
	Float getWidth();

	/**
	 * Sets the value of the '{@link RepresentationGraph.Rhombus#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Float)
	 * @see RepresentationGraph.RepresentationGraphPackage#getRhombus_Height()
	 * @model default="5"
	 * @generated
	 */
	Float getHeight();

	/**
	 * Sets the value of the '{@link RepresentationGraph.Rhombus#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Float value);

} // Rhombus
