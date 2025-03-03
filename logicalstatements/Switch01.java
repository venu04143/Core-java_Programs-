package com.logicalstatements;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number Between 10 to 50 :");
		int num = sc.nextInt();// Cannot switch on a value of type long. Only convertible int values, strings
						// or enum variables are permitted

		if (num < 0 || num > 50) {
			System.out.println("Number is too large");
		} else if (num >= 10 && num <= 20) {
			switch (num) {
			case 3 -> System.out.println("Raina");
			case 7 -> System.out.println("Dhoni");
			case 8 -> System.out.println("Jadeja");
			case 10 -> System.out.println("Sachin");
			case 18 -> System.out.println("Kohli");
			default -> System.out.println("Sorry No player available for this number");
			}
		} else if (num > 20 && num <= 30) {
			switch (num) {
			case 23 -> System.out.println("Kuldeep Yadav");
			case 27 -> System.out.println("Ajinkya Rahane");
			case 28 -> System.out.println("Rahul Chahar");
			case 29 -> System.out.println("Varun Chakravarthy");
			default -> System.out.println("Sorry No player available for this number");
			}
		} else if (num > 30 && num <= 40) {
			switch (num) {
			case 32 -> System.out.println("Ishan Kishan");
			case 33 -> System.out.println("Hardik Pandya");
			case 36 -> System.out.println("Mayank Agarwal");
			default -> System.out.println("Sorry No player available for this number");

			}
		} else {
			switch (num) {
			case 41 -> System.out.println("Shreyas Iyer");
			case 45 -> System.out.println("Rohit Sharma");
			default -> System.out.println("Sorry No player available for this number");
			}
		}
		

	}

}
