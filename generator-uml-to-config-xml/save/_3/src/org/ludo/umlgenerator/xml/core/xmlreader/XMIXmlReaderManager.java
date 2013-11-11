package org.ludo.umlgenerator.xml.core.xmlreader;

import org.ludo.umlgenerator.xml.core.bean.IXMI;


public class XMIXmlReaderManager {
    
    private XMIXmlReaderManager() {}
    
    private XMIXmlReader generatorXmlReader = null;
    
    public static final XMIXmlReaderManager getXMIReaderManager(String fileXml) {
    	XMIXmlReaderManager xmiXmlReaderManager = new XMIXmlReaderManager();
        XMIXmlReader generatorXmlReader = new XMIXmlReader(fileXml);
        xmiXmlReaderManager.xmi = generatorXmlReader.getXMI();
        return xmiXmlReaderManager;
    }
    
    private IXMI xmi = null;
    
    public IXMI getXMI() {
        return xmi;
    }
    
}
