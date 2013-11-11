/*
 * Crée le 15 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.modification.bean;

import org.ludo.utils.AssertHelper;


/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 15 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class ContenuLigne
implements Contenu
{

    public ContenuLigne(final String ligne) {
        AssertHelper.assertNotNullArgument(ligne, "ligne", "ContenuLigne");
        this.ligne = ligne;
    }

    private final String ligne;

    /**
     * Retourne ligne.
     * @return Retourne le ligne.
     */
    public String getLigne()
    {
        return this.ligne;
    }

    /**
     * @see java.lang.Object#toString() .
     */
    @Override
    public String toString()
    {
        return this.ligne;
    }


}

