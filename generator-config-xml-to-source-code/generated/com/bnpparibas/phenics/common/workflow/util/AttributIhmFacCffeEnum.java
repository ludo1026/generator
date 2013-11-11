package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : IhmFacCffe.
 */
public enum AttributIhmFacCffeEnum {
	idSiSource("ID_SI_SOURCE",Type.BIGDECIMAL),
	idFacilite("ID_FACILITE",Type.STRING),
	coCffe("CO_CFFE",Type.STRING),
	idPhotoFacilite("ID_PHOTO_FACILITE",Type.STRING),
	blDelete("BL_DELETE",Type.BIGDECIMAL),
	idMotifModifAuto("ID_MOTIF_MODIF_AUTO",Type.BIGDECIMAL),
	idFoncDefaut("ID_FONC_DEFAUT",Type.STRING),
	idPhoto("ID_PHOTO",Type.STRING),
	idUtilisateurMaj("ID_UTILISATEUR_MAJ",Type.BIGDECIMAL),
	tsDelete("TS_DELETE",Type.DATE),
	idTypEnreg("ID_TYP_ENREG",Type.BIGDECIMAL),
	dtArrete("DT_ARRETE",Type.DATE),
	idTechCffe("ID_TECH_CFFE",Type.BIGDECIMAL),
	mtCffe("MT_CFFE",Type.BIGDECIMAL),
	cdTypCffe("CD_TYP_CFFE",Type.STRING),
	cdDevise("CD_DEVISE",Type.STRING),
	cdSiteRsk("CD_SITE_RSK",Type.STRING),
	idPhotoDefaut("ID_PHOTO_DEFAUT",Type.STRING),
	dtCffe("DT_CFFE",Type.DATE),
	indMigBdi("IND_MIG_BDI",Type.STRING),

	ihmRefIntSiSource("idSiSource",Type.BIGDECIMAL),
	ihmAdmUtilisateur("idUtilisateurMaj",Type.BIGDECIMAL),
	ihmRefIntMotifModifAuto("idMotifModifAuto",Type.BIGDECIMAL),
	ihmRefSquCodDevise("cdDevise",Type.STRING),
	ihmRefIntTypEnreg("idTypEnreg",Type.BIGDECIMAL),
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
	private AttributIhmFacCffeEnum(String nomSQL, Type type) {
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
	public static AttributIhmFacCffeEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributIhmFacCffeEnum attributIhmFacCffeEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributIhmFacCffeEnum.getNomSQL(), nomSQL)) {
				return attributIhmFacCffeEnum;
			}
		}
		return null;
	}

}
