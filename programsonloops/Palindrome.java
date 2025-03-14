package com.programsonloops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number check palindrome or not :");
		int num = sc.nextInt();
		int temp = num;
		int rem=0;
		int rev=0;
		
		
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev) {
			System.out.println("the given number is palindrome");
		}
		else {
			System.out.println("the given number is not a palindrome");
		}

	}

}
