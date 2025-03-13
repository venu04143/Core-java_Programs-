package com.assignmentsonloops;

import java.util.Scanner;

public class ReverseNumber {
	
	static int reverse(int num) {
		int reversed=0;
		while(num!=0) {
			int rem=num%10;
			reversed=reversed*10+rem;
			num/=10;
		}
		return reversed;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Reverse that number : ");
		int num=sc.nextInt();
		
		int ans =reverse(num);
		System.out.println("Reversed Number of given Number is :"+ ans);

	}

}
