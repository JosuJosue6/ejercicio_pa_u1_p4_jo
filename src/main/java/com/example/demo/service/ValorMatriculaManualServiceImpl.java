package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("manual")
public class ValorMatriculaManualServiceImpl implements ValorMatriculaService{

	@Override
	public BigDecimal valor(BigDecimal matricula) {
		BigDecimal valorMatricula = matricula.multiply(new BigDecimal(0.10));
		return valorMatricula;
	}

}
