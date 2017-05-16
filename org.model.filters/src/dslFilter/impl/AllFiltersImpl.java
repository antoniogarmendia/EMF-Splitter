/**
 */
package dslFilter.impl;

import dslFilter.AllFilters;
import dslFilter.DslFilterPackage;
import dslFilter.FilterGroup;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Filters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.AllFiltersImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link dslFilter.impl.AllFiltersImpl#getGroupfilters <em>Groupfilters</em>}</li>
 *   <li>{@link dslFilter.impl.AllFiltersImpl#getModelURI <em>Model URI</em>}</li>
 *   <li>{@link dslFilter.impl.AllFiltersImpl#getList_EClasses <em>List EClasses</em>}</li>
 *   <li>{@link dslFilter.impl.AllFiltersImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllFiltersImpl extends MinimalEObjectImpl.Container implements AllFilters {
	/**
	 * The default value of the '{@link #isNegative() <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegative() <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegative()
	 * @generated
	 * @ordered
	 */
	protected boolean negative = NEGATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroupfilters() <em>Groupfilters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupfilters()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterGroup> groupfilters;

	/**
	 * The default value of the '{@link #getModelURI() <em>Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelURI() <em>Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelURI()
	 * @generated
	 * @ordered
	 */
	protected String modelURI = MODEL_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getList_EClasses() <em>List EClasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList_EClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> list_EClasses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllFiltersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.ALL_FILTERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegative() {
		return negative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegative(boolean newNegative) {
		boolean oldNegative = negative;
		negative = newNegative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.ALL_FILTERS__NEGATIVE, oldNegative, negative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterGroup> getGroupfilters() {
		if (groupfilters == null) {
			groupfilters = new EObjectContainmentEList<FilterGroup>(FilterGroup.class, this, DslFilterPackage.ALL_FILTERS__GROUPFILTERS);
		}
		return groupfilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelURI() {
		return modelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelURI(String newModelURI) {
		String oldModelURI = modelURI;
		modelURI = newModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.ALL_FILTERS__MODEL_URI, oldModelURI, modelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EClass> getList_EClasses() {
		if (list_EClasses == null) {
			list_EClasses = new EObjectResolvingEList<EClass>(EClass.class, this, DslFilterPackage.ALL_FILTERS__LIST_ECLASSES);
		}
		return list_EClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.ALL_FILTERS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean Execute(TreeIterator<EObject> tree) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EObject anEObject = null;
		while(tree.hasNext()){
			anEObject = tree.next();
			for (int i = 0; i < groupfilters.size(); i++) {
				if(groupfilters.get(i).isExecute())
					groupfilters.get(i).Execute(anEObject);
			}
		}
		return true;				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean InitAllFilters() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//Init Attributes
		name = "Filters";
		//Init List of Group of Filters
		groupfilters = new BasicEList<FilterGroup>();
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<Integer, EList<EObject>> AllEObjectsSatifiesCondition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EMap<Integer, EList<EObject>> all_objects = new BasicEMap<Integer, EList<EObject>>();
		for (int i = 0; i < groupfilters.size(); i++) {
			all_objects.put(i,groupfilters.get(i).getListSatifiesCondition());
		}
		return all_objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean DeleteAllEObjectsSatisfiesCondition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		for (int i = 0; i < groupfilters.size(); i++) {
			groupfilters.get(i).getListSatifiesCondition().clear();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslFilterPackage.ALL_FILTERS__GROUPFILTERS:
				return ((InternalEList<?>)getGroupfilters()).basicRemove(otherEnd, msgs);
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
			case DslFilterPackage.ALL_FILTERS__NEGATIVE:
				return isNegative();
			case DslFilterPackage.ALL_FILTERS__GROUPFILTERS:
				return getGroupfilters();
			case DslFilterPackage.ALL_FILTERS__MODEL_URI:
				return getModelURI();
			case DslFilterPackage.ALL_FILTERS__LIST_ECLASSES:
				return getList_EClasses();
			case DslFilterPackage.ALL_FILTERS__NAME:
				return getName();
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
			case DslFilterPackage.ALL_FILTERS__NEGATIVE:
				setNegative((Boolean)newValue);
				return;
			case DslFilterPackage.ALL_FILTERS__GROUPFILTERS:
				getGroupfilters().clear();
				getGroupfilters().addAll((Collection<? extends FilterGroup>)newValue);
				return;
			case DslFilterPackage.ALL_FILTERS__MODEL_URI:
				setModelURI((String)newValue);
				return;
			case DslFilterPackage.ALL_FILTERS__LIST_ECLASSES:
				getList_EClasses().clear();
				getList_EClasses().addAll((Collection<? extends EClass>)newValue);
				return;
			case DslFilterPackage.ALL_FILTERS__NAME:
				setName((String)newValue);
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
			case DslFilterPackage.ALL_FILTERS__NEGATIVE:
				setNegative(NEGATIVE_EDEFAULT);
				return;
			case DslFilterPackage.ALL_FILTERS__GROUPFILTERS:
				getGroupfilters().clear();
				return;
			case DslFilterPackage.ALL_FILTERS__MODEL_URI:
				setModelURI(MODEL_URI_EDEFAULT);
				return;
			case DslFilterPackage.ALL_FILTERS__LIST_ECLASSES:
				getList_EClasses().clear();
				return;
			case DslFilterPackage.ALL_FILTERS__NAME:
				setName(NAME_EDEFAULT);
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
			case DslFilterPackage.ALL_FILTERS__NEGATIVE:
				return negative != NEGATIVE_EDEFAULT;
			case DslFilterPackage.ALL_FILTERS__GROUPFILTERS:
				return groupfilters != null && !groupfilters.isEmpty();
			case DslFilterPackage.ALL_FILTERS__MODEL_URI:
				return MODEL_URI_EDEFAULT == null ? modelURI != null : !MODEL_URI_EDEFAULT.equals(modelURI);
			case DslFilterPackage.ALL_FILTERS__LIST_ECLASSES:
				return list_EClasses != null && !list_EClasses.isEmpty();
			case DslFilterPackage.ALL_FILTERS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslFilterPackage.ALL_FILTERS___EXECUTE__TREEITERATOR:
				return Execute((TreeIterator<EObject>)arguments.get(0));
			case DslFilterPackage.ALL_FILTERS___INIT_ALL_FILTERS:
				return InitAllFilters();
			case DslFilterPackage.ALL_FILTERS___ALL_EOBJECTS_SATIFIES_CONDITION:
				return AllEObjectsSatifiesCondition();
			case DslFilterPackage.ALL_FILTERS___DELETE_ALL_EOBJECTS_SATISFIES_CONDITION:
				return DeleteAllEObjectsSatisfiesCondition();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (negative: ");
		result.append(negative);
		result.append(", modelURI: ");
		result.append(modelURI);
		result.append(')');
		return result.toString();
	}
	

} //AllFiltersImpl
