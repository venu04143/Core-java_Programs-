package com.starpatterns;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		x(5);
	}
	static void x(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || j==n-i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
