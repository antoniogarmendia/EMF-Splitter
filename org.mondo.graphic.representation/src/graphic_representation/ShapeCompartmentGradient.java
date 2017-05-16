/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Compartment Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.ShapeCompartmentGradient#getWidth <em>Width</em>}</li>
 *   <li>{@link graphic_representation.ShapeCompartmentGradient#getHeight <em>Height</em>}</li>
 *   <li>{@link graphic_representation.ShapeCompartmentGradient#getCornerHeight <em>Corner Height</em>}</li>
 *   <li>{@link graphic_representation.ShapeCompartmentGradient#getCornerWidth <em>Corner Width</em>}</li>
 *   <li>{@link graphic_representation.ShapeCompartmentGradient#getForeGroundColor <em>Fore Ground Color</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getShapeCompartmentGradient()
 * @model
 * @generated
 */
public interface ShapeCompartmentGradient extends Shape, ShapeColor, Border {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Integer)
	 * @see graphic_representation.Graphic_representationPackage#getShapeCompartmentGradient_Width()
	 * @model default="10"
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link graphic_representation.ShapeCompartmentGradient#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Integer)
	 * @see graphic_representation.Graphic_representationPackage#getShapeCompartmentGradient_Height()
	 * @model default="10"
	 * @generated
	 */
	Integer getHeight();

	/**
	 * Sets the value of the '{@link graphic_representation.ShapeCompartmentGradient#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Corner Height</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner Height</em>' attribute.
	 * @see #setCornerHeight(Integer)
	 * @see graphic_representation.Graphic_representationPackage#getShapeCompartmentGradient_CornerHeight()
	 * @model default="10"
	 * @generated
	 */
	Integer getCornerHeight();

	/**
	 * Sets the value of the '{@link graphic_representation.ShapeCompartmentGradient#getCornerHeight <em>Corner Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner Height</em>' attribute.
	 * @see #getCornerHeight()
	 * @generated
	 */
	void setCornerHeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Corner Width</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner Width</em>' attribute.
	 * @see #setCornerWidth(Integer)
	 * @see graphic_representation.Graphic_representationPackage#getShapeCompartmentGradient_CornerWidth()
	 * @model default="10"
	 * @generated
	 */
	Integer getCornerWidth();

	/**
	 * Sets the value of the '{@link graphic_representation.ShapeCompartmentGradient#getCornerWidth <em>Corner Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner Width</em>' attribute.
	 * @see #getCornerWidth()
	 * @generated
	 */
	void setCornerWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Fore Ground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fore Ground Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fore Ground Color</em>' containment reference.
	 * @see #setForeGroundColor(Color)
	 * @see graphic_representation.Graphic_representationPackage#getShapeCompartmentGradient_ForeGroundColor()
	 * @model containment="true"
	 * @generated
	 */
	Color getForeGroundColor();

	/**
	 * Sets the value of the '{@link graphic_representation.ShapeCompartmentGradient#getForeGroundColor <em>Fore Ground Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fore Ground Color</em>' containment reference.
	 * @see #getForeGroundColor()
	 * @generated
	 */
	void setForeGroundColor(Color value);

} // ShapeCompartmentGradient
