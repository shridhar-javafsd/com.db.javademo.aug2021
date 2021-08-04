package com.db.javademo.aug2021;

class ClassThree {
	int num;

}

class ClassTwo {
	int num3;

}

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

		String name = "Vaman";
		System.out.println(name);

		int num1 = 10, num2 = 20;

		int num3 = add(num1, num2);
		System.out.println(num3);

	}

}
