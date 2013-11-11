package org.ludo.jdbc.manager.bean;

import java.util.HashMap;
import java.util.Map;

public class Schema {

	private Map<String, Table> tableByNoms = new HashMap<>();

	public void addTable(final Table table) {
		this.getTableByNoms().put(table.getNom(), table);
	}

	public Map<String, Table> getTableByNoms() {
		return this.tableByNoms;
	}

	public void setTableByNoms(final Map<String, Table> tableByNoms) {
		this.tableByNoms = tableByNoms;
	}

}
