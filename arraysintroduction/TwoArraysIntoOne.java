package com.arraysintroduction;

public class TwoArraysIntoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// merging 2 array into one array 
		
				int[]a= {1,2,3};
				int[]b= {4,5,6};
				
				int[] c= new int[a.length+b.length];
		        
				for(int i=0;i<a.length;i++) {
					c[i]=a[i];
				}
				for(int i=0;i<b.length;i++) {
					c[a.length+i]=b[i];
				}
				for(int n: c) {
					System.out.print(n+" ");
				}

	}

}
