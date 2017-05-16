/**
 */
package Visibility.impl;

import Visibility.VisibilityClass;
import Visibility.VisibilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Visibility.impl.VisibilityClassImpl#getEolExpressionWS <em>Eol Expression WS</em>}</li>
 *   <li>{@link Visibility.impl.VisibilityClassImpl#getEolExpressionProject <em>Eol Expression Project</em>}</li>
 *   <li>{@link Visibility.impl.VisibilityClassImpl#getEolExpressionPackage <em>Eol Expression Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisibilityClassImpl extends MinimalEObjectImpl.Container implements VisibilityClass {
	/**
	 * The default value of the '{@link #getEolExpressionWS() <em>Eol Expression WS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEolExpressionWS()
	 * @generated
	 * @ordered
	 */
	protected static final String EOL_EXPRESSION_WS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEolExpressionWS() <em>Eol Expression WS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEolExpressionWS()
	 * @generated
	 * @ordered
	 */
	protected String eolExpressionWS = EOL_EXPRESSION_WS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEolExpressionProject() <em>Eol Expression Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEolExpressionProject()
	 * @generated
	 * @ordered
	 */
	protected static final String EOL_EXPRESSION_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEolExpressionProject() <em>Eol Expression Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEolExpressionProject()
	 * @generated
	 * @ordered
	 */
	protected String eolExpressionProject = EOL_EXPRESSION_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEolExpressionPackage() <em>Eol Expression Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEolExpressionPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String EOL_EXPRESSION_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEolExpressionPackage() <em>Eol Expression Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEolExpressionPackage()
	 * @generated
	 * @ordered
	 */
	protected String eolExpressionPackage = EOL_EXPRESSION_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisibilityPackage.Literals.VISIBILITY_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEolExpressionWS() {
		return eolExpressionWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEolExpressionWS(String newEolExpressionWS) {
		String oldEolExpressionWS = eolExpressionWS;
		eolExpressionWS = newEolExpressionWS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_WS, oldEolExpressionWS, eolExpressionWS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEolExpressionProject() {
		return eolExpressionProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEolExpressionProject(String newEolExpressionProject) {
		String oldEolExpressionProject = eolExpressionProject;
		eolExpressionProject = newEolExpressionProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PROJECT, oldEolExpressionProject, eolExpressionProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEolExpressionPackage() {
		return eolExpressionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEolExpressionPackage(String newEolExpressionPackage) {
		String oldEolExpressionPackage = eolExpressionPackage;
		eolExpressionPackage = newEolExpressionPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PACKAGE, oldEolExpressionPackage, eolExpressionPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_WS:
				return getEolExpressionWS();
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PROJECT:
				return getEolExpressionProject();
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PACKAGE:
				return getEolExpressionPackage();
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
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_WS:
				setEolExpressionWS((String)newValue);
				return;
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PROJECT:
				setEolExpressionProject((String)newValue);
				return;
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PACKAGE:
				setEolExpressionPackage((String)newValue);
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
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_WS:
				setEolExpressionWS(EOL_EXPRESSION_WS_EDEFAULT);
				return;
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PROJECT:
				setEolExpressionProject(EOL_EXPRESSION_PROJECT_EDEFAULT);
				return;
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PACKAGE:
				setEolExpressionPackage(EOL_EXPRESSION_PACKAGE_EDEFAULT);
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
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_WS:
				return EOL_EXPRESSION_WS_EDEFAULT == null ? eolExpressionWS != null : !EOL_EXPRESSION_WS_EDEFAULT.equals(eolExpressionWS);
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PROJECT:
				return EOL_EXPRESSION_PROJECT_EDEFAULT == null ? eolExpressionProject != null : !EOL_EXPRESSION_PROJECT_EDEFAULT.equals(eolExpressionProject);
			case VisibilityPackage.VISIBILITY_CLASS__EOL_EXPRESSION_PACKAGE:
				return EOL_EXPRESSION_PACKAGE_EDEFAULT == null ? eolExpressionPackage != null : !EOL_EXPRESSION_PACKAGE_EDEFAULT.equals(eolExpressionPackage);
		}
		return super.eIsSet(featureID);
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
		result.append(" (eolExpressionWS: ");
		result.append(eolExpressionWS);
		result.append(", eolExpressionProject: ");
		result.append(eolExpressionProject);
		result.append(", eolExpressionPackage: ");
		result.append(eolExpressionPackage);
		result.append(')');
		return result.toString();
	}

} //VisibilityClassImpl
