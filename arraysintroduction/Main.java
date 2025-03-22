package com.arraysintroduction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,1,0,1,0};
		for(int i=1;i<arr.length;i++) {
			arr[i] = arr[arr[i]+arr[i-1]];
		}
		for(int num : arr) {
			System.out.print(num);
		}
		System.out.println();
		
		
		
	}

}
