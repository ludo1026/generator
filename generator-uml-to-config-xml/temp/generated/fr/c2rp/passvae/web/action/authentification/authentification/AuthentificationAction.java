/*
 * Package  : fr.c2rp.passvae.web.action.authentification.authentification
 * Source   : AuthentificationAction.java
 */
package fr.c2rp.passvae.web.action.authentification.authentification;

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
public class AuthentificationAction
// @zoneDebut={AuthentificationAction.extends}
// @zoneFin={AuthentificationAction.extends}
{
    /**
     * Logger par dÃ©faut.
     */
    private static final Logger LOG = Logger.getLogger(AuthentificationAction.class);
	
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
        /** contructeur privï¿½. */
        private ActionName()
        { /** contructeur privï¿½. */ }

        /** connecter. */
        public static final String ACTION_CONNECTER =
                                         "connecter";
        
        /** deconnecter. */
        public static final String ACTION_DECONNECTER =
                                         "deconnecter";
        
	}
	
	/**
     *
     * Noms des forwards de l'action.
     *
     */
    private static final class ForwardName
    {
        /** contructeur privï¿½. */
        private ForwardName()
        { /** constructeur privï¿½. */ }

        /** accueil. */
        public static final String FORWARD_ACCUEIL =
                                         "accueil";
		
        /** creationPassVae. */
        public static final String FORWARD_CREATION_PASS_VAE =
                                         "creationPassVae";
		
        /** connexion. */
        public static final String FORWARD_CONNEXION =
                                         "connexion";
		
	}
	

	/*******************************************************************
	 * Injections de dÃ©pendances.
	 */
	
	
	/*******************************************************************
	 * Methodes d'action
	 */
	
	    
    /**
     * @zoneDebut={AuthentificationAction-connecter-entete}
     * @zoneFin={AuthentificationAction-connecter-entete}
     * 
     * @param mapping Mapping de redirection vers la couche - Vue -
     * @param form Formulaire de donnÃ©es
     * @param request Requete http d'entrÃ©e
     * @param response Reponse http de sortie
     * @return forward Redirection vers la page suivante
     * @throws Exception
     */
	private ActionForward connecter (
                                ActionMapping mapping, 
                                ActionForm form,
                                HttpServletRequest request, 
                                HttpServletResponse response)
    throws Exception
    {
    	/** Contient la redirection vers la page suivante */
        ActionForward forward = null;
    	
        // @zoneDebut={AuthentificationAction.connecter.methode}
        // @zoneFin={AuthentificationAction.connecter.methode}
    	
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
	    
    /**
     * @zoneDebut={AuthentificationAction-deconnecter-entete}
     * @zoneFin={AuthentificationAction-deconnecter-entete}
     * 
     * @param mapping Mapping de redirection vers la couche - Vue -
     * @param form Formulaire de donnÃ©es
     * @param request Requete http d'entrÃ©e
     * @param response Reponse http de sortie
     * @return forward Redirection vers la page suivante
     * @throws Exception
     */
	private ActionForward deconnecter (
                                ActionMapping mapping, 
                                ActionForm form,
                                HttpServletRequest request, 
                                HttpServletResponse response)
    throws Exception
    {
    	/** Contient la redirection vers la page suivante */
        ActionForward forward = null;
    	
        // @zoneDebut={AuthentificationAction.deconnecter.methode}
        // @zoneFin={AuthentificationAction.deconnecter.methode}
    	
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
	
	/*******************************************************************
	 * Mï¿½thodes utilitaires
	 */
	
	/* @zoneDebut={AuthentificationAction} */
	/* @zoneFin={AuthentificationAction} */

}
