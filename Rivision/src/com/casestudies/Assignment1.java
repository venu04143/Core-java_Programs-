package com.casestudies;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		
        if(num % 3 == 0 && num % 5 == 0) {
        	System.out.println("CrickBuzz");
        }
        else if(num % 5 == 0) {
        	System.out.println("Buzz");
        }
        else if(num % 3 == 0) {
        	System.out.println("Crick");
        }else {
        	System.out.println("Not a valid Number");
        }

	}

}
