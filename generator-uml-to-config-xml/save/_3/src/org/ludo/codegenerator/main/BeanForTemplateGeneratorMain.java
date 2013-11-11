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
import org.ludo.umlgenerator.xml.core.bean.IXMI;
import org.ludo.umlgenerator.xml.core.xmlreader.XMIXmlReaderManager;
import org.ludo.umlgenerator.xml.core.xmlwriter.GenXmlWriterManager;
import org.ludo.utils.LoggerManager;

/**
 * ** codegenerator **
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class BeanForTemplateGeneratorMain {
    
    private static Logger log = LoggerManager.getLogger(BeanForTemplateGeneratorMain.class);
    
	public static final String CONFIG_FILE = "generation_CodeGeneratorFinal/codegenerator_bean_template/codegenerator/config.xml";
	
    private static final String XMI_FILE = "generation_CodeGeneratorFinal/codegenerator_bean_template/umlgenerator/model.xmi";
	
    
    public static void main(String[] args) {
        
        try {
            
    		XMIXmlReaderManager xmiXmlReaderManager =
    			XMIXmlReaderManager.getXMIReaderManager(XMI_FILE);
    		
    		IXMI xmi = xmiXmlReaderManager.getXMI();
    		
    		GenXmlWriterManager genXmlWriterManager = 
    			GenXmlWriterManager.getXMIWriterManager(CONFIG_FILE);
    		
    		genXmlWriterManager.write(xmi);
    		
   			genXmlWriterManager.save(CONFIG_FILE);
    		
   			log.info("OK : Le fichier de configuration a ÚtÚ mis Ó jour");
   			
   			ProcessManager p = new ProcessManager(CONFIG_FILE);
            
            p.genererFichier();
            
        } catch (Exception e) {
            // TODO Bloc catch auto-généré
            e.printStackTrace();
        }

        
    }
}
