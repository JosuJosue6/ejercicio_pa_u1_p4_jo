package com.example.demo.repository.modelo;

import java.math.BigDecimal;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private BigDecimal precio;
	private String tipo;
	
	//Get y Set
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//To STRING
	@Override
	public String toString() {
		return "Propietario [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", precio=" + precio
				+ ", tipo=" + tipo + "]";
	}
	
	
	
}
