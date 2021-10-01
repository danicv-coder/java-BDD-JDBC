package org.danicv.java.jdbc.models;

import java.util.Date;

public class Producto {
	private Long id;
	private String nombre;
	private Integer precio;
	private Date fechaRegistroDate;

	public Producto() {}
	
	public Producto(Long id, String nombre, Integer precio, Date fechaRegistroDate) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaRegistroDate = fechaRegistroDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Date getFechaRegistroDate() {
		return fechaRegistroDate;
	}

	public void setFechaRegistroDate(Date fechaRegistroDate) {
		this.fechaRegistroDate = fechaRegistroDate;
	}
	

}
