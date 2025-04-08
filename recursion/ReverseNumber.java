package com.recursion;

import java.util.Scanner;

public class ReverseNumber {
	
	
	static int reverse(int num) {
		
		return reverse1(num,0);
	}

	private static int reverse1(int num, int rev) {   // helper method
		// TODO Auto-generated method stub
		if(num==0) {
			return rev;
		}
		int rem = num%10;
		return reverse1(num/=10,rev=rev*10+rem);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ans =reverse(165);
		System.out.println(ans);
		
		

	}

}
