/*
 * Projet   : Generator
 * Package  : log
 * Source   : Logger.java
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
package org.ludo.utils;

import org.apache.log4j.Logger;

/**
 * <b>Description :</b> <description de la classe>
 * 
 * @version : $Revision$, $Date$
 * @author : $Author$
 * @since : version 1.0.0
 */
public class LoggerManager {

	private static boolean hasBeenInitialized = false;

	static {
		if (!LoggerManager.hasBeenInitialized) {
			LoggerManager.hasBeenInitialized = true;
			// PropertyConfigurator.configure("log4j.properties");
		}
	}

	public static final Logger getLogger(final Class objectClass) {
		return Logger.getLogger(objectClass.getName());
	}

}
