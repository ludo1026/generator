/*
 * Crée le 29 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodeStereotype;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 * 
 * @author Ludovic Chaboud
 * @date 29 sept. 08
 * @version $Revision$ $Date$
 * 
 */
public class GenClasseMethodeManager {
	public static List<GenClasseMethode> getListeGenClasseMethodeByGenStereotype(final List<GenClasseMethode> listeMethode, final String nomStereotype) {
		AssertHelper.assertNotNullArgument(listeMethode, "liste des méthodes", "getListeGenClasseMethodeByGenStereotype");
		AssertHelper.assertDefinedArgument(nomStereotype, "nom du stéréotype", "getListeGenClasseMethodeByGenStereotype");
		final List<GenClasseMethode> listeMethodePourStereotypeRef = new ArrayList<GenClasseMethode>();
		for (final GenClasseMethode GenClasseMethode : listeMethode) {
			final GenClasseMethode methode = GenClasseMethode;
			AssertHelper.assertNotNull(methode, "méthode");
			final List<GenClasseMethodeStereotype> listeStereotypeMethode = methode.getGenClasseMethodeStereotypes();
			for (final GenClasseMethodeStereotype stereotypeMethode : listeStereotypeMethode) {
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

	public static String getClasseMethodeProprieteValeur(final GenClasseMethode genMethode, final String nom) {
		return GenClasseMethodeManager.getGenClasseMethodePropriete(genMethode, nom).getValeur();
	}

	public static GenClasseMethodePropriete getGenClasseMethodePropriete(final GenClasseMethode genMethode, final String nom) {
		final GenClasseMethodePropriete genProprieteMethode = genMethode.getGenClasseMethodeProprieteForNom(nom);
		AssertHelper.assertNotNull(genProprieteMethode, "propriété de methode");
		return genProprieteMethode;
	}

}
