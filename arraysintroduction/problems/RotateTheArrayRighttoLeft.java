package com.arraysintroduction.problems;

import java.util.Arrays;
import java.util.Scanner;

public class RotateTheArrayRighttoLeft {

	public static void main(String[] args) {  // right to left
		// TODO Auto-generated method stub
 
		Scanner sc =new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6,7};    // 7 6 5 4 3 2 1
		
		System.out.println("Enter How Many Time Do You Want To Raotate The Array Right to Left : ");
		int rotate=sc.nextInt() % arr.length;  // to reduce rotations when Number of rotation is greater than array length
		
		System.out.println("Before Rotating The Array is : ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		rotateArray(arr,rotate);
		System.out.println("After Rotating "+rotate+" Times The Array is : ");
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void rotateArray(int[] arr,int rotate) {
		int len=arr.length;
		reverse(arr,0,len-1);
		reverse(arr,0,rotate-1);
		reverse(arr,rotate,len-1);
		
	}
	
	
	static void reverse(int[] arr,int start,int end) {
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
