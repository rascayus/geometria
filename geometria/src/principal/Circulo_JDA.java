package principal;

public class Circulo_JDA extends FiguraGeometrica_JDA {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_JDA(double r, String tipoFigura) {
		super(tipoFigura);
		if (r >= 0) {
			radio = r;	
		}
		else {
			radio = Math.abs(r);
		}; 
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
