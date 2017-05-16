/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Border#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link graphic_representation.Border#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link graphic_representation.Border#getBorderColor <em>Border Color</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getBorder()
 * @model abstract="true"
 * @generated
 */
public interface Border extends EObject {
	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' containment reference.
	 * @see #setBorderColor(Color)
	 * @see graphic_representation.Graphic_representationPackage#getBorder_BorderColor()
	 * @model containment="true"
	 * @generated
	 */
	Color getBorderColor();

	/**
	 * Sets the value of the '{@link graphic_representation.Border#getBorderColor <em>Border Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' containment reference.
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(Color value);

	/**
	 * Returns the value of the '<em><b>Border Style</b></em>' attribute.
	 * The default value is <code>"solid"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Style</em>' attribute.
	 * @see #setBorderStyle(String)
	 * @see graphic_representation.Graphic_representationPackage#getBorder_BorderStyle()
	 * @model default="solid"
	 * @generated
	 */
	String getBorderStyle();

	/**
	 * Sets the value of the '{@link graphic_representation.Border#getBorderStyle <em>Border Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Style</em>' attribute.
	 * @see #getBorderStyle()
	 * @generated
	 */
	void setBorderStyle(String value);

	/**
	 * Returns the value of the '<em><b>Border Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Width</em>' attribute.
	 * @see #setBorderWidth(String)
	 * @see graphic_representation.Graphic_representationPackage#getBorder_BorderWidth()
	 * @model default="0"
	 * @generated
	 */
	String getBorderWidth();

	/**
	 * Sets the value of the '{@link graphic_representation.Border#getBorderWidth <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Width</em>' attribute.
	 * @see #getBorderWidth()
	 * @generated
	 */
	void setBorderWidth(String value);

} // Border
