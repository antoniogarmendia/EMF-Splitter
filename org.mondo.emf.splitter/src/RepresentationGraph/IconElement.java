/**
 */
package RepresentationGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RepresentationGraph.IconElement#getFilepath <em>Filepath</em>}</li>
 * </ul>
 *
 * @see RepresentationGraph.RepresentationGraphPackage#getIconElement()
 * @model
 * @generated
 */
public interface IconElement extends NodeElement {
	/**
	 * Returns the value of the '<em><b>Filepath</b></em>' attribute.
	 * The default value is <code>"path"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filepath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filepath</em>' attribute.
	 * @see #setFilepath(String)
	 * @see RepresentationGraph.RepresentationGraphPackage#getIconElement_Filepath()
	 * @model default="path"
	 * @generated
	 */
	String getFilepath();

	/**
	 * Sets the value of the '{@link RepresentationGraph.IconElement#getFilepath <em>Filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filepath</em>' attribute.
	 * @see #getFilepath()
	 * @generated
	 */
	void setFilepath(String value);

} // IconElement
