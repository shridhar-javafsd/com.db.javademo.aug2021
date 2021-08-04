package com.db.javademo.aug2021.fun;

// to use abstract method from an interface - 

// 1. implement the interface 
//public class App implements MyInterface {
//
//	public static void main(String[] args) {
//		App app = new App();
//		app.absMethod();
//	}
//
//	@Override
//	public void absMethod() {
//		System.out.println("absMethod implemented");
//	}
//}

// 2. create anonymous inner class  
//public class App {
//
//	public static void main(String[] args) {
//
//		MyInterface obj = new MyInterface() {
//			@Override
//			public void absMethod() {
//				System.out.println("absMethod implemented");
//			}
//			@Override
//			public void absMethod2() {
//				System.out.println("absMethod2 implemented");
//			}
//		};
//		obj.absMethod();
//		obj.absMethod2();
//	}
//}

// 3. use lambda expression (only for functional interface) 

public class App {
	public static void main(String[] args) {
		
		FunInterface obj = () -> {
			System.out.println("funMethod implemented");
		};
		
		obj.funMethod();

		
	}
	
}




