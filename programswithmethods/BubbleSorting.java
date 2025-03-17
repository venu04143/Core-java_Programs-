package com.programswithmethods;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,4,3,2,1};
	    bubble(arr);
	    System.out.println(Arrays.toString(arr));
	}
	static void bubble(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					count++;
				}
			}	
			if(count==0) {
				break;
			}
		}
	}

}
