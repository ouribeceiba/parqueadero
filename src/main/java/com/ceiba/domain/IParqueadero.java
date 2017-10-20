package com.ceiba.domain;

import java.util.List;

import com.ceiba.model.TipoVehiculo;

public interface IParqueadero {
	
	public List<TipoVehiculo> consultarTiposVehiculo();
	
	public List<TipoVehiculo> guardarTiposVehiculo(List<TipoVehiculo> tiposVehiculoGuardar);
	
	public TipoVehiculo guardarTipoVehiculo(TipoVehiculo tipoVehiculo);

}
