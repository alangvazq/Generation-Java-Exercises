package org.generation;

public class Main {

	public static void main(String[] args) {
		Triangulo t = new Triangulo("TriánguloTE", 8, 6, 8, 10, 10);
		Cuadrado cuadrado = new Cuadrado("Cuadrado", 10);
		Rectangulo rectangulo = new Rectangulo("Rectángulo", 12, 8);
		Rombo rombo = new Rombo("Rombo", 8, 12, 9);
		Romboide romboide = new Romboide("Romboide", 10, 6);
		Trapecio trapecio = new Trapecio("Trapecio", 5, 7, 10, 6, 12, 8, 4);
		

		imprimirCalculo(t);
		imprimirCalculo(cuadrado);
		imprimirCalculo(rectangulo);
		imprimirCalculo(rombo);
		imprimirCalculo(romboide);
		imprimirCalculo(trapecio);

	}

	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+===============================");
		System.out.println("El área de [" + f.getNombre() + "] es : " + f.calcularArea());
		System.out.println("El perimétro de [" + f.getNombre() + "] es : " + f.calcularPerimetro());
		System.out.println("+===============================");
		System.out.println();
	}
}
