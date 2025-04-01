package com.arraysassignments;

import java.util.Arrays;

public class ReverseTheArray {
	
	static void reverse(int arr[]) {
		int start =0;
		int end = arr.length-1;
		
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}

	static void swap(int[] arr,int first,int second) {	
	  int temp =arr[first];
	  arr[first]=arr[second];
	  arr[second]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}

}
