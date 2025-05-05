package com.starpatterns;

public class ButterflyPattern {

	public static void main(String[] args) {
		butterfly(10);

	}
	
	static void butterfly(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=0;k<n-i-1;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		n=n-1;
		
		for(int i=0;i<n;i++) {
			
			for(int j=n-i;j>0;j--) {
				System.out.print("*");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
