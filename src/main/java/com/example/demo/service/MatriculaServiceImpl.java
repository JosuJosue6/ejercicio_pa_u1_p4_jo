package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements MatriculaService {
	@Autowired
	private MatriculaRepository matriculaRepository;
	@Autowired
	private VehiculoRepository vehiculoRepository;
	@Autowired
	private PropietarioRepository propietarioRepository;
	@Autowired
	@Qualifier("automatico")
	private ValorMatriculaService matriculaService;
	@Autowired
	@Qualifier("manual")
	private ValorMatriculaService matriculaService1;
	

	@Override
	public void insertar(Matricula matricula) {
		this.matriculaRepository.insertar(matricula);
		
	}

	@Override
	public void borrar(String propietario) {
		this.matriculaRepository.borrar(propietario);
		
	}

	@Override
	public Matricula seleccionar(String identificador) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.seleccionar(identificador);
	}

	@Override
	public void actualizar(Matricula propietario) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(propietario);
	}

	
	//Logica
	
	@Override
	public void crearMatricula(String identificador, String placa) {
		
		
		
		
	}

	

}
