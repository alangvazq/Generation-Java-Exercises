package org.generation;

public class Romboide implements FiguraGeometrica{
	private String nombre;
	private double base;
	private double altura;
	public Romboide(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
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
	@Override
	public double calcularArea() {
		return base*altura;
	}
	@Override
	public double calcularPerimetro() {
		return 2*base+2*altura;
	}
	@Override
	public String toString() {
		return "Romboide [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	}

	
}
