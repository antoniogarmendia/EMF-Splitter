package org.mondo.modular.references.ext;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

public class EvaluateCrossReferencesContributor {
	
	private static final String ICROSS_ID = "org.model.references.definition.ext";
	private List<?> choiceOfValues;
	
	@Execute
	public void execute(IExtensionRegistry registry, String paramId, String modularNature, Resource res, 
							boolean searchWS,EClass anEClass, String eolExpression){	
		
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(ICROSS_ID);
		    try {
		      for (IConfigurationElement e : config) {
		        final Object o =
		            e.createExecutableExtension("class");
		        if (o instanceof IEditorCrossReferences) {
		          final String Id = (String) e.getAttribute("Id");
		          if(Id.equals(paramId)){
			          executeExtension(o,modularNature,res,searchWS,anEClass,eolExpression);
			          break;
		          }
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }
	}

	private void executeExtension(Object o, String modularNature, Resource res,boolean searchWS,EClass anEClass,String eolExpression) {
		
		ISafeRunnable runnable = new ISafeRunnable() {
		
		@Override
		public void handleException(Throwable e) {
		       System.out.println("Exception in client");
		}

		@Override
		public void run() throws Exception {
			choiceOfValues = ((IEditorCrossReferences) o).getChoicesOfValues(modularNature,res,searchWS,anEClass,eolExpression);
			}
		};
		SafeRunner.run(runnable);
	}	
	
	public List<?> getChoicesofValues(){
		return choiceOfValues;
	}
	
	public List<String> ListNames(IExtensionRegistry registry, String modularNature){
		
		List<String> listNames = new ArrayList<String>();
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(ICROSS_ID);
		for (IConfigurationElement e : config)
		{
			Object o = null;
			try {
				o = e.createExecutableExtension("class");
			} catch (CoreException e1) {
				
				e1.printStackTrace();
			}
			if (o instanceof IEditorCrossReferences)
			{
				if(((IEditorCrossReferences)o).isGlobal() == true || ((IEditorCrossReferences)o).isNature(modularNature) == true)
				{
					final String Id = (String) e.getAttribute("Id");
					listNames.add(Id);
				}				
			}
		}
		return listNames;
	}
	
	public boolean executeInit(IExtensionRegistry registry,String paramId,String modularNature,List<String> listMetamodelURI){
		
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(ICROSS_ID);
		    try {
		      for (IConfigurationElement e : config) {
		        final Object o =
		            e.createExecutableExtension("class");
		        if (o instanceof IEditorCrossReferences) {
		          final String Id = (String) e.getAttribute("Id");
		          if(Id.equals(paramId)){
			         return ((IEditorCrossReferences) o).init(listMetamodelURI,modularNature);			          
		          }
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }	
		
		return false;
	}
	
	public boolean executeFinish(IExtensionRegistry registry,String paramId, String modularNature){

		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(ICROSS_ID);
		    try {
		      for (IConfigurationElement e : config) {
		        final Object o =
		            e.createExecutableExtension("class");
		        if (o instanceof IEditorCrossReferences) {
		          final String Id = (String) e.getAttribute("Id");
		          if(Id.equals(paramId)){
			         return ((IEditorCrossReferences) o).finish(modularNature);			          
		          }
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }	
		
		return false;		
	}
}
