package com.ceiba;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ceiba.domain.IParqueadero;
import com.ceiba.domain.impl.ParqueaderoImpl;
import com.ceiba.model.TipoVehiculo;

@SpringBootApplication
public class ParqueaderoApplication {
	
	//@Autowired
	//private static IParqueadero parqueadero;

	public static void main(String[] args) {
		SpringApplication.run(ParqueaderoApplication.class, args);
		
		
		
		/*TipoVehiculo tv1 = new TipoVehiculo("CARRO");
		TipoVehiculo tv2 = new TipoVehiculo("MOTO");
		
		List<TipoVehiculo> tiposVehiculoGuardar = new ArrayList();
		
		tiposVehiculoGuardar.add(tv1);
		tiposVehiculoGuardar.add(tv2);
		
		tiposVehiculoGuardar = parqueadero.guardarTiposVehiculo(tiposVehiculoGuardar);
		System.out.println("-------------------------- Vehículos Guardados ----------------------------");
		tiposVehiculoGuardar.forEach((data) -> System.out.println("tipo Vehículo Guardado -> "+ data.getTipo()));
		
		System.out.println("-------------------------- Vehículos Consultados ----------------------------");
		List<TipoVehiculo> tv = parqueadero.consultarTiposVehiculo();
		tv.forEach((data) -> System.out.println("tipo ve -> "+ data.getTipo()));*/
	}
}
