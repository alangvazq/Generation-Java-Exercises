package org.generation;

import org.generation.classes.Consultor;
import org.generation.classes.Employee;
import org.generation.classes.Person;
import org.generation.exceptions.EmailFormatException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee andrea = new Employee("Andrea Ortiz", 20, "A@GMAIL.com", "XAXX123456", "Dirección 01", "TI", 650.5);
		Employee arturo = new Employee("Arturo Perez", 30, "AR@GMAIL.com", "XAXX452216", "Dirección 02", "DEV", 350.5);
		//Person braulio = new Person("Braulio Sanchez", 40, "B@GMAIL.com", "XAXX784512", "Dirección 03", "DATA", 990.5);

		
		// Modificador de acceso publico
		//System.out.println(andrea.name);
		System.out.println(andrea.getName());

		//Person arturo = new Person("Arturo Solares");

		System.out.println(andrea.toString());

		// arturo.age = 50;
		arturo.setAge(50);

		try {
			arturo.setEmail("asdf@gmail.com");
		}catch (EmailFormatException e){
			System.out.println(e.getMessage()); 
		}

		System.out.println(arturo);
		System.out.println(andrea.getSalary());
		
		System.out.println(Person.getTotal()+" personas en total.");
		
		Consultor dania = new Consultor("Dania SA de CV", "XAXX000000", 850);
		
		PayRoll.printReceipt(arturo);
		PayRoll.printReceipt(andrea);
		PayRoll.printReceipt(dania);
	}

}
