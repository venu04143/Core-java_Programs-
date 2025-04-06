package com.recursion;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		
		System.out.println("Before Bubble Sort.");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		bubbleSort(arr,0,0);
		
		System.out.println("After Bubble Sort.");
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}
	static void bubbleSort(int[] arr,int row,int col) {
		if(arr==null || arr.length==0) {
			return;
		}
		if(row == arr.length) {
			return;
		}
		if(row<arr.length) {
			int count=0;
			if(col<arr.length-1-row) {
				if(arr[col]>arr[col+1]) {
					int temp=arr[col];
					arr[col]=arr[col+1];
					arr[col+1]=temp;
					count++;
				}
			    bubbleSort(arr,row,col+1);
				
			}
			if(count==0) {
				return;
			}
			bubbleSort(arr,row+1,col);
			
		}
	}
	
	
}
