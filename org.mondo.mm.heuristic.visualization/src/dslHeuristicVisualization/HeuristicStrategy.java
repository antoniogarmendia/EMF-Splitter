/**
 */
package dslHeuristicVisualization;

import graphic_representation.GraphicRepresentation;
import graphic_representation.Node;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import splitterLibrary.EcoreEMF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heuristic Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategy#getGraphic_representation <em>Graphic representation</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategy#getNemf <em>Nemf</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategy#getEcoreContainment <em>Ecore Containment</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategy#getCurrentRepresentation <em>Current Representation</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategy#getCurrentMMGR <em>Current MMGR</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategy#getListRepresentation <em>List Representation</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategy()
 * @model
 * @generated
 */
public interface HeuristicStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Graphic representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphic representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic representation</em>' containment reference.
	 * @see #setGraphic_representation(GraphicRepresentation)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategy_Graphic_representation()
	 * @model containment="true"
	 * @generated
	 */
	GraphicRepresentation getGraphic_representation();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategy#getGraphic_representation <em>Graphic representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic representation</em>' containment reference.
	 * @see #getGraphic_representation()
	 * @generated
	 */
	void setGraphic_representation(GraphicRepresentation value);

	/**
	 * Returns the value of the '<em><b>Nemf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nemf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nemf</em>' reference.
	 * @see #setNemf(EcoreEMF)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategy_Nemf()
	 * @model
	 * @generated
	 */
	EcoreEMF getNemf();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategy#getNemf <em>Nemf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nemf</em>' reference.
	 * @see #getNemf()
	 * @generated
	 */
	void setNemf(EcoreEMF value);

	/**
	 * Returns the value of the '<em><b>Ecore Containment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Containment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Containment</em>' reference.
	 * @see #setEcoreContainment(EcoreMatrixContainment)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategy_EcoreContainment()
	 * @model
	 * @generated
	 */
	EcoreMatrixContainment getEcoreContainment();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategy#getEcoreContainment <em>Ecore Containment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Containment</em>' reference.
	 * @see #getEcoreContainment()
	 * @generated
	 */
	void setEcoreContainment(EcoreMatrixContainment value);

	/**
	 * Returns the value of the '<em><b>Current Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Representation</em>' attribute.
	 * @see #setCurrentRepresentation(Integer)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategy_CurrentRepresentation()
	 * @model
	 * @generated
	 */
	Integer getCurrentRepresentation();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategy#getCurrentRepresentation <em>Current Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Representation</em>' attribute.
	 * @see #getCurrentRepresentation()
	 * @generated
	 */
	void setCurrentRepresentation(Integer value);

	/**
	 * Returns the value of the '<em><b>Current MMGR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current MMGR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current MMGR</em>' attribute.
	 * @see #setCurrentMMGR(Integer)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategy_CurrentMMGR()
	 * @model
	 * @generated
	 */
	Integer getCurrentMMGR();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategy#getCurrentMMGR <em>Current MMGR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current MMGR</em>' attribute.
	 * @see #getCurrentMMGR()
	 * @generated
	 */
	void setCurrentMMGR(Integer value);

	/**
	 * Returns the value of the '<em><b>List Representation</b></em>' containment reference list.
	 * The list contents are of type {@link dslHeuristicVisualization.RepreHeurSS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Representation</em>' containment reference list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategy_ListRepresentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepreHeurSS> getListRepresentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ExecuteHeuristics();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Execute_Root_Element();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Execute_Graphical_Elements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EReference GetFeatureName(EClass parentEClass, EClass childEClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Node> GetEListEClassfromEReference(EReference anEReference);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ExecuteDirectPathMatrix();

} // HeuristicStrategy
