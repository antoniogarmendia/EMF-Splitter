/**
 */
package mobile_server.diagram_editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mobile_server.diagram_editor.JSONDiagram#getList_diagrams <em>List diagrams</em>}</li>
 * </ul>
 *
 * @see mobile_server.diagram_editor.Diagram_editorPackage#getJSONDiagram()
 * @model
 * @generated
 */
public interface JSONDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>List diagrams</b></em>' reference list.
	 * The list contents are of type {@link mobile_server.diagram_editor.Diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List diagrams</em>' reference list.
	 * @see mobile_server.diagram_editor.Diagram_editorPackage#getJSONDiagram_List_diagrams()
	 * @model
	 * @generated
	 */
	EList<Diagram> getList_diagrams();

} // JSONDiagram
