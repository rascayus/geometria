package principal;

/**
 * 
 * @author Juan Diego Alonso
 * @version 1.2
 */
public class Rectangulo_JDA extends FiguraGeometrica_JDA {
	private double l1;
	private double l2;
	/**
	 * Asigna el valor de los lados a la variables
	 * @param tipoFigura define la figura geometrica
	 * @param lG valor del lado grande
	 * @param lP valor del lado pequeño
	 */
	public Rectangulo_JDA(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * Calcula el área del rectángulo 
	 * @return el area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	 * Calcula el perimetro del rectángulo
	 * @return el perimetro
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
