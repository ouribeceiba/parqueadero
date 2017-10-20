package com.ceiba.model;

import java.util.Date;

public class Registro {
	
	private int id;
	private VehiculoDTO vehiculo;
	private Date fechaEntrada;
	private Date fechaSalida;
	private double valorCobro;
	
	public Registro() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public VehiculoDTO getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoDTO vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getValorCobro() {
		return valorCobro;
	}

	public void setValorCobro(double valorCobro) {
		this.valorCobro = valorCobro;
	}
	
	
	
	

}
