package com.casestudies;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pascalsTriangle(5);
	}
	static void pascalsTriangle(int n) {
		for(int i=0;i<n;i++) {
		
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
			
		}
	}

}
