package visibility.util;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.mondo.editor.ui.utils.patterns.PatternUtils;

import dslPatterns.ClassInterface;
import dslPatterns.ComplexFeatureMain;
import dslPatterns.FeatureInterface;
import dslPatterns.Pattern;
import dslPatterns.PatternMetaModel;
import dslPatterns.PatternSet;
import dslPatterns.Variant;
import runtimePatterns.ClassRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.impl.RuntimePatternsFactoryImpl;
import splitterLibrary.util.DSLtaoUtils;
import visibility.MetamodelVisibility;
import visibility.Visibility;

public class DSLtaoVisibility {
	
	private IProject project;	
	
	public DSLtaoVisibility(IProject project) {
		super();
		this.project = project;
	}
	
	public PatternInstance transformVisibilityToDSLtao(MetamodelVisibility metaModelVisibility) {
		
		// obtain pattern set from project
		PatternSet patternModel = PatternUtils.getPatternSetModel(this.project);
		Pattern visPattern = DSLtaoUtils.getVisibilityPattern(patternModel);
		DSLtaoUtils.setPatternAbsoluteUri(this.project, visPattern.eResource());
		
		PatternInstance visInstances = DSLtaoUtils.createPatternInstance(DSLtaoUtils.catVisibility, visPattern);
		
		ComplexFeatureMain rootPattern = visPattern.getRootVariant();
		EList<Variant> patternVariants = rootPattern.getAndChildren();
		Variant visVariant = patternVariants.get(0);
		
		if(visVariant instanceof ComplexFeatureMain) {
			
			//Visibility Pattern
			ComplexFeatureMain defaultMainModularPattern = (ComplexFeatureMain) visVariant; 
			PatternMetaModel mainVisPattern = defaultMainModularPattern.getMetaModel();
			
			ClassInterface visClass = DSLtaoUtils.getClassInterfaceByName(mainVisPattern, "VisibilityClass");
			
			FeatureInterface eolExpWS = DSLtaoUtils.getFeatureTypeByName(mainVisPattern, "eolExpressionWS");
			FeatureInterface eolExpPro = DSLtaoUtils.getFeatureTypeByName(mainVisPattern, "eolExpressionProject");
			FeatureInterface eolExpPack = DSLtaoUtils.getFeatureTypeByName(mainVisPattern, "eolExpressionPackage");
			FeatureInterface eolExpUnit = DSLtaoUtils.getFeatureTypeByName(mainVisPattern, "eolExpressionUnit");
			
			Iterator<Visibility> itScopeRules = metaModelVisibility.getVisibilityRules().iterator();
			while (itScopeRules.hasNext()) {
				
				Visibility visibility = (Visibility) itScopeRules.next();
				switch (visibility.getVisibility()) {
					
					case WORKSPACE:
						addScopeClassInstance(visibility, visInstances, visClass, visibility.getExpression(), eolExpWS);
						break;
					case PROJECT:
						addScopeClassInstance(visibility, visInstances, visClass, visibility.getExpression(), eolExpPro);
						break;
					case PACKAGE:
						addScopeClassInstance(visibility, visInstances, visClass, visibility.getExpression(), eolExpPack);
						break;
					case UNIT:
						addScopeClassInstance(visibility, visInstances, visClass, visibility.getExpression(), eolExpUnit);
						break;
					default:
						break;						
				}				
			}			
		}		
		
		return visInstances;		
	}

	private void addScopeClassInstance(Visibility visibility, PatternInstance visInstances, ClassInterface visClass,
			String expression, FeatureInterface eolExp) {
		
		// create class role instance 
		ClassRoleInstance classInstance = RuntimePatternsFactoryImpl.eINSTANCE.createClassRoleInstance();
		classInstance.setRole(visClass);
		classInstance.setElement(visibility.getEClass());
		
		// add eol expression
		InstanceFeatureRoleInstance feat = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		feat.setRole(eolExp);
		feat.setValue(visibility.getExpression());
		
		classInstance.getFeatureInstances().add(feat);
		
		visInstances.getClassInstances().add(classInstance);		
	}
	
	

}
