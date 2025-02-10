package com.introduction;



public class TestDemo4 {

	public static void main(String[] args) {
		
		System.out.println("Main method Called !");
		
		

	}
	
	static void staticMethod() {
		System.out.println("Static Method called in static Block");
	}
	
	
	void instanceMethod() {
		System.out.println("Instance Method Called in static Block !");
	}
	
	
	static void staticMethod2() {
		System.out.println("static method called in instance block ");
	}
	
	void instanceMethod2() {
		System.out.println("intance method called in instance block ");
	}
	
	
	static {
		System.out.println("StaticBlock Called");
		staticMethod();
		TestDemo4 t=new TestDemo4();
		t.instanceMethod();
	}
	
	
	{
		System.out.println("Instance Block Called !");
		staticMethod2();
		instanceMethod2();
		
	}
	
	static {
		System.out.println("Hello");
	}
	
	

}
/*
 *1. We can call static methods in static block directly
 *2. we have to create an object inside the static block if we want call instance method, then instance block will execute if exist
 * --through object reference we can access instance methods in static block.
 *3.  instance blocks will execute once every time we create an object.if don't create any object instance blocks won't execute
 *4. We can call static methods and instance methods in instance block directly
 *5. The main method will execute after static block instance block execution if exists
 * */
