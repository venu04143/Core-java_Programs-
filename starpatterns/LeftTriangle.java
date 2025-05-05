package com.starpatterns;

public class LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lefttriangle(5);
	}

	static void lefttriangle(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j =0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
