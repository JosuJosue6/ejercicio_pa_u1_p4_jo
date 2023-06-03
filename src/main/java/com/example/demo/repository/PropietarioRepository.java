package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioRepository {

	public void insertar(Propietario propietario);
	public void borrar(String identificador);
	public Propietario seleccionar(String identificador);
	public void actualizar(Propietario propietario);
	
}
