package org.generation.classes;

public class Consultor implements Pagable {
	private String razonSocial;
	private String RFC;
	private double costoHora;

	public Consultor(String razonSocial, String rFC, double costoHora) {
		super();
		this.razonSocial = razonSocial;
		RFC = rFC;
		this.costoHora = costoHora;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public double getCostoHora() {
		return costoHora;
	}

	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}

	@Override
	public String toString() {
		return "Consultor [razonSocial=" + razonSocial + ", RFC=" + RFC + ", costoHora=" + costoHora + "]";
	}

	@Override
	public String getName() {
		return getRazonSocial();
	}

	@Override
	public String getRfc() {
		return getRFC();
	}

	@Override
	public String getDepartment() {
		return "Consultor Externo";
	}

	@Override
	public String calculateSalary(int days) {
		return String.format("%.2f", (this.costoHora * 8) * days * 1.16);
	}

	@Override
	public int getId() {
		return 10000;
	}

}// class Consultor
