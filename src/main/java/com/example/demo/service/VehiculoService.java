package com.example.demo.service;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {
	
	public void agregar(Vehiculo vehiculo);
	public void eliminar(String placa);
	public Vehiculo buscar(String placa);
	public void actualizar(Vehiculo vehiculo);
	
}
