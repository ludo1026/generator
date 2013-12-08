package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : JourOuverture.
 */
public enum AttributJourOuvertureEnum {
	idJour("ID_JOUR",Type.INTEGER),
	idOuverture("ID_OUVERTURE",Type.INTEGER),

	jour("idJour",Type.INTEGER),
	horaire("idOuverture",Type.INTEGER),
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
	private AttributJourOuvertureEnum(String nomSQL, Type type) {
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
	public static AttributJourOuvertureEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributJourOuvertureEnum attributJourOuvertureEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributJourOuvertureEnum.getNomSQL(), nomSQL)) {
				return attributJourOuvertureEnum;
			}
		}
		return null;
	}

}