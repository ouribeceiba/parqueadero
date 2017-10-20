package com.ceiba.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipovehiculo")
public class TipoVehiculo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1705333159404198123L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "tipo", nullable = false, unique = true)
	private String tipo;
	
	public TipoVehiculo(String tipo) {
		
		this.tipo = tipo;
		
	}
	
	protected TipoVehiculo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
