package com.alphabetpatterns;

public class DiamondShapeAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		daimondShape(5);
	}

	static void daimondShape(int n) {
		
		for(int i=1;i<=n*2;i++) {
			
			int iValue= (i>n)?2*n-i:i;
			
			for(int s=iValue;s<n;s++) {
				System.out.print(" ");
			}
			for(char j='A';j<'A'+iValue;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
