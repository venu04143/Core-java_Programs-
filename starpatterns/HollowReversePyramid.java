package com.starpatterns;

public class HollowReversePyramid {

	public static void main(String[] args) {
		
		hollowReversePyramid(5);

	}
	
	static void hollowReversePyramid(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++) {
				if(i==0 || j==0 || j==n-i-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
