package com.db.javademo.aug2021.col;

public class CollectionDemo1 {

	public static void main(String[] args) {

		int[] marks = { 96, 98, 95, 99, 97 };

		for (int mark : marks)
			System.out.println(mark);
		
		System.out.println("Subject 3: " + marks[2]);
		
		marks[2] = 100;
		
		System.out.println("Subject 3: " + marks[2]);
		
//		marks[2] = "abc"; // CE 

		System.out.println(marks.length);
		
		// 
	}

}


