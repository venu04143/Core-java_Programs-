package com.programswithmethods;

import java.util.Scanner;

public class SpyNumber {
	
	private static boolean spy(int num) {
		// TODO Auto-generated method stub
		int sum =sumofNum(num);
		int product = productofNum(num);
		return sum==product;
	}


	static int productofNum(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(num!=0) {
			int rem= num%10;
			sum+=rem;
			num/=10;
		}
		return sum;
	}

	static int sumofNum(int num) {
		// TODO Auto-generated method stub
		int product = 1;
		while(num!=0) {
			int rem =num%10;
			product*=rem;
			num/=10;	
		}
			
		return product;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber to check Nion Number or not : ");
		int num =sc.nextInt();
		boolean ans =spy(num);
		
		if(ans) {
			System.out.println("Given Number is a Spy Number");
		}
		else {
			System.out.println("Given Number is Not a Spy Number");
		}

	}

	
}
