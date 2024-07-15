package org.generation.classes;

public class Employee extends Person implements Pagable{
	private String department;
	private double salary;
	public Employee(String name, int age, String email, String rfc, String address, String department, double salary) {
		super(name, age, email, rfc, address);
		this.department = department;
		this.salary = salary;
	}
	
	public String calculateSalary(int days) {
		double total = 0;
		total = (this.salary*days)*1.16;
		return String.format("%.2f", total);
	}
	
	// Getters and Setters
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + ", getEmail()=" + getEmail()
				+ ", getAge()=" + getAge() + ", getName()=" + getName() + ", getRfc()=" + getRfc() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	
	
	
}
