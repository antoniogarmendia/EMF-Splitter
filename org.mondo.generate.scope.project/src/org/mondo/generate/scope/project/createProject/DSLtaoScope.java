package org.mondo.generate.scope.project.createProject;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.mondo.editor.ui.utils.patterns.PatternUtils;

import ScopeDefinition.MetaModelScope;
import ScopeDefinition.ScopeRule;
import dslPatterns.ClassInterface;
import dslPatterns.ComplexFeatureMain;
import dslPatterns.Pattern;
import dslPatterns.PatternMetaModel;
import dslPatterns.PatternSet;
import dslPatterns.ReferenceInterface;
import dslPatterns.Variant;
import runtimePatterns.ClassRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.ReferenceRoleInstance;
import runtimePatterns.impl.RuntimePatternsFactoryImpl;
import splitterLibrary.util.DSLtaoUtils;

public class DSLtaoScope {
	
	private IProject project;	
		
	public DSLtaoScope(IProject project) {
		
		super();
		this.project = project;		
	}
	
	public PatternInstance transformScopeToDSLtao(MetaModelScope metaModelScope) {
		
		// obtain pattern set from project
		PatternSet patternModel = PatternUtils.getPatternSetModel(this.project);
		Pattern scopePattern = DSLtaoUtils.getScopePattern(patternModel);
		DSLtaoUtils.setPatternAbsoluteUri(this.project, scopePattern.eResource());
		
		PatternInstance scopeInstances = DSLtaoUtils.createPatternInstance(DSLtaoUtils.catScope, scopePattern);
		
		ComplexFeatureMain rootPattern = scopePattern.getRootVariant();
		EList<Variant> patternVariants = rootPattern.getAndChildren();
		Variant scopeVariant = patternVariants.get(0);
		
		if(scopeVariant instanceof ComplexFeatureMain){
		
			//Scope Pattern
			ComplexFeatureMain defaultMainModularPattern = (ComplexFeatureMain) scopeVariant; 
			PatternMetaModel mainScopePattern = defaultMainModularPattern.getMetaModel();
			
			ClassInterface scopeClass = DSLtaoUtils.getClassInterfaceByName(mainScopePattern, "ScopeClass");
			ReferenceInterface referenceWorkspace = DSLtaoUtils.getReferenceInterfaceByName(mainScopePattern, "rSameWorkSpace");
			ReferenceInterface referenceProject = DSLtaoUtils.getReferenceInterfaceByName(mainScopePattern, "rSameProject");
			ReferenceInterface referencePackage = DSLtaoUtils.getReferenceInterfaceByName(mainScopePattern, "rSamePackage");
			ReferenceInterface referenceUnit = DSLtaoUtils.getReferenceInterfaceByName(mainScopePattern, "rSameUnit");
						
			Iterator<ScopeRule> itScopeRules = metaModelScope.getScopeRules().iterator();
			while (itScopeRules.hasNext()) {
			
				ScopeRule scopeRule = (ScopeRule) itScopeRules.next();
				// add class role instance		
				switch(scopeRule.getScopeDefinition()) {
				
					case SAME_WORKSPACE:
						addScopeClassInstance(scopeRule, scopeInstances, scopeClass, scopeRule.getEReference(), referenceWorkspace);
						break;		
					case SAME_PROJECT:
						addScopeClassInstance(scopeRule, scopeInstances, scopeClass, scopeRule.getEReference(), referenceProject);
						break;
					case SAME_PACKAGE:
						addScopeClassInstance(scopeRule, scopeInstances, scopeClass, scopeRule.getEReference(), referencePackage);
						break;					
					case SAME_UNIT:
						addScopeClassInstance(scopeRule, scopeInstances, scopeClass, scopeRule.getEReference(), referenceUnit);
						break;					
					default:
						break;				
				}				
			}		
		}
		
		return scopeInstances;
	}
	
	private void addScopeClassInstance(ScopeRule scopeRule, PatternInstance scopeInstances, ClassInterface classInterface,
			EReference eReference, ReferenceInterface referenceInterface) {
		
		// create class role instance 
		ClassRoleInstance classInstance = RuntimePatternsFactoryImpl.eINSTANCE.createClassRoleInstance();
		classInstance.setRole(classInterface);
		classInstance.setElement(scopeRule.getEClass());
		
		// add reference
		ReferenceRoleInstance reference = RuntimePatternsFactoryImpl.eINSTANCE.createReferenceRoleInstance();
		reference.setRole(referenceInterface);
		reference.setElement(eReference);
		classInstance.getReferenceInstances().add(reference);
	
		scopeInstances.getClassInstances().add(classInstance);
	}

}
