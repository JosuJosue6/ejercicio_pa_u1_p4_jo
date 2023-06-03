package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.validation.DataBinder;

@Service("descuento")
public class PrecioMatriculaDescuentoServiceImpl implements PrecioMatriculaService{

	@Override
	public BigDecimal descuento(BigDecimal valorMatriula) {
		BigDecimal valorFinal = new BigDecimal(0);
		if(valorMatriula.compareTo(new BigDecimal(3000))<= 0) {
			BigDecimal porcentaje = valorMatriula.multiply(new BigDecimal(0.9));
			valorFinal = valorMatriula.subtract(porcentaje);
			
		}
		return valorFinal;
	}

	

}
