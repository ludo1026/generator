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

// test

/**
 * <b>Description :</b>
 */
public class AccueilAction
extends DispatchAction
{
	
	/*******************************************************************
	 * Methodes d'action
	 */
	
	    
    /**
     * Super Cool !
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
    	
        forward = "hello";
        
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        
        /** Affichage de la page d'accueil */
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
    
    
    /**
     * s
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
        
        /** Affichage de la page d'accueil */
        /** Affichage de la page d'accueil */
        /** Affichage de la page d'accueil */
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }

	/*******************************************************************
	 * Mï¿½thodes utilitaires
	 */
	

}

