package com.ar.fullpc;

import java.util.ArrayList;
import java.util.List;

public class Orden {
	
	private int idOrden;
	
	private ArrayList<Computadora> listaComputadoras = new ArrayList<Computadora>();
	
	private static int contadorOrdenes;
	
	private Integer contadorComputadoras;
	
	private Integer maxComputadoras;

	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
	}
	
	
	public void agregarComputadora(Computadora computadora) {
		this.listaComputadoras.add(computadora);
	}
	
	public void mostrarOrden() {
		
		for (Computadora computadora : listaComputadoras) {
			System.out.println("Orden Nro " + this.idOrden  + "\n" +  computadora + "\n");
		}
		
	}


	@Override
	public String toString() {
		return "Orden [idOrden=" + idOrden + ", listaComputadoras=" + listaComputadoras + ", contadorComputadoras="
				+ contadorComputadoras + ", maxComputadoras=" + maxComputadoras + "]";
	}
	
	
	

}
