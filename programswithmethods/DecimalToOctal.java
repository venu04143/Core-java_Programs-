package com.programswithmethods;

import java.util.Scanner;

public class DecimalToOctal {
	static int octalOf(int num) {
		int octal =0;
		while(num!=0) {
			int rem =num%8;
			num/=8;
			octal=octal*10+rem;
		}
		int original=0;
		while(octal!=0) {
			int rem=octal%10;
			octal/=10;
			original=original*10+rem;
		}
		return original;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Represent its Octal value :");
		
		int num = sc.nextInt();
		int ans =octalOf(num);
		System.out.println(ans);
	}

}
