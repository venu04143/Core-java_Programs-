package com.arraysintroduction;

public class MakeEvenSqaure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7};            // ans {1,4,3,16,5,36,7};
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr[i]=arr[i]*arr[i];
			}
		}
		for(int num:arr) {
			System.out.print(num + " ");
		}

	}

}
