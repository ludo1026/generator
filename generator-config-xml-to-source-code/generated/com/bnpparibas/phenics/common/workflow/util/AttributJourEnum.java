package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : Jour.
 */
public enum AttributJourEnum {
	nomJour("NOM_JOUR",Type.STRING),
	idJour("ID_JOUR",Type.INTEGER),

	;

	/**
	 * Nom du champ en base de donn�es.
	 */
	private final String nomSQL;

	/**
	 * Type du champ en base de donn�es.
	 */
	private final Type type;
	
	/**
	 * Constructeur.
	 * @param nomSQL Nom du champ SQL.
	 */
	private AttributJourEnum(String nomSQL, Type type) {
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
	 * Retourne la valeur de l'�num�ration en fonction du nom SQL.
	 * @param nomSQL Nom SQL de l'attribut.
	 * @return Valeur de l'�num�ration.
	 */
	public static AttributJourEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributJourEnum attributJourEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributJourEnum.getNomSQL(), nomSQL)) {
				return attributJourEnum;
			}
		}
		return null;
	}

}