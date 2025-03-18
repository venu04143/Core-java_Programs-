package com.programswithmethods;

import java.util.Scanner;

public class SumofTwoPrimeNumbers {

	static boolean isPrime(int num) {

		boolean ans = true;
		if (num <= 1) {
			ans = false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				ans = false;
			}
		}
		return ans;
	}

	static int firstPrime() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a first Prime Number :  ");
		int num1 = in.nextInt();
		if (isPrime(num1)) {
			return num1;
		} else {
			System.out.println("Given Number is Not a Prime Number please Enter a first Prime Number again :");
			firstPrime();
		}
		return 0;

	}

	static int secondPrime() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a second Prime Number :  ");
		int num2 = in.nextInt();
		if (isPrime(num2)) {
			return num2;
		} else {
			System.out.println("Given Number is Not a Prime Number please Enter a second  Prime Number again :");
			secondPrime();
		}
		return 0;
	}

//	static boolean primeSum() {
//		int num1 = firstPrime();
//		int num2 = secondPrime();
//		int num3 = num1 + num2;
//		return isPrime(num3);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean ans = primeSum();
		int num1 = firstPrime();
		int num2 = secondPrime();
		int num3 = num1+num2;
		
		if (isPrime(num3)) {
			System.out.println("After adding two Given prime Number producing a Prime Number : "+num3);
		} else {
			System.out.println("Not a Prime Number after adding two prime Numbers : ");
		}

	}
}
