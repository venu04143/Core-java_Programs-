package com.assignmentsonloops;

import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter a Number to Check Wether it is prime or not : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		boolean ans = isPrime(num); 

		if (ans) {
			System.out.println("Given number is a Prime Number :");
		} else {
			System.out.println("Given Number is Not a Prime Number :");
		}

	}

}
