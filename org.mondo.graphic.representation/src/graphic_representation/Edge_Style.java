/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Edge_Style#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link graphic_representation.Edge_Style#getLineWidth <em>Line Width</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getEdge_Style()
 * @model
 * @generated
 */
public interface Edge_Style extends ShapeColor {

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The default value is <code>"solid"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see #setLineStyle(String)
	 * @see graphic_representation.Graphic_representationPackage#getEdge_Style_LineStyle()
	 * @model default="solid"
	 * @generated
	 */
	String getLineStyle();

	/**
	 * Sets the value of the '{@link graphic_representation.Edge_Style#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(String value);

	/**
	 * Returns the value of the '<em><b>Line Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Width</em>' attribute.
	 * @see #setLineWidth(String)
	 * @see graphic_representation.Graphic_representationPackage#getEdge_Style_LineWidth()
	 * @model default="0"
	 * @generated
	 */
	String getLineWidth();

	/**
	 * Sets the value of the '{@link graphic_representation.Edge_Style#getLineWidth <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Width</em>' attribute.
	 * @see #getLineWidth()
	 * @generated
	 */
	void setLineWidth(String value);
} // Edge_Style
