/**
 */
package splitterLibrary.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import splitterLibrary.EcoreEMF;
import splitterLibrary.GenModelEMF;
import splitterLibrary.SplitterLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Model EMF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link splitterLibrary.impl.GenModelEMFImpl#getModel_code <em>Model code</em>}</li>
 *   <li>{@link splitterLibrary.impl.GenModelEMFImpl#getEdit_code <em>Edit code</em>}</li>
 *   <li>{@link splitterLibrary.impl.GenModelEMFImpl#getEditor_code <em>Editor code</em>}</li>
 *   <li>{@link splitterLibrary.impl.GenModelEMFImpl#getContain_proxies <em>Contain proxies</em>}</li>
 *   <li>{@link splitterLibrary.impl.GenModelEMFImpl#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link splitterLibrary.impl.GenModelEMFImpl#getNemf <em>Nemf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenModelEMFImpl extends MinimalEObjectImpl.Container implements GenModelEMF {
	/**
	 * The default value of the '{@link #getModel_code() <em>Model code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_code()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MODEL_CODE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getModel_code() <em>Model code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_code()
	 * @generated
	 * @ordered
	 */
	protected Boolean model_code = MODEL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdit_code() <em>Edit code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit_code()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EDIT_CODE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getEdit_code() <em>Edit code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit_code()
	 * @generated
	 * @ordered
	 */
	protected Boolean edit_code = EDIT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditor_code() <em>Editor code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor_code()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EDITOR_CODE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getEditor_code() <em>Editor code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor_code()
	 * @generated
	 * @ordered
	 */
	protected Boolean editor_code = EDITOR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContain_proxies() <em>Contain proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContain_proxies()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTAIN_PROXIES_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getContain_proxies() <em>Contain proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContain_proxies()
	 * @generated
	 * @ordered
	 */
	protected Boolean contain_proxies = CONTAIN_PROXIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenModel() <em>Gen Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenModel()
	 * @generated
	 * @ordered
	 */
	protected static final GenModel GEN_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenModel() <em>Gen Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenModel()
	 * @generated
	 * @ordered
	 */
	protected GenModel genModel = GEN_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNemf() <em>Nemf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNemf()
	 * @generated
	 * @ordered
	 */
	protected EcoreEMF nemf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenModelEMFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplitterLibraryPackage.Literals.GEN_MODEL_EMF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getModel_code() {
		return model_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel_code(Boolean newModel_code) {
		Boolean oldModel_code = model_code;
		model_code = newModel_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.GEN_MODEL_EMF__MODEL_CODE, oldModel_code, model_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEdit_code() {
		return edit_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdit_code(Boolean newEdit_code) {
		Boolean oldEdit_code = edit_code;
		edit_code = newEdit_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.GEN_MODEL_EMF__EDIT_CODE, oldEdit_code, edit_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEditor_code() {
		return editor_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditor_code(Boolean newEditor_code) {
		Boolean oldEditor_code = editor_code;
		editor_code = newEditor_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.GEN_MODEL_EMF__EDITOR_CODE, oldEditor_code, editor_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getContain_proxies() {
		return contain_proxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContain_proxies(Boolean newContain_proxies) {
		Boolean oldContain_proxies = contain_proxies;
		contain_proxies = newContain_proxies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.GEN_MODEL_EMF__CONTAIN_PROXIES, oldContain_proxies, contain_proxies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel getGenModel() {
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenModel(GenModel newGenModel) {
		GenModel oldGenModel = genModel;
		genModel = newGenModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.GEN_MODEL_EMF__GEN_MODEL, oldGenModel, genModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreEMF getNemf() {
		if (nemf != null && nemf.eIsProxy()) {
			InternalEObject oldNemf = (InternalEObject)nemf;
			nemf = (EcoreEMF)eResolveProxy(oldNemf);
			if (nemf != oldNemf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SplitterLibraryPackage.GEN_MODEL_EMF__NEMF, oldNemf, nemf));
			}
		}
		return nemf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreEMF basicGetNemf() {
		return nemf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNemf(EcoreEMF newNemf) {
		EcoreEMF oldNemf = nemf;
		nemf = newNemf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplitterLibraryPackage.GEN_MODEL_EMF__NEMF, oldNemf, nemf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean CreateGenModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		genModel = GenModelFactory.eINSTANCE.createGenModel();
		
		genModel.setComplianceLevel(GenJDKLevel.JDK70_LITERAL);
		genModel.getForeignModel().add(new Path(nemf.GetIFile().getFullPath().toString()).lastSegment());
		
		String project_name = nemf.GetIFile().getProject().getName();
		genModel.setModelDirectory("/"+ project_name +"/src");
		genModel.setModelPluginID(project_name);
		
		genModel.setRootExtendsInterface("org.eclipse.emf.ecore.EObject");
		genModel.setRootExtendsClass("org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container");
		genModel.initialize((Collection<? extends EPackage>) nemf.getRs().getContents());//Collections.singleton(nemf.getRs().getContents()) Collections.addAll(listEPackages)
		
		GenPackage genPackage = (GenPackage)genModel.getGenPackages().get(0);
        genPackage.setPrefix(nemf.GetRootPackage().getName());
        
        IPath genModelPath = new Path(nemf.GetIFile().getFullPath().toString()).removeFileExtension().addFileExtension("genmodel");
		genModel.setModelName(genModelPath.removeFileExtension().lastSegment());
		
			
		
		//Set Containment proxies to allow cross-document references
		genModel.setContainmentProxies(contain_proxies);
		
		try{
       	 URI genModelURI = URI.createFileURI(genModelPath.toString());
       	     	 
       	 
       	 final XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
       	 
       	 URIConverter converter = new ExtensibleURIConverterImpl();
       	 
       	 if(converter.exists(genModelURI, null) == true)
       		 return false;
       	       	 
       	 genModelResource.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING,"UTF-8");
       	 genModelResource.getContents().add(genModel);
            genModelResource.save(Collections.EMPTY_MAP);
            
       }catch (IOException e){
       	String msg = null;
           if (e instanceof FileNotFoundException) {
               msg = "Unable to open output file";
           } else {
               msg = "Unexpected IO Exception writing";
           }
           throw new RuntimeException(msg, e);
       }
		
		genModel.setCanGenerate(true);
		Generator generator = new Generator();
		//Generate  the code
		 if(model_code == true){
				generator.setInput(genModel);
				generator.generate(genModel,GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
				new BasicMonitor.Printing(System.err));
			 }
			//Edit Code
			if(edit_code == true){
				 generator.setInput(genModel);
				 generator.generate(genModel,
				 GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE,
				 new BasicMonitor.Printing(System.err));
			}
			
			//Editor Code
			if(editor_code == true){
			generator.generate(genModel,
			GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE,
			new BasicMonitor.Printing(System.err));
			}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilepath() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SplitterLibraryPackage.GEN_MODEL_EMF__MODEL_CODE:
				return getModel_code();
			case SplitterLibraryPackage.GEN_MODEL_EMF__EDIT_CODE:
				return getEdit_code();
			case SplitterLibraryPackage.GEN_MODEL_EMF__EDITOR_CODE:
				return getEditor_code();
			case SplitterLibraryPackage.GEN_MODEL_EMF__CONTAIN_PROXIES:
				return getContain_proxies();
			case SplitterLibraryPackage.GEN_MODEL_EMF__GEN_MODEL:
				return getGenModel();
			case SplitterLibraryPackage.GEN_MODEL_EMF__NEMF:
				if (resolve) return getNemf();
				return basicGetNemf();
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
			case SplitterLibraryPackage.GEN_MODEL_EMF__MODEL_CODE:
				setModel_code((Boolean)newValue);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__EDIT_CODE:
				setEdit_code((Boolean)newValue);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__EDITOR_CODE:
				setEditor_code((Boolean)newValue);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__CONTAIN_PROXIES:
				setContain_proxies((Boolean)newValue);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__GEN_MODEL:
				setGenModel((GenModel)newValue);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__NEMF:
				setNemf((EcoreEMF)newValue);
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
			case SplitterLibraryPackage.GEN_MODEL_EMF__MODEL_CODE:
				setModel_code(MODEL_CODE_EDEFAULT);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__EDIT_CODE:
				setEdit_code(EDIT_CODE_EDEFAULT);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__EDITOR_CODE:
				setEditor_code(EDITOR_CODE_EDEFAULT);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__CONTAIN_PROXIES:
				setContain_proxies(CONTAIN_PROXIES_EDEFAULT);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__GEN_MODEL:
				setGenModel(GEN_MODEL_EDEFAULT);
				return;
			case SplitterLibraryPackage.GEN_MODEL_EMF__NEMF:
				setNemf((EcoreEMF)null);
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
			case SplitterLibraryPackage.GEN_MODEL_EMF__MODEL_CODE:
				return MODEL_CODE_EDEFAULT == null ? model_code != null : !MODEL_CODE_EDEFAULT.equals(model_code);
			case SplitterLibraryPackage.GEN_MODEL_EMF__EDIT_CODE:
				return EDIT_CODE_EDEFAULT == null ? edit_code != null : !EDIT_CODE_EDEFAULT.equals(edit_code);
			case SplitterLibraryPackage.GEN_MODEL_EMF__EDITOR_CODE:
				return EDITOR_CODE_EDEFAULT == null ? editor_code != null : !EDITOR_CODE_EDEFAULT.equals(editor_code);
			case SplitterLibraryPackage.GEN_MODEL_EMF__CONTAIN_PROXIES:
				return CONTAIN_PROXIES_EDEFAULT == null ? contain_proxies != null : !CONTAIN_PROXIES_EDEFAULT.equals(contain_proxies);
			case SplitterLibraryPackage.GEN_MODEL_EMF__GEN_MODEL:
				return GEN_MODEL_EDEFAULT == null ? genModel != null : !GEN_MODEL_EDEFAULT.equals(genModel);
			case SplitterLibraryPackage.GEN_MODEL_EMF__NEMF:
				return nemf != null;
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
			case SplitterLibraryPackage.GEN_MODEL_EMF___CREATE_GEN_MODEL:
				return CreateGenModel();
			case SplitterLibraryPackage.GEN_MODEL_EMF___GET_FILEPATH:
				return getFilepath();
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
		result.append(" (model_code: ");
		result.append(model_code);
		result.append(", edit_code: ");
		result.append(edit_code);
		result.append(", editor_code: ");
		result.append(editor_code);
		result.append(", contain_proxies: ");
		result.append(contain_proxies);
		result.append(", genModel: ");
		result.append(genModel);
		result.append(')');
		return result.toString();
	}

} //GenModelEMFImpl
