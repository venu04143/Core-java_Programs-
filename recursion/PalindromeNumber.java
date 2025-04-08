package com.recursion;

import java.util.Scanner;

public class PalindromeNumber {
	
	static boolean isPalin(int num) {
		return palinHelper(0,num,num) == num;
	}
	private static int palinHelper(int reverse,int num,int copy) {
		if(num==0) {
			return reverse;
		}
		return palinHelper((reverse*10+(num%10)),num/10,copy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter a NUmber to Check Pakindrome or Not.");
	    
	    int num =sc.nextInt();

	    boolean ans = isPalin(num);

	    if(ans) {
	    	System.out.println(num+" is a Palindrome Number");
	    }
	    else {
	    	System.out.println(num+" is Not a Palindrome Number ");
	    }
	}

}
