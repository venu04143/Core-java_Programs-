package com.arraysintroduction.problems;

public class FindPeekElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,3,2};
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				System.out.println(arr[i]);
			}
		}
	}

}
