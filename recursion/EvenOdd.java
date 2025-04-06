package com.recursion;

public class EvenOdd {

	static void even(int[] num, int index) {
		if (index == num.length) {
			return;
		}
		if (num[index] % 2 == 0) {
			System.out.print(num[index] + " ");
		}
		even(num, index + 1);
	}

	static void odd(int[] num, int index) {
		if (index == num.length) {
			return;
		}
		if (num[index] % 2 != 0) {
			System.out.print(num[index] + " ");
		}
		odd(num, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		even(arr, 0);

		System.out.println();
		odd(arr, 0);
	}

}
