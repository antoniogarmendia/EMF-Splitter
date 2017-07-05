package index.util;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.mondo.editor.ui.utils.patterns.PatternUtils;

import dslPatterns.ClassInterface;
import dslPatterns.ComplexFeatureMain;
import dslPatterns.FeatureInterface;
import dslPatterns.FeatureType;
import dslPatterns.Pattern;
import dslPatterns.PatternMetaModel;
import dslPatterns.PatternSet;
import dslPatterns.Variant;
import index.Index;
import index.MetamodelIndex;
import runtimePatterns.ClassRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.TypeFeatureRoleInstance;
import runtimePatterns.impl.RuntimePatternsFactoryImpl;
import splitterLibrary.util.DSLtaoUtils;

public class DSLtaoIndex {
	
	private IProject project;
	
	public DSLtaoIndex(IProject project) {
		
		super();
		this.project = project;
	}
	
	public PatternInstance transformIndexToDSLtao(MetamodelIndex metaModelIndex) {
		
		// obtain pattern set from project
		PatternSet patternModel = PatternUtils.getPatternSetModel(this.project);
		Pattern indexPattern = DSLtaoUtils.getIndexPattern(patternModel);
		DSLtaoUtils.setPatternAbsoluteUri(this.project, indexPattern.eResource());
		
		PatternInstance indexInstances = DSLtaoUtils.createPatternInstance(DSLtaoUtils.catIndex, indexPattern);
		ComplexFeatureMain rootPattern = indexPattern.getRootVariant();
		EList<Variant> patternVariants = rootPattern.getAndChildren();
		Variant indexVariant = patternVariants.get(0);
		
		if(indexVariant instanceof ComplexFeatureMain) {
			
			// Index Pattern
			ComplexFeatureMain defaultMainModularPattern = (ComplexFeatureMain) indexVariant; 
			PatternMetaModel mainIndexPattern = defaultMainModularPattern.getMetaModel();
			
			ClassInterface indexClass = DSLtaoUtils.getClassInterfaceByName(mainIndexPattern, "IndexClass");
			FeatureInterface attrFeat = DSLtaoUtils.getFeatureTypeByName(mainIndexPattern, "indexAttribute");
						
			Iterator<Index> itIndexes = metaModelIndex.getIndexes().iterator();
			while (itIndexes.hasNext()) {
				Index index = (Index) itIndexes.next();
				addIndexClassInstance(indexInstances,index,indexClass,attrFeat);
			}
		}
		
		return indexInstances;
	}

	private void addIndexClassInstance(PatternInstance indexInstances, Index index, ClassInterface indexClass, FeatureInterface attrFeat) {
		
		// create class role instance 
		ClassRoleInstance classInstance = RuntimePatternsFactoryImpl.eINSTANCE.createClassRoleInstance();
		classInstance.setRole(indexClass);
		classInstance.setElement(index.getEClass());
		
		// add index attribute
		TypeFeatureRoleInstance typeFeat = RuntimePatternsFactoryImpl.eINSTANCE.createTypeFeatureRoleInstance();
		typeFeat.setElement(index.getEAttribute());
		typeFeat.setRole((FeatureType) attrFeat);
		
		classInstance.getFeatureInstances().add(typeFeat);
		
		indexInstances.getClassInstances().add(classInstance);
	}

}
