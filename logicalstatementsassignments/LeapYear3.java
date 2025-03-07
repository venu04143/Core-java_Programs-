package com.logicalstatementsassignments;

import java.util.Scanner;

public class LeapYear3 {

	public static void main(String[] args) {    // Using Ternary Operator
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entr a year to check wether  a leap year or not ");
		
		int year = sc.nextInt();
		
		boolean leapYear = (year %400 == 0 || year % 4== 0 && year % 100 !=0) ?true:false;
		System.out.println( year + " is Leap year :"+ leapYear);

	}

}
