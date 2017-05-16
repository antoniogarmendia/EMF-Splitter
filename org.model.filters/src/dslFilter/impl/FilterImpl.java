/**
 */
package dslFilter.impl;

import dslFilter.DslFilterPackage;
import dslFilter.Filter;
import dslFilter.Rule;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.FilterImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link dslFilter.impl.FilterImpl#isExecute <em>Execute</em>}</li>
 *   <li>{@link dslFilter.impl.FilterImpl#getAnRule <em>An Rule</em>}</li>
 *   <li>{@link dslFilter.impl.FilterImpl#getAnEStructuralFeature <em>An EStructural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterImpl extends MinimalEObjectImpl.Container implements Filter {
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
	 * The cached value of the '{@link #getAnRule() <em>An Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnRule()
	 * @generated
	 * @ordered
	 */
	protected Rule anRule;

	/**
	 * The cached value of the '{@link #getAnEStructuralFeature() <em>An EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnEStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature anEStructuralFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.FILTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER__NEGATIVE, oldNegative, negative));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER__EXECUTE, oldExecute, execute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getAnRule() {
		return anRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnRule(Rule newAnRule, NotificationChain msgs) {
		Rule oldAnRule = anRule;
		anRule = newAnRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER__AN_RULE, oldAnRule, newAnRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnRule(Rule newAnRule) {
		if (newAnRule != anRule) {
			NotificationChain msgs = null;
			if (anRule != null)
				msgs = ((InternalEObject)anRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslFilterPackage.FILTER__AN_RULE, null, msgs);
			if (newAnRule != null)
				msgs = ((InternalEObject)newAnRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslFilterPackage.FILTER__AN_RULE, null, msgs);
			msgs = basicSetAnRule(newAnRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER__AN_RULE, newAnRule, newAnRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getAnEStructuralFeature() {
		if (anEStructuralFeature != null && anEStructuralFeature.eIsProxy()) {
			InternalEObject oldAnEStructuralFeature = (InternalEObject)anEStructuralFeature;
			anEStructuralFeature = (EStructuralFeature)eResolveProxy(oldAnEStructuralFeature);
			if (anEStructuralFeature != oldAnEStructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslFilterPackage.FILTER__AN_ESTRUCTURAL_FEATURE, oldAnEStructuralFeature, anEStructuralFeature));
			}
		}
		return anEStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetAnEStructuralFeature() {
		return anEStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnEStructuralFeature(EStructuralFeature newAnEStructuralFeature) {
		EStructuralFeature oldAnEStructuralFeature = anEStructuralFeature;
		anEStructuralFeature = newAnEStructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER__AN_ESTRUCTURAL_FEATURE, oldAnEStructuralFeature, anEStructuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> GetRules() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EClassifier type = anEStructuralFeature.getEType();
		Class<?> instance_class = type.getInstanceClass();
		String exp = "";
		if(anRule!=null)
			exp = anRule.getAnExp();
		if(anEStructuralFeature instanceof EAttributeImpl){
			
			if(instance_class.equals(String.class))
			{
				anRule = new CStringOperationImpl();
				anRule.setAnExp(exp);
				return new DslFilterFactoryImpl().createBasicCStringOperation().EnumToStringArray();//GetEnumStringOperationToStringArray();
			}
			if(instance_class.equals(Number.class))
			{
				anRule = new CNumberOperationImpl();
				anRule.setAnExp(exp);
				return new DslFilterFactoryImpl().createBasicCNumberOperation().EnumToStringArray();
			}
		}	
		if(anEStructuralFeature instanceof EReferenceImpl)
		{
			anRule = new CStructuralEObjectImpl();
			anRule.setAnExp(exp);
			return new DslFilterFactoryImpl().createBasicCNumberOperation().EnumToStringArray();
		}
			return new BasicEList<String>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> GetObjectReferences() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<String> list_rules_references = new BasicEList<String>();
		list_rules_references.add("Size");
		return list_rules_references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean InitFilter() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		anRule = new CStringOperationImpl();
		execute = true;
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean Execute(EObject anEObject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Object struct =  anEObject.eGet(anEStructuralFeature);
		return negative ^ getAnRule().SatifiesRule(struct);				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslFilterPackage.FILTER__AN_RULE:
				return basicSetAnRule(null, msgs);
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
			case DslFilterPackage.FILTER__NEGATIVE:
				return isNegative();
			case DslFilterPackage.FILTER__EXECUTE:
				return isExecute();
			case DslFilterPackage.FILTER__AN_RULE:
				return getAnRule();
			case DslFilterPackage.FILTER__AN_ESTRUCTURAL_FEATURE:
				if (resolve) return getAnEStructuralFeature();
				return basicGetAnEStructuralFeature();
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
			case DslFilterPackage.FILTER__NEGATIVE:
				setNegative((Boolean)newValue);
				return;
			case DslFilterPackage.FILTER__EXECUTE:
				setExecute((Boolean)newValue);
				return;
			case DslFilterPackage.FILTER__AN_RULE:
				setAnRule((Rule)newValue);
				return;
			case DslFilterPackage.FILTER__AN_ESTRUCTURAL_FEATURE:
				setAnEStructuralFeature((EStructuralFeature)newValue);
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
			case DslFilterPackage.FILTER__NEGATIVE:
				setNegative(NEGATIVE_EDEFAULT);
				return;
			case DslFilterPackage.FILTER__EXECUTE:
				setExecute(EXECUTE_EDEFAULT);
				return;
			case DslFilterPackage.FILTER__AN_RULE:
				setAnRule((Rule)null);
				return;
			case DslFilterPackage.FILTER__AN_ESTRUCTURAL_FEATURE:
				setAnEStructuralFeature((EStructuralFeature)null);
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
			case DslFilterPackage.FILTER__NEGATIVE:
				return negative != NEGATIVE_EDEFAULT;
			case DslFilterPackage.FILTER__EXECUTE:
				return execute != EXECUTE_EDEFAULT;
			case DslFilterPackage.FILTER__AN_RULE:
				return anRule != null;
			case DslFilterPackage.FILTER__AN_ESTRUCTURAL_FEATURE:
				return anEStructuralFeature != null;
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
			case DslFilterPackage.FILTER___GET_RULES:
				return GetRules();
			case DslFilterPackage.FILTER___GET_OBJECT_REFERENCES:
				return GetObjectReferences();
			case DslFilterPackage.FILTER___INIT_FILTER:
				return InitFilter();
			case DslFilterPackage.FILTER___EXECUTE__EOBJECT:
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
		result.append(')');
		return result.toString();
	}

} //FilterImpl
