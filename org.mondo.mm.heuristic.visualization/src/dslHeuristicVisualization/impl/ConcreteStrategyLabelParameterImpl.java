/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteStrategyLabelParameter;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;

import dslHeuristicVisualization.LabelParameter;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy Label Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.ConcreteStrategyLabelParameterImpl#getLabel_parameter <em>Label parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteStrategyLabelParameterImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyLabelParameter {
	/**
	 * The cached value of the '{@link #getLabel_parameter() <em>Label parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel_parameter()
	 * @generated
	 * @ordered
	 */
	protected LabelParameter label_parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ConcreteStrategyLabelParameterImpl() {
		super();
		label_parameter = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createLabelParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_LABEL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelParameter getLabel_parameter() {
		return label_parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel_parameter(LabelParameter newLabel_parameter, NotificationChain msgs) {
		LabelParameter oldLabel_parameter = label_parameter;
		label_parameter = newLabel_parameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER, oldLabel_parameter, newLabel_parameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel_parameter(LabelParameter newLabel_parameter) {
		if (newLabel_parameter != label_parameter) {
			NotificationChain msgs = null;
			if (label_parameter != null)
				msgs = ((InternalEObject)label_parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER, null, msgs);
			if (newLabel_parameter != null)
				msgs = ((InternalEObject)newLabel_parameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER, null, msgs);
			msgs = basicSetLabel_parameter(newLabel_parameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER, newLabel_parameter, newLabel_parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EAttribute GetLabel(EClass anEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<EAttribute> list_attr = anEClass.getEAllAttributes();
		int count = list_attr.size();
		int count_label = getLabel_parameter().getList_label().size();
		for (int i = 0; i < count; i++) {
			String name = list_attr.get(i).getName();
			for (int j = 0; j < count_label ; j++) {
				if(getLabel_parameter().getList_label().get(j).contains(name))
					return list_attr.get(i);
			}
		}	
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER:
				return basicSetLabel_parameter(null, msgs);
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER:
				return getLabel_parameter();
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER:
				setLabel_parameter((LabelParameter)newValue);
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER:
				setLabel_parameter((LabelParameter)null);
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER__LABEL_PARAMETER:
				return label_parameter != null;
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_PARAMETER___GET_LABEL__ECLASS:
				return GetLabel((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyLabelParameterImpl
