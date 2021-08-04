package com.db.javademo.aug2021;

public class Employee {

	int id;
	String fName;
	double salary;

	public Employee() {

	}

	public Employee(int id, String fName, double salary) {
		super();
		this.id = id;
		this.fName = fName;
		this.salary = salary;
	}

	public void work() {
		System.out.println("Employee works...");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", salary=" + salary + "]";
	}

}
