package org.ludo.umlgenerator.xml.core.xmlreader.argouml;

import org.ludo.umlgenerator.xml.core.bean.IXMI;


public class XMIXmlArgoUMLReaderManager {
    
    private XMIXmlArgoUMLReaderManager() {}
    
    private XMIXmlArgoUMLReader generatorXmlReader = null;
    
    public static final XMIXmlArgoUMLReaderManager getXMIReaderManager(String fileXml) {
    	XMIXmlArgoUMLReaderManager xmiXmlReaderManager = new XMIXmlArgoUMLReaderManager();
        XMIXmlArgoUMLReader generatorXmlReader = new XMIXmlArgoUMLReader(fileXml);
        xmiXmlReaderManager.xmi = generatorXmlReader.getXMI();
        return xmiXmlReaderManager;
    }
    
    private IXMI xmi = null;
    
    public IXMI getXMI() {
        return xmi;
    }
    
}
