package com.assignmentsonloops;

import java.util.Scanner;

public class PerfectNumber {
	
	static boolean isPerfect(int num) {
		int sum = 0;
		for(int i =1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum == num) {
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check wether it is perfect or not : ");
		
		int num = sc.nextInt();
		
		boolean ans = isPerfect(num);
		
		if(ans) {
			System.out.println("Given number is a Perfect Number :");
		}else {
			System.out.println("Given number is not a Perfect Number ");
		}

	}

}
