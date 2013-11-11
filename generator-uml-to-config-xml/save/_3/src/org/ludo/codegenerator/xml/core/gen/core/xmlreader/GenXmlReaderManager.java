package org.ludo.codegenerator.xml.core.gen.core.xmlreader;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;

public class GenXmlReaderManager {
    
    private GenXmlReaderManager() {}
    
    private GenXmlReader genXmlReader = null;
    
    public static final GenXmlReaderManager getGenXmlReaderManager(String fileXml) {
        GenXmlReaderManager genXmlReaderManager = new GenXmlReaderManager();
        GenXmlReader genXmlReader = new GenXmlReader(fileXml);
        genXmlReaderManager.gen = genXmlReader.getGen();
        return genXmlReaderManager;
    }
    
    private Gen gen = null;
    
    public Gen getGen() {
        return gen;
    }
    
}
