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
public class FichierSourceManager
{
    
    /**
     * Remplacer le code source à partir de celui situé dans le répertoire temporaire.
     * @param nomRepertoireTemporaire
     * @param nomFichierCodeSource
     * @param nomRepertoireCodeSource.
     */
    public void remplacerCodeSource(
            final String nomRepertoireTemporaire,
            final String nomFichierCodeSource,
            final String nomRepertoireCodeSource
        )
    {
        FichierHelper
            .copierEtRemplacerFichier(
                nomRepertoireTemporaire, 
                nomFichierCodeSource, 
                nomRepertoireCodeSource
            );
    }
    
}

