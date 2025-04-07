package com.recursion;

public class MinMaxUsingRecursion {

	static int findMin(int[] arr, int i, int min) {

		if (i >= arr.length) {
			return min;
		}
		min = (arr[i] < min) ? arr[i] : min;
		return findMin(arr, i + 1, min);
	}

	static int findMax(int[] arr, int i, int max) {
		if (i >= arr.length) {
			return max;
		}
		max = (arr[i] > max) ? arr[i] : max;
		return findMax(arr, i + 1, max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 6, 5, 4, -10, 3, 2, 99, 1 };

		int min = arr[0];
		int max = arr[0];

		int ans1 = findMin(arr, 1, min);
		int ans2 = findMax(arr, 1, max);

		System.out.println("The Minimum Value in a Given Array is : " + ans1);
		System.out.println("The Maximum Value in a Given Array is : " + ans2);

	}

}
