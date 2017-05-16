package org.mondo.modular.filterui.ext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IObtainClassFeatures {
	
	public boolean isIstanceEObject(EObject anEObject);
	
	public EClass GetEClass();
	
	public EList<IObtainClassFeatures> GetEListClasses();
	
	public EList<EStructuralFeature> GetEStructuralFeature();

}
