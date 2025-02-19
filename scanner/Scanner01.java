package com.scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age :");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter name :");
		String name = sc.nextLine();
		
		System.out.print("Enter a float value :");
		float f =sc.nextFloat();
		System.out.println(f);
		sc.nextLine();
		
		System.out.print("Enter name :");
		String Sname = sc.nextLine();
		
//		
//		
//		System.out.print("Enter a double value :");
//		double d =sc.nextDouble();
//		System.out.println(d);
//		
//		System.out.print("Enter a boolean value :");
//		boolean B =sc.nextBoolean();
//		System.out.println(B);
//		
//		System.out.print("Enter a byte value :");
//		byte b =sc.nextByte();
//		System.out.println(b);
//		
//		System.out.print("Enter a short value :");
//		short s =sc.nextShort();
//		System.out.println(s);
//		
//		System.out.print("Enter a long value :");
//		long l=sc.nextLong();
//		System.out.println(l);
//		
//		System.out.print("Enter a Character");
//		char c =sc.next().charAt(0);
//		System.out.println(c);
//		

		Scanner01 obj = new Scanner01();
		obj.getDetails(name,age);


	}
	
	void getDetails(String name,int age){
		
		System.out.println(name);
		System.out.println(age);
		
	}
    void getDetails(String name){
		
		System.out.println(name);
  }
	

}
