/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.LabelParameter;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import com.google.common.base.Joiner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.LabelParameterImpl#getList_label <em>List label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelParameterImpl extends MinimalEObjectImpl.Container implements LabelParameter {
	/**
	 * The cached value of the '{@link #getList_label() <em>List label</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList_label()
	 * @generated
	 * @ordered
	 */
	protected EList<String> list_label;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected LabelParameterImpl() {
		super();
		list_label = new BasicEList<String>();
		DefaultParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.LABEL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getList_label() {
		if (list_label == null) {
			list_label = new EDataTypeUniqueEList<String>(String.class, this, DslHeuristicVisualizationPackage.LABEL_PARAMETER__LIST_LABEL);
		}
		return list_label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toCommaSeparatedStringLabel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Joiner joiner = Joiner.on(",").skipNulls();
		return joiner.join(this.list_label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void DefaultParameters() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		list_label.add("name");
		list_label.add("id");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.LABEL_PARAMETER__LIST_LABEL:
				return getList_label();
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
			case DslHeuristicVisualizationPackage.LABEL_PARAMETER__LIST_LABEL:
				getList_label().clear();
				getList_label().addAll((Collection<? extends String>)newValue);
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
			case DslHeuristicVisualizationPackage.LABEL_PARAMETER__LIST_LABEL:
				getList_label().clear();
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
			case DslHeuristicVisualizationPackage.LABEL_PARAMETER__LIST_LABEL:
				return list_label != null && !list_label.isEmpty();
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
			case DslHeuristicVisualizationPackage.LABEL_PARAMETER___TO_COMMA_SEPARATED_STRING_LABEL:
				return toCommaSeparatedStringLabel();
			case DslHeuristicVisualizationPackage.LABEL_PARAMETER___DEFAULT_PARAMETERS:
				DefaultParameters();
				return null;
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
		result.append(" (list_label: ");
		result.append(list_label);
		result.append(')');
		return result.toString();
	}

} //LabelParameterImpl
