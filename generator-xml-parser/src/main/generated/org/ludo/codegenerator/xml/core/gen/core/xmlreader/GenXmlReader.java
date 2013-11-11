package org.ludo.codegenerator.xml.core.gen.core.xmlreader;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.utils.CreateParser;

public class GenXmlReader {
    
    /** Default parser name. */
    protected static final String DEFAULT_PARSER_NAME = "org.apache.xerces.parsers.SAXParser";
    
    private String filename = null;
    
    public GenXmlReader(String filename) {
        this.filename = filename;
    }
    
    public Gen getGen() {
        
        // Create Handler
        GenXmlHandler c = new GenXmlHandler();
		
        // Create the parser
        CreateParser parser = new CreateParser(c);
		
        // Parse the XML file, handler generates the output
        parser.parse(filename);
		
        return c.getGen();
    }
    
}
