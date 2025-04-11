package com.numberpatternprograms;

public class PalinNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palinPattern(4);
	}
	static void palinPattern(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int s=1;s<=n-i;s++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}

}
