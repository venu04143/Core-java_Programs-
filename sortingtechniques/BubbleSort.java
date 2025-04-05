package com.sortingtechniques;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		
		System.out.println("Before Soring the Array : ");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting the Array : ");
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}

}
