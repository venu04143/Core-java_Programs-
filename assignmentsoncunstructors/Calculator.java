package com.assignmentsoncunstructors;

public class Calculator {
	
	int a;
	int b;
	
	Calculator(int a ,int b){
		this.a=a;
		this.b=b;
	}
	

	public static void main(String[] args) {
		
		Calculator cal = new Calculator(20,10);
		cal.add();
		cal.substract();
		cal.multiply();
		cal.divide();

	}
	
   void add() {
	   System.out.println("Addition of two numbers : "+(a+b));
   }
   void substract() {
	   System.out.println("Subtraction of Two numbers : "+(a-b));
   }
   void multiply() {
	   System.out.println("Multiplication of Two numbers : "+a*b);
   }
   void divide() {
	   System.out.println("Division of Two numbers : "+a/b);
   }
}
