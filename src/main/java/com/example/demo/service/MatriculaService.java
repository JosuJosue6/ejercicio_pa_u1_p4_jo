package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaService {
	public void insertar(Matricula matricula);
	public void borrar(String propietario);
	public Matricula seleccionar(String identificador);
	public void actualizar(Matricula propietario);
	
	public void crearMatricula(String identificador, String placa);
}
