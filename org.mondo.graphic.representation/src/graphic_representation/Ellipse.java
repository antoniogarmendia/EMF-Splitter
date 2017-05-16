/**
 */
package graphic_representation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Ellipse#getHorizontalDiameter <em>Horizontal Diameter</em>}</li>
 *   <li>{@link graphic_representation.Ellipse#getVerticalDiameter <em>Vertical Diameter</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getEllipse()
 * @model
 * @generated
 */
public interface Ellipse extends Shape, ShapeColor, Border {
	/**
	 * Returns the value of the '<em><b>Horizontal Diameter</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Diameter</em>' attribute.
	 * @see #setHorizontalDiameter(Integer)
	 * @see graphic_representation.Graphic_representationPackage#getEllipse_HorizontalDiameter()
	 * @model default="3"
	 * @generated
	 */
	Integer getHorizontalDiameter();

	/**
	 * Sets the value of the '{@link graphic_representation.Ellipse#getHorizontalDiameter <em>Horizontal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Diameter</em>' attribute.
	 * @see #getHorizontalDiameter()
	 * @generated
	 */
	void setHorizontalDiameter(Integer value);

	/**
	 * Returns the value of the '<em><b>Vertical Diameter</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Diameter</em>' attribute.
	 * @see #setVerticalDiameter(Integer)
	 * @see graphic_representation.Graphic_representationPackage#getEllipse_VerticalDiameter()
	 * @model default="3"
	 * @generated
	 */
	Integer getVerticalDiameter();

	/**
	 * Sets the value of the '{@link graphic_representation.Ellipse#getVerticalDiameter <em>Vertical Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Diameter</em>' attribute.
	 * @see #getVerticalDiameter()
	 * @generated
	 */
	void setVerticalDiameter(Integer value);

} // Ellipse
