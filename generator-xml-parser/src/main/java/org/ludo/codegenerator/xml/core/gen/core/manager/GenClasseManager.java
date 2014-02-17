/*
 * Crée le 29 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 * 
 * @author Ludovic Chaboud
 * @date 29 sept. 08
 * @version $Revision$ $Date$
 * 
 */
public class GenClasseManager {
	public static GenClasse getGenClasseForGenId(final GenClasses genClasses, final String classeGenId) {
		AssertHelper.assertNotNullArgument(genClasses, "genClasses", "getGenClasseByGenId");
		AssertHelper.assertDefinedArgument(classeGenId, "gen Id de la classe", "getGenClasseByGenId");
		final List<GenClasse> listeClasse = genClasses.getGenClasses();
		return GenClasseManager.getGenClasseForGenId(listeClasse, classeGenId);
	}

	public static GenClasse getGenClasseForGenId(final List<GenClasse> listeClasse, final String classeGenId) {
		AssertHelper.assertNotNullArgument(listeClasse, "liste des méthodes", "getGenClasseByGenId");
		AssertHelper.assertDefinedArgument(classeGenId, "gen Id de la classe", "getGenClasseByGenId");
		GenClasse classeTrouve = null;
		for (final Iterator<GenClasse> iterClasse = listeClasse.iterator(); (classeTrouve == null) && iterClasse.hasNext();) {
			final GenClasse classe = iterClasse.next();
			AssertHelper.assertNotNull(classe, "méthode");
			AssertHelper.assertDefined(classe.getGenId(), "gen Id de la classe");
			if (StringUtils.equals(classe.getGenId(), classeGenId)) {
				classeTrouve = classe;
			}
		}
		AssertHelper.assertNotNull(classeTrouve, "la classe recherchée n'a pas été trou vée : gen id = '" + classeGenId + "'");
		return classeTrouve;
	}

	public static List<GenClasse> getListeGenClasseForGenStereotype(final GenClasses genClasses, final String nomStereotype) {
		AssertHelper.assertNotNullArgument(genClasses, "genClasses", "getListeGenClasseByGenStereotype");
		AssertHelper.assertDefinedArgument(nomStereotype, "nom du stéréotype", "getListeGenClasseByGenStereotype");
		final List<GenClasse> listeClasse = genClasses.getGenClasses();
		return GenClasseManager.getListeGenClasseForGenStereotype(listeClasse, nomStereotype);
	}

	public static List<GenClasse> getListeGenClasseForGenStereotype(final List<GenClasse> listeClasse, final String nomStereotype) {
		AssertHelper.assertNotNullArgument(listeClasse, "liste des méthodes", "getListeGenClasseByGenStereotype");
		AssertHelper.assertDefinedArgument(nomStereotype, "nom du stéréotype", "getListeGenClasseByGenStereotype");
		final List<GenClasse> listeClassePourStereotypeRef = new ArrayList<GenClasse>();
		for (final GenClasse GenClasse : listeClasse) {
			final GenClasse classe = GenClasse;
			AssertHelper.assertNotNull(classe, "méthode");
			final List<GenClasseStereotype> listeStereotypeClasse = classe.getGenClasseStereotypes();
			boolean estAjoute = false;
			for (final Iterator<GenClasseStereotype> iterStereotypeClasse = listeStereotypeClasse.iterator(); !estAjoute && iterStereotypeClasse.hasNext();) {
				final GenClasseStereotype stereotypeClasse = iterStereotypeClasse.next();
				AssertHelper.assertNotNull(stereotypeClasse, "stereotypeClasse");
				AssertHelper.assertDefined(stereotypeClasse.getNom(), "nom du stéréotypeClasseRef");
				if (StringUtils.equals(stereotypeClasse.getNom(), nomStereotype)) {
					listeClassePourStereotypeRef.add(classe);
					estAjoute = true;
				}
			}
		}
		return listeClassePourStereotypeRef;
	}

	public static List<GenClasseAttribut> getListeGenClasseAttributForGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		final List<GenClasseAttribut> listeGenAttribut = GenClasseAttributManager.getListeGenClasseAttributByGenStereotype(genClasse.getGenClasseAttributs(), nomStereotype);
		AssertHelper.assertNotNull(listeGenAttribut, "liste des méthodes par stéréotype ('" + nomStereotype + "')");
		return listeGenAttribut;
	}

	public static List<GenClasseMethode> getListeGenClasseMethodeForGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		final List<GenClasseMethode> listeGenMethode = GenClasseMethodeManager.getListeGenClasseMethodeByGenStereotype(genClasse.getGenClasseMethodes(), nomStereotype);
		AssertHelper.assertNotNull(listeGenMethode, "liste des méthodes par stéréotype ('" + nomStereotype + "')");
		return listeGenMethode;
	}

	public static String getClasseProprieteValeur(final GenClasse genClasse, final String nom) {
		return GenClasseManager.getGenClassePropriete(genClasse, nom).getValeur();
	}

	public static GenClassePropriete getGenClassePropriete(final GenClasse genClasse, final String nom) {
		final GenClassePropriete genClassePropriete = genClasse.getGenClasseProprieteForNom(nom);
		AssertHelper.assertNotNull(genClassePropriete, "propriété de classe");
		return genClassePropriete;
	}
}
