package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements VehiculoService {
	
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.borrar(placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.seleccionar(placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizar(vehiculo);
	}

}
