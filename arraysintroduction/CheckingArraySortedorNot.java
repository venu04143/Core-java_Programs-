package com.arraysintroduction;

public class CheckingArraySortedorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,1,2,2,2,1};
		
		
		
		for (int i=0;i+1<arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("Array is Not sorted");
			}
		}
		
		
//		
//		for(int i = 0,j=arr.length-1;i<j;i++,j--) {
//			if(arr[i]>arr[j]) {
//				System.out.println("Array is Not Sorted.");
//				break;
//			}
//		}
//		int i=0;
//		int j=arr.length-1;
//		while(i<j) {
//			if(arr[i]>arr[j]) {
//				System.out.println("Array not Sorted");
//				break;
//			}
//			i++;
//			j--;
//		}
//		
//		

	}

}
