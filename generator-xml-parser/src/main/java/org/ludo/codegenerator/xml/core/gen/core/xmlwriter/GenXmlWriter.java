package org.ludo.codegenerator.xml.core.gen.core.xmlwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.LoggerManager;

public class GenXmlWriter {

	private static Logger log = LoggerManager.getLogger(GenXmlWriter.class);

	private String filename = null;
	private Document document = null;

	public GenXmlWriter(final String filename) {
		this.filename = filename;
	}

	public void write(final Gen gen) {

		// On crée une instance de SAXBuilder
		final SAXBuilder sxb = new SAXBuilder();
		try {
			// On crée un nouveau document JDOM avec en argument le fichier XML
			// Le parsing est terminé ;)
			this.document = sxb.build(new File(this.filename));
		} catch (final Exception e) {
			GenXmlWriter.log.error(e.getMessage(), e);
			return;
		}

		final GenXmlHandler genXmlHandler = new GenXmlHandler(this.document);

		genXmlHandler.write(gen);
	}

	public void save(final String filename) throws FileNotFoundException, IOException {
		AssertHelper.assertDefined(this.document, "objet document XML JDOM");
		final XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
		sortie.output(this.document, new FileOutputStream(filename));
	}

}
