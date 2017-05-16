/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.RepresentationTable#getRootTable <em>Root Table</em>}</li>
 *   <li>{@link graphic_representation.RepresentationTable#getLines <em>Lines</em>}</li>
 *   <li>{@link graphic_representation.RepresentationTable#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getRepresentationTable()
 * @model
 * @generated
 */
public interface RepresentationTable extends Representation {
	/**
	 * Returns the value of the '<em><b>Root Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Table</em>' reference.
	 * @see #setRootTable(EClass)
	 * @see graphic_representation.Graphic_representationPackage#getRepresentationTable_RootTable()
	 * @model
	 * @generated
	 */
	EClass getRootTable();

	/**
	 * Sets the value of the '{@link graphic_representation.RepresentationTable#getRootTable <em>Root Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Table</em>' reference.
	 * @see #getRootTable()
	 * @generated
	 */
	void setRootTable(EClass value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getRepresentationTable_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see graphic_representation.Graphic_representationPackage#getRepresentationTable_Columns()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getColumns();

} // RepresentationTable
