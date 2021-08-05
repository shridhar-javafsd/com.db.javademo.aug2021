package com.db.javademo.aug2021.spring;

class Employee {

	int id; // 4 bytes 
	String name; // >=  2 bytes 
	double salary; // 8 bytes 

}

public class App {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.id = 101;
		System.out.println(employee.id);

	}

}
