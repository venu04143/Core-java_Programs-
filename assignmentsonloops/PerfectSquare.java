package com.assignmentsonloops;

import java.util.Scanner;

public class PerfectSquare {
	
	static int perfectSquare(int num) {
		int square = 0;
		for(int i=0;i*i<=num;i++) {
			if(i*i==num) {
				return i;
			}
		}return square;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check its Perfect Square Number :");
		int num = sc.nextInt();
		
      int ans =  perfectSquare(num);
      System.out.println("Perfect Square Number is "+ans);
	}

}
