package com.logicalstatementsassignments;

import java.util.Scanner;

public class LeapYear2 {

	public static void main(String[] args) {   // Using Logical Operators
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Year to Check the Year Leap Year or Not... : ");
		
		int year = sc.nextInt();
		
		if( year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
			System.out.println(year + " is a leap year ");
		}else {
			System.out.println(year+ " is not a leap year ");
		}

	}

}
