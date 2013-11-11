/*
 * Package  : fr.c2rp.passvae.web.action.accueil
 * Source   : AccueilAction.java
 */
package fr.c2rp.passvae.web.action.accueil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


/* @zoneDebut={import} */
/* @zoneFin={import} */

/**
 * <b>Description :</b>
 */
public class AccueilAction
// @zoneDebut={AccueilAction.extends}
// @zoneFin={AccueilAction.extends}
{
    /**
     * Logger par dÃÂ©faut.
     */
    private static final Logger LOG = Logger.getLogger(AccueilAction.class);
	
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

        /** creationPassVae. */
        public static final String FORWARD_CREATION_PASS_VAE =
                                         "creationPassVae";
		
        /** recherchePassVae. */
        public static final String FORWARD_RECHERCHE_PASS_VAE =
                                         "recherchePassVae";
		
        /** statistique. */
        public static final String FORWARD_STATISTIQUE =
                                         "statistique";
		
	}
	

	/*******************************************************************
	 * Injections de dÃÂ©pendances.
	 */
	
	
	/*******************************************************************
	 * Methodes d'action
	 */
	
	    
    /**
     * @zoneDebut={AccueilAction-init-entete}
     * @zoneFin={AccueilAction-init-entete}
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
    	
        // @zoneDebut={AccueilAction.init.methode}
        // @zoneFin={AccueilAction.init.methode}
    	
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
	
	/*******************************************************************
	 * MÃ¯Â¿Â½thodes utilitaires
	 */
	
	/* @zoneDebut={AccueilAction} */
	/* @zoneFin={AccueilAction} */

}
