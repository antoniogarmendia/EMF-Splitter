/**
 */
package Visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Visualization.Circle#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see Visualization.VisualizationPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends Shape {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(Float)
	 * @see Visualization.VisualizationPackage#getCircle_Radius()
	 * @model
	 * @generated
	 */
	Float getRadius();

	/**
	 * Sets the value of the '{@link Visualization.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(Float value);

} // Circle
