package org.generation;

public class Rombo implements FiguraGeometrica{
	private String nombre;
	private double lado;
	private double Dmayor;
	private double Dmenor;
	public Rombo(String nombre, double lado, double dmayor, double dmenor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		Dmayor = dmayor;
		Dmenor = dmenor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getDmayor() {
		return Dmayor;
	}
	public void setDmayor(double dmayor) {
		Dmayor = dmayor;
	}
	public double getDmenor() {
		return Dmenor;
	}
	public void setDmenor(double dmenor) {
		Dmenor = dmenor;
	}
	@Override
	public double calcularArea() {
		return (Dmayor*Dmenor)/2;
	}
	@Override
	public double calcularPerimetro() {
		return 4*lado;
	}
	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", Dmayor=" + Dmayor + ", Dmenor=" + Dmenor + "]";
	}
	
	
	
}
