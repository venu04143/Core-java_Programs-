package com.rivision;

public class Rivision3 {

	void method1() {
		System.out.println("instance method...");      // instance methods belong to instance or object of a class
		method3();                                    // in instance methods we can access instance ,static variables and methods directly
	}
	void method2() {
		System.out.println("instance method...");
	}
	static void method3() {
		System.out.println("Static method...");       // static methods belongs to class it self rather than any instance of specific class
	}
	static void method4() {
		System.out.println("Static method..."); // in static blocks we can access static variable and methods directly but we can't access instance variables and instance method directly
		method3();
	}
	public static void main(String[] args) {
                                                              // instance methods and static methods will be created based on they belong to class or an instance
   method3();
   method4();
   
   Rivision3 r =new Rivision3();
   
		r.method1();
		r.method2();

	}

}
