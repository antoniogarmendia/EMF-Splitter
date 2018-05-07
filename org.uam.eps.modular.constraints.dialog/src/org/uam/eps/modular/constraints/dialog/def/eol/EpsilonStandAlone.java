package org.uam.eps.modular.constraints.dialog.def.eol;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

public abstract class EpsilonStandAlone {
	
	protected IEolModule module;
	protected List<Variable> parameters = new ArrayList<Variable>();
	
	protected Object result;
	
	public abstract IEolModule createModule();
	
	public abstract List<IModel> getModels() throws Exception;
	
	public void postProcess() {};
	
	public void preProcess() {};
	
	public List<ParseProblem> parse() throws URISyntaxException, Exception {
		
		module = createModule();
		module.parse(getEolModuleURI());
		return module.getParseProblems();	
	}
	
	public void execute() throws Exception {
		
		module = createModule();
		
		if (getEolModuleURI() == null)
			module.parse(getEolModuleString());
		else
			module.parse(getEolModuleURI());
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}
		
		for (IModel model : getModels()) {
			module.getContext().getModelRepository().addModel(model);
		}
		
		for (Variable parameter : parameters) {
			//module.getContext().getFrameStack().putGlobal(parameter);
			module.getContext().getFrameStack().put(parameter);
		}
		
		// use tools contributed via extensions in a standalone Java
		module.getContext().getNativeTypeDelegates().
			add(new ExtensionPointToolNativeTypeDelegate());
		
			
		preProcess();
		result = execute(module);
		postProcess();
		
		module.getContext().getModelRepository().dispose();
	}
	
	public List<Variable> getParameters() {
		return parameters;
	}
	
	protected Object execute(IEolModule module) 
			throws EolRuntimeException {
		return module.execute();
	}
	
	protected EmfModel createEmfModel(String name, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				getMMURI().toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, 
				getModelURI().toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
				storeOnDisposal + "");	
		
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}
	
	public Object getResult() {
		return result;
	}
	
	public abstract URI getMMURI();
	
	public abstract URI getEolModuleURI();
	
	public abstract String getEolModuleString();
	
	public abstract URI getModelURI(); 

}
