package com.recursion;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isPrime(int num) {
		
		return primeHelper(num,2,0) == 0;
	}
	private static int primeHelper(int num,int i,int count) {
		if(i>num/2 ) {
			return count;
		}
		if( num % i==0) {
			count ++;
		}
		return primeHelper(num,i+1,count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check Prime or not");
		
		int num = sc.nextInt();
		
		boolean ans = isPrime(num);
		if(ans) {
			System.out.println(num +" is a Prime Number");
		}
		else {
			System.out.println(num+ " is not a Prome Number ");
		}

	}

}
