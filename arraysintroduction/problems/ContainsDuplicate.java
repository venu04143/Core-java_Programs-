package com.arraysintroduction.problems;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,1};
		
		System.out.println(containDuplicate(arr));

	}
	static boolean containDuplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
