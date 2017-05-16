/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.LineGroup#getListLines <em>List Lines</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getLineGroup()
 * @model
 * @generated
 */
public interface LineGroup extends Line {
	/**
	 * Returns the value of the '<em><b>List Lines</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Lines</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getLineGroup_ListLines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getListLines();

} // LineGroup
