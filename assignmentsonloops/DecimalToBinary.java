package com.assignmentsonloops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to Represent that Binary Number :");
		int num = sc.nextInt();
		
		int []arr = new int[100];
		
		int i = 0;
		while(num!=0) {
			int rem=num%2;
			arr[i]=rem;
			num/=2;
			i++;
		}
	  for(int j =i-1;j>=0;j--) {
		  System.out.print(arr[j] + " ");
	  }
	  System.out.println();
	  
	  
	  int fact=recursion(5);
	  System.out.println(fact);
	  
	}
	 static int recursion(int num) {
		  if(num==0 || num==1) {
			  return 1;
		  }
		  
		  int fact=num*recursion(num-1);
		  return fact;
	  }

}
