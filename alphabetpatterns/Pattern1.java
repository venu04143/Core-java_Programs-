package com.alphabetpatterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);

	}
	static void pattern(int n) {
		
		char c='A';
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
			}
			System.out.println();
			c++;
		}
	}

}
