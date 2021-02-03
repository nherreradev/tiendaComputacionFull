package test;

import com.ar.fullpc.Computadora;
import com.ar.fullpc.Monitor;
import com.ar.fullpc.Orden;
import com.ar.fullpc.Raton;
import com.ar.fullpc.Teclado;

public class Fullpc {

	public static void main(String[] args) {

		Raton raton = new Raton("USB", "Logitech");

		Teclado teclado = new Teclado("USB", "HP");

		Monitor monitor = new Monitor("LG", 14.2);

		Computadora computadora = new Computadora("hp250", monitor, teclado, raton);
		

		Raton raton2 = new Raton("USB", "Logitech");

		Teclado teclado2 = new Teclado("USB", "HP");

		Monitor monitor2 = new Monitor("Logitech", 14.2);

		Computadora computadora2 = new Computadora("Vaio10", monitor2, teclado2, raton2);

		Orden orden = new Orden();

		orden.agregarComputadora(computadora);
		orden.agregarComputadora(computadora2);

		orden.mostrarOrden();

	}

}
