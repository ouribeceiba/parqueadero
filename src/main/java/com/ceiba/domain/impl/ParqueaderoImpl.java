package com.ceiba.domain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.domain.IParqueadero;
import com.ceiba.model.TipoVehiculo;
import com.ceiba.repository.ITipoVehiculoRepository;

@Service
public class ParqueaderoImpl implements IParqueadero {
	
	//@Autowired
	private ITipoVehiculoRepository tipoVehiculoRepository;

	@Override
	public List<TipoVehiculo> consultarTiposVehiculo() {
		List<TipoVehiculo> tiposVehiculo = (List<TipoVehiculo>)tipoVehiculoRepository.findAll();
		return tiposVehiculo;
	}
	
	@Override
	public TipoVehiculo guardarTipoVehiculo(TipoVehiculo tipoVehiculo) {
		return tipoVehiculoRepository.save(tipoVehiculo);
	}
	
	public List<TipoVehiculo> guardarTiposVehiculo(List<TipoVehiculo> tiposVehiculoGuardar) {
		return (List<TipoVehiculo>) tipoVehiculoRepository.save(tiposVehiculoGuardar);
	}

	@Autowired
	public void setTipoVehiculoRepository(ITipoVehiculoRepository tipoVehiculoRepository) {
		this.tipoVehiculoRepository = tipoVehiculoRepository;
	}
	
	
	
	

}
