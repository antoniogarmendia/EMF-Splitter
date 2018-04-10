package constraints.util;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.mondo.editor.ui.utils.patterns.PatternUtils;

import constraints.Constraint;
import constraints.MetamodelConstraint;
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

public class DSLtaoConstraint {
	
	private IProject project;

	public DSLtaoConstraint(IProject project) {
		super();
		this.project = project;
	}
	
	public PatternInstance transformConstraintToDSLtao(MetamodelConstraint metaModelConstraint) {
		
		// obtain pattern set from project
		PatternSet patternModel = PatternUtils.getPatternSetModel(this.project);
		Pattern consPattern = DSLtaoUtils.getConstraintPattern(patternModel);
		DSLtaoUtils.setPatternAbsoluteUri(this.project, consPattern.eResource());
		
		PatternInstance consInstances = DSLtaoUtils.createPatternInstance(DSLtaoUtils.catConstraint, consPattern);
		
		ComplexFeatureMain rootPattern = consPattern.getRootVariant();
		EList<Variant> patternVariants = rootPattern.getAndChildren();
		Variant consVariant = patternVariants.get(0);
		
		if(consVariant instanceof ComplexFeatureMain) {
			
			//Visibility Pattern
			ComplexFeatureMain defaultMainModularPattern = (ComplexFeatureMain) consVariant; 
			PatternMetaModel mainConsPattern = defaultMainModularPattern.getMetaModel();
			
			ClassInterface consClass = DSLtaoUtils.getClassInterfaceByName(mainConsPattern, "ConstraintClass");
			
			FeatureInterface constraintName = DSLtaoUtils.getFeatureTypeByName(mainConsPattern, "constraintName");
			FeatureInterface statement = DSLtaoUtils.getFeatureTypeByName(mainConsPattern, "statement");
			FeatureInterface errorMessage = DSLtaoUtils.getFeatureTypeByName(mainConsPattern, "errorMessage");
					
			Iterator<Constraint> itConstraintRules = metaModelConstraint.getConstraints().iterator();
			while (itConstraintRules.hasNext()) {
				
				Constraint constraint = (Constraint) itConstraintRules.next();
				if (constraint.getEClass() != null)
					addConstraintClassInstance(consClass,constraint,consInstances,constraintName,statement,errorMessage);				
			}	
		}	
		
		return consInstances;
	}

	private void addConstraintClassInstance(ClassInterface consClass, Constraint constraint, PatternInstance consInstances, 
			FeatureInterface constraintName, FeatureInterface statement, FeatureInterface errorMessage) {
		
		// create class role instance 
		ClassRoleInstance classInstance = RuntimePatternsFactoryImpl.eINSTANCE.createClassRoleInstance();
		classInstance.setRole(consClass);
		classInstance.setElement(constraint.getEClass());
		
		// add name 
		InstanceFeatureRoleInstance featName = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		featName.setRole(constraintName);
		featName.setValue(constraint.getName());
		
		classInstance.getFeatureInstances().add(featName);
		
		// add statement
		InstanceFeatureRoleInstance featStatement = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		featStatement.setRole(statement);
		featStatement.setValue(constraint.getStatement());
		
		classInstance.getFeatureInstances().add(featStatement);
		
		// add error message
		InstanceFeatureRoleInstance featMessage = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		featMessage.setRole(errorMessage);
		featMessage.setValue(constraint.getErrorMessage());
		
		classInstance.getFeatureInstances().add(featMessage);
		
		
		consInstances.getClassInstances().add(classInstance);	
	}

}
