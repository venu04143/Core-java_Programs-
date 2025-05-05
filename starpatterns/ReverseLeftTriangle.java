package com.starpatterns;

public class ReverseLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseLeft(5);
	}
	static void reverseLeft(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
