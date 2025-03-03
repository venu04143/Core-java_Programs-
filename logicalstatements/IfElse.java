package com.logicalstatements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter yuor Salary : ");
		double salary = sc.nextDouble();
		
		if(salary > 25000) {
			System.out.println("Thanks for your intrest ! \n Enter your age :");
			int age = sc.nextInt();
			if(age < 28) {
				System.out.println("We need more information.. \nDo You have Siblings..! ");
				
				boolean sibling = sc.nextBoolean();
				if(!sibling) {
					System.out.println("Your are Perfect to Match  We will go Further..");
				}
				else {
					System.out.println("We will Reach later..");
				}
			}
			else {
				
				System.out.println("You are too old...");
			}
			
		}
		else {
			System.out.println("Sorry");
		}
	}
	

}
