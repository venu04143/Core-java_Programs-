package com.arraysassignments;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of an Array : ");
		int size =sc.nextInt();
		int[] arr= new int[size];
		
		int i=0;
		for(int num : arr) {
			System.out.print("Enter "+i+" index value of an Array :");
			num=sc.nextInt();
			arr[i]=num;
			i++;
		}
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}

}
