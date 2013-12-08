package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * .
 */
public class Horaire implements Serializable 
{
	private Date heureOuverture;
	private Integer idOuverture;
	private Date heureFermeture;

    public Date getHeureOuverture() {
        return heureOuverture;
    }
    
    public void setHeureOuverture(Date heureOuverture) {
        this.heureOuverture = heureOuverture;
    }
	
    public Integer getIdOuverture() {
        return idOuverture;
    }
    
    public void setIdOuverture(Integer idOuverture) {
        this.idOuverture = idOuverture;
    }
	
    public Date getHeureFermeture() {
        return heureFermeture;
    }
    
    public void setHeureFermeture(Date heureFermeture) {
        this.heureFermeture = heureFermeture;
    }
	
}
