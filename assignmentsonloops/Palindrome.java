package com.assignmentsonloops;

import java.util.Scanner;

public class Palindrome {
    
	
	static boolean isPalindrome(int num) {
		
		int temp=num;
		int rev=0;
		int rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp == rev) {
			return true;
		}
     return false;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a NUmber to check palindrome or not :");
		int num =sc.nextInt();
		boolean ans = isPalindrome(num);
		
		if(ans) {
			System.out.println("the given number is a Palindrome");
		}else
		{
			System.out.println("given number not a palindrome");
		}
		

	}

}
