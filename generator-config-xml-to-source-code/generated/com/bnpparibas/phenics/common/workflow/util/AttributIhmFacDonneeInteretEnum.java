package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : IhmFacDonneeInteret.
 */
public enum AttributIhmFacDonneeInteretEnum {
	idSiSource("ID_SI_SOURCE",Type.BIGDECIMAL),
	idFacilite("ID_FACILITE",Type.STRING),
	cdTypTaux("CD_TYP_TAUX",Type.STRING),
	idPhotoFacilite("ID_PHOTO_FACILITE",Type.STRING),
	blDelete("BL_DELETE",Type.BIGDECIMAL),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO",Type.BIGDECIMAL),
	coDonneeInteret("CO_DONNEE_INTERET",Type.STRING),
	txSpread("TX_SPREAD",Type.BIGDECIMAL),
	idFoncDefaut("ID_FONC_DEFAUT",Type.STRING),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ",Type.BIGDECIMAL),
	idPhoto("ID_PHOTO",Type.STRING),
	tsDelete("TS_DELETE",Type.DATE),
	dtDebutValidite("DT_DEBUT_VALIDITE",Type.DATE),
	idTypEnreg("ID_TYP_ENREG",Type.BIGDECIMAL),
	dtArrete("DT_ARRETE",Type.DATE),
	cdTxReference("CD_TX_REFERENCE",Type.STRING),
	txFacial("TX_FACIAL",Type.BIGDECIMAL),
	dtTxInteret("DT_TX_INTERET",Type.DATE),
	cdSiteRsk("CD_SITE_RSK",Type.STRING),
	idPhotoDefaut("ID_PHOTO_DEFAUT",Type.STRING),
	cdPerdCalInteret("CD_PERD_CAL_INTERET",Type.STRING),
	indMigBdi("IND_MIG_BDI",Type.STRING),

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
	private AttributIhmFacDonneeInteretEnum(String nomSQL, Type type) {
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
	public static AttributIhmFacDonneeInteretEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributIhmFacDonneeInteretEnum attributIhmFacDonneeInteretEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributIhmFacDonneeInteretEnum.getNomSQL(), nomSQL)) {
				return attributIhmFacDonneeInteretEnum;
			}
		}
		return null;
	}

}
