package com.programswithmethods;

import java.util.Scanner;

public class NivenNumber {
	
	static boolean isNiven(int num) {
		int sum=0;
		int copy =num;
		while(num!=0) {
			int rem= num%10;
			num/=10;
			sum+=rem;
		}
		return copy%sum==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check Niven(Harshad) Number or Not :");
		int num =sc.nextInt();
		boolean ans =isNiven(num);
        if(ans) {
        	System.out.println("The Given Number "+num+" is a Niven(Harshad) Number.");
        }
        else {
        	System.out.println("The Given Number "+num+" is Not a Niven(Harshad) Number.");
        }
	}

}
