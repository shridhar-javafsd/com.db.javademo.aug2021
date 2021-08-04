package com.db.javademo.aug2021;

public class Employee {

	// fields
	public int id;
	public String fName;
	public double salary;
//	double salary = 0.5;

	// constructors
	public Employee() {
		super();
	}

	public Employee(int id, String fName) {
		super();
		this.id = id;
		this.fName = fName;
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
