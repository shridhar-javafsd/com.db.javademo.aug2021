package com.db.javademo.aug2021.col;

import java.util.ArrayList;
import java.util.List;

import com.db.javademo.aug2021.Employee;

public class CollectionDemo2 {
	
	
	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
//		
//		list.add(10);
//		list.add(20);
//		list.add(15);
//		list.add(18);
//
//		System.out.println(list);
		
		Employee emp = new Employee();
		
		List myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(98);
		myList.add(96.5);
		myList.add("abc");
		myList.add(99);
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add(null);
		myList.add(emp);
		System.out.println(myList);
		System.out.println(myList.size());

	}

}
