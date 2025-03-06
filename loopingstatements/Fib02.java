package com.loopingstatements;

import java.util.Scanner;

public class Fib02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
		              
		int a = 0;
		int b = 1;
		System.out.println("Enter N value :");
		int N = sc.nextInt();
		
		
		for(int i= 0;i<N;i++) {
		    System.out.print(a+" ");  // swapping without third variable
		    a=a+b;        
		    b=a-b;
		    a=a-b;
		    b=a+b;
		}

	}

}
