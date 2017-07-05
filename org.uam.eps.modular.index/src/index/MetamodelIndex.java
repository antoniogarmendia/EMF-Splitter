/**
 */
package index;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link index.MetamodelIndex#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link index.MetamodelIndex#getIndexes <em>Indexes</em>}</li>
 * </ul>
 *
 * @see index.IndexPackage#getMetamodelIndex()
 * @model
 * @generated
 */
public interface MetamodelIndex extends EObject {
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
	 * @see index.IndexPackage#getMetamodelIndex_MetaModel()
	 * @model
	 * @generated
	 */
	String getMetaModel();

	/**
	 * Sets the value of the '{@link index.MetamodelIndex#getMetaModel <em>Meta Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' attribute.
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(String value);

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link index.Index}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see index.IndexPackage#getMetamodelIndex_Indexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndexes();

} // MetamodelIndex
