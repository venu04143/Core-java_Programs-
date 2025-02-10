package com.fundamentals;

public class CmdAddition {

	public static void main(String[] args) {    // by default all the arguments that we passed will store in string format
		                                        // so we have to convert string format to integer format using Integer parseInt
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		System.out.println( a + b ); 

	}

}
