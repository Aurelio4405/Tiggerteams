package com.apirest.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Examen")
public class Examen {
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int ID;
	@Column(name = "opcion1")
	private String opcion1;
	@Column(name = "opcion2")
	private String opcion2;
	@Column(name = "opcion3")
	private String opcion3;
	@Column(name = "opcion4")
	private String opcion4;
	
	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Examen(int iD, String opcion1, String opcion2, String opcion3, String opcion4) {
		super();
		ID = iD;
		this.opcion1 = opcion1;
		this.opcion2 = opcion2;
		this.opcion3 = opcion3;
		this.opcion4 = opcion4;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getOpcion1() {
		return opcion1;
	}

	public void setOpcion1(String opcion1) {
		this.opcion1 = opcion1;
	}

	public String getOpcion2() {
		return opcion2;
	}

	public void setOpcion2(String opcion2) {
		this.opcion2 = opcion2;
	}

	public String getOpcion3() {
		return opcion3;
	}

	public void setOpcion3(String opcion3) {
		this.opcion3 = opcion3;
	}

	public String getOpcion4() {
		return opcion4;
	}

	public void setOpcion4(String opcion4) {
		this.opcion4 = opcion4;
	}
	
	
}
