package org.mondo.generate.constraint.project.createProject;

import java.io.File;
import java.io.IOException;

import org.eclipse.acceleo.common.utils.ModelUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class LibraryConstraint {
	
	// load genmodel
	public EObject Load(String filepath, Resource res){
		
		ResourceSet rs = res.getResourceSet();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
				"genmodel", new EcoreResourceFactoryImpl()); 
		EObject model = null;
		try {
			model = ModelUtils.load(new File(filepath), rs);			
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
		return model;
	} 
	
	public String generateEClassImportFactoryImpl(EClass anEClass){
		
		String factory = ((EPackage)anEClass.eContainer()).getName().substring(0, 1).toUpperCase();
		factory += ((EPackage)anEClass.eContainer()).getName().substring(1) + "FactoryImpl";
		return generateEClassGeneralImport(anEClass) + ".impl." + factory;
	}
	
	private String generateEClassGeneralImport(EClassifier anEClass){
		
		String result = "";		
		EObject anEObject = anEClass;
		
		while(anEObject.eContainer()!=null){
			
			EObject currentEObject = anEObject.eContainer();
			if(currentEObject instanceof EPackage){
				EPackage anEPackage = (EPackage)currentEObject;
				if(result.equals(""))
					result = anEPackage.getName();
				else
					result = anEPackage.getName() + "." + result;				
			}
			
			anEObject = currentEObject;			
		}
		
		return result;		
	}
	
	public String getRootPackageString(EClass eClass) {
		return getRootPackage(eClass).getName();
	}
	
	public EPackage getRootPackage(EClass anEClass) {
		
		EObject eContainer = anEClass.eContainer();
		EObject ePack = null;
		while (eContainer != null) {
			ePack = eContainer;
			eContainer = eContainer.eContainer();
		}
		if (ePack instanceof EPackage) {
			return ((EPackage) ePack);
		}
		return null;
	}
	
	public String generateEClassImportBasePackage(EClassifier anEClass) {
		
		return generateEClassImpBasePackage(anEClass) + "." + anEClass.getName();
	}
	
	private String generateEClassImpBasePackage(EClassifier anEClass) {
		
		String result = "";		
		EObject anEObject = anEClass;
		
		while(anEObject.eContainer().eContainer()!=null){
			
			EObject currentEObject = anEObject.eContainer();
			if(currentEObject instanceof EPackage){
				EPackage anEPackage = (EPackage)currentEObject;
				if(result.equals(""))
					result = anEPackage.getName();
				else
					result = anEPackage.getName() + "." + result;				
			}
			
			anEObject = currentEObject;			
		}
		
		return result;	
	}
	
	public String generateEClassImport(EClassifier anEClass) {
		
		return generateEClassGeneralImport(anEClass) + "." + anEClass.getName();
	}

}
