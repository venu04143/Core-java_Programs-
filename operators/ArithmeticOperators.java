package com.operators;

public class ArithmeticOperators {
	
	int a=200;
	int b=100;                      //instance data

	public static void main(String[] args) {
		
		ArithmeticOperators A = new ArithmeticOperators();      // if we want to access instance data in static area,
		                                                        // we have to create an object
		
		System.out.println("Additiion of a and b is :" +( A.a+A.b));  
		
		System.out.println("Subtraction of a and b :" + (A.a-A.b));
		
		System.out.println("Multiplication of a and b :" + A.a * A.b );
		
		System.out.println("Division of a and b :"+ A.a / A.b );
		
		System.out.println(("Modulo of a and b : "+ A.a % A.b));
		
		
		System.out.println("Venu" + "Gopal"); // we can add string and string  => Concatenation
		
		System.out.println("Venu"+120);     //it concatenate string with int 
		
		System.out.println("Venu"+10+20);  //in first concatenate venu and 10 as venu10 next concatenate venu10 and 20 as venu1020
		
		System.out.println( 20 +10 +"venu"); // it first adds the two value because two ints are in first and then it concatenate with string
		
		System.out.println(10 + "venu" +20);
		
		System.out.println("venu" + 10 + "gopal");
		
		//System.out.println( (A.a- A.b) -"venu");  we can't use the substract(-) with strings
		
		//System.out.println(("venu")*3);             ''
		
		//System.out.println("venu" * "venu");   we can't use the multiply * with strings
		
	}                                                  

}
