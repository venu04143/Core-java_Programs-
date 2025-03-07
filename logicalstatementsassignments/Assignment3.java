package com.logicalstatementsassignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("Largest Number : "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest Number : "+b);
		}
		else if(c>a && c>a) {
			System.out.println("Largest Number : "+c);
		}
		else {
			System.out.println("They may have all Equal :");
		}
		
		if(a>=(b+c) || b>=(a+c) || c>=(a+b)) {
			
			System.out.println("Yes, the numbers can form a valid traingle");
		}
	 	else {
			System.out.println("No, the numbers can not form a valid traingle");
		}
		
		System.out.println("Enter a number to check even & positive : " );
		
		int num=sc.nextInt();
		if(num>0 && num%2==0) {
			System.out.println("Valid Number");
		}else {
			System.out.println("Not a Valid Number ");
		}
		
		System.out.println("Enter a year to check Leap year or not :");
		
		int year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("Yes, it's a leap year.");
		}
		else {
			System.out.println("No, it's not a leap year.");
		}

	}

}
