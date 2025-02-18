package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// post Increament 
		System.out.println(a++);    // prints the current value and then increment
		System.out.println(b++);
		
		System.out.println("after post-increment  a value is : " + a);
		System.out.println("after post-increment  b value is : " + b);
		
		System.out.println("Addition of  A and b is : " +(a+b));
		
		System.out.println("***********");
		
		// pre- Increament
		
		int x = 30;
		int y = 40;
		
		System.out.println(++x);   // increments the value and then prints
		System.out.println(++y);
		
		System.out.println(x+y);
		
		System.out.println("***********");
		
		
		//post-decrement
		
		int m = 100;
		int n = 200;
		
		System.out.println(m--);
		System.out.println(n--);
		
		System.out.println(m+n);
		
		System.out.println("***********");
		
		int p=5;
		int q=4;
		
		System.out.println(--p);
		System.out.println(--q);
		System.out.println(p+q);
		
		
		
		System.out.println("***********");
		
		
		int c= 5;
		 //     6  +  6  + 6  + 6
		int d= ++c + c++ +--c + c--;    	
		System.out.println(c+d);     
		
		
//		int g =0xbeef;
//		System.out.println(g);
//		
//		char Z= '\u0056';
//		System.out.println(Z);
			}

}
