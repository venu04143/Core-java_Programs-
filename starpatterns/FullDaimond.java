package com.starpatterns;

public class FullDaimond {

	public static void main(String[] args) {
		

		daimond(10);
	}

	static void daimond(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		n=n-1;
		
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
