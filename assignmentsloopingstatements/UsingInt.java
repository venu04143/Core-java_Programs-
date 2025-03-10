package com.assignmentsloopingstatements;

import java.util.Scanner;

public class UsingInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to give its factorial : ");
		int num = sc.nextInt();
		
		int factorial=num;
		for(int i=num;i-1!=0; i--) {
			factorial*=i-1;
		}
		System.out.println(factorial);
		
       System.out.println("Enter how many first fibonacci numbers want : ");
       
       int n= sc.nextInt();
       
       int a=0;
       int b=1;
       
       for(int i = 1;i<=n;i++) {
    	  System.out.print(a+" "); 
    	  int c= a+b;
    	  a=b;
    	  b=c;
       }
       
	}

}
