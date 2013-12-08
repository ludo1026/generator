package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * .
 */
public class Photo implements Serializable 
{
	private Integer idPhoto;
	private String urlPhoto;

    public Integer getIdPhoto() {
        return idPhoto;
    }
    
    public void setIdPhoto(Integer idPhoto) {
        this.idPhoto = idPhoto;
    }
	
    public String getUrlPhoto() {
        return urlPhoto;
    }
    
    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }
	
}
