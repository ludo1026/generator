package org.ludo.umlgenerator.xml.core.xmlreader.ea;

import java.io.File;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.ludo.umlgenerator.xml.core.bean.IXMI;
import org.ludo.utils.LoggerManager;

public class XMIXmlEAReader {
	
	private static Logger log = LoggerManager.getLogger(XMIXmlEAReader.class);
	
    private String filename = null;
    
    public XMIXmlEAReader(String filename) {
    	this.filename = filename;
    }

    public IXMI getXMI() {
    	Document document = null;

    	//On crée une instance de SAXBuilder
    	SAXBuilder sxb = new SAXBuilder();
    	try
    	{
    		//On crée un nouveau document JDOM avec en argument le fichier XML
    		//Le parsing est terminé ;)
    		document = sxb.build(new File(filename));
    	}
    	catch(Exception e){
    		log.error(e.getMessage(), e);
    		return null;
    	}
    	
    	XMIXmlEAHandler xmiXmlHandler = new XMIXmlEAHandler(document);

    	return xmiXmlHandler.getXMI();
    }

}
