/*
 * Crée le 14 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.lang.StringUtils;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 14 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class LectureFichier
implements Iterable<String>
{
    public static final class Manager {

        public static final LectureFichier getLectureFichier(
                final String nomFichierComplet)
        {
            final File file = new File(nomFichierComplet);
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
            }
            catch (final FileNotFoundException exception) {
                throw new
                    RuntimeException (
                        "LectureFichier.Manager.getLectureFichier - new FileReader() - nomFichierComplet = "+nomFichierComplet,
                        exception
                    );
            }
            AssertHelper.assertNotNull(fileReader, "fileReader");
            return new LectureFichier(nomFichierComplet, fileReader);
        }
    }

    private final String nomFichierComplet;
    private final FileReader fileReader;
    private final BufferedReader bufferedReader;

    public LectureFichier(
            final String nomFichierComplet,
            final FileReader fileReader)
    {
        AssertHelper.assertNotNullArgument(nomFichierComplet, "nomFichierComplet", "LectureFichier");
        AssertHelper.assertNotNullArgument(fileReader, "fileReader", "LectureFichier");
        this.nomFichierComplet = nomFichierComplet;
        this.fileReader = fileReader;
        this.bufferedReader = new BufferedReader(fileReader);
        AssertHelper.assertNotNull(this.bufferedReader, "bufferedReader");
    }

    /**
     * Retourne nomFichierComplet.
     * @return Retourne le nomFichierComplet.
     */
    public String getNomFichierComplet()
    {
        return this.nomFichierComplet;
    }

    private BufferedReader getBufferedReader() {
        AssertHelper.assertNotNull(this.bufferedReader, "bufferedReader");
        return this.bufferedReader;
    }

    /**
     * @see java.lang.Iterable#iterator() .
     */
    public LectureFichierIterator iterator()
    {
        return new LectureFichierIterator(this);
    }

    /**
     * Classe d'itération sur la lecture du fichier.
     */
    public static final class LectureFichierIterator
    implements Iterator<String>
    {
        /**
         *
         * Manager de l'itérateur.
         *
         * @author Ludovic Chaboud
         * @date 18 sept. 08
         * @version $Revision$ $Date$
         *
         */
        public static final class Manager
        {
            public static final LectureFichierIterator getCopyLectureFichierIterator(
                    final LectureFichierIterator lectureFichierIterator)
            {
                final LectureFichier copyLectureFichier =
                    LectureFichier.Manager
                        .getLectureFichier(
                            lectureFichierIterator.lectureFichier
                                .getNomFichierComplet()
                        );
                final LectureFichierIterator copyLectureFichierIterator =
                    copyLectureFichier.iterator();
                for (int i=0; i<= lectureFichierIterator.nombreLigneLue; i++) {
                    AssertHelper.assertBoolean(
                            copyLectureFichierIterator.hasNext(),
                            "l'itérateur de copie n'a pas de ligne suivante. (nombreLigneLue = " + i + ")");
                    copyLectureFichierIterator.next();
                }
                AssertHelper.assertBoolean(
                    StringUtils.equals(
                        lectureFichierIterator.getLigneActuelle(),
                        copyLectureFichierIterator.getLigneActuelle()
                    ),
                    "la ligne actuelle de l'itérateur d'origne et la ligne actuelle de l'itérateur de copie ne correspondent pas."
                );
                return lectureFichierIterator;
            }
        }

        private final LectureFichier lectureFichier;

        private int nombreLigneLue = 0;

        /**
         * Instancie une nouvelle classe d'itération de lecture du fichier.
         * @param lectureFichier Fichier à lire.
         */
        public LectureFichierIterator(
                final LectureFichier lectureFichier)
        {
            AssertHelper.assertNotNullArgument(
                    lectureFichier, "lecture de fichier", "LectureFichierIterator");
            this.lectureFichier = lectureFichier;
            this.lirePremiereLigne();
        }

        private boolean aCommenceALire = false;
        private String premiereLigne = null;
        private String ligneActuelle = null;
        private String ligneSuivante = null;

        /**
         * Indique s'il y a encore une ligne à lire dans le fichier
         * @see java.util.Iterator#hasNext() .
         */
        public boolean hasNext()
        {
            final boolean hasNext;
            if ( ! this.aCommenceALire)
            // Cas 1 : on n'a pas encore lu de ligne
            {
                hasNext = this.premiereLigne != null;
            }
            else
            // Cas 2 : on a déjà lu au moins une ligne
            {
                hasNext = this.ligneSuivante != null;
            }
            return hasNext;
        }

        /**
         * Indique s'il y a encore une ligne à lire dans le fichier
         * @see java.util.Iterator#hasNext() .
         */
        public String next()
        {
            this.avancerLigneSuivante();
            this.nombreLigneLue++;
            AssertHelper.assertNotNull(this.ligneActuelle, "la ligne actuelle est null.");
            return this.ligneActuelle;
        }

        /**
         * Fonction désactivée : elle ne fait rien.
         */
        public void remove() {
            // NE RIEN FAIRE
        }

        /**
         * Lit la première ligne du fichier en ne l'indiquant pas comme ligne actuelle
         * et en indiquant pas que le fichier a commencé à être lu.
         */
        private void lirePremiereLigne()
        {
            this.aCommenceALire = false;

            // La ligne actuelle est la première ligne du fichier
            try {
                this.premiereLigne =
                    this.lectureFichier
                        .getBufferedReader()
                            .readLine();
            } catch(final IOException e) {
                throw new RuntimeException("getLigneSuivante : Erreur lors de la lecture de la première ligne", e);
            }
        }

        /**
         * Avance dans le fichier et définit la ligne actuelle et la ligne suivante.
         */
        private void avancerLigneSuivante()
        {
            /**
             * Cas 1 : On commence à lire le fichier :
             * - la ligne actuelle est la première ligne du fichier.
             * Cas 2 : On continue à lire le fichier :
             * - la ligne actuelle est la ligne suivante lors du dernier appel à avancerLigneSuivante().
             */
            // Teste si on lit la première ligne du fichier.
            if ( ! this.aCommenceALire)
            /**
             * Cas 1 : On lit la première ligne du fichier.
             */
            {
                this.aCommenceALire = true;

                // Teste si on a déjà atteint la fin du fichier :
                // teste que la première ligne était définie.
                if (this.premiereLigne == null) {
                    throw new
                        NoSuchElementException(
                            "La fin du fichier a déjà été atteinte, le fichier contient aucune ligne."
                        );
                }

                // La ligne actuelle est la première ligne du fichier
                this.ligneActuelle =
                    this.premiereLigne;
            }
            else
            /**
             * Cas 2 : On ne lit pas la première ligne du fichier.
             */
            {
                // Teste si on a déjà atteint la fin du fichier :
                // teste que la ligne suivante du dernier appel à avancerLigneSuivante
                // était définie.
                if (this.ligneSuivante == null) {
                    throw new
                        NoSuchElementException(
                            "La fin du fichier a déjà été atteinte, aucune ligne suivante n'est à lire."
                        );
                }

                // La ligne actuelle est l'ancienne ligne suivante
                this.ligneActuelle =
                    this.ligneSuivante;
            }

            /**
             * Lecture de la ligne suivante à la ligne actuelle.
             */

            // Teste si la ligne actuelle est définie.
            if (this.ligneActuelle == null)
            /**
             * Si la ligne actuelle est définie, on lit la ligne suivante.
             */
            {
                // La ligne suivante n'a pas été lue
                this.ligneSuivante = null;
            }
            else
            /**
             * Si la ligne actuelle est définie, on lit la ligne suivante.
             */
            {
                // Lit la ligne suivante à la ligne actuelle.
                try {
                    this.ligneSuivante =
                        this.lectureFichier
                            .getBufferedReader()
                                .readLine();
                } catch(final IOException e) {
                    throw new RuntimeException("getLigneSuivante : Erreur lors de la lecture de la ligne suivante", e);
                }
            }
        }

        /**
         * N'avance pas dans le fichier et retourne la dernière ligne lue dans le fichier.s
         * @return la ligne qui vient d'être lue dans le fichier.
         */
        public String getLigneActuelle()
        {
            AssertHelper
                .assertBoolean(
                    this.aCommenceALire,
                    "aucune ligne n'a pour le moment été lue dans le fichier."
                );
            return this.ligneActuelle;
        }

    }

    /**
     * Fermeture des accès au fichier à lire.
     */
    public void fermer() {
        try {
            this.bufferedReader.close();
        }
        catch (final IOException exception) {
            throw new RuntimeException("LectureFichier.fermer() : Erreur lors de la fermeture de bufferedReader.");
        }
        try {
            this.fileReader.close();
        }
        catch (final IOException exception) {
            throw new RuntimeException("LectureFichier.fermer() : Erreur lors de la fermeture de fileReader.");
        }
    }

}

