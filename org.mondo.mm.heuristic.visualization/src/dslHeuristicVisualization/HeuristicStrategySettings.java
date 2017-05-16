/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heuristic Strategy Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_label <em>Strategy label</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_root <em>Strategy root</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_palette <em>Strategy palette</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_arcSelection <em>Strategy arc Selection</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_node_selection <em>Strategy node selection</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_possibleElements <em>Strategy possible Elements</em>}</li>
 *   <li>{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_linkcompartment <em>Strategy linkcompartment</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategySettings()
 * @model
 * @generated
 */
public interface HeuristicStrategySettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategy label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy label</em>' containment reference.
	 * @see #setStrategy_label(StrategyLabel)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategySettings_Strategy_label()
	 * @model containment="true"
	 * @generated
	 */
	StrategyLabel getStrategy_label();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_label <em>Strategy label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy label</em>' containment reference.
	 * @see #getStrategy_label()
	 * @generated
	 */
	void setStrategy_label(StrategyLabel value);

	/**
	 * Returns the value of the '<em><b>Strategy root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy root</em>' containment reference.
	 * @see #setStrategy_root(StrategyRootSelection)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategySettings_Strategy_root()
	 * @model containment="true"
	 * @generated
	 */
	StrategyRootSelection getStrategy_root();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_root <em>Strategy root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy root</em>' containment reference.
	 * @see #getStrategy_root()
	 * @generated
	 */
	void setStrategy_root(StrategyRootSelection value);

	/**
	 * Returns the value of the '<em><b>Strategy palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy palette</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy palette</em>' containment reference.
	 * @see #setStrategy_palette(StrategyPalette)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategySettings_Strategy_palette()
	 * @model containment="true"
	 * @generated
	 */
	StrategyPalette getStrategy_palette();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_palette <em>Strategy palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy palette</em>' containment reference.
	 * @see #getStrategy_palette()
	 * @generated
	 */
	void setStrategy_palette(StrategyPalette value);

	/**
	 * Returns the value of the '<em><b>Strategy arc Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy arc Selection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy arc Selection</em>' containment reference.
	 * @see #setStrategy_arcSelection(StrategyArcSelection)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategySettings_Strategy_arcSelection()
	 * @model containment="true"
	 * @generated
	 */
	StrategyArcSelection getStrategy_arcSelection();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_arcSelection <em>Strategy arc Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy arc Selection</em>' containment reference.
	 * @see #getStrategy_arcSelection()
	 * @generated
	 */
	void setStrategy_arcSelection(StrategyArcSelection value);

	/**
	 * Returns the value of the '<em><b>Strategy node selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy node selection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy node selection</em>' containment reference.
	 * @see #setStrategy_node_selection(StrategyNodeSelection)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategySettings_Strategy_node_selection()
	 * @model containment="true"
	 * @generated
	 */
	StrategyNodeSelection getStrategy_node_selection();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_node_selection <em>Strategy node selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy node selection</em>' containment reference.
	 * @see #getStrategy_node_selection()
	 * @generated
	 */
	void setStrategy_node_selection(StrategyNodeSelection value);

	/**
	 * Returns the value of the '<em><b>Strategy possible Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy possible Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy possible Elements</em>' reference.
	 * @see #setStrategy_possibleElements(StrategyPossibleElements)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategySettings_Strategy_possibleElements()
	 * @model
	 * @generated
	 */
	StrategyPossibleElements getStrategy_possibleElements();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_possibleElements <em>Strategy possible Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy possible Elements</em>' reference.
	 * @see #getStrategy_possibleElements()
	 * @generated
	 */
	void setStrategy_possibleElements(StrategyPossibleElements value);

	/**
	 * Returns the value of the '<em><b>Strategy linkcompartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy linkcompartment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy linkcompartment</em>' reference.
	 * @see #setStrategy_linkcompartment(StrategyLinkCompartment)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getHeuristicStrategySettings_Strategy_linkcompartment()
	 * @model
	 * @generated
	 */
	StrategyLinkCompartment getStrategy_linkcompartment();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.HeuristicStrategySettings#getStrategy_linkcompartment <em>Strategy linkcompartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy linkcompartment</em>' reference.
	 * @see #getStrategy_linkcompartment()
	 * @generated
	 */
	void setStrategy_linkcompartment(StrategyLinkCompartment value);

} // HeuristicStrategySettings
