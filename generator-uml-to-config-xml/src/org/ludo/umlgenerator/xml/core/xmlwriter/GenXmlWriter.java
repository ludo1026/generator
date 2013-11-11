package org.ludo.umlgenerator.xml.core.xmlwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.ludo.umlgenerator.xml.core.bean.IXMI;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.LoggerManager;

public class GenXmlWriter {
	
	private static Logger log = LoggerManager.getLogger(GenXmlWriter.class);
	
    private String filename = null;
	private Document document = null;
    
    public GenXmlWriter(String filename) {
    	this.filename = filename;
    }

    public void write(IXMI xmi) {

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
    		return;
    	}
    	
    	GenXmlHandler genXmlHandler = new GenXmlHandler(document);
    	
    	genXmlHandler.write(xmi);
    }
    
    public void save(String filename) throws FileNotFoundException, IOException {
    	AssertHelper.assertDefined(document, "objet document XML JDOM");
    	XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
        sortie.output(this.document, new FileOutputStream(filename));
    }

}
