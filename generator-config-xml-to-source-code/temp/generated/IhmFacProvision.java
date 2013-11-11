package ;

/**
 * Attributs modifiable pour l'entite : ${bean.getNom()}.
 */
public enum AttributEnum {
	idFacilite("ID_FACILITE","String"),
	idSiSource("ID_SI_SOURCE","BigDecimal"),
	idPhotoFacilite("ID_PHOTO_FACILITE","String"),
	cdNatMvtProv("CD_NAT_MVT_PROV","String"),
	blDelete("BL_DELETE","BigDecimal"),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO","BigDecimal"),
	idFoncDefaut("ID_FONC_DEFAUT","String"),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ","BigDecimal"),
	tsDelete("TS_DELETE","Date"),
	coProv("CO_PROV","String"),
	mtProvision("MT_PROVISION","BigDecimal"),
	lbMiroUtilisateur("LB_MIRO_UTILISATEUR","String"),
	idTypEnreg("ID_TYP_ENREG","BigDecimal"),
	dtArrete("DT_ARRETE","Date"),
	dtProvision("DT_PROVISION","Date"),
	indMiroEvnt("IND_MIRO_EVNT","String"),
	idProvision("ID_PROVISION","BigDecimal"),
	dtValidation("DT_VALIDATION","Date"),
	cdDevise("CD_DEVISE","String"),
	cdSiteRsk("CD_SITE_RSK","String"),
	idPhotoDefaut("ID_PHOTO_DEFAUT","String"),
	idPhotoProvision("ID_PHOTO_PROVISION","String"),
	indMigBdi("IND_MIG_BDI","String"),
	cdTpProvBmrc("CD_TP_PROV_BMRC","String"),

	ihmFacilite("idFacilite",Type.STRING),
	ihmFacilite("idPhotoFacilite",Type.STRING),
	ihmFacilite("cdSiteRsk",Type.STRING),
	ihmRefSquSiteRisque("cdSiteRsk",Type.STRING),
	ihmRefIntNatMvtProv("cdNatMvtProv",Type.STRING),
	ihmRefIntSiSource("idSiSource",Type.BIGDECIMAL),
	ihmAdmUtilisateur("idUtilisateurMaj",Type.BIGDECIMAL),
	ihmRefIntMotifModifAuto("idMotifModifAuto",Type.BIGDECIMAL),
	ihmRefSquCodDevise("cdDevise",Type.STRING),
	ihmDossierDeDefaut("idPhotoDefaut",Type.STRING),
	ihmDossierDeDefaut("idFoncDefaut",Type.STRING),
	ihmRefIntTypEnreg("idTypEnreg",Type.BIGDECIMAL),
	ihmRefSquTypProvision("cdTpProvBmrc",Type.STRING),

}