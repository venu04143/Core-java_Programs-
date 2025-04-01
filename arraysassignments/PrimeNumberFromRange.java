package com.arraysassignments;

import java.util.Scanner;

public class PrimeNumberFromRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Range from where to and Upto : ");
		int start =sc.nextInt();
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			boolean status =true;
			if(i<=1) {
				status=false;
			}
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					status=false;
				}
			}
			if(status) {
				System.out.print(i+" ");
			}
		}
	}

}
