/**
 */
package visibility;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Visibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link visibility.MetamodelVisibility#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link visibility.MetamodelVisibility#getVisibilityRules <em>Visibility Rules</em>}</li>
 * </ul>
 *
 * @see visibility.VisibilityPackage#getMetamodelVisibility()
 * @model
 * @generated
 */
public interface MetamodelVisibility extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model</em>' attribute.
	 * @see #setMetaModel(String)
	 * @see visibility.VisibilityPackage#getMetamodelVisibility_MetaModel()
	 * @model
	 * @generated
	 */
	String getMetaModel();

	/**
	 * Sets the value of the '{@link visibility.MetamodelVisibility#getMetaModel <em>Meta Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' attribute.
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(String value);

	/**
	 * Returns the value of the '<em><b>Visibility Rules</b></em>' containment reference list.
	 * The list contents are of type {@link visibility.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Rules</em>' containment reference list.
	 * @see visibility.VisibilityPackage#getMetamodelVisibility_VisibilityRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Visibility> getVisibilityRules();

} // MetamodelVisibility
