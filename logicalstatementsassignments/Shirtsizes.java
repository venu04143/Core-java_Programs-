package com.logicalstatementsassignments;

import java.util.Scanner;

public class Shirtsizes {

	public static void main(String[] args) {
		System.out.println("main method started..");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Shirt Numeric Size :");
		int size= sc.nextInt();
		
		switch(size) {
		case 34 ->System.out.println("Your Shirt Size is : XS");
		case 36 ->System.out.println("Your Shirt Size is : S");
		case 38,39,40 ->System.out.println("Your Shirt Size is : M");
		case 42,43,44 ->System.out.println("Your Shirt Size is : L");
		case 46,47,48 ->System.out.println("Your Shirt Size is : XL");
		case 50,51,52 ->System.out.println("Your Shirt Size is : XXL");
		case 54,55,56 ->System.out.println("Your Shirt Size is : XXXL");
		default-> System.out.println("Invalid Size");
			
		
		}

	}

}
