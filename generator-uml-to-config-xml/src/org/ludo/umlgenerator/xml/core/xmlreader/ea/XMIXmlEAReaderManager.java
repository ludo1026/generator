package org.ludo.umlgenerator.xml.core.xmlreader.ea;

import org.ludo.umlgenerator.xml.core.bean.IXMI;


public class XMIXmlEAReaderManager {
    
    private XMIXmlEAReaderManager() {}
    
    private XMIXmlEAReader generatorXmlReader = null;
    
    public static final XMIXmlEAReaderManager getXMIReaderManager(String fileXml) {
    	XMIXmlEAReaderManager xmiXmlReaderManager = new XMIXmlEAReaderManager();
        XMIXmlEAReader generatorXmlReader = new XMIXmlEAReader(fileXml);
        xmiXmlReaderManager.xmi = generatorXmlReader.getXMI();
        return xmiXmlReaderManager;
    }
    
    private IXMI xmi = null;
    
    public IXMI getXMI() {
        return xmi;
    }
    
}
