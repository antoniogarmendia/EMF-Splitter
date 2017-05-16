/**
 */
package mobile_server;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Mobile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mobile_server.JSONMobile#getListEcores <em>List Ecores</em>}</li>
 * </ul>
 *
 * @see mobile_server.Mobile_serverPackage#getJSONMobile()
 * @model
 * @generated
 */
public interface JSONMobile extends EObject {
	/**
	 * Returns the value of the '<em><b>List Ecores</b></em>' containment reference list.
	 * The list contents are of type {@link mobile_server.EcoreMD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Ecores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Ecores</em>' containment reference list.
	 * @see mobile_server.Mobile_serverPackage#getJSONMobile_ListEcores()
	 * @model containment="true"
	 * @generated
	 */
	EList<EcoreMD> getListEcores();

} // JSONMobile
