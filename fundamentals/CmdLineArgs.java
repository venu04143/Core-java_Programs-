package com.fundamentals;

public class CmdLineArgs {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		
		for(String names:args) {
			System.out.println(names);
		}

	}

}
