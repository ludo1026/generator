package org.ludo.umlgenerator.xml.core.xmlreader;

import java.io.File;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.ludo.utils.LoggerManager;

public class XMIXmlHeaderReader {

	private static Logger log = LoggerManager.getLogger(XMIXmlHeaderReader.class);

    private String filename = null;

    public XMIXmlHeaderReader(final String filename) {
    	this.filename = filename;
    }

    public String getExporter() {
    	Document document = null;

    	//On crée une instance de SAXBuilder
    	final SAXBuilder sxb = new SAXBuilder();
    	try
    	{
    		//On crée un nouveau document JDOM avec en argument le fichier XML
    		//Le parsing est terminé ;)
    		document = sxb.build(new File(this.filename));
    	}
    	catch(final Exception e){
    		log.error(e.getMessage(), e);
    		return null;
    	}

    	final XMIXmlHeaderHandler xmiXmlHandler = new XMIXmlHeaderHandler(document);

    	return xmiXmlHandler.getExporter();
    }

}
