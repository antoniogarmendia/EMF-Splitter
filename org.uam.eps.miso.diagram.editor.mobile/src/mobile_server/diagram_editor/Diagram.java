/**
 */
package mobile_server.diagram_editor;

import mobile_server.Palette;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mobile_server.diagram_editor.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.Diagram#getDate <em>Date</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.Diagram#getPreviewImageString <em>Preview Image String</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.Diagram#getContent <em>Content</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.Diagram#getExtension <em>Extension</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.Diagram#getAnPalette <em>An Palette</em>}</li>
 * </ul>
 *
 * @see mobile_server.diagram_editor.Diagram_editorPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mobile_server.diagram_editor.Diagram_editorPackage#getDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mobile_server.diagram_editor.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see mobile_server.diagram_editor.Diagram_editorPackage#getDiagram_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link mobile_server.diagram_editor.Diagram#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Preview Image String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preview Image String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preview Image String</em>' attribute.
	 * @see #setPreviewImageString(String)
	 * @see mobile_server.diagram_editor.Diagram_editorPackage#getDiagram_PreviewImageString()
	 * @model
	 * @generated
	 */
	String getPreviewImageString();

	/**
	 * Sets the value of the '{@link mobile_server.diagram_editor.Diagram#getPreviewImageString <em>Preview Image String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preview Image String</em>' attribute.
	 * @see #getPreviewImageString()
	 * @generated
	 */
	void setPreviewImageString(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see mobile_server.diagram_editor.Diagram_editorPackage#getDiagram_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link mobile_server.diagram_editor.Diagram#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see mobile_server.diagram_editor.Diagram_editorPackage#getDiagram_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link mobile_server.diagram_editor.Diagram#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>An Palette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Palette</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Palette</em>' reference.
	 * @see #setAnPalette(Palette)
	 * @see mobile_server.diagram_editor.Diagram_editorPackage#getDiagram_AnPalette()
	 * @model
	 * @generated
	 */
	Palette getAnPalette();

	/**
	 * Sets the value of the '{@link mobile_server.diagram_editor.Diagram#getAnPalette <em>An Palette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An Palette</em>' reference.
	 * @see #getAnPalette()
	 * @generated
	 */
	void setAnPalette(Palette value);

} // Diagram
