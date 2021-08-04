package com.db.javademo.aug2021;

public class App2 {

	static int add(int a, int b) {
		return a + b + 5;
	}

	public static void main(String[] args) {

		// store any integer upto 2.14 bn - use int
		// beyond that - use long
//		store any floating point number - use double 
//		store any character, character string - use String 

		System.out.println("Hello world!");

//		String name = "Vaman";
//		System.out.println(name);
//
//		int num1 = 10, num2 = 20;
//
//		int num3 = add(num1, num2);
//		System.out.println(num3);

		Employee employee = new Employee();
		employee.id = 101;
		employee.fName = "Sonu";
		employee.salary = 10.5;
		System.out.println(employee.toString());
		employee.work();

		Employee employee2 = new Employee();
		employee2.id = 102;
		employee2.fName = "Monu";
		employee2.salary = 20.5;
		System.out.println(employee2.toString());
		employee2.work();

		Employee employee3 = new Employee(103, "Tonu", 15.5);
		System.out.println(employee3.toString());
		employee3.work();

		Employee employee4 = new Employee(104, "Gonu");
		System.out.println(employee4.toString());
		employee4.work();
	}

}
