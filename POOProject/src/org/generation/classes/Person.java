package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Clse abstracta Person que define a una Persona
 * No puede 
 * */

import org.generation.exceptions.EmailFormatException;

public abstract class Person {
	private String name;
	private int age;
	private String email;
	private String rfc;
	private String address;
	private int id;
	private static int total = 0;
	/**
	 * Constructor para instanciar una persona(No se puede directo en la clase heredada)
	 * @param name Nombre de la persona
	 * @param age Edad de la persona
	 * @param email Correo elecronico de la Persona
	 * @param rfc Registro Federal de Contribuyentes de la persona
	 * @param address Dirección de la persona
	 */

	public Person(String name, int age, String email, String rfc, String address) {
		this.name = name.toUpperCase();
		this.age = (age < 18) ? 18 : age;
		this.email = email.toLowerCase();
		this.rfc = rfc;
		this.address = address;
		Person.total++;
		this.id = Person.total;
	}

	public Person(String name, int age, String email) {
		this(name, age, email, "XAXX000000", "Sin domicilio");
	}

	public Person(String name) {
		this(name, 0, "sincorreo@correo.com");
	}
	
	public static int getTotal() {
		return total;
	}

	public String getEmail() {
		return this.email.toLowerCase();
	}

	public void setEmail(String email) throws EmailFormatException {
		this.email = "Sin correo";
		Pattern regex = Pattern.compile(
				"(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
		Matcher m = regex.matcher(email);
		if (m.matches()) {
			this.email = email;
		} else {
			throw new EmailFormatException(email + " No es un formato de Email correcto");
		}
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = (age < 18) ? 18 : age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ ", id=" + id + "]";
	}
}
