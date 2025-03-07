package com.logicalstatementsassignments;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To tell wether you are a teenager or child or something.. : ");
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		
		
		if(age<0) {
			System.out.println("You are in Liquid Form");
		}
		else if(age<=5) {
			System.out.println("You are a Child");
		}
		else if(age>5 && age<14) {
			System.out.println("You are a Kid");
		}
		else if(age>=14 && age <=20 ) {
			System.out.println("You are a Teenager.");
		}
		else if(age>20 && age<=35) {
			System.out.println("You are  Yunger");
		}
		else if(age>35 && age<=50) {
			System.out.println("Your are Mature");
			
		}
		else {
			System.out.println("You are  old : ");
		}

	}

}
