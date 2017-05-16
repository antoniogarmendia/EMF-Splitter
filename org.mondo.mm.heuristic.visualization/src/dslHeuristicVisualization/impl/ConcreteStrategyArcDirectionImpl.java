/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ArcParameter;
import dslHeuristicVisualization.ConcreteStrategyArcDirection;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import graphic_representation.Edge_Direction;
import graphic_representation.Graphic_representationFactory;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy Arc Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.ConcreteStrategyArcDirectionImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteStrategyArcDirectionImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyArcDirection {
	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected ArcParameter param;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ConcreteStrategyArcDirectionImpl() {
		super();
		this.param = new DefaultArcParameterImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_ARC_DIRECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcParameter getParam() {
		if (param != null && param.eIsProxy()) {
			InternalEObject oldParam = (InternalEObject)param;
			param = (ArcParameter)eResolveProxy(oldParam);
			if (param != oldParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION__PARAM, oldParam, param));
			}
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcParameter basicGetParam() {
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(ArcParameter newParam) {
		ArcParameter oldParam = param;
		param = newParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION__PARAM, oldParam, param));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean ContainsStringEReferenceName(EList<String> ListStrings, String anString) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		for (String string : ListStrings) {
			if(string.equals(anString))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Edge_Direction Get_Direction(EClass anEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Edge_Direction dir = Graphic_representationFactory.eINSTANCE.createEdge_Direction();
		EList<EReference> list_ref = anEClass.getEAllReferences();
		boolean find_source = false;
		boolean find_target = false;
		boolean end = false;
		boolean dire = true;
		EReference src = null;
		EReference dst = null;
		EReference ele = null;
		//Search for source and target
		for (int i = 0; i < list_ref.size(); i++) {
			ele = list_ref.get(i);
			if(ContainsStringEReferenceName(param.getSource(),ele.getName().toLowerCase()))//param.getSource().contains(ele.getName())
			{
				dir.getSourceLink().setAnEReference(ele);
				find_source = true;
			}
			else if(ContainsStringEReferenceName(param.getTarget(),ele.getName().toLowerCase()))//param.getTarget().equals(ele.getName())
			{
				dir.getTargetLink().setAnEReference(ele);
				find_target = true;
			}
			else if(!ele.isContainment())
			{
				if(dire==true)
				{
					if(end==false)
					{
						src = ele;
						end = true;
					}
					else
					{
						dst = ele;
						dire = false;
					}
				}
			}
			if(find_source && find_target)
			 return dir;			
		}		

		if(src!=null)
			dir.getSourceLink().setAnEReference(src);
		if(dst!=null)
			dir.getSourceLink().setAnEReference(dst);
		
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION__PARAM:
				if (resolve) return getParam();
				return basicGetParam();
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION__PARAM:
				setParam((ArcParameter)newValue);
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION__PARAM:
				setParam((ArcParameter)null);
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION__PARAM:
				return param != null;
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION___CONTAINS_STRING_EREFERENCE_NAME__ELIST_STRING:
				return ContainsStringEReferenceName((EList<String>)arguments.get(0), (String)arguments.get(1));
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_DIRECTION___GET_DIRECTION__ECLASS:
				return Get_Direction((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyArcDirectionImpl
