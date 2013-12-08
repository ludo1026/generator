package com.bnpparibas.phenics.common.workflow.util;

/**
 * Attributs modifiable pour l'entite : Horaire.
 */
public enum AttributHoraireEnum {
	heureOuverture("HEURE_OUVERTURE",Type.DATE),
	idOuverture("ID_OUVERTURE",Type.INTEGER),
	heureFermeture("HEURE_FERMETURE",Type.DATE),

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
	private AttributHoraireEnum(String nomSQL, Type type) {
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
	public static AttributHoraireEnum getEnumForNomSQL(String nomSQL) {
		nomSQL = StringUtils.trimToEmpty(nomSQL);
		for(AttributHoraireEnum attributHoraireEnum : values()) {
			if(StringUtils.equalsIgnoreCase(attributHoraireEnum.getNomSQL(), nomSQL)) {
				return attributHoraireEnum;
			}
		}
		return null;
	}

}