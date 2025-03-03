package com.logicalstatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter JersyNo to Know the Player Name : ");
		
		int jersyNo=sc.nextInt();
		
		switch(jersyNo) {
		
		case 18:
			System.out.println("Virat Kohli");
			break;
			
		case 45:
			System.out.println("Rohit Sharma");
			break;
			
		case 7:
			System.out.println("Dhoni");
			break;
			
		case 8:
			System.out.println("Jadeja");
			break;
		
		
		}
	}

}
