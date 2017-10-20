package com.ceiba.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.model.TipoVehiculo;

@RestController
public interface IParqueaderoController {
	
	@RequestMapping(method = RequestMethod.POST, path = "/save")
	@ResponseBody
	public List<TipoVehiculo> guardarTipoVehiculo(@RequestBody List<TipoVehiculo> tiposVehiculos);
	
	@RequestMapping(method = RequestMethod.POST, path = "/saveone", consumes = "application/json")
	public TipoVehiculo guardarUnTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo);
	
	

}
