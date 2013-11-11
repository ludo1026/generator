/*
 * Crée le 29 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttributs;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 * 
 * @author Ludovic Chaboud
 * @date 29 sept. 08
 * @version $Revision$ $Date$
 * 
 */
public class GenAttributManager {
	public static List<GenAttribut> getListeGenAttributByGenStereotype(final List<GenAttribut> listeAttribut, final String nomStereotype) {
		AssertHelper.assertNotNullArgument(listeAttribut, "liste des méthodes", "getListeGenAttributByGenStereotype");
		AssertHelper.assertDefinedArgument(nomStereotype, "nom du stéréotype", "getListeGenAttributByGenStereotype");
		final List<GenAttribut> listeAttributPourStereotypeRef = new ArrayList<GenAttribut>();
		for (final Object element : listeAttribut) {
			final GenAttribut attribut = (GenAttribut) element;
			AssertHelper.assertNotNull(attribut, "méthode");
			final GenStereotypeAttributs stereotypeAttributs = attribut.getGenStereotypeAttributs();
			AssertHelper.assertNotNull(stereotypeAttributs, "stereotypesAttributRef de attribut");
			final List<GenStereotypeAttribut> listeStereotypeAttribut = stereotypeAttributs.getGenStereotypeAttributs();
			for (final GenStereotypeAttribut stereotypeAttribut : listeStereotypeAttribut) {
				AssertHelper.assertNotNull(stereotypeAttribut, "stereotypeAttribut");
				AssertHelper.assertDefined(stereotypeAttribut.getNom(), "nom du stéréotypeAttributRef");
				if (StringUtils.equals(stereotypeAttribut.getNom(), nomStereotype)) {
					listeAttributPourStereotypeRef.add(attribut);
					break;
				}
			}
		}
		return listeAttributPourStereotypeRef;
	}

	public static String getProprieteValeur(final GenAttribut genAttribut, final String nom) {
		return GenAttributManager.getGenPropriete(genAttribut, nom).getValeur();
	}

	public static GenProprieteAttribut getGenPropriete(final GenAttribut genAttribut, final String nom) {
		final GenProprieteAttributs genProprieteAttributs = genAttribut.getGenProprieteAttributs();
		final GenProprieteAttribut genProprieteAttribut = genProprieteAttributs.getGenProprieteAttributForNom(nom);
		AssertHelper.assertNotNull(genProprieteAttribut, "propriété de attribut");
		return genProprieteAttribut;
	}

}
