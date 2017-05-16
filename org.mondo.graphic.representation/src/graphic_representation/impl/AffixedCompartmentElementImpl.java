/**
 */
package graphic_representation.impl;

import graphic_representation.AffixedCompartmentElement;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.Node;

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
 * An implementation of the model object '<em><b>Affixed Compartment Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.AffixedCompartmentElementImpl#getAnEReference <em>An EReference</em>}</li>
 *   <li>{@link graphic_representation.impl.AffixedCompartmentElementImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AffixedCompartmentElementImpl extends MinimalEObjectImpl.Container implements AffixedCompartmentElement {
	/**
	 * The cached value of the '{@link #getAnEReference() <em>An EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnEReference()
	 * @generated
	 * @ordered
	 */
	protected EReference anEReference;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffixedCompartmentElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.AFFIXED_COMPARTMENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnEReference() {
		if (anEReference != null && anEReference.eIsProxy()) {
			InternalEObject oldAnEReference = (InternalEObject)anEReference;
			anEReference = (EReference)eResolveProxy(oldAnEReference);
			if (anEReference != oldAnEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE, oldAnEReference, anEReference));
			}
		}
		return anEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetAnEReference() {
		return anEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnEReference(EReference newAnEReference) {
		EReference oldAnEReference = anEReference;
		anEReference = newAnEReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE, oldAnEReference, anEReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<Node>(Node.class, this, Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE:
				if (resolve) return getAnEReference();
				return basicGetAnEReference();
			case Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__NODES:
				return getNodes();
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
			case Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE:
				setAnEReference((EReference)newValue);
				return;
			case Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
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
			case Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE:
				setAnEReference((EReference)null);
				return;
			case Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__NODES:
				getNodes().clear();
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
			case Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__AN_EREFERENCE:
				return anEReference != null;
			case Graphic_representationPackage.AFFIXED_COMPARTMENT_ELEMENT__NODES:
				return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AffixedCompartmentElementImpl
