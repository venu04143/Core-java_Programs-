package com.programswithmethods;

import java.util.Scanner;

public class ArmStrongNumber {
	
	static boolean isArmstrong(int num) {
		int copy = num;
		int sum = 0;
		int power=length(num);
		System.out.println(power);
		while(num!=0) {
			int rem = num%10;
			sum+=Math.pow(rem,power);
			num/=10;
		}
		System.out.println(sum);
		if(copy==sum) {
			return true;
		}
		return false;
	}
	private static int length(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while(num!=0) {
			int rem =num%10;
			count++;
			num/=10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sv = new Scanner(System.in);
		System.out.println("Enter a Number to Check Wether it is a ArmStrong or Not :");
        int num = sv.nextInt();
        
        boolean ans = isArmstrong(num);
        if(ans) {
        	System.out.println("Given Number is ArmStrong Number");
        }else {
        	System.out.println("Given Number is Not a ArmStrong Numbner");
        }
	}

}
