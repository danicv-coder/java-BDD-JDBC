package org.danicv.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.danicv.java.jdbc.models.Producto;
import org.danicv.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.danicv.java.jdbc.repositorio.Repositorio;
import org.danicv.java.jdbc.util.ConexionBD;

public class EjemploJdbc {

	public static void main(String[] args) {

		try (Connection conexion = ConexionBD.getInstace()) {

			Repositorio<Producto> respositorio = new ProductoRepositorioImpl();
			respositorio.listar().forEach(p -> System.out.println(p.getNombre()));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
