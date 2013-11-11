package org.ludo.umlgenerator.xml.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jdom.Element;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.LoggerManager;

public class XmlUtils {
	
	private static Logger log = LoggerManager.getLogger(XmlUtils.class);
	
	/*
	 *
	 * Méthodes utilitaires
	 * 
	 */
	
	public static void parcourir(Element element) {
		parcourir(element,1);
	}
	
	public static void parcourir(Element element, int niveau) {
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
	
	/*
	 *
	 * Méthodes utilitaires
	 * 
	 */
	
	public static List getListeXMINoeud(Element element) {
		List listeXMINoeud = new ArrayList();
		getListeXMINoeud(element,1,listeXMINoeud);
		return listeXMINoeud;
	}
	
	public static void getListeXMINoeud(Element element, int niveau, List listeXMINoeud) {
		if( element == null ) {
			return;
		}
		String nomNoeud = element.getName();
		String attributNom = element.getAttributeValue("name");
		String xmiId = element.getAttributeValue("xmi.id");
		String xmiIdRef = element.getAttributeValue("xmi.idref");
		XMINoeud xmiNoeud =
			new XMINoeud(
				nomNoeud,
				attributNom,
				xmiId,
				xmiIdRef
			);
		listeXMINoeud.add(xmiNoeud);
		List listeChildren = getChildren(element);
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element children = (Element) iterChildren.next();
			getListeXMINoeud(children,niveau+1,listeXMINoeud);
		}
	}
	
	public static List getChildren(Element element) {
		List listeElementFils = new ArrayList();
		List listeChildren = element.getChildren();
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element elementFils = (Element) iterChildren.next();
			listeElementFils.add(elementFils);
		}
		return listeElementFils;
	}
	
	public static List getChildren(Element element, String nomNoeud) {
		AssertHelper.assertDefined(nomNoeud, "nom du noeud");
		List listeElementFils = new ArrayList();
		List listeChildren = element.getChildren();
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element elementFils = (Element) iterChildren.next();
			if( nomNoeud.equalsIgnoreCase(elementFils.getName()) ) {
				listeElementFils.add(elementFils);
			}
		}
		return listeElementFils;
	}
	
	public static Noeud getNoeudFromElement(Element element) {
		Noeud noeud = 
			new Noeud(
				element.getName(),
				element.getAttributeValue("name")
			);
		return noeud;
	}
	
	public static Element acceder(Element element, List listeNoeud) {
		AssertHelper.assertNotNullArgument(listeNoeud, "liste des noms des noeuds");
		Element elementCourant = element;
		// Parcourt des noeuds à rechercher
		for(Iterator iterNoeud = listeNoeud.iterator(); iterNoeud.hasNext(); ) {
			AssertHelper.assertDefined(elementCourant, "élément courant");
			Noeud noeud = (Noeud) iterNoeud.next();
			AssertHelper.assertDefined(noeud, "définition du noeud à rechercher");
			AssertHelper.assertDefined(noeud.getNomNoeud(), "nom du noeud à rechercher");
			//AssertHelper.assertDefined(noeud.getAttributNom(), "l'attribut 'nom' du noeud à rechercher");
			AssertHelper.assertDefined(getChildren(elementCourant), "liste des noeuds fils du noeud courant");
			// Recherche du noeud fils
			Element elementFilsTrouve = null;
			for(Iterator iterChildren = getChildren(elementCourant).iterator(); iterChildren.hasNext() && elementFilsTrouve == null; ) {
				Element child = (Element) iterChildren.next();
				if( noeud.getNomNoeud().equalsIgnoreCase(child.getName()) 
				 && ( StringUtils.isBlank(noeud.getAttributNom())
				   || noeud.getAttributNom().equalsIgnoreCase(child.getAttributeValue("name")) ) )
				{
					elementFilsTrouve = child;
				}
			}
			AssertHelper.assertDefined(elementFilsTrouve, "fils à rechercher");
			elementCourant = elementFilsTrouve;
		}
		return elementCourant;
	}
	
	
	public static List getListeElementByNomNoeud(Element element, String nomNoeud) {
		AssertHelper.assertDefined(nomNoeud, "nom du noeud");
		List listeElementByNomNoeud = new ArrayList();
		getListeElementByNomNoeud(element,1,listeElementByNomNoeud,nomNoeud);
		return listeElementByNomNoeud;
	}
	
	public static void getListeElementByNomNoeud(Element element, int niveau, List listeElementByNomNoeud, String nomNoeud) {
		if( element == null ) {
			return;
		}
		String elementNomNoeud = element.getName();
		if( nomNoeud.equalsIgnoreCase(elementNomNoeud) ) {
			listeElementByNomNoeud.add(element);
		}
		List listeChildren = getChildren(element);
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element children = (Element) iterChildren.next();
			getListeElementByNomNoeud(children,niveau+1,listeElementByNomNoeud,nomNoeud);
		}
	}

	
}
