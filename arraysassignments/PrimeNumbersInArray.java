package com.arraysassignments;

import java.util.Scanner;

/* Find the Prime Number in a Given Array*/

public class PrimeNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Array Size : ");
		int size =sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elemnts in Array : ");
		for(int i = 0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		primeNumbers(arr);
	}
	static void primeNumbers(int[] arr) {
		System.out.print("Prime numbers in a Given Array are : ");
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.print(arr[i]+" ");
			}
			
		}
	}
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	

}
