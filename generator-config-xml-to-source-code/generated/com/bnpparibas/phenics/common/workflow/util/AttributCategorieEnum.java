package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : Categorie.
 */
public enum AttributCategorieEnum {
	idCategorie("ID_CATEGORIE",Type.INTEGER),
	nomCategorie("NOM_CATEGORIE",Type.STRING),

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
	private AttributCategorieEnum(String nomSQL, Type type) {
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
	public static AttributCategorieEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributCategorieEnum attributCategorieEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributCategorieEnum.getNomSQL(), nomSQL)) {
				return attributCategorieEnum;
			}
		}
		return null;
	}

}