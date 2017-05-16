/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.HeuristicStrategySettings;
import dslHeuristicVisualization.RepreHeurSS;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repre Heur SS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.RepreHeurSSImpl#getHeuristicStrategySettings <em>Heuristic Strategy Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepreHeurSSImpl extends MinimalEObjectImpl.Container implements RepreHeurSS {
	/**
	 * The cached value of the '{@link #getHeuristicStrategySettings() <em>Heuristic Strategy Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeuristicStrategySettings()
	 * @generated
	 * @ordered
	 */
	protected EList<HeuristicStrategySettings> heuristicStrategySettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepreHeurSSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.REPRE_HEUR_SS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeuristicStrategySettings> getHeuristicStrategySettings() {
		if (heuristicStrategySettings == null) {
			heuristicStrategySettings = new EObjectContainmentEList<HeuristicStrategySettings>(HeuristicStrategySettings.class, this, DslHeuristicVisualizationPackage.REPRE_HEUR_SS__HEURISTIC_STRATEGY_SETTINGS);
		}
		return heuristicStrategySettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.REPRE_HEUR_SS__HEURISTIC_STRATEGY_SETTINGS:
				return ((InternalEList<?>)getHeuristicStrategySettings()).basicRemove(otherEnd, msgs);
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
			case DslHeuristicVisualizationPackage.REPRE_HEUR_SS__HEURISTIC_STRATEGY_SETTINGS:
				return getHeuristicStrategySettings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.REPRE_HEUR_SS__HEURISTIC_STRATEGY_SETTINGS:
				getHeuristicStrategySettings().clear();
				getHeuristicStrategySettings().addAll((Collection<? extends HeuristicStrategySettings>)newValue);
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
			case DslHeuristicVisualizationPackage.REPRE_HEUR_SS__HEURISTIC_STRATEGY_SETTINGS:
				getHeuristicStrategySettings().clear();
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
			case DslHeuristicVisualizationPackage.REPRE_HEUR_SS__HEURISTIC_STRATEGY_SETTINGS:
				return heuristicStrategySettings != null && !heuristicStrategySettings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepreHeurSSImpl
