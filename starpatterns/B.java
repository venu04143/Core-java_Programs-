package com.starpatterns;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b(5);
	}
	static void b(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1||  j==n || i==n/2+1 || i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
