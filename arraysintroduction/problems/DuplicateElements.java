package com.arraysintroduction.problems;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,3,2,1,3,5};

		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+ " ");
				}
			}
		}
			
	}

}
