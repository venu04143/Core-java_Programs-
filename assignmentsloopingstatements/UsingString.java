package com.assignmentsloopingstatements;

import java.util.Scanner;

public class UsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
//		 for (String name = "a"; name.compareTo("d") < 0; name += "a") { infinite loop
//			 
//		        System.out.println(name);
//           }
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Name : ");
		
		String name = sc.nextLine();
		
		
		for(int i =0; i<name.length();i++) {
			System.out.print(name.charAt(i) + " ");
		}
		System.out.println();
		
		for(int i = 1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
		
	}

}
