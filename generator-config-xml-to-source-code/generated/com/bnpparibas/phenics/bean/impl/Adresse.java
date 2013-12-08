package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * .
 */
public class Adresse implements Serializable 
{
	private String complement;
	private String ville;
	private Integer idAdresse;
	private Integer cp;
	private String nomRue;
	private String contact;
	private Integer numRue;

    public String getComplement() {
        return complement;
    }
    
    public void setComplement(String complement) {
        this.complement = complement;
    }
	
    public String getVille() {
        return ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }
	
    public Integer getIdAdresse() {
        return idAdresse;
    }
    
    public void setIdAdresse(Integer idAdresse) {
        this.idAdresse = idAdresse;
    }
	
    public Integer getCp() {
        return cp;
    }
    
    public void setCp(Integer cp) {
        this.cp = cp;
    }
	
    public String getNomRue() {
        return nomRue;
    }
    
    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }
	
    public String getContact() {
        return contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
	
    public Integer getNumRue() {
        return numRue;
    }
    
    public void setNumRue(Integer numRue) {
        this.numRue = numRue;
    }
	
}
