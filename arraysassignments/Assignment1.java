package com.arraysassignments;

public class Assignment1 {
	
	static void even(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}System.out.println();
	}

	static void odd(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 !=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4,5,6};
//		even(nums);
//		odd(nums);
		
		
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] %2 ==0) {
				System.out.print(nums[i]+" ");
			}
		}
		System.out.println();
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] %2 !=0) {
				System.out.print(nums[i]+" ");
			}
		}
		

	}

}
