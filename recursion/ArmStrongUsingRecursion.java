package com.recursion;

import java.util.Scanner;

public class ArmStrongUsingRecursion {

	static boolean isArmstrong(int num, int count, int sum, int copy) {

		if (num == 0) {
			return sum == copy;
		}
		int rem = num % 10;
		return isArmstrong(num /= 10, count, sum += Math.pow(rem, count), copy);
	}

	static int digits(int num, int count) {

		if (num == 0) {
			return count;
		}
		return digits(num /= 10, count += 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check Armstrong or Not : ");
		int num = sc.nextInt();
		boolean ans = isArmstrong(num, digits(num, 0), 0, num);
		if (ans) {
			System.out.println("ArmStrong Number ");
		} else {
			System.out.println("Not a ArmStrong Number :");
		}
	}

}
