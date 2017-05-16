/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Compartment Parallelogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.ShapeCompartmentParallelogram#getWidth <em>Width</em>}</li>
 *   <li>{@link graphic_representation.ShapeCompartmentParallelogram#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getShapeCompartmentParallelogram()
 * @model
 * @generated
 */
public interface ShapeCompartmentParallelogram extends Shape, ShapeColor, Border {
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
	 * @see graphic_representation.Graphic_representationPackage#getShapeCompartmentParallelogram_Width()
	 * @model default="10"
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link graphic_representation.ShapeCompartmentParallelogram#getWidth <em>Width</em>}' attribute.
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
	 * @see graphic_representation.Graphic_representationPackage#getShapeCompartmentParallelogram_Height()
	 * @model default="10"
	 * @generated
	 */
	Integer getHeight();

	/**
	 * Sets the value of the '{@link graphic_representation.ShapeCompartmentParallelogram#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Integer value);

} // ShapeCompartmentParallelogram
