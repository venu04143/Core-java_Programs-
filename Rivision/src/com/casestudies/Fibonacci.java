package com.casestudies;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How Many Fibonacci Numbers Do You Want to Display :   ");
        int n = sc.nextInt();
	    int a=0,b=1,c;
	    
		for(int i= 0; i<n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
