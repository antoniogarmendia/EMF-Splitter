/**
 */
package graphic_representation.impl;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.Line;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.LineImpl#getFeatureReference <em>Feature Reference</em>}</li>
 *   <li>{@link graphic_representation.impl.LineImpl#getListEClasses <em>List EClasses</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LineImpl extends MinimalEObjectImpl.Container implements Line {
	/**
	 * The cached value of the '{@link #getFeatureReference() <em>Feature Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureReference()
	 * @generated
	 * @ordered
	 */
	protected EReference featureReference;

	/**
	 * The cached value of the '{@link #getListEClasses() <em>List EClasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListEClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> listEClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureReference() {
		if (featureReference != null && featureReference.eIsProxy()) {
			InternalEObject oldFeatureReference = (InternalEObject)featureReference;
			featureReference = (EReference)eResolveProxy(oldFeatureReference);
			if (featureReference != oldFeatureReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.LINE__FEATURE_REFERENCE, oldFeatureReference, featureReference));
			}
		}
		return featureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetFeatureReference() {
		return featureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureReference(EReference newFeatureReference) {
		EReference oldFeatureReference = featureReference;
		featureReference = newFeatureReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINE__FEATURE_REFERENCE, oldFeatureReference, featureReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getListEClasses() {
		if (listEClasses == null) {
			listEClasses = new EObjectResolvingEList<EClass>(EClass.class, this, Graphic_representationPackage.LINE__LIST_ECLASSES);
		}
		return listEClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.LINE__FEATURE_REFERENCE:
				if (resolve) return getFeatureReference();
				return basicGetFeatureReference();
			case Graphic_representationPackage.LINE__LIST_ECLASSES:
				return getListEClasses();
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
			case Graphic_representationPackage.LINE__FEATURE_REFERENCE:
				setFeatureReference((EReference)newValue);
				return;
			case Graphic_representationPackage.LINE__LIST_ECLASSES:
				getListEClasses().clear();
				getListEClasses().addAll((Collection<? extends EClass>)newValue);
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
			case Graphic_representationPackage.LINE__FEATURE_REFERENCE:
				setFeatureReference((EReference)null);
				return;
			case Graphic_representationPackage.LINE__LIST_ECLASSES:
				getListEClasses().clear();
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
			case Graphic_representationPackage.LINE__FEATURE_REFERENCE:
				return featureReference != null;
			case Graphic_representationPackage.LINE__LIST_ECLASSES:
				return listEClasses != null && !listEClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LineImpl
