/*
 * Projet   : Generator
 * Package  : generator.core
 * Source   : Genexecutor.java
 * Création : CHABOUD   Date : 28 mars 2007
 * Copyright (C) 2007   Apria RSA
 *
 * --------------- Dernière mise à jour ---------------------
 * @author  : $author$
 * @version : $Revision$, $Date$
 * --------------- Historique -------------------------------
 * Auteur :                      Date : ../../....
 * Motif  :
 */
package org.ludo.codegenerator.main;

import org.apache.log4j.Logger;
import org.ludo.codegenerator.core.ProcessManager;
import org.ludo.utils.LoggerManager;

/**
 * ** codegenerator **
 * 
 * @version : $Revision$, $Date$
 * @author : $Author$
 * @since : version 1.0.0
 */
public class CodeGeneratorMain {

	private static Logger log = LoggerManager.getLogger(CodeGeneratorMain.class);

	public static final String CONFIG_FILE = "config/config.xml";
	public static final String CONFIG_FOR_CLASSE_FILE = "config/config-classes.xml";

	private static final String XMI_FILE = "config/umlgenerator/model.xmi";

	public static void main(final String[] args) {

		try {
			/*
			 * final XMIXmlHeaderReaderManager xmiXmlHeaderReaderManager =
			 * XMIXmlHeaderReaderManager.getXMIReaderManager(XMI_FILE);
			 * 
			 * final TypeXmiExporter typeXmiExporter =
			 * xmiXmlHeaderReaderManager.getTypeXmiExporter();
			 * 
			 * IXMI xmi = null;
			 * 
			 * if (typeXmiExporter == TypeXmiExporter.XMI_EXPORTER__ARGO_UML) {
			 * final XMIXmlArgoUMLReaderManager xmiXmlArgoUMLReaderManager =
			 * XMIXmlArgoUMLReaderManager.getXMIReaderManager(XMI_FILE);
			 * 
			 * xmi = xmiXmlArgoUMLReaderManager.getXMI(); } else if
			 * (typeXmiExporter ==
			 * TypeXmiExporter.XMI_EXPORTER__ENTERPRISE_ARCHITECT) { final
			 * XMIXmlEAReaderManager xmiXmlEAReaderManager =
			 * XMIXmlEAReaderManager.getXMIReaderManager(XMI_FILE);
			 * 
			 * xmi = xmiXmlEAReaderManager.getXMI(); }
			 * 
			 * AssertHelper.assertNotNull(xmi, "xmi");
			 * 
			 * final GenXmlWriterManager genXmlWriterManager =
			 * GenXmlWriterManager.getXMIWriterManager(CONFIG_FILE);
			 * 
			 * genXmlWriterManager.write(xmi);
			 * 
			 * genXmlWriterManager.save(CONFIG_FILE);
			 */
			CodeGeneratorMain.log.info("OK : Le fichier de configuration a ÚtÚ mis Ó jour");

			final ProcessManager p = new ProcessManager(CodeGeneratorMain.CONFIG_FILE, CodeGeneratorMain.CONFIG_FOR_CLASSE_FILE);

			p.genererFichier();

		} catch (final Exception e) {
			// TODO Bloc catch auto-généré
			e.printStackTrace();
		}

	}
}
