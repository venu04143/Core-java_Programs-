package com.recursion;

import java.util.Scanner;

public class PerfectNumber {
	
	static boolean isPerfect(int num) {
		
		return factsum(num,1,0) == num;
	}
	private static int factsum(int num,int i,int factSum) {
		if(i>num/2) {
			return factSum;
		}
		if(num%i==0) {
			factSum+=i;
		}
		return factsum(num,i+1,factSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check Perfect or Not ");
		int num=sc.nextInt();
		
		boolean ans = isPerfect(num);
		
		if(ans) {
			System.out.println(num + " is a Perfect Number");
		}
		else {
			System.out.println(num + " not a Perfect Number");
		}

	}

}
