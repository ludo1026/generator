/*
 * Crée le 11 sept. 08 par François Dugast
 *
 */
package org.ludo.codegenerator.fusion.manager;

import org.ludo.codegenerator.fusion.utils.FichierHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 11 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class GenereManager
{

    /**
     * Remplacer le dernier template.
     * @param nomRepertoireTemplate
     * @param nomFichierTemplate
     * @param nomRepertoireDernierTemplate.
     */
    public void remplacerDernierGenere(
            final String nomRepertoireTemporaireNouveauGenere,
            final String nomFichierCodeSource,
            final String nomRepertoireDernierGenere
        )
    {
        FichierHelper
            .copierEtRemplacerFichier(
                nomRepertoireTemporaireNouveauGenere,
                nomFichierCodeSource,
                nomRepertoireDernierGenere
            );
    }

}

