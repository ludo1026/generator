package org.ludo.codegenerator.xml.core.gen.test;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.xmlreader.GenXmlReaderManager;

public class TestGen {
	
	private static final String FILECONFIG_PATH = "";
	private static final String FILECONFIG_FILENAME = "config.xml";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String filename = FILECONFIG_PATH + "/" + FILECONFIG_FILENAME;
		GenXmlReaderManager m = GenXmlReaderManager.getGenXmlReaderManager(filename);
		Gen s = m.getGen();
		filename = ""; // Point d'arrêt
	}

}
