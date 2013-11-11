package org.ludo.codegenerator.core;

import org.apache.commons.lang.StringUtils;
import org.ludo.utils.AssertHelper;

public class StringUtilsInstance extends org.apache.commons.lang.StringUtils {

	private StringUtilsInstance() {}

	private static StringUtilsInstance _instance = null;

	public static StringUtilsInstance getInstance() {
		if( _instance == null ) {
			_instance = new StringUtilsInstance();
		}
		return _instance;
	}

	public String minuscule(final String str) {
	    return StringUtils.uncapitalize(str);
	}

    public String majuscule(final String str) {
        return StringUtils.capitalize(str);
    }

    public String toutMajuscule(final String str) {
        return StringUtils.upperCase(str);
    }

    public String toutMinuscule(final String str) {
        return StringUtils.lowerCase(str);
    }

    public String constante(final String str) {
        AssertHelper.assertDefinedArgument(str, "chaîne de caractères à traiter", "constante");
        String strCap = capitalize(trim(str));
        final char[] tableLettre = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        for (int i=0; i < tableLettre.length; i++) {
            strCap = strCap.replace("" + tableLettre[i], "_" + tableLettre[i]);
        }
        // Enlève le premier underscore créé
        strCap = strCap.substring(1, strCap.length());
        strCap = upperCase(strCap);
        return strCap;
    }

}
