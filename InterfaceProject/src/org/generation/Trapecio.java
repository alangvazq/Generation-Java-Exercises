package org.generation;

public class Trapecio implements FiguraGeometrica{
	private String nombre;
	private double lado01;
	private double lado02;
	private double lado03;
	private double lado04;
	private double baseMayor;
	private double baseMenor;
	private double altura;
	public Trapecio(String nombre, double lado01, double lado02, double lado03, double lado04, double baseMayor,
			double baseMenor, double altura) {
		super();
		this.nombre = nombre;
		this.lado01 = lado01;
		this.lado02 = lado02;
		this.lado03 = lado03;
		this.lado04 = lado04;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public double getLado04() {
		return lado04;
	}
	public void setLado04(double lado04) {
		this.lado04 = lado04;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		return (altura*(baseMayor+baseMenor))/2;
	}
	@Override
	public double calcularPerimetro() {
		return lado01+lado02+lado03+lado04;
	}
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", lado01=" + lado01 + ", lado02=" + lado02 + ", lado03=" + lado03
				+ ", lado04=" + lado04 + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura=" + altura
				+ "]";
	}
	
	
}
