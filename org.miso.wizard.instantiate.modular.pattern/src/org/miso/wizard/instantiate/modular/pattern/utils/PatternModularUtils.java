package org.miso.wizard.instantiate.modular.pattern.utils;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.util.DSLtaoUtils;

/*
 * Miscellaneous class of utility functions
 * */

public final class PatternModularUtils {
	
	
	public static void savePatternInstanceInRtapt(URI rtpatURI, PatternInstance instance, String ident) {
		
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Resource res = resourceSet.getResource(rtpatURI, true);
		
		EObject rootEObject = res.getContents().get(0);
		
		if (rootEObject instanceof PatternInstances) {
			
			deletePatternByIdent((PatternInstances) rootEObject,ident);			
			PatternInstances patterns = (PatternInstances) rootEObject;
			patterns.getAppliedPatterns().add(instance);
			try {
				
				res.save(null);
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}		
	}
	
	private static void deletePatternByIdent(PatternInstances patterns, String ident) {
		
		Iterator<PatternInstance> itPatterns = patterns.getAppliedPatterns().iterator();
		while (itPatterns.hasNext()) {
			PatternInstance patternInstance = (PatternInstance) itPatterns.next();
			if (patternInstance.getIdent().equals(ident)){
				EcoreUtil.delete(patternInstance);
				break;
			}
		}
	}

	/*
	 * save pattern instance
	 */	
	public static void savePatternInstance(PatternInstance iPattern, URI uri) {
		
		PatternInstances patternInstances = DSLtaoUtils.createPatternInstances();
		patternInstances.getAppliedPatterns().add(iPattern);
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Resource res = resourceSet.createResource(uri);
		res.getContents().add(iPattern);
		
		try {
			res.save(null);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}	
	
	/*
	 * Save Runtime Patterns 
	 * */
	
	public static void saveRuntimePatternModel(PatternInstances iPatterns,URI uri){
		
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Resource res = resourceSet.createResource(uri);
		res.getContents().add(iPatterns);
		
		try {
			res.save(null);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
