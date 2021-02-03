package com.ar.fullpc;

public class DispositivoEntrada {

	private String tipoEntrada;
	
	private String marca;

	public DispositivoEntrada(String tipoEntrada, String marca) {
		super();
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tipo entrada: " + this.tipoEntrada + " marca: " + this.marca;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
	
	
	
}
