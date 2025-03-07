package com.logicalstatementsassignments;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("Thank you for Coming to the Interview ! Could you please Enter your some details ..  ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		if(name.length()>5) {
			System.out.println("Enter yor Qualified Specification :");
			
			String stream = sc.nextLine();
			if(stream.equals("CSE") || stream.equals("ECE") || stream.equals("IT") ) {
				System.out.println("Enter your Passed out year.. :");
				int year = sc.nextInt();
				if(year == 2023 || year == 2024 || year == 2025) {
					System.out.println("Enter your percentage  :");
					double percentage = sc.nextDouble();
					if(percentage >=75) {
						System.out.println("Your are Eligible for further Interview...");
					}
					else {
						System.out.println("Sorry your percentage does not eligible for requirement ");
					}
				}
				else {
					System.out.println("Passed of year not eligible..");
				}
			}
			else {
				System.out.println("Sorry your branch not Eligble..");
			}
		}
		else {
			System.out.println("Sorry your name is Invalid");
		}
		
	}

}
