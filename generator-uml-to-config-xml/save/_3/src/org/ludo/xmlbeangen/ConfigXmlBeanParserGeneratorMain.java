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
package org.ludo.xmlbeangen;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class ConfigXmlBeanParserGeneratorMain {
    
    public static final String CONFIG_FILE = "generation_CodeGeneratorFinal/parser_configXml/xmlbeangen/config.xml";
    
    public static void main(String[] args) {
        
        try {
            
            ProcessManager p = new ProcessManager(CONFIG_FILE);
            
            p.process();
            
        } catch (Exception e) {
            // TODO Bloc catch auto-généré
            e.printStackTrace();
        }

        
    }
}
