/**
 */
package graphic_representation.impl;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.Link;
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
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.LinkImpl#getAnEReference <em>An EReference</em>}</li>
 *   <li>{@link graphic_representation.impl.LinkImpl#getAnDiagramElement <em>An Diagram Element</em>}</li>
 *   <li>{@link graphic_representation.impl.LinkImpl#getDecoratorName <em>Decorator Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
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
	 * The cached value of the '{@link #getAnDiagramElement() <em>An Diagram Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> anDiagramElement;

	/**
	 * The default value of the '{@link #getDecoratorName() <em>Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorName()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_NAME_EDEFAULT = "NoDecoration";

	/**
	 * The cached value of the '{@link #getDecoratorName() <em>Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorName()
	 * @generated
	 * @ordered
	 */
	protected String decoratorName = DECORATOR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.LINK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.LINK__AN_EREFERENCE, oldAnEReference, anEReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINK__AN_EREFERENCE, oldAnEReference, anEReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getAnDiagramElement() {
		if (anDiagramElement == null) {
			anDiagramElement = new EObjectResolvingEList<Node>(Node.class, this, Graphic_representationPackage.LINK__AN_DIAGRAM_ELEMENT);
		}
		return anDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecoratorName() {
		return decoratorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecoratorName(String newDecoratorName) {
		String oldDecoratorName = decoratorName;
		decoratorName = newDecoratorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINK__DECORATOR_NAME, oldDecoratorName, decoratorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.LINK__AN_EREFERENCE:
				if (resolve) return getAnEReference();
				return basicGetAnEReference();
			case Graphic_representationPackage.LINK__AN_DIAGRAM_ELEMENT:
				return getAnDiagramElement();
			case Graphic_representationPackage.LINK__DECORATOR_NAME:
				return getDecoratorName();
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
			case Graphic_representationPackage.LINK__AN_EREFERENCE:
				setAnEReference((EReference)newValue);
				return;
			case Graphic_representationPackage.LINK__AN_DIAGRAM_ELEMENT:
				getAnDiagramElement().clear();
				getAnDiagramElement().addAll((Collection<? extends Node>)newValue);
				return;
			case Graphic_representationPackage.LINK__DECORATOR_NAME:
				setDecoratorName((String)newValue);
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
			case Graphic_representationPackage.LINK__AN_EREFERENCE:
				setAnEReference((EReference)null);
				return;
			case Graphic_representationPackage.LINK__AN_DIAGRAM_ELEMENT:
				getAnDiagramElement().clear();
				return;
			case Graphic_representationPackage.LINK__DECORATOR_NAME:
				setDecoratorName(DECORATOR_NAME_EDEFAULT);
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
			case Graphic_representationPackage.LINK__AN_EREFERENCE:
				return anEReference != null;
			case Graphic_representationPackage.LINK__AN_DIAGRAM_ELEMENT:
				return anDiagramElement != null && !anDiagramElement.isEmpty();
			case Graphic_representationPackage.LINK__DECORATOR_NAME:
				return DECORATOR_NAME_EDEFAULT == null ? decoratorName != null : !DECORATOR_NAME_EDEFAULT.equals(decoratorName);
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
		result.append(" (decoratorName: ");
		result.append(decoratorName);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
