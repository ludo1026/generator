package org.ludo.umlgenerator.xml.core.xmlreader;



public class XMIXmlHeaderReaderManager {

    private XMIXmlHeaderReaderManager() {}

    private XMIXmlHeaderReader generatorXmlReader = null;

    public static final XMIXmlHeaderReaderManager getXMIReaderManager(final String fileXml) {
    	final XMIXmlHeaderReaderManager xmiXmlReaderManager = new XMIXmlHeaderReaderManager();
        final XMIXmlHeaderReader generatorXmlReader = new XMIXmlHeaderReader(fileXml);
        xmiXmlReaderManager.exporter = generatorXmlReader.getExporter();
        xmiXmlReaderManager.typeXmiExporter =
            TypeXmiExporterManager.getTypeXmiExporter(xmiXmlReaderManager.exporter);
        return xmiXmlReaderManager;
    }

    private String exporter = null;
    private TypeXmiExporter typeXmiExporter = null;

    public String getExporter() {
        return this.exporter;
    }

    public TypeXmiExporter getTypeXmiExporter() {
        return this.typeXmiExporter;
    }

}
