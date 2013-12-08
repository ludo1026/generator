package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * .
 */
public class Jour implements Serializable 
{
	private String nomJour;
	private Integer idJour;

    public String getNomJour() {
        return nomJour;
    }
    
    public void setNomJour(String nomJour) {
        this.nomJour = nomJour;
    }
	
    public Integer getIdJour() {
        return idJour;
    }
    
    public void setIdJour(Integer idJour) {
        this.idJour = idJour;
    }
	
}
