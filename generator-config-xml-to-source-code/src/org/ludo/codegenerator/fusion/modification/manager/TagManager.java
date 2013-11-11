/*
 * Crée le 15 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.modification.manager;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.fusion.modification.bean.Tag;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 15 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class TagManager
{

    public boolean contientTag(
            final String ligne,
            final Tag tag)
    {
        AssertHelper.assertNotNullArgument(tag, "tag", "contientTag");
        if (StringUtils.isBlank(ligne)) {
            return false;
        }
        final int posDebut = StringUtils.indexOf(ligne, tag.getDebutTag());
        if (posDebut < 0 ) {
            return false;
        }
        final int posFin = StringUtils.indexOf(ligne, tag.getDebutTag(), posDebut);
        if (posFin < 0 ) {
            return false;
        }
        return true;
    }

    private String getNomDansTag(
            final String ligne,
            final Tag tag)
    {
        if (StringUtils.isBlank(ligne)) {
            return "";
        }
        AssertHelper.assertBoolean(contientTag(ligne, tag), "la ligne ne contient pas le tag");
        final int posDebutTag = StringUtils.indexOf(ligne, tag.getDebutTag()) + tag.getDebutTag().length();
        final int posFinTag = StringUtils.indexOf(ligne, tag.getFinTag(), posDebutTag);
        final String nom =
            StringUtils
                .substring(
                    ligne,
                    posDebutTag,
                    posFinTag
                );
        if (nom == null) {
            return "";
        } else {
            return StringUtils.trimToEmpty(nom);
        }
    }

    /**********************************************************
     * Tag de zoneStatique.
     */

    private static String TAG_DEBUT__DEBUT_BLOC = "zoneStatiqueDebut:{";
    private static String TAG_FIN__DEBUT_BLOC = "}";
    private static String TAG_DEBUT__FIN_BLOC = "zoneStatiqueFin:{";
    private static String TAG_FIN__FIN_BLOC = "}";

    private static Tag tagDebutZoneStatique =
        new Tag(TAG_DEBUT__DEBUT_BLOC, TAG_FIN__DEBUT_BLOC);

    private static Tag tagFinZoneStatique =
        new Tag(TAG_DEBUT__FIN_BLOC, TAG_FIN__FIN_BLOC);

    public boolean estTagDebutZoneStatique(final String ligne) {
        return this.contientTag(ligne, tagDebutZoneStatique);
    }

    public String getNomFromTagDebutZoneStatique(final String ligne) {
        return this.getNomDansTag(ligne, tagDebutZoneStatique);
    }

    public boolean estTagFinZoneStatique(final String ligne) {
        return this.contientTag(ligne, tagFinZoneStatique);
    }

    public String getNomFromTagFinZoneStatique(final String ligne) {
        return this.getNomDansTag(ligne, tagFinZoneStatique);
    }


    /**********************************************************
     * Tag de zone libre.
     */

    private static String TAG_DEBUT__DEBUT_ZONE_LIBRE = "zoneLibreDebut:{";
    private static String TAG_FIN__DEBUT_ZONE_LIBRE = "}";
    private static String TAG_DEBUT__FIN_ZONE_LIBRE = "zoneLibreFin:{";
    private static String TAG_FIN__FIN_ZONE_LIBRE = "}";

    private static Tag tagDebutZoneLibre =
        new Tag(TAG_DEBUT__DEBUT_ZONE_LIBRE, TAG_FIN__DEBUT_ZONE_LIBRE);

    private static Tag tagFinZoneLibre =
        new Tag(TAG_DEBUT__FIN_ZONE_LIBRE, TAG_FIN__FIN_ZONE_LIBRE);

    public boolean estTagDebutZoneLibre(final String ligne) {
        return this.contientTag(ligne, tagDebutZoneLibre);
    }

    public String getNomFromTagDebutZoneLibre(final String ligne) {
        return this.getNomDansTag(ligne, tagDebutZoneLibre);
    }

    public boolean estTagFinZoneLibre(final String ligne) {
        return this.contientTag(ligne, tagFinZoneLibre);
    }

    public String getNomFromTagFinZoneLibre(final String ligne) {
        return this.getNomDansTag(ligne, tagFinZoneLibre);
    }

}
