/*
 * Package  : org.app.action.acceuil
 * Source   : AcceuilAction.java
 */
package org.app.action.acceuil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/* @zoneDebut={import} */
/* @zoneFin={import} */

/**
 * <b>Description :</b>
 */
public class AcceuilAction
extends DispatchAction
{
	
	
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
        /** contructeur privÃ©. */
        private ActionName()
        { /** contructeur privÃ©. */ }

        /** init. */
        public static final String ACTION_INIT =
                                         "init";
        
        /** ouvrirPageAcces2. */
        public static final String ACTION_OUVRIR_PAGE_ACCES2 =
                                         "ouvrirPageAcces2";
        
	}
	
	/**
     *
     * Noms des forwards de l'action.
     *
     */
    private static final class ForwardName
    {
        /** contructeur privÃ©. */
        private ForwardName()
        { /** constructeur privÃ©. */ }

	}
	
	// BeanService 
	
	/*******************************************************************
	 * Methodes d'action
	 */
	
	    
    /**
     * @zoneDebut={AcceuilAction-init-entete}
     * @zoneFin={AcceuilAction-init-entete}
     * 
     * @param mapping Mapping
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
    	
        // @zoneDebut={AcceuilAction.init.methode}
        // @zoneFin={AcceuilAction.init.methode}
    	
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
	    
    /**
     * @zoneDebut={AcceuilAction-ouvrirPageAcces2-entete}
     * @zoneFin={AcceuilAction-ouvrirPageAcces2-entete}
     * 
     * @param mapping Mapping
     * @param form Formulaire de la page
     * @param request Request
     * @param response Response
     * @return forward Redirection vers la page suivante
     * @throws Exception
     */
	private ActionForward ouvrirPageAcces2 (
                                ActionMapping mapping, 
                                ActionForm form,
                                HttpServletRequest request, 
                                HttpServletResponse response)
    throws Exception
    {
    	/** Contient la redirection vers la page suivante */
        final ActionForward forward;
    	
        // @zoneDebut={AcceuilAction.ouvrirPageAcces2.methode}
        // @zoneFin={AcceuilAction.ouvrirPageAcces2.methode}
    	
        /** Affichage de la page d'accueil */
        
        AssertHelper.assertNotNull(forward, "forward vers la page d'accueil");
        return forward;
    }
	
	/*******************************************************************
	 * MÃ©thodes utilitaires
	 */
	
	/* @zoneDebut={AcceuilAction} */
	/* @zoneFin={AcceuilAction} */

}
