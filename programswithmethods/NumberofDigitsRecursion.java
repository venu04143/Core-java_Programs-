package com.programswithmethods;

import java.util.Scanner;

public class NumberofDigitsRecursion {

	static int digits(int num, int count) {

		if (num == 0) {
			return count;
		}
		return digits(num /= 10, count += 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to count the Digits : ");

		int n = sc.nextInt();

		int num = (n == 0) ? 1 : digits(n, 0);

		System.out.println("Number of Digits in a given Number is : " + num);
	}

}
