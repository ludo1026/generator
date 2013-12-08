package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.bnpparibas.phenics.bean.impl.Jour;
import com.bnpparibas.phenics.bean.impl.Horaire;

/**
 * .
 */
public class JourOuverture implements Serializable 
{
	private Jour jour;
	private Horaire horaire;

    public Jour getJour() {
        return jour;
    }
    
    public void setJour(Jour jour) {
        this.jour = jour;
    }

    public Horaire getHoraire() {
        return horaire;
    }
    
    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }

}
