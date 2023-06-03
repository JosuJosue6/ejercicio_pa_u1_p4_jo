package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("automatico")
public class ValorMatriculaAutomaticoServiceImpl implements ValorMatriculaService {

	@Override
	public BigDecimal valor(BigDecimal matricula) {
		BigDecimal valorMatricula = matricula.multiply(new BigDecimal(0.15));
		return valorMatricula;
	}
	
}
