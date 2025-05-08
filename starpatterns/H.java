package com.starpatterns;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		h(5);
	}
	static void h(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || i==(n/2)+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
