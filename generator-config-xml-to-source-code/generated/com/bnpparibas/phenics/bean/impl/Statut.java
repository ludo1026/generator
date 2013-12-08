package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * .
 */
public class Statut implements Serializable 
{
	private String nomStatut;
	private Integer idStatut;

    public String getNomStatut() {
        return nomStatut;
    }
    
    public void setNomStatut(String nomStatut) {
        this.nomStatut = nomStatut;
    }
	
    public Integer getIdStatut() {
        return idStatut;
    }
    
    public void setIdStatut(Integer idStatut) {
        this.idStatut = idStatut;
    }
	
}
