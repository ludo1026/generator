package org.ludo.umlgenerator.xml.core.xmlreader;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.ludo.umlgenerator.xml.utils.Noeud;
import org.ludo.umlgenerator.xml.utils.XmlUtils;
import org.ludo.utils.LoggerManager;

public class XMIXmlHeaderHandler {

	private static Logger log = LoggerManager.getLogger(XMIXmlHeaderHandler.class);

	private static interface NOEUD {
		public final String HEADER = "XMI.header";
		public final String DOCUMENTATION = "XMI.documentation";
		public final String EXPORTER = "XMI.exporter";
		public final String EXPORTER_VERSION = "XMI.exporterVersion";
	}

	private final Document document;

	public XMIXmlHeaderHandler(final Document document) {
	    this.loadXMI(document);

		this.document = document;
	}

	private String exporter = null;

	public String getExporter() {
	    return this.exporter;
	}

	private void loadXMI(final Document document) {
		final Element racine = document.getRootElement();
		if( racine == null ) {
			return;
		}

        this.exporter =
            getExporter(
                document
            );

		return;
	}

	/*
	 *
	 * Méthodes utilitaires
	 *
	 */
	/*
	private void parcourir(Element element) {
		parcourir(element,1);
	}

	private void parcourir(Element element, int niveau) {
		if( element == null ) {
			return;
		}
		int i=0;
		StringBuffer strAffich = new StringBuffer("");
		while(i<niveau-1) {
			strAffich.append(" | ");
			i++;
		}
		if(i<niveau) {
			strAffich.append(" + ");
		}
		strAffich.append(element.getName());
		if( element.getAttributeValue("name") != null ) {
			strAffich.append(" -|- [NAME:'"+element.getAttributeValue("name")+"']");
		}
		log.debug(strAffich.toString());
		List listeChildren = getChildren(element);
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element children = (Element) iterChildren.next();
			parcourir(children,niveau+1);
		}

	}

	private List getChildren(Element element) {
		List listeElementFils = new ArrayList();
		List listeChildren = element.getChildren();
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element elementFils = (Element) iterChildren.next();
			listeElementFils.add(elementFils);
		}
		return listeElementFils;
	}

	private List getChildren(Element element, String nomNoeud) {
		AssertHelper.assertDefined(nomNoeud, "nom du noeud");
		List listeElementFils = new ArrayList();
		List listeChildren = element.getChildren();
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element elementFils = (Element) iterChildren.next();
			if( nomNoeud.equals(elementFils.getName()) ) {
				listeElementFils.add(elementFils);
			}
		}
		return listeElementFils;
	}

	private static Noeud getNoeudFromElement(Element element) {
		Noeud noeud =
			new Noeud(
				element.getName(),
				element.getAttributeValue("name")
			);
		return noeud;
	}

	private Element acceder(Element element, List listeNoeud) {
		XmlUtils.
	}
	*/
	/*
	 *
	 * Méthodes de lecture du fichier XML
	 *
	 */

	/**
	 * Récupération de l'exporteur
	 */

	private String getExporter(final Document document) {
		final Element elementExporter = getElementExporter(document);
		final String nomExporter = elementExporter.getText();
		return nomExporter;
	}

	private Element getElementExporter(final Document document) {
		final Element racine = document.getRootElement();
		final List listeNoeud = new ArrayList();
		listeNoeud.add(new Noeud(NOEUD.HEADER,null));
		listeNoeud.add(new Noeud(NOEUD.DOCUMENTATION,null));
		listeNoeud.add(new Noeud(NOEUD.EXPORTER,null));
		return XmlUtils.acceder(racine,listeNoeud);
	}

}
