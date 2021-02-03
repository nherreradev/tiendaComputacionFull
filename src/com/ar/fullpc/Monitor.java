package com.ar.fullpc;

public class Monitor {
	
	private int idMonitor;
	
	private String marca;
	
	private Double tamanio;
	
	private static int contadorMonitores;

	private Monitor() {
		
	}

	public Monitor(String marca, Double tamanio) {
		
		this.marca = marca;
		this.tamanio = tamanio;
		
		this.idMonitor = ++Monitor.contadorMonitores;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio+ "]";
	}

	public Integer getIdMonitor() {
		return idMonitor;
	}

	public void setIdMonitor(Integer idMonitor) {
		this.idMonitor = idMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getTamanio() {
		return tamanio;
	}

	public void setTamanio(Double tamanio) {
		this.tamanio = tamanio;
	}

	public Integer getContadorMonitores() {
		return contadorMonitores;
	}

	public void setContadorMonitores(Integer contadorMonitores) {
		this.contadorMonitores = contadorMonitores;
	}
	
	
	
	
	
	

}
