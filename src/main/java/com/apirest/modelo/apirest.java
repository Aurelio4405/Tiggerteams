package com.apirest.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Estudiante")
public class apirest {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "usuario")
	private String usuario;
	@Column(name = "contraseña")
	private String contraseña;
	@Column(name = "zonahoraria")
	private String zonahoraria;
	@Column(name = "calificacion")
	private String calificacion;
	
	public apirest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public apirest(int id, String nombre, String usuario, String contraseña,String zonahoraria,String calificacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.zonahoraria = zonahoraria;
		this.calificacion = calificacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getZonahoraria() {
		return zonahoraria;
	}

	public void setZonahoraria(String zonahoraria) {
		this.zonahoraria = zonahoraria;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	

	
}
