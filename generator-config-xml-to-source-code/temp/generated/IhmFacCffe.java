package ;

/**
 * Attributs modifiable pour l'entite : ${bean.getNom()}.
 */
public enum AttributEnum {
	idSiSource("ID_SI_SOURCE","BigDecimal"),
	idFacilite("ID_FACILITE","String"),
	coCffe("CO_CFFE","String"),
	idPhotoFacilite("ID_PHOTO_FACILITE","String"),
	blDelete("BL_DELETE","BigDecimal"),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO","BigDecimal"),
	idFoncDefaut("ID_FONC_DEFAUT","String"),
	idPhoto("ID_PHOTO","String"),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ","BigDecimal"),
	tsDelete("TS_DELETE","Date"),
	idTypEnreg("ID_TYP_ENREG","BigDecimal"),
	dtArrete("DT_ARRETE","Date"),
	idTechCffe("ID_TECH_CFFE","BigDecimal"),
	mtCffe("MT_CFFE","BigDecimal"),
	cdTypCffe("CD_TYP_CFFE","String"),
	cdDevise("CD_DEVISE","String"),
	cdSiteRsk("CD_SITE_RSK","String"),
	idPhotoDefaut("ID_PHOTO_DEFAUT","String"),
	dtCffe("DT_CFFE","Date"),
	indMigBdi("IND_MIG_BDI","String"),

	ihmFacilite("idFacilite",Type.STRING),
	ihmFacilite("idPhotoFacilite",Type.STRING),
	ihmFacilite("cdSiteRsk",Type.STRING),
	ihmRefIntSiSource("idSiSource",Type.BIGDECIMAL),
	ihmAdmUtilisateur("idUtilisateurMaj",Type.BIGDECIMAL),
	ihmRefIntMotifModifAuto("idMotifModifAuto",Type.BIGDECIMAL),
	ihmRefSquCodDevise("cdDevise",Type.STRING),
	ihmDossierDeDefaut("idPhotoDefaut",Type.STRING),
	ihmDossierDeDefaut("idFoncDefaut",Type.STRING),
	ihmRefIntTypEnreg("idTypEnreg",Type.BIGDECIMAL),

}