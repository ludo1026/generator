package org.ludo.umlgenerator.xml.core.xmlwriter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.ludo.codegenerator.xml.core.gen.core.xmlreader.GenXmlNoeud;
import org.ludo.umlgenerator.xml.core.bean.IXMI;
import org.ludo.umlgenerator.xml.core.bean.IXMIAssociationEnd;
import org.ludo.umlgenerator.xml.core.bean.IXMIAttribut;
import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIOperation;
import org.ludo.umlgenerator.xml.core.bean.IXMIPackage;
import org.ludo.umlgenerator.xml.core.bean.IXMIParametre;
import org.ludo.umlgenerator.xml.core.bean.IXMIStereotype;
import org.ludo.umlgenerator.xml.utils.Noeud;
import org.ludo.umlgenerator.xml.utils.XmlUtils;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.LoggerManager;
import org.ludo.utils.TypeUtils;

public class GenXmlHandler {
	
	private static Logger log = LoggerManager.getLogger(GenXmlHandler.class);
	
	private final Document document;
	
	public GenXmlHandler(Document document) {
		this.document = document;
	}
	
	public void afficherArborescence() {
		Element racine = document.getRootElement();
		if( racine == null ) {
			return;
		}
		XmlUtils.parcourir(racine);
	}
	
	private boolean AFFICHER_ARBORESCENCE = false;
	
	public void write(IXMI xmi) {
		if( AFFICHER_ARBORESCENCE ) {
			afficherArborescence();
			return;
		}
		else {
			write(this.document, xmi);
		}
	}
	
	private void write(Document document, IXMI xmi) {
		/*
		Element racine = document.getRootElement();
		if( racine == null ) {
			return;
		}
		*/
		
		writeListeStereotype(
			document,
			xmi.getListeStereotype()
		);
		
		writeListePackage(
			document,
			xmi.getListePackageFils()
		);
		
	}
	
	/*
	 *
	 * Méthodes de lecture du fichier XML
	 * 
	 */
	
	private Element getElementNoeudGen(Document document) {
		Element racine = document.getRootElement();
		/*
		List listeNoeud = new ArrayList();
		listeNoeud.add(new Noeud(GenXmlNoeud.N_Gen,null));
		return XmlUtils.acceder(racine,listeNoeud);
		*/
		return racine;
	}
	
	private Element getElementNoeudStereotypes(Document document) {
		Element racine = document.getRootElement();
		List listeNoeud = new ArrayList();
		//listeNoeud.add(new Noeud(GenXmlNoeud.N_Gen,null));
		listeNoeud.add(new Noeud(GenXmlNoeud.N_GenStereotypes,null));
		return XmlUtils.acceder(racine,listeNoeud);
	}
	
	private Element getElementNoeudClasses(Document document) {
		Element racine = document.getRootElement();
		List listeNoeud = new ArrayList();
		//listeNoeud.add(new Noeud(GenXmlNoeud.N_Gen,null));
		listeNoeud.add(new Noeud(GenXmlNoeud.N_GenClasses,null));
		return XmlUtils.acceder(racine,listeNoeud);
	}
	
	/**
	 * Définition des stéréotypes
	 */
	
	private void writeListeStereotype(Document document, List listeXmiStereotype) {
		Element elementStereotypes = getElementNoeudStereotypes(document);
		elementStereotypes.removeContent();
		writeListeStereotype(elementStereotypes, listeXmiStereotype);
	}
	
	private void writeListeStereotype(Element elementStereotypes, List listeXmiStereotype) {
		for(Iterator iterXmiStereotype = listeXmiStereotype.iterator(); iterXmiStereotype.hasNext(); ) {
			IXMIStereotype xmiStereotype = (IXMIStereotype) iterXmiStereotype.next();
			writeStereotype(elementStereotypes, xmiStereotype);
		}
	}
	
	private void writeStereotype(Element elementStereotypes, IXMIStereotype xmiStereotype) {
		Element elementStereotype = new Element(GenXmlNoeud.N_GenStereotype);
		elementStereotype.setAttribute(GenXmlNoeud.N_GenStereotype_A_Nom, xmiStereotype.getNom());
		elementStereotypes.addContent(elementStereotype);
	}
	
	/**
	 * Définition des classes
	 */
	
	private String getNomPackage(String packageCourant, String packageFils) {
		if( StringUtils.isBlank(packageCourant) ) {
			return StringUtils.uncapitalize(packageFils);
		} else {
			return packageCourant + "." + StringUtils.uncapitalize(packageFils);
		}
	}
	
	private void writeListePackage(Document document, List listeXmiPackage) {
		Element elementStereotypes = getElementNoeudClasses(document);
		elementStereotypes.removeContent();
		writeListePackage(elementStereotypes, listeXmiPackage, "");
	}
	
	private void writeListePackage(Element elementClasses, List listeXmiPackage, String packageCourant) {
		for(Iterator iterXmiPackage = listeXmiPackage.iterator(); iterXmiPackage.hasNext(); ) {
			IXMIPackage xmiPackage = (IXMIPackage) iterXmiPackage.next();
			writePackage(elementClasses, xmiPackage, getNomPackage(packageCourant, xmiPackage.getNom()) );
		}
	}
	
	private void writePackage(Element elementClasses, IXMIPackage xmiPackage, String packageCourant) {
		List listeXmiClasse = xmiPackage.getListeClasse();
		for(Iterator iterXmiClasse = listeXmiClasse.iterator(); iterXmiClasse.hasNext(); ) {
			IXMIClasse xmiClasse = (IXMIClasse) iterXmiClasse.next();
			writeClasse(elementClasses, xmiClasse, packageCourant);
		}
		List listeXmiPackageFils = xmiPackage.getListePackageFils();
		writeListePackage(elementClasses, listeXmiPackageFils, packageCourant);
	}
	
	private void writeClasse(Element elementClasses, IXMIClasse xmiClasse, String packageCourant) {
		Element elementClasse = new Element(GenXmlNoeud.N_GenClasse);
		elementClasse.setAttribute(GenXmlNoeud.N_GenClasse_A_GenId, xmiClasse.getGenId());
		elementClasse.setAttribute(GenXmlNoeud.N_GenClasse_A_NomJava, xmiClasse.getNom());
		elementClasse.setAttribute(GenXmlNoeud.N_GenClasse_A_PackageJava, packageCourant);
		writeListeStereotypeRefPourClasse(elementClasse, xmiClasse, packageCourant);
		writeListeAttributPourClasse(elementClasse, xmiClasse, packageCourant);
		writeListeMethodePourClasse(elementClasse, xmiClasse, packageCourant);
		writeListeAssociationPourClasse(elementClasse, xmiClasse, packageCourant);
		elementClasses.addContent(elementClasse);
	}
	
	private void writeListeStereotypeRefPourClasse(Element elementClasse, IXMIClasse xmiClasse, String packageCourant) {
		Element elementStereotypesRef = new Element(GenXmlNoeud.N_GenStereotypesRef);
		for( Iterator iterXMIStereotype = xmiClasse.getListeStereotype().iterator(); iterXMIStereotype.hasNext(); ) {
			IXMIStereotype xmiStereotype = (IXMIStereotype) iterXMIStereotype.next();
			writeStereotypeRefPourClasse(elementStereotypesRef, xmiStereotype, packageCourant);
		}
		elementClasse.addContent(elementStereotypesRef);
	}
	
	private void writeStereotypeRefPourClasse(Element elementStereotypesRef, IXMIStereotype xmiStereotype, String packageCourant) {
		Element elementStereotypeRef = new Element(GenXmlNoeud.N_GenStereotypeRef);
		elementStereotypeRef.setAttribute(GenXmlNoeud.N_GenStereotypeRef_A_StereotypeNom, xmiStereotype.getNom());
		elementStereotypesRef.addContent(elementStereotypeRef);
	}
	
	private void writeListeAttributPourClasse(Element elementClasse, IXMIClasse xmiClasse, String packageCourant) {
		Element elementAttributs = new Element(GenXmlNoeud.N_GenAttributs);
		for( Iterator iterXMIAttribut = xmiClasse.getListeAttribut().iterator(); iterXMIAttribut.hasNext(); ) {
			IXMIAttribut xmiAttribut = (IXMIAttribut) iterXMIAttribut.next();
			writeAttributPourClasse(elementAttributs, xmiAttribut, packageCourant);
		}
		elementClasse.addContent(elementAttributs);
	}
	
	private void writeAttributPourClasse(Element elementAttributs, IXMIAttribut xmiAttribut, String packageCourant) {
		Element elementAttribut = new Element(GenXmlNoeud.N_GenAttribut);
		elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_GenId, xmiAttribut.getGenId());
		elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NomJava, xmiAttribut.getNom());
		if( xmiAttribut.getXmiDatatype() != null ) {
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_Type, TypeUtils.formatTypeElementJava(xmiAttribut.getXmiDatatype().getNom()));
		}
		if( xmiAttribut.getXmiClasse() != null ) {
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_Type, TypeUtils.formatTypeElementProjet(xmiAttribut.getXmiClasse().getGenId()));
		}
		if( xmiAttribut.getXmiMultiplicity() != null ) {
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NombreMinimum, xmiAttribut.getXmiMultiplicity().getMinimum());
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NombreMaximum, xmiAttribut.getXmiMultiplicity().getMaximum());
		} else {
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NombreMinimum, "1");
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NombreMaximum, "1");
		}
		elementAttributs.addContent(elementAttribut);
	}
	
	private void writeListeMethodePourClasse(Element elementClasse, IXMIClasse xmiClasse, String packageCourant) {
		Element elementMethodes = new Element(GenXmlNoeud.N_GenMethodes);
		for( Iterator iterXMIOperation = xmiClasse.getListeOperation().iterator(); iterXMIOperation.hasNext(); ) {
			IXMIOperation xmiOperation = (IXMIOperation) iterXMIOperation.next();
			writeMethodePourClasse(elementMethodes, xmiOperation, packageCourant);
		}
		elementClasse.addContent(elementMethodes);
	}
	
	private void writeMethodePourClasse(Element elementMethodes, IXMIOperation xmiOperation, String packageCourant) {
		Element elementMethode = new Element(GenXmlNoeud.N_GenMethode);
		elementMethode.setAttribute(GenXmlNoeud.N_GenMethode_A_GenId, xmiOperation.getGenId());
		elementMethode.setAttribute(GenXmlNoeud.N_GenMethode_A_NomJava, xmiOperation.getNom());
		AssertHelper.assertDefined(xmiOperation.getParametreRetour(), "paramètre retour de l'opération");
		if( xmiOperation.getParametreRetour().getXmiDatatype() != null ) {
			elementMethode.setAttribute(GenXmlNoeud.N_GenMethode_A_RetourType, TypeUtils.formatTypeElementJava(xmiOperation.getParametreRetour().getXmiDatatype().getNom()));
		}
		if( xmiOperation.getParametreRetour().getXmiClasse() != null ) {
			elementMethode.setAttribute(GenXmlNoeud.N_GenMethode_A_RetourType, xmiOperation.getParametreRetour().getXmiClasse().getGenId());
		}
		writeListeParametrePourMethode(elementMethode, xmiOperation, packageCourant);
		elementMethodes.addContent(elementMethode);
	}
	
	private void writeListeParametrePourMethode(Element elementMethode, IXMIOperation xmiOperation, String packageCourant) {
		Element elementParametres = new Element(GenXmlNoeud.N_GenParametres);
		for( Iterator iterXMIParametre = xmiOperation.getListeParametre().iterator(); iterXMIParametre.hasNext(); ) {
			IXMIParametre xmiParametre = (IXMIParametre) iterXMIParametre.next();
			writeParametrePourMethode(elementParametres, xmiParametre, packageCourant);
		}
		elementMethode.addContent(elementParametres);
	}
	
	private void writeParametrePourMethode(Element elementParametres, IXMIParametre xmiParametre, String packageCourant) {
		Element elementParametre = new Element(GenXmlNoeud.N_GenParametre);
		elementParametre.setAttribute(GenXmlNoeud.N_GenParametre_A_GenId, xmiParametre.getGenId());
		elementParametre.setAttribute(GenXmlNoeud.N_GenParametre_A_NomJava, xmiParametre.getNom());
		if( xmiParametre.getXmiDatatype() != null ) {
			elementParametre.setAttribute(GenXmlNoeud.N_GenParametre_A_Type, TypeUtils.formatTypeElementJava(xmiParametre.getXmiDatatype().getNom()));
		}
		if( xmiParametre.getXmiClasse() != null ) {
			elementParametre.setAttribute(GenXmlNoeud.N_GenParametre_A_Type, TypeUtils.formatTypeElementProjet(xmiParametre.getXmiClasse().getGenId()));
		}
		elementParametres.addContent(elementParametre);
	}
	
	private void writeListeAssociationPourClasse(Element elementClasse, IXMIClasse xmiClasse, String packageCourant) {
		Element elementAssociations = new Element(GenXmlNoeud.N_GenAssociations);
		for( Iterator iterXMIAssociationEnd = xmiClasse.getListeAssociationEnd().iterator(); iterXMIAssociationEnd.hasNext(); ) {
			IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) iterXMIAssociationEnd.next();
			// on ne met l'association que si un nom de champ a été défini
			if( StringUtils.isNotBlank(xmiAssociationEnd.getNomChamp()) ) {
				writeAssociationEndPourClasse(elementAssociations, xmiAssociationEnd, packageCourant);
			}
		}
		elementClasse.addContent(elementAssociations);
	}
	
	private void writeAssociationEndPourClasse(Element elementAssociations, IXMIAssociationEnd xmiAssociationEnd, String packageCourant) {
		Element elementAssociation = new Element(GenXmlNoeud.N_GenAssociation);
		IXMIClasse classeRef = xmiAssociationEnd.getXMIClasseRef();
		elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_GenId, xmiAssociationEnd.getGenId());
		elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_NomJavaChamp, xmiAssociationEnd.getNomChamp());
		elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_ClasseGenId, TypeUtils.formatTypeElementProjet(classeRef.getGenId()));
		if( xmiAssociationEnd.getXmiMultiplicity() != null ) {
			elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_NombreMinimum, xmiAssociationEnd.getXmiMultiplicity().getMinimum());
			elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_NombreMaximum, xmiAssociationEnd.getXmiMultiplicity().getMaximum());
		} else {
			elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_NombreMinimum, "1");
			elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_NombreMaximum, "1");
		}
		elementAssociations.addContent(elementAssociation);
	}
	
	/**
	 * Gestion de la généralisation (héritage)
	 */
	
	private void writeListeClasseParentPourClasse(Element elementClasse, IXMIClasse xmiClasse, String packageCourant) {
		Element elementClasseParents = new Element(GenXmlNoeud.N_GenClasseParents);
		for( Iterator iterXMIClasseParent = xmiClasse.getListeClasseParent().iterator(); iterXMIClasseParent.hasNext(); ) {
			IXMIClasse xmiClasseParent = (IXMIClasse) iterXMIClasseParent.next();
			writeClasseParentPourClasse(elementClasseParents, xmiClasseParent, xmiClasse);
		}
		elementClasse.addContent(elementClasseParents);
	}
	
	private void writeClasseParentPourClasse(Element elementClasseParents, IXMIClasse xmiClasseParent, IXMIClasse classe) {
		Element elementClasseParent = new Element(GenXmlNoeud.N_GenClasseParent);
		elementClasseParent.setAttribute(GenXmlNoeud.N_GenClasseParent_A_ClasseGenId, xmiClasseParent.getGenId());
		elementClasseParents.addContent(elementClasseParent);
	}
	
}
