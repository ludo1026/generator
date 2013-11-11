package com.bnpparibas.phenics.bean.impl;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import .;
import .;
import .;
import .;
import .;
import .;
import .;
import .;
import .;
import .;
import .;

/**
 * .
 */
public class IhmFacGarantie implements Serializable 
{
	private BigDecimal idSiSource;
	private Date dtMisePlaceGa;
	private String coGarFacilite;
	private String lbGarant;
	private BigDecimal idMotifModifAuto;
	private String lbRangGarantie;
	private BigDecimal mtValeurEco;
	private String indExecGarantie;
	private String idPhotoGarantie;
	private BigDecimal idTypEnreg;
	private String cdPaysGarantie;
	private String cdGarantie;
	private String cdSiteGestionTiers;
	private String cdSiteRskFacilite;
	private String idPhotoDefaut;
	private String idGarantie;
	private String indMigBdi;
	private String cdDeviseMtContract;
	private Date dtValeurEco;
	private BigDecimal blDelete;
	private String cdNatureGarantie;
	private String cdPaysActif;
	private Date dtEcheanceGarantie;
	private String idFoncDefaut;
	private BigDecimal idUtilisateurMaj;
	private BigDecimal idTiersGarant;
	private String idPhoto;
	private Date tsDelete;
	private Date dtForceGarantie;
	private Date dtArrete;
	private BigDecimal idTiersCouvert;
	private BigDecimal mtGarantie;
	private String cdDeviseValeurEco;
	private BigDecimal pctAutoCouv;
	private String cdSiteRskGarantie;
	private String idTiersTech;
	private  ihmRefSquTypGarantie;
	private  ihmRefSquSiteRisque;
	private  ihmRefSquNomPays;
	private  ihmRefSquGarantRecu;
	private  ihmRefIntSiSource;
	private  ihmAdmUtilisateur;
	private  ihmRefIntMotifModifAuto;
	private  ihmRefSquCodDevise;
	private  ihmDossierDeDefaut;
	private  ihmRefIntTypEnreg;
	private  ihmTieTiers;

    public BigDecimal getIdSiSource() {
        return idSiSource;
    }
    
    public void setIdSiSource(BigDecimal idSiSource) {
        this.idSiSource = idSiSource;
    }
	
    public Date getDtMisePlaceGa() {
        return dtMisePlaceGa;
    }
    
    public void setDtMisePlaceGa(Date dtMisePlaceGa) {
        this.dtMisePlaceGa = dtMisePlaceGa;
    }
	
    public String getCoGarFacilite() {
        return coGarFacilite;
    }
    
    public void setCoGarFacilite(String coGarFacilite) {
        this.coGarFacilite = coGarFacilite;
    }
	
    public String getLbGarant() {
        return lbGarant;
    }
    
    public void setLbGarant(String lbGarant) {
        this.lbGarant = lbGarant;
    }
	
    public BigDecimal getIdMotifModifAuto() {
        return idMotifModifAuto;
    }
    
    public void setIdMotifModifAuto(BigDecimal idMotifModifAuto) {
        this.idMotifModifAuto = idMotifModifAuto;
    }
	
    public String getLbRangGarantie() {
        return lbRangGarantie;
    }
    
    public void setLbRangGarantie(String lbRangGarantie) {
        this.lbRangGarantie = lbRangGarantie;
    }
	
    public BigDecimal getMtValeurEco() {
        return mtValeurEco;
    }
    
    public void setMtValeurEco(BigDecimal mtValeurEco) {
        this.mtValeurEco = mtValeurEco;
    }
	
    public String getIndExecGarantie() {
        return indExecGarantie;
    }
    
    public void setIndExecGarantie(String indExecGarantie) {
        this.indExecGarantie = indExecGarantie;
    }
	
    public String getIdPhotoGarantie() {
        return idPhotoGarantie;
    }
    
    public void setIdPhotoGarantie(String idPhotoGarantie) {
        this.idPhotoGarantie = idPhotoGarantie;
    }
	
    public BigDecimal getIdTypEnreg() {
        return idTypEnreg;
    }
    
    public void setIdTypEnreg(BigDecimal idTypEnreg) {
        this.idTypEnreg = idTypEnreg;
    }
	
    public String getCdPaysGarantie() {
        return cdPaysGarantie;
    }
    
    public void setCdPaysGarantie(String cdPaysGarantie) {
        this.cdPaysGarantie = cdPaysGarantie;
    }
	
    public String getCdGarantie() {
        return cdGarantie;
    }
    
    public void setCdGarantie(String cdGarantie) {
        this.cdGarantie = cdGarantie;
    }
	
    public String getCdSiteGestionTiers() {
        return cdSiteGestionTiers;
    }
    
    public void setCdSiteGestionTiers(String cdSiteGestionTiers) {
        this.cdSiteGestionTiers = cdSiteGestionTiers;
    }
	
    public String getCdSiteRskFacilite() {
        return cdSiteRskFacilite;
    }
    
    public void setCdSiteRskFacilite(String cdSiteRskFacilite) {
        this.cdSiteRskFacilite = cdSiteRskFacilite;
    }
	
    public String getIdPhotoDefaut() {
        return idPhotoDefaut;
    }
    
    public void setIdPhotoDefaut(String idPhotoDefaut) {
        this.idPhotoDefaut = idPhotoDefaut;
    }
	
    public String getIdGarantie() {
        return idGarantie;
    }
    
    public void setIdGarantie(String idGarantie) {
        this.idGarantie = idGarantie;
    }
	
    public String getIndMigBdi() {
        return indMigBdi;
    }
    
    public void setIndMigBdi(String indMigBdi) {
        this.indMigBdi = indMigBdi;
    }
	
    public String getCdDeviseMtContract() {
        return cdDeviseMtContract;
    }
    
    public void setCdDeviseMtContract(String cdDeviseMtContract) {
        this.cdDeviseMtContract = cdDeviseMtContract;
    }
	
    public Date getDtValeurEco() {
        return dtValeurEco;
    }
    
    public void setDtValeurEco(Date dtValeurEco) {
        this.dtValeurEco = dtValeurEco;
    }
	
    public BigDecimal getBlDelete() {
        return blDelete;
    }
    
    public void setBlDelete(BigDecimal blDelete) {
        this.blDelete = blDelete;
    }
	
    public String getCdNatureGarantie() {
        return cdNatureGarantie;
    }
    
    public void setCdNatureGarantie(String cdNatureGarantie) {
        this.cdNatureGarantie = cdNatureGarantie;
    }
	
    public String getCdPaysActif() {
        return cdPaysActif;
    }
    
    public void setCdPaysActif(String cdPaysActif) {
        this.cdPaysActif = cdPaysActif;
    }
	
    public Date getDtEcheanceGarantie() {
        return dtEcheanceGarantie;
    }
    
    public void setDtEcheanceGarantie(Date dtEcheanceGarantie) {
        this.dtEcheanceGarantie = dtEcheanceGarantie;
    }
	
    public String getIdFoncDefaut() {
        return idFoncDefaut;
    }
    
    public void setIdFoncDefaut(String idFoncDefaut) {
        this.idFoncDefaut = idFoncDefaut;
    }
	
    public BigDecimal getIdUtilisateurMaj() {
        return idUtilisateurMaj;
    }
    
    public void setIdUtilisateurMaj(BigDecimal idUtilisateurMaj) {
        this.idUtilisateurMaj = idUtilisateurMaj;
    }
	
    public BigDecimal getIdTiersGarant() {
        return idTiersGarant;
    }
    
    public void setIdTiersGarant(BigDecimal idTiersGarant) {
        this.idTiersGarant = idTiersGarant;
    }
	
    public String getIdPhoto() {
        return idPhoto;
    }
    
    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto;
    }
	
    public Date getTsDelete() {
        return tsDelete;
    }
    
    public void setTsDelete(Date tsDelete) {
        this.tsDelete = tsDelete;
    }
	
    public Date getDtForceGarantie() {
        return dtForceGarantie;
    }
    
    public void setDtForceGarantie(Date dtForceGarantie) {
        this.dtForceGarantie = dtForceGarantie;
    }
	
    public Date getDtArrete() {
        return dtArrete;
    }
    
    public void setDtArrete(Date dtArrete) {
        this.dtArrete = dtArrete;
    }
	
    public BigDecimal getIdTiersCouvert() {
        return idTiersCouvert;
    }
    
    public void setIdTiersCouvert(BigDecimal idTiersCouvert) {
        this.idTiersCouvert = idTiersCouvert;
    }
	
    public BigDecimal getMtGarantie() {
        return mtGarantie;
    }
    
    public void setMtGarantie(BigDecimal mtGarantie) {
        this.mtGarantie = mtGarantie;
    }
	
    public String getCdDeviseValeurEco() {
        return cdDeviseValeurEco;
    }
    
    public void setCdDeviseValeurEco(String cdDeviseValeurEco) {
        this.cdDeviseValeurEco = cdDeviseValeurEco;
    }
	
    public BigDecimal getPctAutoCouv() {
        return pctAutoCouv;
    }
    
    public void setPctAutoCouv(BigDecimal pctAutoCouv) {
        this.pctAutoCouv = pctAutoCouv;
    }
	
    public String getCdSiteRskGarantie() {
        return cdSiteRskGarantie;
    }
    
    public void setCdSiteRskGarantie(String cdSiteRskGarantie) {
        this.cdSiteRskGarantie = cdSiteRskGarantie;
    }
	
    public String getIdTiersTech() {
        return idTiersTech;
    }
    
    public void setIdTiersTech(String idTiersTech) {
        this.idTiersTech = idTiersTech;
    }
	
    public  getIhmRefSquTypGarantie() {
        return ihmRefSquTypGarantie;
    }
    
    public void setIhmRefSquTypGarantie( ihmRefSquTypGarantie) {
        this.ihmRefSquTypGarantie = ihmRefSquTypGarantie;
    }

    public  getIhmRefSquSiteRisque() {
        return ihmRefSquSiteRisque;
    }
    
    public void setIhmRefSquSiteRisque( ihmRefSquSiteRisque) {
        this.ihmRefSquSiteRisque = ihmRefSquSiteRisque;
    }

    public  getIhmRefSquNomPays() {
        return ihmRefSquNomPays;
    }
    
    public void setIhmRefSquNomPays( ihmRefSquNomPays) {
        this.ihmRefSquNomPays = ihmRefSquNomPays;
    }

    public  getIhmRefSquGarantRecu() {
        return ihmRefSquGarantRecu;
    }
    
    public void setIhmRefSquGarantRecu( ihmRefSquGarantRecu) {
        this.ihmRefSquGarantRecu = ihmRefSquGarantRecu;
    }

    public  getIhmRefIntSiSource() {
        return ihmRefIntSiSource;
    }
    
    public void setIhmRefIntSiSource( ihmRefIntSiSource) {
        this.ihmRefIntSiSource = ihmRefIntSiSource;
    }

    public  getIhmAdmUtilisateur() {
        return ihmAdmUtilisateur;
    }
    
    public void setIhmAdmUtilisateur( ihmAdmUtilisateur) {
        this.ihmAdmUtilisateur = ihmAdmUtilisateur;
    }

    public  getIhmRefIntMotifModifAuto() {
        return ihmRefIntMotifModifAuto;
    }
    
    public void setIhmRefIntMotifModifAuto( ihmRefIntMotifModifAuto) {
        this.ihmRefIntMotifModifAuto = ihmRefIntMotifModifAuto;
    }

    public  getIhmRefSquCodDevise() {
        return ihmRefSquCodDevise;
    }
    
    public void setIhmRefSquCodDevise( ihmRefSquCodDevise) {
        this.ihmRefSquCodDevise = ihmRefSquCodDevise;
    }

    public  getIhmDossierDeDefaut() {
        return ihmDossierDeDefaut;
    }
    
    public void setIhmDossierDeDefaut( ihmDossierDeDefaut) {
        this.ihmDossierDeDefaut = ihmDossierDeDefaut;
    }

    public  getIhmRefIntTypEnreg() {
        return ihmRefIntTypEnreg;
    }
    
    public void setIhmRefIntTypEnreg( ihmRefIntTypEnreg) {
        this.ihmRefIntTypEnreg = ihmRefIntTypEnreg;
    }

    public  getIhmTieTiers() {
        return ihmTieTiers;
    }
    
    public void setIhmTieTiers( ihmTieTiers) {
        this.ihmTieTiers = ihmTieTiers;
    }

}
