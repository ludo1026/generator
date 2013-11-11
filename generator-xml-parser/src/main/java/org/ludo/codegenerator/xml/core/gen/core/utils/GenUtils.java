/*
 * Crée le 4 oct. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.utils;

import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethode;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenAssociationManager;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenAttributManager;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenClasseManager;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenManager;
import org.ludo.codegenerator.xml.core.gen.core.manager.GenMethodeManager;

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

	public List<GenAttribut> getListeGenAttributByGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		return GenClasseManager.getListeGenAttributForGenStereotype(genClasse, nomStereotype);
	}

	public List<GenMethode> getListeGenMethodeByGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		return GenClasseManager.getListeGenMethodeForGenStereotype(genClasse, nomStereotype);
	}

	public static String getProprieteValeur(final GenClasse genClasse, final String nom) {
		return GenClasseManager.getProprieteValeur(genClasse, nom);
	}

	public static GenProprieteClasse getGenPropriete(final GenClasse genClasse, final String nom) {
		return GenClasseManager.getGenPropriete(genClasse, nom);
	}

	/** GenAttributManager */

	public List<GenAttribut> getListeGenAttributByGenStereotype(final List<GenAttribut> listeGenAttribut, final String nomStereotype) {
		return GenAttributManager.getListeGenAttributByGenStereotype(listeGenAttribut, nomStereotype);
	}

	public static String getProprieteValeur(final GenAttribut genAttribut, final String nom) {
		return GenAttributManager.getProprieteValeur(genAttribut, nom);
	}

	public static GenProprieteAttribut getGenPropriete(final GenAttribut genAttribut, final String nom) {
		return GenAttributManager.getGenPropriete(genAttribut, nom);
	}

	/** GenMethodeManager */

	public List<GenMethode> getListeGenMethodeByGenStereotype(final List<GenMethode> listeMethode, final String nomStereotype) {
		return GenMethodeManager.getListeGenMethodeByGenStereotype(listeMethode, nomStereotype);
	}

	public static String getProprieteValeur(final GenMethode genMethode, final String nom) {
		return GenMethodeManager.getProprieteValeur(genMethode, nom);
	}

	public static GenProprieteMethode getGenPropriete(final GenMethode genMethode, final String nom) {
		return GenMethodeManager.getGenPropriete(genMethode, nom);
	}

	/** GenAssociation */

	public List<GenClasse> getListeGenClasseByGenStereotype(final Gen gen, final List<GenAssociation> listeAssociation, final String nomStereotype) {
		return GenAssociationManager.getListeGenClasseByGenStereotype(this.gen, listeAssociation, nomStereotype);
	}

}
