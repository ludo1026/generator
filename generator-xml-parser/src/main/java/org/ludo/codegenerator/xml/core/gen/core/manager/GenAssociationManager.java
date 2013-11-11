/*
 * Crée le 29 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.manager;

import java.util.ArrayList;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 * 
 * @author Ludovic Chaboud
 * @date 29 sept. 08
 * @version $Revision$ $Date$
 * 
 */
public class GenAssociationManager {

	public static List<GenClasse> getListeGenClasseByGenStereotype(final Gen gen, final List<GenAssociation> listeAssociation, final String nomStereotype) {
		AssertHelper.assertNotNullArgument(gen, "gen", "getListeGenClasseByGenStereotype");
		AssertHelper.assertNotNullArgument(listeAssociation, "liste des méthodes", "getListeGenClasseByGenStereotype");
		AssertHelper.assertDefinedArgument(nomStereotype, "nom du stéréotype", "getListeGenClasseByGenStereotype");
		final List<GenClasse> listeClassePourAssociation = new ArrayList<GenClasse>();
		for (final Object element : listeAssociation) {
			final GenAssociation association = (GenAssociation) element;
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

	public static List<GenAttribut> getListeGenAttributByGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		final List<GenAttribut> listeGenAttribut = GenAttributManager.getListeGenAttributByGenStereotype(genClasse.getGenAttributs(), nomStereotype);
		AssertHelper.assertNotNull(listeGenAttribut, "liste des méthodes par stéréotype ('" + nomStereotype + "')");
		return listeGenAttribut;
	}

	public static List<GenMethode> getListeGenMethodeByGenStereotype(final GenClasse genClasse, final String nomStereotype) {
		final List<GenMethode> listeGenMethode = GenMethodeManager.getListeGenMethodeByGenStereotype(genClasse.getGenMethodes(), nomStereotype);
		AssertHelper.assertNotNull(listeGenMethode, "liste des méthodes par stéréotype ('" + nomStereotype + "')");
		return listeGenMethode;
	}
}
