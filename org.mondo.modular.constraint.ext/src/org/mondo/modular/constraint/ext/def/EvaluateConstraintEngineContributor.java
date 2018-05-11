package org.mondo.modular.constraint.ext.def;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.di.annotations.Execute;

public class EvaluateConstraintEngineContributor {
	
	private static final String ICONSTRAINT_EXECUTION_ID = "org.model.constraint.execution.definition.ext";
	
	/*Attributes*/
	private Object resultConstraint = null;	
	
	/*Execute Constraint*/
	
	@Execute
	public void executeConstraint(IExtensionRegistry registry,String paramId, String constraint, URI modelURI, URI metaModelURI,  List<String> metamodelURIs, boolean isUnit){
		
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(ICONSTRAINT_EXECUTION_ID);
		
		try {
		      for (IConfigurationElement e : config) {
		        final Object o =
		            e.createExecutableExtension("class");
		        if (o instanceof IExecuteConstraint) {
		          final String Id = (String) e.getAttribute("Id");
		          if(Id.equals(paramId)){
		        	  executeExtensionConstraint(o,constraint, modelURI, metaModelURI, metamodelURIs, isUnit);
			          break;
		          }
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }		
	}
	
	private void executeExtensionConstraint(Object o, String constraint, URI modelURI, URI metaModelURI, List<String> metamodelURIs, boolean isUnit) {
	
		ISafeRunnable runnable = new ISafeRunnable() {
			
			@Override
			public void handleException(Throwable e) {
			       System.out.println("Exception in client");
			}

			@Override
			public void run() throws Exception {
				resultConstraint =  ((IExecuteConstraint) o).executeConstraint(constraint, modelURI,metaModelURI, metamodelURIs, isUnit);
				}
			};
			SafeRunner.run(runnable);
	}	
	
	public List<String> listContributors(IExtensionRegistry registry) {
		
		List<String> listContributors = new ArrayList<String>();
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(ICONSTRAINT_EXECUTION_ID);
		for (IConfigurationElement e : config)
		{
			Object o = null;
			try {
				o = e.createExecutableExtension("class");
			} catch (CoreException e1) {
				
				e1.printStackTrace();
			}
			if (o instanceof IExecuteConstraint)
			{
				final String Id = (String) e.getAttribute("Id");
				listContributors.add(Id);
			}
		}		
		
		return listContributors;
	}
	
	/*Execute Init*/
	
	@Execute
	public boolean executeInit(IExtensionRegistry registry,String paramId,String modularNature,List<String> listMetamodelURI) {
		
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(ICONSTRAINT_EXECUTION_ID);
		    try {
		      for (IConfigurationElement e : config) {
		        final Object o =
		            e.createExecutableExtension("class");
		        if (o instanceof IExecuteConstraint) {
		          final String Id = (String) e.getAttribute("Id");
		          if(Id.equals(paramId)){
			         return ((IExecuteConstraint) o).init(listMetamodelURI,modularNature);			          
		          }
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }	
		
		return false;	
	}	
	
	/*Execute Update*/
	
	@Execute
	public void executeUpdate(IExtensionRegistry registry,String paramId) {
		
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(ICONSTRAINT_EXECUTION_ID);
		    try {
		      for (IConfigurationElement e : config) {
		        final Object o =
		            e.createExecutableExtension("class");
		        if (o instanceof IExecuteConstraint) {
		          final String Id = (String) e.getAttribute("Id");
		          if(Id.equals(paramId)){
			         ((IExecuteConstraint) o).update();			          
		          }
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }		
	}
	
	
	/*Getters*/
	
	public Object getResultConstraint() {
		return resultConstraint;
	}
	
}
