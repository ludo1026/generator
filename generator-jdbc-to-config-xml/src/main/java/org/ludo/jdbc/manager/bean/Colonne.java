package org.ludo.jdbc.manager.bean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class Colonne {

	private String nom, type, size, description;
	private boolean isNullable;
	private Map<String, Object> infos = new HashMap<>();

	@Override
	public String toString() {
		return this.nom;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == null) {
			return (this == null) ? true : false;
		}
		if (!(o instanceof Colonne)) {
			return false;
		}
		final Colonne colonne = (Colonne) o;
		return StringUtils.equals(this.nom, colonne.getNom());
	}

	@Override
	public int hashCode() {
		return this.nom.hashCode();
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public Map<String, Object> getInfos() {
		return this.infos;
	}

	public void setInfos(final Map<String, Object> infos) {
		this.infos = infos;
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(final String size) {
		this.size = size;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public boolean getIsNullable() {
		return this.isNullable;
	}

	public void setIsNullable(final boolean isNullable) {
		this.isNullable = isNullable;
	}

}
