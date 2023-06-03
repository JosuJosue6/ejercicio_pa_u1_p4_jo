package com.example.demo.repository;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoRepository {
	
	public void insertar(Vehiculo vehiculo);
	public void borrar(String placa);
	public Vehiculo seleccionar(String placa);
	public void actualizar(Vehiculo vehiculo);

}
