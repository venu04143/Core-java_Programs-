package com.programsonloops;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number Reverse :");
		
		int num = sc.nextInt();
		
		int rem=0;
		int reverse=0;
		
		while(num!=0) {
			rem=num%10;
			reverse = reverse*10+rem;
			num/=10;
		}
		System.out.println("the Reverse number of the given number is : "+reverse);

	}

}
