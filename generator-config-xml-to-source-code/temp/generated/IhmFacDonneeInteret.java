package ;

/**
 * Attributs modifiable pour l'entite : ${bean.getNom()}.
 */
public enum AttributEnum {
	idSiSource("ID_SI_SOURCE","BigDecimal"),
	idFacilite("ID_FACILITE","String"),
	cdTypTaux("CD_TYP_TAUX","String"),
	idPhotoFacilite("ID_PHOTO_FACILITE","String"),
	blDelete("BL_DELETE","BigDecimal"),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO","BigDecimal"),
	coDonneeInteret("CO_DONNEE_INTERET","String"),
	txSpread("TX_SPREAD","BigDecimal"),
	idFoncDefaut("ID_FONC_DEFAUT","String"),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ","BigDecimal"),
	idPhoto("ID_PHOTO","String"),
	tsDelete("TS_DELETE","Date"),
	dtDebutValidite("DT_DEBUT_VALIDITE","Date"),
	idTypEnreg("ID_TYP_ENREG","BigDecimal"),
	dtArrete("DT_ARRETE","Date"),
	cdTxReference("CD_TX_REFERENCE","String"),
	txFacial("TX_FACIAL","BigDecimal"),
	dtTxInteret("DT_TX_INTERET","Date"),
	cdSiteRsk("CD_SITE_RSK","String"),
	idPhotoDefaut("ID_PHOTO_DEFAUT","String"),
	cdPerdCalInteret("CD_PERD_CAL_INTERET","String"),
	indMigBdi("IND_MIG_BDI","String"),

	ihmFacilite("idFacilite",Type.STRING),
	ihmFacilite("idPhotoFacilite",Type.STRING),
	ihmFacilite("cdSiteRsk",Type.STRING),
	ihmRefIntSiSource("idSiSource",Type.BIGDECIMAL),
	ihmRefIntPerCalcInt("cdPerdCalInteret",Type.STRING),
	ihmAdmUtilisateur("idUtilisateurMaj",Type.BIGDECIMAL),
	ihmRefIntMotifModifAuto("idMotifModifAuto",Type.BIGDECIMAL),
	ihmDossierDeDefaut("idPhotoDefaut",Type.STRING),
	ihmDossierDeDefaut("idFoncDefaut",Type.STRING),
	ihmRefIntTypEnreg("idTypEnreg",Type.BIGDECIMAL),
	ihmRefSquTypTx("cdTypTaux",Type.STRING),

}