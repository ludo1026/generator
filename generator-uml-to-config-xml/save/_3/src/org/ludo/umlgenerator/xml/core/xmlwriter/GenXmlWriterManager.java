package org.ludo.umlgenerator.xml.core.xmlwriter;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.ludo.umlgenerator.xml.core.bean.IXMI;


public class GenXmlWriterManager {
    
    private GenXmlWriterManager() {}
    
    private GenXmlWriter generatorXmlWriter = null;
    
    public static final GenXmlWriterManager getXMIWriterManager(String fileXml) {
    	GenXmlWriterManager xmiXmlWriterManager = new GenXmlWriterManager();
        GenXmlWriter generatorXmlWriter = new GenXmlWriter(fileXml);
        xmiXmlWriterManager.generatorXmlWriter = generatorXmlWriter;
        return xmiXmlWriterManager;
    }
    
    public void write(IXMI xmi) {
    	generatorXmlWriter.write(xmi);
    }
    
    public void save(String fichier) throws FileNotFoundException, IOException
    {
    	generatorXmlWriter.save(fichier);
    }
    
}
