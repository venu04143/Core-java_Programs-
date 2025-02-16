package com.literals;

public class FloatingLiterals {

	public static void main(String[] args) {
	
		float f = 123;
		float f1 = 0123;
		
		float f3 = 0123f;
		
		float f4 = 0123.5f;
		
		float f5 = 0x123;
		
		//float f6 = 0x123.5f;   f is part of hexa so compiler confuse so it is an error
		
		float f7 = 0x123f;
		
		System.out.println("Float.............");
		
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f7);
		
		double d =35.5;
		double d1 = 35.5f;   // float convert to double (implicit casting)
		double d2 = 0123;
		double d3 = 0123d;
		double d4 = 0123.5D;
		double d5= 0x123;
		//double d6 = 0x123.5D;   // D or d is the part of hexa value so error 
        System.out.println("Double ............");
        
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
		
	}

}
