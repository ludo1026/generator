/*
 * Package  : fr.c2rp.passvae.data.bean.impl
 * Source   : Table1.java
 */
package fr.c2rp.passvae.data.bean.impl;

import java.io.Serializable;
import java.util.Date;


/**
 * <b>Description :</b>
 * Table 1.
 */
public class Table1 
implements Serializable 
{
    
	private String nom;
	private String prenom;

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
	
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
	

}
