package com.programswithmethods;

import java.util.Scanner;

public class NionNumber {
	
	static boolean nion(int num) {
		int sum =0;
		int square=num*num;
		while(square!=-0) {
			int rem=square%10;
			sum+=rem;
			square/=10;
		}
		return num==sum;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber to check Nion Number or not : ");
		int num =sc.nextInt();
		boolean ans =nion(num);
		
		if(ans) {
			System.out.println("Given Number is a Nion Number");
		}
		else {
			System.out.println("Given Number is Not a Noin Number");
		}
		

	}

}
