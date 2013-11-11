package org.ludo.xmlbeangen.xml;

import org.apache.commons.lang.StringUtils;

public class NomHelper {
	
    public static String formaterNomXmlEnNomJava(String nomXml) {
    	String nomJava = nomXml;
    	String[] nomJavaArray = StringUtils.split(nomJava, '.');
    	boolean estPremier = true;
    	for( int i=0; i<nomJavaArray.length; i++ ) {
    		if( ! StringUtils.isBlank(nomJavaArray[i]) ) {
    			if( estPremier ) {
    				estPremier = false;
    				nomJava = StringUtils.uncapitalize(nomJavaArray[i]);
    			} else {
    				nomJava += StringUtils.capitalize(nomJavaArray[i]);
    			}
    		}
    	}
    	nomJavaArray = StringUtils.split(nomJava, '-');
    	estPremier = true;
    	for( int i=0; i<nomJavaArray.length; i++ ) {
    		if( ! StringUtils.isBlank(nomJavaArray[i]) ) {
    			if( estPremier ) {
    				estPremier = false;
    				nomJava = StringUtils.uncapitalize(nomJavaArray[i]);
    			} else {
    				nomJava += StringUtils.capitalize(nomJavaArray[i]);
    			}
    		}
    	}
    	return nomJava;
    }
	
}
