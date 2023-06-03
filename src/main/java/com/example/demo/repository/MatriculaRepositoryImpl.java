package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;


@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository{
	
	private List<Matricula> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Matricula vehiculo) {
		baseDatos.add(vehiculo);

	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub

	}

	@Override
	public Matricula seleccionar(String placa) {
		Matricula vehiculoEncontrado = new Matricula();

		for (Matricula vehiculo : baseDatos) {
			if (placa.equals(vehiculo.getVehiculo().getPlaca())) {
				vehiculoEncontrado = vehiculo;
			}
		}

		return vehiculoEncontrado;
	}

	@Override
	public void actualizar(Matricula vehiculo) {
		this.borrar(vehiculo.getVehiculo().getPlaca());
		this.insertar(vehiculo);
	}
}
