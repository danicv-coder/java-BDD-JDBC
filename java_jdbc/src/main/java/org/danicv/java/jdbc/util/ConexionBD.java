package org.danicv.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	private static String url = "jdbc:mysql://localhost:3306/java_curso";
	private static String username = "**";
	private static String password = "**";
	private static Connection conexion;

	public static Connection getInstace() throws SQLException {
		if (conexion == null) {
			conexion = DriverManager.getConnection(url, username, password);
		}
		return conexion;
	}
}
