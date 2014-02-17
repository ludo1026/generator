/*
 * Crée le 29 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.manager;

import java.util.ArrayList;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 * 
 * @author Ludovic Chaboud
 * @date 29 sept. 08
 * @version $Revision$ $Date$
 * 
 */
public class GenClasseAssociationManager {

	public static List<GenClasse> getListeGenClasseByGenStereotype(final Gen gen, final List<GenClasseAssociation> listeAssociation, final String nomStereotype) {
		AssertHelper.assertNotNullArgument(gen, "gen", "getListeGenClasseByGenStereotype");
		AssertHelper.assertNotNullArgument(listeAssociation, "liste des méthodes", "getListeGenClasseByGenStereotype");
		AssertHelper.assertDefinedArgument(nomStereotype, "nom du stéréotype", "getListeGenClasseByGenStereotype");
		final List<GenClasse> listeClassePourAssociation = new ArrayList<GenClasse>();
		for (final Object element : listeAssociation) {
			final GenClasseAssociation association = (GenClasseAssociation) element;
			final String classeAssocieGenId = association.getClasseGenId();
			AssertHelper.assertDefined(classeAssocieGenId, "id de la classe associée");
			final GenClasse classeAssocie = GenManager.getGenClasseByGenId(gen, classeAssocieGenId);
			AssertHelper.assertNotNull(classeAssocie, "Classe associée non trouvée : genId = '" + classeAssocieGenId + "'");
			listeClassePourAssociation.add(classeAssocie);
		}
		List<GenClasse> listeClasseByStereotype = new ArrayList<GenClasse>();
		if (!listeClassePourAssociation.isEmpty()) {
			listeClasseByStereotype = GenClasseManager.getListeGenClasseForGenStereotype(listeClassePourAssociation, nomStereotype);
		}
		AssertHelper.assertNotNull(listeClasseByStereotype, "liste des classes associées pour stéréotype ('" + nomStereotype + "')");
		return listeClasseByStereotype;
	}

	public static List<GenClasseAttribut> getListeGenClasseAttributByGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		final List<GenClasseAttribut> listeGenClasseAttribut = GenClasseAttributManager.getListeGenClasseAttributByGenStereotype(genClasse.getGenClasseAttributs(), nomStereotype);
		AssertHelper.assertNotNull(listeGenClasseAttribut, "liste des méthodes par stéréotype ('" + nomStereotype + "')");
		return listeGenClasseAttribut;
	}

	public static List<GenClasseMethode> getListeGenMethodeByGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		final List<GenClasseMethode> listeGenMethode = GenClasseMethodeManager.getListeGenClasseMethodeByGenStereotype(genClasse.getGenClasseMethodes(), nomStereotype);
		AssertHelper.assertNotNull(listeGenMethode, "liste des méthodes par stéréotype ('" + nomStereotype + "')");
		return listeGenMethode;
	}
}
