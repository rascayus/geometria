package test;

import principal.*;


import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value = Parameterized.class)

public class TestCirculo {
	@Parameters 
	public static Iterable<Object[]> cantidades() {
		    return Arrays.asList(new Object[][] {
		    	{43.9824, 153.9384, 7}, { 0, 0, 0}, {18.8496, 28.2744, -3}
		    });
		  }
	 	private double perimetro, area, radio;
	 	
		public TestCirculo(double perimetro, double area, double radio) {
			  this.perimetro = perimetro;
			  this.area = area;
			  this.radio= radio;
		}
	 	 	 
	
		@Test
		public void testArea() {
			double resultado = 0;
			Circulo_JDA circulo = new Circulo_JDA(radio,"Circulo");
			resultado = circulo.area();
			assertEquals(area,resultado,0);
		}

		@Test
		public void testPerimetro() {
			double resultado = 0;
			Circulo_JDA circulo = new Circulo_JDA(radio,"Circulo");
			resultado = circulo.perimetro();
			assertEquals(perimetro,resultado,0);
		}
}

