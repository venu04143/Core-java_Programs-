package com.logicalstatementsassignments;

import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {    // Using if else if
		 Scanner sv =new Scanner(System.in);
		 
		 System.out.println("Enter a Year to Check Wether the Year Leap or Not !");
		 int year = sv.nextInt();
		 
		if(year % 4 == 0) {
			if(year % 100 !=0 ) {
				System.out.println(year +" is leap year");
			}
			else if(year % 400 ==0) {
				System.out.println(year +" is a leap year ");
			}
			else {
				System.out.println(year+" not a Leap Year");
			}
		}
		else {
			System.out.println(year +" not a leap year ");
		}

	}

}
