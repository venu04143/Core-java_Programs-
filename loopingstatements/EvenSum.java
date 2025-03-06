package com.loopingstatements;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		
		int evensum=0;
		int oddsum=0;
		
		for(int i = 0;i<=n;i++) {
			
		     if(i%2==0) {
		    	 evensum+=i;
		     }else {
		    
		    	oddsum+=i;
		     }
		}
		System.out.println("evenSum is :"+evensum);
		System.out.println("oddSum is :"+oddsum);

	}

}
