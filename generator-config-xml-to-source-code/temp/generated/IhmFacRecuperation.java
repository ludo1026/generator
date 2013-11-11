package ;

/**
 * Attributs modifiable pour l'entite : ${bean.getNom()}.
 */
public enum AttributEnum {
	idSiSource("ID_SI_SOURCE","BigDecimal"),
	idFacilite("ID_FACILITE","String"),
	idRecupLocal("ID_RECUP_LOCAL","String"),
	idPhotoFacilite("ID_PHOTO_FACILITE","String"),
	blDelete("BL_DELETE","BigDecimal"),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO","BigDecimal"),
	cdTypMnt("CD_TYP_MNT","String"),
	idFoncDefaut("ID_FONC_DEFAUT","String"),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ","BigDecimal"),
	idPhoto("ID_PHOTO","String"),
	coRecup("CO_RECUP","String"),
	tsDelete("TS_DELETE","Date"),
	idPhotoGarantie("ID_PHOTO_GARANTIE","String"),
	idTypEnreg("ID_TYP_ENREG","BigDecimal"),
	dtArrete("DT_ARRETE","Date"),
	cdTypo("CD_TYPO","BigDecimal"),
	mtRecup("MT_RECUP","BigDecimal"),
	cdDevise("CD_DEVISE","String"),
	cdSiteRsk("CD_SITE_RSK","String"),
	dtPaieRecup("DT_PAIE_RECUP","Date"),
	idPhotoDefaut("ID_PHOTO_DEFAUT","String"),
	indStatQualRecup("IND_STAT_QUAL_RECUP","String"),
	idGarantie("ID_GARANTIE","String"),
	indMigBdi("IND_MIG_BDI","String"),

	ihmFacilite("idFacilite",Type.STRING),
	ihmFacilite("idPhotoFacilite",Type.STRING),
	ihmFacilite("cdSiteRsk",Type.STRING),
	ihmRefExtTypMontant("cdTypMnt",Type.STRING),
	ihmRefIntSiSource("idSiSource",Type.BIGDECIMAL),
	ihmAdmUtilisateur("idUtilisateurMaj",Type.BIGDECIMAL),
	ihmRefIntMotifModifAuto("idMotifModifAuto",Type.BIGDECIMAL),
	ihmRefSquCodDevise("cdDevise",Type.STRING),
	ihmDossierDeDefaut("idPhotoDefaut",Type.STRING),
	ihmDossierDeDefaut("idFoncDefaut",Type.STRING),
	ihmRefSquTypRecup("cdTypo",Type.BIGDECIMAL),
	ihmRefIntTypEnreg("idTypEnreg",Type.BIGDECIMAL),
	ihmFacGarantie("idPhotoGarantie",Type.STRING),
	ihmFacGarantie("idGarantie",Type.STRING),

}