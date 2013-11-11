package org.ludo.umlgenerator.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.ludo.umlgenerator.xml.core.bean.IXMI;
import org.ludo.umlgenerator.xml.core.xmlreader.XMIXmlReaderManager;
import org.ludo.umlgenerator.xml.core.xmlwriter.GenXmlWriterManager;

/**
 * ** umlgenerator **
 */
public class CodeGeneratorMain {
	
	private static final String REPERTOIRE_PROJET = "";
	//private static final String REPERTOIRE_PROJET = "D:\\Dev\\Travail\\UML\\workspace\\CodeGeneratorFinal\\";
	
	private static final String XMI_FILE = REPERTOIRE_PROJET + "config\\umlgenerator\\model.xmi";
	private static final String GEN_FILE = REPERTOIRE_PROJET + "config\\codegenerator\\config.xml";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		XMIXmlReaderManager xmiXmlReaderManager = XMIXmlReaderManager.getXMIReaderManager(XMI_FILE);
		
		IXMI xmi = xmiXmlReaderManager.getXMI();
		
		GenXmlWriterManager genXmlWriterManager = GenXmlWriterManager.getXMIWriterManager(GEN_FILE);
		
		genXmlWriterManager.write(xmi);
		
		try {
			genXmlWriterManager.save(GEN_FILE);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
