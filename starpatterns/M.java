package com.starpatterns;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m(5);
	}
	static void m(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || ((i==j || j==n-i+1)&& i<=n/2+1) ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}

}
