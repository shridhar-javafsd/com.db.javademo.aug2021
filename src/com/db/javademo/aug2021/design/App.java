package com.db.javademo.aug2021.design;

// singleton class 

class Star {

	private static Star star;

	private Star() {
		System.out.println("Star constructor");
	}

	public static Star getInstance() {
		if (star == null)
			star = new Star();
		return star;
	}
}

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		Star sun = Star.getInstance();
		Star sun2 = Star.getInstance();
		System.out.println(sun.hashCode());
		System.out.println(sun2.hashCode());
		System.out.println(sun.equals(sun2));

		System.out.println("End");

	}

}
