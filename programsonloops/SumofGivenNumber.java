package com.programsonloops;

import java.util.Scanner;

public class SumofGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a  number to give their sum : ");
		
		int num= sc.nextInt();
		
		int rem=0;
		int sum=0;
		while(num!=0) {
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("The sum of all number in a given number is :"+ sum);

	}

}
