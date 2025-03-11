package com.assignmentsonloops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to Check Wether it is ArmStrong Or Not : ");
		int num = sc.nextInt();
		
		int copy= num;
		int rem=0;
		int armSum=0;
		while(num!=0) {
			rem = num%10;
			armSum+=rem*rem*rem;
			num/=10;
		}
		if(copy == armSum) {
			System.out.println("Givnen Number is a ArmStrong Number");
		}else {
			System.out.println("Givnen Number is Not a ArmStrong Number");
		}
		

	}

}
