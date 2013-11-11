/*
 * Crée le 29 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.xml.core.gen.core.manager;

import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
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
public class GenManager {
	public static List<GenClasse> getListeGenClasseByGenStereotype(final Gen gen, final String nomStereotype) {
		final GenClasses genClasses = gen.getGenClasses();
		final List<GenClasse> listeGenClasse = GenClasseManager.getListeGenClasseForGenStereotype(genClasses, nomStereotype);
		AssertHelper.assertNotNull(listeGenClasse, "liste des méthodes par stéréotype ('" + nomStereotype + "')");
		return listeGenClasse;
	}

	public static GenClasse getGenClasseByGenId(final Gen gen, final String classeGenId) {
		final GenClasses genClasses = gen.getGenClasses();
		final GenClasse genClasse = GenClasseManager.getGenClasseForGenId(genClasses, classeGenId);
		AssertHelper.assertNotNull(genClasse, "Classe non trouvée : genId = '" + classeGenId + "'");
		return genClasse;
	}

}
