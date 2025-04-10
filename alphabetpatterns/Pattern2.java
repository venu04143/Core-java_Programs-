package com.alphabetpatterns;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern2(5);
	}
	static void pattern2(int n) {
		
		char c='A';
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();	
		}
	}

}
