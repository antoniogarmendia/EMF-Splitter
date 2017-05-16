/**
 */
package dslFilter.impl;

import dslFilter.CLogicOperation;
import dslFilter.DslFilterPackage;
import dslFilter.EnumLogicOperation;
import dslFilter.FilterAttributes;
import dslFilter.FilterContent;
import dslFilter.FilterGroup;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.FilterGroupImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link dslFilter.impl.FilterGroupImpl#isExecute <em>Execute</em>}</li>
 *   <li>{@link dslFilter.impl.FilterGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link dslFilter.impl.FilterGroupImpl#getAnLogicOperation <em>An Logic Operation</em>}</li>
 *   <li>{@link dslFilter.impl.FilterGroupImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link dslFilter.impl.FilterGroupImpl#getListSatifiesCondition <em>List Satifies Condition</em>}</li>
 *   <li>{@link dslFilter.impl.FilterGroupImpl#getAnEClass <em>An EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterGroupImpl extends MinimalEObjectImpl.Container implements FilterGroup {
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
	 * The default value of the '{@link #isExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecute()
	 * @generated
	 * @ordered
	 */
	protected boolean execute = EXECUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Filters";

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
	 * The cached value of the '{@link #getAnLogicOperation() <em>An Logic Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnLogicOperation()
	 * @generated
	 * @ordered
	 */
	protected CLogicOperation anLogicOperation;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterContent> contents;

	/**
	 * The cached value of the '{@link #getListSatifiesCondition() <em>List Satifies Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListSatifiesCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> listSatifiesCondition;

	/**
	 * The cached value of the '{@link #getAnEClass() <em>An EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass anEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.FILTER_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER_GROUP__NEGATIVE, oldNegative, negative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecute() {
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecute(boolean newExecute) {
		boolean oldExecute = execute;
		execute = newExecute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER_GROUP__EXECUTE, oldExecute, execute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLogicOperation getAnLogicOperation() {
		if (anLogicOperation != null && anLogicOperation.eIsProxy()) {
			InternalEObject oldAnLogicOperation = (InternalEObject)anLogicOperation;
			anLogicOperation = (CLogicOperation)eResolveProxy(oldAnLogicOperation);
			if (anLogicOperation != oldAnLogicOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslFilterPackage.FILTER_GROUP__AN_LOGIC_OPERATION, oldAnLogicOperation, anLogicOperation));
			}
		}
		return anLogicOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLogicOperation basicGetAnLogicOperation() {
		return anLogicOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnLogicOperation(CLogicOperation newAnLogicOperation) {
		CLogicOperation oldAnLogicOperation = anLogicOperation;
		anLogicOperation = newAnLogicOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER_GROUP__AN_LOGIC_OPERATION, oldAnLogicOperation, anLogicOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<FilterContent>(FilterContent.class, this, DslFilterPackage.FILTER_GROUP__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getListSatifiesCondition() {
		if (listSatifiesCondition == null) {
			listSatifiesCondition = new EObjectContainmentEList<EObject>(EObject.class, this, DslFilterPackage.FILTER_GROUP__LIST_SATIFIES_CONDITION);
		}
		return listSatifiesCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnEClass() {
		if (anEClass != null && anEClass.eIsProxy()) {
			InternalEObject oldAnEClass = (InternalEObject)anEClass;
			anEClass = (EClass)eResolveProxy(oldAnEClass);
			if (anEClass != oldAnEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslFilterPackage.FILTER_GROUP__AN_ECLASS, oldAnEClass, anEClass));
			}
		}
		return anEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetAnEClass() {
		return anEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnEClass(EClass newAnEClass) {
		EClass oldAnEClass = anEClass;
		anEClass = newAnEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER_GROUP__AN_ECLASS, oldAnEClass, anEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean Execute(EObject anEObject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if(isClassInterfaceEObject(anEObject))
		{
			for (int i = 0; i < contents.size(); i++){
				if(contents.get(i).isExecute())
					if(contents.get(i).Execute(anEObject) == false && anLogicOperation.getAnLogicOperation().equals(EnumLogicOperation.AND)){
						if(false ^ negative)
							listSatifiesCondition.add(anEObject); 
						return false ^ negative;	
					}
					else if(contents.get(i).Execute(anEObject) == true && anLogicOperation.getAnLogicOperation().equals(EnumLogicOperation.OR)){
						if(true ^ negative)
							listSatifiesCondition.add(anEObject); 
						return true ^ negative;
					}
			}
			
			boolean result = false;
			if(anLogicOperation.getAnLogicOperation().equals(EnumLogicOperation.AND))
				result = true;
			else if(anLogicOperation.getAnLogicOperation().equals(EnumLogicOperation.OR))
				result = false;
			
			if(result ^ isNegative())
				listSatifiesCondition.add(anEObject); 
			return result ^ negative;			
		}
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean InitFilterGroup(Integer count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		name = "Group " + (count + 1);
		anLogicOperation = new DslFilterFactoryImpl().createCLogicOperation();
		anLogicOperation.setAnLogicOperation(EnumLogicOperation.AND);
		setExecute(true);
		setNegative(false);		
		contents = new BasicEList<FilterContent>();
		listSatifiesCondition = new BasicEList<EObject>();
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public boolean isClassInterfaceEObject(EObject anEObject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Class<?> anEClass_interface = anEClass.getInstanceClass();
		Class<?>[] eobj_interfaces = anEObject.getClass().getInterfaces();
		for (int i = 0; i < eobj_interfaces.length; i++) {
			if(eobj_interfaces[i].equals(anEClass_interface))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslFilterPackage.FILTER_GROUP__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case DslFilterPackage.FILTER_GROUP__LIST_SATIFIES_CONDITION:
				return ((InternalEList<?>)getListSatifiesCondition()).basicRemove(otherEnd, msgs);
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
			case DslFilterPackage.FILTER_GROUP__NEGATIVE:
				return isNegative();
			case DslFilterPackage.FILTER_GROUP__EXECUTE:
				return isExecute();
			case DslFilterPackage.FILTER_GROUP__NAME:
				return getName();
			case DslFilterPackage.FILTER_GROUP__AN_LOGIC_OPERATION:
				if (resolve) return getAnLogicOperation();
				return basicGetAnLogicOperation();
			case DslFilterPackage.FILTER_GROUP__CONTENTS:
				return getContents();
			case DslFilterPackage.FILTER_GROUP__LIST_SATIFIES_CONDITION:
				return getListSatifiesCondition();
			case DslFilterPackage.FILTER_GROUP__AN_ECLASS:
				if (resolve) return getAnEClass();
				return basicGetAnEClass();
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
			case DslFilterPackage.FILTER_GROUP__NEGATIVE:
				setNegative((Boolean)newValue);
				return;
			case DslFilterPackage.FILTER_GROUP__EXECUTE:
				setExecute((Boolean)newValue);
				return;
			case DslFilterPackage.FILTER_GROUP__NAME:
				setName((String)newValue);
				return;
			case DslFilterPackage.FILTER_GROUP__AN_LOGIC_OPERATION:
				setAnLogicOperation((CLogicOperation)newValue);
				return;
			case DslFilterPackage.FILTER_GROUP__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends FilterContent>)newValue);
				return;
			case DslFilterPackage.FILTER_GROUP__LIST_SATIFIES_CONDITION:
				getListSatifiesCondition().clear();
				getListSatifiesCondition().addAll((Collection<? extends EObject>)newValue);
				return;
			case DslFilterPackage.FILTER_GROUP__AN_ECLASS:
				setAnEClass((EClass)newValue);
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
			case DslFilterPackage.FILTER_GROUP__NEGATIVE:
				setNegative(NEGATIVE_EDEFAULT);
				return;
			case DslFilterPackage.FILTER_GROUP__EXECUTE:
				setExecute(EXECUTE_EDEFAULT);
				return;
			case DslFilterPackage.FILTER_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslFilterPackage.FILTER_GROUP__AN_LOGIC_OPERATION:
				setAnLogicOperation((CLogicOperation)null);
				return;
			case DslFilterPackage.FILTER_GROUP__CONTENTS:
				getContents().clear();
				return;
			case DslFilterPackage.FILTER_GROUP__LIST_SATIFIES_CONDITION:
				getListSatifiesCondition().clear();
				return;
			case DslFilterPackage.FILTER_GROUP__AN_ECLASS:
				setAnEClass((EClass)null);
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
			case DslFilterPackage.FILTER_GROUP__NEGATIVE:
				return negative != NEGATIVE_EDEFAULT;
			case DslFilterPackage.FILTER_GROUP__EXECUTE:
				return execute != EXECUTE_EDEFAULT;
			case DslFilterPackage.FILTER_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslFilterPackage.FILTER_GROUP__AN_LOGIC_OPERATION:
				return anLogicOperation != null;
			case DslFilterPackage.FILTER_GROUP__CONTENTS:
				return contents != null && !contents.isEmpty();
			case DslFilterPackage.FILTER_GROUP__LIST_SATIFIES_CONDITION:
				return listSatifiesCondition != null && !listSatifiesCondition.isEmpty();
			case DslFilterPackage.FILTER_GROUP__AN_ECLASS:
				return anEClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FilterAttributes.class) {
			switch (derivedFeatureID) {
				case DslFilterPackage.FILTER_GROUP__NAME: return DslFilterPackage.FILTER_ATTRIBUTES__NAME;
				case DslFilterPackage.FILTER_GROUP__AN_LOGIC_OPERATION: return DslFilterPackage.FILTER_ATTRIBUTES__AN_LOGIC_OPERATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FilterAttributes.class) {
			switch (baseFeatureID) {
				case DslFilterPackage.FILTER_ATTRIBUTES__NAME: return DslFilterPackage.FILTER_GROUP__NAME;
				case DslFilterPackage.FILTER_ATTRIBUTES__AN_LOGIC_OPERATION: return DslFilterPackage.FILTER_GROUP__AN_LOGIC_OPERATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslFilterPackage.FILTER_GROUP___INIT_FILTER_GROUP__INTEGER:
				return InitFilterGroup((Integer)arguments.get(0));
			case DslFilterPackage.FILTER_GROUP___IS_CLASS_INTERFACE_EOBJECT__EOBJECT:
				return isClassInterfaceEObject((EObject)arguments.get(0));
			case DslFilterPackage.FILTER_GROUP___EXECUTE__EOBJECT:
				return Execute((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (negative: ");
		result.append(negative);
		result.append(", execute: ");
		result.append(execute);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	

} //FilterGroupImpl
