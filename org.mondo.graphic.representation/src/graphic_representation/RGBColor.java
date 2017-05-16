/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RGB Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.RGBColor#getRed <em>Red</em>}</li>
 *   <li>{@link graphic_representation.RGBColor#getGreen <em>Green</em>}</li>
 *   <li>{@link graphic_representation.RGBColor#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getRGBColor()
 * @model
 * @generated
 */
public interface RGBColor extends GRUserColor, RGBColorDescription {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(int)
	 * @see graphic_representation.Graphic_representationPackage#getRGBColor_Red()
	 * @model required="true"
	 * @generated
	 */
	int getRed();

	/**
	 * Sets the value of the '{@link graphic_representation.RGBColor#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(int value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(int)
	 * @see graphic_representation.Graphic_representationPackage#getRGBColor_Green()
	 * @model required="true"
	 * @generated
	 */
	int getGreen();

	/**
	 * Sets the value of the '{@link graphic_representation.RGBColor#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(int value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(int)
	 * @see graphic_representation.Graphic_representationPackage#getRGBColor_Blue()
	 * @model required="true"
	 * @generated
	 */
	int getBlue();

	/**
	 * Sets the value of the '{@link graphic_representation.RGBColor#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(int value);

} // RGBColor
