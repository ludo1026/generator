/*
 * Projet   : Generator
 * Package  : generator.core
 * Source   : Genexecutor.java
 * CrÃ©ation : CHABOUD   Date : 28 mars 2007
 * Copyright (C) 2007   Apria RSA
 *
 * --------------- DerniÃ¨re mise Ã  jour ---------------------
 * @author  : $author$
 * @version : $Revision$, $Date$
 * --------------- Historique -------------------------------
 * Auteur :                      Date : ../../....
 * Motif  :
 */
package org.ludo.xmlbeangen;

import com.thaiopensource.relaxng.translate.Driver;

/**
 * <b>Description :</b> <description de la classe>
 * 
 * @version : $Revision$, $Date$
 * @author : $Author$
 * @since : version 1.0.0
 */
public class ConfigXmlBeanParserGeneratorMain {

	public static final String CONFIG_FILE = "config/config.xml";

	public static void main(final String[] args) {

		try {

			final ProcessManager p = new ProcessManager(ConfigXmlBeanParserGeneratorMain.CONFIG_FILE);

			p.process();

			// Générer le fichier XSD
			Driver.main(new String[] { "config/xmlmodele/classesgen.xml", "generated/config.xsd" });

		} catch (final Exception e) {
			e.printStackTrace();
		}

	}
}
