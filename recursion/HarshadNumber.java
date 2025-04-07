package com.recursion;

import java.util.Scanner;

public class HarshadNumber {

	static boolean isNiven(int num, int sum, int copy) {
		if (num == 0) {
			return sum !=0 && copy % sum == 0;
		}
		int rem = num % 10;
		return isNiven(num /= 10, sum + rem, copy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check Niven (harshad) or Not : ");

		int num = sc.nextInt();

		boolean ans = isNiven(num, 0, num);
		if (ans) {
			System.out.println("Given Number is a Niven (harshad) Number ");
		} else {
			System.err.println("Given Number is Not a Niven Number ");
		}
		sc.close();
	}

}
