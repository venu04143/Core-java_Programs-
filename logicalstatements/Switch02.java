package com.logicalstatements;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a month to check Quater1 year or Quater2 year ");
		String month = sc.next();
		
		switch(month) {
		case "January":
		case "Feb":
		case "March":
		case "April":
		case "May":
		case "June":
			System.out.println("Q1 year");
			break;
		case "July":
		case "August":
		case "September":
		case "Octomber":
		case "November":
		case "December":
			System.out.println("Q2 year");
		    break;
		default:
			System.out.println("Not a Valid Month");
		}
		

	}

}
