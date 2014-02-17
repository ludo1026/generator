/*
 * Crée le 4 oct. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.utils;

import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributPropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenClasseAssociationManager;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenClasseAttributManager;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenClasseManager;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenClasseMethodeManager;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenManager;

/**
 * Description de la classe.
 * 
 * @author Ludovic Chaboud
 * @date 4 oct. 08
 * @version $Revision$ $Date$
 * 
 */
public class GenUtils {
	public static synchronized GenUtils getNewGenUtilsPourGen(final Gen gen) {
		return new GenUtils(gen);
	}

	/********************************************************
	 * Variables.
	 */

	private Gen gen = null;

	/********************************************************
	 * Constructeur.
	 */

	private GenUtils(final Gen gen) {
		this.gen = gen;
	}

	/********************************************************
	 * Méthodes des managers.
	 */

	/** GenManager */

	public List<GenClasse> getListeGenClasseByGenStereotype(final String nomStereotype) {
		return GenManager.getListeGenClasseByGenStereotype(this.gen, nomStereotype);
	}

	public GenClasse getGenClasseByGenId(final String classeGenId) {
		return GenManager.getGenClasseByGenId(this.gen, classeGenId);
	}

	/** GenClasseManager */

	public GenClasse getGenClasseByGenId(final GenClasses genClasses, final String classeGenId) {
		return GenClasseManager.getGenClasseForGenId(genClasses, classeGenId);
	}

	public GenClasse getGenClasseByGenId(final List<GenClasse> listeClasse, final String classeGenId) {
		return GenClasseManager.getGenClasseForGenId(listeClasse, classeGenId);
	}

	public List<GenClasse> getListeGenClasseByGenStereotype(final GenClasses genClasses, final String nomStereotype) {
		return GenClasseManager.getListeGenClasseForGenStereotype(genClasses, nomStereotype);
	}

	public List<GenClasse> getListeGenClasseByGenStereotype(final List<GenClasse> listeClasse, final String nomStereotype) {
		return GenClasseManager.getListeGenClasseForGenStereotype(listeClasse, nomStereotype);
	}

	public List<GenClasseAttribut> getListeGenClasseAttributByGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		return GenClasseManager.getListeGenClasseAttributForGenStereotype(genClasse, nomStereotype);
	}

	public List<GenClasseMethode> getListeGenMethodeByGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		return GenClasseManager.getListeGenClasseMethodeForGenStereotype(genClasse, nomStereotype);
	}

	public static String getProprieteValeur(final GenClasse genClasse, final String nom) {
		return GenClasseManager.getClasseProprieteValeur(genClasse, nom);
	}

	public static GenClassePropriete getGenPropriete(final GenClasse genClasse, final String nom) {
		return GenClasseManager.getGenClassePropriete(genClasse, nom);
	}

	/** GenClasseAttributManager */

	public List<GenClasseAttribut> getListeGenClasseAttributByGenStereotype(final List<GenClasseAttribut> listeGenClasseAttribut, final String nomStereotype) {
		return GenClasseAttributManager.getListeGenClasseAttributByGenStereotype(listeGenClasseAttribut, nomStereotype);
	}

	public static String getProprieteValeur(final GenClasseAttribut genAttribut, final String nom) {
		return GenClasseAttributManager.getClasseAttributProprieteValeur(genAttribut, nom);
	}

	public static GenClasseAttributPropriete getGenPropriete(final GenClasseAttribut genAttribut, final String nom) {
		return GenClasseAttributManager.getGenPropriete(genAttribut, nom);
	}

	/** GenMethodeManager */

	public List<GenClasseMethode> getListeGenMethodeByGenStereotype(final List<GenClasseMethode> listeMethode, final String nomStereotype) {
		return GenClasseMethodeManager.getListeGenClasseMethodeByGenStereotype(listeMethode, nomStereotype);
	}

	public static String getClasseMethodeProprieteValeur(final GenClasseMethode genMethode, final String nom) {
		return GenClasseMethodeManager.getClasseMethodeProprieteValeur(genMethode, nom);
	}

	public static GenClasseMethodePropriete getGenPropriete(final GenClasseMethode genMethode, final String nom) {
		return GenClasseMethodeManager.getGenClasseMethodePropriete(genMethode, nom);
	}

	/** GenAssociation */

	public List<GenClasse> getListeGenClasseByGenStereotype(final Gen gen, final List<GenClasseAssociation> listeAssociation, final String nomStereotype) {
		return GenClasseAssociationManager.getListeGenClasseByGenStereotype(this.gen, listeAssociation, nomStereotype);
	}

}
