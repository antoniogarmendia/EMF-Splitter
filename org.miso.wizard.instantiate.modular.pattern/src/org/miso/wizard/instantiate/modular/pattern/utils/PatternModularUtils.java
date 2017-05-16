package org.miso.wizard.instantiate.modular.pattern.utils;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import dslPatterns.Category;
import dslPatterns.Pattern;
import dslPatterns.PatternSet;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import runtimePatterns.RuntimePatternsFactory;

/*
 * Miscellaneous class of utility functions
 * */

public final class PatternModularUtils {
	
	public static final String catInfrastructureFunctionality = "Infrastructure Functionality";
	public static final String catLanguageFragmentation = "Language Fragmentation";
	public static final String catModularity = "Modularity";
	
	/*
	 * Get Modular Pattern from the pattern set
	 * */	
		
	public static Pattern getModularPattern(PatternSet iPatternModel){
		
		Iterator<Category> itCategories = iPatternModel.getCategories().iterator();
		while (itCategories.hasNext()) {
			
			Category category = (Category) itCategories.next();
			if(category.getName().equals(catInfrastructureFunctionality)){
				
				Iterator<Category> itSubCategories = category.getSubcategories().iterator();
				while (itSubCategories.hasNext()) {
					Category subCategory = (Category) itSubCategories.next();
					if(subCategory.getName().equals(catLanguageFragmentation)){
						Iterator<Pattern> itPatterns = subCategory.getPatterns().iterator();
						while (itPatterns.hasNext()) {
							Pattern pattern = (Pattern) itPatterns.next();
							if(pattern.getName().equals(catModularity))
								return pattern; 
						}
					}
				}
			}			
		}
		return null;
	}
	
	/*
	 * Create Pattern Instances 
	 * */
	
	public static PatternInstances createPatternInstances(){
		
		PatternInstances patternInstances = RuntimePatternsFactory.eINSTANCE.createPatternInstances();
		return patternInstances;
	}
	
	/*
	 * Create Pattern Instance
	 * */
	
	public static PatternInstance createPatternInstance(String ident, Pattern pattern){
		
		PatternInstance pi = RuntimePatternsFactory.eINSTANCE.createPatternInstance();
		pi.setIdent(ident);
		pi.setPattern(pattern);
		return pi;
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
