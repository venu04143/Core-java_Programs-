package com.recursion;

public class RecursionIntroduction {
	
	/* Calling method itself is called Recursion
	 * or calling method inside a method is Recursion 
	 * 
	 * Recursion helps in dividing the problem into sub-problems 
	 * Using Recursion we can avoid loops 
	 * 
	 * for using recursion base case is must ,
	 * Without a base case, recursion would continue indefinitely, causing a StackOverflowError. 
	 * 
	 * Disadvantages :
	 *    it takes more space
	 *     - every method call store in a stack ,
	 *      so every time method calling itself it takes a separate memory in stack some times it cause 
	 *      stackOverflow
	 *   
	 *   Method Calls :
	 *     every method call will store in a stack .
	 *     while method is not completing executing, method call will remain in stack
	 *     after completing method execution method call will be removed from the stack */
	
	
	static void printNumbers(int n) {
		if(n>5) {
			return;
		}
	    System.out.print(n+" ");
		printNumbers(n+1);
		
		//System.out.print(n + " ");     reverse order 5 4 3 2 1
	 
	}

	static int fibonacci(int num) {
		if(num<=1) {
			return num;
		}
		return fibonacci(num-1)+fibonacci(num-2);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumbers(1);
		System.out.println();
		System.out.println(fibonacci(5));

	}

}
