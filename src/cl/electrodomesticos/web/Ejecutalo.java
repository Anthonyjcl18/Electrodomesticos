package cl.electrodomesticos.web;

import cl.electrodomestico.poo.*;

/**
 * Clase ejecutalo.
 * 
 * @author Anthony Campos
 *
 */
public class Ejecutalo {

	public static void main(String[] args) {

		// Se crea un array de Electrodomésticos de 10 posiciones.
		Electrodomestico posicion[] = new Electrodomestico[10];

		// Se crean las variables para mostrar el precio final de cada una de las
		// clases.
		double valorTotalElectro = 0;
		double valorTotalLavadora = 0;
		double valorTotalTelevision = 0;

		// Se asigna a cada posición un objeto de las clases anteriores con los valores.
		posicion[0] = new Electrodomestico();
		posicion[1] = new Lavadora();
		posicion[2] = new Television();
		posicion[3] = new Electrodomestico(150000, 25);
		posicion[4] = new Lavadora(200000, 35);
		posicion[5] = new Television(200000, 17);
		posicion[6] = new Electrodomestico(300000, "gris", 'A', 20);
		posicion[7] = new Lavadora(250000, "blanco", 'C', 50, 35);
		posicion[8] = new Television(180000, "negro", 'D', 20, 30, false);
		posicion[9] = new Electrodomestico(120000, 10);

		// Ahora, se recorre este array y se ejecuta el método precioFinal().
		for (int i = 0; i < posicion.length; i++) {
			if (posicion[i] instanceof Electrodomestico) {
				valorTotalElectro = valorTotalElectro + posicion[i].precioFinal();
			}
			if (posicion[i] instanceof Lavadora) {
				valorTotalLavadora = valorTotalLavadora + posicion[i].precioFinal();
			}
			if (posicion[i] instanceof Television) {
				valorTotalTelevision = valorTotalTelevision + posicion[i].precioFinal();
			}
		}

		/*
		 * Se muestra el precio final de cada clase, es decir, el precio de todas las
		 * lavadoras, por un lado, el de las televisiones por otro y el de la suma de
		 * los Electrodomésticos.
		 */
		System.out.println("El precio total de la clase lavadora es de: " + valorTotalLavadora);
		System.out.println("El precio total de la clase television es de: " + valorTotalTelevision);
		System.out.println("El precio total de la clase electrodomestico es de: " + valorTotalElectro);

	}

}
