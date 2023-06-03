package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("sinDescuento")
public class PrecioMatriculaSinDescuentoServiceImpl implements PrecioMatriculaService{

	@Override
	public BigDecimal descuento(BigDecimal valorMatriula) {
		// TODO Auto-generated method stub
		return valorMatriula;
	}

}
