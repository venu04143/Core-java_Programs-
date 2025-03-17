package com.programswithmethods;

import java.util.Scanner;

public class DeciToBinary {

	static void binaryOf(int num) {
		if (num == 0) {
			System.out.println(num);
		}
		int[] arr = new int[100];
		int i = 0;
		while (num != 0) {
			int rem = num % 2;
			arr[i] = rem;
			i++;
			num /= 2;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to represent that BinaryNumber : ");
		int num = sc.nextInt();
		System.out.print("Binary Number of " + num + " is : ");
		binaryOf(num);
	}

}
