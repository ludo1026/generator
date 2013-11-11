// zoneStatiqueDebut:{AccueilAction.classe}
/*
 * Package  : org.ludo.test.action.accueil
 * Source   : AccueilAction.java
 */
package org.ludo.test.action.accueil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/* zoneLibreDebut:{import} */
/* zoneLibreFin:{import} */

/**
 * <b>Description :</b>
 */
public class AccueilAction
extends DispatchAction
{
	
	/*******************************************************************
	 * Methodes d'action
	 */
	
	    
    // zoneStatiqueDebut:{AccueilAction.init2}
    /**
     * zoneLibreDebut:{AccueilAction-init2-entete}
     * Initialisation de la page d'accueil.
     * zoneLibreFin:{AccueilAction-init2-entete}
     * 
     * @param mapping Mapping d'actions
     * @param form Formulaire de la page
     * @param request Request
     * @param response Response
     * @return forward Redirection vers la page suivante
     * @throws Exception
     */
	private ActionForward init2 (
                                ActionMapping mapping, 
                                ActionForm form,
                                HttpServletRequest request, 
                                HttpServletResponse response)
    throws Exception
    {
    	/** Contient la redirection vers la page suivante */
        final ActionForward forward;
    	
        // zoneLibreDebut:{AccueilAction.init2.methode}
        // zoneLibreFin:{AccueilAction.init2.methode}
        /** Affichage de la page d'accueil */
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
	// zoneStatiqueFin:{AccueilAction.init2}
    
    
    // zoneStatiqueDebut:{AccueilAction.init}
    /**
     * zoneLibreDebut:{AccueilAction-init-entete}
     * Initialisation de la page d'accueil.
     * zoneLibreFin:{AccueilAction-init-entete}
     * 
     * @param mapping Mapping d'actions
     * @param form Formulaire de la page
     * @param request Request
     * @param response Response
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
        final ActionForward forward;
        
        // zoneLibreDebut:{AccueilAction.init.methode}
        // zoneLibreFin:{AccueilAction.init.methode}
        /** Affichage de la page d'accueil */
        /** Affichage de la page d'accueil */
        /** Affichage de la page d'accueil */
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
    // zoneStatiqueFin:{AccueilAction.init}

	/*******************************************************************
	 * Méthodes utilitaires
	 */
	
/* zoneLibreDebut:{AccueilAction} */
/* zoneLibreFin:{AccueilAction} */

}

//zoneStatiqueFin:{AccueilAction.classe}