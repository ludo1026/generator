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
import org.ludo.umlgenerator.xml.core.bean.IXMITag;
import org.ludo.umlgenerator.xml.core.bean.IXMITaggedValue;
import org.ludo.umlgenerator.xml.utils.Noeud;
import org.ludo.umlgenerator.xml.utils.XmlUtils;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.LoggerManager;
import org.ludo.utils.TypeUtils;

public class GenXmlHandler {

	private static Logger log = LoggerManager.getLogger(GenXmlHandler.class);

	private final Document document;

	public GenXmlHandler(final Document document) {
		this.document = document;
	}

	public void afficherArborescence() {
		final Element racine = this.document.getRootElement();
		if (racine == null) {
			return;
		}
		XmlUtils.parcourir(racine);
	}

	private boolean AFFICHER_ARBORESCENCE = false;

	public void write(final IXMI xmi) {
		if (this.AFFICHER_ARBORESCENCE) {
			this.afficherArborescence();
			return;
		} else {
			this.write(this.document, xmi);
		}
	}

	private void write(final Document document, final IXMI xmi) {
		/*
		 * Element racine = document.getRootElement(); if( racine == null ) {
		 * return; }
		 */

		this.writeListeStereotype(document, xmi.getListeStereotype());

		this.writeListePackage(document, xmi.getListePackageFils());

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

	private void writeListeStereotype(final Document document, final List listeXmiStereotype) {
		final Element elementStereotypes = this.getElementNoeudStereotypes(document);
		elementStereotypes.removeContent();
		this.writeListeStereotype(elementStereotypes, listeXmiStereotype);
	}

	private void writeListeStereotype(final Element elementStereotypes, final List listeXmiStereotype) {
		for (final Iterator iterXmiStereotype = listeXmiStereotype.iterator(); iterXmiStereotype.hasNext();) {
			final IXMIStereotype xmiStereotype = (IXMIStereotype) iterXmiStereotype.next();
			this.writeStereotype(elementStereotypes, xmiStereotype);
		}
	}

	private void writeStereotype(final Element elementStereotypes, final IXMIStereotype xmiStereotype) {
		final Element elementStereotype = new Element(GenXmlNoeud.N_GenStereotype);
		elementStereotype.setAttribute(GenXmlNoeud.N_GenStereotype_A_Nom, xmiStereotype.getNom());
		elementStereotypes.addContent(elementStereotype);
	}

	/**
	 * Définition des classes
	 */

	private String getNomPackage(final String packageCourant, final String packageFils) {
		if (StringUtils.isBlank(packageCourant)) {
			return StringUtils.uncapitalize(packageFils);
		} else {
			return packageCourant + "." + StringUtils.uncapitalize(packageFils);
		}
	}

	private void writeListePackage(final Document document, final List listeXmiPackage) {
		final Element elementStereotypes = this.getElementNoeudClasses(document);
		elementStereotypes.removeContent();
		this.writeListePackage(elementStereotypes, listeXmiPackage, "");
	}

	private void writeListePackage(final Element elementClasses, final List listeXmiPackage, final String packageCourant) {
		for (final Iterator iterXmiPackage = listeXmiPackage.iterator(); iterXmiPackage.hasNext();) {
			final IXMIPackage xmiPackage = (IXMIPackage) iterXmiPackage.next();
			this.writePackage(elementClasses, xmiPackage, this.getNomPackage(packageCourant, xmiPackage.getNom()));
		}
	}

	private void writePackage(final Element elementClasses, final IXMIPackage xmiPackage, final String packageCourant) {
		final List listeXmiClasse = xmiPackage.getListeClasse();
		for (final Iterator iterXmiClasse = listeXmiClasse.iterator(); iterXmiClasse.hasNext();) {
			final IXMIClasse xmiClasse = (IXMIClasse) iterXmiClasse.next();
			this.writeClasse(elementClasses, xmiClasse, packageCourant);
		}
		final List listeXmiPackageFils = xmiPackage.getListePackageFils();
		this.writeListePackage(elementClasses, listeXmiPackageFils, packageCourant);
	}

	private void writeClasse(final Element elementClasses, final IXMIClasse xmiClasse, final String packageCourant) {
		final Element elementClasse = new Element(GenXmlNoeud.N_GenClasse);
		elementClasse.setAttribute(GenXmlNoeud.N_GenClasse_A_GenId, xmiClasse.getGenId());
		elementClasse.setAttribute(GenXmlNoeud.N_GenClasse_A_NomJava, xmiClasse.getNom());
		elementClasse.setAttribute(GenXmlNoeud.N_GenClasse_A_PackageJava, packageCourant);
		this.writeListeStereotypeClassePourClasse(elementClasse, xmiClasse, packageCourant);
		this.writeListeProprieteClassePourClasse(elementClasse, xmiClasse, packageCourant);
		this.writeListeAttributPourClasse(elementClasse, xmiClasse, packageCourant);
		this.writeListeMethodePourClasse(elementClasse, xmiClasse, packageCourant);
		this.writeListeAssociationPourClasse(elementClasse, xmiClasse, packageCourant);
		elementClasses.addContent(elementClasse);
	}

	private void writeListeStereotypeClassePourClasse(final Element elementClasse, final IXMIClasse xmiClasse, final String packageCourant) {
		final Element elementStereotypesClasseRef = new Element(GenXmlNoeud.N_GenStereotypesClasseRef);
		for (final Iterator iterXMIStereotype = xmiClasse.getListeStereotype().iterator(); iterXMIStereotype.hasNext();) {
			final IXMIStereotype xmiStereotype = (IXMIStereotype) iterXMIStereotype.next();
			this.writeStereotypeClassePourClasse(elementStereotypesClasseRef, xmiStereotype, packageCourant);
		}
		elementClasse.addContent(elementStereotypesClasseRef);
	}

	private void writeStereotypeClassePourClasse(final Element elementStereotypesClasseRef, final IXMIStereotype xmiStereotype, final String packageCourant) {
		final Element elementStereotypeClasse = new Element(GenXmlNoeud.N_GenStereotypeClasse);
		elementStereotypeClasse.setAttribute(GenXmlNoeud.N_GenStereotypeClasse_A_Nom, xmiStereotype.getNom());
		elementStereotypesClasseRef.addContent(elementStereotypeClasse);
	}

	private void writeListeProprieteClassePourClasse(final Element elementClasse, final IXMIClasse xmiClasse, final String packageCourant) {
		final Element elementProprietesClasse = new Element(GenXmlNoeud.N_GenProprietesClasse);
		if (xmiClasse.getListeTaggedValue() == null) {
			return;
		}
		for (final Iterator iterXMITaggedValue = xmiClasse.getListeTaggedValue().iterator(); iterXMITaggedValue.hasNext();) {
			final IXMITaggedValue xmiTaggedValue = (IXMITaggedValue) iterXMITaggedValue.next();
			this.writeProprieteClassePourClasse(elementProprietesClasse, xmiTaggedValue, packageCourant);
		}
		elementClasse.addContent(elementProprietesClasse);
	}

	private void writeProprieteClassePourClasse(final Element elementProprietesClasse, final IXMITaggedValue xmiTaggedValue, final String packageCourant) {
		final Element elementProprieteClasse = new Element(GenXmlNoeud.N_GenProprieteClasse);
		final IXMITag xmiTag = xmiTaggedValue.getTag();
		AssertHelper.assertNotNull(xmiTag, "xmiTag");
		elementProprieteClasse.setAttribute(GenXmlNoeud.N_GenProprieteClasse_A_Nom, xmiTag.getNom());
		elementProprieteClasse.setAttribute(GenXmlNoeud.N_GenProprieteClasse_A_Valeur, xmiTaggedValue.getValeur());
		elementProprietesClasse.addContent(elementProprieteClasse);
	}

	private void writeListeAttributPourClasse(final Element elementClasse, final IXMIClasse xmiClasse, final String packageCourant) {
		final Element elementAttributs = new Element(GenXmlNoeud.N_GenAttributs);
		for (final Iterator iterXMIAttribut = xmiClasse.getListeAttribut().iterator(); iterXMIAttribut.hasNext();) {
			final IXMIAttribut xmiAttribut = (IXMIAttribut) iterXMIAttribut.next();
			this.writeAttributPourClasse(elementAttributs, xmiAttribut, packageCourant);
		}
		elementClasse.addContent(elementAttributs);
	}

	private void writeAttributPourClasse(final Element elementAttributs, final IXMIAttribut xmiAttribut, final String packageCourant) {
		final Element elementAttribut = new Element(GenXmlNoeud.N_GenAttribut);
		elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_GenId, xmiAttribut.getGenId());
		elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NomJava, xmiAttribut.getNom());
		if (xmiAttribut.getXmiDatatype() != null) {
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_Type, TypeUtils.formatTypeElementJava(xmiAttribut.getXmiDatatype().getNom()));
		}
		if (xmiAttribut.getXmiClasse() != null) {
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_Type, TypeUtils.formatTypeElementProjet(xmiAttribut.getXmiClasse().getGenId()));
		}
		if (xmiAttribut.getXmiMultiplicity() != null) {
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NombreMinimum, xmiAttribut.getXmiMultiplicity().getMinimum());
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NombreMaximum, xmiAttribut.getXmiMultiplicity().getMaximum());
		} else {
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NombreMinimum, "1");
			elementAttribut.setAttribute(GenXmlNoeud.N_GenAttribut_A_NombreMaximum, "1");
		}
		this.writeListeStereotypeAttributPourAttribut(elementAttribut, xmiAttribut, packageCourant);
		this.writeListeProprieteAttributPourAttribut(elementAttribut, xmiAttribut, packageCourant);
		elementAttributs.addContent(elementAttribut);
	}

	private void writeListeStereotypeAttributPourAttribut(final Element elementAttribut, final IXMIAttribut xmiAttribut, final String packageCourant) {
		final Element elementStereotypesAttributRef = new Element(GenXmlNoeud.N_GenStereotypesAttributRef);
		for (final Iterator iterXMIStereotype = xmiAttribut.getListeStereotype().iterator(); iterXMIStereotype.hasNext();) {
			final IXMIStereotype xmiStereotype = (IXMIStereotype) iterXMIStereotype.next();
			this.writeStereotypeAttributPourAttribut(elementStereotypesAttributRef, xmiStereotype, packageCourant);
		}
		elementAttribut.addContent(elementStereotypesAttributRef);
	}

	private void writeStereotypeAttributPourAttribut(final Element elementStereotypesAttributRef, final IXMIStereotype xmiStereotypeAttribut, final String packageCourant) {
		final Element elementStereotypeAttribut = new Element(GenXmlNoeud.N_GenStereotypeAttribut);
		elementStereotypeAttribut.setAttribute(GenXmlNoeud.N_GenStereotypeAttribut_A_Nom, xmiStereotypeAttribut.getNom());
		elementStereotypesAttributRef.addContent(elementStereotypeAttribut);
	}

	private void writeListeProprieteAttributPourAttribut(final Element elementAttribut, final IXMIAttribut xmiAttribut, final String packageCourant) {
		final Element elementProprietesAttribut = new Element(GenXmlNoeud.N_GenProprietesAttribut);
		if (xmiAttribut.getListeTaggedValue() == null) {
			return;
		}
		for (final Iterator iterXMITaggedValue = xmiAttribut.getListeTaggedValue().iterator(); iterXMITaggedValue.hasNext();) {
			final IXMITaggedValue xmiTaggedValue = (IXMITaggedValue) iterXMITaggedValue.next();
			this.writeProprieteAttributPourAttribut(elementProprietesAttribut, xmiTaggedValue, packageCourant);
		}
		elementAttribut.addContent(elementProprietesAttribut);
	}

	private void writeProprieteAttributPourAttribut(final Element elementProprietesAttribut, final IXMITaggedValue xmiTaggedValue, final String packageCourant) {
		final Element elementProprieteAttribut = new Element(GenXmlNoeud.N_GenProprieteAttribut);
		final IXMITag xmiTag = xmiTaggedValue.getTag();
		AssertHelper.assertNotNull(xmiTag, "xmiTag");
		elementProprieteAttribut.setAttribute(GenXmlNoeud.N_GenProprieteAttribut_A_Nom, xmiTag.getNom());
		elementProprieteAttribut.setAttribute(GenXmlNoeud.N_GenProprieteAttribut_A_Valeur, xmiTaggedValue.getValeur());
		elementProprietesAttribut.addContent(elementProprieteAttribut);
	}

	private void writeListeMethodePourClasse(final Element elementClasse, final IXMIClasse xmiClasse, final String packageCourant) {
		final Element elementMethodes = new Element(GenXmlNoeud.N_GenMethodes);
		for (final Iterator iterXMIOperation = xmiClasse.getListeOperation().iterator(); iterXMIOperation.hasNext();) {
			final IXMIOperation xmiOperation = (IXMIOperation) iterXMIOperation.next();
			this.writeMethodePourClasse(elementMethodes, xmiOperation, packageCourant);
		}
		elementClasse.addContent(elementMethodes);
	}

	private void writeMethodePourClasse(final Element elementMethodes, final IXMIOperation xmiOperation, final String packageCourant) {
		final Element elementMethode = new Element(GenXmlNoeud.N_GenMethode);
		elementMethode.setAttribute(GenXmlNoeud.N_GenMethode_A_GenId, xmiOperation.getGenId());
		elementMethode.setAttribute(GenXmlNoeud.N_GenMethode_A_NomJava, xmiOperation.getNom());
		AssertHelper.assertDefined(xmiOperation.getParametreRetour(), "paramètre retour de l'opération");
		if (xmiOperation.getParametreRetour().getXmiDatatype() != null) {
			elementMethode.setAttribute(GenXmlNoeud.N_GenMethode_A_RetourType, TypeUtils.formatTypeElementJava(xmiOperation.getParametreRetour().getXmiDatatype().getNom()));
		}
		if (xmiOperation.getParametreRetour().getXmiClasse() != null) {
			elementMethode.setAttribute(GenXmlNoeud.N_GenMethode_A_RetourType, xmiOperation.getParametreRetour().getXmiClasse().getGenId());
		}
		this.writeListeParametrePourMethode(elementMethode, xmiOperation, packageCourant);
		this.writeListeStereotypeMethodePourMethode(elementMethode, xmiOperation, packageCourant);
		this.writeListeProprieteMethodePourMethode(elementMethode, xmiOperation, packageCourant);
		elementMethodes.addContent(elementMethode);
	}

	private void writeListeParametrePourMethode(final Element elementMethode, final IXMIOperation xmiOperation, final String packageCourant) {
		final Element elementParametres = new Element(GenXmlNoeud.N_GenParametres);
		for (final Iterator iterXMIParametre = xmiOperation.getListeParametre().iterator(); iterXMIParametre.hasNext();) {
			final IXMIParametre xmiParametre = (IXMIParametre) iterXMIParametre.next();
			this.writeParametrePourMethode(elementParametres, xmiParametre, packageCourant);
		}
		elementMethode.addContent(elementParametres);
	}

	private void writeParametrePourMethode(final Element elementParametres, final IXMIParametre xmiParametre, final String packageCourant) {
		final Element elementParametre = new Element(GenXmlNoeud.N_GenParametre);
		elementParametre.setAttribute(GenXmlNoeud.N_GenParametre_A_GenId, xmiParametre.getGenId());
		elementParametre.setAttribute(GenXmlNoeud.N_GenParametre_A_NomJava, xmiParametre.getNom());
		if (xmiParametre.getXmiDatatype() != null) {
			elementParametre.setAttribute(GenXmlNoeud.N_GenParametre_A_Type, TypeUtils.formatTypeElementJava(xmiParametre.getXmiDatatype().getNom()));
		}
		if (xmiParametre.getXmiClasse() != null) {
			elementParametre.setAttribute(GenXmlNoeud.N_GenParametre_A_Type, TypeUtils.formatTypeElementProjet(xmiParametre.getXmiClasse().getGenId()));
		}
		elementParametres.addContent(elementParametre);
	}

	private void writeListeStereotypeMethodePourMethode(final Element elementMethode, final IXMIOperation xmiOperation, final String packageCourant) {
		final Element elementStereotypesMethodeRef = new Element(GenXmlNoeud.N_GenStereotypesMethodeRef);
		for (final Iterator iterXMIStereotype = xmiOperation.getListeStereotype().iterator(); iterXMIStereotype.hasNext();) {
			final IXMIStereotype xmiStereotype = (IXMIStereotype) iterXMIStereotype.next();
			this.writeStereotypeMethodePourMethode(elementStereotypesMethodeRef, xmiStereotype, packageCourant);
		}
		elementMethode.addContent(elementStereotypesMethodeRef);
	}

	private void writeStereotypeMethodePourMethode(final Element elementStereotypesMethodeRef, final IXMIStereotype xmiStereotype, final String packageCourant) {
		final Element elementStereotypeMethode = new Element(GenXmlNoeud.N_GenStereotypeMethode);
		elementStereotypeMethode.setAttribute(GenXmlNoeud.N_GenStereotypeMethode_A_Nom, xmiStereotype.getNom());
		elementStereotypesMethodeRef.addContent(elementStereotypeMethode);
	}

	private void writeListeProprieteMethodePourMethode(final Element elementMethode, final IXMIOperation xmiOperation, final String packageCourant) {
		final Element elementProprietesMethode = new Element(GenXmlNoeud.N_GenProprietesMethode);
		if (xmiOperation.getListeTaggedValue() == null) {
			return;
		}
		for (final Iterator iterXMITaggedValue = xmiOperation.getListeTaggedValue().iterator(); iterXMITaggedValue.hasNext();) {
			final IXMITaggedValue xmiTaggedValue = (IXMITaggedValue) iterXMITaggedValue.next();
			this.writeProprieteMethodePourMethode(elementProprietesMethode, xmiTaggedValue, packageCourant);
		}
		elementMethode.addContent(elementProprietesMethode);
	}

	private void writeProprieteMethodePourMethode(final Element elementProprietesMethode, final IXMITaggedValue xmiTaggedValue, final String packageCourant) {
		final Element elementProprieteMethode = new Element(GenXmlNoeud.N_GenProprieteMethode);
		final IXMITag xmiTag = xmiTaggedValue.getTag();
		AssertHelper.assertNotNull(xmiTag, "xmiTag");
		elementProprieteMethode.setAttribute(GenXmlNoeud.N_GenProprieteMethode_A_Nom, xmiTag.getNom());
		elementProprieteMethode.setAttribute(GenXmlNoeud.N_GenProprieteMethode_A_Valeur, xmiTaggedValue.getValeur());
		elementProprietesMethode.addContent(elementProprieteMethode);
	}

	private void writeListeAssociationPourClasse(final Element elementClasse, final IXMIClasse xmiClasse, final String packageCourant) {
		final Element elementAssociations = new Element(GenXmlNoeud.N_GenAssociations);
		for (final Iterator iterXMIAssociationEnd = xmiClasse.getListeAssociationEnd().iterator(); iterXMIAssociationEnd.hasNext();) {
			final IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) iterXMIAssociationEnd.next();
			// on ne met l'association que si un nom de champ a été défini
			if (StringUtils.isNotBlank(xmiAssociationEnd.getNomChamp())) {
				this.writeAssociationEndPourClasse(elementAssociations, xmiAssociationEnd, packageCourant);
			}
		}
		elementClasse.addContent(elementAssociations);
	}

	private void writeAssociationEndPourClasse(final Element elementAssociations, final IXMIAssociationEnd xmiAssociationEnd, final String packageCourant) {
		final Element elementAssociation = new Element(GenXmlNoeud.N_GenAssociation);
		final IXMIClasse classeRef = xmiAssociationEnd.getXMIClasseRef();
		elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_GenId, xmiAssociationEnd.getGenId());
		elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_NomJavaChamp, xmiAssociationEnd.getNomChamp());
		elementAssociation.setAttribute(GenXmlNoeud.N_GenAssociation_A_ClasseGenId, TypeUtils.formatTypeElementProjet(classeRef.getGenId()));
		if (xmiAssociationEnd.getXmiMultiplicity() != null) {
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

	private void writeListeClasseParentPourClasse(final Element elementClasse, final IXMIClasse xmiClasse, final String packageCourant) {
		final Element elementClasseParents = new Element(GenXmlNoeud.N_GenClasseParents);
		for (final Iterator iterXMIClasseParent = xmiClasse.getListeClasseParent().iterator(); iterXMIClasseParent.hasNext();) {
			final IXMIClasse xmiClasseParent = (IXMIClasse) iterXMIClasseParent.next();
			this.writeClasseParentPourClasse(elementClasseParents, xmiClasseParent, xmiClasse);
		}
		elementClasse.addContent(elementClasseParents);
	}

	private void writeClasseParentPourClasse(final Element elementClasseParents, final IXMIClasse xmiClasseParent, final IXMIClasse classe) {
		final Element elementClasseParent = new Element(GenXmlNoeud.N_GenClasseParent);
		elementClasseParent.setAttribute(GenXmlNoeud.N_GenClasseParent_A_ClasseGenId, xmiClasseParent.getGenId());
		elementClasseParents.addContent(elementClasseParent);
	}

}
