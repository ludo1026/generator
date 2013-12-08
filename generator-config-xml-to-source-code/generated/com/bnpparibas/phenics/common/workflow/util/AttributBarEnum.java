package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : Bar.
 */
public enum AttributBarEnum {
	idBar("ID_BAR",Type.INTEGER),
	idStatutBar("ID_STATUT_BAR",Type.INTEGER),
	photoIdPhoto("PHOTO_ID_PHOTO",Type.INTEGER),
	siteBar("SITE_BAR",Type.STRING),
	descriptionBar("DESCRIPTION_BAR",Type.STRING),
	adresseIdAdresse("ADRESSE_ID_ADRESSE",Type.INTEGER),
	idCategorieBar("ID_CATEGORIE_BAR",Type.INTEGER),
	nomBar("NOM_BAR",Type.STRING),

	statut("idStatutBar",Type.INTEGER),
	adresse("adresseIdAdresse",Type.INTEGER),
	categorie("idCategorieBar",Type.INTEGER),
	photo("photoIdPhoto",Type.INTEGER),
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
	private AttributBarEnum(String nomSQL, Type type) {
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
	public static AttributBarEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributBarEnum attributBarEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributBarEnum.getNomSQL(), nomSQL)) {
				return attributBarEnum;
			}
		}
		return null;
	}

}