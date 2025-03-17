package com.programswithmethods;

import java.util.Scanner;

public class BinaryToDecimal {

	static int decimalOf(int binaryNum) {
		int sum = 0;
		int power = 0;
		while (binaryNum != 0) {
			int rem = binaryNum % 10;
			sum += rem * (powerof(2, power++));
			binaryNum /= 10;
		}
		return sum;
	}

	static int powerof(int base, int pow) {
		int result = 1;
		for (int i = 0; i < pow; i++) {
			result *= base;
		}
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary Number to Convert Decimal Number : ");
		int binaryNum = sc.nextInt();

		int decimal = decimalOf(binaryNum);
		System.out.println("The Given Binary Number Value in Decimal After Converting is : " + decimal);
	}

}
