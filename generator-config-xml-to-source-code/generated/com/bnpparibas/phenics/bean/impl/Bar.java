package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.bnpparibas.phenics.bean.impl.Statut;
import com.bnpparibas.phenics.bean.impl.Adresse;
import com.bnpparibas.phenics.bean.impl.Categorie;
import com.bnpparibas.phenics.bean.impl.Photo;

/**
 * .
 */
public class Bar implements Serializable 
{
	private Integer idBar;
	private String siteBar;
	private String descriptionBar;
	private String nomBar;
	private Statut statut;
	private Adresse adresse;
	private Categorie categorie;
	private Photo photo;

    public Integer getIdBar() {
        return idBar;
    }
    
    public void setIdBar(Integer idBar) {
        this.idBar = idBar;
    }
	
    public String getSiteBar() {
        return siteBar;
    }
    
    public void setSiteBar(String siteBar) {
        this.siteBar = siteBar;
    }
	
    public String getDescriptionBar() {
        return descriptionBar;
    }
    
    public void setDescriptionBar(String descriptionBar) {
        this.descriptionBar = descriptionBar;
    }
	
    public String getNomBar() {
        return nomBar;
    }
    
    public void setNomBar(String nomBar) {
        this.nomBar = nomBar;
    }
	
    public Statut getStatut() {
        return statut;
    }
    
    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Adresse getAdresse() {
        return adresse;
    }
    
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Categorie getCategorie() {
        return categorie;
    }
    
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Photo getPhoto() {
        return photo;
    }
    
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

}
