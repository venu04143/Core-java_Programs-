package com.operators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b =20;
		int c =5;  
		
		int maxsum=(a<b)?a:b;
		System.out.println(maxsum);
		
		
		int max = ( a > b )?( a > c ? a:c) : ( b > c ? b:c);
		
		System.out.println("Maximum among three integer values :"+max);
		
		String s1="Venu";
		String s2="Gopal";
		String s3="Venu Gopal";
		
		//String MaxString= "";
		
		String MaxString=(s1.length()>s2.length())?(s1.length()>s3.length()?s1:s3):(s2.length()>s3.length()?s2:s3);
		
		
		System.out.println("Maximun length String among three Strings :  "+ MaxString);
		
		double d1 = 20.5;
		double d2 = 25.3;
		double d3= 12.7;
		
		double d=(d1>d2)?(d1>d3?d1:d3):(d2>d3?d2:d3);
		System.out.println("Maximum among three double values : " + d);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value to check even or not  :");
	    
		int x=sc.nextInt();
		
		boolean True = (x % 2==0)?true:false;
		
		
		if(True) {
			System.out.println("Given Number "+ x + " is Even");
		}
		else {
			System.out.println("Given Number "+ x + " is Odd");
		}
		
		
		

	}

}
