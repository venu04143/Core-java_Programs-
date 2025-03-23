package com.arraysintroduction;

public class SumandAvg_of_Array {
	
    public static void main(String[] args) {
		
    	int[] arr = {78,64,74,92,68,85,71};
    	
    	int sum = 0;
    	double avg= 0;
    	
    	for(int i = 0;i<arr.length;i++) {
    		sum+=arr[i];
    	}
    	avg = sum/arr.length;
    	
    	System.out.println("Sum of Given Array Values : " + sum);
    	System.out.println("Average of Given Array Values : " + avg);
	}
}
