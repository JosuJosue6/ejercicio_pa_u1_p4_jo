package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService {
	
	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	public void agregar(Propietario propietario) {
		this.propietarioRepository.insertar(propietario);
		
	}

	@Override
	public void eliminar(String identificador) {
		this.propietarioRepository.borrar(identificador);
		
	}

	@Override
	public Propietario buscar(String identificador) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionar(identificador);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
	}

}
