package org.ludo.umlgenerator.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.ludo.umlgenerator.xml.core.bean.IXMI;
import org.ludo.umlgenerator.xml.core.xmlreader.TypeXmiExporter;
import org.ludo.umlgenerator.xml.core.xmlreader.XMIXmlHeaderReaderManager;
import org.ludo.umlgenerator.xml.core.xmlreader.argouml.XMIXmlArgoUMLReaderManager;
import org.ludo.umlgenerator.xml.core.xmlreader.ea.XMIXmlEAReaderManager;
import org.ludo.umlgenerator.xml.core.xmlwriter.GenXmlWriterManager;
import org.ludo.utils.AssertHelper;

/**
 * ** umlgenerator **
 */
public class CodeGeneratorMain {

	private static final String REPERTOIRE_PROJET = "";
	// private static final String REPERTOIRE_PROJET =
	// "C:\\BPLG\\FR\\CodeGeneratorFinal\\";
	// private static final String REPERTOIRE_PROJET =
	// "D:\\Dev\\Travail\\UML\\workspace\\CodeGeneratorFinal\\";

	private static final String XMI_FILE = CodeGeneratorMain.REPERTOIRE_PROJET + "generation_CodeGeneratorFinal/codegenerator_bean_template/umlgenerator/model.xmi";
	private static final String GEN_FILE = CodeGeneratorMain.REPERTOIRE_PROJET + "generation_CodeGeneratorFinal/codegenerator_bean_template/codegenerator/config.xml";

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final XMIXmlHeaderReaderManager xmiXmlHeaderReaderManager = XMIXmlHeaderReaderManager.getXMIReaderManager(CodeGeneratorMain.XMI_FILE);

		final TypeXmiExporter typeXmiExporter = xmiXmlHeaderReaderManager.getTypeXmiExporter();

		IXMI xmi = null;
		if (typeXmiExporter == TypeXmiExporter.XMI_EXPORTER__ARGO_UML) {
			final XMIXmlArgoUMLReaderManager xmiXmlArgoUMLReaderManager = XMIXmlArgoUMLReaderManager.getXMIReaderManager(CodeGeneratorMain.XMI_FILE);

			xmi = xmiXmlArgoUMLReaderManager.getXMI();
		} else if (typeXmiExporter == TypeXmiExporter.XMI_EXPORTER__ENTERPRISE_ARCHITECT) {
			final XMIXmlEAReaderManager xmiXmlEAReaderManager = XMIXmlEAReaderManager.getXMIReaderManager(CodeGeneratorMain.XMI_FILE);

			xmi = xmiXmlEAReaderManager.getXMI();
		}

		AssertHelper.assertNotNull(xmi, "xmi");

		final GenXmlWriterManager genXmlWriterManager = GenXmlWriterManager.getXMIWriterManager(CodeGeneratorMain.GEN_FILE);

		genXmlWriterManager.write(xmi);

		try {
			genXmlWriterManager.save(CodeGeneratorMain.GEN_FILE);
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

}
