package com.starpatterns;

public class L {

	public static void main(String[] args) {
		

		l(5);
	}
	static void l(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
