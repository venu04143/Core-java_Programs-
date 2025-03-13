package com.assignmentsonloops;

import java.util.Scanner;

public class StrongNumber {

	static boolean isStrong(int num) {
		int temp = num;
		int rem = 0;
		int factSum = 0;
		while (num != 0) {
			rem = num % 10;
			factSum += fact(rem);
			num /= 10;
		}
		return temp == factSum;
	}

	private static int fact(int rem) {
		if (rem == 0 || rem == 1) {
			return 1;
		}
		int factorial = 1;
		for (int i = rem; i > 1; i--) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check Wether it is Strong Number or not :");

		int num = sc.nextInt();

		boolean ans = isStrong(num);
		System.out.println(ans);
//
		if (ans) {
			System.out.println("Given Number is Strong Number :");
		} else {
			System.out.println("Given Number is Not a Strong Number :");
		}
		sc.close();

	}

}
