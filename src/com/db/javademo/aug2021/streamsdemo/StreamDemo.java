package com.db.javademo.aug2021.streamsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.db.javademo.aug2021.Employee;

public class StreamDemo {

	public static void main(String[] args) {

		// create a List of employees
		List<Employee> empList = new ArrayList<Employee>();

		// create employees' data to process
		empList.add(new Employee(101, "Vaman", 10000));
		empList.add(new Employee(102, "Raman", 18000));
		empList.add(new Employee(103, "Soman", 12000));
		empList.add(new Employee(104, "Suman", 15000));
		empList.add(new Employee(105, "Lakshman", 20000));

		// print the list
		System.out.println(empList);

//       	// iterate using Iterator
//       	System.out.println("\nIterate using Iterator");
//       	Iterator<Employee> empIt = empList.iterator();
//       	while (empIt.hasNext())
//            	System.out.println(empIt.next().toString());
// 
//       	// Iterate using forEach() with anonymous inner class
//       	System.out.println("\nIterate using forEach() with anonymous inner class ");
//       	empList.forEach(new Consumer<Employee>() {
//            	public void accept(Employee emp) {
//                 	System.out.println(emp.toString());
//            	}
//       	});
// 
//       	// using forEach() with lambda expression
//       	System.out.println("\nIterate using forEach() with lambda expression");
//       	empList.forEach(emp -> System.out.println(emp.toString()));

		// convert List to Stream
		System.out.println("\nconvert List to Stream");
		Stream<Employee> empStream = empList.stream();

		// using filter() to get specified data
		System.out.println("\nUsing filter() to get specified data ");

		Stream<Employee> empWithMoreSal = empList.stream();
		empWithMoreSal.filter(e ->   e.salary > 14000 )
		.forEach( e2 -> System.out.println(e2.toString())); 
				
		
//				.filter(emp -> emp.salary > 15000);
//		empWithMoreSal.forEach(emp -> System.out.println(emp.toString()));



	}
}
