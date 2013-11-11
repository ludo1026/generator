package org.ludo.codegenerator.core;

public class StringUtilsInstance extends org.apache.commons.lang.StringUtils {
	
	private StringUtilsInstance() {}
	
	private static StringUtilsInstance _instance = null;
	
	public static StringUtilsInstance getInstance() {
		if( _instance == null ) {
			_instance = new StringUtilsInstance();
		}
		return _instance;
	}
	
}
