package com.arraysintroduction;

import java.util.Arrays;

public class FibArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        
       
       System.out.println(Arrays.toString(arr));
//        
//        char[]arr1=new char[5];
//        for(int i=0;i<5;i++) {
//        	System.out.print(arr1[i]+" ");             invisible spaces
//        }
       

	}

}
