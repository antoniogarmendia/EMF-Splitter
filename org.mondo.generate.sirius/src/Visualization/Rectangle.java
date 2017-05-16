/**
 */
package Visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Visualization.Rectangle#getWidth <em>Width</em>}</li>
 *   <li>{@link Visualization.Rectangle#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see Visualization.VisualizationPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends Shape {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Float)
	 * @see Visualization.VisualizationPackage#getRectangle_Width()
	 * @model
	 * @generated
	 */
	Float getWidth();

	/**
	 * Sets the value of the '{@link Visualization.Rectangle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Float)
	 * @see Visualization.VisualizationPackage#getRectangle_Height()
	 * @model
	 * @generated
	 */
	Float getHeight();

	/**
	 * Sets the value of the '{@link Visualization.Rectangle#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Float value);

} // Rectangle
