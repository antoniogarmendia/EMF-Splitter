/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteContainmentasAffixed;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Containmentas Affixed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.ConcreteContainmentasAffixedImpl#getListLinks <em>List Links</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.ConcreteContainmentasAffixedImpl#getListCompartment <em>List Compartment</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.ConcreteContainmentasAffixedImpl#getListAffixed <em>List Affixed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteContainmentasAffixedImpl extends MinimalEObjectImpl.Container implements ConcreteContainmentasAffixed {
	/**
	 * The cached value of the '{@link #getListLinks() <em>List Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> listLinks;

	/**
	 * The cached value of the '{@link #getListCompartment() <em>List Compartment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListCompartment()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> listCompartment;

	/**
	 * The cached value of the '{@link #getListAffixed() <em>List Affixed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAffixed()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> listAffixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteContainmentasAffixedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_CONTAINMENTAS_AFFIXED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getListLinks() {
		if (listLinks == null) {
			listLinks = new EObjectResolvingEList<EReference>(EReference.class, this, DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_LINKS);
		}
		return listLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getListCompartment() {
		if (listCompartment == null) {
			listCompartment = new EObjectResolvingEList<EReference>(EReference.class, this, DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_COMPARTMENT);
		}
		return listCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getListAffixed() {
		if (listAffixed == null) {
			listAffixed = new EObjectResolvingEList<EReference>(EReference.class, this, DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_AFFIXED);
		}
		return listAffixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ExecuteLinkCompartmentsHeuristics(EClass anEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		listLinks = new BasicEList<EReference>();
		listAffixed = new BasicEList<EReference>();
		EList<EReference> list_ref = anEClass.getEAllReferences();
		int count = list_ref.size();
		EReference ref = null;
		for (int i = 0; i < count; i++) {
			ref = list_ref.get(i);
			if(ref.isContainment())
				listAffixed.add(ref);
			else if(ref.getEOpposite()==null)
				listLinks.add(ref);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_LINKS:
				return getListLinks();
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_COMPARTMENT:
				return getListCompartment();
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_AFFIXED:
				return getListAffixed();
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
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_LINKS:
				getListLinks().clear();
				getListLinks().addAll((Collection<? extends EReference>)newValue);
				return;
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_COMPARTMENT:
				getListCompartment().clear();
				getListCompartment().addAll((Collection<? extends EReference>)newValue);
				return;
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_AFFIXED:
				getListAffixed().clear();
				getListAffixed().addAll((Collection<? extends EReference>)newValue);
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
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_LINKS:
				getListLinks().clear();
				return;
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_COMPARTMENT:
				getListCompartment().clear();
				return;
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_AFFIXED:
				getListAffixed().clear();
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
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_LINKS:
				return listLinks != null && !listLinks.isEmpty();
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_COMPARTMENT:
				return listCompartment != null && !listCompartment.isEmpty();
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED__LIST_AFFIXED:
				return listAffixed != null && !listAffixed.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslHeuristicVisualizationPackage.CONCRETE_CONTAINMENTAS_AFFIXED___EXECUTE_LINK_COMPARTMENTS_HEURISTICS__ECLASS:
				ExecuteLinkCompartmentsHeuristics((EClass)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteContainmentasAffixedImpl
