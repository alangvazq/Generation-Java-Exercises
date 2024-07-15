package org.generation;

public class Triangulo implements FiguraGeometrica {
	private String nombre;
	private double base;
	private double altura;
	private double lado01;
	private double lado02;
	private double lado03;

	public Triangulo(String nombre, double base, double altura, double ladoA, double ladoB, double ladoC) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado01 = ladoA;
		this.lado02 = ladoB;
		this.lado03 = ladoC;
	}

	public double calcularArea() {
		return (base*altura)/2;
	}
	
	public double calcularPerimetro() {
		return (lado01+lado02+lado03);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLado01() {
		return lado01;
	}

	public void setLado01(double lado01) {
		this.lado01 = lado01;
	}

	public double getLado02() {
		return lado02;
	}

	public void setLado02(double lado02) {
		this.lado02 = lado02;
	}

	public double getLado03() {
		return lado03;
	}

	public void setLado03(double lado03) {
		this.lado03 = lado03;
	}

	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado01=" + lado01
				+ ", lado02=" + lado02 + ", lado03=" + lado03 + "]";
	}


}
