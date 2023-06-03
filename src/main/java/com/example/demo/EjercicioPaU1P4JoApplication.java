package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4JoApplication implements CommandLineRunner{
	
	@Autowired
	private PropietarioService propietarioService;
	@Autowired
	private VehiculoService vehiculoService;
	

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Propietario propietario = new Propietario();
		propietario.setNombre("Josue");
		propietario.setApellido("Ocapana");
		propietario.setFechaNacimiento(LocalDate.now());
		propietario.setIdentificacion("1720525516");
		
		this.propietarioService.agregar(propietario);
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("toyota");
		vehiculo.setModelo("AAA");
		vehiculo.setPlaca("1234");
		vehiculo.setPrecio(new BigDecimal(122200));
		vehiculo.setTipo("automatico");
		
		
	}

}
