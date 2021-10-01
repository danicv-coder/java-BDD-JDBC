package org.danicv.java.jdbc.repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.danicv.java.jdbc.models.Producto;
import org.danicv.java.jdbc.util.ConexionBD;

public class ProductoRepositorioImpl implements Repositorio<Producto> {

	private Connection getConexion() throws SQLException {
		return ConexionBD.getInstace();
	}

	@Override
	public List<Producto> listar() {
		List<Producto> productos = new ArrayList<>();
		try(Statement stmt = getConexion().createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM productos")) {
			while(result.next()) {
				Producto p = new Producto();
				p.setId(result.getLong("id"));
				p.setNombre(result.getNString("nombre"));
				p.setPrecio(result.getInt("precio"));
				p.setFechaRegistroDate(result.getDate("fecha_registro"));
				productos.add(p);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productos;
	}

	@Override
	public Producto porId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Producto t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub

	}

}
