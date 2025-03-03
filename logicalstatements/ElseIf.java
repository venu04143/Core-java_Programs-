package com.logicalstatements;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Your Marks to Know Grade.");
		double marks = sc.nextDouble();
		
		if(marks>100 || marks <0) {
			System.out.println("Invalid Marks...");
		}
		else if(marks >=85) {
			System.out.println("You Secured Grade A.");
		}
		else if(marks >=70) {
			System.out.println("You Secured Grade B");
		}
		else if(marks >=60) {
			System.out.println("You Secured Grade C");
		}
		else if(marks>=35) {
			System.out.println("You Secured Grade D");
		}
		else {
			System.out.println("You Are Failed.");
		}
				
	}

}
