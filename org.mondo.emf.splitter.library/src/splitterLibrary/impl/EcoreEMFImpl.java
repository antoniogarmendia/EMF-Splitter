/**
 */
package splitterLibrary.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import com.google.common.collect.Iterables;
import splitterLibrary.EcoreEMF;
import splitterLibrary.SplitterLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore EMF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link splitterLibrary.impl.EcoreEMFImpl#getFileuri <em>Fileuri</em>}</li>
 *   <li>{@link splitterLibrary.impl.EcoreEMFImpl#getList_classes <em>List classes</em>}</li>
 *   <li>{@link splitterLibrary.impl.EcoreEMFImpl#getPackMetamodel <em>Pack Metamodel</em>}</li>
 *   <li>{@link splitterLibrary.impl.EcoreEMFImpl#getRes <em>Res</em>}</li>
 *   <li>{@link splitterLibrary.impl.EcoreEMFImpl#getRs <em>Rs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcoreEMFImpl extends MinimalEObjectImpl.Container implements EcoreEMF {
	/**
	 * The default value of the '{@link #getFileuri() <em>Fileuri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileuri()
	 * @generated
	 * @ordered
	 */
	protected static final String FILEURI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileuri() <em>Fileuri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileuri()
	 * @generated
	 * @ordered
	 */
	protected String fileuri = FILEURI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getList_classes() <em>List classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList_classes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> list_classes;

	/**
	 * The cached value of the '{@link #getPackMetamodel() <em>Pack Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackMetamodel()
	 * @generated
	 * @ordered
	 */
	protected EPackage packMetamodel;

	/**
	 * The default value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet RES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet res = RES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRs() <em>Rs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRs()
	 * @generated
	 * @ordered
	 */
	protected static final Resource RS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRs() <em>Rs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRs()
	 * @generated
	 * @ordered
	 */
	protected Resource rs = RS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreEMFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplitterLibraryPackage.Literals.ECORE_EMF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileuri() {
		return fileuri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileuri(String newFileuri) {
		String oldFileuri = fileuri;
		fileuri = newFileuri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.ECORE_EMF__FILEURI, oldFileuri, fileuri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EClass> getList_classes() {
		if (list_classes == null) {
			EClass[] aux = Iterables.toArray(Iterables.filter(GetClassifiers(), EClass.class), EClass.class);
			list_classes = new BasicInternalEList<EClass>(EClass.class, aux.length,aux);						
		}
		return list_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getPackMetamodel() {
		if (packMetamodel != null && packMetamodel.eIsProxy()) {
			InternalEObject oldPackMetamodel = (InternalEObject)packMetamodel;
			packMetamodel = (EPackage)eResolveProxy(oldPackMetamodel);
			if (packMetamodel != oldPackMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SplitterLibraryPackage.ECORE_EMF__PACK_METAMODEL, oldPackMetamodel, packMetamodel));
			}
		}
		return packMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetPackMetamodel() {
		return packMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackMetamodel(EPackage newPackMetamodel) {
		EPackage oldPackMetamodel = packMetamodel;
		packMetamodel = newPackMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.ECORE_EMF__PACK_METAMODEL, oldPackMetamodel, packMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ResourceSet getRes() {
		if(res==null)
			res = new ResourceSetImpl();
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRes(ResourceSet newRes) {
		ResourceSet oldRes = res;
		res = newRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.ECORE_EMF__RES, oldRes, res));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Resource getRs() {
		if(rs==null){
			getRes().getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
			getRes().getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
					"ecore", new EcoreResourceFactoryImpl());
			rs = getRes().getResource(URI.createURI(fileuri,true),true);	
		}
		return rs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRs(Resource newRs) {
		Resource oldRs = rs;
		rs = newRs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.ECORE_EMF__RS, oldRs, rs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void GetRoot() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IFile GetIFile() {
		
		if(fileuri!=null)
		{
			IWorkspace workspace= ResourcesPlugin.getWorkspace(); 
			IPath location= Path.fromOSString(URI.createURI(fileuri,true).toFileString());
			return workspace.getRoot().getFileForLocation(location);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EPackage GetRootPackage() {
		
		if(packMetamodel==null){
								
			EList<EObject> list_packages = getRs().getContents();
			if(list_packages.size()>=1)
			{
				packMetamodel = (EPackage)(list_packages.get(0));
				return packMetamodel;
			}			
		}
		 else
			 return packMetamodel;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EClassifier> GetClassifiers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return GetRootPackage().getEClassifiers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean setPackagebyName(String anpackname) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		ResourceSet n_resourceset = new ResourceSetImpl();
		n_resourceset.getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
				"ecore", new EcoreResourceFactoryImpl());
		Resource n_resource = n_resourceset.getResource(URI.createURI(fileuri),true);
		
		EList<EObject> list_packages = n_resource.getContents();
		EPackage obj = null;
		for (int i = 0; i < list_packages.size(); i++) {
			obj = (EPackage) list_packages.get(i);						
			if(obj.getName().toString().equals(anpackname)){
				packMetamodel =  (EPackage) list_packages.get(i);
				return true;
			}
		}		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SplitterLibraryPackage.ECORE_EMF__FILEURI:
				return getFileuri();
			case SplitterLibraryPackage.ECORE_EMF__LIST_CLASSES:
				return getList_classes();
			case SplitterLibraryPackage.ECORE_EMF__PACK_METAMODEL:
				if (resolve) return getPackMetamodel();
				return basicGetPackMetamodel();
			case SplitterLibraryPackage.ECORE_EMF__RES:
				return getRes();
			case SplitterLibraryPackage.ECORE_EMF__RS:
				return getRs();
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
			case SplitterLibraryPackage.ECORE_EMF__FILEURI:
				setFileuri((String)newValue);
				return;
			case SplitterLibraryPackage.ECORE_EMF__LIST_CLASSES:
				getList_classes().clear();
				getList_classes().addAll((Collection<? extends EClass>)newValue);
				return;
			case SplitterLibraryPackage.ECORE_EMF__PACK_METAMODEL:
				setPackMetamodel((EPackage)newValue);
				return;
			case SplitterLibraryPackage.ECORE_EMF__RES:
				setRes((ResourceSet)newValue);
				return;
			case SplitterLibraryPackage.ECORE_EMF__RS:
				setRs((Resource)newValue);
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
			case SplitterLibraryPackage.ECORE_EMF__FILEURI:
				setFileuri(FILEURI_EDEFAULT);
				return;
			case SplitterLibraryPackage.ECORE_EMF__LIST_CLASSES:
				getList_classes().clear();
				return;
			case SplitterLibraryPackage.ECORE_EMF__PACK_METAMODEL:
				setPackMetamodel((EPackage)null);
				return;
			case SplitterLibraryPackage.ECORE_EMF__RES:
				setRes(RES_EDEFAULT);
				return;
			case SplitterLibraryPackage.ECORE_EMF__RS:
				setRs(RS_EDEFAULT);
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
			case SplitterLibraryPackage.ECORE_EMF__FILEURI:
				return FILEURI_EDEFAULT == null ? fileuri != null : !FILEURI_EDEFAULT.equals(fileuri);
			case SplitterLibraryPackage.ECORE_EMF__LIST_CLASSES:
				return list_classes != null && !list_classes.isEmpty();
			case SplitterLibraryPackage.ECORE_EMF__PACK_METAMODEL:
				return packMetamodel != null;
			case SplitterLibraryPackage.ECORE_EMF__RES:
				return RES_EDEFAULT == null ? res != null : !RES_EDEFAULT.equals(res);
			case SplitterLibraryPackage.ECORE_EMF__RS:
				return RS_EDEFAULT == null ? rs != null : !RS_EDEFAULT.equals(rs);
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
			case SplitterLibraryPackage.ECORE_EMF___GET_ROOT:
				GetRoot();
				return null;
			case SplitterLibraryPackage.ECORE_EMF___GET_IFILE:
				return GetIFile();
			case SplitterLibraryPackage.ECORE_EMF___GET_ROOT_PACKAGE:
				return GetRootPackage();
			case SplitterLibraryPackage.ECORE_EMF___GET_CLASSIFIERS:
				return GetClassifiers();
			case SplitterLibraryPackage.ECORE_EMF___SET_PACKAGEBY_NAME__STRING:
				return setPackagebyName((String)arguments.get(0));
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
		result.append(" (fileuri: ");
		result.append(fileuri);
		result.append(", res: ");
		result.append(res);
		result.append(", rs: ");
		result.append(rs);
		result.append(')');
		return result.toString();
	}

} //EcoreEMFImpl
