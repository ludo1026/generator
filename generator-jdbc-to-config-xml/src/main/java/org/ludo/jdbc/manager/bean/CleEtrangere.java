package org.ludo.jdbc.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class CleEtrangere {

	public Table tableDestination;
	public List<Colonne> colonnes = new ArrayList<Colonne>();

	public List<Colonne> getColonnes() {
		return this.colonnes;
	}

	public void setColonnes(final List<Colonne> colonnes) {
		this.colonnes = colonnes;
	}

	public Table getTableDestination() {
		return this.tableDestination;
	}

	public void setTableDestination(final Table tableDestination) {
		this.tableDestination = tableDestination;
	}

}
