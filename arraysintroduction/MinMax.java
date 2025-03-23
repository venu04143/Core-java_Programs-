package com.arraysintroduction;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {2,5,34,6,3,8,67,43,1};
		
		int max=arr[0];
		int min=arr[0];
//		for(int i = 1;i<arr.length;i++) {
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//			else if(max<arr[i]) {
//				max=arr[i];
//			}
//		}
//		System.out.println("Minimum Value in Given Array is "+ min);
//		System.out.println("Maximum Value in Given Array is "+ max);
//		
		int i=1;
		while(i<arr.length) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			i++;
		}
		System.out.println("Minimum Value in Given Array is "+ min);
		System.out.println("Maximum Value in Given Array is "+ max);
			
		
	}

}
