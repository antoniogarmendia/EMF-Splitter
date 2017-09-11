package org.mondo.generate.modular.project.ext;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.IProgressMonitor;

public interface IModularBuilder {
	
	public IProject[] build(int kind, Map<String, String> args, IncrementalProjectBuilder builder, IProgressMonitor monitor);
}
