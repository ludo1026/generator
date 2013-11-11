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
public class Tag
{

    private final String debutTag;
    private final String finTag;

    public Tag(final String debutTag, final String finTag) {
        AssertHelper.assertNotNullArgument(debutTag, "début du tag", "Tag");
        AssertHelper.assertNotNullArgument(finTag, "fin du tag", "Tag");
        this.debutTag = debutTag;
        this.finTag = finTag;
    }

    public String getDebutTag() {
        return this.debutTag;
    }

    public String getFinTag() {
        return this.finTag;
    }

}

