package com.starpatterns;

public class HollowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hollowParamid(5);
		
	}
	static void hollowParamid(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i || i==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
