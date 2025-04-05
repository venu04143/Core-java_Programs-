package com.sortingtechniques;

public class SelctionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,9,8,7,6,5};
		
		System.out.println("Array Before Applying SelctionSort. ");
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
		    int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}

		System.out.println("Array After Applying SelctionSort. ");
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

}
