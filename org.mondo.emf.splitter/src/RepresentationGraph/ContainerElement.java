/**
 */
package RepresentationGraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RepresentationGraph.ContainerElement#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see RepresentationGraph.RepresentationGraphPackage#getContainerElement()
 * @model abstract="true"
 * @generated
 */
public interface ContainerElement extends NodeElement {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link RepresentationGraph.NodeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see RepresentationGraph.RepresentationGraphPackage#getContainerElement_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeElement> getContains();

} // ContainerElement
