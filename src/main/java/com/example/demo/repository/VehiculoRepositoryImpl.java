package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository {

	private List<Vehiculo> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Vehiculo vehiculo) {
		baseDatos.add(vehiculo);

	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vehiculo seleccionar(String placa) {
		Vehiculo vehiculoEncontrado = new Vehiculo();

		for (Vehiculo vehiculo : baseDatos) {
			if (placa.equals(vehiculo.getPlaca())) {
				vehiculoEncontrado = vehiculo;
			}
		}

		return vehiculoEncontrado;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.borrar(vehiculo.getPlaca());
		this.insertar(vehiculo);
	}

}
