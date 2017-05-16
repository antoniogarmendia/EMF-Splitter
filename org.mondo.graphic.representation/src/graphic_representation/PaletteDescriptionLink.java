/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Palette Description Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.PaletteDescriptionLink#getSourceDecoratorName <em>Source Decorator Name</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getPaletteDescriptionLink()
 * @model
 * @generated
 */
public interface PaletteDescriptionLink extends PaletteDescription, Link, Edge_Style {

	/**
	 * Returns the value of the '<em><b>Source Decorator Name</b></em>' attribute.
	 * The default value is <code>"NoDecoration"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Decorator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Decorator Name</em>' attribute.
	 * @see #setSourceDecoratorName(String)
	 * @see graphic_representation.Graphic_representationPackage#getPaletteDescriptionLink_SourceDecoratorName()
	 * @model default="NoDecoration"
	 * @generated
	 */
	String getSourceDecoratorName();

	/**
	 * Sets the value of the '{@link graphic_representation.PaletteDescriptionLink#getSourceDecoratorName <em>Source Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Decorator Name</em>' attribute.
	 * @see #getSourceDecoratorName()
	 * @generated
	 */
	void setSourceDecoratorName(String value);
} // PaletteDescriptionLink
