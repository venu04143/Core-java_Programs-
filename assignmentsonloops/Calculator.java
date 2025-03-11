package com.assignmentsonloops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String YorN="";
       do {
		System.out.println("Enter first  Number ");
		int num1 = sc.nextInt();
		System.out.println("Enter an operator to perform opreration :");
		String op =sc.next();
		System.out.println("Enter second Number :");
		int num2 =sc.nextInt();
		
		if(op.charAt(0)=='+') {
			System.out.println("Result : "+(num1+num2));
		}
		else if(op.charAt(0)=='-') {
			System.out.println("Result : "+(num1-num2));
		}
		else if(op.charAt(0)=='*') {
			System.out.println("Result : "+(num1*num2));
		}
		else if(op.charAt(0)=='/') {
			System.out.println("Result : "+(num1/num2));
		}
		else if(op.charAt(0)=='%') {
			System.out.println("Result : "+(num1%num2));
		}
		 System.out.print("Do you want to continue? (Y/N): ");
         YorN = sc.next();
     } while (YorN.equalsIgnoreCase("Y"));
	}

}
