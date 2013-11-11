/*
 * Crée le 29 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethodes;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 * 
 * @author Ludovic Chaboud
 * @date 29 sept. 08
 * @version $Revision$ $Date$
 * 
 */
public class GenMethodeManager {
	public static List<GenMethode> getListeGenMethodeByGenStereotype(final List<GenMethode> listeMethode, final String nomStereotype) {
		AssertHelper.assertNotNullArgument(listeMethode, "liste des méthodes", "getListeGenMethodeByGenStereotype");
		AssertHelper.assertDefinedArgument(nomStereotype, "nom du stéréotype", "getListeGenMethodeByGenStereotype");
		final List<GenMethode> listeMethodePourStereotypeRef = new ArrayList<GenMethode>();
		for (final GenMethode GenMethode : listeMethode) {
			final GenMethode methode = GenMethode;
			AssertHelper.assertNotNull(methode, "méthode");
			final GenStereotypeMethodes stereotypeMethodes = methode.getGenStereotypeMethodes();
			AssertHelper.assertNotNull(stereotypeMethodes, "stereotypesMethodeRef de methode");
			final List<GenStereotypeMethode> listeStereotypeMethode = stereotypeMethodes.getGenStereotypeMethodes();
			for (final GenStereotypeMethode stereotypeMethode : listeStereotypeMethode) {
				AssertHelper.assertNotNull(stereotypeMethode, "stereotypeMethode");
				AssertHelper.assertDefined(stereotypeMethode.getNom(), "nom du stéréotypeMethodeRef");
				if (StringUtils.equals(stereotypeMethode.getNom(), nomStereotype)) {
					listeMethodePourStereotypeRef.add(methode);
					break;
				}
			}
		}
		return listeMethodePourStereotypeRef;
	}

	public static String getProprieteValeur(final GenMethode genMethode, final String nom) {
		return GenMethodeManager.getGenPropriete(genMethode, nom).getValeur();
	}

	public static GenProprieteMethode getGenPropriete(final GenMethode genMethode, final String nom) {
		final GenProprieteMethodes genProprieteMethodes = genMethode.getGenProprieteMethodes();
		final GenProprieteMethode genProprieteMethode = genProprieteMethodes.getGenProprieteMethodeForNom(nom);
		AssertHelper.assertNotNull(genProprieteMethode, "propriété de methode");
		return genProprieteMethode;
	}

}
