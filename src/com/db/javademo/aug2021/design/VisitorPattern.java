package com.db.javademo.aug2021.design;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.db.javademo.aug2021.Employee;

interface Visitable {
	void accept(Visitor visitor);
}

interface Visitor {

	void playGame(Cricket obj);

	void playGame(Hockey obj);

	void playGame(Football obj);
}

class GamePlayer implements Visitor {

	@Override
	public void playGame(Cricket obj) {
		System.out.println("Playing cricket...");
	}

	@Override
	public void playGame(Hockey obj) {
		System.out.println("Playing hockey...");
	}

	@Override
	public void playGame(Football obj) {
		System.out.println("Playing football...");
	}

}

abstract class Game {

	int score;

	public Game() {

	}

	public void getScore() {
		// code
	}

}

class Cricket extends Game implements Visitable {

	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}
}

class Hockey extends Game implements Visitable {

	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}
}

class Football extends Game implements Visitable {

	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}
}

public class VisitorPattern {

	public static void main(String args[]) {

		// Substitutable (SOLID)
		List<Employee> empList = new ArrayList<>();
		empList = new LinkedList<>();
		System.out.println(empList);

		ArrayList<Employee> empList2 = new ArrayList<>();
//		empList2 = new LinkedList<>(); // CE 
		System.out.println(empList2);


		
		
		//		Visitor visitor = new GamePlayer();
//		Visitable v1 = new Cricket();
//		v1.accept(visitor);
//		Visitable v2 = new Hockey();
//		v2.accept(visitor);
//		Visitable v3 = new Football();
//		v3.accept(visitor);
	}
}
