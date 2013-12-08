package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.bnpparibas.phenics.bean.impl.Jour;
import com.bnpparibas.phenics.bean.impl.Bar;

/**
 * .
 */
public class LienJourBar implements Serializable 
{
	private Jour jour;
	private Bar bar;

    public Jour getJour() {
        return jour;
    }
    
    public void setJour(Jour jour) {
        this.jour = jour;
    }

    public Bar getBar() {
        return bar;
    }
    
    public void setBar(Bar bar) {
        this.bar = bar;
    }

}
