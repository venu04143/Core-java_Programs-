package com.programswithmethods;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,5,3,1};
		
		sort(arr);
		for(int num : arr) {
			System.out.print(num+ " ");
		}
 
	}
	static void sort(int[] arr) {
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
	}

}
