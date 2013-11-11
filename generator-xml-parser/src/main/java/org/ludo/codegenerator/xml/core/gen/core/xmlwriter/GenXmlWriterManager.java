package org.ludo.codegenerator.xml.core.gen.core.xmlwriter;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;

public class GenXmlWriterManager {

	private GenXmlWriterManager() {
	}

	private GenXmlWriter generatorXmlWriter = null;

	public static final GenXmlWriterManager getGenWriterManager(final String fileXml) {
		final GenXmlWriterManager genXmlWriterManager = new GenXmlWriterManager();
		final GenXmlWriter generatorXmlWriter = new GenXmlWriter(fileXml);
		genXmlWriterManager.generatorXmlWriter = generatorXmlWriter;
		return genXmlWriterManager;
	}

	public void write(final Gen gen) {
		this.generatorXmlWriter.write(gen);
	}

	public void save(final String fichier) throws FileNotFoundException, IOException {
		this.generatorXmlWriter.save(fichier);
	}

}
