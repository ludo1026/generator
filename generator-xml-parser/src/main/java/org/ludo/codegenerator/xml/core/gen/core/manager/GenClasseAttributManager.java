/*
 * Crée le 29 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributPropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributStereotype;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 * 
 * @author Ludovic Chaboud
 * @date 29 sept. 08
 * @version $Revision$ $Date$
 * 
 */
public class GenClasseAttributManager {
	public static List<GenClasseAttribut> getListeGenClasseAttributByGenStereotype(final List<GenClasseAttribut> listeAttribut, final String nomStereotype) {
		AssertHelper.assertNotNullArgument(listeAttribut, "liste des méthodes", "getListeGenAttributByGenStereotype");
		AssertHelper.assertDefinedArgument(nomStereotype, "nom du stéréotype", "getListeGenAttributByGenStereotype");
		final List<GenClasseAttribut> listeAttributPourStereotypeRef = new ArrayList<GenClasseAttribut>();
		for (final Object element : listeAttribut) {
			final GenClasseAttribut attribut = (GenClasseAttribut) element;
			AssertHelper.assertNotNull(attribut, "méthode");
			for (final GenClasseAttributStereotype stereotypeAttribut : attribut.getGenClasseAttributStereotypes()) {
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

	public static String getClasseAttributProprieteValeur(final GenClasseAttribut genAttribut, final String nom) {
		return GenClasseAttributManager.getGenPropriete(genAttribut, nom).getValeur();
	}

	public static GenClasseAttributPropriete getGenPropriete(final GenClasseAttribut genAttribut, final String nom) {
		final GenClasseAttributPropriete genProprieteAttribut = genAttribut.getGenClasseAttributProprieteForNom(nom);
		AssertHelper.assertNotNull(genProprieteAttribut, "propriété de attribut");
		return genProprieteAttribut;
	}

}
