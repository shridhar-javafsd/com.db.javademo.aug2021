package com.db.javademo.aug2021;

public class App3 {

	public static void main(String[] args) {
		Customer obj = new Customer();

//		Customer.cid = 101; 
		obj.cid = 101;
		System.out.println(obj.cid);

		Customer.branchPhone = 28765432; 
//		obj.branchPhone = 41414141;
		System.out.println(Customer.branchPhone);

	}

}
