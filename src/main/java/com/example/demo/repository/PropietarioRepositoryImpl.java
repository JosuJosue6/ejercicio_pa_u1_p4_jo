package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{
	
	private List<Propietario> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Propietario propietario) {
		baseDatos.add(propietario);
		
	}

	@Override
	public void borrar(String identificador) {
		Propietario propietario = this.seleccionar(identificador);
		baseDatos.remove(propietario);
		
	}

	@Override
	public Propietario seleccionar(String identificador) {
		Propietario propietarioEncontrado = new Propietario();
		
		for(Propietario propietario: baseDatos) {
			if(identificador.equals(propietario.getIdentificacion())) {
				propietarioEncontrado = propietario;
			}
		}
		
		return propietarioEncontrado;
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.borrar(propietario.getIdentificacion());
		this.insertar(propietario);
		
	}
	



	

}
