package com.logicalstatementsassignments;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
			
		
		System.out.println("Enter your salary :");
		double sal=sc.nextDouble();
		System.out.println("Enter your assests");
		double assest  = sc.nextDouble();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("do you have siblings");
		boolean sib=sc.nextBoolean();
		
		if(sal>25000 && assest >100000 && age<28 && !sib) {
			System.out.println("You are perfect to match ! We will go further...");
		}
		else {
			System.out.println("pora pukaa");
		}

	}

}
