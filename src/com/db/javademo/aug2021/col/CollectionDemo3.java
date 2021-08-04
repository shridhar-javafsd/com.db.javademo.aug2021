package com.db.javademo.aug2021.col;

import java.util.ArrayList;
import java.util.List;

import com.db.javademo.aug2021.Customer;
import com.db.javademo.aug2021.Employee;

// typesafety 
// generics 

public class CollectionDemo3 {
	
	public static void main(String[] args) {
		
//		List marks = new ArrayList ();
		List<Integer> marks = new ArrayList<>();

		marks.add(96);
//		marks.add(97.5); // CE 
//		marks.add("abc"); // CE 

		System.out.println(marks);	
		
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee());
//		empList.add(new Customer());
//		empList.
		

	}
}