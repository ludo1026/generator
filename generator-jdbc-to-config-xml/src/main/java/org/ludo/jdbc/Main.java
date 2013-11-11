package org.ludo.jdbc;

import org.ludo.jdbc.manager.JDBCManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * Nom du fichier de configuration des scripts.
	 */
	public static final String SPRING_CONFIG_SCRIPT_XML = "config/applicationContext.xml";

	public static final String CONFIG_XML_ORIG = "origin/config-classes.xml";
	public static final String CONFIG_XML_DEST = "generated/config-classes.xml";

	/**
	 * Context SPRING.
	 */
	private static org.springframework.context.ApplicationContext context;

	/**
	 * Initialisation : charger le contexte Spring.
	 */
	static {
		Main.context = new ClassPathXmlApplicationContext(new String[] { Main.SPRING_CONFIG_SCRIPT_XML, });
	}

	public static void main(final String[] args) {
		final JDBCManager jdbcManager = (JDBCManager) Main.context.getBean("jdbcManager");
		jdbcManager.main(Main.CONFIG_XML_ORIG, Main.CONFIG_XML_DEST);
	}

}
