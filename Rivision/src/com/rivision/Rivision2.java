package com.rivision;

public class Rivision2 {
	
	static {
		System.out.println("static block executed...");
		
	}
	
	{
		System.out.println("instance executed by creating an object ");
	}
	
    static Rivision2 r = new Rivision2();        // created an object and stored it in a static variable reference
	public static void main(String[] args) {
		
		System.out.println("main method started..");
		
		/* static blocks will execute first in program because of class initialization
		 * -> whenever the .class file loaded into memory ,static blocks will execute execute  because of class initialization
		 * -> before static blocks static variables execute
		 * -> if we have static blocks and static variables in our program  they execute orderly
		 * 
		 *  instance blocks will execute every time once when we created an object 
		 *  -> if we create n object that n time static blocks will execute
		 *  
		 *  */
		
	}

}
