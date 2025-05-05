package com.starpatterns;

public class RightReversedTriangle {

	public static void main(String[] args) {
		
		triangle(5);
	}
	
	static void triangle(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
