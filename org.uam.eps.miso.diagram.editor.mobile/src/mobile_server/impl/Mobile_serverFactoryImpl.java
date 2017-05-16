/**
 */
package mobile_server.impl;

import mobile_server.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mobile_serverFactoryImpl extends EFactoryImpl implements Mobile_serverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mobile_serverFactory init() {
		try {
			Mobile_serverFactory theMobile_serverFactory = (Mobile_serverFactory)EPackage.Registry.INSTANCE.getEFactory(Mobile_serverPackage.eNS_URI);
			if (theMobile_serverFactory != null) {
				return theMobile_serverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mobile_serverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobile_serverFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Mobile_serverPackage.ECORE_MD: return createEcoreMD();
			case Mobile_serverPackage.JSON_MOBILE: return createJSONMobile();
			case Mobile_serverPackage.PALETTE: return createPalette();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreMD createEcoreMD() {
		EcoreMDImpl ecoreMD = new EcoreMDImpl();
		return ecoreMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONMobile createJSONMobile() {
		JSONMobileImpl jsonMobile = new JSONMobileImpl();
		return jsonMobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette createPalette() {
		PaletteImpl palette = new PaletteImpl();
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobile_serverPackage getMobile_serverPackage() {
		return (Mobile_serverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mobile_serverPackage getPackage() {
		return Mobile_serverPackage.eINSTANCE;
	}

} //Mobile_serverFactoryImpl
