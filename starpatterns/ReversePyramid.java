package com.starpatterns;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reversePyramid(5);
	}
	static void  reversePyramid(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
