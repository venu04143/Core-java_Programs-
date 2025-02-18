package com.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		System.out.println( " &  operator .........");
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		System.out.println("*************");
		
        System.out.println( " |  operator .........");
		
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		System.out.println("*************");
		
System.out.println( " ^  operator .........");
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("*************");
		
		
		System.out.println(20 & 7);
		
		System.out.println(20 | 7);
		
		System.out.println(20 ^ 7);
		
		
		System.out.println(20>>4);
		
		System.out.println(20<<3);
		
		System.out.println(20>>>4);   // >>> it works for right shift operation too  ( >> and >>> do same)
		
	//  System.out.println(20<<<1);    <<< won't work for left shift operation ( << for left shift operation)
		
		int a=15;
		System.out.println(a^=(a>>1));
		String name = "venu";
		String name1 = "gopal";
		System.out.println(name+name1);

	}

}
