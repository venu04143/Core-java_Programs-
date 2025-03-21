package com.arraysintroduction;

public class ArrayIntroduction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3,4,5};
		for(int i = 0; i<arr.length;i++) {
		    System.out.println(arr[i]);
		}
		System.out.println(arr);     // [I@79fc0f2f
		
		
		char[] chr = {'V','e','n','u'};
		System.out.println(chr);                  	// Venu
	 
		/*In Java, when you print an array, normally it prints a memory reference (like [I@1a2b3c4d]).
		 * But char arrays (char[]) behave differently.
		 * When a char[] is passed to System.out.println(), it prints the characters as a String instead of the memory address.*/
	}

}
