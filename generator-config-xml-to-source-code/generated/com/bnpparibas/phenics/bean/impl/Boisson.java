package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * .
 */
public class Boisson implements Serializable 
{
	private String nomBoisson;
	private  prixBoisson;
	private Integer idBoisson;

    public String getNomBoisson() {
        return nomBoisson;
    }
    
    public void setNomBoisson(String nomBoisson) {
        this.nomBoisson = nomBoisson;
    }
	
    public  getPrixBoisson() {
        return prixBoisson;
    }
    
    public void setPrixBoisson( prixBoisson) {
        this.prixBoisson = prixBoisson;
    }
	
    public Integer getIdBoisson() {
        return idBoisson;
    }
    
    public void setIdBoisson(Integer idBoisson) {
        this.idBoisson = idBoisson;
    }
	
}
