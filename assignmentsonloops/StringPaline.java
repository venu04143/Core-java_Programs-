package com.assignmentsonloops;

import java.util.Scanner;

public class StringPaline {
	
	static boolean isPaline(String word) {
		if(word.length()<1) {
			return true;
		}
		for(int i =0,j=word.length()-1;i<j;i++, j--){
			if(word.charAt(i)!=word.charAt(j)) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a word to check palin or not ");
		String word=sc.next();
		boolean ans = isPaline(word);
		System.out.println(ans);

	}

}
