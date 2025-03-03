package com.logicalstatements;

import java.util.Scanner;

public class UpperOrLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Letter to Wether it is uppercase letter or lowercase :");
		char letter =sc.next().trim().charAt(0); 
		
		if(letter>='a' && letter<='z') {
			System.out.println("Given Letter is a LowerCase Latter.");
		}
		else if(letter>='A' && letter<='Z') {
			System.out.println("Given Letter is a UpperrCase Latter.");
		}else {
			System.out.println("Not Alphabets");
		}
			

	}

}
