package com.arraysintroduction.problems;

public class EquilibriumIndexofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8};
		
		int equilibriumIndex=0;
		int totalSum=0, leftSum=0;
		for(int num:arr) {
			totalSum+=num;
		}
		for(int i=0;i<arr.length;i++) {
			totalSum -=arr[i];
			if(totalSum == leftSum) {
				equilibriumIndex=i;
				break;
			}
			leftSum+=arr[i];
		}
		System.out.println(equilibriumIndex);
	}

}
