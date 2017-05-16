/**
 */
package Modularity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Modularity.Unit#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see Modularity.ModularityPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends Containee, IdentificableElement {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * The default value is <code>"figure"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see Modularity.ModularityPackage#getUnit_Extension()
	 * @model default="figure" required="true"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link Modularity.Unit#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

} // Unit
