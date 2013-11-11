/*
 * Crée le 11 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.manager;

import org.ludo.codegenerator.fusion.utils.FichierHelper;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 11 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class SauvegardeManager
{

    /**
     * Nom du répertoire de sauvegarde du fichier de code source.
     * @param nomRepertoireCodeSource
     * @param nomFichierCodeSource
     * @param nomRepertoireSauvegarde
     * @return.
     */
    private String getNomRepertoireSauvegardeCodeSource(
            final String nomRepertoireCodeSource,
            final String nomFichierCodeSource,
            final String nomRepertoireSauvegarde)
    {
        AssertHelper.assertDefinedArgument(
                nomFichierCodeSource,
                "nom du fichier de code source",
                "getNomRepertoireSauvegardeCodeSource");

        return
            nomRepertoireCodeSource
          + "/"
          + FichierHelper.getDateEtHeureMaintenantToString()
          + "/"
          + nomRepertoireSauvegarde
          + "/"
          + nomFichierCodeSource;
    }

    /**
     * Nom du répertoire de sauvegarde du fichier de code source.
     * @param nomRepertoireGenere
     * @param nomFichierGenere
     * @param nomRepertoireSauvegarde
     * @return.
     */
    private String getNomRepertoireSauvegardeGenere(
            final String nomRepertoireGenere,
            final String nomFichierGenere,
            final String nomRepertoireSauvegarde)
    {
        AssertHelper.assertDefinedArgument(
                nomFichierGenere,
                "nom du fichier de code source",
                "getNomRepertoireSauvegardeGenere");

        return
            nomRepertoireGenere
          + "/"
          + FichierHelper.getDateEtHeureMaintenantToString()
          + "/"
          + nomRepertoireSauvegarde
          + "/"
          + nomFichierGenere;
    }

    /**
     * Sauvegarder le code source.
     * @param nomRepertoireCodeSource
     * @param nomFichierCodeSource
     * @param nomRepertoireSauvegarde.
     */
    public final void sauvegarderCodeSource(
            final String nomRepertoireCodeSource,
            final String nomFichierCodeSource,
            final String nomRepertoireSauvegarde
        )
    {
        FichierHelper
            .creerRepertoire(
                nomRepertoireSauvegarde
            );

        final String nomFichierComplet =
            FichierHelper
                .getNomFichierComplet(
                    nomFichierCodeSource,
                    nomRepertoireSauvegarde
                );

        final String nomRepertoireSauvegardePourCodeSource =
            getNomRepertoireSauvegardeCodeSource(
                nomRepertoireCodeSource,
                nomFichierCodeSource,
                nomRepertoireSauvegarde
            );

        FichierHelper
            .creerRepertoire(
                nomRepertoireSauvegardePourCodeSource
            );

        FichierHelper
            .copierEtRemplacerFichier(
                nomRepertoireCodeSource,
                nomFichierCodeSource,
                nomRepertoireSauvegardePourCodeSource
            );
    }

    /**
     * Sauvegarder le fichier du template.
     * @param nomRepertoireGenere
     * @param nomFichierGenere
     * @param nomRepertoireSauvegarde.
     */
    public final void sauvegarderGenere(
            final String nomRepertoireGenere,
            final String nomFichierGenere,
            final String nomRepertoireSauvegarde
        )
    {
        FichierHelper
            .creerRepertoire(
                nomRepertoireSauvegarde
            );

        final String nomFichierComplet =
            FichierHelper
                .getNomFichierComplet(
                    nomFichierGenere,
                    nomRepertoireSauvegarde
                );

        final String nomRepertoireSauvegardePourGenere =
            getNomRepertoireSauvegardeGenere(
                nomRepertoireGenere,
                nomFichierGenere,
                nomRepertoireSauvegarde
            );

        FichierHelper
            .creerRepertoire(
                nomRepertoireSauvegardePourGenere
            );

        FichierHelper
            .copierEtRemplacerFichier(
                nomRepertoireGenere,
                nomFichierGenere,
                nomRepertoireSauvegardePourGenere
            );
    }

}

