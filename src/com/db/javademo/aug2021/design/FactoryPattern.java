package com.db.javademo.aug2021.design;

interface Bank {
	public abstract void service();
}

class BankingFactory {

	public static Bank getInstance(String bankName) {

		if (bankName.equals("GG")) {
			return new Deutsche();
		} else if (bankName.equals("US")) {
			return new Citi();
		} else if (bankName.equals("IN")) {
			return new HDFC();
		} else {
			return null;
		}
	}
}

class Citi implements Bank {

	@Override
	public void service() {
		System.out.println("Welcome to Citi.");
	}
}

class Deutsche implements Bank {

	@Override
	public void service() {

		System.out.println("Welcome to Deutsche.");

	}
}

class HDFC implements Bank {

	@Override
	public void service() {
		System.out.println("Welcome to HDFC.");
	}
}

public class FactoryPattern {

	public static void main(String[] args) {

		Bank b1 = BankingFactory.getInstance("US");
		b1.service();

		Bank b2 = BankingFactory.getInstance("IN");
		b2.service();

		Bank b3 = BankingFactory.getInstance("GG");
		b3.service();
		
		
		Bank b4 = BankingFactory.getInstance("UK");
//		b4.service();// NPE 
				
		
		System.out.println("end");
	}
}
