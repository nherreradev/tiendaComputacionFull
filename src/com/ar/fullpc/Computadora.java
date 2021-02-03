package com.ar.fullpc;

public class Computadora {

	private int idComputadora;

	private static int contadorComputadoras;

	private String nombre;

	private Monitor monitor;

	private Teclado teclado;

	private Raton raton;

	private Computadora() {

	}

	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		super();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;

		this.idComputadora = ++Computadora.contadorComputadoras;

	}

	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor= " + monitor.getMarca()
				+ " tamaño_monitor= " + monitor.getTamanio() + ", teclado=" + teclado.getTipoEntrada() + ", raton=" + raton.getTipoEntrada() + "]";
	}

	public Integer getIdComputadora() {
		return idComputadora;
	}

	public void setIdComputadora(Integer idComputadora) {
		this.idComputadora = idComputadora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

}
