package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : IhmFacGarantie.
 */
public enum AttributIhmFacGarantieEnum {
	idSiSource("ID_SI_SOURCE",Type.BIGDECIMAL),
	dtMisePlaceGa("DT_MISE_PLACE_GA",Type.DATE),
	coGarFacilite("CO_GAR_FACILITE",Type.STRING),
	lbGarant("LB_GARANT",Type.STRING),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO",Type.BIGDECIMAL),
	lbRangGarantie("LB_RANG_GARANTIE",Type.STRING),
	mtValeurEco("MT_VALEUR_ECO",Type.BIGDECIMAL),
	indExecGarantie("IND_EXEC_GARANTIE",Type.STRING),
	idPhotoGarantie("ID_PHOTO_GARANTIE",Type.STRING),
	idTypEnreg("ID_TYP_ENREG",Type.BIGDECIMAL),
	cdPaysGarantie("CD_PAYS_GARANTIE",Type.STRING),
	cdGarantie("CD_GARANTIE",Type.STRING),
	cdSiteGestionTiers("CD_SITE_GESTION_TIERS",Type.STRING),
	cdSiteRskFacilite("CD_SITE_RSK_FACILITE",Type.STRING),
	idPhotoDefaut("ID_PHOTO_DEFAUT",Type.STRING),
	idGarantie("ID_GARANTIE",Type.STRING),
	indMigBdi("IND_MIG_BDI",Type.STRING),
	cdDeviseMtContract("CD_DEVISE_MT_CONTRACT",Type.STRING),
	dtValeurEco("DT_VALEUR_ECO",Type.DATE),
	blDelete("BL_DELETE",Type.BIGDECIMAL),
	cdNatureGarantie("CD_NATURE_GARANTIE",Type.STRING),
	cdPaysActif("CD_PAYS_ACTIF",Type.STRING),
	dtEcheanceGarantie("DT_ECHEANCE_GARANTIE",Type.DATE),
	idFoncDefaut("ID_FONC_DEFAUT",Type.STRING),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ",Type.BIGDECIMAL),
	idTiersGarant("ID_TIERS_GARANT",Type.BIGDECIMAL),
	idPhoto("ID_PHOTO",Type.STRING),
	tsDelete("TS_DELETE",Type.DATE),
	dtForceGarantie("DT_FORCE_GARANTIE",Type.DATE),
	dtArrete("DT_ARRETE",Type.DATE),
	idTiersCouvert("ID_TIERS_COUVERT",Type.BIGDECIMAL),
	mtGarantie("MT_GARANTIE",Type.BIGDECIMAL),
	cdDeviseValeurEco("CD_DEVISE_VALEUR_ECO",Type.STRING),
	pctAutoCouv("PCT_AUTO_COUV",Type.BIGDECIMAL),
	cdSiteRskGarantie("CD_SITE_RSK_GARANTIE",Type.STRING),
	idTiersTech("ID_TIERS_TECH",Type.STRING),

	ihmRefSquTypGarantie("cdNatureGarantie",Type.STRING),
	ihmRefSquSiteRisque("cdSiteRskGarantie",Type.STRING),
	ihmRefSquNomPays("cdPaysActif",Type.STRING),
	ihmRefSquNomPays("cdPaysGarantie",Type.STRING),
	ihmRefSquGarantRecu("cdGarantie",Type.STRING),
	ihmRefIntSiSource("idSiSource",Type.BIGDECIMAL),
	ihmAdmUtilisateur("idUtilisateurMaj",Type.BIGDECIMAL),
	ihmRefIntMotifModifAuto("idMotifModifAuto",Type.BIGDECIMAL),
	ihmRefSquCodDevise("cdDeviseMtContract",Type.STRING),
	ihmRefSquCodDevise("cdDeviseValeurEco",Type.STRING),
	ihmDossierDeDefaut("idPhotoDefaut",Type.STRING),
	ihmDossierDeDefaut("idFoncDefaut",Type.STRING),
	ihmRefIntTypEnreg("idTypEnreg",Type.BIGDECIMAL),
	ihmTieTiers("idTiersTech",Type.STRING),
	ihmTieTiers("idPhoto",Type.STRING),
	;

	/**
	 * Nom du champ en base de données.
	 */
	private final String nomSQL;

	/**
	 * Type du champ en base de données.
	 */
	private final Type type;
	
	/**
	 * Constructeur.
	 * @param nomSQL Nom du champ SQL.
	 */
	private AttributIhmFacGarantieEnum(String nomSQL, Type type) {
		this.nomSQL = nomSQL;
		this.type = type;
	}

	public String getNomSQL() {
		return nomSQL;
	}
	
	public Type getType() {
		return type;
	}
	
	/**
	 * Retourne la valeur de l'énumération en fonction du nom SQL.
	 * @param nomSQL Nom SQL de l'attribut.
	 * @return Valeur de l'énumération.
	 */
	public static AttributIhmFacGarantieEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributIhmFacGarantieEnum attributIhmFacGarantieEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributIhmFacGarantieEnum.getNomSQL(), nomSQL)) {
				return attributIhmFacGarantieEnum;
			}
		}
		return null;
	}

}