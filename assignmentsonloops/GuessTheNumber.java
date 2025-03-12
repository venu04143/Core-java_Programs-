package com.assignmentsonloops;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("You are  Playing the Game Guess the Number..");

		System.out.println();

		System.out.println("\t You Have Three Chances to Guess the Correct Number ");
		System.out.println();
		System.out.println("\t And if You Can't Guess the Number You Lose ! ");
		System.out.println();

		int number = rand.nextInt(10);
		// System.out.println(number);

		System.out.println("Shall we Start the Game ! Start ot No :");
		String start = sc.next();
		if (start.equalsIgnoreCase("start")) {
			int guessChances = 3;
			while (guessChances != 0) {
				System.out.println();
				System.out.println("Enter Your Guess number to check  its Correct or Not ! : ");
				int guessedNumber = sc.nextInt();
				if (guessChances == 3) {
					if (guessedNumber == number) {
						System.out.println("You Guessed it Correct in Your First Move Congrats !");
						return;
					} else {
						System.out.println("You Guessed Wrong.. Don't Worry You have 2 more Chances Best of Luck..!");

					}
				} else if (guessChances == 2) {
					if (guessedNumber == number) {
						System.out.println("Hey Now You Guessed Corectly !");
						return;
					} else {
						System.out.println("OOPS! Guessed Wrong You have 1 more Chance Left... ");
					}
				} else if (guessChances == 1) {
					if (guessedNumber == number) {
						System.out.println("Finally You Guessed the Number at Your last attempt ooffhh");
					} else {
						System.out.println("You Lose !");
					}

				}
				guessChances--;
			}

		} else {
			System.out.println("OK...Take your Own Time.");
		}

	}

}
