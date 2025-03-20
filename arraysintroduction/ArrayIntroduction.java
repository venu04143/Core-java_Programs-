package com.arraysintroduction;

public class ArrayIntroduction { 
	
	/*
	 * Array is an Object in Java.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr; // declaration

		arr = new int[5]; // creation new int[5] is the size of the array it can't allow more than
							// 5 values to store in this array

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // representing
		}
		System.out.println();
		
		

		// direct assignment

		int[] arr1 = { 10, 15, 20, 25, 30 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		
       
	}

}
