package cl.electrodomestico.poo;

/**
 * Clase Lavadora. 
 * Posee toda la informacion de la clase.
 * 
 * @author Anthony Campos
 *
 */
public class Lavadora extends Electrodomestico {

	// Atributo de la clase:

	/**
	 * Indica la carga de la lavadora.
	 */
	private int carga;

	// Constantes por defecto:

	/**
	 * Indica la carga por defecto de la lavadora.
	 */
	protected final static int cargaK = 5;

	/**
	 * Constructor por defecto.
	 */
	public Lavadora() {
		this(precioBaseK, colorK, consumoEnergeticoK, pesoK, cargaK);
	}

	/**
	 * Constructor con el precio base y el peso.
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);

	}

	/**
	 * Constructor con todos los atributos.
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	/**
	 * Metodo get del atributo carga.
	 * 
	 * @return la carga de la clase electrodomestico.
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Metodo que me permite aumentar el valor si la carga es mayor de 30 kg, sino, no
	 * se incrementara el precio.
	 * 
	 * @return Precio final de la clase lavadora.
	 */
	public double precioFinal() {

		double precioFinal = super.precioFinal();

		if (carga > 30) {
			precioFinal = precioFinal + 50000;
		} else {
			if (carga < 30) {
				precioFinal = precioBaseK;
			}
		}

		return precioFinal;
	}

}
