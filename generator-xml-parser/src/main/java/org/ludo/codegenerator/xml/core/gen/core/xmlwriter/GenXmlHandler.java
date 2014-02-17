package org.ludo.codegenerator.xml.core.gen.core.xmlwriter;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociationAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributPropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodeParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodeStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.xmlreader.GenXmlNoeud;
import org.ludo.umlgenerator.xml.utils.Noeud;
import org.ludo.umlgenerator.xml.utils.XmlUtils;
import org.ludo.utils.LoggerManager;

public class GenXmlHandler {

	private static Logger log = LoggerManager.getLogger(GenXmlHandler.class);

	private final Document document;

	public GenXmlHandler(final Document document) {
		this.document = document;
	}

	private void writeAttribute(final Element elementClasse, final String nomAttribut, final String value) {
		if (!StringUtils.isBlank(value)) {
			elementClasse.setAttribute(nomAttribut, value);
		}
	}

	public void afficherArborescence() {
		final Element racine = this.document.getRootElement();
		if (racine == null) {
			return;
		}
		XmlUtils.parcourir(racine);
	}

	private boolean AFFICHER_ARBORESCENCE = false;

	public void write(final Gen gen) {
		if (this.AFFICHER_ARBORESCENCE) {
			this.afficherArborescence();
			return;
		} else {
			this.write(this.document, gen);
		}
	}

	private void write(final Document document, final Gen gen) {
		/*
		 * Element racine = document.getRootElement(); if( racine == null ) {
		 * return; }
		 */

		if ((gen.getGenStereotypes() != null) && !CollectionUtils.isEmpty(gen.getGenStereotypes())) {
			this.writeListeStereotype(document, gen.getGenStereotypes().getGenStereotypes());
		}

		if ((gen.getGenClasses() != null) && !CollectionUtils.isEmpty(gen.getGenClasses())) {
			final Element elementClasses = this.getElementNoeudClasses(document);
			elementClasses.removeContent();
			for (final GenClasse genClasse : gen.getGenClasses().getGenClasses()) {
				this.writeClasse(elementClasses, genClasse);
			}
		}

	}

	/*
	 * 
	 * Méthodes de lecture du fichier XML
	 */

	private Element getElementNoeudGen(final Document document) {
		final Element racine = document.getRootElement();
		/*
		 * List listeNoeud = new ArrayList(); listeNoeud.add(new
		 * Noeud(GenXmlNoeud.N_Gen_Gen,null)); return
		 * XmlUtils.acceder(racine,listeNoeud);
		 */
		return racine;
	}

	private Element getElementNoeudStereotypes(final Document document) {
		final Element racine = document.getRootElement();
		final List listeNoeud = new ArrayList();
		// listeNoeud.add(new Noeud(GenXmlNoeud.N_Gen_Gen,null));
		listeNoeud.add(new Noeud(GenXmlNoeud.N_Gen_GenStereotypes, null));
		return XmlUtils.acceder(racine, listeNoeud);
	}

	private Element getElementNoeudClasses(final Document document) {
		final Element racine = document.getRootElement();
		final List listeNoeud = new ArrayList();
		// listeNoeud.add(new Noeud(GenXmlNoeud.N_Gen_Gen,null));
		listeNoeud.add(new Noeud(GenXmlNoeud.N_Gen_GenClasses, null));
		return XmlUtils.acceder(racine, listeNoeud);
	}

	/**
	 * Définition des stéréotypes
	 */

	private void writeListeStereotype(final Document document, final List<GenStereotype> listeGenStereotype) {
		final Element elementStereotypes = this.getElementNoeudStereotypes(document);
		elementStereotypes.removeContent();
		this.writeListeStereotype(elementStereotypes, listeGenStereotype);
	}

	private void writeListeStereotype(final Element elementStereotypes, final List<GenStereotype> listeGenStereotype) {
		if ((listeGenStereotype == null) || CollectionUtils.isEmpty(listeGenStereotype)) {
			return;
		}
		for (final GenStereotype genStereotype : listeGenStereotype) {
			this.writeStereotype(elementStereotypes, genStereotype);
		}
	}

	private void writeStereotype(final Element elementStereotypes, final GenStereotype genStereotype) {
		final Element elementStereotype = new Element(GenXmlNoeud.N_Gen_GenStereotypes_GenStereotype);
		this.writeAttribute(elementStereotype, GenXmlNoeud.N_Gen_GenStereotypes_GenStereotype_A_Nom, genStereotype.getNom());
		elementStereotypes.addContent(elementStereotype);
	}

	/**
	 * Définition des classes
	 */

	private void writeClasse(final Element elementClasses, final GenClasse genClasse) {
		final Element elementClasse = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse);
		this.writeAttribute(elementClasse, GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_GenId, genClasse.getGenId());
		this.writeAttribute(elementClasse, GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_NomJava, genClasse.getNomJava());
		this.writeAttribute(elementClasse, GenXmlNoeud.N_Gen_GenClasses_GenClasse_A_NomTable, genClasse.getNomTable());
		this.writeListeStereotypeClassePourClasse(elementClasse, genClasse);
		this.writeListeProprieteClassePourClasse(elementClasse, genClasse);
		this.writeListeAttributPourClasse(elementClasse, genClasse);
		this.writeListeMethodePourClasse(elementClasse, genClasse);
		this.writeListeAssociationPourClasse(elementClasse, genClasse);
		this.writeListeClasseParentPourClasse(elementClasse, genClasse);
		elementClasses.addContent(elementClasse);
	}

	private void writeListeStereotypeClassePourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenClasseStereotypes() == null) || CollectionUtils.isEmpty(genClasse.getGenClasseStereotypes())) {
			return;
		}
		for (final GenClasseStereotype genClasseStereotype : genClasse.getGenClasseStereotypes()) {
			this.writeStereotypeClassePourClasse(elementClasse, genClasseStereotype);
		}
	}

	private void writeStereotypeClassePourClasse(final Element elementStereotypesClasseRef, final GenClasseStereotype genClasseStereotype) {
		final Element elementStereotypeClasse = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseStereotype);
		this.writeAttribute(elementStereotypeClasse, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseStereotype_A_Nom, genClasseStereotype.getNom());
		elementStereotypesClasseRef.addContent(elementStereotypeClasse);
	}

	private void writeListeProprieteClassePourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenClasseProprietes() == null) || CollectionUtils.isEmpty(genClasse.getGenClasseProprietes())) {
			return;
		}
		for (final GenClassePropriete genClassePropriete : genClasse.getGenClasseProprietes()) {
			this.writeProprieteClassePourClasse(elementClasse, genClassePropriete);
		}
	}

	private void writeProprieteClassePourClasse(final Element elementProprietesClasse, final GenClassePropriete genClassePropriete) {
		final Element elementProprieteClasse = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClassePropriete);
		this.writeAttribute(elementProprieteClasse, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClassePropriete_A_Nom, genClassePropriete.getNom());
		this.writeAttribute(elementProprieteClasse, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClassePropriete_A_Valeur, genClassePropriete.getValeur());
		elementProprietesClasse.addContent(elementProprieteClasse);
	}

	private void writeListeAttributPourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenClasseAttributs() == null) || CollectionUtils.isEmpty(genClasse.getGenClasseAttributs())) {
			return;
		}
		for (final GenClasseAttribut genClasseAttribut : genClasse.getGenClasseAttributs()) {
			this.writeAttributPourClasse(elementClasse, genClasseAttribut);
		}
	}

	private void writeAttributPourClasse(final Element elementClasse, final GenClasseAttribut genClasseAttribut) {
		final Element elementAttribut = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut);
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_GenId, genClasseAttribut.getGenId());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NomJava, genClasseAttribut.getNomJava());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_Type, genClasseAttribut.getType());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NomSQL, genClasseAttribut.getNomSQL());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_TypeSQL, genClasseAttribut.getTypeSQL());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_Size, genClasseAttribut.getSize());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_EstClePrimaire, genClasseAttribut.getEstClePrimaire());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_AssociationId, genClasseAttribut.getAssociationId());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_EstDansTable, genClasseAttribut.getEstDansTable());
		if ((genClasseAttribut.getNbMin() != null) && (genClasseAttribut.getNbMax() != null)) {
			this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NbMin, genClasseAttribut.getNbMin());
			this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NbMax, genClasseAttribut.getNbMax());
		} else {
			this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NbMin, "1");
			this.writeAttribute(elementAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_A_NbMax, "1");
		}
		this.writeListeStereotypeAttributPourAttribut(elementAttribut, genClasseAttribut);
		this.writeListeProprieteAttributPourAttribut(elementAttribut, genClasseAttribut);
		elementClasse.addContent(elementAttribut);
	}

	private void writeListeStereotypeAttributPourAttribut(final Element elementAttribut, final GenClasseAttribut genClasseAttribut) {
		if ((genClasseAttribut.getGenClasseAttributStereotypes() == null) || CollectionUtils.isEmpty(genClasseAttribut.getGenClasseAttributStereotypes())) {
			return;
		}
		for (final GenClasseAttributStereotype genClasseAttributStereotype : genClasseAttribut.getGenClasseAttributStereotypes()) {
			this.writeStereotypeAttributPourAttribut(elementAttribut, genClasseAttributStereotype);
		}
		elementAttribut.addContent(elementAttribut);
	}

	private void writeStereotypeAttributPourAttribut(final Element elementStereotypesAttributRef, final GenClasseAttributStereotype genClasseAttributStereotype) {
		final Element elementStereotypeAttribut = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype);
		this.writeAttribute(elementStereotypeAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributStereotype_A_Nom, genClasseAttributStereotype.getNom());
		elementStereotypesAttributRef.addContent(elementStereotypeAttribut);
	}

	private void writeListeProprieteAttributPourAttribut(final Element elementAttribut, final GenClasseAttribut genClasseAttribut) {
		if ((genClasseAttribut.getGenClasseAttributProprietes() == null) || CollectionUtils.isEmpty(genClasseAttribut.getGenClasseAttributProprietes())) {
			return;
		}
		for (final GenClasseAttributPropriete genClasseAttributPropriete : genClasseAttribut.getGenClasseAttributProprietes()) {
			this.writeProprieteAttributPourAttribut(elementAttribut, genClasseAttributPropriete);
		}
	}

	private void writeProprieteAttributPourAttribut(final Element elementProprietesAttribut, final GenClasseAttributPropriete genClasseAttributPropriete) {
		final Element elementProprieteAttribut = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete);
		this.writeAttribute(elementProprieteAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete_A_Nom, genClasseAttributPropriete.getNom());
		this.writeAttribute(elementProprieteAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAttribut_GenClasseAttributPropriete_A_Valeur, genClasseAttributPropriete.getValeur());
		elementProprietesAttribut.addContent(elementProprieteAttribut);
	}

	private void writeListeMethodePourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenClasseMethodes() == null) || CollectionUtils.isEmpty(genClasse.getGenClasseMethodes())) {
			return;
		}
		for (final GenClasseMethode genClasseMethode : genClasse.getGenClasseMethodes()) {
			this.writeMethodePourClasse(elementClasse, genClasseMethode);
		}
	}

	private void writeMethodePourClasse(final Element elementClasse, final GenClasseMethode genClasseMethode) {
		final Element elementMethode = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode);
		this.writeAttribute(elementMethode, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_A_GenId, genClasseMethode.getGenId());
		this.writeAttribute(elementMethode, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_A_NomJava, genClasseMethode.getNomJava());
		this.writeAttribute(elementMethode, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_A_RetourType, genClasseMethode.getRetourType());
		this.writeListeParametrePourMethode(elementMethode, genClasseMethode);
		this.writeListeStereotypeMethodePourMethode(elementMethode, genClasseMethode);
		this.writeListeProprieteMethodePourMethode(elementMethode, genClasseMethode);
		elementClasse.addContent(elementMethode);
	}

	private void writeListeParametrePourMethode(final Element elementMethode, final GenClasseMethode genClasseMethode) {
		if ((genClasseMethode.getGenClasseMethodeParametres() == null) || CollectionUtils.isEmpty(genClasseMethode.getGenClasseMethodeParametres())) {
			return;
		}
		for (final GenClasseMethodeParametre genClasseMethodeParametre : genClasseMethode.getGenClasseMethodeParametres()) {
			this.writeParametrePourMethode(elementMethode, genClasseMethodeParametre);
		}
		elementMethode.addContent(elementMethode);
	}

	private void writeParametrePourMethode(final Element elementMethode, final GenClasseMethodeParametre genClasseMethodeParametre) {
		final Element elementParametre = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre);
		this.writeAttribute(elementParametre, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_GenId, genClasseMethodeParametre.getGenId());
		this.writeAttribute(elementParametre, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_NomJava, genClasseMethodeParametre.getNomJava());
		this.writeAttribute(elementParametre, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeParametre_A_Type, genClasseMethodeParametre.getType());
		elementMethode.addContent(elementParametre);
	}

	private void writeListeStereotypeMethodePourMethode(final Element elementMethode, final GenClasseMethode genClasseMethode) {
		if ((genClasseMethode.getGenClasseMethodeStereotypes() == null) || CollectionUtils.isEmpty(genClasseMethode.getGenClasseMethodeStereotypes())) {
			return;
		}
		for (final GenClasseMethodeStereotype genStereotypeMethode : genClasseMethode.getGenClasseMethodeStereotypes()) {
			this.writeStereotypeMethodePourMethode(elementMethode, genStereotypeMethode);
		}
	}

	private void writeStereotypeMethodePourMethode(final Element elementStereotypesMethodeRef, final GenClasseMethodeStereotype genStereotypeMethode) {
		final Element elementStereotypeMethode = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype);
		this.writeAttribute(elementStereotypeMethode, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodeStereotype_A_Nom, genStereotypeMethode.getNom());
		elementStereotypesMethodeRef.addContent(elementStereotypeMethode);
	}

	private void writeListeProprieteMethodePourMethode(final Element elementMethode, final GenClasseMethode genClasseMethode) {
		if ((genClasseMethode.getGenClasseMethodeProprietes() == null) || CollectionUtils.isEmpty(genClasseMethode.getGenClasseMethodeProprietes())) {
			return;
		}
		for (final GenClasseMethodePropriete genClasseMethodePropriete : genClasseMethode.getGenClasseMethodeProprietes()) {
			this.writeProprieteMethodePourMethode(elementMethode, genClasseMethodePropriete);
		}
	}

	private void writeProprieteMethodePourMethode(final Element elementProprietesMethode, final GenClasseMethodePropriete genClasseMethodePropriete) {
		final Element elementProprieteMethode = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete);
		this.writeAttribute(elementProprieteMethode, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete_A_Nom, genClasseMethodePropriete.getNom());
		this.writeAttribute(elementProprieteMethode, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseMethode_GenClasseMethodePropriete_A_Valeur, genClasseMethodePropriete.getValeur());
		elementProprietesMethode.addContent(elementProprieteMethode);
	}

	private void writeListeAssociationPourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenClasseAssociations() == null) || CollectionUtils.isEmpty(genClasse.getGenClasseAssociations())) {
			return;
		}
		for (final GenClasseAssociation genClasseAssociation : genClasse.getGenClasseAssociations()) {
			this.writeAssociationEndPourClasse(elementClasse, genClasseAssociation);
		}
	}

	private void writeAssociationEndPourClasse(final Element elementClasse, final GenClasseAssociation genClasseAssociation) {
		final Element elementAssociation = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation);
		this.writeAttribute(elementAssociation, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_GenId, genClasseAssociation.getGenId());
		this.writeAttribute(elementAssociation, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NomJava, genClasseAssociation.getNomJava());
		this.writeAttribute(elementAssociation, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_ClasseGenId, genClasseAssociation.getClasseGenId());
		if ((genClasseAssociation.getNbMin() != null) && (genClasseAssociation.getNbMax() != null)) {
			this.writeAttribute(elementAssociation, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NbMin, genClasseAssociation.getNbMin());
			this.writeAttribute(elementAssociation, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NbMax, genClasseAssociation.getNbMax());
		} else {
			this.writeAttribute(elementAssociation, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NbMin, "1");
			this.writeAttribute(elementAssociation, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_A_NbMax, "1");
		}
		this.writeAssociationAttributsPourAssociation(elementAssociation, genClasseAssociation);
		elementClasse.addContent(elementAssociation);
	}

	private void writeAssociationAttributsPourAssociation(final Element elementClasseAssociation, final GenClasseAssociation genClasseAssociation) {
		if (genClasseAssociation == null) {
			return;
		}
		if (genClasseAssociation.getGenClasseAssociationAttributs() != null) {
			for (final GenClasseAssociationAttribut genClasseAssociationAttribut : genClasseAssociation.getGenClasseAssociationAttributs()) {
				this.writeAssociationAttribut(elementClasseAssociation, genClasseAssociationAttribut);
			}
		}
	}

	private void writeAssociationAttribut(final Element elementAssociation, final GenClasseAssociationAttribut genClasseAssociationAttribut) {
		final Element elementAssociationAttribut = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut);
		this.writeAttribute(elementAssociationAttribut, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseAssociation_GenClasseAssociationAttribut_A_GenId, genClasseAssociationAttribut.getGenId());
		elementAssociation.addContent(elementAssociationAttribut);
	}

	/**
	 * Gestion de la généralisation (héritage)
	 */

	private void writeListeClasseParentPourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenClasseParents() == null) || CollectionUtils.isEmpty(genClasse.getGenClasseParents())) {
			return;
		}
		for (final GenClasseParent genClasseParent : genClasse.getGenClasseParents()) {
			this.writeClasseParentPourClasse(elementClasse, genClasseParent);
		}
	}

	private void writeClasseParentPourClasse(final Element elementClasse, final GenClasseParent genClasseParent) {
		final Element elementClasseParent = new Element(GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParent);
		this.writeAttribute(elementClasseParent, GenXmlNoeud.N_Gen_GenClasses_GenClasse_GenClasseParent_A_ClasseGenId, genClasseParent.getClasseGenId());
		elementClasse.addContent(elementClasseParent);
	}

}
