/*
 * Crée le 11 sept. 08 par François Dugast
 * 
 */
package org.ludo.codegenerator.fusion.manager;

import java.io.File;
import java.io.StringWriter;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.ludo.codegenerator.fusion.utils.FichierHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 11 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class GenerationDepuisTemplateManager
{
    
    /**
     * Génère le fichier à partir du template dans le répertoire cible.
     * @param nomRepertoireTemplate Répertoire du template
     * @param nomFichierTemplate Nom du fichier du template
     * @param nomRepertoireTemporaire Répertoire temporaire
     * @param nomFichierCodeSource Nom du fichier du code source.
     */
    public void genererDepuisTemplate(
            final String nomRepertoireTemplate,
            final String nomFichierTemplate,
            final String nomRepertoireTemporaire,
            final String nomFichierCodeSource,
            final VelocityContext velocityContext
        )
    {
        /** Création du répertoire temporaire. */
        creerRepertoireTemporaire(
           nomRepertoireTemporaire
        );
        
        String nomFichierTemplateComplet = 
            FichierHelper
                .getNomFichierComplet(
                    nomRepertoireTemplate, 
                    nomFichierTemplate);
        
        /** Génération du code. */
        StringWriter stringWriter = new StringWriter();
        try {
            Velocity
                .mergeTemplate(
                    nomFichierTemplate, 
                    "UTF-8", 
                    velocityContext, 
                    stringWriter );
        }
        catch (ResourceNotFoundException exception) {
            System.out.println("Fichier template non trouvé. Fichier template = "+nomFichierTemplate);
            exception.printStackTrace();
        }
        catch (ParseErrorException exception) {
            System.out.println("Erreur de parsing du template. Fichier template = "+nomFichierTemplate);
            exception.printStackTrace();
        }
        catch (MethodInvocationException exception) {
            System.out.println("Erreur d'invocation de méthode. Fichier template = "+nomFichierTemplate);
            exception.printStackTrace();
        }
        catch (Exception exception) {
            System.out.println("Erreur lors de la génération à partir du template. Fichier template = "+nomFichierTemplate);
            exception.printStackTrace();
        }
        
        System.out.println("out = "+stringWriter);
    }
    
    /**
     * Création du répertoire temporaire.
     * @param nomRepertoireTemporaire.
     */
    private void creerRepertoireTemporaire(
            final String nomRepertoireTemporaire
        )
    {
        // Créer le nouveau fichier généré dans le répertoire temporaire de traitement
        File repertoireTemporaire = new File(nomRepertoireTemporaire);
        repertoireTemporaire.mkdirs();
    }
    
}

