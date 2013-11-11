package org.ludo.utils;

import org.apache.commons.lang.StringUtils;

public class TypeUtils {
	
	public static final int TYPE_NON_DEFINI = 0;
	public static final int TYPE_PRIMITIF = 1;
	public static final int TYPE_ELEMENT_JDK = 2;
	public static final int TYPE_ELEMENT_PROJET = 3;
	
	public static int getType(String type) {
		if( estTypePrimitif(type) ) {
			return TYPE_PRIMITIF;
		}
		if( estTypeElementJdk(type) ) {
			return TYPE_ELEMENT_JDK;
		}
		if( estTypeElementProjet(type) ) {
			return TYPE_ELEMENT_PROJET;
		}
		return TYPE_NON_DEFINI;
	}
	
	private static boolean estTypePrimitif(String type) {
		return
			StringUtils.equalsIgnoreCase(type, "void")
		 || StringUtils.equalsIgnoreCase(type, "int")
		 || StringUtils.equalsIgnoreCase(type, "boolean")
		 || StringUtils.equalsIgnoreCase(type, "double")
		 || StringUtils.equalsIgnoreCase(type, "char")
		;
	}
	
	private static boolean estTypeElementJdk(String type) {
		AssertHelper.assertDefined(type, "type");
		return ! type.contains("#");
	}
	
	private static boolean estTypeElementProjet(String type) {
		AssertHelper.assertDefined(type, "type");
		return type.contains("#");
	}
	
	public static String formatTypeElementJava(String typeElementJdk) {
		return typeElementJdk;
	}
	
	public static String formatTypeElementProjet(String typeElementProjet) {
		return typeElementProjet;
	}

	
}
