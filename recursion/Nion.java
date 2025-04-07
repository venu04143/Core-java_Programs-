package com.recursion;

import java.util.Scanner;

public class Nion {
	
	static boolean isNion(int num) {
		int square = num*num;
		int squareSum=squareSum(0,square);
		return squareSum==num;
	}
	static int squareSum(int sum,int num) {
		if(num==0) {
			return sum;
		}
		return squareSum(sum+=(num %10),num/=10);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente a NUmber to Check Nion or Not : ");
		int num =sc.nextInt();
		
		boolean ans =isNion(num);
       if(ans) {
    	   System.out.println("Number is Nion Number : "); 
    	}
	}

}
