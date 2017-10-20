package com.ceiba.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.controller.IParqueaderoController;
import com.ceiba.domain.IParqueadero;
import com.ceiba.model.TipoVehiculo;

@RestController
public class ParqueaderoControllerImpl implements IParqueaderoController {

	@Autowired
	private IParqueadero parqueadero;
	
	@Override
	public List<TipoVehiculo> guardarTipoVehiculo(List<TipoVehiculo> tiposVehiculos) {
		System.out.println("HOLAA");
		return parqueadero.guardarTiposVehiculo(tiposVehiculos);
	}

	@Override
	public TipoVehiculo guardarUnTipoVehiculo(TipoVehiculo tipoVehiculo) {
		System.out.println("TIPO VEH");
		System.out.println("tipo -> " + tipoVehiculo.getId());
		
		return parqueadero.guardarTipoVehiculo(tipoVehiculo);
	}

}
