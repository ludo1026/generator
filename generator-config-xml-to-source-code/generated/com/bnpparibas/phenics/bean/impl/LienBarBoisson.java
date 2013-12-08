package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.bnpparibas.phenics.bean.impl.Boisson;
import com.bnpparibas.phenics.bean.impl.Bar;

/**
 * .
 */
public class LienBarBoisson implements Serializable 
{
	private Boisson boisson;
	private Bar bar;

    public Boisson getBoisson() {
        return boisson;
    }
    
    public void setBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    public Bar getBar() {
        return bar;
    }
    
    public void setBar(Bar bar) {
        this.bar = bar;
    }

}
