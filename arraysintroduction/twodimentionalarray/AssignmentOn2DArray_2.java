package com.arraysintroduction.twodimentionalarray;

import java.util.Scanner;

public class AssignmentOn2DArray_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size of an 2D array : ");
		int rowSize = sc.nextInt();
		System.out.println("Enter column Size of an Array : ");
		int colSize=sc.nextInt();
		
		int[][] two = new int[rowSize][colSize];
		
//		for(int m=0;m<rowSize;m++) {
//			for(int n=0;n<colSize;n++) {
//				System.out.println("Enter value of "+m+" "+n+" of an Array :");
//				two[m][n]=sc.nextInt();
//			}
//		}
		
		int i=0;
		for(int[]one :two) {
			int  j=0;
			for(int value :one) {
				System.out.println("Enter a value : ");
				value = sc.nextInt();
				two[i][j]=value;
				j++;
			}
			i++;
		}
		
		
		for(int[] one :two) {
			for(int value : one) {
				System.out.print(value +" ");
			}
			System.out.println();
		}

	}

}
