package com.arraysintroduction.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionofTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {1,3,5,6,7};
		
		ArrayList<Integer> result=unionOfTwoArrays(arr1,arr2);
		System.out.println(result);
//		for(int num : result) {
//			System.out.print(num+" ");
//		}
	
	}
	static ArrayList<Integer> unionOfTwoArrays(int[]arr1,int[]arr2) {
		
		int i=0,j=0;
        ArrayList<Integer> list =new ArrayList<>();
        
        while(i<arr1.length && j<arr2.length) {
        	if(arr1[i]==arr2[j]) {
        		list.add(arr1[i]);
        		i++;
        		j++;
        	}
        	else if(arr1[i]<arr2[j]) {
        		list.add(arr1[i]);
        		i++;
        	}
        	else {
        		list.add(arr2[j]);
        			j++;
        	  }
        }
        while(i<arr1.length) list.add(arr1[i++]);
        while(j<arr2.length) list.add(arr2[j++]);
        
        return list;
	}

}
