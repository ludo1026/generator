package org.ludo.codegenerator.xml.core.gen.core.xmlwriter;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethode;
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
		 * Noeud(GenXmlNoeud.N_Gen,null)); return
		 * XmlUtils.acceder(racine,listeNoeud);
		 */
		return racine;
	}

	private Element getElementNoeudStereotypes(final Document document) {
		final Element racine = document.getRootElement();
		final List listeNoeud = new ArrayList();
		// listeNoeud.add(new Noeud(GenXmlNoeud.N_Gen,null));
		listeNoeud.add(new Noeud(GenXmlNoeud.N_GenStereotypes, null));
		return XmlUtils.acceder(racine, listeNoeud);
	}

	private Element getElementNoeudClasses(final Document document) {
		final Element racine = document.getRootElement();
		final List listeNoeud = new ArrayList();
		// listeNoeud.add(new Noeud(GenXmlNoeud.N_Gen,null));
		listeNoeud.add(new Noeud(GenXmlNoeud.N_GenClasses, null));
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
		final Element elementStereotype = new Element(GenXmlNoeud.N_GenStereotype);
		this.writeAttribute(elementStereotype, GenXmlNoeud.N_GenStereotype_A_Nom, genStereotype.getNom());
		elementStereotypes.addContent(elementStereotype);
	}

	/**
	 * Définition des classes
	 */

	private void writeClasse(final Element elementClasses, final GenClasse genClasse) {
		final Element elementClasse = new Element(GenXmlNoeud.N_GenClasse);
		this.writeAttribute(elementClasse, GenXmlNoeud.N_GenClasse_A_GenId, genClasse.getGenId());
		this.writeAttribute(elementClasse, GenXmlNoeud.N_GenClasse_A_NomJava, genClasse.getNomJava());
		this.writeAttribute(elementClasse, GenXmlNoeud.N_GenClasse_A_NomTable, genClasse.getNomTable());
		this.writeListeStereotypeClassePourClasse(elementClasse, genClasse);
		this.writeListeProprieteClassePourClasse(elementClasse, genClasse);
		this.writeListeAttributPourClasse(elementClasse, genClasse);
		this.writeListeMethodePourClasse(elementClasse, genClasse);
		this.writeListeAssociationPourClasse(elementClasse, genClasse);
		this.writeListeClasseParentPourClasse(elementClasse, genClasse);
		elementClasses.addContent(elementClasse);
	}

	private void writeListeStereotypeClassePourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenStereotypeClasses() == null) || CollectionUtils.isEmpty(genClasse.getGenStereotypeClasses())) {
			return;
		}
		final Element elementStereotypesClasseRef = new Element(GenXmlNoeud.N_GenStereotypeClasses);
		for (final GenStereotypeClasse genStereotypeClasse : genClasse.getGenStereotypeClasses()) {
			this.writeStereotypeClassePourClasse(elementStereotypesClasseRef, genStereotypeClasse);
		}
		elementClasse.addContent(elementStereotypesClasseRef);
	}

	private void writeStereotypeClassePourClasse(final Element elementStereotypesClasseRef, final GenStereotypeClasse genStereotypeClasse) {
		final Element elementStereotypeClasse = new Element(GenXmlNoeud.N_GenStereotypeClasse);
		this.writeAttribute(elementStereotypeClasse, GenXmlNoeud.N_GenStereotypeClasse_A_Nom, genStereotypeClasse.getNom());
		elementStereotypesClasseRef.addContent(elementStereotypeClasse);
	}

	private void writeListeProprieteClassePourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenProprieteClasses() == null) || CollectionUtils.isEmpty(genClasse.getGenProprieteClasses())) {
			return;
		}
		final Element elementProprietesClasse = new Element(GenXmlNoeud.N_GenProprieteClasses);
		for (final GenProprieteClasse genProprieteClasse : genClasse.getGenProprieteClasses()) {
			this.writeProprieteClassePourClasse(elementProprietesClasse, genProprieteClasse);
		}
		elementClasse.addContent(elementProprietesClasse);
	}

	private void writeProprieteClassePourClasse(final Element elementProprietesClasse, final GenProprieteClasse genProprieteClasse) {
		final Element elementProprieteClasse = new Element(GenXmlNoeud.N_GenProprieteClasse);
		this.writeAttribute(elementProprieteClasse, GenXmlNoeud.N_GenProprieteClasse_A_Nom, genProprieteClasse.getNom());
		this.writeAttribute(elementProprieteClasse, GenXmlNoeud.N_GenProprieteClasse_A_Valeur, genProprieteClasse.getValeur());
		elementProprietesClasse.addContent(elementProprieteClasse);
	}

	private void writeListeAttributPourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenAttributs() == null) || CollectionUtils.isEmpty(genClasse.getGenAttributs())) {
			return;
		}
		final Element elementAttributs = new Element(GenXmlNoeud.N_GenAttributs);
		for (final GenAttribut genAttribut : genClasse.getGenAttributs()) {
			this.writeAttributPourClasse(elementAttributs, genAttribut);
		}
		elementClasse.addContent(elementAttributs);
	}

	private void writeAttributPourClasse(final Element elementClasse, final GenAttribut genAttribut) {
		final Element elementAttribut = new Element(GenXmlNoeud.N_GenAttribut);
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_GenId, genAttribut.getGenId());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_NomJava, genAttribut.getNomJava());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_Type, genAttribut.getType());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_NomSQL, genAttribut.getNomSQL());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_TypeSQL, genAttribut.getTypeSQL());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_Size, genAttribut.getSize());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_EstClePrimaire, genAttribut.getEstClePrimaire());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_EstCleEtrangere, genAttribut.getEstCleEtrangere());
		this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_EstDansTable, genAttribut.getEstDansTable());
		if ((genAttribut.getNbMin() != null) && (genAttribut.getNbMax() != null)) {
			this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_NbMin, genAttribut.getNbMin());
			this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_NbMax, genAttribut.getNbMax());
		} else {
			this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_NbMin, "1");
			this.writeAttribute(elementAttribut, GenXmlNoeud.N_GenAttribut_A_NbMax, "1");
		}
		this.writeListeStereotypeAttributPourAttribut(elementAttribut, genAttribut);
		this.writeListeProprieteAttributPourAttribut(elementAttribut, genAttribut);
		elementClasse.addContent(elementAttribut);
	}

	private void writeListeStereotypeAttributPourAttribut(final Element elementAttribut, final GenAttribut genAttribut) {
		if ((genAttribut.getGenStereotypeAttributs() == null) || CollectionUtils.isEmpty(genAttribut.getGenStereotypeAttributs())) {
			return;
		}
		final Element elementStereotypeAttributs = new Element(GenXmlNoeud.N_GenStereotypeAttributs);
		for (final GenStereotypeAttribut genStereotypeAttribut : genAttribut.getGenStereotypeAttributs()) {
			this.writeStereotypeAttributPourAttribut(elementStereotypeAttributs, genStereotypeAttribut);
		}
		elementAttribut.addContent(elementStereotypeAttributs);
	}

	private void writeStereotypeAttributPourAttribut(final Element elementStereotypesAttributRef, final GenStereotypeAttribut genStereotypeAttribut) {
		final Element elementStereotypeAttribut = new Element(GenXmlNoeud.N_GenStereotypeAttribut);
		this.writeAttribute(elementStereotypeAttribut, GenXmlNoeud.N_GenStereotypeAttribut_A_Nom, genStereotypeAttribut.getNom());
		elementStereotypesAttributRef.addContent(elementStereotypeAttribut);
	}

	private void writeListeProprieteAttributPourAttribut(final Element elementAttribut, final GenAttribut genAttribut) {
		if ((genAttribut.getGenProprieteAttributs() == null) || CollectionUtils.isEmpty(genAttribut.getGenProprieteAttributs())) {
			return;
		}
		final Element elementProprieteAttributs = new Element(GenXmlNoeud.N_GenProprieteAttributs);
		for (final GenProprieteAttribut genProprieteAttribut : genAttribut.getGenProprieteAttributs()) {
			this.writeProprieteAttributPourAttribut(elementProprieteAttributs, genProprieteAttribut);
		}
		elementAttribut.addContent(elementProprieteAttributs);
	}

	private void writeProprieteAttributPourAttribut(final Element elementProprietesAttribut, final GenProprieteAttribut genProprieteAttribut) {
		final Element elementProprieteAttribut = new Element(GenXmlNoeud.N_GenProprieteAttribut);
		this.writeAttribute(elementProprieteAttribut, GenXmlNoeud.N_GenProprieteAttribut_A_Nom, genProprieteAttribut.getNom());
		this.writeAttribute(elementProprieteAttribut, GenXmlNoeud.N_GenProprieteAttribut_A_Valeur, genProprieteAttribut.getValeur());
		elementProprietesAttribut.addContent(elementProprieteAttribut);
	}

	private void writeListeMethodePourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenMethodes() == null) || CollectionUtils.isEmpty(genClasse.getGenMethodes())) {
			return;
		}
		final Element elementMethodes = new Element(GenXmlNoeud.N_GenMethodes);
		for (final GenMethode genMethode : genClasse.getGenMethodes()) {
			this.writeMethodePourClasse(elementMethodes, genMethode);
		}
		elementClasse.addContent(elementMethodes);
	}

	private void writeMethodePourClasse(final Element elementClasse, final GenMethode genMethode) {
		final Element elementMethode = new Element(GenXmlNoeud.N_GenMethode);
		this.writeAttribute(elementMethode, GenXmlNoeud.N_GenMethode_A_GenId, genMethode.getGenId());
		this.writeAttribute(elementMethode, GenXmlNoeud.N_GenMethode_A_NomJava, genMethode.getNomJava());
		this.writeAttribute(elementMethode, GenXmlNoeud.N_GenMethode_A_RetourType, genMethode.getRetourType());
		this.writeListeParametrePourMethode(elementMethode, genMethode);
		this.writeListeStereotypeMethodePourMethode(elementMethode, genMethode);
		this.writeListeProprieteMethodePourMethode(elementMethode, genMethode);
		elementClasse.addContent(elementMethode);
	}

	private void writeListeParametrePourMethode(final Element elementMethode, final GenMethode genMethode) {
		if ((genMethode.getGenParametres() == null) || CollectionUtils.isEmpty(genMethode.getGenParametres())) {
			return;
		}
		final Element elementProprieteMethodes = new Element(GenXmlNoeud.N_GenProprieteMethodes);
		for (final GenParametre genParametre : genMethode.getGenParametres()) {
			this.writeParametrePourMethode(elementProprieteMethodes, genParametre);
		}
		elementMethode.addContent(elementProprieteMethodes);
	}

	private void writeParametrePourMethode(final Element elementMethode, final GenParametre genParametre) {
		final Element elementParametre = new Element(GenXmlNoeud.N_GenParametre);
		this.writeAttribute(elementParametre, GenXmlNoeud.N_GenParametre_A_GenId, genParametre.getGenId());
		this.writeAttribute(elementParametre, GenXmlNoeud.N_GenParametre_A_NomJava, genParametre.getNomJava());
		this.writeAttribute(elementParametre, GenXmlNoeud.N_GenParametre_A_Type, genParametre.getType());
		elementMethode.addContent(elementParametre);
	}

	private void writeListeStereotypeMethodePourMethode(final Element elementMethode, final GenMethode genMethode) {
		if ((genMethode.getGenStereotypeMethodes() == null) || CollectionUtils.isEmpty(genMethode.getGenStereotypeMethodes())) {
			return;
		}
		final Element elementStereotypeMethodes = new Element(GenXmlNoeud.N_GenStereotypeMethodes);
		for (final GenStereotypeMethode genStereotypeMethode : genMethode.getGenStereotypeMethodes()) {
			this.writeStereotypeMethodePourMethode(elementStereotypeMethodes, genStereotypeMethode);
		}
		elementMethode.addContent(elementStereotypeMethodes);
	}

	private void writeStereotypeMethodePourMethode(final Element elementStereotypesMethodeRef, final GenStereotypeMethode genStereotypeMethode) {
		final Element elementStereotypeMethode = new Element(GenXmlNoeud.N_GenStereotypeMethode);
		this.writeAttribute(elementStereotypeMethode, GenXmlNoeud.N_GenStereotypeMethode_A_Nom, genStereotypeMethode.getNom());
		elementStereotypesMethodeRef.addContent(elementStereotypeMethode);
	}

	private void writeListeProprieteMethodePourMethode(final Element elementMethode, final GenMethode genMethode) {
		if ((genMethode.getGenProprieteMethodes() == null) || CollectionUtils.isEmpty(genMethode.getGenProprieteMethodes())) {
			return;
		}
		final Element elementProprieteMethodes = new Element(GenXmlNoeud.N_GenProprieteMethodes);
		for (final GenProprieteMethode genProprieteMethode : genMethode.getGenProprieteMethodes()) {
			this.writeProprieteMethodePourMethode(elementProprieteMethodes, genProprieteMethode);
		}
		elementMethode.addContent(elementProprieteMethodes);
	}

	private void writeProprieteMethodePourMethode(final Element elementProprietesMethode, final GenProprieteMethode genProprieteMethode) {
		final Element elementProprieteMethode = new Element(GenXmlNoeud.N_GenProprieteMethode);
		this.writeAttribute(elementProprieteMethode, GenXmlNoeud.N_GenProprieteMethode_A_Nom, genProprieteMethode.getNom());
		this.writeAttribute(elementProprieteMethode, GenXmlNoeud.N_GenProprieteMethode_A_Valeur, genProprieteMethode.getValeur());
		elementProprietesMethode.addContent(elementProprieteMethode);
	}

	private void writeListeAssociationPourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenAssociations() == null) || CollectionUtils.isEmpty(genClasse.getGenAssociations())) {
			return;
		}
		final Element elementAssociations = new Element(GenXmlNoeud.N_GenAssociations);
		for (final GenAssociation genAssociation : genClasse.getGenAssociations()) {
			this.writeAssociationEndPourClasse(elementAssociations, genAssociation);
		}
		elementClasse.addContent(elementAssociations);
	}

	private void writeAssociationEndPourClasse(final Element elementClasse, final GenAssociation genAssociation) {
		final Element elementAssociation = new Element(GenXmlNoeud.N_GenAssociation);
		this.writeAttribute(elementAssociation, GenXmlNoeud.N_GenAssociation_A_GenId, genAssociation.getGenId());
		this.writeAttribute(elementAssociation, GenXmlNoeud.N_GenAssociation_A_NomJava, genAssociation.getNomJava());
		this.writeAttribute(elementAssociation, GenXmlNoeud.N_GenAssociation_A_ClasseGenId, genAssociation.getClasseGenId());
		if ((genAssociation.getNbMin() != null) && (genAssociation.getNbMax() != null)) {
			this.writeAttribute(elementAssociation, GenXmlNoeud.N_GenAssociation_A_NbMin, genAssociation.getNbMin());
			this.writeAttribute(elementAssociation, GenXmlNoeud.N_GenAssociation_A_NbMax, genAssociation.getNbMax());
		} else {
			this.writeAttribute(elementAssociation, GenXmlNoeud.N_GenAssociation_A_NbMin, "1");
			this.writeAttribute(elementAssociation, GenXmlNoeud.N_GenAssociation_A_NbMax, "1");
		}
		this.writeAssociationAttributsPourAssociation(elementAssociation, genAssociation.getGenAssociationAttributs());
		elementClasse.addContent(elementAssociation);
	}

	private void writeAssociationAttributsPourAssociation(final Element elementAssociation, final GenAssociationAttributs genAssociationAttributs) {
		if ((genAssociationAttributs == null) || CollectionUtils.isEmpty(genAssociationAttributs)) {
			return;
		}
		final Element elementAssociationAttributs = new Element(GenXmlNoeud.N_GenAssociationAttributs);
		if (genAssociationAttributs.getGenAssociationAttributs() != null) {
			for (final GenAssociationAttribut genAssociationAttribut : genAssociationAttributs.getGenAssociationAttributs()) {
				this.writeAssociationAttribut(elementAssociationAttributs, genAssociationAttribut);
			}
		}
		elementAssociation.addContent(elementAssociationAttributs);
	}

	private void writeAssociationAttribut(final Element elementAssociation, final GenAssociationAttribut genAssociationAttribut) {
		final Element elementAssociationAttribut = new Element(GenXmlNoeud.N_GenAssociationAttribut);
		this.writeAttribute(elementAssociationAttribut, GenXmlNoeud.N_GenAssociationAttribut_A_GenId, genAssociationAttribut.getGenId());
		elementAssociation.addContent(elementAssociationAttribut);
	}

	/**
	 * Gestion de la généralisation (héritage)
	 */

	private void writeListeClasseParentPourClasse(final Element elementClasse, final GenClasse genClasse) {
		if ((genClasse.getGenClasseParents() == null) || CollectionUtils.isEmpty(genClasse.getGenClasseParents())) {
			return;
		}
		final Element elementClasseParent = new Element(GenXmlNoeud.N_GenClasseParent);
		for (final GenClasseParent genClasseParent : genClasse.getGenClasseParents()) {
			this.writeClasseParentPourClasse(elementClasseParent, genClasseParent);
		}
		elementClasse.addContent(elementClasseParent);
	}

	private void writeClasseParentPourClasse(final Element elementClasse, final GenClasseParent genClasseParent) {
		final Element elementClasseParent = new Element(GenXmlNoeud.N_GenClasseParent);
		this.writeAttribute(elementClasseParent, GenXmlNoeud.N_GenClasseParent_A_ClasseGenId, genClasseParent.getClasseGenId());
		elementClasse.addContent(elementClasseParent);
	}

}
