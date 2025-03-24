package com.arraysintroduction.problems;

import java.util.Arrays;

public class EvenIndexedPositionsContainLargerNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] copy = new int[arr.length];

		int left = 0;
		int right = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				copy[i] = arr[right--];
			} else {
				copy[i] = arr[left++];
			}
		}
		System.out.println(Arrays.toString(copy));
	}

}
