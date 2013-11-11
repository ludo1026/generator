/*
 * Package  : fr.c2rp.passvae.web.action.recherchepassvae
 * Source   : RecherchePassVaeAction.java
 */
package fr.c2rp.passvae.web.action.recherchepassvae;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.c2rp.passvae.service.RecherchePassVaeService;

/* @zoneDebut={import} */
/* @zoneFin={import} */

/**
 * <b>Description :</b>
 */
public class RecherchePassVaeAction
// @zoneDebut={RecherchePassVaeAction.extends}
// @zoneFin={RecherchePassVaeAction.extends}
{
    /**
     * Logger par dÃÂ©faut.
     */
    private static final Logger LOG = Logger.getLogger(RecherchePassVaeAction.class);
	
    /**
     *
     * Classe contenant la liste des noms des actions de cette classe action.
     *
     * @author Ludovic Chaboud
     * @date 23 juil. 08
     * @version $Revision$ $Date$
     *
     */
    public static final class ActionName
    {
        /** contructeur privÃ¯Â¿Â½. */
        private ActionName()
        { /** contructeur privÃ¯Â¿Â½. */ }

        /** init. */
        public static final String ACTION_INIT =
                                         "init";
        
        /** rechercher. */
        public static final String ACTION_RECHERCHER =
                                         "rechercher";
        
	}
	
	/**
     *
     * Noms des forwards de l'action.
     *
     */
    private static final class ForwardName
    {
        /** contructeur privÃ¯Â¿Â½. */
        private ForwardName()
        { /** constructeur privÃ¯Â¿Â½. */ }

        /** recherche. */
        public static final String FORWARD_RECHERCHE =
                                         "recherche";
		
        /** resultat. */
        public static final String FORWARD_RESULTAT =
                                         "resultat";
		
	}
	
	// RecherchePassVaeService 

	/*******************************************************************
	 * Injections de dÃÂ©pendances.
	 */
	
    /**
     * Instance de : <code>recherchePassVae</code>.
     */
    private RecherchePassVaeService recherchePassVae;
    
    /**
     * Injection de la dÃÂ©pendance vers : <code>recherchePassVae</code>.
     */
    public void setRecherchePassVae(
            final RecherchePassVaeService recherchePassVae)
    {
        this.recherchePassVae = recherchePassVae;
    }

	
	/*******************************************************************
	 * Methodes d'action
	 */
	
	    
    /**
     * @zoneDebut={RecherchePassVaeAction-init-entete}
     * @zoneFin={RecherchePassVaeAction-init-entete}
     * 
     * @param mapping Mapping de redirection vers la couche - Vue -
     * @param form Formulaire de donnÃÂ©es
     * @param request Requete http d'entrÃÂ©e
     * @param response Reponse http de sortie
     * @return forward Redirection vers la page suivante
     * @throws Exception
     */
	private ActionForward init (
                                ActionMapping mapping, 
                                ActionForm form,
                                HttpServletRequest request, 
                                HttpServletResponse response)
    throws Exception
    {
    	/** Contient la redirection vers la page suivante */
        ActionForward forward = null;
    	
        // @zoneDebut={RecherchePassVaeAction.init.methode}
        // @zoneFin={RecherchePassVaeAction.init.methode}
    	
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
	    
    /**
     * @zoneDebut={RecherchePassVaeAction-rechercher-entete}
     * @zoneFin={RecherchePassVaeAction-rechercher-entete}
     * 
     * @param mapping Mapping de redirection vers la couche - Vue -
     * @param form Formulaire de donnÃÂ©es
     * @param request Requete http d'entrÃÂ©e
     * @param response Reponse http de sortie
     * @return forward Redirection vers la page suivante
     * @throws Exception
     */
	private ActionForward rechercher (
                                ActionMapping mapping, 
                                ActionForm form,
                                HttpServletRequest request, 
                                HttpServletResponse response)
    throws Exception
    {
    	/** Contient la redirection vers la page suivante */
        ActionForward forward = null;
    	
        // @zoneDebut={RecherchePassVaeAction.rechercher.methode}
        // @zoneFin={RecherchePassVaeAction.rechercher.methode}
    	
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
	
	/*******************************************************************
	 * MÃ¯Â¿Â½thodes utilitaires
	 */
	
	/* @zoneDebut={RecherchePassVaeAction} */
	/* @zoneFin={RecherchePassVaeAction} */

}
