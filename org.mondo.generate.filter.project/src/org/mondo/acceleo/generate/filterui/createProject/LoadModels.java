package org.mondo.acceleo.generate.filterui.createProject;

import java.io.File;
import java.io.IOException;

import org.eclipse.acceleo.common.utils.ModelUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;



public class LoadModels {
	
	
	public EPackage Load(String filepath){
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
				"ecore", new EcoreResourceFactoryImpl());
		EObject model = null;
		try {
			model = ModelUtils.load(new File(filepath),rs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return (EPackage)model;
	}
}
