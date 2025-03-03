package com.logicalstatements;

import java.util.Scanner;

public class SimpleCalculator {
	
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter a Value");
		int a =sc.nextInt();
		
		System.out.println("Enter a Value");
		int b=sc.nextInt();
		
		System.out.println("Enter a Operator like + * / - % to perform operation :");
		 String operator=sc.next();
		
		 //char c =operator.charAt(0);
		 
		 int value=0;
		 
		 switch(operator) {
		 
		 case "+"-> value=a+b;
		 case "-" -> value=a-b;
		 case "*" -> value=a*b;
		 case "/" -> value=a/b;
		 case "%" -> value=a%b;
		 }
		 System.out.println(value);
	
//		 switch(operator) {
//		 case "+" :
//			 System.out.println(a+b);
//			 break;
//		 case "-" :
//			 System.out.println(a-b);
//			 break;
//		 case "*" :
//			 System.out.println(a*b);
//			 break;
//		 case "/" :
//			 System.out.println(a/b);
//			 break;
//		 case "%" :
//			 System.out.println(a%b);
//			 break;
//		 }
//			 
	}

}
