package com.ceiba.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ceiba.model.TipoVehiculo;

public interface ITipoVehiculoRepository extends CrudRepository<TipoVehiculo, Long> {
	
	public List<TipoVehiculo> findByTipo(String tipo);

}
