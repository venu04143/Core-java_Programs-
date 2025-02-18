package com.operators;

public class InstatnceofOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="VenuGopal";
		
		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);
		
		if(s instanceof String) {
			System.out.println("Hello :" + s);
		}
		
		Integer i = 20;
		
		System.out.println(i instanceof Integer);   // i is an object of Integer class 
		System.out.println(i instanceof Number);   // Integer parent class is Number class
		System.out.println(i instanceof Object);   // Number parent class is Object
		
		//System.out.println(i instanceof Double);
		 
		Float F= 34.5F;
		System.out.println(F instanceof Number);
		
		String name = "venu";
		
		System.out.println(name instanceof String);
		
		System.out.println(null instanceof String);
	}

}
