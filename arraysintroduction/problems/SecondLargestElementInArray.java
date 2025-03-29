package com.arraysintroduction.problems;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,6,4,29,13,5,8};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(secondLargest);

	}

}
