package com.starpatterns;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		triangle(5);
	}
	static void triangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
