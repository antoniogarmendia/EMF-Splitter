package org.mondo.generate.index.project.ext;

public interface IIndexAttribute {
	
	public boolean addIndexedAttribute(String metamodel, String anEClass, String attribute);
	//Maybe Int or String to support
	//0-We cannot add the indexed attribute
	//1-The attribute has already been indexed
	//2-Index Successful

}
