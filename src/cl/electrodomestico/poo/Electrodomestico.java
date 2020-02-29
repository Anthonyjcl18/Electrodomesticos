package cl.electrodomestico.poo;

/**
 * Clase Electrodomestico. 
 * Posee toda la informacion de la clase.
 * 
 * @author Anthony Campos
 *
 */
public class Electrodomestico {

	// Atributos de la clase:

	/**
	 * Indica el Precio base del electrodomestico.
	 */
	private double precioBase;

	/**
	 * Indica el Color del electrodomestico.
	 */
	private String color;

	/**
	 * Indica el Consumo energetico del electrodomestico.
	 */
	private char consumoEnergetico;

	/**
	 * Indica el Peso del electrodomestico.
	 */
	private int peso;

	// Constantes por defecto:

	/**
	 * Indica el Precio base por defecto del electrodomestico.
	 */
	protected final static double precioBaseK = 100000;

	/**
	 * Indica el Color por defecto del electrodomestico.
	 */
	protected final static String colorK = "blanco";

	/**
	 * Indica el Consumo energetico por defecto del electrodomestico.
	 */
	protected final static char consumoEnergeticoK = 'F';

	/**
	 * Indica el Peso por defecto del electrodomestico.
	 */
	protected final static int pesoK = 5;

	/**
	 * Constructor por defecto de la clase electrodomestico.
	 */
	public Electrodomestico() {
		this(precioBaseK, colorK, consumoEnergeticoK, pesoK);
	}

	/**
	 * Constructor con el precio y peso de la clase electrodomestico.
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * Constructor con todos los atributos de la clase electrodomestico.
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	/**
	 * Metodo get del atributo precio base.
	 * 
	 * @return Retorna el precio base de la clase electrodomestico.
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Metodo get del atributo color.
	 * 
	 * @return Retorna el color de la clase electrodomestico.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo get del atributo consumo energetico.
	 * 
	 * @return Retorna el consumo energetico de la clase electrodomestico.
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Metodo get del atributo peso.
	 * 
	 * @return Retorna el peso de la clase electrodomestico.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Metodo para comprobar que la letra es correcta, sino es correcta, usara la
	 * letra por defecto.
	 * 
	 * @param consumoEnergetico La letra asignada para consumo energetico.
	 */
	public void comprobarConsumoEnergetico(char consumoEnergetico) {

		char LetrasDisponibles[] = { 'A', 'B', 'C', 'D', 'E' };
		boolean correcta = false;

		for (int i = 0; i < LetrasDisponibles.length && !correcta; i++) {
			if (LetrasDisponibles[i] == consumoEnergetico) {
				correcta = true;
			}
		}
		if (correcta) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = consumoEnergeticoK;
		}
	}

	/**
	 * Metodo para comprobar que el color es correcto, sino lo es, usara el color
	 * por defecto.
	 * 
	 * @param color El color asignado en los electrodomesticos.
	 */
	public void comprobarColor(String color) {

		String coloresDisponibles[] = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean correcto = false;

		for (int i = 0; i < coloresDisponibles.length && !correcto; i++) {
			if (coloresDisponibles[i].equals(color)) {
				correcto = true;
			}
		}
		if (correcto) {
			this.color = color;
		} else {
			this.color = colorK;
		}
	}

	/**
	 * Metodo que permite según el consumo energético y el peso, aumentar el
	 * precio del electrodomestico.
	 * 
	 * @return El precio final considerando lo indicado en la descripcion del
	 *         metodo.
	 */
	public double precioFinal() {
		double precioFinal = precioBaseK;

		switch (consumoEnergetico) {
		case 'A':
			precioFinal = precioFinal + 100000;
			break;
		case 'B':
			precioFinal = precioFinal + 80000;
			break;
		case 'C':
			precioFinal = precioFinal + 60000;
			break;
		case 'D':
			precioFinal = precioFinal + 50000;
			break;
		case 'E':
			precioFinal = precioFinal + 30000;
			break;
		case 'F':
			precioFinal = precioFinal + 10000;
			break;
		}

		if (peso >= 0 && peso <= 19) {
			precioFinal = precioFinal + 10000;
		} else if (peso >= 20 && peso <= 49) {
			precioFinal = precioFinal + 50000;
		} else if (peso >= 50 && peso <= 79) {
			precioFinal = precioFinal + 80000;
		} else if (peso >= 80) {
			precioFinal = precioFinal + 100000;
		}

		return precioFinal;
	}

}
