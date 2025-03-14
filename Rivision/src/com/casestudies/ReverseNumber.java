package com.casestudies;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Reverse : ");
		int num = sc.nextInt();
		int reverse=0;
		
		while(num!=0) {
			int rem = num%10;
			reverse = reverse*10+rem;
			num/=10;
		}
		
       System.out.println("The Reversed NUmber of a Given Number is : "+reverse);
       
       
       
	}
	
	

}
