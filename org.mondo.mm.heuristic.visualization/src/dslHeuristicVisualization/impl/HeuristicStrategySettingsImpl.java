/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.HeuristicStrategySettings;
import dslHeuristicVisualization.StrategyArcSelection;
import dslHeuristicVisualization.StrategyLabel;
import dslHeuristicVisualization.StrategyLinkCompartment;
import dslHeuristicVisualization.StrategyNodeSelection;
import dslHeuristicVisualization.StrategyPalette;
import dslHeuristicVisualization.StrategyPossibleElements;
import dslHeuristicVisualization.StrategyRootSelection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heuristic Strategy Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl#getStrategy_label <em>Strategy label</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl#getStrategy_root <em>Strategy root</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl#getStrategy_palette <em>Strategy palette</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl#getStrategy_arcSelection <em>Strategy arc Selection</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl#getStrategy_node_selection <em>Strategy node selection</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl#getStrategy_possibleElements <em>Strategy possible Elements</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategySettingsImpl#getStrategy_linkcompartment <em>Strategy linkcompartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeuristicStrategySettingsImpl extends MinimalEObjectImpl.Container implements HeuristicStrategySettings {
	/**
	 * The cached value of the '{@link #getStrategy_label() <em>Strategy label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy_label()
	 * @generated
	 * @ordered
	 */
	protected StrategyLabel strategy_label;

	/**
	 * The cached value of the '{@link #getStrategy_root() <em>Strategy root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy_root()
	 * @generated
	 * @ordered
	 */
	protected StrategyRootSelection strategy_root;

	/**
	 * The cached value of the '{@link #getStrategy_palette() <em>Strategy palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy_palette()
	 * @generated
	 * @ordered
	 */
	protected StrategyPalette strategy_palette;

	/**
	 * The cached value of the '{@link #getStrategy_arcSelection() <em>Strategy arc Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy_arcSelection()
	 * @generated
	 * @ordered
	 */
	protected StrategyArcSelection strategy_arcSelection;

	/**
	 * The cached value of the '{@link #getStrategy_node_selection() <em>Strategy node selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy_node_selection()
	 * @generated
	 * @ordered
	 */
	protected StrategyNodeSelection strategy_node_selection;

	/**
	 * The cached value of the '{@link #getStrategy_possibleElements() <em>Strategy possible Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy_possibleElements()
	 * @generated
	 * @ordered
	 */
	protected StrategyPossibleElements strategy_possibleElements;

	/**
	 * The cached value of the '{@link #getStrategy_linkcompartment() <em>Strategy linkcompartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy_linkcompartment()
	 * @generated
	 * @ordered
	 */
	protected StrategyLinkCompartment strategy_linkcompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected HeuristicStrategySettingsImpl() {
		super();
		//Default Strategies
		strategy_root = new ConcreteStrategyNoParentImpl();
		strategy_possibleElements = new ConcreteStrategyContainmentDiagramElementImpl();
		strategy_node_selection = new ConcreteStrategyDefaultNodeSelectionImpl();
		strategy_arcSelection = new ConcreteStrategyArcSelectionImpl();
		strategy_label = new ConcreteStrategyLabelFirstStringImpl();
		strategy_palette = new ConcreteStrategyPaletteImpl();
		strategy_linkcompartment = new ConcreteContainmentasLinksImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.HEURISTIC_STRATEGY_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyLabel getStrategy_label() {
		return strategy_label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy_label(StrategyLabel newStrategy_label, NotificationChain msgs) {
		StrategyLabel oldStrategy_label = strategy_label;
		strategy_label = newStrategy_label;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL, oldStrategy_label, newStrategy_label);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy_label(StrategyLabel newStrategy_label) {
		if (newStrategy_label != strategy_label) {
			NotificationChain msgs = null;
			if (strategy_label != null)
				msgs = ((InternalEObject)strategy_label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL, null, msgs);
			if (newStrategy_label != null)
				msgs = ((InternalEObject)newStrategy_label).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL, null, msgs);
			msgs = basicSetStrategy_label(newStrategy_label, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL, newStrategy_label, newStrategy_label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyRootSelection getStrategy_root() {
		return strategy_root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy_root(StrategyRootSelection newStrategy_root, NotificationChain msgs) {
		StrategyRootSelection oldStrategy_root = strategy_root;
		strategy_root = newStrategy_root;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT, oldStrategy_root, newStrategy_root);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy_root(StrategyRootSelection newStrategy_root) {
		if (newStrategy_root != strategy_root) {
			NotificationChain msgs = null;
			if (strategy_root != null)
				msgs = ((InternalEObject)strategy_root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT, null, msgs);
			if (newStrategy_root != null)
				msgs = ((InternalEObject)newStrategy_root).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT, null, msgs);
			msgs = basicSetStrategy_root(newStrategy_root, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT, newStrategy_root, newStrategy_root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyPalette getStrategy_palette() {
		return strategy_palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy_palette(StrategyPalette newStrategy_palette, NotificationChain msgs) {
		StrategyPalette oldStrategy_palette = strategy_palette;
		strategy_palette = newStrategy_palette;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE, oldStrategy_palette, newStrategy_palette);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy_palette(StrategyPalette newStrategy_palette) {
		if (newStrategy_palette != strategy_palette) {
			NotificationChain msgs = null;
			if (strategy_palette != null)
				msgs = ((InternalEObject)strategy_palette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE, null, msgs);
			if (newStrategy_palette != null)
				msgs = ((InternalEObject)newStrategy_palette).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE, null, msgs);
			msgs = basicSetStrategy_palette(newStrategy_palette, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE, newStrategy_palette, newStrategy_palette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyArcSelection getStrategy_arcSelection() {
		return strategy_arcSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy_arcSelection(StrategyArcSelection newStrategy_arcSelection, NotificationChain msgs) {
		StrategyArcSelection oldStrategy_arcSelection = strategy_arcSelection;
		strategy_arcSelection = newStrategy_arcSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION, oldStrategy_arcSelection, newStrategy_arcSelection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy_arcSelection(StrategyArcSelection newStrategy_arcSelection) {
		if (newStrategy_arcSelection != strategy_arcSelection) {
			NotificationChain msgs = null;
			if (strategy_arcSelection != null)
				msgs = ((InternalEObject)strategy_arcSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION, null, msgs);
			if (newStrategy_arcSelection != null)
				msgs = ((InternalEObject)newStrategy_arcSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION, null, msgs);
			msgs = basicSetStrategy_arcSelection(newStrategy_arcSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION, newStrategy_arcSelection, newStrategy_arcSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyNodeSelection getStrategy_node_selection() {
		return strategy_node_selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy_node_selection(StrategyNodeSelection newStrategy_node_selection, NotificationChain msgs) {
		StrategyNodeSelection oldStrategy_node_selection = strategy_node_selection;
		strategy_node_selection = newStrategy_node_selection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION, oldStrategy_node_selection, newStrategy_node_selection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy_node_selection(StrategyNodeSelection newStrategy_node_selection) {
		if (newStrategy_node_selection != strategy_node_selection) {
			NotificationChain msgs = null;
			if (strategy_node_selection != null)
				msgs = ((InternalEObject)strategy_node_selection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION, null, msgs);
			if (newStrategy_node_selection != null)
				msgs = ((InternalEObject)newStrategy_node_selection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION, null, msgs);
			msgs = basicSetStrategy_node_selection(newStrategy_node_selection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION, newStrategy_node_selection, newStrategy_node_selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyPossibleElements getStrategy_possibleElements() {
		if (strategy_possibleElements != null && strategy_possibleElements.eIsProxy()) {
			InternalEObject oldStrategy_possibleElements = (InternalEObject)strategy_possibleElements;
			strategy_possibleElements = (StrategyPossibleElements)eResolveProxy(oldStrategy_possibleElements);
			if (strategy_possibleElements != oldStrategy_possibleElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_POSSIBLE_ELEMENTS, oldStrategy_possibleElements, strategy_possibleElements));
			}
		}
		return strategy_possibleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyPossibleElements basicGetStrategy_possibleElements() {
		return strategy_possibleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy_possibleElements(StrategyPossibleElements newStrategy_possibleElements) {
		StrategyPossibleElements oldStrategy_possibleElements = strategy_possibleElements;
		strategy_possibleElements = newStrategy_possibleElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_POSSIBLE_ELEMENTS, oldStrategy_possibleElements, strategy_possibleElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyLinkCompartment getStrategy_linkcompartment() {
		if (strategy_linkcompartment != null && strategy_linkcompartment.eIsProxy()) {
			InternalEObject oldStrategy_linkcompartment = (InternalEObject)strategy_linkcompartment;
			strategy_linkcompartment = (StrategyLinkCompartment)eResolveProxy(oldStrategy_linkcompartment);
			if (strategy_linkcompartment != oldStrategy_linkcompartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LINKCOMPARTMENT, oldStrategy_linkcompartment, strategy_linkcompartment));
			}
		}
		return strategy_linkcompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyLinkCompartment basicGetStrategy_linkcompartment() {
		return strategy_linkcompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy_linkcompartment(StrategyLinkCompartment newStrategy_linkcompartment) {
		StrategyLinkCompartment oldStrategy_linkcompartment = strategy_linkcompartment;
		strategy_linkcompartment = newStrategy_linkcompartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LINKCOMPARTMENT, oldStrategy_linkcompartment, strategy_linkcompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL:
				return basicSetStrategy_label(null, msgs);
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT:
				return basicSetStrategy_root(null, msgs);
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE:
				return basicSetStrategy_palette(null, msgs);
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION:
				return basicSetStrategy_arcSelection(null, msgs);
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION:
				return basicSetStrategy_node_selection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL:
				return getStrategy_label();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT:
				return getStrategy_root();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE:
				return getStrategy_palette();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION:
				return getStrategy_arcSelection();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION:
				return getStrategy_node_selection();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_POSSIBLE_ELEMENTS:
				if (resolve) return getStrategy_possibleElements();
				return basicGetStrategy_possibleElements();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LINKCOMPARTMENT:
				if (resolve) return getStrategy_linkcompartment();
				return basicGetStrategy_linkcompartment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL:
				setStrategy_label((StrategyLabel)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT:
				setStrategy_root((StrategyRootSelection)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE:
				setStrategy_palette((StrategyPalette)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION:
				setStrategy_arcSelection((StrategyArcSelection)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION:
				setStrategy_node_selection((StrategyNodeSelection)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_POSSIBLE_ELEMENTS:
				setStrategy_possibleElements((StrategyPossibleElements)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LINKCOMPARTMENT:
				setStrategy_linkcompartment((StrategyLinkCompartment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL:
				setStrategy_label((StrategyLabel)null);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT:
				setStrategy_root((StrategyRootSelection)null);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE:
				setStrategy_palette((StrategyPalette)null);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION:
				setStrategy_arcSelection((StrategyArcSelection)null);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION:
				setStrategy_node_selection((StrategyNodeSelection)null);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_POSSIBLE_ELEMENTS:
				setStrategy_possibleElements((StrategyPossibleElements)null);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LINKCOMPARTMENT:
				setStrategy_linkcompartment((StrategyLinkCompartment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LABEL:
				return strategy_label != null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ROOT:
				return strategy_root != null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_PALETTE:
				return strategy_palette != null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_ARC_SELECTION:
				return strategy_arcSelection != null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_NODE_SELECTION:
				return strategy_node_selection != null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_POSSIBLE_ELEMENTS:
				return strategy_possibleElements != null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY_SETTINGS__STRATEGY_LINKCOMPARTMENT:
				return strategy_linkcompartment != null;
		}
		return super.eIsSet(featureID);
	}

} //HeuristicStrategySettingsImpl
