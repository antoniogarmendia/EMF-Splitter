package org.mondo.generate.visibility.project.ext;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.ecore.EClass;

import ScopeDefinition.ScopeDefinitionEnum;

public class EvaluateVisibilityEClass {
	
	private static final String VISIBILITY_DEFINITION = "org.mondo.generate.visibility.project.visibility_definition";
	private ScopeDefinitionEnum def;
	private String eolExpression;
	
	public ScopeDefinitionEnum executeEClass(IExtensionRegistry registry,EClass eClass)
	{
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(VISIBILITY_DEFINITION);
		    try {
		      for (IConfigurationElement e : config) {
		        System.out.println("Evaluating visibility extension");
		        final Object o =
		            e.createExecutableExtension("class");
		        if (o instanceof IVisibilityClass) {
		          return executeExtensionEClass(o,eClass);
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }
		    return null;
	}	
	
	public String executeEOL(IExtensionRegistry registry,EClass eClass)
	{
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(VISIBILITY_DEFINITION);
		    try {
		      for (IConfigurationElement e : config) {
		        System.out.println("Evaluating visibility extension");
		        final Object o =
		            e.createExecutableExtension("class");
		        if (o instanceof IVisibilityClass) {
		          return executeExtensiongetEOLexp(o, eClass);
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }
		    return null;
	}	
	
	private ScopeDefinitionEnum executeExtensionEClass(Object o, EClass eClass) {
		// TODO Auto-generated method stub
		
		ISafeRunnable runnable = new ISafeRunnable() {
			
			@Override
			public void handleException(Throwable e) {
			       System.out.println("Exception in client");
			}

			@Override
			public void run() throws Exception {
				 def = ((IVisibilityClass) o).getVisibilitybyEClass(eClass);
				}		
			};
			
			SafeRunner.run(runnable);
			
			return def;		
	}

	private String executeExtensiongetEOLexp(Object o,EClass eClass)
	{
		
		ISafeRunnable runnable = new ISafeRunnable() {
			
			@Override
			public void handleException(Throwable e) {
			       System.out.println("Exception in client");
			}

			@Override
			public void run() throws Exception {
				 eolExpression = ((IVisibilityClass) o).getEOLexpressionByEClass(eClass);
				}		
			};
			
			SafeRunner.run(runnable);
			
			return eolExpression;	
	}
	
	public ScopeDefinitionEnum getDef() {
		return def;
	}

	public String getEolExpression() {
		return eolExpression;
	}
	
}
