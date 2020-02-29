package cl.electrodomestico.poo;

/**
 * Clase Television.
 * Posee toda la informacion de la clase.
 * 
 * @author Anthony Campos
 *
 */
public class Television extends Electrodomestico {

	// Atributos de la clase:

	/**
	 * Indica la resolucion del televisor.
	 */
	private int resolucion;

	/**
	 * Indica el sintonizador del televisor.
	 */
	private boolean sintonizadorTDT;

	// Constantes por defecto:

	/**
	 * Indica la resolucion por defecto del televisor.
	 */
	protected static int resolucionK = 20;

	/**
	 * Indica el sintonizador por defecto del televisor.
	 */
	protected static boolean sintonizadorTDTK = false;

	/**
	 * Constructor por defecto.
	 */
	public Television() {
		this(precioBaseK, colorK, consumoEnergeticoK, pesoK, resolucionK, sintonizadorTDTK);
	}

	/**
	 * Constructor con el precio base y el peso.
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Television(double precioBase, int peso) {
		super(precioBase, peso);

	}

	/**
	 * Constructor con todos los atributos.
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Metodo get del atributo resolucion.
	 * 
	 * @return la resolucion de la clase televisor.
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * Metodo get del atributo sintonizador.
	 * 
	 * @return
	 */
	public boolean SintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Metodo que me permite aumentar el valor si la resolucion es mayor de 40
	 * pulgadas y si tiene sintonizador, sino, no se incrementara el precio.
	 * 
	 * @return Precio final de la clase television.
	 */
	public double precioFinal() {

		double precioFinal = super.precioFinal();

		if (resolucion > 40) {
			precioFinal = precioFinal + precioFinal * 0.3;
		}
		if (sintonizadorTDT) {
			precioFinal = precioFinal + 50000;
		}

		return precioFinal;
	}

}
