package com.ceiba.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.ceiba.model.TipoVehiculo;
import com.ceiba.repository.ITipoVehiculoRepository;

public class TipoVehiculoRepository {
	
	@Autowired
	private ITipoVehiculoRepository tipoVehiculoRepository;
	
	public TipoVehiculo getT(Long id) {
		return tipoVehiculoRepository.findOne(id);
	}
	
	public List<TipoVehiculo> findByTipo(String tipo) {
		return tipoVehiculoRepository.findByTipo(tipo);
	}
}
