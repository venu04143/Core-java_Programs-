package com.guessthenumbergame;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("You are Playing The Game Called Guess The Number :");
		System.out.println(
				"Terms:\n\t 1.You have Three Chances to Guess the Number\n\t 2.If You Guess Correct You Win\n\t 3.If You Guess Wrong You Lose");

		System.out.println("Shall We Start !");
		String game = sc.next();

		if (game.equalsIgnoreCase("start")) {
			String again = "";
			do {
				int number = random.nextInt(0, 10);
				//System.out.println(number);
				int guessChances = 3;
				while (guessChances != 0) {
					System.out.println("Enter Your Guess number to check  its Correct or Not ! : ");
					int guessNumber = sc.nextInt();
					if (guessChances == 3) {
						if (guessNumber == number) {
							System.out.println("You Guessed it Correctly On Your First Attempt.");
							System.out.println("You Won.");
							break;
						} else {
							System.out.println("Oop's You Guessed Wrong You Have 2 More Chances Left.");
						}
					}
					if (guessChances == 2) {
						if (guessNumber == number) {
							System.out.println("You Guessed it Correctly On Your Second Attempt.");
							System.out.println("You Won.");
							break;
						} else {
							System.out.println("Oop's You Guessed Wrong You Have 1 More Chances Left.");
						}
					}
					if (guessChances == 1) {
						if (guessNumber == number) {
							System.out.println("You Guessed it Correctly On Your Last Attempt.");
							System.out.println("You Won.");
							break;
						} else {
							System.out.println("You Lose.");
						}
					}
					guessChances--;
				}
				System.out.println("Do You Want Paly Again");
				again = sc.next();
			} while (again.equalsIgnoreCase("Yes"));
			if(again.equalsIgnoreCase("no")) {
				System.out.println("Thank You For Playing.");
			}
		} else if (game.equalsIgnoreCase("no")) {
			System.out.println("Ok ! Come and Play When Your Free ");
		} else {
			System.out.println("Wrong Input.");
		}

	}

}
