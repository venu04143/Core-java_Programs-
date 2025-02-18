package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		System.out.println( true && true );
		System.out.println( true && false );
		System.out.println( false && true );
		System.out.println( false && false );
		
		System.out.println("**************");
		
		System.out.println( true || true );
		System.out.println( true || false );
		System.out.println( false || true );
		System.out.println( false || false );
		
		System.out.println("**************");
		
		System.out.println(!true);
		
		System.out.println(!false);
		
		int a = 10;
		int b=20;
		
		if(a<b && b>a) {
			
			System.out.println(" a value is less than b");
		}
		
		int p=5;
		int q=10;
		int r =15;
		
		int result= p++ + --q * r-- / ++p + q--;
		System.out.println(result);
		

	}

}
