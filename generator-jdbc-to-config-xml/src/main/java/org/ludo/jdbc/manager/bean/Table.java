package org.ludo.jdbc.manager.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {

	String nom;
	String description;

	Map<String, Colonne> colonneByNames = new HashMap<String, Colonne>();
	ClePrimaire clePrimaire = new ClePrimaire();
	List<CleEtrangere> cleEtrangeres = new ArrayList<>();

	private Map<String, Object> infos = new HashMap<>();

	public void addToClePrimaire(final String nomColonne) {
		final Colonne colonne = this.getColonneByNames().get(nomColonne);
		this.getClePrimaire().getColonnes().add(colonne);
	}

	public void addColonne(final Colonne colonne) {
		this.colonneByNames.put(colonne.getNom(), colonne);
	}

	@Override
	public String toString() {
		String str = "[table: '" + this.nom + "', colonnes: {";
		boolean isFirst = true;
		for (final Colonne colonne : this.colonneByNames.values()) {
			if (isFirst) {
				isFirst = false;
			} else {
				str += ", ";
			}
			str += colonne;
		}
		str += "}, " + this.clePrimaire.toString() + "]";
		return str;
	}

	public String getNom() {
		return this.nom;
	}

	public Table setNom(final String nom) {
		this.nom = nom;
		return this;
	}

	public String getDescription() {
		return this.description;
	}

	public Table setDescription(final String description) {
		this.description = description;
		return this;
	}

	public Map<String, Object> getInfos() {
		return this.infos;
	}

	public void setInfos(final Map<String, Object> infos) {
		this.infos = infos;
	}

	public Map<String, Colonne> getColonneByNames() {
		return this.colonneByNames;
	}

	public void setColonneByNames(final Map<String, Colonne> colonneByNames) {
		this.colonneByNames = colonneByNames;
	}

	public ClePrimaire getClePrimaire() {
		return this.clePrimaire;
	}

	public void setClePrimaire(final ClePrimaire clePrimaire) {
		this.clePrimaire = clePrimaire;
	}

	public List<CleEtrangere> getCleEtrangeres() {
		return this.cleEtrangeres;
	}

	public void setCleEtrangeres(final List<CleEtrangere> cleEtrangeres) {
		this.cleEtrangeres = cleEtrangeres;
	}

}
