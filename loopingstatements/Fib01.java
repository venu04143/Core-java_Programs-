package com.loopingstatements;

import java.util.Scanner;

public class Fib01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		System.out.println("Enter N value :");
		int N = sc.nextInt();
		
		int c;                                       // swapping with help of third variable
		for(int i= 0;i<=N;i++) {
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
	}

}
