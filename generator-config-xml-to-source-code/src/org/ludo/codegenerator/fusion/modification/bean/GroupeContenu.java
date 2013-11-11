/*
 * Crée le 15 sept. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.codegenerator.fusion.modification.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.ludo.utils.AssertHelper;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 15 sept. 08
 * @version $Revision$ $Date$
 *
 */
public class GroupeContenu
{

    public GroupeContenu() {

    }

    private final List<Contenu> listeContenu = new ArrayList<Contenu>();

    public List<Contenu> getListeContenu() {
        return this.listeContenu;
    }

    public Zone getZoneParNom(final String nomZone)
    {
        AssertHelper.assertDefinedArgument(nomZone, "nom de la zone", "getZoneParNom");
        Zone zoneTrouve = null;
        for (final Iterator<Contenu> iterContenu = this.listeContenu.iterator();
             (zoneTrouve == null) && iterContenu.hasNext(); )
        {
            final Contenu contenu = iterContenu.next();
            if (contenu instanceof Zone) {
                final Zone zone = (Zone) contenu;
                if (StringUtils.equals(nomZone,zone.getNom())) {
                    zoneTrouve = zone;
                }
            }
        }
        return zoneTrouve;
    }

    public void addLigne(final String ligne) {
        final Contenu contenuLigne = new ContenuLigne(ligne);
        this.listeContenu.add(contenuLigne);
    }

    public void addContenu(final Contenu contenu) {
        AssertHelper.assertNotNullArgument(contenu, "contenu", "addContenu");
        this.listeContenu.add(contenu);
    }

}

